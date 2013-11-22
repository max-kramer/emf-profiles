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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_BOOLEAN", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import resource'", "';'", "'profile'", "'decoration'", "'{'", "'}'", "'icon'", "'location-uri'", "':'", "'border'", "'connection'", "'foreground'", "'background'", "'style'", "'size'", "'direction'", "'margin'", "'color'", "'RGB'", "'('", "','", "')'", "'active when'", "'-'", "'.'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'all'", "'any'", "'solid'", "'dots'", "'dashes'", "'dash_dots'", "'dash_dot_dot'", "'red'", "'black'", "'white'", "'green'", "'green_light'", "'green_dark'", "'blue'", "'blue_light'", "'blue_dark'", "'gray'", "'gray_light'", "'gray_dark'", "'orange'", "'yellow'", "'cyan'", "'center'", "'north'", "'south'", "'west'", "'east'", "'north_east'", "'north_west'", "'south_east'", "'south_west'"
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:77:1: ruleDecorationModel returns [EObject current=null] : (otherlv_0= 'import resource' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= ';' )? ( ( (lv_namespace_3_0= ruleNamespace ) ) (otherlv_4= ';' )? )? ( (lv_decorationDescriptions_5_0= ruleDecorationDescription ) )* ) ;
    public final EObject ruleDecorationModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_namespace_3_0 = null;

        EObject lv_decorationDescriptions_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:80:28: ( (otherlv_0= 'import resource' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= ';' )? ( ( (lv_namespace_3_0= ruleNamespace ) ) (otherlv_4= ';' )? )? ( (lv_decorationDescriptions_5_0= ruleDecorationDescription ) )* ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:81:1: (otherlv_0= 'import resource' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= ';' )? ( ( (lv_namespace_3_0= ruleNamespace ) ) (otherlv_4= ';' )? )? ( (lv_decorationDescriptions_5_0= ruleDecorationDescription ) )* )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:81:1: (otherlv_0= 'import resource' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= ';' )? ( ( (lv_namespace_3_0= ruleNamespace ) ) (otherlv_4= ';' )? )? ( (lv_decorationDescriptions_5_0= ruleDecorationDescription ) )* )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:81:3: otherlv_0= 'import resource' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= ';' )? ( ( (lv_namespace_3_0= ruleNamespace ) ) (otherlv_4= ';' )? )? ( (lv_decorationDescriptions_5_0= ruleDecorationDescription ) )*
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

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:103:2: (otherlv_2= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:103:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDecorationModel157); 

                        	newLeafNode(otherlv_2, grammarAccess.getDecorationModelAccess().getSemicolonKeyword_2());
                        

                    }
                    break;

            }

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:107:3: ( ( (lv_namespace_3_0= ruleNamespace ) ) (otherlv_4= ';' )? )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:107:4: ( (lv_namespace_3_0= ruleNamespace ) ) (otherlv_4= ';' )?
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:107:4: ( (lv_namespace_3_0= ruleNamespace ) )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:108:1: (lv_namespace_3_0= ruleNamespace )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:108:1: (lv_namespace_3_0= ruleNamespace )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:109:3: lv_namespace_3_0= ruleNamespace
                    {
                     
                    	        newCompositeNode(grammarAccess.getDecorationModelAccess().getNamespaceNamespaceParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNamespace_in_ruleDecorationModel181);
                    lv_namespace_3_0=ruleNamespace();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDecorationModelRule());
                    	        }
                           		set(
                           			current, 
                           			"namespace",
                            		lv_namespace_3_0, 
                            		"Namespace");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:125:2: (otherlv_4= ';' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==13) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:125:4: otherlv_4= ';'
                            {
                            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleDecorationModel194); 

                                	newLeafNode(otherlv_4, grammarAccess.getDecorationModelAccess().getSemicolonKeyword_3_1());
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:129:5: ( (lv_decorationDescriptions_5_0= ruleDecorationDescription ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:130:1: (lv_decorationDescriptions_5_0= ruleDecorationDescription )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:130:1: (lv_decorationDescriptions_5_0= ruleDecorationDescription )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:131:3: lv_decorationDescriptions_5_0= ruleDecorationDescription
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDecorationModelAccess().getDecorationDescriptionsDecorationDescriptionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecorationDescription_in_ruleDecorationModel219);
            	    lv_decorationDescriptions_5_0=ruleDecorationDescription();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDecorationModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"decorationDescriptions",
            	            		lv_decorationDescriptions_5_0, 
            	            		"DecorationDescription");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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
    // $ANTLR end "ruleDecorationModel"


    // $ANTLR start "entryRuleNamespace"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:155:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:156:2: (iv_ruleNamespace= ruleNamespace EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:157:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace256);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace266); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:164:1: ruleNamespace returns [EObject current=null] : (otherlv_0= 'profile' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:167:28: ( (otherlv_0= 'profile' ( ( ruleQualifiedName ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:168:1: (otherlv_0= 'profile' ( ( ruleQualifiedName ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:168:1: (otherlv_0= 'profile' ( ( ruleQualifiedName ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:168:3: otherlv_0= 'profile' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleNamespace303); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getProfileKeyword_0());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:172:1: ( ( ruleQualifiedName ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:173:1: ( ruleQualifiedName )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:173:1: ( ruleQualifiedName )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:174:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNamespaceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNamespaceAccess().getProfileProfileCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNamespace326);
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:195:1: entryRuleDecorationDescription returns [EObject current=null] : iv_ruleDecorationDescription= ruleDecorationDescription EOF ;
    public final EObject entryRuleDecorationDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecorationDescription = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:196:2: (iv_ruleDecorationDescription= ruleDecorationDescription EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:197:2: iv_ruleDecorationDescription= ruleDecorationDescription EOF
            {
             newCompositeNode(grammarAccess.getDecorationDescriptionRule()); 
            pushFollow(FOLLOW_ruleDecorationDescription_in_entryRuleDecorationDescription362);
            iv_ruleDecorationDescription=ruleDecorationDescription();

            state._fsp--;

             current =iv_ruleDecorationDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecorationDescription372); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:204:1: ruleDecorationDescription returns [EObject current=null] : (otherlv_0= 'decoration' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_decorations_3_0= ruleAbstractDecoration ) )+ ( (lv_activation_4_0= ruleActivation ) )? otherlv_5= '}' ) ;
    public final EObject ruleDecorationDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_decorations_3_0 = null;

        EObject lv_activation_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:207:28: ( (otherlv_0= 'decoration' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_decorations_3_0= ruleAbstractDecoration ) )+ ( (lv_activation_4_0= ruleActivation ) )? otherlv_5= '}' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:208:1: (otherlv_0= 'decoration' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_decorations_3_0= ruleAbstractDecoration ) )+ ( (lv_activation_4_0= ruleActivation ) )? otherlv_5= '}' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:208:1: (otherlv_0= 'decoration' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_decorations_3_0= ruleAbstractDecoration ) )+ ( (lv_activation_4_0= ruleActivation ) )? otherlv_5= '}' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:208:3: otherlv_0= 'decoration' ( ( ruleQualifiedName ) ) otherlv_2= '{' ( (lv_decorations_3_0= ruleAbstractDecoration ) )+ ( (lv_activation_4_0= ruleActivation ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleDecorationDescription409); 

                	newLeafNode(otherlv_0, grammarAccess.getDecorationDescriptionAccess().getDecorationKeyword_0());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:212:1: ( ( ruleQualifiedName ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:213:1: ( ruleQualifiedName )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:213:1: ( ruleQualifiedName )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:214:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDecorationDescriptionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDecorationDescriptionAccess().getStereotypeStereotypeCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDecorationDescription432);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleDecorationDescription444); 

                	newLeafNode(otherlv_2, grammarAccess.getDecorationDescriptionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:231:1: ( (lv_decorations_3_0= ruleAbstractDecoration ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18||(LA5_0>=21 && LA5_0<=22)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:232:1: (lv_decorations_3_0= ruleAbstractDecoration )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:232:1: (lv_decorations_3_0= ruleAbstractDecoration )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:233:3: lv_decorations_3_0= ruleAbstractDecoration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDecorationDescriptionAccess().getDecorationsAbstractDecorationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractDecoration_in_ruleDecorationDescription465);
            	    lv_decorations_3_0=ruleAbstractDecoration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDecorationDescriptionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"decorations",
            	            		lv_decorations_3_0, 
            	            		"AbstractDecoration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:249:3: ( (lv_activation_4_0= ruleActivation ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==34) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:250:1: (lv_activation_4_0= ruleActivation )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:250:1: (lv_activation_4_0= ruleActivation )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:251:3: lv_activation_4_0= ruleActivation
                    {
                     
                    	        newCompositeNode(grammarAccess.getDecorationDescriptionAccess().getActivationActivationParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActivation_in_ruleDecorationDescription487);
                    lv_activation_4_0=ruleActivation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDecorationDescriptionRule());
                    	        }
                           		set(
                           			current, 
                           			"activation",
                            		lv_activation_4_0, 
                            		"Activation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleDecorationDescription500); 

                	newLeafNode(otherlv_5, grammarAccess.getDecorationDescriptionAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:279:1: entryRuleAbstractDecoration returns [EObject current=null] : iv_ruleAbstractDecoration= ruleAbstractDecoration EOF ;
    public final EObject entryRuleAbstractDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDecoration = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:280:2: (iv_ruleAbstractDecoration= ruleAbstractDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:281:2: iv_ruleAbstractDecoration= ruleAbstractDecoration EOF
            {
             newCompositeNode(grammarAccess.getAbstractDecorationRule()); 
            pushFollow(FOLLOW_ruleAbstractDecoration_in_entryRuleAbstractDecoration536);
            iv_ruleAbstractDecoration=ruleAbstractDecoration();

            state._fsp--;

             current =iv_ruleAbstractDecoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDecoration546); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:288:1: ruleAbstractDecoration returns [EObject current=null] : (this_IconDecoration_0= ruleIconDecoration | this_BorderDecoration_1= ruleBorderDecoration | this_ConnectionDecoration_2= ruleConnectionDecoration ) ;
    public final EObject ruleAbstractDecoration() throws RecognitionException {
        EObject current = null;

        EObject this_IconDecoration_0 = null;

        EObject this_BorderDecoration_1 = null;

        EObject this_ConnectionDecoration_2 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:291:28: ( (this_IconDecoration_0= ruleIconDecoration | this_BorderDecoration_1= ruleBorderDecoration | this_ConnectionDecoration_2= ruleConnectionDecoration ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:292:1: (this_IconDecoration_0= ruleIconDecoration | this_BorderDecoration_1= ruleBorderDecoration | this_ConnectionDecoration_2= ruleConnectionDecoration )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:292:1: (this_IconDecoration_0= ruleIconDecoration | this_BorderDecoration_1= ruleBorderDecoration | this_ConnectionDecoration_2= ruleConnectionDecoration )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:293:5: this_IconDecoration_0= ruleIconDecoration
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDecorationAccess().getIconDecorationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIconDecoration_in_ruleAbstractDecoration593);
                    this_IconDecoration_0=ruleIconDecoration();

                    state._fsp--;

                     
                            current = this_IconDecoration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:303:5: this_BorderDecoration_1= ruleBorderDecoration
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDecorationAccess().getBorderDecorationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBorderDecoration_in_ruleAbstractDecoration620);
                    this_BorderDecoration_1=ruleBorderDecoration();

                    state._fsp--;

                     
                            current = this_BorderDecoration_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:313:5: this_ConnectionDecoration_2= ruleConnectionDecoration
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDecorationAccess().getConnectionDecorationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleConnectionDecoration_in_ruleAbstractDecoration647);
                    this_ConnectionDecoration_2=ruleConnectionDecoration();

                    state._fsp--;

                     
                            current = this_ConnectionDecoration_2; 
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


    // $ANTLR start "entryRuleIconDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:329:1: entryRuleIconDecoration returns [EObject current=null] : iv_ruleIconDecoration= ruleIconDecoration EOF ;
    public final EObject entryRuleIconDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIconDecoration = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:330:2: (iv_ruleIconDecoration= ruleIconDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:331:2: iv_ruleIconDecoration= ruleIconDecoration EOF
            {
             newCompositeNode(grammarAccess.getIconDecorationRule()); 
            pushFollow(FOLLOW_ruleIconDecoration_in_entryRuleIconDecoration682);
            iv_ruleIconDecoration=ruleIconDecoration();

            state._fsp--;

             current =iv_ruleIconDecoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIconDecoration692); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIconDecoration"


    // $ANTLR start "ruleIconDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:338:1: ruleIconDecoration returns [EObject current=null] : (otherlv_0= 'icon' otherlv_1= '{' otherlv_2= 'location-uri' otherlv_3= ':' ( (lv_location_uri_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ( (lv_direction_6_0= ruleDirection ) )? ( (lv_margin_7_0= ruleMargin ) )? ( (lv_activation_8_0= ruleActivation ) )? otherlv_9= '}' ) ;
    public final EObject ruleIconDecoration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_location_uri_4_0=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        EObject lv_direction_6_0 = null;

        EObject lv_margin_7_0 = null;

        EObject lv_activation_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:341:28: ( (otherlv_0= 'icon' otherlv_1= '{' otherlv_2= 'location-uri' otherlv_3= ':' ( (lv_location_uri_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ( (lv_direction_6_0= ruleDirection ) )? ( (lv_margin_7_0= ruleMargin ) )? ( (lv_activation_8_0= ruleActivation ) )? otherlv_9= '}' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:342:1: (otherlv_0= 'icon' otherlv_1= '{' otherlv_2= 'location-uri' otherlv_3= ':' ( (lv_location_uri_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ( (lv_direction_6_0= ruleDirection ) )? ( (lv_margin_7_0= ruleMargin ) )? ( (lv_activation_8_0= ruleActivation ) )? otherlv_9= '}' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:342:1: (otherlv_0= 'icon' otherlv_1= '{' otherlv_2= 'location-uri' otherlv_3= ':' ( (lv_location_uri_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ( (lv_direction_6_0= ruleDirection ) )? ( (lv_margin_7_0= ruleMargin ) )? ( (lv_activation_8_0= ruleActivation ) )? otherlv_9= '}' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:342:3: otherlv_0= 'icon' otherlv_1= '{' otherlv_2= 'location-uri' otherlv_3= ':' ( (lv_location_uri_4_0= RULE_STRING ) ) (otherlv_5= ';' )? ( (lv_direction_6_0= ruleDirection ) )? ( (lv_margin_7_0= ruleMargin ) )? ( (lv_activation_8_0= ruleActivation ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleIconDecoration729); 

                	newLeafNode(otherlv_0, grammarAccess.getIconDecorationAccess().getIconKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleIconDecoration741); 

                	newLeafNode(otherlv_1, grammarAccess.getIconDecorationAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleIconDecoration753); 

                	newLeafNode(otherlv_2, grammarAccess.getIconDecorationAccess().getLocationUriKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleIconDecoration765); 

                	newLeafNode(otherlv_3, grammarAccess.getIconDecorationAccess().getColonKeyword_3());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:358:1: ( (lv_location_uri_4_0= RULE_STRING ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:359:1: (lv_location_uri_4_0= RULE_STRING )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:359:1: (lv_location_uri_4_0= RULE_STRING )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:360:3: lv_location_uri_4_0= RULE_STRING
            {
            lv_location_uri_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIconDecoration782); 

            			newLeafNode(lv_location_uri_4_0, grammarAccess.getIconDecorationAccess().getLocation_uriSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIconDecorationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"location_uri",
                    		lv_location_uri_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:376:2: (otherlv_5= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:376:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleIconDecoration800); 

                        	newLeafNode(otherlv_5, grammarAccess.getIconDecorationAccess().getSemicolonKeyword_5());
                        

                    }
                    break;

            }

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:380:3: ( (lv_direction_6_0= ruleDirection ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:381:1: (lv_direction_6_0= ruleDirection )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:381:1: (lv_direction_6_0= ruleDirection )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:382:3: lv_direction_6_0= ruleDirection
                    {
                     
                    	        newCompositeNode(grammarAccess.getIconDecorationAccess().getDirectionDirectionParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDirection_in_ruleIconDecoration823);
                    lv_direction_6_0=ruleDirection();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIconDecorationRule());
                    	        }
                           		set(
                           			current, 
                           			"direction",
                            		lv_direction_6_0, 
                            		"Direction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:398:3: ( (lv_margin_7_0= ruleMargin ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:399:1: (lv_margin_7_0= ruleMargin )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:399:1: (lv_margin_7_0= ruleMargin )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:400:3: lv_margin_7_0= ruleMargin
                    {
                     
                    	        newCompositeNode(grammarAccess.getIconDecorationAccess().getMarginMarginParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMargin_in_ruleIconDecoration845);
                    lv_margin_7_0=ruleMargin();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIconDecorationRule());
                    	        }
                           		set(
                           			current, 
                           			"margin",
                            		lv_margin_7_0, 
                            		"Margin");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:416:3: ( (lv_activation_8_0= ruleActivation ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:417:1: (lv_activation_8_0= ruleActivation )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:417:1: (lv_activation_8_0= ruleActivation )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:418:3: lv_activation_8_0= ruleActivation
                    {
                     
                    	        newCompositeNode(grammarAccess.getIconDecorationAccess().getActivationActivationParserRuleCall_8_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActivation_in_ruleIconDecoration867);
                    lv_activation_8_0=ruleActivation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIconDecorationRule());
                    	        }
                           		set(
                           			current, 
                           			"activation",
                            		lv_activation_8_0, 
                            		"Activation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleIconDecoration880); 

                	newLeafNode(otherlv_9, grammarAccess.getIconDecorationAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIconDecoration"


    // $ANTLR start "entryRuleBorderDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:446:1: entryRuleBorderDecoration returns [EObject current=null] : iv_ruleBorderDecoration= ruleBorderDecoration EOF ;
    public final EObject entryRuleBorderDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorderDecoration = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:447:2: (iv_ruleBorderDecoration= ruleBorderDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:448:2: iv_ruleBorderDecoration= ruleBorderDecoration EOF
            {
             newCompositeNode(grammarAccess.getBorderDecorationRule()); 
            pushFollow(FOLLOW_ruleBorderDecoration_in_entryRuleBorderDecoration916);
            iv_ruleBorderDecoration=ruleBorderDecoration();

            state._fsp--;

             current =iv_ruleBorderDecoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorderDecoration926); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:455:1: ruleBorderDecoration returns [EObject current=null] : ( () otherlv_1= 'border' (otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_color_4_0= ruleColor ) )? ( (lv_style_5_0= ruleStyle ) )? ( (lv_activation_6_0= ruleActivation ) )? otherlv_7= '}' )? ) ;
    public final EObject ruleBorderDecoration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_size_3_0 = null;

        EObject lv_color_4_0 = null;

        EObject lv_style_5_0 = null;

        EObject lv_activation_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:458:28: ( ( () otherlv_1= 'border' (otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_color_4_0= ruleColor ) )? ( (lv_style_5_0= ruleStyle ) )? ( (lv_activation_6_0= ruleActivation ) )? otherlv_7= '}' )? ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:459:1: ( () otherlv_1= 'border' (otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_color_4_0= ruleColor ) )? ( (lv_style_5_0= ruleStyle ) )? ( (lv_activation_6_0= ruleActivation ) )? otherlv_7= '}' )? )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:459:1: ( () otherlv_1= 'border' (otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_color_4_0= ruleColor ) )? ( (lv_style_5_0= ruleStyle ) )? ( (lv_activation_6_0= ruleActivation ) )? otherlv_7= '}' )? )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:459:2: () otherlv_1= 'border' (otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_color_4_0= ruleColor ) )? ( (lv_style_5_0= ruleStyle ) )? ( (lv_activation_6_0= ruleActivation ) )? otherlv_7= '}' )?
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:459:2: ()
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:460:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBorderDecorationAccess().getBorderDecorationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleBorderDecoration972); 

                	newLeafNode(otherlv_1, grammarAccess.getBorderDecorationAccess().getBorderKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:469:1: (otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_color_4_0= ruleColor ) )? ( (lv_style_5_0= ruleStyle ) )? ( (lv_activation_6_0= ruleActivation ) )? otherlv_7= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:469:3: otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_color_4_0= ruleColor ) )? ( (lv_style_5_0= ruleStyle ) )? ( (lv_activation_6_0= ruleActivation ) )? otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleBorderDecoration985); 

                        	newLeafNode(otherlv_2, grammarAccess.getBorderDecorationAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:473:1: ( (lv_size_3_0= ruleSize ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==26) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:474:1: (lv_size_3_0= ruleSize )
                            {
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:474:1: (lv_size_3_0= ruleSize )
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:475:3: lv_size_3_0= ruleSize
                            {
                             
                            	        newCompositeNode(grammarAccess.getBorderDecorationAccess().getSizeSizeParserRuleCall_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSize_in_ruleBorderDecoration1006);
                            lv_size_3_0=ruleSize();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getBorderDecorationRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"size",
                                    		lv_size_3_0, 
                                    		"Size");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:491:3: ( (lv_color_4_0= ruleColor ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==29) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:492:1: (lv_color_4_0= ruleColor )
                            {
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:492:1: (lv_color_4_0= ruleColor )
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:493:3: lv_color_4_0= ruleColor
                            {
                             
                            	        newCompositeNode(grammarAccess.getBorderDecorationAccess().getColorColorParserRuleCall_2_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleColor_in_ruleBorderDecoration1028);
                            lv_color_4_0=ruleColor();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getBorderDecorationRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"color",
                                    		lv_color_4_0, 
                                    		"Color");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:509:3: ( (lv_style_5_0= ruleStyle ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==25) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:510:1: (lv_style_5_0= ruleStyle )
                            {
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:510:1: (lv_style_5_0= ruleStyle )
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:511:3: lv_style_5_0= ruleStyle
                            {
                             
                            	        newCompositeNode(grammarAccess.getBorderDecorationAccess().getStyleStyleParserRuleCall_2_3_0()); 
                            	    
                            pushFollow(FOLLOW_ruleStyle_in_ruleBorderDecoration1050);
                            lv_style_5_0=ruleStyle();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getBorderDecorationRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"style",
                                    		lv_style_5_0, 
                                    		"Style");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:527:3: ( (lv_activation_6_0= ruleActivation ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==34) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:528:1: (lv_activation_6_0= ruleActivation )
                            {
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:528:1: (lv_activation_6_0= ruleActivation )
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:529:3: lv_activation_6_0= ruleActivation
                            {
                             
                            	        newCompositeNode(grammarAccess.getBorderDecorationAccess().getActivationActivationParserRuleCall_2_4_0()); 
                            	    
                            pushFollow(FOLLOW_ruleActivation_in_ruleBorderDecoration1072);
                            lv_activation_6_0=ruleActivation();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getBorderDecorationRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"activation",
                                    		lv_activation_6_0, 
                                    		"Activation");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleBorderDecoration1085); 

                        	newLeafNode(otherlv_7, grammarAccess.getBorderDecorationAccess().getRightCurlyBracketKeyword_2_5());
                        

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
    // $ANTLR end "ruleBorderDecoration"


    // $ANTLR start "entryRuleConnectionDecoration"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:557:1: entryRuleConnectionDecoration returns [EObject current=null] : iv_ruleConnectionDecoration= ruleConnectionDecoration EOF ;
    public final EObject entryRuleConnectionDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionDecoration = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:558:2: (iv_ruleConnectionDecoration= ruleConnectionDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:559:2: iv_ruleConnectionDecoration= ruleConnectionDecoration EOF
            {
             newCompositeNode(grammarAccess.getConnectionDecorationRule()); 
            pushFollow(FOLLOW_ruleConnectionDecoration_in_entryRuleConnectionDecoration1123);
            iv_ruleConnectionDecoration=ruleConnectionDecoration();

            state._fsp--;

             current =iv_ruleConnectionDecoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnectionDecoration1133); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:566:1: ruleConnectionDecoration returns [EObject current=null] : ( () otherlv_1= 'connection' (otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_color_4_0= ruleColor ) )? (otherlv_5= 'foreground' ( (lv_foregroundColor_6_0= ruleColor ) ) )? (otherlv_7= 'background' ( (lv_backgroundColor_8_0= ruleColor ) ) )? ( (lv_activation_9_0= ruleActivation ) )? otherlv_10= '}' )? ) ;
    public final EObject ruleConnectionDecoration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_size_3_0 = null;

        EObject lv_color_4_0 = null;

        EObject lv_foregroundColor_6_0 = null;

        EObject lv_backgroundColor_8_0 = null;

        EObject lv_activation_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:569:28: ( ( () otherlv_1= 'connection' (otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_color_4_0= ruleColor ) )? (otherlv_5= 'foreground' ( (lv_foregroundColor_6_0= ruleColor ) ) )? (otherlv_7= 'background' ( (lv_backgroundColor_8_0= ruleColor ) ) )? ( (lv_activation_9_0= ruleActivation ) )? otherlv_10= '}' )? ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:570:1: ( () otherlv_1= 'connection' (otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_color_4_0= ruleColor ) )? (otherlv_5= 'foreground' ( (lv_foregroundColor_6_0= ruleColor ) ) )? (otherlv_7= 'background' ( (lv_backgroundColor_8_0= ruleColor ) ) )? ( (lv_activation_9_0= ruleActivation ) )? otherlv_10= '}' )? )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:570:1: ( () otherlv_1= 'connection' (otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_color_4_0= ruleColor ) )? (otherlv_5= 'foreground' ( (lv_foregroundColor_6_0= ruleColor ) ) )? (otherlv_7= 'background' ( (lv_backgroundColor_8_0= ruleColor ) ) )? ( (lv_activation_9_0= ruleActivation ) )? otherlv_10= '}' )? )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:570:2: () otherlv_1= 'connection' (otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_color_4_0= ruleColor ) )? (otherlv_5= 'foreground' ( (lv_foregroundColor_6_0= ruleColor ) ) )? (otherlv_7= 'background' ( (lv_backgroundColor_8_0= ruleColor ) ) )? ( (lv_activation_9_0= ruleActivation ) )? otherlv_10= '}' )?
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:570:2: ()
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:571:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConnectionDecorationAccess().getConnectionDecorationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleConnectionDecoration1179); 

                	newLeafNode(otherlv_1, grammarAccess.getConnectionDecorationAccess().getConnectionKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:580:1: (otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_color_4_0= ruleColor ) )? (otherlv_5= 'foreground' ( (lv_foregroundColor_6_0= ruleColor ) ) )? (otherlv_7= 'background' ( (lv_backgroundColor_8_0= ruleColor ) ) )? ( (lv_activation_9_0= ruleActivation ) )? otherlv_10= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==16) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:580:3: otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_color_4_0= ruleColor ) )? (otherlv_5= 'foreground' ( (lv_foregroundColor_6_0= ruleColor ) ) )? (otherlv_7= 'background' ( (lv_backgroundColor_8_0= ruleColor ) ) )? ( (lv_activation_9_0= ruleActivation ) )? otherlv_10= '}'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleConnectionDecoration1192); 

                        	newLeafNode(otherlv_2, grammarAccess.getConnectionDecorationAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:584:1: ( (lv_size_3_0= ruleSize ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==26) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:585:1: (lv_size_3_0= ruleSize )
                            {
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:585:1: (lv_size_3_0= ruleSize )
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:586:3: lv_size_3_0= ruleSize
                            {
                             
                            	        newCompositeNode(grammarAccess.getConnectionDecorationAccess().getSizeSizeParserRuleCall_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSize_in_ruleConnectionDecoration1213);
                            lv_size_3_0=ruleSize();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getConnectionDecorationRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"size",
                                    		lv_size_3_0, 
                                    		"Size");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:602:3: ( (lv_color_4_0= ruleColor ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==29) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:603:1: (lv_color_4_0= ruleColor )
                            {
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:603:1: (lv_color_4_0= ruleColor )
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:604:3: lv_color_4_0= ruleColor
                            {
                             
                            	        newCompositeNode(grammarAccess.getConnectionDecorationAccess().getColorColorParserRuleCall_2_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleColor_in_ruleConnectionDecoration1235);
                            lv_color_4_0=ruleColor();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getConnectionDecorationRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"color",
                                    		lv_color_4_0, 
                                    		"Color");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:620:3: (otherlv_5= 'foreground' ( (lv_foregroundColor_6_0= ruleColor ) ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==23) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:620:5: otherlv_5= 'foreground' ( (lv_foregroundColor_6_0= ruleColor ) )
                            {
                            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleConnectionDecoration1249); 

                                	newLeafNode(otherlv_5, grammarAccess.getConnectionDecorationAccess().getForegroundKeyword_2_3_0());
                                
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:624:1: ( (lv_foregroundColor_6_0= ruleColor ) )
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:625:1: (lv_foregroundColor_6_0= ruleColor )
                            {
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:625:1: (lv_foregroundColor_6_0= ruleColor )
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:626:3: lv_foregroundColor_6_0= ruleColor
                            {
                             
                            	        newCompositeNode(grammarAccess.getConnectionDecorationAccess().getForegroundColorColorParserRuleCall_2_3_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleColor_in_ruleConnectionDecoration1270);
                            lv_foregroundColor_6_0=ruleColor();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getConnectionDecorationRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"foregroundColor",
                                    		lv_foregroundColor_6_0, 
                                    		"Color");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:642:4: (otherlv_7= 'background' ( (lv_backgroundColor_8_0= ruleColor ) ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==24) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:642:6: otherlv_7= 'background' ( (lv_backgroundColor_8_0= ruleColor ) )
                            {
                            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleConnectionDecoration1285); 

                                	newLeafNode(otherlv_7, grammarAccess.getConnectionDecorationAccess().getBackgroundKeyword_2_4_0());
                                
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:646:1: ( (lv_backgroundColor_8_0= ruleColor ) )
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:647:1: (lv_backgroundColor_8_0= ruleColor )
                            {
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:647:1: (lv_backgroundColor_8_0= ruleColor )
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:648:3: lv_backgroundColor_8_0= ruleColor
                            {
                             
                            	        newCompositeNode(grammarAccess.getConnectionDecorationAccess().getBackgroundColorColorParserRuleCall_2_4_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleColor_in_ruleConnectionDecoration1306);
                            lv_backgroundColor_8_0=ruleColor();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getConnectionDecorationRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"backgroundColor",
                                    		lv_backgroundColor_8_0, 
                                    		"Color");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:664:4: ( (lv_activation_9_0= ruleActivation ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==34) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:665:1: (lv_activation_9_0= ruleActivation )
                            {
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:665:1: (lv_activation_9_0= ruleActivation )
                            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:666:3: lv_activation_9_0= ruleActivation
                            {
                             
                            	        newCompositeNode(grammarAccess.getConnectionDecorationAccess().getActivationActivationParserRuleCall_2_5_0()); 
                            	    
                            pushFollow(FOLLOW_ruleActivation_in_ruleConnectionDecoration1329);
                            lv_activation_9_0=ruleActivation();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getConnectionDecorationRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"activation",
                                    		lv_activation_9_0, 
                                    		"Activation");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleConnectionDecoration1342); 

                        	newLeafNode(otherlv_10, grammarAccess.getConnectionDecorationAccess().getRightCurlyBracketKeyword_2_6());
                        

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
    // $ANTLR end "ruleConnectionDecoration"


    // $ANTLR start "entryRuleStyle"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:694:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:695:2: (iv_ruleStyle= ruleStyle EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:696:2: iv_ruleStyle= ruleStyle EOF
            {
             newCompositeNode(grammarAccess.getStyleRule()); 
            pushFollow(FOLLOW_ruleStyle_in_entryRuleStyle1380);
            iv_ruleStyle=ruleStyle();

            state._fsp--;

             current =iv_ruleStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStyle1390); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:703:1: ruleStyle returns [EObject current=null] : (otherlv_0= 'style' otherlv_1= ':' ( (lv_value_2_0= ruleLineStyle ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:706:28: ( (otherlv_0= 'style' otherlv_1= ':' ( (lv_value_2_0= ruleLineStyle ) ) (otherlv_3= ';' )? ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:707:1: (otherlv_0= 'style' otherlv_1= ':' ( (lv_value_2_0= ruleLineStyle ) ) (otherlv_3= ';' )? )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:707:1: (otherlv_0= 'style' otherlv_1= ':' ( (lv_value_2_0= ruleLineStyle ) ) (otherlv_3= ';' )? )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:707:3: otherlv_0= 'style' otherlv_1= ':' ( (lv_value_2_0= ruleLineStyle ) ) (otherlv_3= ';' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleStyle1427); 

                	newLeafNode(otherlv_0, grammarAccess.getStyleAccess().getStyleKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleStyle1439); 

                	newLeafNode(otherlv_1, grammarAccess.getStyleAccess().getColonKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:715:1: ( (lv_value_2_0= ruleLineStyle ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:716:1: (lv_value_2_0= ruleLineStyle )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:716:1: (lv_value_2_0= ruleLineStyle )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:717:3: lv_value_2_0= ruleLineStyle
            {
             
            	        newCompositeNode(grammarAccess.getStyleAccess().getValueLineStyleEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLineStyle_in_ruleStyle1460);
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

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:733:2: (otherlv_3= ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==13) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:733:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleStyle1473); 

                        	newLeafNode(otherlv_3, grammarAccess.getStyleAccess().getSemicolonKeyword_3());
                        

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
    // $ANTLR end "ruleStyle"


    // $ANTLR start "entryRuleSize"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:745:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:746:2: (iv_ruleSize= ruleSize EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:747:2: iv_ruleSize= ruleSize EOF
            {
             newCompositeNode(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_ruleSize_in_entryRuleSize1511);
            iv_ruleSize=ruleSize();

            state._fsp--;

             current =iv_ruleSize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSize1521); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:754:1: ruleSize returns [EObject current=null] : (otherlv_0= 'size' otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:757:28: ( (otherlv_0= 'size' otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= ';' )? ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:758:1: (otherlv_0= 'size' otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= ';' )? )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:758:1: (otherlv_0= 'size' otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= ';' )? )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:758:3: otherlv_0= 'size' otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= ';' )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleSize1558); 

                	newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleSize1570); 

                	newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getColonKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:766:1: ( (lv_value_2_0= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:767:1: (lv_value_2_0= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:767:1: (lv_value_2_0= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:768:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSize1587); 

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

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:784:2: (otherlv_3= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==13) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:784:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSize1605); 

                        	newLeafNode(otherlv_3, grammarAccess.getSizeAccess().getSemicolonKeyword_3());
                        

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
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleDirection"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:796:1: entryRuleDirection returns [EObject current=null] : iv_ruleDirection= ruleDirection EOF ;
    public final EObject entryRuleDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirection = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:797:2: (iv_ruleDirection= ruleDirection EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:798:2: iv_ruleDirection= ruleDirection EOF
            {
             newCompositeNode(grammarAccess.getDirectionRule()); 
            pushFollow(FOLLOW_ruleDirection_in_entryRuleDirection1643);
            iv_ruleDirection=ruleDirection();

            state._fsp--;

             current =iv_ruleDirection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirection1653); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:805:1: ruleDirection returns [EObject current=null] : (otherlv_0= 'direction' otherlv_1= ':' ( (lv_value_2_0= ruleDirections ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleDirection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:808:28: ( (otherlv_0= 'direction' otherlv_1= ':' ( (lv_value_2_0= ruleDirections ) ) (otherlv_3= ';' )? ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:809:1: (otherlv_0= 'direction' otherlv_1= ':' ( (lv_value_2_0= ruleDirections ) ) (otherlv_3= ';' )? )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:809:1: (otherlv_0= 'direction' otherlv_1= ':' ( (lv_value_2_0= ruleDirections ) ) (otherlv_3= ';' )? )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:809:3: otherlv_0= 'direction' otherlv_1= ':' ( (lv_value_2_0= ruleDirections ) ) (otherlv_3= ';' )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleDirection1690); 

                	newLeafNode(otherlv_0, grammarAccess.getDirectionAccess().getDirectionKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleDirection1702); 

                	newLeafNode(otherlv_1, grammarAccess.getDirectionAccess().getColonKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:817:1: ( (lv_value_2_0= ruleDirections ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:818:1: (lv_value_2_0= ruleDirections )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:818:1: (lv_value_2_0= ruleDirections )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:819:3: lv_value_2_0= ruleDirections
            {
             
            	        newCompositeNode(grammarAccess.getDirectionAccess().getValueDirectionsEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDirections_in_ruleDirection1723);
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

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:835:2: (otherlv_3= ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:835:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDirection1736); 

                        	newLeafNode(otherlv_3, grammarAccess.getDirectionAccess().getSemicolonKeyword_3());
                        

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
    // $ANTLR end "ruleDirection"


    // $ANTLR start "entryRuleMargin"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:847:1: entryRuleMargin returns [EObject current=null] : iv_ruleMargin= ruleMargin EOF ;
    public final EObject entryRuleMargin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMargin = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:848:2: (iv_ruleMargin= ruleMargin EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:849:2: iv_ruleMargin= ruleMargin EOF
            {
             newCompositeNode(grammarAccess.getMarginRule()); 
            pushFollow(FOLLOW_ruleMargin_in_entryRuleMargin1774);
            iv_ruleMargin=ruleMargin();

            state._fsp--;

             current =iv_ruleMargin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMargin1784); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:856:1: ruleMargin returns [EObject current=null] : (otherlv_0= 'margin' otherlv_1= ':' ( (lv_value_2_0= ruleSignedInteger ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleMargin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:859:28: ( (otherlv_0= 'margin' otherlv_1= ':' ( (lv_value_2_0= ruleSignedInteger ) ) (otherlv_3= ';' )? ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:860:1: (otherlv_0= 'margin' otherlv_1= ':' ( (lv_value_2_0= ruleSignedInteger ) ) (otherlv_3= ';' )? )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:860:1: (otherlv_0= 'margin' otherlv_1= ':' ( (lv_value_2_0= ruleSignedInteger ) ) (otherlv_3= ';' )? )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:860:3: otherlv_0= 'margin' otherlv_1= ':' ( (lv_value_2_0= ruleSignedInteger ) ) (otherlv_3= ';' )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleMargin1821); 

                	newLeafNode(otherlv_0, grammarAccess.getMarginAccess().getMarginKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleMargin1833); 

                	newLeafNode(otherlv_1, grammarAccess.getMarginAccess().getColonKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:868:1: ( (lv_value_2_0= ruleSignedInteger ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:869:1: (lv_value_2_0= ruleSignedInteger )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:869:1: (lv_value_2_0= ruleSignedInteger )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:870:3: lv_value_2_0= ruleSignedInteger
            {
             
            	        newCompositeNode(grammarAccess.getMarginAccess().getValueSignedIntegerParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSignedInteger_in_ruleMargin1854);
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

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:886:2: (otherlv_3= ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==13) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:886:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleMargin1867); 

                        	newLeafNode(otherlv_3, grammarAccess.getMarginAccess().getSemicolonKeyword_3());
                        

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
    // $ANTLR end "ruleMargin"


    // $ANTLR start "entryRuleColor"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:898:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:899:2: (iv_ruleColor= ruleColor EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:900:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor1905);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor1915); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:907:1: ruleColor returns [EObject current=null] : ( ( () otherlv_1= 'color' otherlv_2= ':' ( (lv_value_3_0= ruleColorConstant ) ) ) | (otherlv_4= 'color' otherlv_5= ':' ( (lv_concret_6_0= ruleConcreteColor ) ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_value_3_0 = null;

        EObject lv_concret_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:910:28: ( ( ( () otherlv_1= 'color' otherlv_2= ':' ( (lv_value_3_0= ruleColorConstant ) ) ) | (otherlv_4= 'color' otherlv_5= ':' ( (lv_concret_6_0= ruleConcreteColor ) ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:911:1: ( ( () otherlv_1= 'color' otherlv_2= ':' ( (lv_value_3_0= ruleColorConstant ) ) ) | (otherlv_4= 'color' otherlv_5= ':' ( (lv_concret_6_0= ruleConcreteColor ) ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:911:1: ( ( () otherlv_1= 'color' otherlv_2= ':' ( (lv_value_3_0= ruleColorConstant ) ) ) | (otherlv_4= 'color' otherlv_5= ':' ( (lv_concret_6_0= ruleConcreteColor ) ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==20) ) {
                    int LA27_2 = input.LA(3);

                    if ( (LA27_2==30) ) {
                        alt27=2;
                    }
                    else if ( ((LA27_2>=50 && LA27_2<=64)) ) {
                        alt27=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:911:2: ( () otherlv_1= 'color' otherlv_2= ':' ( (lv_value_3_0= ruleColorConstant ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:911:2: ( () otherlv_1= 'color' otherlv_2= ':' ( (lv_value_3_0= ruleColorConstant ) ) )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:911:3: () otherlv_1= 'color' otherlv_2= ':' ( (lv_value_3_0= ruleColorConstant ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:911:3: ()
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:912:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getColorAccess().getColorAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleColor1962); 

                        	newLeafNode(otherlv_1, grammarAccess.getColorAccess().getColorKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleColor1974); 

                        	newLeafNode(otherlv_2, grammarAccess.getColorAccess().getColonKeyword_0_2());
                        
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:925:1: ( (lv_value_3_0= ruleColorConstant ) )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:926:1: (lv_value_3_0= ruleColorConstant )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:926:1: (lv_value_3_0= ruleColorConstant )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:927:3: lv_value_3_0= ruleColorConstant
                    {
                     
                    	        newCompositeNode(grammarAccess.getColorAccess().getValueColorConstantParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleColorConstant_in_ruleColor1995);
                    lv_value_3_0=ruleColorConstant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getColorRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"ColorConstant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:944:6: (otherlv_4= 'color' otherlv_5= ':' ( (lv_concret_6_0= ruleConcreteColor ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:944:6: (otherlv_4= 'color' otherlv_5= ':' ( (lv_concret_6_0= ruleConcreteColor ) ) )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:944:8: otherlv_4= 'color' otherlv_5= ':' ( (lv_concret_6_0= ruleConcreteColor ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleColor2015); 

                        	newLeafNode(otherlv_4, grammarAccess.getColorAccess().getColorKeyword_1_0());
                        
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleColor2027); 

                        	newLeafNode(otherlv_5, grammarAccess.getColorAccess().getColonKeyword_1_1());
                        
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:952:1: ( (lv_concret_6_0= ruleConcreteColor ) )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:953:1: (lv_concret_6_0= ruleConcreteColor )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:953:1: (lv_concret_6_0= ruleConcreteColor )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:954:3: lv_concret_6_0= ruleConcreteColor
                    {
                     
                    	        newCompositeNode(grammarAccess.getColorAccess().getConcretConcreteColorParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConcreteColor_in_ruleColor2048);
                    lv_concret_6_0=ruleConcreteColor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getColorRule());
                    	        }
                           		set(
                           			current, 
                           			"concret",
                            		lv_concret_6_0, 
                            		"ConcreteColor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:978:1: entryRuleConcreteColor returns [EObject current=null] : iv_ruleConcreteColor= ruleConcreteColor EOF ;
    public final EObject entryRuleConcreteColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteColor = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:979:2: (iv_ruleConcreteColor= ruleConcreteColor EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:980:2: iv_ruleConcreteColor= ruleConcreteColor EOF
            {
             newCompositeNode(grammarAccess.getConcreteColorRule()); 
            pushFollow(FOLLOW_ruleConcreteColor_in_entryRuleConcreteColor2085);
            iv_ruleConcreteColor=ruleConcreteColor();

            state._fsp--;

             current =iv_ruleConcreteColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcreteColor2095); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:987:1: ruleConcreteColor returns [EObject current=null] : (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' (otherlv_8= ';' )? ) ;
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
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:990:28: ( (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' (otherlv_8= ';' )? ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:991:1: (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' (otherlv_8= ';' )? )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:991:1: (otherlv_0= 'RGB' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' (otherlv_8= ';' )? )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:991:3: otherlv_0= 'RGB' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' (otherlv_8= ';' )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleConcreteColor2132); 

                	newLeafNode(otherlv_0, grammarAccess.getConcreteColorAccess().getRGBKeyword_0());
                
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleConcreteColor2144); 

                	newLeafNode(otherlv_1, grammarAccess.getConcreteColorAccess().getLeftParenthesisKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:999:1: ( (lv_red_2_0= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1000:1: (lv_red_2_0= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1000:1: (lv_red_2_0= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1001:3: lv_red_2_0= RULE_INT
            {
            lv_red_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConcreteColor2161); 

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

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleConcreteColor2178); 

                	newLeafNode(otherlv_3, grammarAccess.getConcreteColorAccess().getCommaKeyword_3());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1021:1: ( (lv_green_4_0= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1022:1: (lv_green_4_0= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1022:1: (lv_green_4_0= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1023:3: lv_green_4_0= RULE_INT
            {
            lv_green_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConcreteColor2195); 

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

            otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleConcreteColor2212); 

                	newLeafNode(otherlv_5, grammarAccess.getConcreteColorAccess().getCommaKeyword_5());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1043:1: ( (lv_blue_6_0= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1044:1: (lv_blue_6_0= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1044:1: (lv_blue_6_0= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1045:3: lv_blue_6_0= RULE_INT
            {
            lv_blue_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConcreteColor2229); 

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

            otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleConcreteColor2246); 

                	newLeafNode(otherlv_7, grammarAccess.getConcreteColorAccess().getRightParenthesisKeyword_7());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1065:1: (otherlv_8= ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1065:3: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleConcreteColor2259); 

                        	newLeafNode(otherlv_8, grammarAccess.getConcreteColorAccess().getSemicolonKeyword_8());
                        

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
    // $ANTLR end "ruleConcreteColor"


    // $ANTLR start "entryRuleColorConstant"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1077:1: entryRuleColorConstant returns [EObject current=null] : iv_ruleColorConstant= ruleColorConstant EOF ;
    public final EObject entryRuleColorConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorConstant = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1078:2: (iv_ruleColorConstant= ruleColorConstant EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1079:2: iv_ruleColorConstant= ruleColorConstant EOF
            {
             newCompositeNode(grammarAccess.getColorConstantRule()); 
            pushFollow(FOLLOW_ruleColorConstant_in_entryRuleColorConstant2297);
            iv_ruleColorConstant=ruleColorConstant();

            state._fsp--;

             current =iv_ruleColorConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorConstant2307); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1086:1: ruleColorConstant returns [EObject current=null] : ( ( (lv_value_0_0= ruleColors ) ) (otherlv_1= ';' )? ) ;
    public final EObject ruleColorConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1089:28: ( ( ( (lv_value_0_0= ruleColors ) ) (otherlv_1= ';' )? ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1090:1: ( ( (lv_value_0_0= ruleColors ) ) (otherlv_1= ';' )? )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1090:1: ( ( (lv_value_0_0= ruleColors ) ) (otherlv_1= ';' )? )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1090:2: ( (lv_value_0_0= ruleColors ) ) (otherlv_1= ';' )?
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1090:2: ( (lv_value_0_0= ruleColors ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1091:1: (lv_value_0_0= ruleColors )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1091:1: (lv_value_0_0= ruleColors )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1092:3: lv_value_0_0= ruleColors
            {
             
            	        newCompositeNode(grammarAccess.getColorConstantAccess().getValueColorsEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleColors_in_ruleColorConstant2353);
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

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1108:2: (otherlv_1= ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==13) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1108:4: otherlv_1= ';'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleColorConstant2366); 

                        	newLeafNode(otherlv_1, grammarAccess.getColorConstantAccess().getSemicolonKeyword_1());
                        

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
    // $ANTLR end "ruleColorConstant"


    // $ANTLR start "entryRuleActivation"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1120:1: entryRuleActivation returns [EObject current=null] : iv_ruleActivation= ruleActivation EOF ;
    public final EObject entryRuleActivation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivation = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1121:2: (iv_ruleActivation= ruleActivation EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1122:2: iv_ruleActivation= ruleActivation EOF
            {
             newCompositeNode(grammarAccess.getActivationRule()); 
            pushFollow(FOLLOW_ruleActivation_in_entryRuleActivation2404);
            iv_ruleActivation=ruleActivation();

            state._fsp--;

             current =iv_ruleActivation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivation2414); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1129:1: ruleActivation returns [EObject current=null] : (otherlv_0= 'active when' ( (lv_condition_1_0= ruleAbstractCondition ) ) ) ;
    public final EObject ruleActivation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_condition_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1132:28: ( (otherlv_0= 'active when' ( (lv_condition_1_0= ruleAbstractCondition ) ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1133:1: (otherlv_0= 'active when' ( (lv_condition_1_0= ruleAbstractCondition ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1133:1: (otherlv_0= 'active when' ( (lv_condition_1_0= ruleAbstractCondition ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1133:3: otherlv_0= 'active when' ( (lv_condition_1_0= ruleAbstractCondition ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleActivation2451); 

                	newLeafNode(otherlv_0, grammarAccess.getActivationAccess().getActiveWhenKeyword_0());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1137:1: ( (lv_condition_1_0= ruleAbstractCondition ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1138:1: (lv_condition_1_0= ruleAbstractCondition )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1138:1: (lv_condition_1_0= ruleAbstractCondition )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1139:3: lv_condition_1_0= ruleAbstractCondition
            {
             
            	        newCompositeNode(grammarAccess.getActivationAccess().getConditionAbstractConditionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractCondition_in_ruleActivation2472);
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1163:1: entryRuleAbstractCondition returns [EObject current=null] : iv_ruleAbstractCondition= ruleAbstractCondition EOF ;
    public final EObject entryRuleAbstractCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCondition = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1164:2: (iv_ruleAbstractCondition= ruleAbstractCondition EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1165:2: iv_ruleAbstractCondition= ruleAbstractCondition EOF
            {
             newCompositeNode(grammarAccess.getAbstractConditionRule()); 
            pushFollow(FOLLOW_ruleAbstractCondition_in_entryRuleAbstractCondition2508);
            iv_ruleAbstractCondition=ruleAbstractCondition();

            state._fsp--;

             current =iv_ruleAbstractCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractCondition2518); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1172:1: ruleAbstractCondition returns [EObject current=null] : (this_Condition_0= ruleCondition | this_CompositeCondition_1= ruleCompositeCondition ) ;
    public final EObject ruleAbstractCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Condition_0 = null;

        EObject this_CompositeCondition_1 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1175:28: ( (this_Condition_0= ruleCondition | this_CompositeCondition_1= ruleCompositeCondition ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1176:1: (this_Condition_0= ruleCondition | this_CompositeCondition_1= ruleCompositeCondition )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1176:1: (this_Condition_0= ruleCondition | this_CompositeCondition_1= ruleCompositeCondition )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=43 && LA30_0<=44)) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1177:5: this_Condition_0= ruleCondition
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractConditionAccess().getConditionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCondition_in_ruleAbstractCondition2565);
                    this_Condition_0=ruleCondition();

                    state._fsp--;

                     
                            current = this_Condition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1187:5: this_CompositeCondition_1= ruleCompositeCondition
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractConditionAccess().getCompositeConditionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCompositeCondition_in_ruleAbstractCondition2592);
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1203:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1204:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1205:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition2627);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition2637); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1212:1: ruleCondition returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_value_2_0= ruleType ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Enumerator lv_operator_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1215:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_value_2_0= ruleType ) ) (otherlv_3= ';' )? ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1216:1: ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_value_2_0= ruleType ) ) (otherlv_3= ';' )? )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1216:1: ( ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_value_2_0= ruleType ) ) (otherlv_3= ';' )? )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1216:2: ( ( ruleQualifiedName ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_value_2_0= ruleType ) ) (otherlv_3= ';' )?
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1216:2: ( ( ruleQualifiedName ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1217:1: ( ruleQualifiedName )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1217:1: ( ruleQualifiedName )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1218:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getAttributeEAttributeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCondition2685);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1231:2: ( (lv_operator_1_0= ruleComparisonOperator ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1232:1: (lv_operator_1_0= ruleComparisonOperator )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1232:1: (lv_operator_1_0= ruleComparisonOperator )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1233:3: lv_operator_1_0= ruleComparisonOperator
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getOperatorComparisonOperatorEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleComparisonOperator_in_ruleCondition2706);
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

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1249:2: ( (lv_value_2_0= ruleType ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1250:1: (lv_value_2_0= ruleType )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1250:1: (lv_value_2_0= ruleType )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1251:3: lv_value_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getConditionAccess().getValueTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleCondition2727);
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

            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1267:2: (otherlv_3= ';' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==13) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1267:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleCondition2740); 

                        	newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getSemicolonKeyword_3());
                        

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleCompositeCondition"
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1279:1: entryRuleCompositeCondition returns [EObject current=null] : iv_ruleCompositeCondition= ruleCompositeCondition EOF ;
    public final EObject entryRuleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeCondition = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1280:2: (iv_ruleCompositeCondition= ruleCompositeCondition EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1281:2: iv_ruleCompositeCondition= ruleCompositeCondition EOF
            {
             newCompositeNode(grammarAccess.getCompositeConditionRule()); 
            pushFollow(FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition2778);
            iv_ruleCompositeCondition=ruleCompositeCondition();

            state._fsp--;

             current =iv_ruleCompositeCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeCondition2788); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1288:1: ruleCompositeCondition returns [EObject current=null] : ( ( (lv_operator_0_0= ruleLogicalOperator ) ) otherlv_1= '(' ( (lv_conditions_2_0= ruleAbstractCondition ) )+ otherlv_3= ')' ) ;
    public final EObject ruleCompositeCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_operator_0_0 = null;

        EObject lv_conditions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1291:28: ( ( ( (lv_operator_0_0= ruleLogicalOperator ) ) otherlv_1= '(' ( (lv_conditions_2_0= ruleAbstractCondition ) )+ otherlv_3= ')' ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1292:1: ( ( (lv_operator_0_0= ruleLogicalOperator ) ) otherlv_1= '(' ( (lv_conditions_2_0= ruleAbstractCondition ) )+ otherlv_3= ')' )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1292:1: ( ( (lv_operator_0_0= ruleLogicalOperator ) ) otherlv_1= '(' ( (lv_conditions_2_0= ruleAbstractCondition ) )+ otherlv_3= ')' )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1292:2: ( (lv_operator_0_0= ruleLogicalOperator ) ) otherlv_1= '(' ( (lv_conditions_2_0= ruleAbstractCondition ) )+ otherlv_3= ')'
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1292:2: ( (lv_operator_0_0= ruleLogicalOperator ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1293:1: (lv_operator_0_0= ruleLogicalOperator )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1293:1: (lv_operator_0_0= ruleLogicalOperator )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1294:3: lv_operator_0_0= ruleLogicalOperator
            {
             
            	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getOperatorLogicalOperatorEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLogicalOperator_in_ruleCompositeCondition2834);
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

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleCompositeCondition2846); 

                	newLeafNode(otherlv_1, grammarAccess.getCompositeConditionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1314:1: ( (lv_conditions_2_0= ruleAbstractCondition ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID||(LA32_0>=43 && LA32_0<=44)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1315:1: (lv_conditions_2_0= ruleAbstractCondition )
            	    {
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1315:1: (lv_conditions_2_0= ruleAbstractCondition )
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1316:3: lv_conditions_2_0= ruleAbstractCondition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionsAbstractConditionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractCondition_in_ruleCompositeCondition2867);
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
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleCompositeCondition2880); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1344:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1345:2: (iv_ruleType= ruleType EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1346:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2917);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2928); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1353:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SignedInteger_0= ruleSignedInteger | this_SignedDouble_1= ruleSignedDouble | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_2=null;
        Token this_BOOLEAN_3=null;
        AntlrDatatypeRuleToken this_SignedInteger_0 = null;

        AntlrDatatypeRuleToken this_SignedDouble_1 = null;


         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1356:28: ( (this_SignedInteger_0= ruleSignedInteger | this_SignedDouble_1= ruleSignedDouble | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1357:1: (this_SignedInteger_0= ruleSignedInteger | this_SignedDouble_1= ruleSignedDouble | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1357:1: (this_SignedInteger_0= ruleSignedInteger | this_SignedDouble_1= ruleSignedDouble | this_STRING_2= RULE_STRING | this_BOOLEAN_3= RULE_BOOLEAN )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==RULE_INT) ) {
                    int LA33_2 = input.LA(3);

                    if ( (LA33_2==EOF||LA33_2==RULE_ID||LA33_2==13||LA33_2==17||LA33_2==33||(LA33_2>=43 && LA33_2<=44)) ) {
                        alt33=1;
                    }
                    else if ( (LA33_2==36) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA33_2 = input.LA(2);

                if ( (LA33_2==EOF||LA33_2==RULE_ID||LA33_2==13||LA33_2==17||LA33_2==33||(LA33_2>=43 && LA33_2<=44)) ) {
                    alt33=1;
                }
                else if ( (LA33_2==36) ) {
                    alt33=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt33=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1358:5: this_SignedInteger_0= ruleSignedInteger
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSignedIntegerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSignedInteger_in_ruleType2975);
                    this_SignedInteger_0=ruleSignedInteger();

                    state._fsp--;


                    		current.merge(this_SignedInteger_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1370:5: this_SignedDouble_1= ruleSignedDouble
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSignedDoubleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSignedDouble_in_ruleType3008);
                    this_SignedDouble_1=ruleSignedDouble();

                    state._fsp--;


                    		current.merge(this_SignedDouble_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1381:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleType3034); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getTypeAccess().getSTRINGTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1389:10: this_BOOLEAN_3= RULE_BOOLEAN
                    {
                    this_BOOLEAN_3=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleType3060); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1404:1: entryRuleSignedDouble returns [String current=null] : iv_ruleSignedDouble= ruleSignedDouble EOF ;
    public final String entryRuleSignedDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedDouble = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1405:2: (iv_ruleSignedDouble= ruleSignedDouble EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1406:2: iv_ruleSignedDouble= ruleSignedDouble EOF
            {
             newCompositeNode(grammarAccess.getSignedDoubleRule()); 
            pushFollow(FOLLOW_ruleSignedDouble_in_entryRuleSignedDouble3106);
            iv_ruleSignedDouble=ruleSignedDouble();

            state._fsp--;

             current =iv_ruleSignedDouble.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedDouble3117); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1413:1: ruleSignedDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1416:28: ( ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1417:1: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1417:1: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1417:2: (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1417:2: (kw= '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==35) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1418:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleSignedDouble3156); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedDoubleAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedDouble3173); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getSignedDoubleAccess().getINTTerminalRuleCall_1()); 
                
            kw=(Token)match(input,36,FOLLOW_36_in_ruleSignedDouble3191); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSignedDoubleAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedDouble3206); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1451:1: entryRuleSignedInteger returns [String current=null] : iv_ruleSignedInteger= ruleSignedInteger EOF ;
    public final String entryRuleSignedInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInteger = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1452:2: (iv_ruleSignedInteger= ruleSignedInteger EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1453:2: iv_ruleSignedInteger= ruleSignedInteger EOF
            {
             newCompositeNode(grammarAccess.getSignedIntegerRule()); 
            pushFollow(FOLLOW_ruleSignedInteger_in_entryRuleSignedInteger3252);
            iv_ruleSignedInteger=ruleSignedInteger();

            state._fsp--;

             current =iv_ruleSignedInteger.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedInteger3263); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1460:1: ruleSignedInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1463:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1464:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1464:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1464:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1464:2: (kw= '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==35) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1465:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleSignedInteger3302); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedIntegerAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedInteger3319); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1487:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1488:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1489:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3367);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName3378); 

            }

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1496:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1499:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1500:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1500:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1500:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName3418); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1507:1: (kw= '.' this_ID_2= RULE_ID )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==36) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1508:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,36,FOLLOW_36_in_ruleQualifiedName3437); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName3452); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1528:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '<=' ) ) ;
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
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1530:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '<=' ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1531:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '<=' ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1531:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '<=' ) )
            int alt37=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt37=1;
                }
                break;
            case 38:
                {
                alt37=2;
                }
                break;
            case 39:
                {
                alt37=3;
                }
                break;
            case 40:
                {
                alt37=4;
                }
                break;
            case 41:
                {
                alt37=5;
                }
                break;
            case 42:
                {
                alt37=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1531:2: (enumLiteral_0= '==' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1531:2: (enumLiteral_0= '==' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1531:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_37_in_ruleComparisonOperator3513); 

                            current = grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1537:6: (enumLiteral_1= '!=' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1537:6: (enumLiteral_1= '!=' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1537:8: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_38_in_ruleComparisonOperator3530); 

                            current = grammarAccess.getComparisonOperatorAccess().getUNEQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getUNEQUALEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1543:6: (enumLiteral_2= '>' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1543:6: (enumLiteral_2= '>' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1543:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_39_in_ruleComparisonOperator3547); 

                            current = grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1549:6: (enumLiteral_3= '>=' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1549:6: (enumLiteral_3= '>=' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1549:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,40,FOLLOW_40_in_ruleComparisonOperator3564); 

                            current = grammarAccess.getComparisonOperatorAccess().getGREATEROREQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getGREATEROREQUALEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1555:6: (enumLiteral_4= '<' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1555:6: (enumLiteral_4= '<' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1555:8: enumLiteral_4= '<'
                    {
                    enumLiteral_4=(Token)match(input,41,FOLLOW_41_in_ruleComparisonOperator3581); 

                            current = grammarAccess.getComparisonOperatorAccess().getLOWEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getLOWEREnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1561:6: (enumLiteral_5= '<=' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1561:6: (enumLiteral_5= '<=' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1561:8: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,42,FOLLOW_42_in_ruleComparisonOperator3598); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1571:1: ruleLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'any' ) ) ;
    public final Enumerator ruleLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1573:28: ( ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'any' ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1574:1: ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'any' ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1574:1: ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'any' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==43) ) {
                alt38=1;
            }
            else if ( (LA38_0==44) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1574:2: (enumLiteral_0= 'all' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1574:2: (enumLiteral_0= 'all' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1574:4: enumLiteral_0= 'all'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleLogicalOperator3643); 

                            current = grammarAccess.getLogicalOperatorAccess().getALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperatorAccess().getALLEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1580:6: (enumLiteral_1= 'any' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1580:6: (enumLiteral_1= 'any' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1580:8: enumLiteral_1= 'any'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_ruleLogicalOperator3660); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1590:1: ruleLineStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dots' ) | (enumLiteral_2= 'dashes' ) | (enumLiteral_3= 'dash_dots' ) | (enumLiteral_4= 'dash_dot_dot' ) ) ;
    public final Enumerator ruleLineStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1592:28: ( ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dots' ) | (enumLiteral_2= 'dashes' ) | (enumLiteral_3= 'dash_dots' ) | (enumLiteral_4= 'dash_dot_dot' ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1593:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dots' ) | (enumLiteral_2= 'dashes' ) | (enumLiteral_3= 'dash_dots' ) | (enumLiteral_4= 'dash_dot_dot' ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1593:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dots' ) | (enumLiteral_2= 'dashes' ) | (enumLiteral_3= 'dash_dots' ) | (enumLiteral_4= 'dash_dot_dot' ) )
            int alt39=5;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt39=1;
                }
                break;
            case 46:
                {
                alt39=2;
                }
                break;
            case 47:
                {
                alt39=3;
                }
                break;
            case 48:
                {
                alt39=4;
                }
                break;
            case 49:
                {
                alt39=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1593:2: (enumLiteral_0= 'solid' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1593:2: (enumLiteral_0= 'solid' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1593:4: enumLiteral_0= 'solid'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_45_in_ruleLineStyle3705); 

                            current = grammarAccess.getLineStyleAccess().getLINE_SOLIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLineStyleAccess().getLINE_SOLIDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1599:6: (enumLiteral_1= 'dots' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1599:6: (enumLiteral_1= 'dots' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1599:8: enumLiteral_1= 'dots'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_46_in_ruleLineStyle3722); 

                            current = grammarAccess.getLineStyleAccess().getLINE_DOTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLineStyleAccess().getLINE_DOTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1605:6: (enumLiteral_2= 'dashes' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1605:6: (enumLiteral_2= 'dashes' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1605:8: enumLiteral_2= 'dashes'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_47_in_ruleLineStyle3739); 

                            current = grammarAccess.getLineStyleAccess().getLINE_DASHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLineStyleAccess().getLINE_DASHEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1611:6: (enumLiteral_3= 'dash_dots' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1611:6: (enumLiteral_3= 'dash_dots' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1611:8: enumLiteral_3= 'dash_dots'
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_48_in_ruleLineStyle3756); 

                            current = grammarAccess.getLineStyleAccess().getLINE_DASHDOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLineStyleAccess().getLINE_DASHDOTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1617:6: (enumLiteral_4= 'dash_dot_dot' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1617:6: (enumLiteral_4= 'dash_dot_dot' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1617:8: enumLiteral_4= 'dash_dot_dot'
                    {
                    enumLiteral_4=(Token)match(input,49,FOLLOW_49_in_ruleLineStyle3773); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1627:1: ruleColors returns [Enumerator current=null] : ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'white' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'green_light' ) | (enumLiteral_5= 'green_dark' ) | (enumLiteral_6= 'blue' ) | (enumLiteral_7= 'blue_light' ) | (enumLiteral_8= 'blue_dark' ) | (enumLiteral_9= 'gray' ) | (enumLiteral_10= 'gray_light' ) | (enumLiteral_11= 'gray_dark' ) | (enumLiteral_12= 'orange' ) | (enumLiteral_13= 'yellow' ) | (enumLiteral_14= 'cyan' ) ) ;
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
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1629:28: ( ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'white' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'green_light' ) | (enumLiteral_5= 'green_dark' ) | (enumLiteral_6= 'blue' ) | (enumLiteral_7= 'blue_light' ) | (enumLiteral_8= 'blue_dark' ) | (enumLiteral_9= 'gray' ) | (enumLiteral_10= 'gray_light' ) | (enumLiteral_11= 'gray_dark' ) | (enumLiteral_12= 'orange' ) | (enumLiteral_13= 'yellow' ) | (enumLiteral_14= 'cyan' ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1630:1: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'white' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'green_light' ) | (enumLiteral_5= 'green_dark' ) | (enumLiteral_6= 'blue' ) | (enumLiteral_7= 'blue_light' ) | (enumLiteral_8= 'blue_dark' ) | (enumLiteral_9= 'gray' ) | (enumLiteral_10= 'gray_light' ) | (enumLiteral_11= 'gray_dark' ) | (enumLiteral_12= 'orange' ) | (enumLiteral_13= 'yellow' ) | (enumLiteral_14= 'cyan' ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1630:1: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'white' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'green_light' ) | (enumLiteral_5= 'green_dark' ) | (enumLiteral_6= 'blue' ) | (enumLiteral_7= 'blue_light' ) | (enumLiteral_8= 'blue_dark' ) | (enumLiteral_9= 'gray' ) | (enumLiteral_10= 'gray_light' ) | (enumLiteral_11= 'gray_dark' ) | (enumLiteral_12= 'orange' ) | (enumLiteral_13= 'yellow' ) | (enumLiteral_14= 'cyan' ) )
            int alt40=15;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt40=1;
                }
                break;
            case 51:
                {
                alt40=2;
                }
                break;
            case 52:
                {
                alt40=3;
                }
                break;
            case 53:
                {
                alt40=4;
                }
                break;
            case 54:
                {
                alt40=5;
                }
                break;
            case 55:
                {
                alt40=6;
                }
                break;
            case 56:
                {
                alt40=7;
                }
                break;
            case 57:
                {
                alt40=8;
                }
                break;
            case 58:
                {
                alt40=9;
                }
                break;
            case 59:
                {
                alt40=10;
                }
                break;
            case 60:
                {
                alt40=11;
                }
                break;
            case 61:
                {
                alt40=12;
                }
                break;
            case 62:
                {
                alt40=13;
                }
                break;
            case 63:
                {
                alt40=14;
                }
                break;
            case 64:
                {
                alt40=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1630:2: (enumLiteral_0= 'red' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1630:2: (enumLiteral_0= 'red' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1630:4: enumLiteral_0= 'red'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_50_in_ruleColors3818); 

                            current = grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1636:6: (enumLiteral_1= 'black' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1636:6: (enumLiteral_1= 'black' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1636:8: enumLiteral_1= 'black'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_51_in_ruleColors3835); 

                            current = grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1642:6: (enumLiteral_2= 'white' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1642:6: (enumLiteral_2= 'white' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1642:8: enumLiteral_2= 'white'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_52_in_ruleColors3852); 

                            current = grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1648:6: (enumLiteral_3= 'green' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1648:6: (enumLiteral_3= 'green' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1648:8: enumLiteral_3= 'green'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_53_in_ruleColors3869); 

                            current = grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1654:6: (enumLiteral_4= 'green_light' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1654:6: (enumLiteral_4= 'green_light' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1654:8: enumLiteral_4= 'green_light'
                    {
                    enumLiteral_4=(Token)match(input,54,FOLLOW_54_in_ruleColors3886); 

                            current = grammarAccess.getColorsAccess().getGREEN_LIGHTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getColorsAccess().getGREEN_LIGHTEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1660:6: (enumLiteral_5= 'green_dark' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1660:6: (enumLiteral_5= 'green_dark' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1660:8: enumLiteral_5= 'green_dark'
                    {
                    enumLiteral_5=(Token)match(input,55,FOLLOW_55_in_ruleColors3903); 

                            current = grammarAccess.getColorsAccess().getGREEN_DARKEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getColorsAccess().getGREEN_DARKEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1666:6: (enumLiteral_6= 'blue' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1666:6: (enumLiteral_6= 'blue' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1666:8: enumLiteral_6= 'blue'
                    {
                    enumLiteral_6=(Token)match(input,56,FOLLOW_56_in_ruleColors3920); 

                            current = grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1672:6: (enumLiteral_7= 'blue_light' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1672:6: (enumLiteral_7= 'blue_light' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1672:8: enumLiteral_7= 'blue_light'
                    {
                    enumLiteral_7=(Token)match(input,57,FOLLOW_57_in_ruleColors3937); 

                            current = grammarAccess.getColorsAccess().getBLUE_LIGHTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getColorsAccess().getBLUE_LIGHTEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1678:6: (enumLiteral_8= 'blue_dark' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1678:6: (enumLiteral_8= 'blue_dark' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1678:8: enumLiteral_8= 'blue_dark'
                    {
                    enumLiteral_8=(Token)match(input,58,FOLLOW_58_in_ruleColors3954); 

                            current = grammarAccess.getColorsAccess().getBLUE_DARKEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getColorsAccess().getBLUE_DARKEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1684:6: (enumLiteral_9= 'gray' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1684:6: (enumLiteral_9= 'gray' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1684:8: enumLiteral_9= 'gray'
                    {
                    enumLiteral_9=(Token)match(input,59,FOLLOW_59_in_ruleColors3971); 

                            current = grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1690:6: (enumLiteral_10= 'gray_light' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1690:6: (enumLiteral_10= 'gray_light' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1690:8: enumLiteral_10= 'gray_light'
                    {
                    enumLiteral_10=(Token)match(input,60,FOLLOW_60_in_ruleColors3988); 

                            current = grammarAccess.getColorsAccess().getGRAY_LIGHTEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getColorsAccess().getGRAY_LIGHTEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1696:6: (enumLiteral_11= 'gray_dark' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1696:6: (enumLiteral_11= 'gray_dark' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1696:8: enumLiteral_11= 'gray_dark'
                    {
                    enumLiteral_11=(Token)match(input,61,FOLLOW_61_in_ruleColors4005); 

                            current = grammarAccess.getColorsAccess().getGRAY_DARKEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getColorsAccess().getGRAY_DARKEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1702:6: (enumLiteral_12= 'orange' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1702:6: (enumLiteral_12= 'orange' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1702:8: enumLiteral_12= 'orange'
                    {
                    enumLiteral_12=(Token)match(input,62,FOLLOW_62_in_ruleColors4022); 

                            current = grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1708:6: (enumLiteral_13= 'yellow' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1708:6: (enumLiteral_13= 'yellow' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1708:8: enumLiteral_13= 'yellow'
                    {
                    enumLiteral_13=(Token)match(input,63,FOLLOW_63_in_ruleColors4039); 

                            current = grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1714:6: (enumLiteral_14= 'cyan' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1714:6: (enumLiteral_14= 'cyan' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1714:8: enumLiteral_14= 'cyan'
                    {
                    enumLiteral_14=(Token)match(input,64,FOLLOW_64_in_ruleColors4056); 

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
    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1724:1: ruleDirections returns [Enumerator current=null] : ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) | (enumLiteral_4= 'east' ) | (enumLiteral_5= 'north_east' ) | (enumLiteral_6= 'north_west' ) | (enumLiteral_7= 'south_east' ) | (enumLiteral_8= 'south_west' ) ) ;
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
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1726:28: ( ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) | (enumLiteral_4= 'east' ) | (enumLiteral_5= 'north_east' ) | (enumLiteral_6= 'north_west' ) | (enumLiteral_7= 'south_east' ) | (enumLiteral_8= 'south_west' ) ) )
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1727:1: ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) | (enumLiteral_4= 'east' ) | (enumLiteral_5= 'north_east' ) | (enumLiteral_6= 'north_west' ) | (enumLiteral_7= 'south_east' ) | (enumLiteral_8= 'south_west' ) )
            {
            // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1727:1: ( (enumLiteral_0= 'center' ) | (enumLiteral_1= 'north' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) | (enumLiteral_4= 'east' ) | (enumLiteral_5= 'north_east' ) | (enumLiteral_6= 'north_west' ) | (enumLiteral_7= 'south_east' ) | (enumLiteral_8= 'south_west' ) )
            int alt41=9;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt41=1;
                }
                break;
            case 66:
                {
                alt41=2;
                }
                break;
            case 67:
                {
                alt41=3;
                }
                break;
            case 68:
                {
                alt41=4;
                }
                break;
            case 69:
                {
                alt41=5;
                }
                break;
            case 70:
                {
                alt41=6;
                }
                break;
            case 71:
                {
                alt41=7;
                }
                break;
            case 72:
                {
                alt41=8;
                }
                break;
            case 73:
                {
                alt41=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1727:2: (enumLiteral_0= 'center' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1727:2: (enumLiteral_0= 'center' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1727:4: enumLiteral_0= 'center'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_65_in_ruleDirections4101); 

                            current = grammarAccess.getDirectionsAccess().getCENTEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDirectionsAccess().getCENTEREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1733:6: (enumLiteral_1= 'north' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1733:6: (enumLiteral_1= 'north' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1733:8: enumLiteral_1= 'north'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_66_in_ruleDirections4118); 

                            current = grammarAccess.getDirectionsAccess().getNORHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDirectionsAccess().getNORHTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1739:6: (enumLiteral_2= 'south' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1739:6: (enumLiteral_2= 'south' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1739:8: enumLiteral_2= 'south'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_67_in_ruleDirections4135); 

                            current = grammarAccess.getDirectionsAccess().getSOUTHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDirectionsAccess().getSOUTHEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1745:6: (enumLiteral_3= 'west' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1745:6: (enumLiteral_3= 'west' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1745:8: enumLiteral_3= 'west'
                    {
                    enumLiteral_3=(Token)match(input,68,FOLLOW_68_in_ruleDirections4152); 

                            current = grammarAccess.getDirectionsAccess().getWESTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDirectionsAccess().getWESTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1751:6: (enumLiteral_4= 'east' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1751:6: (enumLiteral_4= 'east' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1751:8: enumLiteral_4= 'east'
                    {
                    enumLiteral_4=(Token)match(input,69,FOLLOW_69_in_ruleDirections4169); 

                            current = grammarAccess.getDirectionsAccess().getEASTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDirectionsAccess().getEASTEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1757:6: (enumLiteral_5= 'north_east' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1757:6: (enumLiteral_5= 'north_east' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1757:8: enumLiteral_5= 'north_east'
                    {
                    enumLiteral_5=(Token)match(input,70,FOLLOW_70_in_ruleDirections4186); 

                            current = grammarAccess.getDirectionsAccess().getNORTH_EASTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDirectionsAccess().getNORTH_EASTEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1763:6: (enumLiteral_6= 'north_west' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1763:6: (enumLiteral_6= 'north_west' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1763:8: enumLiteral_6= 'north_west'
                    {
                    enumLiteral_6=(Token)match(input,71,FOLLOW_71_in_ruleDirections4203); 

                            current = grammarAccess.getDirectionsAccess().getNORTH_WESTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDirectionsAccess().getNORTH_WESTEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1769:6: (enumLiteral_7= 'south_east' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1769:6: (enumLiteral_7= 'south_east' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1769:8: enumLiteral_7= 'south_east'
                    {
                    enumLiteral_7=(Token)match(input,72,FOLLOW_72_in_ruleDirections4220); 

                            current = grammarAccess.getDirectionsAccess().getSOUTH_EASTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getDirectionsAccess().getSOUTH_EASTEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1775:6: (enumLiteral_8= 'south_west' )
                    {
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1775:6: (enumLiteral_8= 'south_west' )
                    // ../org.modelversioning.emfprofile.decoration/src-gen/org/modelversioning/emfprofile/decoration/parser/antlr/internal/InternalEMFProfileDecorationLanguage.g:1775:8: enumLiteral_8= 'south_west'
                    {
                    enumLiteral_8=(Token)match(input,73,FOLLOW_73_in_ruleDirections4237); 

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


 

    public static final BitSet FOLLOW_ruleDecorationModel_in_entryRuleDecorationModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecorationModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleDecorationModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecorationModel139 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_13_in_ruleDecorationModel157 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_ruleNamespace_in_ruleDecorationModel181 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_13_in_ruleDecorationModel194 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleDecorationDescription_in_ruleDecorationModel219 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleNamespace303 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNamespace326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecorationDescription_in_entryRuleDecorationDescription362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecorationDescription372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDecorationDescription409 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDecorationDescription432 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDecorationDescription444 = new BitSet(new long[]{0x0000000000640000L});
    public static final BitSet FOLLOW_ruleAbstractDecoration_in_ruleDecorationDescription465 = new BitSet(new long[]{0x0000000400660000L});
    public static final BitSet FOLLOW_ruleActivation_in_ruleDecorationDescription487 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDecorationDescription500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDecoration_in_entryRuleAbstractDecoration536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDecoration546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIconDecoration_in_ruleAbstractDecoration593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderDecoration_in_ruleAbstractDecoration620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectionDecoration_in_ruleAbstractDecoration647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIconDecoration_in_entryRuleIconDecoration682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIconDecoration692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleIconDecoration729 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleIconDecoration741 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIconDecoration753 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIconDecoration765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIconDecoration782 = new BitSet(new long[]{0x0000000418022000L});
    public static final BitSet FOLLOW_13_in_ruleIconDecoration800 = new BitSet(new long[]{0x0000000418020000L});
    public static final BitSet FOLLOW_ruleDirection_in_ruleIconDecoration823 = new BitSet(new long[]{0x0000000410020000L});
    public static final BitSet FOLLOW_ruleMargin_in_ruleIconDecoration845 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_ruleActivation_in_ruleIconDecoration867 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIconDecoration880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderDecoration_in_entryRuleBorderDecoration916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorderDecoration926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBorderDecoration972 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleBorderDecoration985 = new BitSet(new long[]{0x0000000426020000L});
    public static final BitSet FOLLOW_ruleSize_in_ruleBorderDecoration1006 = new BitSet(new long[]{0x0000000422020000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleBorderDecoration1028 = new BitSet(new long[]{0x0000000402020000L});
    public static final BitSet FOLLOW_ruleStyle_in_ruleBorderDecoration1050 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_ruleActivation_in_ruleBorderDecoration1072 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBorderDecoration1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectionDecoration_in_entryRuleConnectionDecoration1123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnectionDecoration1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleConnectionDecoration1179 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleConnectionDecoration1192 = new BitSet(new long[]{0x0000000425820000L});
    public static final BitSet FOLLOW_ruleSize_in_ruleConnectionDecoration1213 = new BitSet(new long[]{0x0000000421820000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleConnectionDecoration1235 = new BitSet(new long[]{0x0000000401820000L});
    public static final BitSet FOLLOW_23_in_ruleConnectionDecoration1249 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleConnectionDecoration1270 = new BitSet(new long[]{0x0000000401020000L});
    public static final BitSet FOLLOW_24_in_ruleConnectionDecoration1285 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleConnectionDecoration1306 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_ruleActivation_in_ruleConnectionDecoration1329 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleConnectionDecoration1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyle_in_entryRuleStyle1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyle1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleStyle1427 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStyle1439 = new BitSet(new long[]{0x0003E00000000000L});
    public static final BitSet FOLLOW_ruleLineStyle_in_ruleStyle1460 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleStyle1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_entryRuleSize1511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSize1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSize1558 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSize1570 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSize1587 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleSize1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_entryRuleDirection1643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirection1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDirection1690 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDirection1702 = new BitSet(new long[]{0x0000000000000000L,0x00000000000003FEL});
    public static final BitSet FOLLOW_ruleDirections_in_ruleDirection1723 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleDirection1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMargin_in_entryRuleMargin1774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMargin1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleMargin1821 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMargin1833 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_ruleSignedInteger_in_ruleMargin1854 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleMargin1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor1905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleColor1962 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleColor1974 = new BitSet(new long[]{0xFFFC000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleColorConstant_in_ruleColor1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleColor2015 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleColor2027 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleConcreteColor_in_ruleColor2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteColor_in_entryRuleConcreteColor2085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcreteColor2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleConcreteColor2132 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleConcreteColor2144 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConcreteColor2161 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleConcreteColor2178 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConcreteColor2195 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleConcreteColor2212 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConcreteColor2229 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleConcreteColor2246 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleConcreteColor2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorConstant_in_entryRuleColorConstant2297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorConstant2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColors_in_ruleColorConstant2353 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleColorConstant2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_entryRuleActivation2404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivation2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleActivation2451 = new BitSet(new long[]{0x0000180000000080L});
    public static final BitSet FOLLOW_ruleAbstractCondition_in_ruleActivation2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractCondition_in_entryRuleAbstractCondition2508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractCondition2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleAbstractCondition2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeCondition_in_ruleAbstractCondition2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition2627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCondition2685 = new BitSet(new long[]{0x000007E000000000L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleCondition2706 = new BitSet(new long[]{0x0000000800000070L});
    public static final BitSet FOLLOW_ruleType_in_ruleCondition2727 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleCondition2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition2778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeCondition2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOperator_in_ruleCompositeCondition2834 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleCompositeCondition2846 = new BitSet(new long[]{0x0000180000000080L});
    public static final BitSet FOLLOW_ruleAbstractCondition_in_ruleCompositeCondition2867 = new BitSet(new long[]{0x0000180200000080L});
    public static final BitSet FOLLOW_33_in_ruleCompositeCondition2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInteger_in_ruleType2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedDouble_in_ruleType3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleType3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleType3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedDouble_in_entryRuleSignedDouble3106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedDouble3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSignedDouble3156 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedDouble3173 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSignedDouble3191 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedDouble3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInteger_in_entryRuleSignedInteger3252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedInteger3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSignedInteger3302 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedInteger3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3418 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleQualifiedName3437 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3452 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_37_in_ruleComparisonOperator3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleComparisonOperator3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleComparisonOperator3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleComparisonOperator3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleComparisonOperator3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleComparisonOperator3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleLogicalOperator3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleLogicalOperator3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleLineStyle3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleLineStyle3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleLineStyle3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleLineStyle3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleLineStyle3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleColors3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleColors3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleColors3852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleColors3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleColors3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleColors3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleColors3920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleColors3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleColors3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleColors3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleColors3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleColors4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleColors4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleColors4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleColors4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDirections4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleDirections4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleDirections4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleDirections4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleDirections4169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleDirections4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleDirections4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleDirections4220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleDirections4237 = new BitSet(new long[]{0x0000000000000002L});

}