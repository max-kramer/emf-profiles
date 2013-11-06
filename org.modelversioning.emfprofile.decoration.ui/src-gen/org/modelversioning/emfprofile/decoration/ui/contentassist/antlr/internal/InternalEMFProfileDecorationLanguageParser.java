package org.modelversioning.emfprofile.decoration.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.modelversioning.emfprofile.decoration.services.EMFProfileDecorationLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEMFProfileDecorationLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'all'", "'any'", "'import resource'", "';'", "'profile'", "'decoration'", "'{'", "'}'", "'icon'", "'location-uri'", "':'", "'border'", "'size'", "'active when'", "'('", "')'", "'-'", "'.'"
    };
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_ID=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalEMFProfileDecorationLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEMFProfileDecorationLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEMFProfileDecorationLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g"; }


     
     	private EMFProfileDecorationLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EMFProfileDecorationLanguageGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleDecorationModel"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:60:1: entryRuleDecorationModel : ruleDecorationModel EOF ;
    public final void entryRuleDecorationModel() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:61:1: ( ruleDecorationModel EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:62:1: ruleDecorationModel EOF
            {
             before(grammarAccess.getDecorationModelRule()); 
            pushFollow(FOLLOW_ruleDecorationModel_in_entryRuleDecorationModel61);
            ruleDecorationModel();

            state._fsp--;

             after(grammarAccess.getDecorationModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecorationModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecorationModel"


    // $ANTLR start "ruleDecorationModel"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:69:1: ruleDecorationModel : ( ( rule__DecorationModel__Group__0 ) ) ;
    public final void ruleDecorationModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:73:2: ( ( ( rule__DecorationModel__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:74:1: ( ( rule__DecorationModel__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:74:1: ( ( rule__DecorationModel__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:75:1: ( rule__DecorationModel__Group__0 )
            {
             before(grammarAccess.getDecorationModelAccess().getGroup()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:76:1: ( rule__DecorationModel__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:76:2: rule__DecorationModel__Group__0
            {
            pushFollow(FOLLOW_rule__DecorationModel__Group__0_in_ruleDecorationModel94);
            rule__DecorationModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecorationModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecorationModel"


    // $ANTLR start "entryRuleNamespace"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:88:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:89:1: ( ruleNamespace EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:90:1: ruleNamespace EOF
            {
             before(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace121);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getNamespaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:97:1: ruleNamespace : ( ( rule__Namespace__Group__0 ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:101:2: ( ( ( rule__Namespace__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:102:1: ( ( rule__Namespace__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:102:1: ( ( rule__Namespace__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:103:1: ( rule__Namespace__Group__0 )
            {
             before(grammarAccess.getNamespaceAccess().getGroup()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:104:1: ( rule__Namespace__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:104:2: rule__Namespace__Group__0
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0_in_ruleNamespace154);
            rule__Namespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleDecorationDescription"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:116:1: entryRuleDecorationDescription : ruleDecorationDescription EOF ;
    public final void entryRuleDecorationDescription() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:117:1: ( ruleDecorationDescription EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:118:1: ruleDecorationDescription EOF
            {
             before(grammarAccess.getDecorationDescriptionRule()); 
            pushFollow(FOLLOW_ruleDecorationDescription_in_entryRuleDecorationDescription181);
            ruleDecorationDescription();

            state._fsp--;

             after(grammarAccess.getDecorationDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecorationDescription188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecorationDescription"


    // $ANTLR start "ruleDecorationDescription"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:125:1: ruleDecorationDescription : ( ( rule__DecorationDescription__Group__0 ) ) ;
    public final void ruleDecorationDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:129:2: ( ( ( rule__DecorationDescription__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:130:1: ( ( rule__DecorationDescription__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:130:1: ( ( rule__DecorationDescription__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:131:1: ( rule__DecorationDescription__Group__0 )
            {
             before(grammarAccess.getDecorationDescriptionAccess().getGroup()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:132:1: ( rule__DecorationDescription__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:132:2: rule__DecorationDescription__Group__0
            {
            pushFollow(FOLLOW_rule__DecorationDescription__Group__0_in_ruleDecorationDescription214);
            rule__DecorationDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecorationDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecorationDescription"


    // $ANTLR start "entryRuleDecoration"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:144:1: entryRuleDecoration : ruleDecoration EOF ;
    public final void entryRuleDecoration() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:145:1: ( ruleDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:146:1: ruleDecoration EOF
            {
             before(grammarAccess.getDecorationRule()); 
            pushFollow(FOLLOW_ruleDecoration_in_entryRuleDecoration241);
            ruleDecoration();

            state._fsp--;

             after(grammarAccess.getDecorationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecoration248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecoration"


    // $ANTLR start "ruleDecoration"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:153:1: ruleDecoration : ( ( rule__Decoration__Alternatives ) ) ;
    public final void ruleDecoration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:157:2: ( ( ( rule__Decoration__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:158:1: ( ( rule__Decoration__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:158:1: ( ( rule__Decoration__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:159:1: ( rule__Decoration__Alternatives )
            {
             before(grammarAccess.getDecorationAccess().getAlternatives()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:160:1: ( rule__Decoration__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:160:2: rule__Decoration__Alternatives
            {
            pushFollow(FOLLOW_rule__Decoration__Alternatives_in_ruleDecoration274);
            rule__Decoration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDecorationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecoration"


    // $ANTLR start "entryRuleIconDecoration"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:172:1: entryRuleIconDecoration : ruleIconDecoration EOF ;
    public final void entryRuleIconDecoration() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:173:1: ( ruleIconDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:174:1: ruleIconDecoration EOF
            {
             before(grammarAccess.getIconDecorationRule()); 
            pushFollow(FOLLOW_ruleIconDecoration_in_entryRuleIconDecoration301);
            ruleIconDecoration();

            state._fsp--;

             after(grammarAccess.getIconDecorationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIconDecoration308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIconDecoration"


    // $ANTLR start "ruleIconDecoration"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:181:1: ruleIconDecoration : ( ( rule__IconDecoration__Group__0 ) ) ;
    public final void ruleIconDecoration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:185:2: ( ( ( rule__IconDecoration__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:186:1: ( ( rule__IconDecoration__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:186:1: ( ( rule__IconDecoration__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:187:1: ( rule__IconDecoration__Group__0 )
            {
             before(grammarAccess.getIconDecorationAccess().getGroup()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:188:1: ( rule__IconDecoration__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:188:2: rule__IconDecoration__Group__0
            {
            pushFollow(FOLLOW_rule__IconDecoration__Group__0_in_ruleIconDecoration334);
            rule__IconDecoration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIconDecorationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIconDecoration"


    // $ANTLR start "entryRuleBorderDecoration"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:200:1: entryRuleBorderDecoration : ruleBorderDecoration EOF ;
    public final void entryRuleBorderDecoration() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:201:1: ( ruleBorderDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:202:1: ruleBorderDecoration EOF
            {
             before(grammarAccess.getBorderDecorationRule()); 
            pushFollow(FOLLOW_ruleBorderDecoration_in_entryRuleBorderDecoration361);
            ruleBorderDecoration();

            state._fsp--;

             after(grammarAccess.getBorderDecorationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorderDecoration368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBorderDecoration"


    // $ANTLR start "ruleBorderDecoration"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:209:1: ruleBorderDecoration : ( ( rule__BorderDecoration__Group__0 ) ) ;
    public final void ruleBorderDecoration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:213:2: ( ( ( rule__BorderDecoration__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:214:1: ( ( rule__BorderDecoration__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:214:1: ( ( rule__BorderDecoration__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:215:1: ( rule__BorderDecoration__Group__0 )
            {
             before(grammarAccess.getBorderDecorationAccess().getGroup()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:216:1: ( rule__BorderDecoration__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:216:2: rule__BorderDecoration__Group__0
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__0_in_ruleBorderDecoration394);
            rule__BorderDecoration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBorderDecorationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBorderDecoration"


    // $ANTLR start "entryRuleActivation"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:228:1: entryRuleActivation : ruleActivation EOF ;
    public final void entryRuleActivation() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:229:1: ( ruleActivation EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:230:1: ruleActivation EOF
            {
             before(grammarAccess.getActivationRule()); 
            pushFollow(FOLLOW_ruleActivation_in_entryRuleActivation421);
            ruleActivation();

            state._fsp--;

             after(grammarAccess.getActivationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivation428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActivation"


    // $ANTLR start "ruleActivation"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:237:1: ruleActivation : ( ( rule__Activation__Group__0 ) ) ;
    public final void ruleActivation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:241:2: ( ( ( rule__Activation__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:242:1: ( ( rule__Activation__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:242:1: ( ( rule__Activation__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:243:1: ( rule__Activation__Group__0 )
            {
             before(grammarAccess.getActivationAccess().getGroup()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:244:1: ( rule__Activation__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:244:2: rule__Activation__Group__0
            {
            pushFollow(FOLLOW_rule__Activation__Group__0_in_ruleActivation454);
            rule__Activation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivation"


    // $ANTLR start "entryRuleAbstractCondition"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:256:1: entryRuleAbstractCondition : ruleAbstractCondition EOF ;
    public final void entryRuleAbstractCondition() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:257:1: ( ruleAbstractCondition EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:258:1: ruleAbstractCondition EOF
            {
             before(grammarAccess.getAbstractConditionRule()); 
            pushFollow(FOLLOW_ruleAbstractCondition_in_entryRuleAbstractCondition481);
            ruleAbstractCondition();

            state._fsp--;

             after(grammarAccess.getAbstractConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractCondition488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractCondition"


    // $ANTLR start "ruleAbstractCondition"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:265:1: ruleAbstractCondition : ( ( rule__AbstractCondition__Alternatives ) ) ;
    public final void ruleAbstractCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:269:2: ( ( ( rule__AbstractCondition__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:270:1: ( ( rule__AbstractCondition__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:270:1: ( ( rule__AbstractCondition__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:271:1: ( rule__AbstractCondition__Alternatives )
            {
             before(grammarAccess.getAbstractConditionAccess().getAlternatives()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:272:1: ( rule__AbstractCondition__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:272:2: rule__AbstractCondition__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractCondition__Alternatives_in_ruleAbstractCondition514);
            rule__AbstractCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractCondition"


    // $ANTLR start "entryRuleCondition"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:284:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:285:1: ( ruleCondition EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:286:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition541);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:293:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:297:2: ( ( ( rule__Condition__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:298:1: ( ( rule__Condition__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:298:1: ( ( rule__Condition__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:299:1: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:300:1: ( rule__Condition__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:300:2: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_rule__Condition__Group__0_in_ruleCondition574);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleCompositeCondition"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:312:1: entryRuleCompositeCondition : ruleCompositeCondition EOF ;
    public final void entryRuleCompositeCondition() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:313:1: ( ruleCompositeCondition EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:314:1: ruleCompositeCondition EOF
            {
             before(grammarAccess.getCompositeConditionRule()); 
            pushFollow(FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition601);
            ruleCompositeCondition();

            state._fsp--;

             after(grammarAccess.getCompositeConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeCondition608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositeCondition"


    // $ANTLR start "ruleCompositeCondition"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:321:1: ruleCompositeCondition : ( ( rule__CompositeCondition__Group__0 ) ) ;
    public final void ruleCompositeCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:325:2: ( ( ( rule__CompositeCondition__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:326:1: ( ( rule__CompositeCondition__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:326:1: ( ( rule__CompositeCondition__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:327:1: ( rule__CompositeCondition__Group__0 )
            {
             before(grammarAccess.getCompositeConditionAccess().getGroup()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:328:1: ( rule__CompositeCondition__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:328:2: rule__CompositeCondition__Group__0
            {
            pushFollow(FOLLOW_rule__CompositeCondition__Group__0_in_ruleCompositeCondition634);
            rule__CompositeCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeCondition"


    // $ANTLR start "entryRuleType"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:340:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:341:1: ( ruleType EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:342:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType661);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:349:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:353:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:354:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:354:1: ( ( rule__Type__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:355:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:356:1: ( rule__Type__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:356:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType694);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePosiblySignedDouble"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:368:1: entryRulePosiblySignedDouble : rulePosiblySignedDouble EOF ;
    public final void entryRulePosiblySignedDouble() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:369:1: ( rulePosiblySignedDouble EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:370:1: rulePosiblySignedDouble EOF
            {
             before(grammarAccess.getPosiblySignedDoubleRule()); 
            pushFollow(FOLLOW_rulePosiblySignedDouble_in_entryRulePosiblySignedDouble721);
            rulePosiblySignedDouble();

            state._fsp--;

             after(grammarAccess.getPosiblySignedDoubleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePosiblySignedDouble728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePosiblySignedDouble"


    // $ANTLR start "rulePosiblySignedDouble"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:377:1: rulePosiblySignedDouble : ( ( rule__PosiblySignedDouble__Group__0 ) ) ;
    public final void rulePosiblySignedDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:381:2: ( ( ( rule__PosiblySignedDouble__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:382:1: ( ( rule__PosiblySignedDouble__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:382:1: ( ( rule__PosiblySignedDouble__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:383:1: ( rule__PosiblySignedDouble__Group__0 )
            {
             before(grammarAccess.getPosiblySignedDoubleAccess().getGroup()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:384:1: ( rule__PosiblySignedDouble__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:384:2: rule__PosiblySignedDouble__Group__0
            {
            pushFollow(FOLLOW_rule__PosiblySignedDouble__Group__0_in_rulePosiblySignedDouble754);
            rule__PosiblySignedDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPosiblySignedDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePosiblySignedDouble"


    // $ANTLR start "entryRulePossiblySignedInteger"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:396:1: entryRulePossiblySignedInteger : rulePossiblySignedInteger EOF ;
    public final void entryRulePossiblySignedInteger() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:397:1: ( rulePossiblySignedInteger EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:398:1: rulePossiblySignedInteger EOF
            {
             before(grammarAccess.getPossiblySignedIntegerRule()); 
            pushFollow(FOLLOW_rulePossiblySignedInteger_in_entryRulePossiblySignedInteger781);
            rulePossiblySignedInteger();

            state._fsp--;

             after(grammarAccess.getPossiblySignedIntegerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePossiblySignedInteger788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePossiblySignedInteger"


    // $ANTLR start "rulePossiblySignedInteger"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:405:1: rulePossiblySignedInteger : ( ( rule__PossiblySignedInteger__Group__0 ) ) ;
    public final void rulePossiblySignedInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:409:2: ( ( ( rule__PossiblySignedInteger__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:410:1: ( ( rule__PossiblySignedInteger__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:410:1: ( ( rule__PossiblySignedInteger__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:411:1: ( rule__PossiblySignedInteger__Group__0 )
            {
             before(grammarAccess.getPossiblySignedIntegerAccess().getGroup()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:412:1: ( rule__PossiblySignedInteger__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:412:2: rule__PossiblySignedInteger__Group__0
            {
            pushFollow(FOLLOW_rule__PossiblySignedInteger__Group__0_in_rulePossiblySignedInteger814);
            rule__PossiblySignedInteger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPossiblySignedIntegerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePossiblySignedInteger"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:426:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:427:1: ( ruleQualifiedName EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:428:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName843);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName850); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:435:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:439:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:440:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:440:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:441:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:442:1: ( rule__QualifiedName__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:442:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName876);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleComparisonOperator"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:455:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:459:1: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:460:1: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:460:1: ( ( rule__ComparisonOperator__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:461:1: ( rule__ComparisonOperator__Alternatives )
            {
             before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:462:1: ( rule__ComparisonOperator__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:462:2: rule__ComparisonOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__ComparisonOperator__Alternatives_in_ruleComparisonOperator913);
            rule__ComparisonOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "ruleLogicalOperator"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:474:1: ruleLogicalOperator : ( ( rule__LogicalOperator__Alternatives ) ) ;
    public final void ruleLogicalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:478:1: ( ( ( rule__LogicalOperator__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:479:1: ( ( rule__LogicalOperator__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:479:1: ( ( rule__LogicalOperator__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:480:1: ( rule__LogicalOperator__Alternatives )
            {
             before(grammarAccess.getLogicalOperatorAccess().getAlternatives()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:481:1: ( rule__LogicalOperator__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:481:2: rule__LogicalOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__LogicalOperator__Alternatives_in_ruleLogicalOperator949);
            rule__LogicalOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLogicalOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalOperator"


    // $ANTLR start "rule__Decoration__Alternatives"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:492:1: rule__Decoration__Alternatives : ( ( ruleIconDecoration ) | ( ruleBorderDecoration ) );
    public final void rule__Decoration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:496:1: ( ( ruleIconDecoration ) | ( ruleBorderDecoration ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==26) ) {
                alt1=1;
            }
            else if ( (LA1_0==29) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:497:1: ( ruleIconDecoration )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:497:1: ( ruleIconDecoration )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:498:1: ruleIconDecoration
                    {
                     before(grammarAccess.getDecorationAccess().getIconDecorationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIconDecoration_in_rule__Decoration__Alternatives984);
                    ruleIconDecoration();

                    state._fsp--;

                     after(grammarAccess.getDecorationAccess().getIconDecorationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:503:6: ( ruleBorderDecoration )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:503:6: ( ruleBorderDecoration )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:504:1: ruleBorderDecoration
                    {
                     before(grammarAccess.getDecorationAccess().getBorderDecorationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBorderDecoration_in_rule__Decoration__Alternatives1001);
                    ruleBorderDecoration();

                    state._fsp--;

                     after(grammarAccess.getDecorationAccess().getBorderDecorationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decoration__Alternatives"


    // $ANTLR start "rule__AbstractCondition__Alternatives"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:514:1: rule__AbstractCondition__Alternatives : ( ( ruleCondition ) | ( ruleCompositeCondition ) );
    public final void rule__AbstractCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:518:1: ( ( ruleCondition ) | ( ruleCompositeCondition ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=18 && LA2_0<=19)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:519:1: ( ruleCondition )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:519:1: ( ruleCondition )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:520:1: ruleCondition
                    {
                     before(grammarAccess.getAbstractConditionAccess().getConditionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCondition_in_rule__AbstractCondition__Alternatives1033);
                    ruleCondition();

                    state._fsp--;

                     after(grammarAccess.getAbstractConditionAccess().getConditionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:525:6: ( ruleCompositeCondition )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:525:6: ( ruleCompositeCondition )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:526:1: ruleCompositeCondition
                    {
                     before(grammarAccess.getAbstractConditionAccess().getCompositeConditionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCompositeCondition_in_rule__AbstractCondition__Alternatives1050);
                    ruleCompositeCondition();

                    state._fsp--;

                     after(grammarAccess.getAbstractConditionAccess().getCompositeConditionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractCondition__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:536:1: rule__Type__Alternatives : ( ( rulePossiblySignedInteger ) | ( rulePosiblySignedDouble ) | ( RULE_STRING ) | ( RULE_BOOLEAN ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:540:1: ( ( rulePossiblySignedInteger ) | ( rulePosiblySignedDouble ) | ( RULE_STRING ) | ( RULE_BOOLEAN ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_INT) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==EOF||LA3_2==RULE_ID||(LA3_2>=18 && LA3_2<=19)||LA3_2==21||LA3_2==25||LA3_2==33) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==35) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==EOF||LA3_2==RULE_ID||(LA3_2>=18 && LA3_2<=19)||LA3_2==21||LA3_2==25||LA3_2==33) ) {
                    alt3=1;
                }
                else if ( (LA3_2==35) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt3=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:541:1: ( rulePossiblySignedInteger )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:541:1: ( rulePossiblySignedInteger )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:542:1: rulePossiblySignedInteger
                    {
                     before(grammarAccess.getTypeAccess().getPossiblySignedIntegerParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePossiblySignedInteger_in_rule__Type__Alternatives1082);
                    rulePossiblySignedInteger();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getPossiblySignedIntegerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:547:6: ( rulePosiblySignedDouble )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:547:6: ( rulePosiblySignedDouble )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:548:1: rulePosiblySignedDouble
                    {
                     before(grammarAccess.getTypeAccess().getPosiblySignedDoubleParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePosiblySignedDouble_in_rule__Type__Alternatives1099);
                    rulePosiblySignedDouble();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getPosiblySignedDoubleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:553:6: ( RULE_STRING )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:553:6: ( RULE_STRING )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:554:1: RULE_STRING
                    {
                     before(grammarAccess.getTypeAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Type__Alternatives1116); 
                     after(grammarAccess.getTypeAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:559:6: ( RULE_BOOLEAN )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:559:6: ( RULE_BOOLEAN )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:560:1: RULE_BOOLEAN
                    {
                     before(grammarAccess.getTypeAccess().getBOOLEANTerminalRuleCall_3()); 
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__Type__Alternatives1133); 
                     after(grammarAccess.getTypeAccess().getBOOLEANTerminalRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__ComparisonOperator__Alternatives"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:570:1: rule__ComparisonOperator__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:574:1: ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 15:
                {
                alt4=4;
                }
                break;
            case 16:
                {
                alt4=5;
                }
                break;
            case 17:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:575:1: ( ( '==' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:575:1: ( ( '==' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:576:1: ( '==' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:577:1: ( '==' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:577:3: '=='
                    {
                    match(input,12,FOLLOW_12_in_rule__ComparisonOperator__Alternatives1166); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:582:6: ( ( '!=' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:582:6: ( ( '!=' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:583:1: ( '!=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getUNEQUALEnumLiteralDeclaration_1()); 
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:584:1: ( '!=' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:584:3: '!='
                    {
                    match(input,13,FOLLOW_13_in_rule__ComparisonOperator__Alternatives1187); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getUNEQUALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:589:6: ( ( '>' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:589:6: ( ( '>' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:590:1: ( '>' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2()); 
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:591:1: ( '>' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:591:3: '>'
                    {
                    match(input,14,FOLLOW_14_in_rule__ComparisonOperator__Alternatives1208); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:596:6: ( ( '>=' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:596:6: ( ( '>=' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:597:1: ( '>=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGREATEROREQUALEnumLiteralDeclaration_3()); 
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:598:1: ( '>=' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:598:3: '>='
                    {
                    match(input,15,FOLLOW_15_in_rule__ComparisonOperator__Alternatives1229); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGREATEROREQUALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:603:6: ( ( '<' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:603:6: ( ( '<' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:604:1: ( '<' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLOWEREnumLiteralDeclaration_4()); 
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:605:1: ( '<' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:605:3: '<'
                    {
                    match(input,16,FOLLOW_16_in_rule__ComparisonOperator__Alternatives1250); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLOWEREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:610:6: ( ( '<=' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:610:6: ( ( '<=' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:611:1: ( '<=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLOWEROREQUALEnumLiteralDeclaration_5()); 
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:612:1: ( '<=' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:612:3: '<='
                    {
                    match(input,17,FOLLOW_17_in_rule__ComparisonOperator__Alternatives1271); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLOWEROREQUALEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Alternatives"


    // $ANTLR start "rule__LogicalOperator__Alternatives"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:622:1: rule__LogicalOperator__Alternatives : ( ( ( 'all' ) ) | ( ( 'any' ) ) );
    public final void rule__LogicalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:626:1: ( ( ( 'all' ) ) | ( ( 'any' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:627:1: ( ( 'all' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:627:1: ( ( 'all' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:628:1: ( 'all' )
                    {
                     before(grammarAccess.getLogicalOperatorAccess().getALLEnumLiteralDeclaration_0()); 
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:629:1: ( 'all' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:629:3: 'all'
                    {
                    match(input,18,FOLLOW_18_in_rule__LogicalOperator__Alternatives1307); 

                    }

                     after(grammarAccess.getLogicalOperatorAccess().getALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:634:6: ( ( 'any' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:634:6: ( ( 'any' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:635:1: ( 'any' )
                    {
                     before(grammarAccess.getLogicalOperatorAccess().getANYEnumLiteralDeclaration_1()); 
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:636:1: ( 'any' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:636:3: 'any'
                    {
                    match(input,19,FOLLOW_19_in_rule__LogicalOperator__Alternatives1328); 

                    }

                     after(grammarAccess.getLogicalOperatorAccess().getANYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOperator__Alternatives"


    // $ANTLR start "rule__DecorationModel__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:648:1: rule__DecorationModel__Group__0 : rule__DecorationModel__Group__0__Impl rule__DecorationModel__Group__1 ;
    public final void rule__DecorationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:652:1: ( rule__DecorationModel__Group__0__Impl rule__DecorationModel__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:653:2: rule__DecorationModel__Group__0__Impl rule__DecorationModel__Group__1
            {
            pushFollow(FOLLOW_rule__DecorationModel__Group__0__Impl_in_rule__DecorationModel__Group__01361);
            rule__DecorationModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecorationModel__Group__1_in_rule__DecorationModel__Group__01364);
            rule__DecorationModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationModel__Group__0"


    // $ANTLR start "rule__DecorationModel__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:660:1: rule__DecorationModel__Group__0__Impl : ( 'import resource' ) ;
    public final void rule__DecorationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:664:1: ( ( 'import resource' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:665:1: ( 'import resource' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:665:1: ( 'import resource' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:666:1: 'import resource'
            {
             before(grammarAccess.getDecorationModelAccess().getImportResourceKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__DecorationModel__Group__0__Impl1392); 
             after(grammarAccess.getDecorationModelAccess().getImportResourceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationModel__Group__0__Impl"


    // $ANTLR start "rule__DecorationModel__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:679:1: rule__DecorationModel__Group__1 : rule__DecorationModel__Group__1__Impl rule__DecorationModel__Group__2 ;
    public final void rule__DecorationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:683:1: ( rule__DecorationModel__Group__1__Impl rule__DecorationModel__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:684:2: rule__DecorationModel__Group__1__Impl rule__DecorationModel__Group__2
            {
            pushFollow(FOLLOW_rule__DecorationModel__Group__1__Impl_in_rule__DecorationModel__Group__11423);
            rule__DecorationModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecorationModel__Group__2_in_rule__DecorationModel__Group__11426);
            rule__DecorationModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationModel__Group__1"


    // $ANTLR start "rule__DecorationModel__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:691:1: rule__DecorationModel__Group__1__Impl : ( ( rule__DecorationModel__ImportURIAssignment_1 ) ) ;
    public final void rule__DecorationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:695:1: ( ( ( rule__DecorationModel__ImportURIAssignment_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:696:1: ( ( rule__DecorationModel__ImportURIAssignment_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:696:1: ( ( rule__DecorationModel__ImportURIAssignment_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:697:1: ( rule__DecorationModel__ImportURIAssignment_1 )
            {
             before(grammarAccess.getDecorationModelAccess().getImportURIAssignment_1()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:698:1: ( rule__DecorationModel__ImportURIAssignment_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:698:2: rule__DecorationModel__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__DecorationModel__ImportURIAssignment_1_in_rule__DecorationModel__Group__1__Impl1453);
            rule__DecorationModel__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDecorationModelAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationModel__Group__1__Impl"


    // $ANTLR start "rule__DecorationModel__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:708:1: rule__DecorationModel__Group__2 : rule__DecorationModel__Group__2__Impl rule__DecorationModel__Group__3 ;
    public final void rule__DecorationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:712:1: ( rule__DecorationModel__Group__2__Impl rule__DecorationModel__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:713:2: rule__DecorationModel__Group__2__Impl rule__DecorationModel__Group__3
            {
            pushFollow(FOLLOW_rule__DecorationModel__Group__2__Impl_in_rule__DecorationModel__Group__21483);
            rule__DecorationModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecorationModel__Group__3_in_rule__DecorationModel__Group__21486);
            rule__DecorationModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationModel__Group__2"


    // $ANTLR start "rule__DecorationModel__Group__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:720:1: rule__DecorationModel__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__DecorationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:724:1: ( ( ( ';' )? ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:725:1: ( ( ';' )? )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:725:1: ( ( ';' )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:726:1: ( ';' )?
            {
             before(grammarAccess.getDecorationModelAccess().getSemicolonKeyword_2()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:727:1: ( ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:728:2: ';'
                    {
                    match(input,21,FOLLOW_21_in_rule__DecorationModel__Group__2__Impl1515); 

                    }
                    break;

            }

             after(grammarAccess.getDecorationModelAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationModel__Group__2__Impl"


    // $ANTLR start "rule__DecorationModel__Group__3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:739:1: rule__DecorationModel__Group__3 : rule__DecorationModel__Group__3__Impl rule__DecorationModel__Group__4 ;
    public final void rule__DecorationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:743:1: ( rule__DecorationModel__Group__3__Impl rule__DecorationModel__Group__4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:744:2: rule__DecorationModel__Group__3__Impl rule__DecorationModel__Group__4
            {
            pushFollow(FOLLOW_rule__DecorationModel__Group__3__Impl_in_rule__DecorationModel__Group__31548);
            rule__DecorationModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecorationModel__Group__4_in_rule__DecorationModel__Group__31551);
            rule__DecorationModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationModel__Group__3"


    // $ANTLR start "rule__DecorationModel__Group__3__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:751:1: rule__DecorationModel__Group__3__Impl : ( ( rule__DecorationModel__Group_3__0 )? ) ;
    public final void rule__DecorationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:755:1: ( ( ( rule__DecorationModel__Group_3__0 )? ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:756:1: ( ( rule__DecorationModel__Group_3__0 )? )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:756:1: ( ( rule__DecorationModel__Group_3__0 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:757:1: ( rule__DecorationModel__Group_3__0 )?
            {
             before(grammarAccess.getDecorationModelAccess().getGroup_3()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:758:1: ( rule__DecorationModel__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:758:2: rule__DecorationModel__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DecorationModel__Group_3__0_in_rule__DecorationModel__Group__3__Impl1578);
                    rule__DecorationModel__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecorationModelAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationModel__Group__3__Impl"


    // $ANTLR start "rule__DecorationModel__Group__4"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:768:1: rule__DecorationModel__Group__4 : rule__DecorationModel__Group__4__Impl ;
    public final void rule__DecorationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:772:1: ( rule__DecorationModel__Group__4__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:773:2: rule__DecorationModel__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DecorationModel__Group__4__Impl_in_rule__DecorationModel__Group__41609);
            rule__DecorationModel__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationModel__Group__4"


    // $ANTLR start "rule__DecorationModel__Group__4__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:779:1: rule__DecorationModel__Group__4__Impl : ( ( rule__DecorationModel__DecorationDescriptionsAssignment_4 )* ) ;
    public final void rule__DecorationModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:783:1: ( ( ( rule__DecorationModel__DecorationDescriptionsAssignment_4 )* ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:784:1: ( ( rule__DecorationModel__DecorationDescriptionsAssignment_4 )* )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:784:1: ( ( rule__DecorationModel__DecorationDescriptionsAssignment_4 )* )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:785:1: ( rule__DecorationModel__DecorationDescriptionsAssignment_4 )*
            {
             before(grammarAccess.getDecorationModelAccess().getDecorationDescriptionsAssignment_4()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:786:1: ( rule__DecorationModel__DecorationDescriptionsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:786:2: rule__DecorationModel__DecorationDescriptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__DecorationModel__DecorationDescriptionsAssignment_4_in_rule__DecorationModel__Group__4__Impl1636);
            	    rule__DecorationModel__DecorationDescriptionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDecorationModelAccess().getDecorationDescriptionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationModel__Group__4__Impl"


    // $ANTLR start "rule__DecorationModel__Group_3__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:806:1: rule__DecorationModel__Group_3__0 : rule__DecorationModel__Group_3__0__Impl rule__DecorationModel__Group_3__1 ;
    public final void rule__DecorationModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:810:1: ( rule__DecorationModel__Group_3__0__Impl rule__DecorationModel__Group_3__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:811:2: rule__DecorationModel__Group_3__0__Impl rule__DecorationModel__Group_3__1
            {
            pushFollow(FOLLOW_rule__DecorationModel__Group_3__0__Impl_in_rule__DecorationModel__Group_3__01677);
            rule__DecorationModel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecorationModel__Group_3__1_in_rule__DecorationModel__Group_3__01680);
            rule__DecorationModel__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationModel__Group_3__0"


    // $ANTLR start "rule__DecorationModel__Group_3__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:818:1: rule__DecorationModel__Group_3__0__Impl : ( ( rule__DecorationModel__NamespaceAssignment_3_0 ) ) ;
    public final void rule__DecorationModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:822:1: ( ( ( rule__DecorationModel__NamespaceAssignment_3_0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:823:1: ( ( rule__DecorationModel__NamespaceAssignment_3_0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:823:1: ( ( rule__DecorationModel__NamespaceAssignment_3_0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:824:1: ( rule__DecorationModel__NamespaceAssignment_3_0 )
            {
             before(grammarAccess.getDecorationModelAccess().getNamespaceAssignment_3_0()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:825:1: ( rule__DecorationModel__NamespaceAssignment_3_0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:825:2: rule__DecorationModel__NamespaceAssignment_3_0
            {
            pushFollow(FOLLOW_rule__DecorationModel__NamespaceAssignment_3_0_in_rule__DecorationModel__Group_3__0__Impl1707);
            rule__DecorationModel__NamespaceAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getDecorationModelAccess().getNamespaceAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationModel__Group_3__0__Impl"


    // $ANTLR start "rule__DecorationModel__Group_3__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:835:1: rule__DecorationModel__Group_3__1 : rule__DecorationModel__Group_3__1__Impl ;
    public final void rule__DecorationModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:839:1: ( rule__DecorationModel__Group_3__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:840:2: rule__DecorationModel__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__DecorationModel__Group_3__1__Impl_in_rule__DecorationModel__Group_3__11737);
            rule__DecorationModel__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationModel__Group_3__1"


    // $ANTLR start "rule__DecorationModel__Group_3__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:846:1: rule__DecorationModel__Group_3__1__Impl : ( ( ';' )? ) ;
    public final void rule__DecorationModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:850:1: ( ( ( ';' )? ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:851:1: ( ( ';' )? )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:851:1: ( ( ';' )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:852:1: ( ';' )?
            {
             before(grammarAccess.getDecorationModelAccess().getSemicolonKeyword_3_1()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:853:1: ( ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:854:2: ';'
                    {
                    match(input,21,FOLLOW_21_in_rule__DecorationModel__Group_3__1__Impl1766); 

                    }
                    break;

            }

             after(grammarAccess.getDecorationModelAccess().getSemicolonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationModel__Group_3__1__Impl"


    // $ANTLR start "rule__Namespace__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:869:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:873:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:874:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__01803);
            rule__Namespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__01806);
            rule__Namespace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0"


    // $ANTLR start "rule__Namespace__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:881:1: rule__Namespace__Group__0__Impl : ( 'profile' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:885:1: ( ( 'profile' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:886:1: ( 'profile' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:886:1: ( 'profile' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:887:1: 'profile'
            {
             before(grammarAccess.getNamespaceAccess().getProfileKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Namespace__Group__0__Impl1834); 
             after(grammarAccess.getNamespaceAccess().getProfileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0__Impl"


    // $ANTLR start "rule__Namespace__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:900:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:904:1: ( rule__Namespace__Group__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:905:2: rule__Namespace__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__11865);
            rule__Namespace__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1"


    // $ANTLR start "rule__Namespace__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:911:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__ProfileAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:915:1: ( ( ( rule__Namespace__ProfileAssignment_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:916:1: ( ( rule__Namespace__ProfileAssignment_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:916:1: ( ( rule__Namespace__ProfileAssignment_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:917:1: ( rule__Namespace__ProfileAssignment_1 )
            {
             before(grammarAccess.getNamespaceAccess().getProfileAssignment_1()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:918:1: ( rule__Namespace__ProfileAssignment_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:918:2: rule__Namespace__ProfileAssignment_1
            {
            pushFollow(FOLLOW_rule__Namespace__ProfileAssignment_1_in_rule__Namespace__Group__1__Impl1892);
            rule__Namespace__ProfileAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getProfileAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1__Impl"


    // $ANTLR start "rule__DecorationDescription__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:932:1: rule__DecorationDescription__Group__0 : rule__DecorationDescription__Group__0__Impl rule__DecorationDescription__Group__1 ;
    public final void rule__DecorationDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:936:1: ( rule__DecorationDescription__Group__0__Impl rule__DecorationDescription__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:937:2: rule__DecorationDescription__Group__0__Impl rule__DecorationDescription__Group__1
            {
            pushFollow(FOLLOW_rule__DecorationDescription__Group__0__Impl_in_rule__DecorationDescription__Group__01926);
            rule__DecorationDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecorationDescription__Group__1_in_rule__DecorationDescription__Group__01929);
            rule__DecorationDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationDescription__Group__0"


    // $ANTLR start "rule__DecorationDescription__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:944:1: rule__DecorationDescription__Group__0__Impl : ( 'decoration' ) ;
    public final void rule__DecorationDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:948:1: ( ( 'decoration' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:949:1: ( 'decoration' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:949:1: ( 'decoration' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:950:1: 'decoration'
            {
             before(grammarAccess.getDecorationDescriptionAccess().getDecorationKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__DecorationDescription__Group__0__Impl1957); 
             after(grammarAccess.getDecorationDescriptionAccess().getDecorationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationDescription__Group__0__Impl"


    // $ANTLR start "rule__DecorationDescription__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:963:1: rule__DecorationDescription__Group__1 : rule__DecorationDescription__Group__1__Impl rule__DecorationDescription__Group__2 ;
    public final void rule__DecorationDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:967:1: ( rule__DecorationDescription__Group__1__Impl rule__DecorationDescription__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:968:2: rule__DecorationDescription__Group__1__Impl rule__DecorationDescription__Group__2
            {
            pushFollow(FOLLOW_rule__DecorationDescription__Group__1__Impl_in_rule__DecorationDescription__Group__11988);
            rule__DecorationDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecorationDescription__Group__2_in_rule__DecorationDescription__Group__11991);
            rule__DecorationDescription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationDescription__Group__1"


    // $ANTLR start "rule__DecorationDescription__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:975:1: rule__DecorationDescription__Group__1__Impl : ( ( rule__DecorationDescription__StereotypeAssignment_1 ) ) ;
    public final void rule__DecorationDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:979:1: ( ( ( rule__DecorationDescription__StereotypeAssignment_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:980:1: ( ( rule__DecorationDescription__StereotypeAssignment_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:980:1: ( ( rule__DecorationDescription__StereotypeAssignment_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:981:1: ( rule__DecorationDescription__StereotypeAssignment_1 )
            {
             before(grammarAccess.getDecorationDescriptionAccess().getStereotypeAssignment_1()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:982:1: ( rule__DecorationDescription__StereotypeAssignment_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:982:2: rule__DecorationDescription__StereotypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DecorationDescription__StereotypeAssignment_1_in_rule__DecorationDescription__Group__1__Impl2018);
            rule__DecorationDescription__StereotypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDecorationDescriptionAccess().getStereotypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationDescription__Group__1__Impl"


    // $ANTLR start "rule__DecorationDescription__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:992:1: rule__DecorationDescription__Group__2 : rule__DecorationDescription__Group__2__Impl rule__DecorationDescription__Group__3 ;
    public final void rule__DecorationDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:996:1: ( rule__DecorationDescription__Group__2__Impl rule__DecorationDescription__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:997:2: rule__DecorationDescription__Group__2__Impl rule__DecorationDescription__Group__3
            {
            pushFollow(FOLLOW_rule__DecorationDescription__Group__2__Impl_in_rule__DecorationDescription__Group__22048);
            rule__DecorationDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecorationDescription__Group__3_in_rule__DecorationDescription__Group__22051);
            rule__DecorationDescription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationDescription__Group__2"


    // $ANTLR start "rule__DecorationDescription__Group__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1004:1: rule__DecorationDescription__Group__2__Impl : ( '{' ) ;
    public final void rule__DecorationDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1008:1: ( ( '{' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1009:1: ( '{' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1009:1: ( '{' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1010:1: '{'
            {
             before(grammarAccess.getDecorationDescriptionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__DecorationDescription__Group__2__Impl2079); 
             after(grammarAccess.getDecorationDescriptionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationDescription__Group__2__Impl"


    // $ANTLR start "rule__DecorationDescription__Group__3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1023:1: rule__DecorationDescription__Group__3 : rule__DecorationDescription__Group__3__Impl rule__DecorationDescription__Group__4 ;
    public final void rule__DecorationDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1027:1: ( rule__DecorationDescription__Group__3__Impl rule__DecorationDescription__Group__4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1028:2: rule__DecorationDescription__Group__3__Impl rule__DecorationDescription__Group__4
            {
            pushFollow(FOLLOW_rule__DecorationDescription__Group__3__Impl_in_rule__DecorationDescription__Group__32110);
            rule__DecorationDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecorationDescription__Group__4_in_rule__DecorationDescription__Group__32113);
            rule__DecorationDescription__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationDescription__Group__3"


    // $ANTLR start "rule__DecorationDescription__Group__3__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1035:1: rule__DecorationDescription__Group__3__Impl : ( ( ( rule__DecorationDescription__DecorationsAssignment_3 ) ) ( ( rule__DecorationDescription__DecorationsAssignment_3 )* ) ) ;
    public final void rule__DecorationDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1039:1: ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3 ) ) ( ( rule__DecorationDescription__DecorationsAssignment_3 )* ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1040:1: ( ( ( rule__DecorationDescription__DecorationsAssignment_3 ) ) ( ( rule__DecorationDescription__DecorationsAssignment_3 )* ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1040:1: ( ( ( rule__DecorationDescription__DecorationsAssignment_3 ) ) ( ( rule__DecorationDescription__DecorationsAssignment_3 )* ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1041:1: ( ( rule__DecorationDescription__DecorationsAssignment_3 ) ) ( ( rule__DecorationDescription__DecorationsAssignment_3 )* )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1041:1: ( ( rule__DecorationDescription__DecorationsAssignment_3 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1042:1: ( rule__DecorationDescription__DecorationsAssignment_3 )
            {
             before(grammarAccess.getDecorationDescriptionAccess().getDecorationsAssignment_3()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1043:1: ( rule__DecorationDescription__DecorationsAssignment_3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1043:2: rule__DecorationDescription__DecorationsAssignment_3
            {
            pushFollow(FOLLOW_rule__DecorationDescription__DecorationsAssignment_3_in_rule__DecorationDescription__Group__3__Impl2142);
            rule__DecorationDescription__DecorationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDecorationDescriptionAccess().getDecorationsAssignment_3()); 

            }

            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1046:1: ( ( rule__DecorationDescription__DecorationsAssignment_3 )* )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1047:1: ( rule__DecorationDescription__DecorationsAssignment_3 )*
            {
             before(grammarAccess.getDecorationDescriptionAccess().getDecorationsAssignment_3()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1048:1: ( rule__DecorationDescription__DecorationsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26||LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1048:2: rule__DecorationDescription__DecorationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__DecorationDescription__DecorationsAssignment_3_in_rule__DecorationDescription__Group__3__Impl2154);
            	    rule__DecorationDescription__DecorationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDecorationDescriptionAccess().getDecorationsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationDescription__Group__3__Impl"


    // $ANTLR start "rule__DecorationDescription__Group__4"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1059:1: rule__DecorationDescription__Group__4 : rule__DecorationDescription__Group__4__Impl rule__DecorationDescription__Group__5 ;
    public final void rule__DecorationDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1063:1: ( rule__DecorationDescription__Group__4__Impl rule__DecorationDescription__Group__5 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1064:2: rule__DecorationDescription__Group__4__Impl rule__DecorationDescription__Group__5
            {
            pushFollow(FOLLOW_rule__DecorationDescription__Group__4__Impl_in_rule__DecorationDescription__Group__42187);
            rule__DecorationDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecorationDescription__Group__5_in_rule__DecorationDescription__Group__42190);
            rule__DecorationDescription__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationDescription__Group__4"


    // $ANTLR start "rule__DecorationDescription__Group__4__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1071:1: rule__DecorationDescription__Group__4__Impl : ( ( rule__DecorationDescription__ActivationAssignment_4 )? ) ;
    public final void rule__DecorationDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1075:1: ( ( ( rule__DecorationDescription__ActivationAssignment_4 )? ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1076:1: ( ( rule__DecorationDescription__ActivationAssignment_4 )? )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1076:1: ( ( rule__DecorationDescription__ActivationAssignment_4 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1077:1: ( rule__DecorationDescription__ActivationAssignment_4 )?
            {
             before(grammarAccess.getDecorationDescriptionAccess().getActivationAssignment_4()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1078:1: ( rule__DecorationDescription__ActivationAssignment_4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1078:2: rule__DecorationDescription__ActivationAssignment_4
                    {
                    pushFollow(FOLLOW_rule__DecorationDescription__ActivationAssignment_4_in_rule__DecorationDescription__Group__4__Impl2217);
                    rule__DecorationDescription__ActivationAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecorationDescriptionAccess().getActivationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationDescription__Group__4__Impl"


    // $ANTLR start "rule__DecorationDescription__Group__5"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1088:1: rule__DecorationDescription__Group__5 : rule__DecorationDescription__Group__5__Impl ;
    public final void rule__DecorationDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1092:1: ( rule__DecorationDescription__Group__5__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1093:2: rule__DecorationDescription__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__DecorationDescription__Group__5__Impl_in_rule__DecorationDescription__Group__52248);
            rule__DecorationDescription__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationDescription__Group__5"


    // $ANTLR start "rule__DecorationDescription__Group__5__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1099:1: rule__DecorationDescription__Group__5__Impl : ( '}' ) ;
    public final void rule__DecorationDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1103:1: ( ( '}' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1104:1: ( '}' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1104:1: ( '}' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1105:1: '}'
            {
             before(grammarAccess.getDecorationDescriptionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__DecorationDescription__Group__5__Impl2276); 
             after(grammarAccess.getDecorationDescriptionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationDescription__Group__5__Impl"


    // $ANTLR start "rule__IconDecoration__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1130:1: rule__IconDecoration__Group__0 : rule__IconDecoration__Group__0__Impl rule__IconDecoration__Group__1 ;
    public final void rule__IconDecoration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1134:1: ( rule__IconDecoration__Group__0__Impl rule__IconDecoration__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1135:2: rule__IconDecoration__Group__0__Impl rule__IconDecoration__Group__1
            {
            pushFollow(FOLLOW_rule__IconDecoration__Group__0__Impl_in_rule__IconDecoration__Group__02319);
            rule__IconDecoration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IconDecoration__Group__1_in_rule__IconDecoration__Group__02322);
            rule__IconDecoration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconDecoration__Group__0"


    // $ANTLR start "rule__IconDecoration__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1142:1: rule__IconDecoration__Group__0__Impl : ( 'icon' ) ;
    public final void rule__IconDecoration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1146:1: ( ( 'icon' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1147:1: ( 'icon' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1147:1: ( 'icon' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1148:1: 'icon'
            {
             before(grammarAccess.getIconDecorationAccess().getIconKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__IconDecoration__Group__0__Impl2350); 
             after(grammarAccess.getIconDecorationAccess().getIconKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconDecoration__Group__0__Impl"


    // $ANTLR start "rule__IconDecoration__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1161:1: rule__IconDecoration__Group__1 : rule__IconDecoration__Group__1__Impl rule__IconDecoration__Group__2 ;
    public final void rule__IconDecoration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1165:1: ( rule__IconDecoration__Group__1__Impl rule__IconDecoration__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1166:2: rule__IconDecoration__Group__1__Impl rule__IconDecoration__Group__2
            {
            pushFollow(FOLLOW_rule__IconDecoration__Group__1__Impl_in_rule__IconDecoration__Group__12381);
            rule__IconDecoration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IconDecoration__Group__2_in_rule__IconDecoration__Group__12384);
            rule__IconDecoration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconDecoration__Group__1"


    // $ANTLR start "rule__IconDecoration__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1173:1: rule__IconDecoration__Group__1__Impl : ( '{' ) ;
    public final void rule__IconDecoration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1177:1: ( ( '{' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1178:1: ( '{' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1178:1: ( '{' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1179:1: '{'
            {
             before(grammarAccess.getIconDecorationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__IconDecoration__Group__1__Impl2412); 
             after(grammarAccess.getIconDecorationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconDecoration__Group__1__Impl"


    // $ANTLR start "rule__IconDecoration__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1192:1: rule__IconDecoration__Group__2 : rule__IconDecoration__Group__2__Impl rule__IconDecoration__Group__3 ;
    public final void rule__IconDecoration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1196:1: ( rule__IconDecoration__Group__2__Impl rule__IconDecoration__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1197:2: rule__IconDecoration__Group__2__Impl rule__IconDecoration__Group__3
            {
            pushFollow(FOLLOW_rule__IconDecoration__Group__2__Impl_in_rule__IconDecoration__Group__22443);
            rule__IconDecoration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IconDecoration__Group__3_in_rule__IconDecoration__Group__22446);
            rule__IconDecoration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconDecoration__Group__2"


    // $ANTLR start "rule__IconDecoration__Group__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1204:1: rule__IconDecoration__Group__2__Impl : ( 'location-uri' ) ;
    public final void rule__IconDecoration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1208:1: ( ( 'location-uri' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1209:1: ( 'location-uri' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1209:1: ( 'location-uri' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1210:1: 'location-uri'
            {
             before(grammarAccess.getIconDecorationAccess().getLocationUriKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__IconDecoration__Group__2__Impl2474); 
             after(grammarAccess.getIconDecorationAccess().getLocationUriKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconDecoration__Group__2__Impl"


    // $ANTLR start "rule__IconDecoration__Group__3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1223:1: rule__IconDecoration__Group__3 : rule__IconDecoration__Group__3__Impl rule__IconDecoration__Group__4 ;
    public final void rule__IconDecoration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1227:1: ( rule__IconDecoration__Group__3__Impl rule__IconDecoration__Group__4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1228:2: rule__IconDecoration__Group__3__Impl rule__IconDecoration__Group__4
            {
            pushFollow(FOLLOW_rule__IconDecoration__Group__3__Impl_in_rule__IconDecoration__Group__32505);
            rule__IconDecoration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IconDecoration__Group__4_in_rule__IconDecoration__Group__32508);
            rule__IconDecoration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconDecoration__Group__3"


    // $ANTLR start "rule__IconDecoration__Group__3__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1235:1: rule__IconDecoration__Group__3__Impl : ( ':' ) ;
    public final void rule__IconDecoration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1239:1: ( ( ':' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1240:1: ( ':' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1240:1: ( ':' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1241:1: ':'
            {
             before(grammarAccess.getIconDecorationAccess().getColonKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__IconDecoration__Group__3__Impl2536); 
             after(grammarAccess.getIconDecorationAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconDecoration__Group__3__Impl"


    // $ANTLR start "rule__IconDecoration__Group__4"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1254:1: rule__IconDecoration__Group__4 : rule__IconDecoration__Group__4__Impl rule__IconDecoration__Group__5 ;
    public final void rule__IconDecoration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1258:1: ( rule__IconDecoration__Group__4__Impl rule__IconDecoration__Group__5 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1259:2: rule__IconDecoration__Group__4__Impl rule__IconDecoration__Group__5
            {
            pushFollow(FOLLOW_rule__IconDecoration__Group__4__Impl_in_rule__IconDecoration__Group__42567);
            rule__IconDecoration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IconDecoration__Group__5_in_rule__IconDecoration__Group__42570);
            rule__IconDecoration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconDecoration__Group__4"


    // $ANTLR start "rule__IconDecoration__Group__4__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1266:1: rule__IconDecoration__Group__4__Impl : ( ( rule__IconDecoration__Location_uriAssignment_4 ) ) ;
    public final void rule__IconDecoration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1270:1: ( ( ( rule__IconDecoration__Location_uriAssignment_4 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1271:1: ( ( rule__IconDecoration__Location_uriAssignment_4 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1271:1: ( ( rule__IconDecoration__Location_uriAssignment_4 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1272:1: ( rule__IconDecoration__Location_uriAssignment_4 )
            {
             before(grammarAccess.getIconDecorationAccess().getLocation_uriAssignment_4()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1273:1: ( rule__IconDecoration__Location_uriAssignment_4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1273:2: rule__IconDecoration__Location_uriAssignment_4
            {
            pushFollow(FOLLOW_rule__IconDecoration__Location_uriAssignment_4_in_rule__IconDecoration__Group__4__Impl2597);
            rule__IconDecoration__Location_uriAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIconDecorationAccess().getLocation_uriAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconDecoration__Group__4__Impl"


    // $ANTLR start "rule__IconDecoration__Group__5"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1283:1: rule__IconDecoration__Group__5 : rule__IconDecoration__Group__5__Impl rule__IconDecoration__Group__6 ;
    public final void rule__IconDecoration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1287:1: ( rule__IconDecoration__Group__5__Impl rule__IconDecoration__Group__6 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1288:2: rule__IconDecoration__Group__5__Impl rule__IconDecoration__Group__6
            {
            pushFollow(FOLLOW_rule__IconDecoration__Group__5__Impl_in_rule__IconDecoration__Group__52627);
            rule__IconDecoration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IconDecoration__Group__6_in_rule__IconDecoration__Group__52630);
            rule__IconDecoration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconDecoration__Group__5"


    // $ANTLR start "rule__IconDecoration__Group__5__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1295:1: rule__IconDecoration__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__IconDecoration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1299:1: ( ( ( ';' )? ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1300:1: ( ( ';' )? )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1300:1: ( ( ';' )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1301:1: ( ';' )?
            {
             before(grammarAccess.getIconDecorationAccess().getSemicolonKeyword_5()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1302:1: ( ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1303:2: ';'
                    {
                    match(input,21,FOLLOW_21_in_rule__IconDecoration__Group__5__Impl2659); 

                    }
                    break;

            }

             after(grammarAccess.getIconDecorationAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconDecoration__Group__5__Impl"


    // $ANTLR start "rule__IconDecoration__Group__6"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1314:1: rule__IconDecoration__Group__6 : rule__IconDecoration__Group__6__Impl rule__IconDecoration__Group__7 ;
    public final void rule__IconDecoration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1318:1: ( rule__IconDecoration__Group__6__Impl rule__IconDecoration__Group__7 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1319:2: rule__IconDecoration__Group__6__Impl rule__IconDecoration__Group__7
            {
            pushFollow(FOLLOW_rule__IconDecoration__Group__6__Impl_in_rule__IconDecoration__Group__62692);
            rule__IconDecoration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IconDecoration__Group__7_in_rule__IconDecoration__Group__62695);
            rule__IconDecoration__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconDecoration__Group__6"


    // $ANTLR start "rule__IconDecoration__Group__6__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1326:1: rule__IconDecoration__Group__6__Impl : ( ( rule__IconDecoration__ActivationAssignment_6 )? ) ;
    public final void rule__IconDecoration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1330:1: ( ( ( rule__IconDecoration__ActivationAssignment_6 )? ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1331:1: ( ( rule__IconDecoration__ActivationAssignment_6 )? )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1331:1: ( ( rule__IconDecoration__ActivationAssignment_6 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1332:1: ( rule__IconDecoration__ActivationAssignment_6 )?
            {
             before(grammarAccess.getIconDecorationAccess().getActivationAssignment_6()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1333:1: ( rule__IconDecoration__ActivationAssignment_6 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1333:2: rule__IconDecoration__ActivationAssignment_6
                    {
                    pushFollow(FOLLOW_rule__IconDecoration__ActivationAssignment_6_in_rule__IconDecoration__Group__6__Impl2722);
                    rule__IconDecoration__ActivationAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIconDecorationAccess().getActivationAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconDecoration__Group__6__Impl"


    // $ANTLR start "rule__IconDecoration__Group__7"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1343:1: rule__IconDecoration__Group__7 : rule__IconDecoration__Group__7__Impl ;
    public final void rule__IconDecoration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1347:1: ( rule__IconDecoration__Group__7__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1348:2: rule__IconDecoration__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__IconDecoration__Group__7__Impl_in_rule__IconDecoration__Group__72753);
            rule__IconDecoration__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconDecoration__Group__7"


    // $ANTLR start "rule__IconDecoration__Group__7__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1354:1: rule__IconDecoration__Group__7__Impl : ( '}' ) ;
    public final void rule__IconDecoration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1358:1: ( ( '}' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1359:1: ( '}' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1359:1: ( '}' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1360:1: '}'
            {
             before(grammarAccess.getIconDecorationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_25_in_rule__IconDecoration__Group__7__Impl2781); 
             after(grammarAccess.getIconDecorationAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconDecoration__Group__7__Impl"


    // $ANTLR start "rule__BorderDecoration__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1389:1: rule__BorderDecoration__Group__0 : rule__BorderDecoration__Group__0__Impl rule__BorderDecoration__Group__1 ;
    public final void rule__BorderDecoration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1393:1: ( rule__BorderDecoration__Group__0__Impl rule__BorderDecoration__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1394:2: rule__BorderDecoration__Group__0__Impl rule__BorderDecoration__Group__1
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__0__Impl_in_rule__BorderDecoration__Group__02828);
            rule__BorderDecoration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BorderDecoration__Group__1_in_rule__BorderDecoration__Group__02831);
            rule__BorderDecoration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderDecoration__Group__0"


    // $ANTLR start "rule__BorderDecoration__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1401:1: rule__BorderDecoration__Group__0__Impl : ( 'border' ) ;
    public final void rule__BorderDecoration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1405:1: ( ( 'border' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1406:1: ( 'border' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1406:1: ( 'border' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1407:1: 'border'
            {
             before(grammarAccess.getBorderDecorationAccess().getBorderKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__BorderDecoration__Group__0__Impl2859); 
             after(grammarAccess.getBorderDecorationAccess().getBorderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderDecoration__Group__0__Impl"


    // $ANTLR start "rule__BorderDecoration__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1420:1: rule__BorderDecoration__Group__1 : rule__BorderDecoration__Group__1__Impl rule__BorderDecoration__Group__2 ;
    public final void rule__BorderDecoration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1424:1: ( rule__BorderDecoration__Group__1__Impl rule__BorderDecoration__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1425:2: rule__BorderDecoration__Group__1__Impl rule__BorderDecoration__Group__2
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__1__Impl_in_rule__BorderDecoration__Group__12890);
            rule__BorderDecoration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BorderDecoration__Group__2_in_rule__BorderDecoration__Group__12893);
            rule__BorderDecoration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderDecoration__Group__1"


    // $ANTLR start "rule__BorderDecoration__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1432:1: rule__BorderDecoration__Group__1__Impl : ( '{' ) ;
    public final void rule__BorderDecoration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1436:1: ( ( '{' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1437:1: ( '{' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1437:1: ( '{' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1438:1: '{'
            {
             before(grammarAccess.getBorderDecorationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__BorderDecoration__Group__1__Impl2921); 
             after(grammarAccess.getBorderDecorationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderDecoration__Group__1__Impl"


    // $ANTLR start "rule__BorderDecoration__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1451:1: rule__BorderDecoration__Group__2 : rule__BorderDecoration__Group__2__Impl rule__BorderDecoration__Group__3 ;
    public final void rule__BorderDecoration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1455:1: ( rule__BorderDecoration__Group__2__Impl rule__BorderDecoration__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1456:2: rule__BorderDecoration__Group__2__Impl rule__BorderDecoration__Group__3
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__2__Impl_in_rule__BorderDecoration__Group__22952);
            rule__BorderDecoration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BorderDecoration__Group__3_in_rule__BorderDecoration__Group__22955);
            rule__BorderDecoration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderDecoration__Group__2"


    // $ANTLR start "rule__BorderDecoration__Group__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1463:1: rule__BorderDecoration__Group__2__Impl : ( 'size' ) ;
    public final void rule__BorderDecoration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1467:1: ( ( 'size' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1468:1: ( 'size' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1468:1: ( 'size' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1469:1: 'size'
            {
             before(grammarAccess.getBorderDecorationAccess().getSizeKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__BorderDecoration__Group__2__Impl2983); 
             after(grammarAccess.getBorderDecorationAccess().getSizeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderDecoration__Group__2__Impl"


    // $ANTLR start "rule__BorderDecoration__Group__3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1482:1: rule__BorderDecoration__Group__3 : rule__BorderDecoration__Group__3__Impl rule__BorderDecoration__Group__4 ;
    public final void rule__BorderDecoration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1486:1: ( rule__BorderDecoration__Group__3__Impl rule__BorderDecoration__Group__4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1487:2: rule__BorderDecoration__Group__3__Impl rule__BorderDecoration__Group__4
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__3__Impl_in_rule__BorderDecoration__Group__33014);
            rule__BorderDecoration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BorderDecoration__Group__4_in_rule__BorderDecoration__Group__33017);
            rule__BorderDecoration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderDecoration__Group__3"


    // $ANTLR start "rule__BorderDecoration__Group__3__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1494:1: rule__BorderDecoration__Group__3__Impl : ( ':' ) ;
    public final void rule__BorderDecoration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1498:1: ( ( ':' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1499:1: ( ':' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1499:1: ( ':' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1500:1: ':'
            {
             before(grammarAccess.getBorderDecorationAccess().getColonKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__BorderDecoration__Group__3__Impl3045); 
             after(grammarAccess.getBorderDecorationAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderDecoration__Group__3__Impl"


    // $ANTLR start "rule__BorderDecoration__Group__4"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1513:1: rule__BorderDecoration__Group__4 : rule__BorderDecoration__Group__4__Impl rule__BorderDecoration__Group__5 ;
    public final void rule__BorderDecoration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1517:1: ( rule__BorderDecoration__Group__4__Impl rule__BorderDecoration__Group__5 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1518:2: rule__BorderDecoration__Group__4__Impl rule__BorderDecoration__Group__5
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__4__Impl_in_rule__BorderDecoration__Group__43076);
            rule__BorderDecoration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BorderDecoration__Group__5_in_rule__BorderDecoration__Group__43079);
            rule__BorderDecoration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderDecoration__Group__4"


    // $ANTLR start "rule__BorderDecoration__Group__4__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1525:1: rule__BorderDecoration__Group__4__Impl : ( ( rule__BorderDecoration__SizeAssignment_4 ) ) ;
    public final void rule__BorderDecoration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1529:1: ( ( ( rule__BorderDecoration__SizeAssignment_4 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1530:1: ( ( rule__BorderDecoration__SizeAssignment_4 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1530:1: ( ( rule__BorderDecoration__SizeAssignment_4 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1531:1: ( rule__BorderDecoration__SizeAssignment_4 )
            {
             before(grammarAccess.getBorderDecorationAccess().getSizeAssignment_4()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1532:1: ( rule__BorderDecoration__SizeAssignment_4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1532:2: rule__BorderDecoration__SizeAssignment_4
            {
            pushFollow(FOLLOW_rule__BorderDecoration__SizeAssignment_4_in_rule__BorderDecoration__Group__4__Impl3106);
            rule__BorderDecoration__SizeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBorderDecorationAccess().getSizeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderDecoration__Group__4__Impl"


    // $ANTLR start "rule__BorderDecoration__Group__5"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1542:1: rule__BorderDecoration__Group__5 : rule__BorderDecoration__Group__5__Impl rule__BorderDecoration__Group__6 ;
    public final void rule__BorderDecoration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1546:1: ( rule__BorderDecoration__Group__5__Impl rule__BorderDecoration__Group__6 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1547:2: rule__BorderDecoration__Group__5__Impl rule__BorderDecoration__Group__6
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__5__Impl_in_rule__BorderDecoration__Group__53136);
            rule__BorderDecoration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BorderDecoration__Group__6_in_rule__BorderDecoration__Group__53139);
            rule__BorderDecoration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderDecoration__Group__5"


    // $ANTLR start "rule__BorderDecoration__Group__5__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1554:1: rule__BorderDecoration__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__BorderDecoration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1558:1: ( ( ( ';' )? ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1559:1: ( ( ';' )? )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1559:1: ( ( ';' )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1560:1: ( ';' )?
            {
             before(grammarAccess.getBorderDecorationAccess().getSemicolonKeyword_5()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1561:1: ( ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1562:2: ';'
                    {
                    match(input,21,FOLLOW_21_in_rule__BorderDecoration__Group__5__Impl3168); 

                    }
                    break;

            }

             after(grammarAccess.getBorderDecorationAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderDecoration__Group__5__Impl"


    // $ANTLR start "rule__BorderDecoration__Group__6"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1573:1: rule__BorderDecoration__Group__6 : rule__BorderDecoration__Group__6__Impl rule__BorderDecoration__Group__7 ;
    public final void rule__BorderDecoration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1577:1: ( rule__BorderDecoration__Group__6__Impl rule__BorderDecoration__Group__7 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1578:2: rule__BorderDecoration__Group__6__Impl rule__BorderDecoration__Group__7
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__6__Impl_in_rule__BorderDecoration__Group__63201);
            rule__BorderDecoration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BorderDecoration__Group__7_in_rule__BorderDecoration__Group__63204);
            rule__BorderDecoration__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderDecoration__Group__6"


    // $ANTLR start "rule__BorderDecoration__Group__6__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1585:1: rule__BorderDecoration__Group__6__Impl : ( ( rule__BorderDecoration__ActivationAssignment_6 )? ) ;
    public final void rule__BorderDecoration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1589:1: ( ( ( rule__BorderDecoration__ActivationAssignment_6 )? ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1590:1: ( ( rule__BorderDecoration__ActivationAssignment_6 )? )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1590:1: ( ( rule__BorderDecoration__ActivationAssignment_6 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1591:1: ( rule__BorderDecoration__ActivationAssignment_6 )?
            {
             before(grammarAccess.getBorderDecorationAccess().getActivationAssignment_6()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1592:1: ( rule__BorderDecoration__ActivationAssignment_6 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1592:2: rule__BorderDecoration__ActivationAssignment_6
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__ActivationAssignment_6_in_rule__BorderDecoration__Group__6__Impl3231);
                    rule__BorderDecoration__ActivationAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBorderDecorationAccess().getActivationAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderDecoration__Group__6__Impl"


    // $ANTLR start "rule__BorderDecoration__Group__7"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1602:1: rule__BorderDecoration__Group__7 : rule__BorderDecoration__Group__7__Impl ;
    public final void rule__BorderDecoration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1606:1: ( rule__BorderDecoration__Group__7__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1607:2: rule__BorderDecoration__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__7__Impl_in_rule__BorderDecoration__Group__73262);
            rule__BorderDecoration__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderDecoration__Group__7"


    // $ANTLR start "rule__BorderDecoration__Group__7__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1613:1: rule__BorderDecoration__Group__7__Impl : ( '}' ) ;
    public final void rule__BorderDecoration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1617:1: ( ( '}' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1618:1: ( '}' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1618:1: ( '}' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1619:1: '}'
            {
             before(grammarAccess.getBorderDecorationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_25_in_rule__BorderDecoration__Group__7__Impl3290); 
             after(grammarAccess.getBorderDecorationAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderDecoration__Group__7__Impl"


    // $ANTLR start "rule__Activation__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1648:1: rule__Activation__Group__0 : rule__Activation__Group__0__Impl rule__Activation__Group__1 ;
    public final void rule__Activation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1652:1: ( rule__Activation__Group__0__Impl rule__Activation__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1653:2: rule__Activation__Group__0__Impl rule__Activation__Group__1
            {
            pushFollow(FOLLOW_rule__Activation__Group__0__Impl_in_rule__Activation__Group__03337);
            rule__Activation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activation__Group__1_in_rule__Activation__Group__03340);
            rule__Activation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activation__Group__0"


    // $ANTLR start "rule__Activation__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1660:1: rule__Activation__Group__0__Impl : ( 'active when' ) ;
    public final void rule__Activation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1664:1: ( ( 'active when' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1665:1: ( 'active when' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1665:1: ( 'active when' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1666:1: 'active when'
            {
             before(grammarAccess.getActivationAccess().getActiveWhenKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Activation__Group__0__Impl3368); 
             after(grammarAccess.getActivationAccess().getActiveWhenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activation__Group__0__Impl"


    // $ANTLR start "rule__Activation__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1679:1: rule__Activation__Group__1 : rule__Activation__Group__1__Impl ;
    public final void rule__Activation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1683:1: ( rule__Activation__Group__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1684:2: rule__Activation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Activation__Group__1__Impl_in_rule__Activation__Group__13399);
            rule__Activation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activation__Group__1"


    // $ANTLR start "rule__Activation__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1690:1: rule__Activation__Group__1__Impl : ( ( rule__Activation__ConditionAssignment_1 ) ) ;
    public final void rule__Activation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1694:1: ( ( ( rule__Activation__ConditionAssignment_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1695:1: ( ( rule__Activation__ConditionAssignment_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1695:1: ( ( rule__Activation__ConditionAssignment_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1696:1: ( rule__Activation__ConditionAssignment_1 )
            {
             before(grammarAccess.getActivationAccess().getConditionAssignment_1()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1697:1: ( rule__Activation__ConditionAssignment_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1697:2: rule__Activation__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__Activation__ConditionAssignment_1_in_rule__Activation__Group__1__Impl3426);
            rule__Activation__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActivationAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activation__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1711:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1715:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1716:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__03460);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__03463);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1723:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__AttributeAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1727:1: ( ( ( rule__Condition__AttributeAssignment_0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1728:1: ( ( rule__Condition__AttributeAssignment_0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1728:1: ( ( rule__Condition__AttributeAssignment_0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1729:1: ( rule__Condition__AttributeAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getAttributeAssignment_0()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1730:1: ( rule__Condition__AttributeAssignment_0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1730:2: rule__Condition__AttributeAssignment_0
            {
            pushFollow(FOLLOW_rule__Condition__AttributeAssignment_0_in_rule__Condition__Group__0__Impl3490);
            rule__Condition__AttributeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAttributeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1740:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1744:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1745:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__13520);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__13523);
            rule__Condition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1752:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__OperatorAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1756:1: ( ( ( rule__Condition__OperatorAssignment_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1757:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1757:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1758:1: ( rule__Condition__OperatorAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getOperatorAssignment_1()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1759:1: ( rule__Condition__OperatorAssignment_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1759:2: rule__Condition__OperatorAssignment_1
            {
            pushFollow(FOLLOW_rule__Condition__OperatorAssignment_1_in_rule__Condition__Group__1__Impl3550);
            rule__Condition__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getOperatorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1769:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1773:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1774:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__23580);
            rule__Condition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__3_in_rule__Condition__Group__23583);
            rule__Condition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1781:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__ValueAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1785:1: ( ( ( rule__Condition__ValueAssignment_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1786:1: ( ( rule__Condition__ValueAssignment_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1786:1: ( ( rule__Condition__ValueAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1787:1: ( rule__Condition__ValueAssignment_2 )
            {
             before(grammarAccess.getConditionAccess().getValueAssignment_2()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1788:1: ( rule__Condition__ValueAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1788:2: rule__Condition__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Condition__ValueAssignment_2_in_rule__Condition__Group__2__Impl3610);
            rule__Condition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1798:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1802:1: ( rule__Condition__Group__3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1803:2: rule__Condition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group__3__Impl_in_rule__Condition__Group__33640);
            rule__Condition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3"


    // $ANTLR start "rule__Condition__Group__3__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1809:1: rule__Condition__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1813:1: ( ( ( ';' )? ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1814:1: ( ( ';' )? )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1814:1: ( ( ';' )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1815:1: ( ';' )?
            {
             before(grammarAccess.getConditionAccess().getSemicolonKeyword_3()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1816:1: ( ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1817:2: ';'
                    {
                    match(input,21,FOLLOW_21_in_rule__Condition__Group__3__Impl3669); 

                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1836:1: rule__CompositeCondition__Group__0 : rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1 ;
    public final void rule__CompositeCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1840:1: ( rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1841:2: rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1
            {
            pushFollow(FOLLOW_rule__CompositeCondition__Group__0__Impl_in_rule__CompositeCondition__Group__03710);
            rule__CompositeCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompositeCondition__Group__1_in_rule__CompositeCondition__Group__03713);
            rule__CompositeCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__0"


    // $ANTLR start "rule__CompositeCondition__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1848:1: rule__CompositeCondition__Group__0__Impl : ( ( rule__CompositeCondition__OperatorAssignment_0 ) ) ;
    public final void rule__CompositeCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1852:1: ( ( ( rule__CompositeCondition__OperatorAssignment_0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1853:1: ( ( rule__CompositeCondition__OperatorAssignment_0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1853:1: ( ( rule__CompositeCondition__OperatorAssignment_0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1854:1: ( rule__CompositeCondition__OperatorAssignment_0 )
            {
             before(grammarAccess.getCompositeConditionAccess().getOperatorAssignment_0()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1855:1: ( rule__CompositeCondition__OperatorAssignment_0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1855:2: rule__CompositeCondition__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__CompositeCondition__OperatorAssignment_0_in_rule__CompositeCondition__Group__0__Impl3740);
            rule__CompositeCondition__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConditionAccess().getOperatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__0__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1865:1: rule__CompositeCondition__Group__1 : rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2 ;
    public final void rule__CompositeCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1869:1: ( rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1870:2: rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2
            {
            pushFollow(FOLLOW_rule__CompositeCondition__Group__1__Impl_in_rule__CompositeCondition__Group__13770);
            rule__CompositeCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompositeCondition__Group__2_in_rule__CompositeCondition__Group__13773);
            rule__CompositeCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__1"


    // $ANTLR start "rule__CompositeCondition__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1877:1: rule__CompositeCondition__Group__1__Impl : ( '(' ) ;
    public final void rule__CompositeCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1881:1: ( ( '(' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1882:1: ( '(' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1882:1: ( '(' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1883:1: '('
            {
             before(grammarAccess.getCompositeConditionAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__CompositeCondition__Group__1__Impl3801); 
             after(grammarAccess.getCompositeConditionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__1__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1896:1: rule__CompositeCondition__Group__2 : rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3 ;
    public final void rule__CompositeCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1900:1: ( rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1901:2: rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3
            {
            pushFollow(FOLLOW_rule__CompositeCondition__Group__2__Impl_in_rule__CompositeCondition__Group__23832);
            rule__CompositeCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompositeCondition__Group__3_in_rule__CompositeCondition__Group__23835);
            rule__CompositeCondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__2"


    // $ANTLR start "rule__CompositeCondition__Group__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1908:1: rule__CompositeCondition__Group__2__Impl : ( ( ( rule__CompositeCondition__ConditionsAssignment_2 ) ) ( ( rule__CompositeCondition__ConditionsAssignment_2 )* ) ) ;
    public final void rule__CompositeCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1912:1: ( ( ( ( rule__CompositeCondition__ConditionsAssignment_2 ) ) ( ( rule__CompositeCondition__ConditionsAssignment_2 )* ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1913:1: ( ( ( rule__CompositeCondition__ConditionsAssignment_2 ) ) ( ( rule__CompositeCondition__ConditionsAssignment_2 )* ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1913:1: ( ( ( rule__CompositeCondition__ConditionsAssignment_2 ) ) ( ( rule__CompositeCondition__ConditionsAssignment_2 )* ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1914:1: ( ( rule__CompositeCondition__ConditionsAssignment_2 ) ) ( ( rule__CompositeCondition__ConditionsAssignment_2 )* )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1914:1: ( ( rule__CompositeCondition__ConditionsAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1915:1: ( rule__CompositeCondition__ConditionsAssignment_2 )
            {
             before(grammarAccess.getCompositeConditionAccess().getConditionsAssignment_2()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1916:1: ( rule__CompositeCondition__ConditionsAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1916:2: rule__CompositeCondition__ConditionsAssignment_2
            {
            pushFollow(FOLLOW_rule__CompositeCondition__ConditionsAssignment_2_in_rule__CompositeCondition__Group__2__Impl3864);
            rule__CompositeCondition__ConditionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConditionAccess().getConditionsAssignment_2()); 

            }

            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1919:1: ( ( rule__CompositeCondition__ConditionsAssignment_2 )* )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1920:1: ( rule__CompositeCondition__ConditionsAssignment_2 )*
            {
             before(grammarAccess.getCompositeConditionAccess().getConditionsAssignment_2()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1921:1: ( rule__CompositeCondition__ConditionsAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||(LA17_0>=18 && LA17_0<=19)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1921:2: rule__CompositeCondition__ConditionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__CompositeCondition__ConditionsAssignment_2_in_rule__CompositeCondition__Group__2__Impl3876);
            	    rule__CompositeCondition__ConditionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getCompositeConditionAccess().getConditionsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__2__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1932:1: rule__CompositeCondition__Group__3 : rule__CompositeCondition__Group__3__Impl ;
    public final void rule__CompositeCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1936:1: ( rule__CompositeCondition__Group__3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1937:2: rule__CompositeCondition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CompositeCondition__Group__3__Impl_in_rule__CompositeCondition__Group__33909);
            rule__CompositeCondition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__3"


    // $ANTLR start "rule__CompositeCondition__Group__3__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1943:1: rule__CompositeCondition__Group__3__Impl : ( ')' ) ;
    public final void rule__CompositeCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1947:1: ( ( ')' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1948:1: ( ')' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1948:1: ( ')' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1949:1: ')'
            {
             before(grammarAccess.getCompositeConditionAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__CompositeCondition__Group__3__Impl3937); 
             after(grammarAccess.getCompositeConditionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__3__Impl"


    // $ANTLR start "rule__PosiblySignedDouble__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1970:1: rule__PosiblySignedDouble__Group__0 : rule__PosiblySignedDouble__Group__0__Impl rule__PosiblySignedDouble__Group__1 ;
    public final void rule__PosiblySignedDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1974:1: ( rule__PosiblySignedDouble__Group__0__Impl rule__PosiblySignedDouble__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1975:2: rule__PosiblySignedDouble__Group__0__Impl rule__PosiblySignedDouble__Group__1
            {
            pushFollow(FOLLOW_rule__PosiblySignedDouble__Group__0__Impl_in_rule__PosiblySignedDouble__Group__03976);
            rule__PosiblySignedDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PosiblySignedDouble__Group__1_in_rule__PosiblySignedDouble__Group__03979);
            rule__PosiblySignedDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PosiblySignedDouble__Group__0"


    // $ANTLR start "rule__PosiblySignedDouble__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1982:1: rule__PosiblySignedDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__PosiblySignedDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1986:1: ( ( ( '-' )? ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1987:1: ( ( '-' )? )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1987:1: ( ( '-' )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1988:1: ( '-' )?
            {
             before(grammarAccess.getPosiblySignedDoubleAccess().getHyphenMinusKeyword_0()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1989:1: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1990:2: '-'
                    {
                    match(input,34,FOLLOW_34_in_rule__PosiblySignedDouble__Group__0__Impl4008); 

                    }
                    break;

            }

             after(grammarAccess.getPosiblySignedDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PosiblySignedDouble__Group__0__Impl"


    // $ANTLR start "rule__PosiblySignedDouble__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2001:1: rule__PosiblySignedDouble__Group__1 : rule__PosiblySignedDouble__Group__1__Impl rule__PosiblySignedDouble__Group__2 ;
    public final void rule__PosiblySignedDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2005:1: ( rule__PosiblySignedDouble__Group__1__Impl rule__PosiblySignedDouble__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2006:2: rule__PosiblySignedDouble__Group__1__Impl rule__PosiblySignedDouble__Group__2
            {
            pushFollow(FOLLOW_rule__PosiblySignedDouble__Group__1__Impl_in_rule__PosiblySignedDouble__Group__14041);
            rule__PosiblySignedDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PosiblySignedDouble__Group__2_in_rule__PosiblySignedDouble__Group__14044);
            rule__PosiblySignedDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PosiblySignedDouble__Group__1"


    // $ANTLR start "rule__PosiblySignedDouble__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2013:1: rule__PosiblySignedDouble__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__PosiblySignedDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2017:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2018:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2018:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2019:1: RULE_INT
            {
             before(grammarAccess.getPosiblySignedDoubleAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__PosiblySignedDouble__Group__1__Impl4071); 
             after(grammarAccess.getPosiblySignedDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PosiblySignedDouble__Group__1__Impl"


    // $ANTLR start "rule__PosiblySignedDouble__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2030:1: rule__PosiblySignedDouble__Group__2 : rule__PosiblySignedDouble__Group__2__Impl rule__PosiblySignedDouble__Group__3 ;
    public final void rule__PosiblySignedDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2034:1: ( rule__PosiblySignedDouble__Group__2__Impl rule__PosiblySignedDouble__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2035:2: rule__PosiblySignedDouble__Group__2__Impl rule__PosiblySignedDouble__Group__3
            {
            pushFollow(FOLLOW_rule__PosiblySignedDouble__Group__2__Impl_in_rule__PosiblySignedDouble__Group__24100);
            rule__PosiblySignedDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PosiblySignedDouble__Group__3_in_rule__PosiblySignedDouble__Group__24103);
            rule__PosiblySignedDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PosiblySignedDouble__Group__2"


    // $ANTLR start "rule__PosiblySignedDouble__Group__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2042:1: rule__PosiblySignedDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__PosiblySignedDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2046:1: ( ( '.' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2047:1: ( '.' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2047:1: ( '.' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2048:1: '.'
            {
             before(grammarAccess.getPosiblySignedDoubleAccess().getFullStopKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__PosiblySignedDouble__Group__2__Impl4131); 
             after(grammarAccess.getPosiblySignedDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PosiblySignedDouble__Group__2__Impl"


    // $ANTLR start "rule__PosiblySignedDouble__Group__3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2061:1: rule__PosiblySignedDouble__Group__3 : rule__PosiblySignedDouble__Group__3__Impl ;
    public final void rule__PosiblySignedDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2065:1: ( rule__PosiblySignedDouble__Group__3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2066:2: rule__PosiblySignedDouble__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PosiblySignedDouble__Group__3__Impl_in_rule__PosiblySignedDouble__Group__34162);
            rule__PosiblySignedDouble__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PosiblySignedDouble__Group__3"


    // $ANTLR start "rule__PosiblySignedDouble__Group__3__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2072:1: rule__PosiblySignedDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__PosiblySignedDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2076:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2077:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2077:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2078:1: RULE_INT
            {
             before(grammarAccess.getPosiblySignedDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__PosiblySignedDouble__Group__3__Impl4189); 
             after(grammarAccess.getPosiblySignedDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PosiblySignedDouble__Group__3__Impl"


    // $ANTLR start "rule__PossiblySignedInteger__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2097:1: rule__PossiblySignedInteger__Group__0 : rule__PossiblySignedInteger__Group__0__Impl rule__PossiblySignedInteger__Group__1 ;
    public final void rule__PossiblySignedInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2101:1: ( rule__PossiblySignedInteger__Group__0__Impl rule__PossiblySignedInteger__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2102:2: rule__PossiblySignedInteger__Group__0__Impl rule__PossiblySignedInteger__Group__1
            {
            pushFollow(FOLLOW_rule__PossiblySignedInteger__Group__0__Impl_in_rule__PossiblySignedInteger__Group__04226);
            rule__PossiblySignedInteger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PossiblySignedInteger__Group__1_in_rule__PossiblySignedInteger__Group__04229);
            rule__PossiblySignedInteger__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PossiblySignedInteger__Group__0"


    // $ANTLR start "rule__PossiblySignedInteger__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2109:1: rule__PossiblySignedInteger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__PossiblySignedInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2113:1: ( ( ( '-' )? ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2114:1: ( ( '-' )? )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2114:1: ( ( '-' )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2115:1: ( '-' )?
            {
             before(grammarAccess.getPossiblySignedIntegerAccess().getHyphenMinusKeyword_0()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2116:1: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2117:2: '-'
                    {
                    match(input,34,FOLLOW_34_in_rule__PossiblySignedInteger__Group__0__Impl4258); 

                    }
                    break;

            }

             after(grammarAccess.getPossiblySignedIntegerAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PossiblySignedInteger__Group__0__Impl"


    // $ANTLR start "rule__PossiblySignedInteger__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2128:1: rule__PossiblySignedInteger__Group__1 : rule__PossiblySignedInteger__Group__1__Impl ;
    public final void rule__PossiblySignedInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2132:1: ( rule__PossiblySignedInteger__Group__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2133:2: rule__PossiblySignedInteger__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PossiblySignedInteger__Group__1__Impl_in_rule__PossiblySignedInteger__Group__14291);
            rule__PossiblySignedInteger__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PossiblySignedInteger__Group__1"


    // $ANTLR start "rule__PossiblySignedInteger__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2139:1: rule__PossiblySignedInteger__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__PossiblySignedInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2143:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2144:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2144:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2145:1: RULE_INT
            {
             before(grammarAccess.getPossiblySignedIntegerAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__PossiblySignedInteger__Group__1__Impl4318); 
             after(grammarAccess.getPossiblySignedIntegerAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PossiblySignedInteger__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2161:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2165:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2166:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04352);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04355);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2173:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2177:1: ( ( RULE_ID ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2178:1: ( RULE_ID )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2178:1: ( RULE_ID )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2179:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4382); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2190:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2194:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2195:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14411);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2201:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2205:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2206:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2206:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2207:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2208:1: ( rule__QualifiedName__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==35) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2208:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4438);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2222:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2226:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2227:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04473);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04476);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2234:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2238:1: ( ( '.' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2239:1: ( '.' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2239:1: ( '.' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2240:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,35,FOLLOW_35_in_rule__QualifiedName__Group_1__0__Impl4504); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2253:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2257:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2258:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14535);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2264:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2268:1: ( ( RULE_ID ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2269:1: ( RULE_ID )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2269:1: ( RULE_ID )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2270:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4562); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__DecorationModel__ImportURIAssignment_1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2286:1: rule__DecorationModel__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DecorationModel__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2290:1: ( ( RULE_STRING ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2291:1: ( RULE_STRING )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2291:1: ( RULE_STRING )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2292:1: RULE_STRING
            {
             before(grammarAccess.getDecorationModelAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DecorationModel__ImportURIAssignment_14600); 
             after(grammarAccess.getDecorationModelAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationModel__ImportURIAssignment_1"


    // $ANTLR start "rule__DecorationModel__NamespaceAssignment_3_0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2301:1: rule__DecorationModel__NamespaceAssignment_3_0 : ( ruleNamespace ) ;
    public final void rule__DecorationModel__NamespaceAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2305:1: ( ( ruleNamespace ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2306:1: ( ruleNamespace )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2306:1: ( ruleNamespace )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2307:1: ruleNamespace
            {
             before(grammarAccess.getDecorationModelAccess().getNamespaceNamespaceParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleNamespace_in_rule__DecorationModel__NamespaceAssignment_3_04631);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getDecorationModelAccess().getNamespaceNamespaceParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationModel__NamespaceAssignment_3_0"


    // $ANTLR start "rule__DecorationModel__DecorationDescriptionsAssignment_4"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2316:1: rule__DecorationModel__DecorationDescriptionsAssignment_4 : ( ruleDecorationDescription ) ;
    public final void rule__DecorationModel__DecorationDescriptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2320:1: ( ( ruleDecorationDescription ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2321:1: ( ruleDecorationDescription )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2321:1: ( ruleDecorationDescription )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2322:1: ruleDecorationDescription
            {
             before(grammarAccess.getDecorationModelAccess().getDecorationDescriptionsDecorationDescriptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleDecorationDescription_in_rule__DecorationModel__DecorationDescriptionsAssignment_44662);
            ruleDecorationDescription();

            state._fsp--;

             after(grammarAccess.getDecorationModelAccess().getDecorationDescriptionsDecorationDescriptionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationModel__DecorationDescriptionsAssignment_4"


    // $ANTLR start "rule__Namespace__ProfileAssignment_1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2331:1: rule__Namespace__ProfileAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Namespace__ProfileAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2335:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2336:1: ( ( ruleQualifiedName ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2336:1: ( ( ruleQualifiedName ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2337:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getNamespaceAccess().getProfileProfileCrossReference_1_0()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2338:1: ( ruleQualifiedName )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2339:1: ruleQualifiedName
            {
             before(grammarAccess.getNamespaceAccess().getProfileProfileQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Namespace__ProfileAssignment_14697);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getProfileProfileQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getNamespaceAccess().getProfileProfileCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__ProfileAssignment_1"


    // $ANTLR start "rule__DecorationDescription__StereotypeAssignment_1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2350:1: rule__DecorationDescription__StereotypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DecorationDescription__StereotypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2354:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2355:1: ( ( ruleQualifiedName ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2355:1: ( ( ruleQualifiedName ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2356:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getDecorationDescriptionAccess().getStereotypeStereotypeCrossReference_1_0()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2357:1: ( ruleQualifiedName )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2358:1: ruleQualifiedName
            {
             before(grammarAccess.getDecorationDescriptionAccess().getStereotypeStereotypeQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DecorationDescription__StereotypeAssignment_14736);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDecorationDescriptionAccess().getStereotypeStereotypeQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDecorationDescriptionAccess().getStereotypeStereotypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationDescription__StereotypeAssignment_1"


    // $ANTLR start "rule__DecorationDescription__DecorationsAssignment_3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2369:1: rule__DecorationDescription__DecorationsAssignment_3 : ( ruleDecoration ) ;
    public final void rule__DecorationDescription__DecorationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2373:1: ( ( ruleDecoration ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2374:1: ( ruleDecoration )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2374:1: ( ruleDecoration )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2375:1: ruleDecoration
            {
             before(grammarAccess.getDecorationDescriptionAccess().getDecorationsDecorationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDecoration_in_rule__DecorationDescription__DecorationsAssignment_34771);
            ruleDecoration();

            state._fsp--;

             after(grammarAccess.getDecorationDescriptionAccess().getDecorationsDecorationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationDescription__DecorationsAssignment_3"


    // $ANTLR start "rule__DecorationDescription__ActivationAssignment_4"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2384:1: rule__DecorationDescription__ActivationAssignment_4 : ( ruleActivation ) ;
    public final void rule__DecorationDescription__ActivationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2388:1: ( ( ruleActivation ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2389:1: ( ruleActivation )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2389:1: ( ruleActivation )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2390:1: ruleActivation
            {
             before(grammarAccess.getDecorationDescriptionAccess().getActivationActivationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleActivation_in_rule__DecorationDescription__ActivationAssignment_44802);
            ruleActivation();

            state._fsp--;

             after(grammarAccess.getDecorationDescriptionAccess().getActivationActivationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationDescription__ActivationAssignment_4"


    // $ANTLR start "rule__IconDecoration__Location_uriAssignment_4"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2399:1: rule__IconDecoration__Location_uriAssignment_4 : ( RULE_STRING ) ;
    public final void rule__IconDecoration__Location_uriAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2403:1: ( ( RULE_STRING ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2404:1: ( RULE_STRING )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2404:1: ( RULE_STRING )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2405:1: RULE_STRING
            {
             before(grammarAccess.getIconDecorationAccess().getLocation_uriSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__IconDecoration__Location_uriAssignment_44833); 
             after(grammarAccess.getIconDecorationAccess().getLocation_uriSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconDecoration__Location_uriAssignment_4"


    // $ANTLR start "rule__IconDecoration__ActivationAssignment_6"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2414:1: rule__IconDecoration__ActivationAssignment_6 : ( ruleActivation ) ;
    public final void rule__IconDecoration__ActivationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2418:1: ( ( ruleActivation ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2419:1: ( ruleActivation )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2419:1: ( ruleActivation )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2420:1: ruleActivation
            {
             before(grammarAccess.getIconDecorationAccess().getActivationActivationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleActivation_in_rule__IconDecoration__ActivationAssignment_64864);
            ruleActivation();

            state._fsp--;

             after(grammarAccess.getIconDecorationAccess().getActivationActivationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IconDecoration__ActivationAssignment_6"


    // $ANTLR start "rule__BorderDecoration__SizeAssignment_4"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2429:1: rule__BorderDecoration__SizeAssignment_4 : ( RULE_INT ) ;
    public final void rule__BorderDecoration__SizeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2433:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2434:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2434:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2435:1: RULE_INT
            {
             before(grammarAccess.getBorderDecorationAccess().getSizeINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__BorderDecoration__SizeAssignment_44895); 
             after(grammarAccess.getBorderDecorationAccess().getSizeINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderDecoration__SizeAssignment_4"


    // $ANTLR start "rule__BorderDecoration__ActivationAssignment_6"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2444:1: rule__BorderDecoration__ActivationAssignment_6 : ( ruleActivation ) ;
    public final void rule__BorderDecoration__ActivationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2448:1: ( ( ruleActivation ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2449:1: ( ruleActivation )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2449:1: ( ruleActivation )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2450:1: ruleActivation
            {
             before(grammarAccess.getBorderDecorationAccess().getActivationActivationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleActivation_in_rule__BorderDecoration__ActivationAssignment_64926);
            ruleActivation();

            state._fsp--;

             after(grammarAccess.getBorderDecorationAccess().getActivationActivationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderDecoration__ActivationAssignment_6"


    // $ANTLR start "rule__Activation__ConditionAssignment_1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2459:1: rule__Activation__ConditionAssignment_1 : ( ruleAbstractCondition ) ;
    public final void rule__Activation__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2463:1: ( ( ruleAbstractCondition ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2464:1: ( ruleAbstractCondition )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2464:1: ( ruleAbstractCondition )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2465:1: ruleAbstractCondition
            {
             before(grammarAccess.getActivationAccess().getConditionAbstractConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractCondition_in_rule__Activation__ConditionAssignment_14957);
            ruleAbstractCondition();

            state._fsp--;

             after(grammarAccess.getActivationAccess().getConditionAbstractConditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activation__ConditionAssignment_1"


    // $ANTLR start "rule__Condition__AttributeAssignment_0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2474:1: rule__Condition__AttributeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Condition__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2478:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2479:1: ( ( ruleQualifiedName ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2479:1: ( ( ruleQualifiedName ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2480:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getConditionAccess().getAttributeEAttributeCrossReference_0_0()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2481:1: ( ruleQualifiedName )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2482:1: ruleQualifiedName
            {
             before(grammarAccess.getConditionAccess().getAttributeEAttributeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Condition__AttributeAssignment_04992);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getAttributeEAttributeQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getAttributeEAttributeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__AttributeAssignment_0"


    // $ANTLR start "rule__Condition__OperatorAssignment_1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2493:1: rule__Condition__OperatorAssignment_1 : ( ruleComparisonOperator ) ;
    public final void rule__Condition__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2497:1: ( ( ruleComparisonOperator ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2498:1: ( ruleComparisonOperator )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2498:1: ( ruleComparisonOperator )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2499:1: ruleComparisonOperator
            {
             before(grammarAccess.getConditionAccess().getOperatorComparisonOperatorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleComparisonOperator_in_rule__Condition__OperatorAssignment_15027);
            ruleComparisonOperator();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getOperatorComparisonOperatorEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__OperatorAssignment_1"


    // $ANTLR start "rule__Condition__ValueAssignment_2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2508:1: rule__Condition__ValueAssignment_2 : ( ruleType ) ;
    public final void rule__Condition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2512:1: ( ( ruleType ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2513:1: ( ruleType )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2513:1: ( ruleType )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2514:1: ruleType
            {
             before(grammarAccess.getConditionAccess().getValueTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Condition__ValueAssignment_25058);
            ruleType();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getValueTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ValueAssignment_2"


    // $ANTLR start "rule__CompositeCondition__OperatorAssignment_0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2523:1: rule__CompositeCondition__OperatorAssignment_0 : ( ruleLogicalOperator ) ;
    public final void rule__CompositeCondition__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2527:1: ( ( ruleLogicalOperator ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2528:1: ( ruleLogicalOperator )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2528:1: ( ruleLogicalOperator )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2529:1: ruleLogicalOperator
            {
             before(grammarAccess.getCompositeConditionAccess().getOperatorLogicalOperatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLogicalOperator_in_rule__CompositeCondition__OperatorAssignment_05089);
            ruleLogicalOperator();

            state._fsp--;

             after(grammarAccess.getCompositeConditionAccess().getOperatorLogicalOperatorEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__OperatorAssignment_0"


    // $ANTLR start "rule__CompositeCondition__ConditionsAssignment_2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2538:1: rule__CompositeCondition__ConditionsAssignment_2 : ( ruleAbstractCondition ) ;
    public final void rule__CompositeCondition__ConditionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2542:1: ( ( ruleAbstractCondition ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2543:1: ( ruleAbstractCondition )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2543:1: ( ruleAbstractCondition )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2544:1: ruleAbstractCondition
            {
             before(grammarAccess.getCompositeConditionAccess().getConditionsAbstractConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAbstractCondition_in_rule__CompositeCondition__ConditionsAssignment_25120);
            ruleAbstractCondition();

            state._fsp--;

             after(grammarAccess.getCompositeConditionAccess().getConditionsAbstractConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__ConditionsAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDecorationModel_in_entryRuleDecorationModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecorationModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__0_in_ruleDecorationModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0_in_ruleNamespace154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecorationDescription_in_entryRuleDecorationDescription181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecorationDescription188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__0_in_ruleDecorationDescription214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecoration_in_entryRuleDecoration241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecoration248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decoration__Alternatives_in_ruleDecoration274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIconDecoration_in_entryRuleIconDecoration301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIconDecoration308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IconDecoration__Group__0_in_ruleIconDecoration334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderDecoration_in_entryRuleBorderDecoration361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorderDecoration368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__0_in_ruleBorderDecoration394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_entryRuleActivation421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivation428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activation__Group__0_in_ruleActivation454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractCondition_in_entryRuleAbstractCondition481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractCondition488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractCondition__Alternatives_in_ruleAbstractCondition514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0_in_ruleCondition574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeCondition608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__0_in_ruleCompositeCondition634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosiblySignedDouble_in_entryRulePosiblySignedDouble721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePosiblySignedDouble728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PosiblySignedDouble__Group__0_in_rulePosiblySignedDouble754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePossiblySignedInteger_in_entryRulePossiblySignedInteger781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePossiblySignedInteger788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PossiblySignedInteger__Group__0_in_rulePossiblySignedInteger814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperator__Alternatives_in_ruleComparisonOperator913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOperator__Alternatives_in_ruleLogicalOperator949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIconDecoration_in_rule__Decoration__Alternatives984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderDecoration_in_rule__Decoration__Alternatives1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__AbstractCondition__Alternatives1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeCondition_in_rule__AbstractCondition__Alternatives1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePossiblySignedInteger_in_rule__Type__Alternatives1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosiblySignedDouble_in_rule__Type__Alternatives1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Type__Alternatives1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__Type__Alternatives1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ComparisonOperator__Alternatives1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ComparisonOperator__Alternatives1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ComparisonOperator__Alternatives1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ComparisonOperator__Alternatives1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ComparisonOperator__Alternatives1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ComparisonOperator__Alternatives1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__LogicalOperator__Alternatives1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__LogicalOperator__Alternatives1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__0__Impl_in_rule__DecorationModel__Group__01361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__1_in_rule__DecorationModel__Group__01364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DecorationModel__Group__0__Impl1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__1__Impl_in_rule__DecorationModel__Group__11423 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__2_in_rule__DecorationModel__Group__11426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__ImportURIAssignment_1_in_rule__DecorationModel__Group__1__Impl1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__2__Impl_in_rule__DecorationModel__Group__21483 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__3_in_rule__DecorationModel__Group__21486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DecorationModel__Group__2__Impl1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__3__Impl_in_rule__DecorationModel__Group__31548 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__4_in_rule__DecorationModel__Group__31551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group_3__0_in_rule__DecorationModel__Group__3__Impl1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__4__Impl_in_rule__DecorationModel__Group__41609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__DecorationDescriptionsAssignment_4_in_rule__DecorationModel__Group__4__Impl1636 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group_3__0__Impl_in_rule__DecorationModel__Group_3__01677 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group_3__1_in_rule__DecorationModel__Group_3__01680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__NamespaceAssignment_3_0_in_rule__DecorationModel__Group_3__0__Impl1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group_3__1__Impl_in_rule__DecorationModel__Group_3__11737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DecorationModel__Group_3__1__Impl1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__01803 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__01806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Namespace__Group__0__Impl1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__11865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__ProfileAssignment_1_in_rule__Namespace__Group__1__Impl1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__0__Impl_in_rule__DecorationDescription__Group__01926 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__1_in_rule__DecorationDescription__Group__01929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DecorationDescription__Group__0__Impl1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__1__Impl_in_rule__DecorationDescription__Group__11988 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__2_in_rule__DecorationDescription__Group__11991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__StereotypeAssignment_1_in_rule__DecorationDescription__Group__1__Impl2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__2__Impl_in_rule__DecorationDescription__Group__22048 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__3_in_rule__DecorationDescription__Group__22051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DecorationDescription__Group__2__Impl2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__3__Impl_in_rule__DecorationDescription__Group__32110 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__4_in_rule__DecorationDescription__Group__32113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__DecorationsAssignment_3_in_rule__DecorationDescription__Group__3__Impl2142 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__DecorationsAssignment_3_in_rule__DecorationDescription__Group__3__Impl2154 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__4__Impl_in_rule__DecorationDescription__Group__42187 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__5_in_rule__DecorationDescription__Group__42190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__ActivationAssignment_4_in_rule__DecorationDescription__Group__4__Impl2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__5__Impl_in_rule__DecorationDescription__Group__52248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DecorationDescription__Group__5__Impl2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IconDecoration__Group__0__Impl_in_rule__IconDecoration__Group__02319 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__IconDecoration__Group__1_in_rule__IconDecoration__Group__02322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__IconDecoration__Group__0__Impl2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IconDecoration__Group__1__Impl_in_rule__IconDecoration__Group__12381 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__IconDecoration__Group__2_in_rule__IconDecoration__Group__12384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__IconDecoration__Group__1__Impl2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IconDecoration__Group__2__Impl_in_rule__IconDecoration__Group__22443 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__IconDecoration__Group__3_in_rule__IconDecoration__Group__22446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__IconDecoration__Group__2__Impl2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IconDecoration__Group__3__Impl_in_rule__IconDecoration__Group__32505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IconDecoration__Group__4_in_rule__IconDecoration__Group__32508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__IconDecoration__Group__3__Impl2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IconDecoration__Group__4__Impl_in_rule__IconDecoration__Group__42567 = new BitSet(new long[]{0x0000000082200000L});
    public static final BitSet FOLLOW_rule__IconDecoration__Group__5_in_rule__IconDecoration__Group__42570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IconDecoration__Location_uriAssignment_4_in_rule__IconDecoration__Group__4__Impl2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IconDecoration__Group__5__Impl_in_rule__IconDecoration__Group__52627 = new BitSet(new long[]{0x0000000082200000L});
    public static final BitSet FOLLOW_rule__IconDecoration__Group__6_in_rule__IconDecoration__Group__52630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__IconDecoration__Group__5__Impl2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IconDecoration__Group__6__Impl_in_rule__IconDecoration__Group__62692 = new BitSet(new long[]{0x0000000082200000L});
    public static final BitSet FOLLOW_rule__IconDecoration__Group__7_in_rule__IconDecoration__Group__62695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IconDecoration__ActivationAssignment_6_in_rule__IconDecoration__Group__6__Impl2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IconDecoration__Group__7__Impl_in_rule__IconDecoration__Group__72753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__IconDecoration__Group__7__Impl2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__0__Impl_in_rule__BorderDecoration__Group__02828 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__1_in_rule__BorderDecoration__Group__02831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__BorderDecoration__Group__0__Impl2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__1__Impl_in_rule__BorderDecoration__Group__12890 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__2_in_rule__BorderDecoration__Group__12893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BorderDecoration__Group__1__Impl2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__2__Impl_in_rule__BorderDecoration__Group__22952 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__3_in_rule__BorderDecoration__Group__22955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__BorderDecoration__Group__2__Impl2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__3__Impl_in_rule__BorderDecoration__Group__33014 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__4_in_rule__BorderDecoration__Group__33017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BorderDecoration__Group__3__Impl3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__4__Impl_in_rule__BorderDecoration__Group__43076 = new BitSet(new long[]{0x0000000082200000L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__5_in_rule__BorderDecoration__Group__43079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__SizeAssignment_4_in_rule__BorderDecoration__Group__4__Impl3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__5__Impl_in_rule__BorderDecoration__Group__53136 = new BitSet(new long[]{0x0000000082200000L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__6_in_rule__BorderDecoration__Group__53139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BorderDecoration__Group__5__Impl3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__6__Impl_in_rule__BorderDecoration__Group__63201 = new BitSet(new long[]{0x0000000082200000L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__7_in_rule__BorderDecoration__Group__63204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__ActivationAssignment_6_in_rule__BorderDecoration__Group__6__Impl3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__7__Impl_in_rule__BorderDecoration__Group__73262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BorderDecoration__Group__7__Impl3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activation__Group__0__Impl_in_rule__Activation__Group__03337 = new BitSet(new long[]{0x00000000000C0080L});
    public static final BitSet FOLLOW_rule__Activation__Group__1_in_rule__Activation__Group__03340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Activation__Group__0__Impl3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activation__Group__1__Impl_in_rule__Activation__Group__13399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activation__ConditionAssignment_1_in_rule__Activation__Group__1__Impl3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__03460 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__03463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__AttributeAssignment_0_in_rule__Condition__Group__0__Impl3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__13520 = new BitSet(new long[]{0x0000000400000070L});
    public static final BitSet FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__13523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__OperatorAssignment_1_in_rule__Condition__Group__1__Impl3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__23580 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Condition__Group__3_in_rule__Condition__Group__23583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__ValueAssignment_2_in_rule__Condition__Group__2__Impl3610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__3__Impl_in_rule__Condition__Group__33640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Condition__Group__3__Impl3669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__0__Impl_in_rule__CompositeCondition__Group__03710 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__1_in_rule__CompositeCondition__Group__03713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeCondition__OperatorAssignment_0_in_rule__CompositeCondition__Group__0__Impl3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__1__Impl_in_rule__CompositeCondition__Group__13770 = new BitSet(new long[]{0x00000000000C0080L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__2_in_rule__CompositeCondition__Group__13773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__CompositeCondition__Group__1__Impl3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__2__Impl_in_rule__CompositeCondition__Group__23832 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__3_in_rule__CompositeCondition__Group__23835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeCondition__ConditionsAssignment_2_in_rule__CompositeCondition__Group__2__Impl3864 = new BitSet(new long[]{0x00000000000C0082L});
    public static final BitSet FOLLOW_rule__CompositeCondition__ConditionsAssignment_2_in_rule__CompositeCondition__Group__2__Impl3876 = new BitSet(new long[]{0x00000000000C0082L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__3__Impl_in_rule__CompositeCondition__Group__33909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__CompositeCondition__Group__3__Impl3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PosiblySignedDouble__Group__0__Impl_in_rule__PosiblySignedDouble__Group__03976 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_rule__PosiblySignedDouble__Group__1_in_rule__PosiblySignedDouble__Group__03979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__PosiblySignedDouble__Group__0__Impl4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PosiblySignedDouble__Group__1__Impl_in_rule__PosiblySignedDouble__Group__14041 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__PosiblySignedDouble__Group__2_in_rule__PosiblySignedDouble__Group__14044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__PosiblySignedDouble__Group__1__Impl4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PosiblySignedDouble__Group__2__Impl_in_rule__PosiblySignedDouble__Group__24100 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PosiblySignedDouble__Group__3_in_rule__PosiblySignedDouble__Group__24103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__PosiblySignedDouble__Group__2__Impl4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PosiblySignedDouble__Group__3__Impl_in_rule__PosiblySignedDouble__Group__34162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__PosiblySignedDouble__Group__3__Impl4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PossiblySignedInteger__Group__0__Impl_in_rule__PossiblySignedInteger__Group__04226 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_rule__PossiblySignedInteger__Group__1_in_rule__PossiblySignedInteger__Group__04229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__PossiblySignedInteger__Group__0__Impl4258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PossiblySignedInteger__Group__1__Impl_in_rule__PossiblySignedInteger__Group__14291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__PossiblySignedInteger__Group__1__Impl4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04352 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4438 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04473 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__QualifiedName__Group_1__0__Impl4504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DecorationModel__ImportURIAssignment_14600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_rule__DecorationModel__NamespaceAssignment_3_04631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecorationDescription_in_rule__DecorationModel__DecorationDescriptionsAssignment_44662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Namespace__ProfileAssignment_14697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DecorationDescription__StereotypeAssignment_14736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecoration_in_rule__DecorationDescription__DecorationsAssignment_34771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_rule__DecorationDescription__ActivationAssignment_44802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__IconDecoration__Location_uriAssignment_44833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_rule__IconDecoration__ActivationAssignment_64864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__BorderDecoration__SizeAssignment_44895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_rule__BorderDecoration__ActivationAssignment_64926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractCondition_in_rule__Activation__ConditionAssignment_14957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Condition__AttributeAssignment_04992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_rule__Condition__OperatorAssignment_15027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Condition__ValueAssignment_25058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOperator_in_rule__CompositeCondition__OperatorAssignment_05089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractCondition_in_rule__CompositeCondition__ConditionsAssignment_25120 = new BitSet(new long[]{0x0000000000000002L});

}