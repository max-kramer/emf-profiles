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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEMFProfileDecorationLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_HEX_COLOR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'all'", "'any'", "'solid'", "'dot'", "'dash'", "'dash_dot'", "'dash_dot_dot'", "'red'", "'black'", "'white'", "'green'", "'green_light'", "'green_dark'", "'blue'", "'blue_light'", "'blue_dark'", "'gray'", "'gray_light'", "'gray_dark'", "'orange'", "'yellow'", "'cyan'", "'center'", "'north'", "'south'", "'west'", "'east'", "'north_east'", "'north_west'", "'south_east'", "'south_west'", "'import resource'", "'profile'", "'decoration'", "'{'", "'}'", "'image'", "'location-uri'", "'='", "'tooltip'", "'border'", "'color'", "'background'", "'foreground'", "'connection'", "'foreground-color'", "'background-color'", "'+'", "'line-style'", "'size'", "'direction'", "'margin'", "'RGB'", "'('", "','", "')'", "'active when'", "'-'", "'.'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=5;
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
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
    public static final int RULE_HEX_COLOR=8;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
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
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationModelRule()); 
            }
            pushFollow(FOLLOW_ruleDecorationModel_in_entryRuleDecorationModel61);
            ruleDecorationModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecorationModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecorationModel68); if (state.failed) return ;

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
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationModelAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:76:1: ( rule__DecorationModel__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:76:2: rule__DecorationModel__Group__0
            {
            pushFollow(FOLLOW_rule__DecorationModel__Group__0_in_ruleDecorationModel94);
            rule__DecorationModel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecorationModelAccess().getGroup()); 
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
    // $ANTLR end "ruleDecorationModel"


    // $ANTLR start "entryRuleNamespace"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:88:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:89:1: ( ruleNamespace EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:90:1: ruleNamespace EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceRule()); 
            }
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace121);
            ruleNamespace();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace128); if (state.failed) return ;

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
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:104:1: ( rule__Namespace__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:104:2: rule__Namespace__Group__0
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0_in_ruleNamespace154);
            rule__Namespace__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceAccess().getGroup()); 
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
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleDecorationDescription"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:116:1: entryRuleDecorationDescription : ruleDecorationDescription EOF ;
    public final void entryRuleDecorationDescription() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:117:1: ( ruleDecorationDescription EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:118:1: ruleDecorationDescription EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionRule()); 
            }
            pushFollow(FOLLOW_ruleDecorationDescription_in_entryRuleDecorationDescription181);
            ruleDecorationDescription();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecorationDescriptionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecorationDescription188); if (state.failed) return ;

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
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:132:1: ( rule__DecorationDescription__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:132:2: rule__DecorationDescription__Group__0
            {
            pushFollow(FOLLOW_rule__DecorationDescription__Group__0_in_ruleDecorationDescription214);
            rule__DecorationDescription__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecorationDescriptionAccess().getGroup()); 
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
    // $ANTLR end "ruleDecorationDescription"


    // $ANTLR start "entryRuleAbstractDecoration"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:144:1: entryRuleAbstractDecoration : ruleAbstractDecoration EOF ;
    public final void entryRuleAbstractDecoration() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:145:1: ( ruleAbstractDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:146:1: ruleAbstractDecoration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractDecorationRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractDecoration_in_entryRuleAbstractDecoration241);
            ruleAbstractDecoration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractDecorationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDecoration248); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAbstractDecoration"


    // $ANTLR start "ruleAbstractDecoration"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:153:1: ruleAbstractDecoration : ( ( rule__AbstractDecoration__Alternatives ) ) ;
    public final void ruleAbstractDecoration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:157:2: ( ( ( rule__AbstractDecoration__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:158:1: ( ( rule__AbstractDecoration__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:158:1: ( ( rule__AbstractDecoration__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:159:1: ( rule__AbstractDecoration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractDecorationAccess().getAlternatives()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:160:1: ( rule__AbstractDecoration__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:160:2: rule__AbstractDecoration__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractDecoration__Alternatives_in_ruleAbstractDecoration274);
            rule__AbstractDecoration__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractDecorationAccess().getAlternatives()); 
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
    // $ANTLR end "ruleAbstractDecoration"


    // $ANTLR start "entryRuleImageDecoration"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:172:1: entryRuleImageDecoration : ruleImageDecoration EOF ;
    public final void entryRuleImageDecoration() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:173:1: ( ruleImageDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:174:1: ruleImageDecoration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationRule()); 
            }
            pushFollow(FOLLOW_ruleImageDecoration_in_entryRuleImageDecoration301);
            ruleImageDecoration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageDecorationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageDecoration308); if (state.failed) return ;

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
    // $ANTLR end "entryRuleImageDecoration"


    // $ANTLR start "ruleImageDecoration"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:181:1: ruleImageDecoration : ( ( rule__ImageDecoration__Group__0 ) ) ;
    public final void ruleImageDecoration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:185:2: ( ( ( rule__ImageDecoration__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:186:1: ( ( rule__ImageDecoration__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:186:1: ( ( rule__ImageDecoration__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:187:1: ( rule__ImageDecoration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:188:1: ( rule__ImageDecoration__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:188:2: rule__ImageDecoration__Group__0
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group__0_in_ruleImageDecoration334);
            rule__ImageDecoration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageDecorationAccess().getGroup()); 
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
    // $ANTLR end "ruleImageDecoration"


    // $ANTLR start "entryRuleBorderDecoration"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:200:1: entryRuleBorderDecoration : ruleBorderDecoration EOF ;
    public final void entryRuleBorderDecoration() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:201:1: ( ruleBorderDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:202:1: ruleBorderDecoration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationRule()); 
            }
            pushFollow(FOLLOW_ruleBorderDecoration_in_entryRuleBorderDecoration361);
            ruleBorderDecoration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBorderDecorationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBorderDecoration368); if (state.failed) return ;

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
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:216:1: ( rule__BorderDecoration__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:216:2: rule__BorderDecoration__Group__0
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__0_in_ruleBorderDecoration394);
            rule__BorderDecoration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBorderDecorationAccess().getGroup()); 
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
    // $ANTLR end "ruleBorderDecoration"


    // $ANTLR start "entryRuleColorDecoration"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:228:1: entryRuleColorDecoration : ruleColorDecoration EOF ;
    public final void entryRuleColorDecoration() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:229:1: ( ruleColorDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:230:1: ruleColorDecoration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationRule()); 
            }
            pushFollow(FOLLOW_ruleColorDecoration_in_entryRuleColorDecoration421);
            ruleColorDecoration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorDecorationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorDecoration428); if (state.failed) return ;

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
    // $ANTLR end "entryRuleColorDecoration"


    // $ANTLR start "ruleColorDecoration"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:237:1: ruleColorDecoration : ( ( rule__ColorDecoration__Group__0 ) ) ;
    public final void ruleColorDecoration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:241:2: ( ( ( rule__ColorDecoration__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:242:1: ( ( rule__ColorDecoration__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:242:1: ( ( rule__ColorDecoration__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:243:1: ( rule__ColorDecoration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:244:1: ( rule__ColorDecoration__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:244:2: rule__ColorDecoration__Group__0
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group__0_in_ruleColorDecoration454);
            rule__ColorDecoration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorDecorationAccess().getGroup()); 
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
    // $ANTLR end "ruleColorDecoration"


    // $ANTLR start "entryRuleConnectionDecoration"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:256:1: entryRuleConnectionDecoration : ruleConnectionDecoration EOF ;
    public final void entryRuleConnectionDecoration() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:257:1: ( ruleConnectionDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:258:1: ruleConnectionDecoration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationRule()); 
            }
            pushFollow(FOLLOW_ruleConnectionDecoration_in_entryRuleConnectionDecoration481);
            ruleConnectionDecoration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectionDecorationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnectionDecoration488); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConnectionDecoration"


    // $ANTLR start "ruleConnectionDecoration"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:265:1: ruleConnectionDecoration : ( ( rule__ConnectionDecoration__Group__0 ) ) ;
    public final void ruleConnectionDecoration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:269:2: ( ( ( rule__ConnectionDecoration__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:270:1: ( ( rule__ConnectionDecoration__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:270:1: ( ( rule__ConnectionDecoration__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:271:1: ( rule__ConnectionDecoration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:272:1: ( rule__ConnectionDecoration__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:272:2: rule__ConnectionDecoration__Group__0
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__0_in_ruleConnectionDecoration514);
            rule__ConnectionDecoration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectionDecorationAccess().getGroup()); 
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
    // $ANTLR end "ruleConnectionDecoration"


    // $ANTLR start "entryRuleText"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:284:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:285:1: ( ruleText EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:286:1: ruleText EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextRule()); 
            }
            pushFollow(FOLLOW_ruleText_in_entryRuleText541);
            ruleText();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleText548); if (state.failed) return ;

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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:293:1: ruleText : ( ( rule__Text__Alternatives ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:297:2: ( ( ( rule__Text__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:298:1: ( ( rule__Text__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:298:1: ( ( rule__Text__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:299:1: ( rule__Text__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAccess().getAlternatives()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:300:1: ( rule__Text__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:300:2: rule__Text__Alternatives
            {
            pushFollow(FOLLOW_rule__Text__Alternatives_in_ruleText574);
            rule__Text__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAccess().getAlternatives()); 
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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleSimpleText"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:312:1: entryRuleSimpleText : ruleSimpleText EOF ;
    public final void entryRuleSimpleText() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:313:1: ( ruleSimpleText EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:314:1: ruleSimpleText EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleTextRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleText_in_entryRuleSimpleText601);
            ruleSimpleText();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleTextRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleText608); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSimpleText"


    // $ANTLR start "ruleSimpleText"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:321:1: ruleSimpleText : ( ( rule__SimpleText__Alternatives ) ) ;
    public final void ruleSimpleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:325:2: ( ( ( rule__SimpleText__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:326:1: ( ( rule__SimpleText__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:326:1: ( ( rule__SimpleText__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:327:1: ( rule__SimpleText__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleTextAccess().getAlternatives()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:328:1: ( rule__SimpleText__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:328:2: rule__SimpleText__Alternatives
            {
            pushFollow(FOLLOW_rule__SimpleText__Alternatives_in_ruleSimpleText634);
            rule__SimpleText__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleTextAccess().getAlternatives()); 
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
    // $ANTLR end "ruleSimpleText"


    // $ANTLR start "entryRuleComplexText"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:340:1: entryRuleComplexText : ruleComplexText EOF ;
    public final void entryRuleComplexText() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:341:1: ( ruleComplexText EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:342:1: ruleComplexText EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTextRule()); 
            }
            pushFollow(FOLLOW_ruleComplexText_in_entryRuleComplexText661);
            ruleComplexText();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTextRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexText668); if (state.failed) return ;

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
    // $ANTLR end "entryRuleComplexText"


    // $ANTLR start "ruleComplexText"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:349:1: ruleComplexText : ( ( rule__ComplexText__Group__0 ) ) ;
    public final void ruleComplexText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:353:2: ( ( ( rule__ComplexText__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:354:1: ( ( rule__ComplexText__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:354:1: ( ( rule__ComplexText__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:355:1: ( rule__ComplexText__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTextAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:356:1: ( rule__ComplexText__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:356:2: rule__ComplexText__Group__0
            {
            pushFollow(FOLLOW_rule__ComplexText__Group__0_in_ruleComplexText694);
            rule__ComplexText__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTextAccess().getGroup()); 
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
    // $ANTLR end "ruleComplexText"


    // $ANTLR start "entryRuleStyle"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:368:1: entryRuleStyle : ruleStyle EOF ;
    public final void entryRuleStyle() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:369:1: ( ruleStyle EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:370:1: ruleStyle EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleRule()); 
            }
            pushFollow(FOLLOW_ruleStyle_in_entryRuleStyle721);
            ruleStyle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStyleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStyle728); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStyle"


    // $ANTLR start "ruleStyle"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:377:1: ruleStyle : ( ( rule__Style__Group__0 ) ) ;
    public final void ruleStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:381:2: ( ( ( rule__Style__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:382:1: ( ( rule__Style__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:382:1: ( ( rule__Style__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:383:1: ( rule__Style__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:384:1: ( rule__Style__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:384:2: rule__Style__Group__0
            {
            pushFollow(FOLLOW_rule__Style__Group__0_in_ruleStyle754);
            rule__Style__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStyleAccess().getGroup()); 
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
    // $ANTLR end "ruleStyle"


    // $ANTLR start "entryRuleSize"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:396:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:397:1: ( ruleSize EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:398:1: ruleSize EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeRule()); 
            }
            pushFollow(FOLLOW_ruleSize_in_entryRuleSize781);
            ruleSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSize788); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:405:1: ruleSize : ( ( rule__Size__Group__0 ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:409:2: ( ( ( rule__Size__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:410:1: ( ( rule__Size__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:410:1: ( ( rule__Size__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:411:1: ( rule__Size__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:412:1: ( rule__Size__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:412:2: rule__Size__Group__0
            {
            pushFollow(FOLLOW_rule__Size__Group__0_in_ruleSize814);
            rule__Size__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeAccess().getGroup()); 
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
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleDirection"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:424:1: entryRuleDirection : ruleDirection EOF ;
    public final void entryRuleDirection() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:425:1: ( ruleDirection EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:426:1: ruleDirection EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectionRule()); 
            }
            pushFollow(FOLLOW_ruleDirection_in_entryRuleDirection841);
            ruleDirection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirection848); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDirection"


    // $ANTLR start "ruleDirection"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:433:1: ruleDirection : ( ( rule__Direction__Group__0 ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:437:2: ( ( ( rule__Direction__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:438:1: ( ( rule__Direction__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:438:1: ( ( rule__Direction__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:439:1: ( rule__Direction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectionAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:440:1: ( rule__Direction__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:440:2: rule__Direction__Group__0
            {
            pushFollow(FOLLOW_rule__Direction__Group__0_in_ruleDirection874);
            rule__Direction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectionAccess().getGroup()); 
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
    // $ANTLR end "ruleDirection"


    // $ANTLR start "entryRuleMargin"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:452:1: entryRuleMargin : ruleMargin EOF ;
    public final void entryRuleMargin() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:453:1: ( ruleMargin EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:454:1: ruleMargin EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarginRule()); 
            }
            pushFollow(FOLLOW_ruleMargin_in_entryRuleMargin901);
            ruleMargin();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMarginRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMargin908); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMargin"


    // $ANTLR start "ruleMargin"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:461:1: ruleMargin : ( ( rule__Margin__Group__0 ) ) ;
    public final void ruleMargin() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:465:2: ( ( ( rule__Margin__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:466:1: ( ( rule__Margin__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:466:1: ( ( rule__Margin__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:467:1: ( rule__Margin__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarginAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:468:1: ( rule__Margin__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:468:2: rule__Margin__Group__0
            {
            pushFollow(FOLLOW_rule__Margin__Group__0_in_ruleMargin934);
            rule__Margin__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMarginAccess().getGroup()); 
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
    // $ANTLR end "ruleMargin"


    // $ANTLR start "entryRuleColor"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:480:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:481:1: ( ruleColor EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:482:1: ruleColor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorRule()); 
            }
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor961);
            ruleColor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor968); if (state.failed) return ;

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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:489:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:493:2: ( ( ( rule__Color__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:494:1: ( ( rule__Color__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:494:1: ( ( rule__Color__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:495:1: ( rule__Color__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getAlternatives()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:496:1: ( rule__Color__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:496:2: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_rule__Color__Alternatives_in_ruleColor994);
            rule__Color__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleConcreteColor"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:508:1: entryRuleConcreteColor : ruleConcreteColor EOF ;
    public final void entryRuleConcreteColor() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:509:1: ( ruleConcreteColor EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:510:1: ruleConcreteColor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorRule()); 
            }
            pushFollow(FOLLOW_ruleConcreteColor_in_entryRuleConcreteColor1021);
            ruleConcreteColor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcreteColorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcreteColor1028); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConcreteColor"


    // $ANTLR start "ruleConcreteColor"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:517:1: ruleConcreteColor : ( ( rule__ConcreteColor__Alternatives ) ) ;
    public final void ruleConcreteColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:521:2: ( ( ( rule__ConcreteColor__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:522:1: ( ( rule__ConcreteColor__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:522:1: ( ( rule__ConcreteColor__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:523:1: ( rule__ConcreteColor__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getAlternatives()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:524:1: ( rule__ConcreteColor__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:524:2: rule__ConcreteColor__Alternatives
            {
            pushFollow(FOLLOW_rule__ConcreteColor__Alternatives_in_ruleConcreteColor1054);
            rule__ConcreteColor__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcreteColorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleConcreteColor"


    // $ANTLR start "entryRuleRGB"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:536:1: entryRuleRGB : ruleRGB EOF ;
    public final void entryRuleRGB() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:537:1: ( ruleRGB EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:538:1: ruleRGB EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRGBRule()); 
            }
            pushFollow(FOLLOW_ruleRGB_in_entryRuleRGB1081);
            ruleRGB();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRGBRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRGB1088); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRGB"


    // $ANTLR start "ruleRGB"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:545:1: ruleRGB : ( ( rule__RGB__Group__0 ) ) ;
    public final void ruleRGB() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:549:2: ( ( ( rule__RGB__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:550:1: ( ( rule__RGB__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:550:1: ( ( rule__RGB__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:551:1: ( rule__RGB__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRGBAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:552:1: ( rule__RGB__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:552:2: rule__RGB__Group__0
            {
            pushFollow(FOLLOW_rule__RGB__Group__0_in_ruleRGB1114);
            rule__RGB__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRGBAccess().getGroup()); 
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
    // $ANTLR end "ruleRGB"


    // $ANTLR start "entryRuleHexColor"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:564:1: entryRuleHexColor : ruleHexColor EOF ;
    public final void entryRuleHexColor() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:565:1: ( ruleHexColor EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:566:1: ruleHexColor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHexColorRule()); 
            }
            pushFollow(FOLLOW_ruleHexColor_in_entryRuleHexColor1141);
            ruleHexColor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHexColorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexColor1148); if (state.failed) return ;

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
    // $ANTLR end "entryRuleHexColor"


    // $ANTLR start "ruleHexColor"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:573:1: ruleHexColor : ( ( rule__HexColor__HexCodeAssignment ) ) ;
    public final void ruleHexColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:577:2: ( ( ( rule__HexColor__HexCodeAssignment ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:578:1: ( ( rule__HexColor__HexCodeAssignment ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:578:1: ( ( rule__HexColor__HexCodeAssignment ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:579:1: ( rule__HexColor__HexCodeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHexColorAccess().getHexCodeAssignment()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:580:1: ( rule__HexColor__HexCodeAssignment )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:580:2: rule__HexColor__HexCodeAssignment
            {
            pushFollow(FOLLOW_rule__HexColor__HexCodeAssignment_in_ruleHexColor1174);
            rule__HexColor__HexCodeAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHexColorAccess().getHexCodeAssignment()); 
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
    // $ANTLR end "ruleHexColor"


    // $ANTLR start "entryRuleColorConstant"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:592:1: entryRuleColorConstant : ruleColorConstant EOF ;
    public final void entryRuleColorConstant() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:593:1: ( ruleColorConstant EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:594:1: ruleColorConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorConstantRule()); 
            }
            pushFollow(FOLLOW_ruleColorConstant_in_entryRuleColorConstant1201);
            ruleColorConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorConstantRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorConstant1208); if (state.failed) return ;

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
    // $ANTLR end "entryRuleColorConstant"


    // $ANTLR start "ruleColorConstant"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:601:1: ruleColorConstant : ( ( rule__ColorConstant__ValueAssignment ) ) ;
    public final void ruleColorConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:605:2: ( ( ( rule__ColorConstant__ValueAssignment ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:606:1: ( ( rule__ColorConstant__ValueAssignment ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:606:1: ( ( rule__ColorConstant__ValueAssignment ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:607:1: ( rule__ColorConstant__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorConstantAccess().getValueAssignment()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:608:1: ( rule__ColorConstant__ValueAssignment )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:608:2: rule__ColorConstant__ValueAssignment
            {
            pushFollow(FOLLOW_rule__ColorConstant__ValueAssignment_in_ruleColorConstant1234);
            rule__ColorConstant__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorConstantAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleColorConstant"


    // $ANTLR start "entryRuleActivation"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:620:1: entryRuleActivation : ruleActivation EOF ;
    public final void entryRuleActivation() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:621:1: ( ruleActivation EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:622:1: ruleActivation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivationRule()); 
            }
            pushFollow(FOLLOW_ruleActivation_in_entryRuleActivation1261);
            ruleActivation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivation1268); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:629:1: ruleActivation : ( ( rule__Activation__Group__0 ) ) ;
    public final void ruleActivation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:633:2: ( ( ( rule__Activation__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:634:1: ( ( rule__Activation__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:634:1: ( ( rule__Activation__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:635:1: ( rule__Activation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivationAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:636:1: ( rule__Activation__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:636:2: rule__Activation__Group__0
            {
            pushFollow(FOLLOW_rule__Activation__Group__0_in_ruleActivation1294);
            rule__Activation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivationAccess().getGroup()); 
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
    // $ANTLR end "ruleActivation"


    // $ANTLR start "entryRuleAbstractCondition"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:648:1: entryRuleAbstractCondition : ruleAbstractCondition EOF ;
    public final void entryRuleAbstractCondition() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:649:1: ( ruleAbstractCondition EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:650:1: ruleAbstractCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractConditionRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractCondition_in_entryRuleAbstractCondition1321);
            ruleAbstractCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractConditionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractCondition1328); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:657:1: ruleAbstractCondition : ( ( rule__AbstractCondition__Alternatives ) ) ;
    public final void ruleAbstractCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:661:2: ( ( ( rule__AbstractCondition__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:662:1: ( ( rule__AbstractCondition__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:662:1: ( ( rule__AbstractCondition__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:663:1: ( rule__AbstractCondition__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractConditionAccess().getAlternatives()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:664:1: ( rule__AbstractCondition__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:664:2: rule__AbstractCondition__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractCondition__Alternatives_in_ruleAbstractCondition1354);
            rule__AbstractCondition__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractConditionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleAbstractCondition"


    // $ANTLR start "entryRuleCondition"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:676:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:677:1: ( ruleCondition EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:678:1: ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition1381);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition1388); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:685:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:689:2: ( ( ( rule__Condition__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:690:1: ( ( rule__Condition__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:690:1: ( ( rule__Condition__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:691:1: ( rule__Condition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:692:1: ( rule__Condition__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:692:2: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_rule__Condition__Group__0_in_ruleCondition1414);
            rule__Condition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getGroup()); 
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleCompositeCondition"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:704:1: entryRuleCompositeCondition : ruleCompositeCondition EOF ;
    public final void entryRuleCompositeCondition() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:705:1: ( ruleCompositeCondition EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:706:1: ruleCompositeCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition1441);
            ruleCompositeCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeCondition1448); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:713:1: ruleCompositeCondition : ( ( rule__CompositeCondition__Group__0 ) ) ;
    public final void ruleCompositeCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:717:2: ( ( ( rule__CompositeCondition__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:718:1: ( ( rule__CompositeCondition__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:718:1: ( ( rule__CompositeCondition__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:719:1: ( rule__CompositeCondition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:720:1: ( rule__CompositeCondition__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:720:2: rule__CompositeCondition__Group__0
            {
            pushFollow(FOLLOW_rule__CompositeCondition__Group__0_in_ruleCompositeCondition1474);
            rule__CompositeCondition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getGroup()); 
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
    // $ANTLR end "ruleCompositeCondition"


    // $ANTLR start "entryRuleType"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:732:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:733:1: ( ruleType EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:734:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType1501);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1508); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:741:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:745:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:746:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:746:1: ( ( rule__Type__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:747:1: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:748:1: ( rule__Type__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:748:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1534);
            rule__Type__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getAlternatives()); 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSignedDouble"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:760:1: entryRuleSignedDouble : ruleSignedDouble EOF ;
    public final void entryRuleSignedDouble() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:761:1: ( ruleSignedDouble EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:762:1: ruleSignedDouble EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedDoubleRule()); 
            }
            pushFollow(FOLLOW_ruleSignedDouble_in_entryRuleSignedDouble1561);
            ruleSignedDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignedDoubleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedDouble1568); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSignedDouble"


    // $ANTLR start "ruleSignedDouble"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:769:1: ruleSignedDouble : ( ( rule__SignedDouble__Group__0 ) ) ;
    public final void ruleSignedDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:773:2: ( ( ( rule__SignedDouble__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:774:1: ( ( rule__SignedDouble__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:774:1: ( ( rule__SignedDouble__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:775:1: ( rule__SignedDouble__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedDoubleAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:776:1: ( rule__SignedDouble__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:776:2: rule__SignedDouble__Group__0
            {
            pushFollow(FOLLOW_rule__SignedDouble__Group__0_in_ruleSignedDouble1594);
            rule__SignedDouble__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignedDoubleAccess().getGroup()); 
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
    // $ANTLR end "ruleSignedDouble"


    // $ANTLR start "entryRuleSignedInteger"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:788:1: entryRuleSignedInteger : ruleSignedInteger EOF ;
    public final void entryRuleSignedInteger() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:789:1: ( ruleSignedInteger EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:790:1: ruleSignedInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleSignedInteger_in_entryRuleSignedInteger1621);
            ruleSignedInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignedIntegerRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedInteger1628); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSignedInteger"


    // $ANTLR start "ruleSignedInteger"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:797:1: ruleSignedInteger : ( ( rule__SignedInteger__Group__0 ) ) ;
    public final void ruleSignedInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:801:2: ( ( ( rule__SignedInteger__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:802:1: ( ( rule__SignedInteger__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:802:1: ( ( rule__SignedInteger__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:803:1: ( rule__SignedInteger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedIntegerAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:804:1: ( rule__SignedInteger__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:804:2: rule__SignedInteger__Group__0
            {
            pushFollow(FOLLOW_rule__SignedInteger__Group__0_in_ruleSignedInteger1654);
            rule__SignedInteger__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignedIntegerAccess().getGroup()); 
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
    // $ANTLR end "ruleSignedInteger"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:818:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:819:1: ( ruleQualifiedName EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:820:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1683);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1690); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:827:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:831:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:832:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:832:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:833:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:834:1: ( rule__QualifiedName__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:834:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1716);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleComparisonOperator"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:847:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:851:1: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:852:1: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:852:1: ( ( rule__ComparisonOperator__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:853:1: ( rule__ComparisonOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:854:1: ( rule__ComparisonOperator__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:854:2: rule__ComparisonOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__ComparisonOperator__Alternatives_in_ruleComparisonOperator1753);
            rule__ComparisonOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "ruleLogicalOperator"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:866:1: ruleLogicalOperator : ( ( rule__LogicalOperator__Alternatives ) ) ;
    public final void ruleLogicalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:870:1: ( ( ( rule__LogicalOperator__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:871:1: ( ( rule__LogicalOperator__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:871:1: ( ( rule__LogicalOperator__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:872:1: ( rule__LogicalOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOperatorAccess().getAlternatives()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:873:1: ( rule__LogicalOperator__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:873:2: rule__LogicalOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__LogicalOperator__Alternatives_in_ruleLogicalOperator1789);
            rule__LogicalOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOperatorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleLogicalOperator"


    // $ANTLR start "ruleLineStyle"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:885:1: ruleLineStyle : ( ( rule__LineStyle__Alternatives ) ) ;
    public final void ruleLineStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:889:1: ( ( ( rule__LineStyle__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:890:1: ( ( rule__LineStyle__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:890:1: ( ( rule__LineStyle__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:891:1: ( rule__LineStyle__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineStyleAccess().getAlternatives()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:892:1: ( rule__LineStyle__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:892:2: rule__LineStyle__Alternatives
            {
            pushFollow(FOLLOW_rule__LineStyle__Alternatives_in_ruleLineStyle1825);
            rule__LineStyle__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLineStyleAccess().getAlternatives()); 
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
    // $ANTLR end "ruleLineStyle"


    // $ANTLR start "ruleColors"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:904:1: ruleColors : ( ( rule__Colors__Alternatives ) ) ;
    public final void ruleColors() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:908:1: ( ( ( rule__Colors__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:909:1: ( ( rule__Colors__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:909:1: ( ( rule__Colors__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:910:1: ( rule__Colors__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorsAccess().getAlternatives()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:911:1: ( rule__Colors__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:911:2: rule__Colors__Alternatives
            {
            pushFollow(FOLLOW_rule__Colors__Alternatives_in_ruleColors1861);
            rule__Colors__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorsAccess().getAlternatives()); 
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
    // $ANTLR end "ruleColors"


    // $ANTLR start "ruleDirections"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:923:1: ruleDirections : ( ( rule__Directions__Alternatives ) ) ;
    public final void ruleDirections() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:927:1: ( ( ( rule__Directions__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:928:1: ( ( rule__Directions__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:928:1: ( ( rule__Directions__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:929:1: ( rule__Directions__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectionsAccess().getAlternatives()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:930:1: ( rule__Directions__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:930:2: rule__Directions__Alternatives
            {
            pushFollow(FOLLOW_rule__Directions__Alternatives_in_ruleDirections1897);
            rule__Directions__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectionsAccess().getAlternatives()); 
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
    // $ANTLR end "ruleDirections"


    // $ANTLR start "rule__AbstractDecoration__Alternatives"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:941:1: rule__AbstractDecoration__Alternatives : ( ( ruleImageDecoration ) | ( ruleBorderDecoration ) | ( ruleColorDecoration ) | ( ruleConnectionDecoration ) );
    public final void rule__AbstractDecoration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:945:1: ( ( ruleImageDecoration ) | ( ruleBorderDecoration ) | ( ruleColorDecoration ) | ( ruleConnectionDecoration ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt1=1;
                }
                break;
            case 59:
                {
                alt1=2;
                }
                break;
            case 60:
                {
                alt1=3;
                }
                break;
            case 63:
                {
                alt1=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:946:1: ( ruleImageDecoration )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:946:1: ( ruleImageDecoration )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:947:1: ruleImageDecoration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractDecorationAccess().getImageDecorationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleImageDecoration_in_rule__AbstractDecoration__Alternatives1932);
                    ruleImageDecoration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractDecorationAccess().getImageDecorationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:952:6: ( ruleBorderDecoration )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:952:6: ( ruleBorderDecoration )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:953:1: ruleBorderDecoration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractDecorationAccess().getBorderDecorationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleBorderDecoration_in_rule__AbstractDecoration__Alternatives1949);
                    ruleBorderDecoration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractDecorationAccess().getBorderDecorationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:958:6: ( ruleColorDecoration )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:958:6: ( ruleColorDecoration )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:959:1: ruleColorDecoration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractDecorationAccess().getColorDecorationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleColorDecoration_in_rule__AbstractDecoration__Alternatives1966);
                    ruleColorDecoration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractDecorationAccess().getColorDecorationParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:964:6: ( ruleConnectionDecoration )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:964:6: ( ruleConnectionDecoration )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:965:1: ruleConnectionDecoration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractDecorationAccess().getConnectionDecorationParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleConnectionDecoration_in_rule__AbstractDecoration__Alternatives1983);
                    ruleConnectionDecoration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractDecorationAccess().getConnectionDecorationParserRuleCall_3()); 
                    }

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
    // $ANTLR end "rule__AbstractDecoration__Alternatives"


    // $ANTLR start "rule__Text__Alternatives"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:975:1: rule__Text__Alternatives : ( ( ruleSimpleText ) | ( ruleComplexText ) );
    public final void rule__Text__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:979:1: ( ( ruleSimpleText ) | ( ruleComplexText ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:980:1: ( ruleSimpleText )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:980:1: ( ruleSimpleText )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:981:1: ruleSimpleText
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getSimpleTextParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSimpleText_in_rule__Text__Alternatives2015);
                    ruleSimpleText();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextAccess().getSimpleTextParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:986:6: ( ruleComplexText )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:986:6: ( ruleComplexText )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:987:1: ruleComplexText
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getComplexTextParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleComplexText_in_rule__Text__Alternatives2032);
                    ruleComplexText();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextAccess().getComplexTextParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Text__Alternatives"


    // $ANTLR start "rule__SimpleText__Alternatives"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:997:1: rule__SimpleText__Alternatives : ( ( ( rule__SimpleText__TextAssignment_0 ) ) | ( ( rule__SimpleText__AttributeAssignment_1 ) ) );
    public final void rule__SimpleText__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1001:1: ( ( ( rule__SimpleText__TextAssignment_0 ) ) | ( ( rule__SimpleText__AttributeAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1002:1: ( ( rule__SimpleText__TextAssignment_0 ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1002:1: ( ( rule__SimpleText__TextAssignment_0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1003:1: ( rule__SimpleText__TextAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleTextAccess().getTextAssignment_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1004:1: ( rule__SimpleText__TextAssignment_0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1004:2: rule__SimpleText__TextAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SimpleText__TextAssignment_0_in_rule__SimpleText__Alternatives2064);
                    rule__SimpleText__TextAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleTextAccess().getTextAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1008:6: ( ( rule__SimpleText__AttributeAssignment_1 ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1008:6: ( ( rule__SimpleText__AttributeAssignment_1 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1009:1: ( rule__SimpleText__AttributeAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleTextAccess().getAttributeAssignment_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1010:1: ( rule__SimpleText__AttributeAssignment_1 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1010:2: rule__SimpleText__AttributeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SimpleText__AttributeAssignment_1_in_rule__SimpleText__Alternatives2082);
                    rule__SimpleText__AttributeAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleTextAccess().getAttributeAssignment_1()); 
                    }

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
    // $ANTLR end "rule__SimpleText__Alternatives"


    // $ANTLR start "rule__Color__Alternatives"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1019:1: rule__Color__Alternatives : ( ( ( rule__Color__Group_0__0 ) ) | ( ( rule__Color__ConcreteAssignment_1 ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1023:1: ( ( ( rule__Color__Group_0__0 ) ) | ( ( rule__Color__ConcreteAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=26 && LA4_0<=40)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_HEX_COLOR||LA4_0==71) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1024:1: ( ( rule__Color__Group_0__0 ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1024:1: ( ( rule__Color__Group_0__0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1025:1: ( rule__Color__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorAccess().getGroup_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1026:1: ( rule__Color__Group_0__0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1026:2: rule__Color__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Color__Group_0__0_in_rule__Color__Alternatives2115);
                    rule__Color__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1030:6: ( ( rule__Color__ConcreteAssignment_1 ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1030:6: ( ( rule__Color__ConcreteAssignment_1 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1031:1: ( rule__Color__ConcreteAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorAccess().getConcreteAssignment_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1032:1: ( rule__Color__ConcreteAssignment_1 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1032:2: rule__Color__ConcreteAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Color__ConcreteAssignment_1_in_rule__Color__Alternatives2133);
                    rule__Color__ConcreteAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorAccess().getConcreteAssignment_1()); 
                    }

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
    // $ANTLR end "rule__Color__Alternatives"


    // $ANTLR start "rule__ConcreteColor__Alternatives"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1041:1: rule__ConcreteColor__Alternatives : ( ( ruleRGB ) | ( ruleHexColor ) );
    public final void rule__ConcreteColor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1045:1: ( ( ruleRGB ) | ( ruleHexColor ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==71) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_HEX_COLOR) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1046:1: ( ruleRGB )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1046:1: ( ruleRGB )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1047:1: ruleRGB
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConcreteColorAccess().getRGBParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleRGB_in_rule__ConcreteColor__Alternatives2166);
                    ruleRGB();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConcreteColorAccess().getRGBParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1052:6: ( ruleHexColor )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1052:6: ( ruleHexColor )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1053:1: ruleHexColor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConcreteColorAccess().getHexColorParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleHexColor_in_rule__ConcreteColor__Alternatives2183);
                    ruleHexColor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConcreteColorAccess().getHexColorParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__ConcreteColor__Alternatives"


    // $ANTLR start "rule__AbstractCondition__Alternatives"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1063:1: rule__AbstractCondition__Alternatives : ( ( ruleCondition ) | ( ruleCompositeCondition ) );
    public final void rule__AbstractCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1067:1: ( ( ruleCondition ) | ( ruleCompositeCondition ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=19 && LA6_0<=20)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1068:1: ( ruleCondition )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1068:1: ( ruleCondition )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1069:1: ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractConditionAccess().getConditionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCondition_in_rule__AbstractCondition__Alternatives2215);
                    ruleCondition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractConditionAccess().getConditionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1074:6: ( ruleCompositeCondition )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1074:6: ( ruleCompositeCondition )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1075:1: ruleCompositeCondition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractConditionAccess().getCompositeConditionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCompositeCondition_in_rule__AbstractCondition__Alternatives2232);
                    ruleCompositeCondition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractConditionAccess().getCompositeConditionParserRuleCall_1()); 
                    }

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1085:1: rule__Type__Alternatives : ( ( ruleSignedInteger ) | ( ruleSignedDouble ) | ( RULE_STRING ) | ( RULE_BOOLEAN ) | ( RULE_ID ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1089:1: ( ( ruleSignedInteger ) | ( ruleSignedDouble ) | ( RULE_STRING ) | ( RULE_BOOLEAN ) | ( RULE_ID ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 76:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_INT) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==77) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==EOF||LA7_2==RULE_ID||(LA7_2>=19 && LA7_2<=20)||(LA7_2>=54 && LA7_2<=56)||(LA7_2>=58 && LA7_2<=65)||(LA7_2>=67 && LA7_2<=70)||(LA7_2>=74 && LA7_2<=75)) ) {
                        alt7=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==77) ) {
                    alt7=2;
                }
                else if ( (LA7_2==EOF||LA7_2==RULE_ID||(LA7_2>=19 && LA7_2<=20)||(LA7_2>=54 && LA7_2<=56)||(LA7_2>=58 && LA7_2<=65)||(LA7_2>=67 && LA7_2<=70)||(LA7_2>=74 && LA7_2<=75)) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt7=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt7=4;
                }
                break;
            case RULE_ID:
                {
                alt7=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1090:1: ( ruleSignedInteger )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1090:1: ( ruleSignedInteger )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1091:1: ruleSignedInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getSignedIntegerParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSignedInteger_in_rule__Type__Alternatives2264);
                    ruleSignedInteger();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getSignedIntegerParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1096:6: ( ruleSignedDouble )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1096:6: ( ruleSignedDouble )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1097:1: ruleSignedDouble
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getSignedDoubleParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSignedDouble_in_rule__Type__Alternatives2281);
                    ruleSignedDouble();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getSignedDoubleParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1102:6: ( RULE_STRING )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1102:6: ( RULE_STRING )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1103:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getSTRINGTerminalRuleCall_2()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Type__Alternatives2298); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getSTRINGTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1108:6: ( RULE_BOOLEAN )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1108:6: ( RULE_BOOLEAN )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1109:1: RULE_BOOLEAN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getBOOLEANTerminalRuleCall_3()); 
                    }
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__Type__Alternatives2315); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getBOOLEANTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1114:6: ( RULE_ID )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1114:6: ( RULE_ID )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1115:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getIDTerminalRuleCall_4()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__Alternatives2332); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getIDTerminalRuleCall_4()); 
                    }

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1125:1: rule__ComparisonOperator__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1129:1: ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt8=1;
                }
                break;
            case 14:
                {
                alt8=2;
                }
                break;
            case 15:
                {
                alt8=3;
                }
                break;
            case 16:
                {
                alt8=4;
                }
                break;
            case 17:
                {
                alt8=5;
                }
                break;
            case 18:
                {
                alt8=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1130:1: ( ( '==' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1130:1: ( ( '==' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1131:1: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1132:1: ( '==' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1132:3: '=='
                    {
                    match(input,13,FOLLOW_13_in_rule__ComparisonOperator__Alternatives2365); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1137:6: ( ( '!=' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1137:6: ( ( '!=' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1138:1: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getUNEQUALEnumLiteralDeclaration_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1139:1: ( '!=' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1139:3: '!='
                    {
                    match(input,14,FOLLOW_14_in_rule__ComparisonOperator__Alternatives2386); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getUNEQUALEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1144:6: ( ( '>' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1144:6: ( ( '>' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1145:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1146:1: ( '>' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1146:3: '>'
                    {
                    match(input,15,FOLLOW_15_in_rule__ComparisonOperator__Alternatives2407); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1151:6: ( ( '>=' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1151:6: ( ( '>=' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1152:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getGREATEROREQUALEnumLiteralDeclaration_3()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1153:1: ( '>=' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1153:3: '>='
                    {
                    match(input,16,FOLLOW_16_in_rule__ComparisonOperator__Alternatives2428); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getGREATEROREQUALEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1158:6: ( ( '<' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1158:6: ( ( '<' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1159:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getLOWEREnumLiteralDeclaration_4()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1160:1: ( '<' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1160:3: '<'
                    {
                    match(input,17,FOLLOW_17_in_rule__ComparisonOperator__Alternatives2449); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getLOWEREnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1165:6: ( ( '<=' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1165:6: ( ( '<=' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1166:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getLOWEROREQUALEnumLiteralDeclaration_5()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1167:1: ( '<=' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1167:3: '<='
                    {
                    match(input,18,FOLLOW_18_in_rule__ComparisonOperator__Alternatives2470); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getLOWEROREQUALEnumLiteralDeclaration_5()); 
                    }

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1177:1: rule__LogicalOperator__Alternatives : ( ( ( 'all' ) ) | ( ( 'any' ) ) );
    public final void rule__LogicalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1181:1: ( ( ( 'all' ) ) | ( ( 'any' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( (LA9_0==20) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1182:1: ( ( 'all' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1182:1: ( ( 'all' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1183:1: ( 'all' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicalOperatorAccess().getALLEnumLiteralDeclaration_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1184:1: ( 'all' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1184:3: 'all'
                    {
                    match(input,19,FOLLOW_19_in_rule__LogicalOperator__Alternatives2506); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicalOperatorAccess().getALLEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1189:6: ( ( 'any' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1189:6: ( ( 'any' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1190:1: ( 'any' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicalOperatorAccess().getANYEnumLiteralDeclaration_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1191:1: ( 'any' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1191:3: 'any'
                    {
                    match(input,20,FOLLOW_20_in_rule__LogicalOperator__Alternatives2527); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicalOperatorAccess().getANYEnumLiteralDeclaration_1()); 
                    }

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


    // $ANTLR start "rule__LineStyle__Alternatives"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1201:1: rule__LineStyle__Alternatives : ( ( ( 'solid' ) ) | ( ( 'dot' ) ) | ( ( 'dash' ) ) | ( ( 'dash_dot' ) ) | ( ( 'dash_dot_dot' ) ) );
    public final void rule__LineStyle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1205:1: ( ( ( 'solid' ) ) | ( ( 'dot' ) ) | ( ( 'dash' ) ) | ( ( 'dash_dot' ) ) | ( ( 'dash_dot_dot' ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case 22:
                {
                alt10=2;
                }
                break;
            case 23:
                {
                alt10=3;
                }
                break;
            case 24:
                {
                alt10=4;
                }
                break;
            case 25:
                {
                alt10=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1206:1: ( ( 'solid' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1206:1: ( ( 'solid' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1207:1: ( 'solid' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLineStyleAccess().getLINE_SOLIDEnumLiteralDeclaration_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1208:1: ( 'solid' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1208:3: 'solid'
                    {
                    match(input,21,FOLLOW_21_in_rule__LineStyle__Alternatives2563); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLineStyleAccess().getLINE_SOLIDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1213:6: ( ( 'dot' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1213:6: ( ( 'dot' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1214:1: ( 'dot' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLineStyleAccess().getLINE_DOTEnumLiteralDeclaration_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1215:1: ( 'dot' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1215:3: 'dot'
                    {
                    match(input,22,FOLLOW_22_in_rule__LineStyle__Alternatives2584); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLineStyleAccess().getLINE_DOTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1220:6: ( ( 'dash' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1220:6: ( ( 'dash' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1221:1: ( 'dash' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLineStyleAccess().getLINE_DASHEnumLiteralDeclaration_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1222:1: ( 'dash' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1222:3: 'dash'
                    {
                    match(input,23,FOLLOW_23_in_rule__LineStyle__Alternatives2605); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLineStyleAccess().getLINE_DASHEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1227:6: ( ( 'dash_dot' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1227:6: ( ( 'dash_dot' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1228:1: ( 'dash_dot' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLineStyleAccess().getLINE_DASHDOTEnumLiteralDeclaration_3()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1229:1: ( 'dash_dot' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1229:3: 'dash_dot'
                    {
                    match(input,24,FOLLOW_24_in_rule__LineStyle__Alternatives2626); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLineStyleAccess().getLINE_DASHDOTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1234:6: ( ( 'dash_dot_dot' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1234:6: ( ( 'dash_dot_dot' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1235:1: ( 'dash_dot_dot' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLineStyleAccess().getLINE_DASHDOTDOTEnumLiteralDeclaration_4()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1236:1: ( 'dash_dot_dot' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1236:3: 'dash_dot_dot'
                    {
                    match(input,25,FOLLOW_25_in_rule__LineStyle__Alternatives2647); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLineStyleAccess().getLINE_DASHDOTDOTEnumLiteralDeclaration_4()); 
                    }

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
    // $ANTLR end "rule__LineStyle__Alternatives"


    // $ANTLR start "rule__Colors__Alternatives"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1246:1: rule__Colors__Alternatives : ( ( ( 'red' ) ) | ( ( 'black' ) ) | ( ( 'white' ) ) | ( ( 'green' ) ) | ( ( 'green_light' ) ) | ( ( 'green_dark' ) ) | ( ( 'blue' ) ) | ( ( 'blue_light' ) ) | ( ( 'blue_dark' ) ) | ( ( 'gray' ) ) | ( ( 'gray_light' ) ) | ( ( 'gray_dark' ) ) | ( ( 'orange' ) ) | ( ( 'yellow' ) ) | ( ( 'cyan' ) ) );
    public final void rule__Colors__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1250:1: ( ( ( 'red' ) ) | ( ( 'black' ) ) | ( ( 'white' ) ) | ( ( 'green' ) ) | ( ( 'green_light' ) ) | ( ( 'green_dark' ) ) | ( ( 'blue' ) ) | ( ( 'blue_light' ) ) | ( ( 'blue_dark' ) ) | ( ( 'gray' ) ) | ( ( 'gray_light' ) ) | ( ( 'gray_dark' ) ) | ( ( 'orange' ) ) | ( ( 'yellow' ) ) | ( ( 'cyan' ) ) )
            int alt11=15;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt11=1;
                }
                break;
            case 27:
                {
                alt11=2;
                }
                break;
            case 28:
                {
                alt11=3;
                }
                break;
            case 29:
                {
                alt11=4;
                }
                break;
            case 30:
                {
                alt11=5;
                }
                break;
            case 31:
                {
                alt11=6;
                }
                break;
            case 32:
                {
                alt11=7;
                }
                break;
            case 33:
                {
                alt11=8;
                }
                break;
            case 34:
                {
                alt11=9;
                }
                break;
            case 35:
                {
                alt11=10;
                }
                break;
            case 36:
                {
                alt11=11;
                }
                break;
            case 37:
                {
                alt11=12;
                }
                break;
            case 38:
                {
                alt11=13;
                }
                break;
            case 39:
                {
                alt11=14;
                }
                break;
            case 40:
                {
                alt11=15;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1251:1: ( ( 'red' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1251:1: ( ( 'red' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1252:1: ( 'red' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1253:1: ( 'red' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1253:3: 'red'
                    {
                    match(input,26,FOLLOW_26_in_rule__Colors__Alternatives2683); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1258:6: ( ( 'black' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1258:6: ( ( 'black' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1259:1: ( 'black' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1260:1: ( 'black' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1260:3: 'black'
                    {
                    match(input,27,FOLLOW_27_in_rule__Colors__Alternatives2704); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1265:6: ( ( 'white' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1265:6: ( ( 'white' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1266:1: ( 'white' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1267:1: ( 'white' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1267:3: 'white'
                    {
                    match(input,28,FOLLOW_28_in_rule__Colors__Alternatives2725); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1272:6: ( ( 'green' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1272:6: ( ( 'green' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1273:1: ( 'green' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_3()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1274:1: ( 'green' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1274:3: 'green'
                    {
                    match(input,29,FOLLOW_29_in_rule__Colors__Alternatives2746); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1279:6: ( ( 'green_light' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1279:6: ( ( 'green_light' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1280:1: ( 'green_light' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getGREEN_LIGHTEnumLiteralDeclaration_4()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1281:1: ( 'green_light' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1281:3: 'green_light'
                    {
                    match(input,30,FOLLOW_30_in_rule__Colors__Alternatives2767); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getGREEN_LIGHTEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1286:6: ( ( 'green_dark' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1286:6: ( ( 'green_dark' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1287:1: ( 'green_dark' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getGREEN_DARKEnumLiteralDeclaration_5()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1288:1: ( 'green_dark' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1288:3: 'green_dark'
                    {
                    match(input,31,FOLLOW_31_in_rule__Colors__Alternatives2788); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getGREEN_DARKEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1293:6: ( ( 'blue' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1293:6: ( ( 'blue' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1294:1: ( 'blue' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_6()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1295:1: ( 'blue' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1295:3: 'blue'
                    {
                    match(input,32,FOLLOW_32_in_rule__Colors__Alternatives2809); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1300:6: ( ( 'blue_light' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1300:6: ( ( 'blue_light' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1301:1: ( 'blue_light' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getBLUE_LIGHTEnumLiteralDeclaration_7()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1302:1: ( 'blue_light' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1302:3: 'blue_light'
                    {
                    match(input,33,FOLLOW_33_in_rule__Colors__Alternatives2830); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getBLUE_LIGHTEnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1307:6: ( ( 'blue_dark' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1307:6: ( ( 'blue_dark' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1308:1: ( 'blue_dark' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getBLUE_DARKEnumLiteralDeclaration_8()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1309:1: ( 'blue_dark' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1309:3: 'blue_dark'
                    {
                    match(input,34,FOLLOW_34_in_rule__Colors__Alternatives2851); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getBLUE_DARKEnumLiteralDeclaration_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1314:6: ( ( 'gray' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1314:6: ( ( 'gray' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1315:1: ( 'gray' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_9()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1316:1: ( 'gray' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1316:3: 'gray'
                    {
                    match(input,35,FOLLOW_35_in_rule__Colors__Alternatives2872); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1321:6: ( ( 'gray_light' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1321:6: ( ( 'gray_light' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1322:1: ( 'gray_light' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getGRAY_LIGHTEnumLiteralDeclaration_10()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1323:1: ( 'gray_light' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1323:3: 'gray_light'
                    {
                    match(input,36,FOLLOW_36_in_rule__Colors__Alternatives2893); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getGRAY_LIGHTEnumLiteralDeclaration_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1328:6: ( ( 'gray_dark' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1328:6: ( ( 'gray_dark' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1329:1: ( 'gray_dark' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getGRAY_DARKEnumLiteralDeclaration_11()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1330:1: ( 'gray_dark' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1330:3: 'gray_dark'
                    {
                    match(input,37,FOLLOW_37_in_rule__Colors__Alternatives2914); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getGRAY_DARKEnumLiteralDeclaration_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1335:6: ( ( 'orange' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1335:6: ( ( 'orange' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1336:1: ( 'orange' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_12()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1337:1: ( 'orange' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1337:3: 'orange'
                    {
                    match(input,38,FOLLOW_38_in_rule__Colors__Alternatives2935); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1342:6: ( ( 'yellow' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1342:6: ( ( 'yellow' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1343:1: ( 'yellow' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_13()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1344:1: ( 'yellow' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1344:3: 'yellow'
                    {
                    match(input,39,FOLLOW_39_in_rule__Colors__Alternatives2956); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1349:6: ( ( 'cyan' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1349:6: ( ( 'cyan' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1350:1: ( 'cyan' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getCYANEnumLiteralDeclaration_14()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1351:1: ( 'cyan' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1351:3: 'cyan'
                    {
                    match(input,40,FOLLOW_40_in_rule__Colors__Alternatives2977); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getCYANEnumLiteralDeclaration_14()); 
                    }

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
    // $ANTLR end "rule__Colors__Alternatives"


    // $ANTLR start "rule__Directions__Alternatives"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1361:1: rule__Directions__Alternatives : ( ( ( 'center' ) ) | ( ( 'north' ) ) | ( ( 'south' ) ) | ( ( 'west' ) ) | ( ( 'east' ) ) | ( ( 'north_east' ) ) | ( ( 'north_west' ) ) | ( ( 'south_east' ) ) | ( ( 'south_west' ) ) );
    public final void rule__Directions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1365:1: ( ( ( 'center' ) ) | ( ( 'north' ) ) | ( ( 'south' ) ) | ( ( 'west' ) ) | ( ( 'east' ) ) | ( ( 'north_east' ) ) | ( ( 'north_west' ) ) | ( ( 'south_east' ) ) | ( ( 'south_west' ) ) )
            int alt12=9;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt12=1;
                }
                break;
            case 42:
                {
                alt12=2;
                }
                break;
            case 43:
                {
                alt12=3;
                }
                break;
            case 44:
                {
                alt12=4;
                }
                break;
            case 45:
                {
                alt12=5;
                }
                break;
            case 46:
                {
                alt12=6;
                }
                break;
            case 47:
                {
                alt12=7;
                }
                break;
            case 48:
                {
                alt12=8;
                }
                break;
            case 49:
                {
                alt12=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1366:1: ( ( 'center' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1366:1: ( ( 'center' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1367:1: ( 'center' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getCENTEREnumLiteralDeclaration_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1368:1: ( 'center' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1368:3: 'center'
                    {
                    match(input,41,FOLLOW_41_in_rule__Directions__Alternatives3013); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getCENTEREnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1373:6: ( ( 'north' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1373:6: ( ( 'north' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1374:1: ( 'north' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getNORHTEnumLiteralDeclaration_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1375:1: ( 'north' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1375:3: 'north'
                    {
                    match(input,42,FOLLOW_42_in_rule__Directions__Alternatives3034); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getNORHTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1380:6: ( ( 'south' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1380:6: ( ( 'south' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1381:1: ( 'south' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getSOUTHEnumLiteralDeclaration_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1382:1: ( 'south' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1382:3: 'south'
                    {
                    match(input,43,FOLLOW_43_in_rule__Directions__Alternatives3055); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getSOUTHEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1387:6: ( ( 'west' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1387:6: ( ( 'west' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1388:1: ( 'west' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getWESTEnumLiteralDeclaration_3()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1389:1: ( 'west' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1389:3: 'west'
                    {
                    match(input,44,FOLLOW_44_in_rule__Directions__Alternatives3076); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getWESTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1394:6: ( ( 'east' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1394:6: ( ( 'east' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1395:1: ( 'east' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getEASTEnumLiteralDeclaration_4()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1396:1: ( 'east' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1396:3: 'east'
                    {
                    match(input,45,FOLLOW_45_in_rule__Directions__Alternatives3097); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getEASTEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1401:6: ( ( 'north_east' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1401:6: ( ( 'north_east' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1402:1: ( 'north_east' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getNORTH_EASTEnumLiteralDeclaration_5()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1403:1: ( 'north_east' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1403:3: 'north_east'
                    {
                    match(input,46,FOLLOW_46_in_rule__Directions__Alternatives3118); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getNORTH_EASTEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1408:6: ( ( 'north_west' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1408:6: ( ( 'north_west' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1409:1: ( 'north_west' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getNORTH_WESTEnumLiteralDeclaration_6()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1410:1: ( 'north_west' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1410:3: 'north_west'
                    {
                    match(input,47,FOLLOW_47_in_rule__Directions__Alternatives3139); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getNORTH_WESTEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1415:6: ( ( 'south_east' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1415:6: ( ( 'south_east' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1416:1: ( 'south_east' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getSOUTH_EASTEnumLiteralDeclaration_7()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1417:1: ( 'south_east' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1417:3: 'south_east'
                    {
                    match(input,48,FOLLOW_48_in_rule__Directions__Alternatives3160); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getSOUTH_EASTEnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1422:6: ( ( 'south_west' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1422:6: ( ( 'south_west' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1423:1: ( 'south_west' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getSOUTH_WESTEnumLiteralDeclaration_8()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1424:1: ( 'south_west' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1424:3: 'south_west'
                    {
                    match(input,49,FOLLOW_49_in_rule__Directions__Alternatives3181); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getSOUTH_WESTEnumLiteralDeclaration_8()); 
                    }

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
    // $ANTLR end "rule__Directions__Alternatives"


    // $ANTLR start "rule__DecorationModel__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1436:1: rule__DecorationModel__Group__0 : rule__DecorationModel__Group__0__Impl rule__DecorationModel__Group__1 ;
    public final void rule__DecorationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1440:1: ( rule__DecorationModel__Group__0__Impl rule__DecorationModel__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1441:2: rule__DecorationModel__Group__0__Impl rule__DecorationModel__Group__1
            {
            pushFollow(FOLLOW_rule__DecorationModel__Group__0__Impl_in_rule__DecorationModel__Group__03214);
            rule__DecorationModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DecorationModel__Group__1_in_rule__DecorationModel__Group__03217);
            rule__DecorationModel__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1448:1: rule__DecorationModel__Group__0__Impl : ( 'import resource' ) ;
    public final void rule__DecorationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1452:1: ( ( 'import resource' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1453:1: ( 'import resource' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1453:1: ( 'import resource' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1454:1: 'import resource'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationModelAccess().getImportResourceKeyword_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__DecorationModel__Group__0__Impl3245); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecorationModelAccess().getImportResourceKeyword_0()); 
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
    // $ANTLR end "rule__DecorationModel__Group__0__Impl"


    // $ANTLR start "rule__DecorationModel__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1467:1: rule__DecorationModel__Group__1 : rule__DecorationModel__Group__1__Impl rule__DecorationModel__Group__2 ;
    public final void rule__DecorationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1471:1: ( rule__DecorationModel__Group__1__Impl rule__DecorationModel__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1472:2: rule__DecorationModel__Group__1__Impl rule__DecorationModel__Group__2
            {
            pushFollow(FOLLOW_rule__DecorationModel__Group__1__Impl_in_rule__DecorationModel__Group__13276);
            rule__DecorationModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DecorationModel__Group__2_in_rule__DecorationModel__Group__13279);
            rule__DecorationModel__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1479:1: rule__DecorationModel__Group__1__Impl : ( ( rule__DecorationModel__ImportURIAssignment_1 ) ) ;
    public final void rule__DecorationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1483:1: ( ( ( rule__DecorationModel__ImportURIAssignment_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1484:1: ( ( rule__DecorationModel__ImportURIAssignment_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1484:1: ( ( rule__DecorationModel__ImportURIAssignment_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1485:1: ( rule__DecorationModel__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationModelAccess().getImportURIAssignment_1()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1486:1: ( rule__DecorationModel__ImportURIAssignment_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1486:2: rule__DecorationModel__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__DecorationModel__ImportURIAssignment_1_in_rule__DecorationModel__Group__1__Impl3306);
            rule__DecorationModel__ImportURIAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecorationModelAccess().getImportURIAssignment_1()); 
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
    // $ANTLR end "rule__DecorationModel__Group__1__Impl"


    // $ANTLR start "rule__DecorationModel__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1496:1: rule__DecorationModel__Group__2 : rule__DecorationModel__Group__2__Impl rule__DecorationModel__Group__3 ;
    public final void rule__DecorationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1500:1: ( rule__DecorationModel__Group__2__Impl rule__DecorationModel__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1501:2: rule__DecorationModel__Group__2__Impl rule__DecorationModel__Group__3
            {
            pushFollow(FOLLOW_rule__DecorationModel__Group__2__Impl_in_rule__DecorationModel__Group__23336);
            rule__DecorationModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DecorationModel__Group__3_in_rule__DecorationModel__Group__23339);
            rule__DecorationModel__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1508:1: rule__DecorationModel__Group__2__Impl : ( ( rule__DecorationModel__NamespaceAssignment_2 )? ) ;
    public final void rule__DecorationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1512:1: ( ( ( rule__DecorationModel__NamespaceAssignment_2 )? ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1513:1: ( ( rule__DecorationModel__NamespaceAssignment_2 )? )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1513:1: ( ( rule__DecorationModel__NamespaceAssignment_2 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1514:1: ( rule__DecorationModel__NamespaceAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationModelAccess().getNamespaceAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1515:1: ( rule__DecorationModel__NamespaceAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==51) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1515:2: rule__DecorationModel__NamespaceAssignment_2
                    {
                    pushFollow(FOLLOW_rule__DecorationModel__NamespaceAssignment_2_in_rule__DecorationModel__Group__2__Impl3366);
                    rule__DecorationModel__NamespaceAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecorationModelAccess().getNamespaceAssignment_2()); 
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
    // $ANTLR end "rule__DecorationModel__Group__2__Impl"


    // $ANTLR start "rule__DecorationModel__Group__3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1525:1: rule__DecorationModel__Group__3 : rule__DecorationModel__Group__3__Impl ;
    public final void rule__DecorationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1529:1: ( rule__DecorationModel__Group__3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1530:2: rule__DecorationModel__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DecorationModel__Group__3__Impl_in_rule__DecorationModel__Group__33397);
            rule__DecorationModel__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1536:1: rule__DecorationModel__Group__3__Impl : ( ( rule__DecorationModel__DecorationDescriptionsAssignment_3 )* ) ;
    public final void rule__DecorationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1540:1: ( ( ( rule__DecorationModel__DecorationDescriptionsAssignment_3 )* ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1541:1: ( ( rule__DecorationModel__DecorationDescriptionsAssignment_3 )* )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1541:1: ( ( rule__DecorationModel__DecorationDescriptionsAssignment_3 )* )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1542:1: ( rule__DecorationModel__DecorationDescriptionsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationModelAccess().getDecorationDescriptionsAssignment_3()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1543:1: ( rule__DecorationModel__DecorationDescriptionsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==52) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1543:2: rule__DecorationModel__DecorationDescriptionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__DecorationModel__DecorationDescriptionsAssignment_3_in_rule__DecorationModel__Group__3__Impl3424);
            	    rule__DecorationModel__DecorationDescriptionsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecorationModelAccess().getDecorationDescriptionsAssignment_3()); 
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
    // $ANTLR end "rule__DecorationModel__Group__3__Impl"


    // $ANTLR start "rule__Namespace__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1561:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1565:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1566:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__03463);
            rule__Namespace__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__03466);
            rule__Namespace__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1573:1: rule__Namespace__Group__0__Impl : ( 'profile' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1577:1: ( ( 'profile' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1578:1: ( 'profile' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1578:1: ( 'profile' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1579:1: 'profile'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceAccess().getProfileKeyword_0()); 
            }
            match(input,51,FOLLOW_51_in_rule__Namespace__Group__0__Impl3494); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceAccess().getProfileKeyword_0()); 
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
    // $ANTLR end "rule__Namespace__Group__0__Impl"


    // $ANTLR start "rule__Namespace__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1592:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1596:1: ( rule__Namespace__Group__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1597:2: rule__Namespace__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__13525);
            rule__Namespace__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1603:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__ProfileAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1607:1: ( ( ( rule__Namespace__ProfileAssignment_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1608:1: ( ( rule__Namespace__ProfileAssignment_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1608:1: ( ( rule__Namespace__ProfileAssignment_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1609:1: ( rule__Namespace__ProfileAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceAccess().getProfileAssignment_1()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1610:1: ( rule__Namespace__ProfileAssignment_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1610:2: rule__Namespace__ProfileAssignment_1
            {
            pushFollow(FOLLOW_rule__Namespace__ProfileAssignment_1_in_rule__Namespace__Group__1__Impl3552);
            rule__Namespace__ProfileAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceAccess().getProfileAssignment_1()); 
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
    // $ANTLR end "rule__Namespace__Group__1__Impl"


    // $ANTLR start "rule__DecorationDescription__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1624:1: rule__DecorationDescription__Group__0 : rule__DecorationDescription__Group__0__Impl rule__DecorationDescription__Group__1 ;
    public final void rule__DecorationDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1628:1: ( rule__DecorationDescription__Group__0__Impl rule__DecorationDescription__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1629:2: rule__DecorationDescription__Group__0__Impl rule__DecorationDescription__Group__1
            {
            pushFollow(FOLLOW_rule__DecorationDescription__Group__0__Impl_in_rule__DecorationDescription__Group__03586);
            rule__DecorationDescription__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DecorationDescription__Group__1_in_rule__DecorationDescription__Group__03589);
            rule__DecorationDescription__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1636:1: rule__DecorationDescription__Group__0__Impl : ( 'decoration' ) ;
    public final void rule__DecorationDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1640:1: ( ( 'decoration' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1641:1: ( 'decoration' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1641:1: ( 'decoration' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1642:1: 'decoration'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getDecorationKeyword_0()); 
            }
            match(input,52,FOLLOW_52_in_rule__DecorationDescription__Group__0__Impl3617); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecorationDescriptionAccess().getDecorationKeyword_0()); 
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
    // $ANTLR end "rule__DecorationDescription__Group__0__Impl"


    // $ANTLR start "rule__DecorationDescription__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1655:1: rule__DecorationDescription__Group__1 : rule__DecorationDescription__Group__1__Impl rule__DecorationDescription__Group__2 ;
    public final void rule__DecorationDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1659:1: ( rule__DecorationDescription__Group__1__Impl rule__DecorationDescription__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1660:2: rule__DecorationDescription__Group__1__Impl rule__DecorationDescription__Group__2
            {
            pushFollow(FOLLOW_rule__DecorationDescription__Group__1__Impl_in_rule__DecorationDescription__Group__13648);
            rule__DecorationDescription__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DecorationDescription__Group__2_in_rule__DecorationDescription__Group__13651);
            rule__DecorationDescription__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1667:1: rule__DecorationDescription__Group__1__Impl : ( ( rule__DecorationDescription__StereotypeAssignment_1 ) ) ;
    public final void rule__DecorationDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1671:1: ( ( ( rule__DecorationDescription__StereotypeAssignment_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1672:1: ( ( rule__DecorationDescription__StereotypeAssignment_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1672:1: ( ( rule__DecorationDescription__StereotypeAssignment_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1673:1: ( rule__DecorationDescription__StereotypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getStereotypeAssignment_1()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1674:1: ( rule__DecorationDescription__StereotypeAssignment_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1674:2: rule__DecorationDescription__StereotypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DecorationDescription__StereotypeAssignment_1_in_rule__DecorationDescription__Group__1__Impl3678);
            rule__DecorationDescription__StereotypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecorationDescriptionAccess().getStereotypeAssignment_1()); 
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
    // $ANTLR end "rule__DecorationDescription__Group__1__Impl"


    // $ANTLR start "rule__DecorationDescription__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1684:1: rule__DecorationDescription__Group__2 : rule__DecorationDescription__Group__2__Impl rule__DecorationDescription__Group__3 ;
    public final void rule__DecorationDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1688:1: ( rule__DecorationDescription__Group__2__Impl rule__DecorationDescription__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1689:2: rule__DecorationDescription__Group__2__Impl rule__DecorationDescription__Group__3
            {
            pushFollow(FOLLOW_rule__DecorationDescription__Group__2__Impl_in_rule__DecorationDescription__Group__23708);
            rule__DecorationDescription__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DecorationDescription__Group__3_in_rule__DecorationDescription__Group__23711);
            rule__DecorationDescription__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1696:1: rule__DecorationDescription__Group__2__Impl : ( '{' ) ;
    public final void rule__DecorationDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1700:1: ( ( '{' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1701:1: ( '{' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1701:1: ( '{' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1702:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,53,FOLLOW_53_in_rule__DecorationDescription__Group__2__Impl3739); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecorationDescriptionAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__DecorationDescription__Group__2__Impl"


    // $ANTLR start "rule__DecorationDescription__Group__3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1715:1: rule__DecorationDescription__Group__3 : rule__DecorationDescription__Group__3__Impl rule__DecorationDescription__Group__4 ;
    public final void rule__DecorationDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1719:1: ( rule__DecorationDescription__Group__3__Impl rule__DecorationDescription__Group__4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1720:2: rule__DecorationDescription__Group__3__Impl rule__DecorationDescription__Group__4
            {
            pushFollow(FOLLOW_rule__DecorationDescription__Group__3__Impl_in_rule__DecorationDescription__Group__33770);
            rule__DecorationDescription__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DecorationDescription__Group__4_in_rule__DecorationDescription__Group__33773);
            rule__DecorationDescription__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1727:1: rule__DecorationDescription__Group__3__Impl : ( ( rule__DecorationDescription__UnorderedGroup_3 ) ) ;
    public final void rule__DecorationDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1731:1: ( ( ( rule__DecorationDescription__UnorderedGroup_3 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1732:1: ( ( rule__DecorationDescription__UnorderedGroup_3 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1732:1: ( ( rule__DecorationDescription__UnorderedGroup_3 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1733:1: ( rule__DecorationDescription__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1734:1: ( rule__DecorationDescription__UnorderedGroup_3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1734:2: rule__DecorationDescription__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__DecorationDescription__UnorderedGroup_3_in_rule__DecorationDescription__Group__3__Impl3800);
            rule__DecorationDescription__UnorderedGroup_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3()); 
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1744:1: rule__DecorationDescription__Group__4 : rule__DecorationDescription__Group__4__Impl ;
    public final void rule__DecorationDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1748:1: ( rule__DecorationDescription__Group__4__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1749:2: rule__DecorationDescription__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DecorationDescription__Group__4__Impl_in_rule__DecorationDescription__Group__43830);
            rule__DecorationDescription__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1755:1: rule__DecorationDescription__Group__4__Impl : ( '}' ) ;
    public final void rule__DecorationDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1759:1: ( ( '}' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1760:1: ( '}' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1760:1: ( '}' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1761:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,54,FOLLOW_54_in_rule__DecorationDescription__Group__4__Impl3858); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecorationDescriptionAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__DecorationDescription__Group__4__Impl"


    // $ANTLR start "rule__ImageDecoration__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1784:1: rule__ImageDecoration__Group__0 : rule__ImageDecoration__Group__0__Impl rule__ImageDecoration__Group__1 ;
    public final void rule__ImageDecoration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1788:1: ( rule__ImageDecoration__Group__0__Impl rule__ImageDecoration__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1789:2: rule__ImageDecoration__Group__0__Impl rule__ImageDecoration__Group__1
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group__0__Impl_in_rule__ImageDecoration__Group__03899);
            rule__ImageDecoration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group__1_in_rule__ImageDecoration__Group__03902);
            rule__ImageDecoration__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ImageDecoration__Group__0"


    // $ANTLR start "rule__ImageDecoration__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1796:1: rule__ImageDecoration__Group__0__Impl : ( () ) ;
    public final void rule__ImageDecoration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1800:1: ( ( () ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1801:1: ( () )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1801:1: ( () )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1802:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getImageDecorationAction_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1803:1: ()
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1805:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageDecorationAccess().getImageDecorationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDecoration__Group__0__Impl"


    // $ANTLR start "rule__ImageDecoration__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1815:1: rule__ImageDecoration__Group__1 : rule__ImageDecoration__Group__1__Impl rule__ImageDecoration__Group__2 ;
    public final void rule__ImageDecoration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1819:1: ( rule__ImageDecoration__Group__1__Impl rule__ImageDecoration__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1820:2: rule__ImageDecoration__Group__1__Impl rule__ImageDecoration__Group__2
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group__1__Impl_in_rule__ImageDecoration__Group__13960);
            rule__ImageDecoration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group__2_in_rule__ImageDecoration__Group__13963);
            rule__ImageDecoration__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ImageDecoration__Group__1"


    // $ANTLR start "rule__ImageDecoration__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1827:1: rule__ImageDecoration__Group__1__Impl : ( 'image' ) ;
    public final void rule__ImageDecoration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1831:1: ( ( 'image' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1832:1: ( 'image' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1832:1: ( 'image' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1833:1: 'image'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getImageKeyword_1()); 
            }
            match(input,55,FOLLOW_55_in_rule__ImageDecoration__Group__1__Impl3991); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageDecorationAccess().getImageKeyword_1()); 
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
    // $ANTLR end "rule__ImageDecoration__Group__1__Impl"


    // $ANTLR start "rule__ImageDecoration__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1846:1: rule__ImageDecoration__Group__2 : rule__ImageDecoration__Group__2__Impl rule__ImageDecoration__Group__3 ;
    public final void rule__ImageDecoration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1850:1: ( rule__ImageDecoration__Group__2__Impl rule__ImageDecoration__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1851:2: rule__ImageDecoration__Group__2__Impl rule__ImageDecoration__Group__3
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group__2__Impl_in_rule__ImageDecoration__Group__24022);
            rule__ImageDecoration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group__3_in_rule__ImageDecoration__Group__24025);
            rule__ImageDecoration__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ImageDecoration__Group__2"


    // $ANTLR start "rule__ImageDecoration__Group__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1858:1: rule__ImageDecoration__Group__2__Impl : ( '{' ) ;
    public final void rule__ImageDecoration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1862:1: ( ( '{' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1863:1: ( '{' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1863:1: ( '{' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1864:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,53,FOLLOW_53_in_rule__ImageDecoration__Group__2__Impl4053); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageDecorationAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__ImageDecoration__Group__2__Impl"


    // $ANTLR start "rule__ImageDecoration__Group__3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1877:1: rule__ImageDecoration__Group__3 : rule__ImageDecoration__Group__3__Impl rule__ImageDecoration__Group__4 ;
    public final void rule__ImageDecoration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1881:1: ( rule__ImageDecoration__Group__3__Impl rule__ImageDecoration__Group__4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1882:2: rule__ImageDecoration__Group__3__Impl rule__ImageDecoration__Group__4
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group__3__Impl_in_rule__ImageDecoration__Group__34084);
            rule__ImageDecoration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group__4_in_rule__ImageDecoration__Group__34087);
            rule__ImageDecoration__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ImageDecoration__Group__3"


    // $ANTLR start "rule__ImageDecoration__Group__3__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1889:1: rule__ImageDecoration__Group__3__Impl : ( ( rule__ImageDecoration__UnorderedGroup_3 ) ) ;
    public final void rule__ImageDecoration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1893:1: ( ( ( rule__ImageDecoration__UnorderedGroup_3 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1894:1: ( ( rule__ImageDecoration__UnorderedGroup_3 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1894:1: ( ( rule__ImageDecoration__UnorderedGroup_3 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1895:1: ( rule__ImageDecoration__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1896:1: ( rule__ImageDecoration__UnorderedGroup_3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1896:2: rule__ImageDecoration__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3_in_rule__ImageDecoration__Group__3__Impl4114);
            rule__ImageDecoration__UnorderedGroup_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3()); 
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
    // $ANTLR end "rule__ImageDecoration__Group__3__Impl"


    // $ANTLR start "rule__ImageDecoration__Group__4"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1906:1: rule__ImageDecoration__Group__4 : rule__ImageDecoration__Group__4__Impl ;
    public final void rule__ImageDecoration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1910:1: ( rule__ImageDecoration__Group__4__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1911:2: rule__ImageDecoration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group__4__Impl_in_rule__ImageDecoration__Group__44144);
            rule__ImageDecoration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ImageDecoration__Group__4"


    // $ANTLR start "rule__ImageDecoration__Group__4__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1917:1: rule__ImageDecoration__Group__4__Impl : ( '}' ) ;
    public final void rule__ImageDecoration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1921:1: ( ( '}' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1922:1: ( '}' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1922:1: ( '}' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1923:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,54,FOLLOW_54_in_rule__ImageDecoration__Group__4__Impl4172); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageDecorationAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__ImageDecoration__Group__4__Impl"


    // $ANTLR start "rule__ImageDecoration__Group_3_0__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1946:1: rule__ImageDecoration__Group_3_0__0 : rule__ImageDecoration__Group_3_0__0__Impl rule__ImageDecoration__Group_3_0__1 ;
    public final void rule__ImageDecoration__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1950:1: ( rule__ImageDecoration__Group_3_0__0__Impl rule__ImageDecoration__Group_3_0__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1951:2: rule__ImageDecoration__Group_3_0__0__Impl rule__ImageDecoration__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_0__0__Impl_in_rule__ImageDecoration__Group_3_0__04213);
            rule__ImageDecoration__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_0__1_in_rule__ImageDecoration__Group_3_0__04216);
            rule__ImageDecoration__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ImageDecoration__Group_3_0__0"


    // $ANTLR start "rule__ImageDecoration__Group_3_0__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1958:1: rule__ImageDecoration__Group_3_0__0__Impl : ( 'location-uri' ) ;
    public final void rule__ImageDecoration__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1962:1: ( ( 'location-uri' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1963:1: ( 'location-uri' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1963:1: ( 'location-uri' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1964:1: 'location-uri'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getLocationUriKeyword_3_0_0()); 
            }
            match(input,56,FOLLOW_56_in_rule__ImageDecoration__Group_3_0__0__Impl4244); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageDecorationAccess().getLocationUriKeyword_3_0_0()); 
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
    // $ANTLR end "rule__ImageDecoration__Group_3_0__0__Impl"


    // $ANTLR start "rule__ImageDecoration__Group_3_0__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1977:1: rule__ImageDecoration__Group_3_0__1 : rule__ImageDecoration__Group_3_0__1__Impl rule__ImageDecoration__Group_3_0__2 ;
    public final void rule__ImageDecoration__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1981:1: ( rule__ImageDecoration__Group_3_0__1__Impl rule__ImageDecoration__Group_3_0__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1982:2: rule__ImageDecoration__Group_3_0__1__Impl rule__ImageDecoration__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_0__1__Impl_in_rule__ImageDecoration__Group_3_0__14275);
            rule__ImageDecoration__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_0__2_in_rule__ImageDecoration__Group_3_0__14278);
            rule__ImageDecoration__Group_3_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ImageDecoration__Group_3_0__1"


    // $ANTLR start "rule__ImageDecoration__Group_3_0__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1989:1: rule__ImageDecoration__Group_3_0__1__Impl : ( '=' ) ;
    public final void rule__ImageDecoration__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1993:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1994:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1994:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1995:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getEqualsSignKeyword_3_0_1()); 
            }
            match(input,57,FOLLOW_57_in_rule__ImageDecoration__Group_3_0__1__Impl4306); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageDecorationAccess().getEqualsSignKeyword_3_0_1()); 
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
    // $ANTLR end "rule__ImageDecoration__Group_3_0__1__Impl"


    // $ANTLR start "rule__ImageDecoration__Group_3_0__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2008:1: rule__ImageDecoration__Group_3_0__2 : rule__ImageDecoration__Group_3_0__2__Impl ;
    public final void rule__ImageDecoration__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2012:1: ( rule__ImageDecoration__Group_3_0__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2013:2: rule__ImageDecoration__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_0__2__Impl_in_rule__ImageDecoration__Group_3_0__24337);
            rule__ImageDecoration__Group_3_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ImageDecoration__Group_3_0__2"


    // $ANTLR start "rule__ImageDecoration__Group_3_0__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2019:1: rule__ImageDecoration__Group_3_0__2__Impl : ( ( rule__ImageDecoration__Location_uriAssignment_3_0_2 ) ) ;
    public final void rule__ImageDecoration__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2023:1: ( ( ( rule__ImageDecoration__Location_uriAssignment_3_0_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2024:1: ( ( rule__ImageDecoration__Location_uriAssignment_3_0_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2024:1: ( ( rule__ImageDecoration__Location_uriAssignment_3_0_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2025:1: ( rule__ImageDecoration__Location_uriAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getLocation_uriAssignment_3_0_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2026:1: ( rule__ImageDecoration__Location_uriAssignment_3_0_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2026:2: rule__ImageDecoration__Location_uriAssignment_3_0_2
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Location_uriAssignment_3_0_2_in_rule__ImageDecoration__Group_3_0__2__Impl4364);
            rule__ImageDecoration__Location_uriAssignment_3_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageDecorationAccess().getLocation_uriAssignment_3_0_2()); 
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
    // $ANTLR end "rule__ImageDecoration__Group_3_0__2__Impl"


    // $ANTLR start "rule__ImageDecoration__Group_3_3__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2042:1: rule__ImageDecoration__Group_3_3__0 : rule__ImageDecoration__Group_3_3__0__Impl rule__ImageDecoration__Group_3_3__1 ;
    public final void rule__ImageDecoration__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2046:1: ( rule__ImageDecoration__Group_3_3__0__Impl rule__ImageDecoration__Group_3_3__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2047:2: rule__ImageDecoration__Group_3_3__0__Impl rule__ImageDecoration__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_3__0__Impl_in_rule__ImageDecoration__Group_3_3__04400);
            rule__ImageDecoration__Group_3_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_3__1_in_rule__ImageDecoration__Group_3_3__04403);
            rule__ImageDecoration__Group_3_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ImageDecoration__Group_3_3__0"


    // $ANTLR start "rule__ImageDecoration__Group_3_3__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2054:1: rule__ImageDecoration__Group_3_3__0__Impl : ( 'tooltip' ) ;
    public final void rule__ImageDecoration__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2058:1: ( ( 'tooltip' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2059:1: ( 'tooltip' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2059:1: ( 'tooltip' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2060:1: 'tooltip'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getTooltipKeyword_3_3_0()); 
            }
            match(input,58,FOLLOW_58_in_rule__ImageDecoration__Group_3_3__0__Impl4431); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageDecorationAccess().getTooltipKeyword_3_3_0()); 
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
    // $ANTLR end "rule__ImageDecoration__Group_3_3__0__Impl"


    // $ANTLR start "rule__ImageDecoration__Group_3_3__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2073:1: rule__ImageDecoration__Group_3_3__1 : rule__ImageDecoration__Group_3_3__1__Impl rule__ImageDecoration__Group_3_3__2 ;
    public final void rule__ImageDecoration__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2077:1: ( rule__ImageDecoration__Group_3_3__1__Impl rule__ImageDecoration__Group_3_3__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2078:2: rule__ImageDecoration__Group_3_3__1__Impl rule__ImageDecoration__Group_3_3__2
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_3__1__Impl_in_rule__ImageDecoration__Group_3_3__14462);
            rule__ImageDecoration__Group_3_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_3__2_in_rule__ImageDecoration__Group_3_3__14465);
            rule__ImageDecoration__Group_3_3__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ImageDecoration__Group_3_3__1"


    // $ANTLR start "rule__ImageDecoration__Group_3_3__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2085:1: rule__ImageDecoration__Group_3_3__1__Impl : ( '=' ) ;
    public final void rule__ImageDecoration__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2089:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2090:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2090:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2091:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getEqualsSignKeyword_3_3_1()); 
            }
            match(input,57,FOLLOW_57_in_rule__ImageDecoration__Group_3_3__1__Impl4493); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageDecorationAccess().getEqualsSignKeyword_3_3_1()); 
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
    // $ANTLR end "rule__ImageDecoration__Group_3_3__1__Impl"


    // $ANTLR start "rule__ImageDecoration__Group_3_3__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2104:1: rule__ImageDecoration__Group_3_3__2 : rule__ImageDecoration__Group_3_3__2__Impl ;
    public final void rule__ImageDecoration__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2108:1: ( rule__ImageDecoration__Group_3_3__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2109:2: rule__ImageDecoration__Group_3_3__2__Impl
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_3__2__Impl_in_rule__ImageDecoration__Group_3_3__24524);
            rule__ImageDecoration__Group_3_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ImageDecoration__Group_3_3__2"


    // $ANTLR start "rule__ImageDecoration__Group_3_3__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2115:1: rule__ImageDecoration__Group_3_3__2__Impl : ( ( rule__ImageDecoration__TooltipAssignment_3_3_2 ) ) ;
    public final void rule__ImageDecoration__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2119:1: ( ( ( rule__ImageDecoration__TooltipAssignment_3_3_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2120:1: ( ( rule__ImageDecoration__TooltipAssignment_3_3_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2120:1: ( ( rule__ImageDecoration__TooltipAssignment_3_3_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2121:1: ( rule__ImageDecoration__TooltipAssignment_3_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getTooltipAssignment_3_3_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2122:1: ( rule__ImageDecoration__TooltipAssignment_3_3_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2122:2: rule__ImageDecoration__TooltipAssignment_3_3_2
            {
            pushFollow(FOLLOW_rule__ImageDecoration__TooltipAssignment_3_3_2_in_rule__ImageDecoration__Group_3_3__2__Impl4551);
            rule__ImageDecoration__TooltipAssignment_3_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageDecorationAccess().getTooltipAssignment_3_3_2()); 
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
    // $ANTLR end "rule__ImageDecoration__Group_3_3__2__Impl"


    // $ANTLR start "rule__BorderDecoration__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2138:1: rule__BorderDecoration__Group__0 : rule__BorderDecoration__Group__0__Impl rule__BorderDecoration__Group__1 ;
    public final void rule__BorderDecoration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2142:1: ( rule__BorderDecoration__Group__0__Impl rule__BorderDecoration__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2143:2: rule__BorderDecoration__Group__0__Impl rule__BorderDecoration__Group__1
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__0__Impl_in_rule__BorderDecoration__Group__04587);
            rule__BorderDecoration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BorderDecoration__Group__1_in_rule__BorderDecoration__Group__04590);
            rule__BorderDecoration__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2150:1: rule__BorderDecoration__Group__0__Impl : ( () ) ;
    public final void rule__BorderDecoration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2154:1: ( ( () ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2155:1: ( () )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2155:1: ( () )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2156:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getBorderDecorationAction_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2157:1: ()
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2159:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBorderDecorationAccess().getBorderDecorationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderDecoration__Group__0__Impl"


    // $ANTLR start "rule__BorderDecoration__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2169:1: rule__BorderDecoration__Group__1 : rule__BorderDecoration__Group__1__Impl rule__BorderDecoration__Group__2 ;
    public final void rule__BorderDecoration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2173:1: ( rule__BorderDecoration__Group__1__Impl rule__BorderDecoration__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2174:2: rule__BorderDecoration__Group__1__Impl rule__BorderDecoration__Group__2
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__1__Impl_in_rule__BorderDecoration__Group__14648);
            rule__BorderDecoration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BorderDecoration__Group__2_in_rule__BorderDecoration__Group__14651);
            rule__BorderDecoration__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2181:1: rule__BorderDecoration__Group__1__Impl : ( 'border' ) ;
    public final void rule__BorderDecoration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2185:1: ( ( 'border' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2186:1: ( 'border' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2186:1: ( 'border' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2187:1: 'border'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getBorderKeyword_1()); 
            }
            match(input,59,FOLLOW_59_in_rule__BorderDecoration__Group__1__Impl4679); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBorderDecorationAccess().getBorderKeyword_1()); 
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
    // $ANTLR end "rule__BorderDecoration__Group__1__Impl"


    // $ANTLR start "rule__BorderDecoration__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2200:1: rule__BorderDecoration__Group__2 : rule__BorderDecoration__Group__2__Impl rule__BorderDecoration__Group__3 ;
    public final void rule__BorderDecoration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2204:1: ( rule__BorderDecoration__Group__2__Impl rule__BorderDecoration__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2205:2: rule__BorderDecoration__Group__2__Impl rule__BorderDecoration__Group__3
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__2__Impl_in_rule__BorderDecoration__Group__24710);
            rule__BorderDecoration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BorderDecoration__Group__3_in_rule__BorderDecoration__Group__24713);
            rule__BorderDecoration__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2212:1: rule__BorderDecoration__Group__2__Impl : ( '{' ) ;
    public final void rule__BorderDecoration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2216:1: ( ( '{' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2217:1: ( '{' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2217:1: ( '{' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2218:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,53,FOLLOW_53_in_rule__BorderDecoration__Group__2__Impl4741); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBorderDecorationAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__BorderDecoration__Group__2__Impl"


    // $ANTLR start "rule__BorderDecoration__Group__3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2231:1: rule__BorderDecoration__Group__3 : rule__BorderDecoration__Group__3__Impl rule__BorderDecoration__Group__4 ;
    public final void rule__BorderDecoration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2235:1: ( rule__BorderDecoration__Group__3__Impl rule__BorderDecoration__Group__4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2236:2: rule__BorderDecoration__Group__3__Impl rule__BorderDecoration__Group__4
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__3__Impl_in_rule__BorderDecoration__Group__34772);
            rule__BorderDecoration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BorderDecoration__Group__4_in_rule__BorderDecoration__Group__34775);
            rule__BorderDecoration__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2243:1: rule__BorderDecoration__Group__3__Impl : ( ( rule__BorderDecoration__UnorderedGroup_3 ) ) ;
    public final void rule__BorderDecoration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2247:1: ( ( ( rule__BorderDecoration__UnorderedGroup_3 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2248:1: ( ( rule__BorderDecoration__UnorderedGroup_3 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2248:1: ( ( rule__BorderDecoration__UnorderedGroup_3 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2249:1: ( rule__BorderDecoration__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2250:1: ( rule__BorderDecoration__UnorderedGroup_3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2250:2: rule__BorderDecoration__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3_in_rule__BorderDecoration__Group__3__Impl4802);
            rule__BorderDecoration__UnorderedGroup_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3()); 
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
    // $ANTLR end "rule__BorderDecoration__Group__3__Impl"


    // $ANTLR start "rule__BorderDecoration__Group__4"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2260:1: rule__BorderDecoration__Group__4 : rule__BorderDecoration__Group__4__Impl ;
    public final void rule__BorderDecoration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2264:1: ( rule__BorderDecoration__Group__4__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2265:2: rule__BorderDecoration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__4__Impl_in_rule__BorderDecoration__Group__44832);
            rule__BorderDecoration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2271:1: rule__BorderDecoration__Group__4__Impl : ( '}' ) ;
    public final void rule__BorderDecoration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2275:1: ( ( '}' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2276:1: ( '}' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2276:1: ( '}' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2277:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,54,FOLLOW_54_in_rule__BorderDecoration__Group__4__Impl4860); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBorderDecorationAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__BorderDecoration__Group__4__Impl"


    // $ANTLR start "rule__BorderDecoration__Group_3_1__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2300:1: rule__BorderDecoration__Group_3_1__0 : rule__BorderDecoration__Group_3_1__0__Impl rule__BorderDecoration__Group_3_1__1 ;
    public final void rule__BorderDecoration__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2304:1: ( rule__BorderDecoration__Group_3_1__0__Impl rule__BorderDecoration__Group_3_1__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2305:2: rule__BorderDecoration__Group_3_1__0__Impl rule__BorderDecoration__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group_3_1__0__Impl_in_rule__BorderDecoration__Group_3_1__04901);
            rule__BorderDecoration__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BorderDecoration__Group_3_1__1_in_rule__BorderDecoration__Group_3_1__04904);
            rule__BorderDecoration__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BorderDecoration__Group_3_1__0"


    // $ANTLR start "rule__BorderDecoration__Group_3_1__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2312:1: rule__BorderDecoration__Group_3_1__0__Impl : ( 'color' ) ;
    public final void rule__BorderDecoration__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2316:1: ( ( 'color' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2317:1: ( 'color' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2317:1: ( 'color' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2318:1: 'color'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getColorKeyword_3_1_0()); 
            }
            match(input,60,FOLLOW_60_in_rule__BorderDecoration__Group_3_1__0__Impl4932); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBorderDecorationAccess().getColorKeyword_3_1_0()); 
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
    // $ANTLR end "rule__BorderDecoration__Group_3_1__0__Impl"


    // $ANTLR start "rule__BorderDecoration__Group_3_1__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2331:1: rule__BorderDecoration__Group_3_1__1 : rule__BorderDecoration__Group_3_1__1__Impl rule__BorderDecoration__Group_3_1__2 ;
    public final void rule__BorderDecoration__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2335:1: ( rule__BorderDecoration__Group_3_1__1__Impl rule__BorderDecoration__Group_3_1__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2336:2: rule__BorderDecoration__Group_3_1__1__Impl rule__BorderDecoration__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group_3_1__1__Impl_in_rule__BorderDecoration__Group_3_1__14963);
            rule__BorderDecoration__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BorderDecoration__Group_3_1__2_in_rule__BorderDecoration__Group_3_1__14966);
            rule__BorderDecoration__Group_3_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BorderDecoration__Group_3_1__1"


    // $ANTLR start "rule__BorderDecoration__Group_3_1__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2343:1: rule__BorderDecoration__Group_3_1__1__Impl : ( '=' ) ;
    public final void rule__BorderDecoration__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2347:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2348:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2348:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2349:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getEqualsSignKeyword_3_1_1()); 
            }
            match(input,57,FOLLOW_57_in_rule__BorderDecoration__Group_3_1__1__Impl4994); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBorderDecorationAccess().getEqualsSignKeyword_3_1_1()); 
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
    // $ANTLR end "rule__BorderDecoration__Group_3_1__1__Impl"


    // $ANTLR start "rule__BorderDecoration__Group_3_1__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2362:1: rule__BorderDecoration__Group_3_1__2 : rule__BorderDecoration__Group_3_1__2__Impl ;
    public final void rule__BorderDecoration__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2366:1: ( rule__BorderDecoration__Group_3_1__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2367:2: rule__BorderDecoration__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group_3_1__2__Impl_in_rule__BorderDecoration__Group_3_1__25025);
            rule__BorderDecoration__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BorderDecoration__Group_3_1__2"


    // $ANTLR start "rule__BorderDecoration__Group_3_1__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2373:1: rule__BorderDecoration__Group_3_1__2__Impl : ( ( rule__BorderDecoration__ColorAssignment_3_1_2 ) ) ;
    public final void rule__BorderDecoration__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2377:1: ( ( ( rule__BorderDecoration__ColorAssignment_3_1_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2378:1: ( ( rule__BorderDecoration__ColorAssignment_3_1_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2378:1: ( ( rule__BorderDecoration__ColorAssignment_3_1_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2379:1: ( rule__BorderDecoration__ColorAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getColorAssignment_3_1_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2380:1: ( rule__BorderDecoration__ColorAssignment_3_1_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2380:2: rule__BorderDecoration__ColorAssignment_3_1_2
            {
            pushFollow(FOLLOW_rule__BorderDecoration__ColorAssignment_3_1_2_in_rule__BorderDecoration__Group_3_1__2__Impl5052);
            rule__BorderDecoration__ColorAssignment_3_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBorderDecorationAccess().getColorAssignment_3_1_2()); 
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
    // $ANTLR end "rule__BorderDecoration__Group_3_1__2__Impl"


    // $ANTLR start "rule__ColorDecoration__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2396:1: rule__ColorDecoration__Group__0 : rule__ColorDecoration__Group__0__Impl rule__ColorDecoration__Group__1 ;
    public final void rule__ColorDecoration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2400:1: ( rule__ColorDecoration__Group__0__Impl rule__ColorDecoration__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2401:2: rule__ColorDecoration__Group__0__Impl rule__ColorDecoration__Group__1
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group__0__Impl_in_rule__ColorDecoration__Group__05088);
            rule__ColorDecoration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group__1_in_rule__ColorDecoration__Group__05091);
            rule__ColorDecoration__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ColorDecoration__Group__0"


    // $ANTLR start "rule__ColorDecoration__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2408:1: rule__ColorDecoration__Group__0__Impl : ( () ) ;
    public final void rule__ColorDecoration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2412:1: ( ( () ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2413:1: ( () )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2413:1: ( () )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2414:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getColorDecorationAction_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2415:1: ()
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2417:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorDecorationAccess().getColorDecorationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorDecoration__Group__0__Impl"


    // $ANTLR start "rule__ColorDecoration__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2427:1: rule__ColorDecoration__Group__1 : rule__ColorDecoration__Group__1__Impl rule__ColorDecoration__Group__2 ;
    public final void rule__ColorDecoration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2431:1: ( rule__ColorDecoration__Group__1__Impl rule__ColorDecoration__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2432:2: rule__ColorDecoration__Group__1__Impl rule__ColorDecoration__Group__2
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group__1__Impl_in_rule__ColorDecoration__Group__15149);
            rule__ColorDecoration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group__2_in_rule__ColorDecoration__Group__15152);
            rule__ColorDecoration__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ColorDecoration__Group__1"


    // $ANTLR start "rule__ColorDecoration__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2439:1: rule__ColorDecoration__Group__1__Impl : ( 'color' ) ;
    public final void rule__ColorDecoration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2443:1: ( ( 'color' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2444:1: ( 'color' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2444:1: ( 'color' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2445:1: 'color'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getColorKeyword_1()); 
            }
            match(input,60,FOLLOW_60_in_rule__ColorDecoration__Group__1__Impl5180); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorDecorationAccess().getColorKeyword_1()); 
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
    // $ANTLR end "rule__ColorDecoration__Group__1__Impl"


    // $ANTLR start "rule__ColorDecoration__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2458:1: rule__ColorDecoration__Group__2 : rule__ColorDecoration__Group__2__Impl rule__ColorDecoration__Group__3 ;
    public final void rule__ColorDecoration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2462:1: ( rule__ColorDecoration__Group__2__Impl rule__ColorDecoration__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2463:2: rule__ColorDecoration__Group__2__Impl rule__ColorDecoration__Group__3
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group__2__Impl_in_rule__ColorDecoration__Group__25211);
            rule__ColorDecoration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group__3_in_rule__ColorDecoration__Group__25214);
            rule__ColorDecoration__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ColorDecoration__Group__2"


    // $ANTLR start "rule__ColorDecoration__Group__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2470:1: rule__ColorDecoration__Group__2__Impl : ( '{' ) ;
    public final void rule__ColorDecoration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2474:1: ( ( '{' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2475:1: ( '{' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2475:1: ( '{' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2476:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,53,FOLLOW_53_in_rule__ColorDecoration__Group__2__Impl5242); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorDecorationAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__ColorDecoration__Group__2__Impl"


    // $ANTLR start "rule__ColorDecoration__Group__3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2489:1: rule__ColorDecoration__Group__3 : rule__ColorDecoration__Group__3__Impl rule__ColorDecoration__Group__4 ;
    public final void rule__ColorDecoration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2493:1: ( rule__ColorDecoration__Group__3__Impl rule__ColorDecoration__Group__4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2494:2: rule__ColorDecoration__Group__3__Impl rule__ColorDecoration__Group__4
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group__3__Impl_in_rule__ColorDecoration__Group__35273);
            rule__ColorDecoration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group__4_in_rule__ColorDecoration__Group__35276);
            rule__ColorDecoration__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ColorDecoration__Group__3"


    // $ANTLR start "rule__ColorDecoration__Group__3__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2501:1: rule__ColorDecoration__Group__3__Impl : ( ( rule__ColorDecoration__UnorderedGroup_3 ) ) ;
    public final void rule__ColorDecoration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2505:1: ( ( ( rule__ColorDecoration__UnorderedGroup_3 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2506:1: ( ( rule__ColorDecoration__UnorderedGroup_3 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2506:1: ( ( rule__ColorDecoration__UnorderedGroup_3 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2507:1: ( rule__ColorDecoration__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2508:1: ( rule__ColorDecoration__UnorderedGroup_3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2508:2: rule__ColorDecoration__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__ColorDecoration__UnorderedGroup_3_in_rule__ColorDecoration__Group__3__Impl5303);
            rule__ColorDecoration__UnorderedGroup_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3()); 
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
    // $ANTLR end "rule__ColorDecoration__Group__3__Impl"


    // $ANTLR start "rule__ColorDecoration__Group__4"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2518:1: rule__ColorDecoration__Group__4 : rule__ColorDecoration__Group__4__Impl ;
    public final void rule__ColorDecoration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2522:1: ( rule__ColorDecoration__Group__4__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2523:2: rule__ColorDecoration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group__4__Impl_in_rule__ColorDecoration__Group__45333);
            rule__ColorDecoration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ColorDecoration__Group__4"


    // $ANTLR start "rule__ColorDecoration__Group__4__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2529:1: rule__ColorDecoration__Group__4__Impl : ( '}' ) ;
    public final void rule__ColorDecoration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2533:1: ( ( '}' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2534:1: ( '}' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2534:1: ( '}' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2535:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,54,FOLLOW_54_in_rule__ColorDecoration__Group__4__Impl5361); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorDecorationAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__ColorDecoration__Group__4__Impl"


    // $ANTLR start "rule__ColorDecoration__Group_3_0__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2558:1: rule__ColorDecoration__Group_3_0__0 : rule__ColorDecoration__Group_3_0__0__Impl rule__ColorDecoration__Group_3_0__1 ;
    public final void rule__ColorDecoration__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2562:1: ( rule__ColorDecoration__Group_3_0__0__Impl rule__ColorDecoration__Group_3_0__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2563:2: rule__ColorDecoration__Group_3_0__0__Impl rule__ColorDecoration__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_0__0__Impl_in_rule__ColorDecoration__Group_3_0__05402);
            rule__ColorDecoration__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_0__1_in_rule__ColorDecoration__Group_3_0__05405);
            rule__ColorDecoration__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ColorDecoration__Group_3_0__0"


    // $ANTLR start "rule__ColorDecoration__Group_3_0__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2570:1: rule__ColorDecoration__Group_3_0__0__Impl : ( 'background' ) ;
    public final void rule__ColorDecoration__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2574:1: ( ( 'background' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2575:1: ( 'background' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2575:1: ( 'background' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2576:1: 'background'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getBackgroundKeyword_3_0_0()); 
            }
            match(input,61,FOLLOW_61_in_rule__ColorDecoration__Group_3_0__0__Impl5433); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorDecorationAccess().getBackgroundKeyword_3_0_0()); 
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
    // $ANTLR end "rule__ColorDecoration__Group_3_0__0__Impl"


    // $ANTLR start "rule__ColorDecoration__Group_3_0__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2589:1: rule__ColorDecoration__Group_3_0__1 : rule__ColorDecoration__Group_3_0__1__Impl rule__ColorDecoration__Group_3_0__2 ;
    public final void rule__ColorDecoration__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2593:1: ( rule__ColorDecoration__Group_3_0__1__Impl rule__ColorDecoration__Group_3_0__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2594:2: rule__ColorDecoration__Group_3_0__1__Impl rule__ColorDecoration__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_0__1__Impl_in_rule__ColorDecoration__Group_3_0__15464);
            rule__ColorDecoration__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_0__2_in_rule__ColorDecoration__Group_3_0__15467);
            rule__ColorDecoration__Group_3_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ColorDecoration__Group_3_0__1"


    // $ANTLR start "rule__ColorDecoration__Group_3_0__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2601:1: rule__ColorDecoration__Group_3_0__1__Impl : ( '=' ) ;
    public final void rule__ColorDecoration__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2605:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2606:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2606:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2607:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getEqualsSignKeyword_3_0_1()); 
            }
            match(input,57,FOLLOW_57_in_rule__ColorDecoration__Group_3_0__1__Impl5495); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorDecorationAccess().getEqualsSignKeyword_3_0_1()); 
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
    // $ANTLR end "rule__ColorDecoration__Group_3_0__1__Impl"


    // $ANTLR start "rule__ColorDecoration__Group_3_0__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2620:1: rule__ColorDecoration__Group_3_0__2 : rule__ColorDecoration__Group_3_0__2__Impl ;
    public final void rule__ColorDecoration__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2624:1: ( rule__ColorDecoration__Group_3_0__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2625:2: rule__ColorDecoration__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_0__2__Impl_in_rule__ColorDecoration__Group_3_0__25526);
            rule__ColorDecoration__Group_3_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ColorDecoration__Group_3_0__2"


    // $ANTLR start "rule__ColorDecoration__Group_3_0__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2631:1: rule__ColorDecoration__Group_3_0__2__Impl : ( ( rule__ColorDecoration__BackgroundAssignment_3_0_2 ) ) ;
    public final void rule__ColorDecoration__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2635:1: ( ( ( rule__ColorDecoration__BackgroundAssignment_3_0_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2636:1: ( ( rule__ColorDecoration__BackgroundAssignment_3_0_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2636:1: ( ( rule__ColorDecoration__BackgroundAssignment_3_0_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2637:1: ( rule__ColorDecoration__BackgroundAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getBackgroundAssignment_3_0_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2638:1: ( rule__ColorDecoration__BackgroundAssignment_3_0_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2638:2: rule__ColorDecoration__BackgroundAssignment_3_0_2
            {
            pushFollow(FOLLOW_rule__ColorDecoration__BackgroundAssignment_3_0_2_in_rule__ColorDecoration__Group_3_0__2__Impl5553);
            rule__ColorDecoration__BackgroundAssignment_3_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorDecorationAccess().getBackgroundAssignment_3_0_2()); 
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
    // $ANTLR end "rule__ColorDecoration__Group_3_0__2__Impl"


    // $ANTLR start "rule__ColorDecoration__Group_3_1__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2654:1: rule__ColorDecoration__Group_3_1__0 : rule__ColorDecoration__Group_3_1__0__Impl rule__ColorDecoration__Group_3_1__1 ;
    public final void rule__ColorDecoration__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2658:1: ( rule__ColorDecoration__Group_3_1__0__Impl rule__ColorDecoration__Group_3_1__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2659:2: rule__ColorDecoration__Group_3_1__0__Impl rule__ColorDecoration__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_1__0__Impl_in_rule__ColorDecoration__Group_3_1__05589);
            rule__ColorDecoration__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_1__1_in_rule__ColorDecoration__Group_3_1__05592);
            rule__ColorDecoration__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ColorDecoration__Group_3_1__0"


    // $ANTLR start "rule__ColorDecoration__Group_3_1__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2666:1: rule__ColorDecoration__Group_3_1__0__Impl : ( 'foreground' ) ;
    public final void rule__ColorDecoration__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2670:1: ( ( 'foreground' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2671:1: ( 'foreground' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2671:1: ( 'foreground' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2672:1: 'foreground'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getForegroundKeyword_3_1_0()); 
            }
            match(input,62,FOLLOW_62_in_rule__ColorDecoration__Group_3_1__0__Impl5620); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorDecorationAccess().getForegroundKeyword_3_1_0()); 
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
    // $ANTLR end "rule__ColorDecoration__Group_3_1__0__Impl"


    // $ANTLR start "rule__ColorDecoration__Group_3_1__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2685:1: rule__ColorDecoration__Group_3_1__1 : rule__ColorDecoration__Group_3_1__1__Impl rule__ColorDecoration__Group_3_1__2 ;
    public final void rule__ColorDecoration__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2689:1: ( rule__ColorDecoration__Group_3_1__1__Impl rule__ColorDecoration__Group_3_1__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2690:2: rule__ColorDecoration__Group_3_1__1__Impl rule__ColorDecoration__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_1__1__Impl_in_rule__ColorDecoration__Group_3_1__15651);
            rule__ColorDecoration__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_1__2_in_rule__ColorDecoration__Group_3_1__15654);
            rule__ColorDecoration__Group_3_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ColorDecoration__Group_3_1__1"


    // $ANTLR start "rule__ColorDecoration__Group_3_1__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2697:1: rule__ColorDecoration__Group_3_1__1__Impl : ( '=' ) ;
    public final void rule__ColorDecoration__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2701:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2702:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2702:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2703:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getEqualsSignKeyword_3_1_1()); 
            }
            match(input,57,FOLLOW_57_in_rule__ColorDecoration__Group_3_1__1__Impl5682); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorDecorationAccess().getEqualsSignKeyword_3_1_1()); 
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
    // $ANTLR end "rule__ColorDecoration__Group_3_1__1__Impl"


    // $ANTLR start "rule__ColorDecoration__Group_3_1__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2716:1: rule__ColorDecoration__Group_3_1__2 : rule__ColorDecoration__Group_3_1__2__Impl ;
    public final void rule__ColorDecoration__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2720:1: ( rule__ColorDecoration__Group_3_1__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2721:2: rule__ColorDecoration__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_1__2__Impl_in_rule__ColorDecoration__Group_3_1__25713);
            rule__ColorDecoration__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ColorDecoration__Group_3_1__2"


    // $ANTLR start "rule__ColorDecoration__Group_3_1__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2727:1: rule__ColorDecoration__Group_3_1__2__Impl : ( ( rule__ColorDecoration__ForegroundAssignment_3_1_2 ) ) ;
    public final void rule__ColorDecoration__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2731:1: ( ( ( rule__ColorDecoration__ForegroundAssignment_3_1_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2732:1: ( ( rule__ColorDecoration__ForegroundAssignment_3_1_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2732:1: ( ( rule__ColorDecoration__ForegroundAssignment_3_1_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2733:1: ( rule__ColorDecoration__ForegroundAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getForegroundAssignment_3_1_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2734:1: ( rule__ColorDecoration__ForegroundAssignment_3_1_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2734:2: rule__ColorDecoration__ForegroundAssignment_3_1_2
            {
            pushFollow(FOLLOW_rule__ColorDecoration__ForegroundAssignment_3_1_2_in_rule__ColorDecoration__Group_3_1__2__Impl5740);
            rule__ColorDecoration__ForegroundAssignment_3_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorDecorationAccess().getForegroundAssignment_3_1_2()); 
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
    // $ANTLR end "rule__ColorDecoration__Group_3_1__2__Impl"


    // $ANTLR start "rule__ConnectionDecoration__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2750:1: rule__ConnectionDecoration__Group__0 : rule__ConnectionDecoration__Group__0__Impl rule__ConnectionDecoration__Group__1 ;
    public final void rule__ConnectionDecoration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2754:1: ( rule__ConnectionDecoration__Group__0__Impl rule__ConnectionDecoration__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2755:2: rule__ConnectionDecoration__Group__0__Impl rule__ConnectionDecoration__Group__1
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__0__Impl_in_rule__ConnectionDecoration__Group__05776);
            rule__ConnectionDecoration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__1_in_rule__ConnectionDecoration__Group__05779);
            rule__ConnectionDecoration__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConnectionDecoration__Group__0"


    // $ANTLR start "rule__ConnectionDecoration__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2762:1: rule__ConnectionDecoration__Group__0__Impl : ( () ) ;
    public final void rule__ConnectionDecoration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2766:1: ( ( () ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2767:1: ( () )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2767:1: ( () )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2768:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getConnectionDecorationAction_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2769:1: ()
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2771:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectionDecorationAccess().getConnectionDecorationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionDecoration__Group__0__Impl"


    // $ANTLR start "rule__ConnectionDecoration__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2781:1: rule__ConnectionDecoration__Group__1 : rule__ConnectionDecoration__Group__1__Impl rule__ConnectionDecoration__Group__2 ;
    public final void rule__ConnectionDecoration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2785:1: ( rule__ConnectionDecoration__Group__1__Impl rule__ConnectionDecoration__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2786:2: rule__ConnectionDecoration__Group__1__Impl rule__ConnectionDecoration__Group__2
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__1__Impl_in_rule__ConnectionDecoration__Group__15837);
            rule__ConnectionDecoration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__2_in_rule__ConnectionDecoration__Group__15840);
            rule__ConnectionDecoration__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConnectionDecoration__Group__1"


    // $ANTLR start "rule__ConnectionDecoration__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2793:1: rule__ConnectionDecoration__Group__1__Impl : ( 'connection' ) ;
    public final void rule__ConnectionDecoration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2797:1: ( ( 'connection' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2798:1: ( 'connection' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2798:1: ( 'connection' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2799:1: 'connection'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getConnectionKeyword_1()); 
            }
            match(input,63,FOLLOW_63_in_rule__ConnectionDecoration__Group__1__Impl5868); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectionDecorationAccess().getConnectionKeyword_1()); 
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
    // $ANTLR end "rule__ConnectionDecoration__Group__1__Impl"


    // $ANTLR start "rule__ConnectionDecoration__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2812:1: rule__ConnectionDecoration__Group__2 : rule__ConnectionDecoration__Group__2__Impl rule__ConnectionDecoration__Group__3 ;
    public final void rule__ConnectionDecoration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2816:1: ( rule__ConnectionDecoration__Group__2__Impl rule__ConnectionDecoration__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2817:2: rule__ConnectionDecoration__Group__2__Impl rule__ConnectionDecoration__Group__3
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__2__Impl_in_rule__ConnectionDecoration__Group__25899);
            rule__ConnectionDecoration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__3_in_rule__ConnectionDecoration__Group__25902);
            rule__ConnectionDecoration__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConnectionDecoration__Group__2"


    // $ANTLR start "rule__ConnectionDecoration__Group__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2824:1: rule__ConnectionDecoration__Group__2__Impl : ( '{' ) ;
    public final void rule__ConnectionDecoration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2828:1: ( ( '{' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2829:1: ( '{' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2829:1: ( '{' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2830:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,53,FOLLOW_53_in_rule__ConnectionDecoration__Group__2__Impl5930); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectionDecorationAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__ConnectionDecoration__Group__2__Impl"


    // $ANTLR start "rule__ConnectionDecoration__Group__3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2843:1: rule__ConnectionDecoration__Group__3 : rule__ConnectionDecoration__Group__3__Impl rule__ConnectionDecoration__Group__4 ;
    public final void rule__ConnectionDecoration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2847:1: ( rule__ConnectionDecoration__Group__3__Impl rule__ConnectionDecoration__Group__4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2848:2: rule__ConnectionDecoration__Group__3__Impl rule__ConnectionDecoration__Group__4
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__3__Impl_in_rule__ConnectionDecoration__Group__35961);
            rule__ConnectionDecoration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__4_in_rule__ConnectionDecoration__Group__35964);
            rule__ConnectionDecoration__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConnectionDecoration__Group__3"


    // $ANTLR start "rule__ConnectionDecoration__Group__3__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2855:1: rule__ConnectionDecoration__Group__3__Impl : ( ( rule__ConnectionDecoration__UnorderedGroup_3 ) ) ;
    public final void rule__ConnectionDecoration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2859:1: ( ( ( rule__ConnectionDecoration__UnorderedGroup_3 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2860:1: ( ( rule__ConnectionDecoration__UnorderedGroup_3 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2860:1: ( ( rule__ConnectionDecoration__UnorderedGroup_3 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2861:1: ( rule__ConnectionDecoration__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2862:1: ( rule__ConnectionDecoration__UnorderedGroup_3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2862:2: rule__ConnectionDecoration__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3_in_rule__ConnectionDecoration__Group__3__Impl5991);
            rule__ConnectionDecoration__UnorderedGroup_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3()); 
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
    // $ANTLR end "rule__ConnectionDecoration__Group__3__Impl"


    // $ANTLR start "rule__ConnectionDecoration__Group__4"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2872:1: rule__ConnectionDecoration__Group__4 : rule__ConnectionDecoration__Group__4__Impl ;
    public final void rule__ConnectionDecoration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2876:1: ( rule__ConnectionDecoration__Group__4__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2877:2: rule__ConnectionDecoration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__4__Impl_in_rule__ConnectionDecoration__Group__46021);
            rule__ConnectionDecoration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConnectionDecoration__Group__4"


    // $ANTLR start "rule__ConnectionDecoration__Group__4__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2883:1: rule__ConnectionDecoration__Group__4__Impl : ( '}' ) ;
    public final void rule__ConnectionDecoration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2887:1: ( ( '}' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2888:1: ( '}' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2888:1: ( '}' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2889:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,54,FOLLOW_54_in_rule__ConnectionDecoration__Group__4__Impl6049); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectionDecorationAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__ConnectionDecoration__Group__4__Impl"


    // $ANTLR start "rule__ConnectionDecoration__Group_3_2__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2912:1: rule__ConnectionDecoration__Group_3_2__0 : rule__ConnectionDecoration__Group_3_2__0__Impl rule__ConnectionDecoration__Group_3_2__1 ;
    public final void rule__ConnectionDecoration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2916:1: ( rule__ConnectionDecoration__Group_3_2__0__Impl rule__ConnectionDecoration__Group_3_2__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2917:2: rule__ConnectionDecoration__Group_3_2__0__Impl rule__ConnectionDecoration__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_2__0__Impl_in_rule__ConnectionDecoration__Group_3_2__06090);
            rule__ConnectionDecoration__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_2__1_in_rule__ConnectionDecoration__Group_3_2__06093);
            rule__ConnectionDecoration__Group_3_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConnectionDecoration__Group_3_2__0"


    // $ANTLR start "rule__ConnectionDecoration__Group_3_2__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2924:1: rule__ConnectionDecoration__Group_3_2__0__Impl : ( 'foreground-color' ) ;
    public final void rule__ConnectionDecoration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2928:1: ( ( 'foreground-color' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2929:1: ( 'foreground-color' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2929:1: ( 'foreground-color' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2930:1: 'foreground-color'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getForegroundColorKeyword_3_2_0()); 
            }
            match(input,64,FOLLOW_64_in_rule__ConnectionDecoration__Group_3_2__0__Impl6121); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectionDecorationAccess().getForegroundColorKeyword_3_2_0()); 
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
    // $ANTLR end "rule__ConnectionDecoration__Group_3_2__0__Impl"


    // $ANTLR start "rule__ConnectionDecoration__Group_3_2__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2943:1: rule__ConnectionDecoration__Group_3_2__1 : rule__ConnectionDecoration__Group_3_2__1__Impl rule__ConnectionDecoration__Group_3_2__2 ;
    public final void rule__ConnectionDecoration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2947:1: ( rule__ConnectionDecoration__Group_3_2__1__Impl rule__ConnectionDecoration__Group_3_2__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2948:2: rule__ConnectionDecoration__Group_3_2__1__Impl rule__ConnectionDecoration__Group_3_2__2
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_2__1__Impl_in_rule__ConnectionDecoration__Group_3_2__16152);
            rule__ConnectionDecoration__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_2__2_in_rule__ConnectionDecoration__Group_3_2__16155);
            rule__ConnectionDecoration__Group_3_2__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConnectionDecoration__Group_3_2__1"


    // $ANTLR start "rule__ConnectionDecoration__Group_3_2__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2955:1: rule__ConnectionDecoration__Group_3_2__1__Impl : ( '=' ) ;
    public final void rule__ConnectionDecoration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2959:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2960:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2960:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2961:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getEqualsSignKeyword_3_2_1()); 
            }
            match(input,57,FOLLOW_57_in_rule__ConnectionDecoration__Group_3_2__1__Impl6183); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectionDecorationAccess().getEqualsSignKeyword_3_2_1()); 
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
    // $ANTLR end "rule__ConnectionDecoration__Group_3_2__1__Impl"


    // $ANTLR start "rule__ConnectionDecoration__Group_3_2__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2974:1: rule__ConnectionDecoration__Group_3_2__2 : rule__ConnectionDecoration__Group_3_2__2__Impl ;
    public final void rule__ConnectionDecoration__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2978:1: ( rule__ConnectionDecoration__Group_3_2__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2979:2: rule__ConnectionDecoration__Group_3_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_2__2__Impl_in_rule__ConnectionDecoration__Group_3_2__26214);
            rule__ConnectionDecoration__Group_3_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConnectionDecoration__Group_3_2__2"


    // $ANTLR start "rule__ConnectionDecoration__Group_3_2__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2985:1: rule__ConnectionDecoration__Group_3_2__2__Impl : ( ( rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2 ) ) ;
    public final void rule__ConnectionDecoration__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2989:1: ( ( ( rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2990:1: ( ( rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2990:1: ( ( rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2991:1: ( rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getForegroundColorAssignment_3_2_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2992:1: ( rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2992:2: rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2_in_rule__ConnectionDecoration__Group_3_2__2__Impl6241);
            rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectionDecorationAccess().getForegroundColorAssignment_3_2_2()); 
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
    // $ANTLR end "rule__ConnectionDecoration__Group_3_2__2__Impl"


    // $ANTLR start "rule__ConnectionDecoration__Group_3_3__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3008:1: rule__ConnectionDecoration__Group_3_3__0 : rule__ConnectionDecoration__Group_3_3__0__Impl rule__ConnectionDecoration__Group_3_3__1 ;
    public final void rule__ConnectionDecoration__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3012:1: ( rule__ConnectionDecoration__Group_3_3__0__Impl rule__ConnectionDecoration__Group_3_3__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3013:2: rule__ConnectionDecoration__Group_3_3__0__Impl rule__ConnectionDecoration__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_3__0__Impl_in_rule__ConnectionDecoration__Group_3_3__06277);
            rule__ConnectionDecoration__Group_3_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_3__1_in_rule__ConnectionDecoration__Group_3_3__06280);
            rule__ConnectionDecoration__Group_3_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConnectionDecoration__Group_3_3__0"


    // $ANTLR start "rule__ConnectionDecoration__Group_3_3__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3020:1: rule__ConnectionDecoration__Group_3_3__0__Impl : ( 'background-color' ) ;
    public final void rule__ConnectionDecoration__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3024:1: ( ( 'background-color' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3025:1: ( 'background-color' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3025:1: ( 'background-color' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3026:1: 'background-color'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getBackgroundColorKeyword_3_3_0()); 
            }
            match(input,65,FOLLOW_65_in_rule__ConnectionDecoration__Group_3_3__0__Impl6308); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectionDecorationAccess().getBackgroundColorKeyword_3_3_0()); 
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
    // $ANTLR end "rule__ConnectionDecoration__Group_3_3__0__Impl"


    // $ANTLR start "rule__ConnectionDecoration__Group_3_3__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3039:1: rule__ConnectionDecoration__Group_3_3__1 : rule__ConnectionDecoration__Group_3_3__1__Impl rule__ConnectionDecoration__Group_3_3__2 ;
    public final void rule__ConnectionDecoration__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3043:1: ( rule__ConnectionDecoration__Group_3_3__1__Impl rule__ConnectionDecoration__Group_3_3__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3044:2: rule__ConnectionDecoration__Group_3_3__1__Impl rule__ConnectionDecoration__Group_3_3__2
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_3__1__Impl_in_rule__ConnectionDecoration__Group_3_3__16339);
            rule__ConnectionDecoration__Group_3_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_3__2_in_rule__ConnectionDecoration__Group_3_3__16342);
            rule__ConnectionDecoration__Group_3_3__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConnectionDecoration__Group_3_3__1"


    // $ANTLR start "rule__ConnectionDecoration__Group_3_3__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3051:1: rule__ConnectionDecoration__Group_3_3__1__Impl : ( '=' ) ;
    public final void rule__ConnectionDecoration__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3055:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3056:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3056:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3057:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getEqualsSignKeyword_3_3_1()); 
            }
            match(input,57,FOLLOW_57_in_rule__ConnectionDecoration__Group_3_3__1__Impl6370); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectionDecorationAccess().getEqualsSignKeyword_3_3_1()); 
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
    // $ANTLR end "rule__ConnectionDecoration__Group_3_3__1__Impl"


    // $ANTLR start "rule__ConnectionDecoration__Group_3_3__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3070:1: rule__ConnectionDecoration__Group_3_3__2 : rule__ConnectionDecoration__Group_3_3__2__Impl ;
    public final void rule__ConnectionDecoration__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3074:1: ( rule__ConnectionDecoration__Group_3_3__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3075:2: rule__ConnectionDecoration__Group_3_3__2__Impl
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_3__2__Impl_in_rule__ConnectionDecoration__Group_3_3__26401);
            rule__ConnectionDecoration__Group_3_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConnectionDecoration__Group_3_3__2"


    // $ANTLR start "rule__ConnectionDecoration__Group_3_3__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3081:1: rule__ConnectionDecoration__Group_3_3__2__Impl : ( ( rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2 ) ) ;
    public final void rule__ConnectionDecoration__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3085:1: ( ( ( rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3086:1: ( ( rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3086:1: ( ( rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3087:1: ( rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getBackgroundColorAssignment_3_3_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3088:1: ( rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3088:2: rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2_in_rule__ConnectionDecoration__Group_3_3__2__Impl6428);
            rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectionDecorationAccess().getBackgroundColorAssignment_3_3_2()); 
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
    // $ANTLR end "rule__ConnectionDecoration__Group_3_3__2__Impl"


    // $ANTLR start "rule__ComplexText__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3104:1: rule__ComplexText__Group__0 : rule__ComplexText__Group__0__Impl rule__ComplexText__Group__1 ;
    public final void rule__ComplexText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3108:1: ( rule__ComplexText__Group__0__Impl rule__ComplexText__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3109:2: rule__ComplexText__Group__0__Impl rule__ComplexText__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexText__Group__0__Impl_in_rule__ComplexText__Group__06464);
            rule__ComplexText__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ComplexText__Group__1_in_rule__ComplexText__Group__06467);
            rule__ComplexText__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ComplexText__Group__0"


    // $ANTLR start "rule__ComplexText__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3116:1: rule__ComplexText__Group__0__Impl : ( ( rule__ComplexText__LeftAssignment_0 ) ) ;
    public final void rule__ComplexText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3120:1: ( ( ( rule__ComplexText__LeftAssignment_0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3121:1: ( ( rule__ComplexText__LeftAssignment_0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3121:1: ( ( rule__ComplexText__LeftAssignment_0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3122:1: ( rule__ComplexText__LeftAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTextAccess().getLeftAssignment_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3123:1: ( rule__ComplexText__LeftAssignment_0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3123:2: rule__ComplexText__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__ComplexText__LeftAssignment_0_in_rule__ComplexText__Group__0__Impl6494);
            rule__ComplexText__LeftAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTextAccess().getLeftAssignment_0()); 
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
    // $ANTLR end "rule__ComplexText__Group__0__Impl"


    // $ANTLR start "rule__ComplexText__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3133:1: rule__ComplexText__Group__1 : rule__ComplexText__Group__1__Impl rule__ComplexText__Group__2 ;
    public final void rule__ComplexText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3137:1: ( rule__ComplexText__Group__1__Impl rule__ComplexText__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3138:2: rule__ComplexText__Group__1__Impl rule__ComplexText__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexText__Group__1__Impl_in_rule__ComplexText__Group__16524);
            rule__ComplexText__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ComplexText__Group__2_in_rule__ComplexText__Group__16527);
            rule__ComplexText__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ComplexText__Group__1"


    // $ANTLR start "rule__ComplexText__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3145:1: rule__ComplexText__Group__1__Impl : ( '+' ) ;
    public final void rule__ComplexText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3149:1: ( ( '+' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3150:1: ( '+' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3150:1: ( '+' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3151:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTextAccess().getPlusSignKeyword_1()); 
            }
            match(input,66,FOLLOW_66_in_rule__ComplexText__Group__1__Impl6555); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTextAccess().getPlusSignKeyword_1()); 
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
    // $ANTLR end "rule__ComplexText__Group__1__Impl"


    // $ANTLR start "rule__ComplexText__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3164:1: rule__ComplexText__Group__2 : rule__ComplexText__Group__2__Impl ;
    public final void rule__ComplexText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3168:1: ( rule__ComplexText__Group__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3169:2: rule__ComplexText__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ComplexText__Group__2__Impl_in_rule__ComplexText__Group__26586);
            rule__ComplexText__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ComplexText__Group__2"


    // $ANTLR start "rule__ComplexText__Group__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3175:1: rule__ComplexText__Group__2__Impl : ( ( rule__ComplexText__RightAssignment_2 ) ) ;
    public final void rule__ComplexText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3179:1: ( ( ( rule__ComplexText__RightAssignment_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3180:1: ( ( rule__ComplexText__RightAssignment_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3180:1: ( ( rule__ComplexText__RightAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3181:1: ( rule__ComplexText__RightAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTextAccess().getRightAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3182:1: ( rule__ComplexText__RightAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3182:2: rule__ComplexText__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__ComplexText__RightAssignment_2_in_rule__ComplexText__Group__2__Impl6613);
            rule__ComplexText__RightAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTextAccess().getRightAssignment_2()); 
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
    // $ANTLR end "rule__ComplexText__Group__2__Impl"


    // $ANTLR start "rule__Style__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3198:1: rule__Style__Group__0 : rule__Style__Group__0__Impl rule__Style__Group__1 ;
    public final void rule__Style__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3202:1: ( rule__Style__Group__0__Impl rule__Style__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3203:2: rule__Style__Group__0__Impl rule__Style__Group__1
            {
            pushFollow(FOLLOW_rule__Style__Group__0__Impl_in_rule__Style__Group__06649);
            rule__Style__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Style__Group__1_in_rule__Style__Group__06652);
            rule__Style__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Style__Group__0"


    // $ANTLR start "rule__Style__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3210:1: rule__Style__Group__0__Impl : ( 'line-style' ) ;
    public final void rule__Style__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3214:1: ( ( 'line-style' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3215:1: ( 'line-style' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3215:1: ( 'line-style' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3216:1: 'line-style'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleAccess().getLineStyleKeyword_0()); 
            }
            match(input,67,FOLLOW_67_in_rule__Style__Group__0__Impl6680); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStyleAccess().getLineStyleKeyword_0()); 
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
    // $ANTLR end "rule__Style__Group__0__Impl"


    // $ANTLR start "rule__Style__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3229:1: rule__Style__Group__1 : rule__Style__Group__1__Impl rule__Style__Group__2 ;
    public final void rule__Style__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3233:1: ( rule__Style__Group__1__Impl rule__Style__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3234:2: rule__Style__Group__1__Impl rule__Style__Group__2
            {
            pushFollow(FOLLOW_rule__Style__Group__1__Impl_in_rule__Style__Group__16711);
            rule__Style__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Style__Group__2_in_rule__Style__Group__16714);
            rule__Style__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Style__Group__1"


    // $ANTLR start "rule__Style__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3241:1: rule__Style__Group__1__Impl : ( '=' ) ;
    public final void rule__Style__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3245:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3246:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3246:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3247:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleAccess().getEqualsSignKeyword_1()); 
            }
            match(input,57,FOLLOW_57_in_rule__Style__Group__1__Impl6742); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStyleAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__Style__Group__1__Impl"


    // $ANTLR start "rule__Style__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3260:1: rule__Style__Group__2 : rule__Style__Group__2__Impl ;
    public final void rule__Style__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3264:1: ( rule__Style__Group__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3265:2: rule__Style__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Style__Group__2__Impl_in_rule__Style__Group__26773);
            rule__Style__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Style__Group__2"


    // $ANTLR start "rule__Style__Group__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3271:1: rule__Style__Group__2__Impl : ( ( rule__Style__ValueAssignment_2 ) ) ;
    public final void rule__Style__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3275:1: ( ( ( rule__Style__ValueAssignment_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3276:1: ( ( rule__Style__ValueAssignment_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3276:1: ( ( rule__Style__ValueAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3277:1: ( rule__Style__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleAccess().getValueAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3278:1: ( rule__Style__ValueAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3278:2: rule__Style__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Style__ValueAssignment_2_in_rule__Style__Group__2__Impl6800);
            rule__Style__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStyleAccess().getValueAssignment_2()); 
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
    // $ANTLR end "rule__Style__Group__2__Impl"


    // $ANTLR start "rule__Size__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3294:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3298:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3299:2: rule__Size__Group__0__Impl rule__Size__Group__1
            {
            pushFollow(FOLLOW_rule__Size__Group__0__Impl_in_rule__Size__Group__06836);
            rule__Size__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Size__Group__1_in_rule__Size__Group__06839);
            rule__Size__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Size__Group__0"


    // $ANTLR start "rule__Size__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3306:1: rule__Size__Group__0__Impl : ( 'size' ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3310:1: ( ( 'size' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3311:1: ( 'size' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3311:1: ( 'size' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3312:1: 'size'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getSizeKeyword_0()); 
            }
            match(input,68,FOLLOW_68_in_rule__Size__Group__0__Impl6867); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeAccess().getSizeKeyword_0()); 
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
    // $ANTLR end "rule__Size__Group__0__Impl"


    // $ANTLR start "rule__Size__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3325:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3329:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3330:2: rule__Size__Group__1__Impl rule__Size__Group__2
            {
            pushFollow(FOLLOW_rule__Size__Group__1__Impl_in_rule__Size__Group__16898);
            rule__Size__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Size__Group__2_in_rule__Size__Group__16901);
            rule__Size__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Size__Group__1"


    // $ANTLR start "rule__Size__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3337:1: rule__Size__Group__1__Impl : ( '=' ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3341:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3342:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3342:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3343:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getEqualsSignKeyword_1()); 
            }
            match(input,57,FOLLOW_57_in_rule__Size__Group__1__Impl6929); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__Size__Group__1__Impl"


    // $ANTLR start "rule__Size__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3356:1: rule__Size__Group__2 : rule__Size__Group__2__Impl ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3360:1: ( rule__Size__Group__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3361:2: rule__Size__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Size__Group__2__Impl_in_rule__Size__Group__26960);
            rule__Size__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Size__Group__2"


    // $ANTLR start "rule__Size__Group__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3367:1: rule__Size__Group__2__Impl : ( ( rule__Size__ValueAssignment_2 ) ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3371:1: ( ( ( rule__Size__ValueAssignment_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3372:1: ( ( rule__Size__ValueAssignment_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3372:1: ( ( rule__Size__ValueAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3373:1: ( rule__Size__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getValueAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3374:1: ( rule__Size__ValueAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3374:2: rule__Size__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Size__ValueAssignment_2_in_rule__Size__Group__2__Impl6987);
            rule__Size__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeAccess().getValueAssignment_2()); 
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
    // $ANTLR end "rule__Size__Group__2__Impl"


    // $ANTLR start "rule__Direction__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3390:1: rule__Direction__Group__0 : rule__Direction__Group__0__Impl rule__Direction__Group__1 ;
    public final void rule__Direction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3394:1: ( rule__Direction__Group__0__Impl rule__Direction__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3395:2: rule__Direction__Group__0__Impl rule__Direction__Group__1
            {
            pushFollow(FOLLOW_rule__Direction__Group__0__Impl_in_rule__Direction__Group__07023);
            rule__Direction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Direction__Group__1_in_rule__Direction__Group__07026);
            rule__Direction__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Direction__Group__0"


    // $ANTLR start "rule__Direction__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3402:1: rule__Direction__Group__0__Impl : ( 'direction' ) ;
    public final void rule__Direction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3406:1: ( ( 'direction' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3407:1: ( 'direction' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3407:1: ( 'direction' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3408:1: 'direction'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectionAccess().getDirectionKeyword_0()); 
            }
            match(input,69,FOLLOW_69_in_rule__Direction__Group__0__Impl7054); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectionAccess().getDirectionKeyword_0()); 
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
    // $ANTLR end "rule__Direction__Group__0__Impl"


    // $ANTLR start "rule__Direction__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3421:1: rule__Direction__Group__1 : rule__Direction__Group__1__Impl rule__Direction__Group__2 ;
    public final void rule__Direction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3425:1: ( rule__Direction__Group__1__Impl rule__Direction__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3426:2: rule__Direction__Group__1__Impl rule__Direction__Group__2
            {
            pushFollow(FOLLOW_rule__Direction__Group__1__Impl_in_rule__Direction__Group__17085);
            rule__Direction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Direction__Group__2_in_rule__Direction__Group__17088);
            rule__Direction__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Direction__Group__1"


    // $ANTLR start "rule__Direction__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3433:1: rule__Direction__Group__1__Impl : ( '=' ) ;
    public final void rule__Direction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3437:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3438:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3438:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3439:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,57,FOLLOW_57_in_rule__Direction__Group__1__Impl7116); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectionAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__Direction__Group__1__Impl"


    // $ANTLR start "rule__Direction__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3452:1: rule__Direction__Group__2 : rule__Direction__Group__2__Impl ;
    public final void rule__Direction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3456:1: ( rule__Direction__Group__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3457:2: rule__Direction__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Direction__Group__2__Impl_in_rule__Direction__Group__27147);
            rule__Direction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Direction__Group__2"


    // $ANTLR start "rule__Direction__Group__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3463:1: rule__Direction__Group__2__Impl : ( ( rule__Direction__ValueAssignment_2 ) ) ;
    public final void rule__Direction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3467:1: ( ( ( rule__Direction__ValueAssignment_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3468:1: ( ( rule__Direction__ValueAssignment_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3468:1: ( ( rule__Direction__ValueAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3469:1: ( rule__Direction__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectionAccess().getValueAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3470:1: ( rule__Direction__ValueAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3470:2: rule__Direction__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Direction__ValueAssignment_2_in_rule__Direction__Group__2__Impl7174);
            rule__Direction__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectionAccess().getValueAssignment_2()); 
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
    // $ANTLR end "rule__Direction__Group__2__Impl"


    // $ANTLR start "rule__Margin__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3486:1: rule__Margin__Group__0 : rule__Margin__Group__0__Impl rule__Margin__Group__1 ;
    public final void rule__Margin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3490:1: ( rule__Margin__Group__0__Impl rule__Margin__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3491:2: rule__Margin__Group__0__Impl rule__Margin__Group__1
            {
            pushFollow(FOLLOW_rule__Margin__Group__0__Impl_in_rule__Margin__Group__07210);
            rule__Margin__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Margin__Group__1_in_rule__Margin__Group__07213);
            rule__Margin__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Margin__Group__0"


    // $ANTLR start "rule__Margin__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3498:1: rule__Margin__Group__0__Impl : ( 'margin' ) ;
    public final void rule__Margin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3502:1: ( ( 'margin' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3503:1: ( 'margin' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3503:1: ( 'margin' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3504:1: 'margin'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarginAccess().getMarginKeyword_0()); 
            }
            match(input,70,FOLLOW_70_in_rule__Margin__Group__0__Impl7241); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMarginAccess().getMarginKeyword_0()); 
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
    // $ANTLR end "rule__Margin__Group__0__Impl"


    // $ANTLR start "rule__Margin__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3517:1: rule__Margin__Group__1 : rule__Margin__Group__1__Impl rule__Margin__Group__2 ;
    public final void rule__Margin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3521:1: ( rule__Margin__Group__1__Impl rule__Margin__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3522:2: rule__Margin__Group__1__Impl rule__Margin__Group__2
            {
            pushFollow(FOLLOW_rule__Margin__Group__1__Impl_in_rule__Margin__Group__17272);
            rule__Margin__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Margin__Group__2_in_rule__Margin__Group__17275);
            rule__Margin__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Margin__Group__1"


    // $ANTLR start "rule__Margin__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3529:1: rule__Margin__Group__1__Impl : ( '=' ) ;
    public final void rule__Margin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3533:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3534:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3534:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3535:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarginAccess().getEqualsSignKeyword_1()); 
            }
            match(input,57,FOLLOW_57_in_rule__Margin__Group__1__Impl7303); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMarginAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__Margin__Group__1__Impl"


    // $ANTLR start "rule__Margin__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3548:1: rule__Margin__Group__2 : rule__Margin__Group__2__Impl ;
    public final void rule__Margin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3552:1: ( rule__Margin__Group__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3553:2: rule__Margin__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Margin__Group__2__Impl_in_rule__Margin__Group__27334);
            rule__Margin__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Margin__Group__2"


    // $ANTLR start "rule__Margin__Group__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3559:1: rule__Margin__Group__2__Impl : ( ( rule__Margin__ValueAssignment_2 ) ) ;
    public final void rule__Margin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3563:1: ( ( ( rule__Margin__ValueAssignment_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3564:1: ( ( rule__Margin__ValueAssignment_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3564:1: ( ( rule__Margin__ValueAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3565:1: ( rule__Margin__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarginAccess().getValueAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3566:1: ( rule__Margin__ValueAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3566:2: rule__Margin__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Margin__ValueAssignment_2_in_rule__Margin__Group__2__Impl7361);
            rule__Margin__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMarginAccess().getValueAssignment_2()); 
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
    // $ANTLR end "rule__Margin__Group__2__Impl"


    // $ANTLR start "rule__Color__Group_0__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3582:1: rule__Color__Group_0__0 : rule__Color__Group_0__0__Impl rule__Color__Group_0__1 ;
    public final void rule__Color__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3586:1: ( rule__Color__Group_0__0__Impl rule__Color__Group_0__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3587:2: rule__Color__Group_0__0__Impl rule__Color__Group_0__1
            {
            pushFollow(FOLLOW_rule__Color__Group_0__0__Impl_in_rule__Color__Group_0__07397);
            rule__Color__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Color__Group_0__1_in_rule__Color__Group_0__07400);
            rule__Color__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Color__Group_0__0"


    // $ANTLR start "rule__Color__Group_0__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3594:1: rule__Color__Group_0__0__Impl : ( () ) ;
    public final void rule__Color__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3598:1: ( ( () ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3599:1: ( () )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3599:1: ( () )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3600:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getColorAction_0_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3601:1: ()
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3603:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorAccess().getColorAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group_0__0__Impl"


    // $ANTLR start "rule__Color__Group_0__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3613:1: rule__Color__Group_0__1 : rule__Color__Group_0__1__Impl ;
    public final void rule__Color__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3617:1: ( rule__Color__Group_0__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3618:2: rule__Color__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Color__Group_0__1__Impl_in_rule__Color__Group_0__17458);
            rule__Color__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Color__Group_0__1"


    // $ANTLR start "rule__Color__Group_0__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3624:1: rule__Color__Group_0__1__Impl : ( ( rule__Color__ValueAssignment_0_1 ) ) ;
    public final void rule__Color__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3628:1: ( ( ( rule__Color__ValueAssignment_0_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3629:1: ( ( rule__Color__ValueAssignment_0_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3629:1: ( ( rule__Color__ValueAssignment_0_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3630:1: ( rule__Color__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getValueAssignment_0_1()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3631:1: ( rule__Color__ValueAssignment_0_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3631:2: rule__Color__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Color__ValueAssignment_0_1_in_rule__Color__Group_0__1__Impl7485);
            rule__Color__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorAccess().getValueAssignment_0_1()); 
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
    // $ANTLR end "rule__Color__Group_0__1__Impl"


    // $ANTLR start "rule__RGB__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3645:1: rule__RGB__Group__0 : rule__RGB__Group__0__Impl rule__RGB__Group__1 ;
    public final void rule__RGB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3649:1: ( rule__RGB__Group__0__Impl rule__RGB__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3650:2: rule__RGB__Group__0__Impl rule__RGB__Group__1
            {
            pushFollow(FOLLOW_rule__RGB__Group__0__Impl_in_rule__RGB__Group__07519);
            rule__RGB__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RGB__Group__1_in_rule__RGB__Group__07522);
            rule__RGB__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RGB__Group__0"


    // $ANTLR start "rule__RGB__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3657:1: rule__RGB__Group__0__Impl : ( 'RGB' ) ;
    public final void rule__RGB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3661:1: ( ( 'RGB' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3662:1: ( 'RGB' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3662:1: ( 'RGB' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3663:1: 'RGB'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRGBAccess().getRGBKeyword_0()); 
            }
            match(input,71,FOLLOW_71_in_rule__RGB__Group__0__Impl7550); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRGBAccess().getRGBKeyword_0()); 
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
    // $ANTLR end "rule__RGB__Group__0__Impl"


    // $ANTLR start "rule__RGB__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3676:1: rule__RGB__Group__1 : rule__RGB__Group__1__Impl rule__RGB__Group__2 ;
    public final void rule__RGB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3680:1: ( rule__RGB__Group__1__Impl rule__RGB__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3681:2: rule__RGB__Group__1__Impl rule__RGB__Group__2
            {
            pushFollow(FOLLOW_rule__RGB__Group__1__Impl_in_rule__RGB__Group__17581);
            rule__RGB__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RGB__Group__2_in_rule__RGB__Group__17584);
            rule__RGB__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RGB__Group__1"


    // $ANTLR start "rule__RGB__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3688:1: rule__RGB__Group__1__Impl : ( '(' ) ;
    public final void rule__RGB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3692:1: ( ( '(' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3693:1: ( '(' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3693:1: ( '(' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3694:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRGBAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,72,FOLLOW_72_in_rule__RGB__Group__1__Impl7612); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRGBAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__RGB__Group__1__Impl"


    // $ANTLR start "rule__RGB__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3707:1: rule__RGB__Group__2 : rule__RGB__Group__2__Impl rule__RGB__Group__3 ;
    public final void rule__RGB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3711:1: ( rule__RGB__Group__2__Impl rule__RGB__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3712:2: rule__RGB__Group__2__Impl rule__RGB__Group__3
            {
            pushFollow(FOLLOW_rule__RGB__Group__2__Impl_in_rule__RGB__Group__27643);
            rule__RGB__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RGB__Group__3_in_rule__RGB__Group__27646);
            rule__RGB__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RGB__Group__2"


    // $ANTLR start "rule__RGB__Group__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3719:1: rule__RGB__Group__2__Impl : ( ( rule__RGB__RedAssignment_2 ) ) ;
    public final void rule__RGB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3723:1: ( ( ( rule__RGB__RedAssignment_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3724:1: ( ( rule__RGB__RedAssignment_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3724:1: ( ( rule__RGB__RedAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3725:1: ( rule__RGB__RedAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRGBAccess().getRedAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3726:1: ( rule__RGB__RedAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3726:2: rule__RGB__RedAssignment_2
            {
            pushFollow(FOLLOW_rule__RGB__RedAssignment_2_in_rule__RGB__Group__2__Impl7673);
            rule__RGB__RedAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRGBAccess().getRedAssignment_2()); 
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
    // $ANTLR end "rule__RGB__Group__2__Impl"


    // $ANTLR start "rule__RGB__Group__3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3736:1: rule__RGB__Group__3 : rule__RGB__Group__3__Impl rule__RGB__Group__4 ;
    public final void rule__RGB__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3740:1: ( rule__RGB__Group__3__Impl rule__RGB__Group__4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3741:2: rule__RGB__Group__3__Impl rule__RGB__Group__4
            {
            pushFollow(FOLLOW_rule__RGB__Group__3__Impl_in_rule__RGB__Group__37703);
            rule__RGB__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RGB__Group__4_in_rule__RGB__Group__37706);
            rule__RGB__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RGB__Group__3"


    // $ANTLR start "rule__RGB__Group__3__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3748:1: rule__RGB__Group__3__Impl : ( ',' ) ;
    public final void rule__RGB__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3752:1: ( ( ',' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3753:1: ( ',' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3753:1: ( ',' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3754:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRGBAccess().getCommaKeyword_3()); 
            }
            match(input,73,FOLLOW_73_in_rule__RGB__Group__3__Impl7734); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRGBAccess().getCommaKeyword_3()); 
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
    // $ANTLR end "rule__RGB__Group__3__Impl"


    // $ANTLR start "rule__RGB__Group__4"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3767:1: rule__RGB__Group__4 : rule__RGB__Group__4__Impl rule__RGB__Group__5 ;
    public final void rule__RGB__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3771:1: ( rule__RGB__Group__4__Impl rule__RGB__Group__5 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3772:2: rule__RGB__Group__4__Impl rule__RGB__Group__5
            {
            pushFollow(FOLLOW_rule__RGB__Group__4__Impl_in_rule__RGB__Group__47765);
            rule__RGB__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RGB__Group__5_in_rule__RGB__Group__47768);
            rule__RGB__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RGB__Group__4"


    // $ANTLR start "rule__RGB__Group__4__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3779:1: rule__RGB__Group__4__Impl : ( ( rule__RGB__GreenAssignment_4 ) ) ;
    public final void rule__RGB__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3783:1: ( ( ( rule__RGB__GreenAssignment_4 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3784:1: ( ( rule__RGB__GreenAssignment_4 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3784:1: ( ( rule__RGB__GreenAssignment_4 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3785:1: ( rule__RGB__GreenAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRGBAccess().getGreenAssignment_4()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3786:1: ( rule__RGB__GreenAssignment_4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3786:2: rule__RGB__GreenAssignment_4
            {
            pushFollow(FOLLOW_rule__RGB__GreenAssignment_4_in_rule__RGB__Group__4__Impl7795);
            rule__RGB__GreenAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRGBAccess().getGreenAssignment_4()); 
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
    // $ANTLR end "rule__RGB__Group__4__Impl"


    // $ANTLR start "rule__RGB__Group__5"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3796:1: rule__RGB__Group__5 : rule__RGB__Group__5__Impl rule__RGB__Group__6 ;
    public final void rule__RGB__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3800:1: ( rule__RGB__Group__5__Impl rule__RGB__Group__6 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3801:2: rule__RGB__Group__5__Impl rule__RGB__Group__6
            {
            pushFollow(FOLLOW_rule__RGB__Group__5__Impl_in_rule__RGB__Group__57825);
            rule__RGB__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RGB__Group__6_in_rule__RGB__Group__57828);
            rule__RGB__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RGB__Group__5"


    // $ANTLR start "rule__RGB__Group__5__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3808:1: rule__RGB__Group__5__Impl : ( ',' ) ;
    public final void rule__RGB__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3812:1: ( ( ',' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3813:1: ( ',' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3813:1: ( ',' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3814:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRGBAccess().getCommaKeyword_5()); 
            }
            match(input,73,FOLLOW_73_in_rule__RGB__Group__5__Impl7856); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRGBAccess().getCommaKeyword_5()); 
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
    // $ANTLR end "rule__RGB__Group__5__Impl"


    // $ANTLR start "rule__RGB__Group__6"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3827:1: rule__RGB__Group__6 : rule__RGB__Group__6__Impl rule__RGB__Group__7 ;
    public final void rule__RGB__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3831:1: ( rule__RGB__Group__6__Impl rule__RGB__Group__7 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3832:2: rule__RGB__Group__6__Impl rule__RGB__Group__7
            {
            pushFollow(FOLLOW_rule__RGB__Group__6__Impl_in_rule__RGB__Group__67887);
            rule__RGB__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RGB__Group__7_in_rule__RGB__Group__67890);
            rule__RGB__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RGB__Group__6"


    // $ANTLR start "rule__RGB__Group__6__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3839:1: rule__RGB__Group__6__Impl : ( ( rule__RGB__BlueAssignment_6 ) ) ;
    public final void rule__RGB__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3843:1: ( ( ( rule__RGB__BlueAssignment_6 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3844:1: ( ( rule__RGB__BlueAssignment_6 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3844:1: ( ( rule__RGB__BlueAssignment_6 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3845:1: ( rule__RGB__BlueAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRGBAccess().getBlueAssignment_6()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3846:1: ( rule__RGB__BlueAssignment_6 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3846:2: rule__RGB__BlueAssignment_6
            {
            pushFollow(FOLLOW_rule__RGB__BlueAssignment_6_in_rule__RGB__Group__6__Impl7917);
            rule__RGB__BlueAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRGBAccess().getBlueAssignment_6()); 
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
    // $ANTLR end "rule__RGB__Group__6__Impl"


    // $ANTLR start "rule__RGB__Group__7"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3856:1: rule__RGB__Group__7 : rule__RGB__Group__7__Impl ;
    public final void rule__RGB__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3860:1: ( rule__RGB__Group__7__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3861:2: rule__RGB__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__RGB__Group__7__Impl_in_rule__RGB__Group__77947);
            rule__RGB__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RGB__Group__7"


    // $ANTLR start "rule__RGB__Group__7__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3867:1: rule__RGB__Group__7__Impl : ( ')' ) ;
    public final void rule__RGB__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3871:1: ( ( ')' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3872:1: ( ')' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3872:1: ( ')' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3873:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRGBAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,74,FOLLOW_74_in_rule__RGB__Group__7__Impl7975); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRGBAccess().getRightParenthesisKeyword_7()); 
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
    // $ANTLR end "rule__RGB__Group__7__Impl"


    // $ANTLR start "rule__Activation__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3902:1: rule__Activation__Group__0 : rule__Activation__Group__0__Impl rule__Activation__Group__1 ;
    public final void rule__Activation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3906:1: ( rule__Activation__Group__0__Impl rule__Activation__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3907:2: rule__Activation__Group__0__Impl rule__Activation__Group__1
            {
            pushFollow(FOLLOW_rule__Activation__Group__0__Impl_in_rule__Activation__Group__08022);
            rule__Activation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activation__Group__1_in_rule__Activation__Group__08025);
            rule__Activation__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3914:1: rule__Activation__Group__0__Impl : ( 'active when' ) ;
    public final void rule__Activation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3918:1: ( ( 'active when' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3919:1: ( 'active when' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3919:1: ( 'active when' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3920:1: 'active when'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivationAccess().getActiveWhenKeyword_0()); 
            }
            match(input,75,FOLLOW_75_in_rule__Activation__Group__0__Impl8053); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivationAccess().getActiveWhenKeyword_0()); 
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
    // $ANTLR end "rule__Activation__Group__0__Impl"


    // $ANTLR start "rule__Activation__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3933:1: rule__Activation__Group__1 : rule__Activation__Group__1__Impl ;
    public final void rule__Activation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3937:1: ( rule__Activation__Group__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3938:2: rule__Activation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Activation__Group__1__Impl_in_rule__Activation__Group__18084);
            rule__Activation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3944:1: rule__Activation__Group__1__Impl : ( ( rule__Activation__ConditionAssignment_1 ) ) ;
    public final void rule__Activation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3948:1: ( ( ( rule__Activation__ConditionAssignment_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3949:1: ( ( rule__Activation__ConditionAssignment_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3949:1: ( ( rule__Activation__ConditionAssignment_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3950:1: ( rule__Activation__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivationAccess().getConditionAssignment_1()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3951:1: ( rule__Activation__ConditionAssignment_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3951:2: rule__Activation__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__Activation__ConditionAssignment_1_in_rule__Activation__Group__1__Impl8111);
            rule__Activation__ConditionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivationAccess().getConditionAssignment_1()); 
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
    // $ANTLR end "rule__Activation__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3965:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3969:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3970:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__08145);
            rule__Condition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__08148);
            rule__Condition__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3977:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__AttributeAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3981:1: ( ( ( rule__Condition__AttributeAssignment_0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3982:1: ( ( rule__Condition__AttributeAssignment_0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3982:1: ( ( rule__Condition__AttributeAssignment_0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3983:1: ( rule__Condition__AttributeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getAttributeAssignment_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3984:1: ( rule__Condition__AttributeAssignment_0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3984:2: rule__Condition__AttributeAssignment_0
            {
            pushFollow(FOLLOW_rule__Condition__AttributeAssignment_0_in_rule__Condition__Group__0__Impl8175);
            rule__Condition__AttributeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getAttributeAssignment_0()); 
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
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3994:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3998:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3999:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__18205);
            rule__Condition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__18208);
            rule__Condition__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4006:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__OperatorAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4010:1: ( ( ( rule__Condition__OperatorAssignment_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4011:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4011:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4012:1: ( rule__Condition__OperatorAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getOperatorAssignment_1()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4013:1: ( rule__Condition__OperatorAssignment_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4013:2: rule__Condition__OperatorAssignment_1
            {
            pushFollow(FOLLOW_rule__Condition__OperatorAssignment_1_in_rule__Condition__Group__1__Impl8235);
            rule__Condition__OperatorAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getOperatorAssignment_1()); 
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
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4023:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4027:1: ( rule__Condition__Group__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4028:2: rule__Condition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__28265);
            rule__Condition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4034:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__ValueAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4038:1: ( ( ( rule__Condition__ValueAssignment_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4039:1: ( ( rule__Condition__ValueAssignment_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4039:1: ( ( rule__Condition__ValueAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4040:1: ( rule__Condition__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getValueAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4041:1: ( rule__Condition__ValueAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4041:2: rule__Condition__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Condition__ValueAssignment_2_in_rule__Condition__Group__2__Impl8292);
            rule__Condition__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getValueAssignment_2()); 
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
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4057:1: rule__CompositeCondition__Group__0 : rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1 ;
    public final void rule__CompositeCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4061:1: ( rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4062:2: rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1
            {
            pushFollow(FOLLOW_rule__CompositeCondition__Group__0__Impl_in_rule__CompositeCondition__Group__08328);
            rule__CompositeCondition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompositeCondition__Group__1_in_rule__CompositeCondition__Group__08331);
            rule__CompositeCondition__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4069:1: rule__CompositeCondition__Group__0__Impl : ( ( rule__CompositeCondition__OperatorAssignment_0 ) ) ;
    public final void rule__CompositeCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4073:1: ( ( ( rule__CompositeCondition__OperatorAssignment_0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4074:1: ( ( rule__CompositeCondition__OperatorAssignment_0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4074:1: ( ( rule__CompositeCondition__OperatorAssignment_0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4075:1: ( rule__CompositeCondition__OperatorAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getOperatorAssignment_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4076:1: ( rule__CompositeCondition__OperatorAssignment_0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4076:2: rule__CompositeCondition__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__CompositeCondition__OperatorAssignment_0_in_rule__CompositeCondition__Group__0__Impl8358);
            rule__CompositeCondition__OperatorAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getOperatorAssignment_0()); 
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
    // $ANTLR end "rule__CompositeCondition__Group__0__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4086:1: rule__CompositeCondition__Group__1 : rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2 ;
    public final void rule__CompositeCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4090:1: ( rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4091:2: rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2
            {
            pushFollow(FOLLOW_rule__CompositeCondition__Group__1__Impl_in_rule__CompositeCondition__Group__18388);
            rule__CompositeCondition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompositeCondition__Group__2_in_rule__CompositeCondition__Group__18391);
            rule__CompositeCondition__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4098:1: rule__CompositeCondition__Group__1__Impl : ( '(' ) ;
    public final void rule__CompositeCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4102:1: ( ( '(' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4103:1: ( '(' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4103:1: ( '(' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4104:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,72,FOLLOW_72_in_rule__CompositeCondition__Group__1__Impl8419); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__CompositeCondition__Group__1__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4117:1: rule__CompositeCondition__Group__2 : rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3 ;
    public final void rule__CompositeCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4121:1: ( rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4122:2: rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3
            {
            pushFollow(FOLLOW_rule__CompositeCondition__Group__2__Impl_in_rule__CompositeCondition__Group__28450);
            rule__CompositeCondition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompositeCondition__Group__3_in_rule__CompositeCondition__Group__28453);
            rule__CompositeCondition__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4129:1: rule__CompositeCondition__Group__2__Impl : ( ( ( rule__CompositeCondition__ConditionsAssignment_2 ) ) ( ( rule__CompositeCondition__ConditionsAssignment_2 )* ) ) ;
    public final void rule__CompositeCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4133:1: ( ( ( ( rule__CompositeCondition__ConditionsAssignment_2 ) ) ( ( rule__CompositeCondition__ConditionsAssignment_2 )* ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4134:1: ( ( ( rule__CompositeCondition__ConditionsAssignment_2 ) ) ( ( rule__CompositeCondition__ConditionsAssignment_2 )* ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4134:1: ( ( ( rule__CompositeCondition__ConditionsAssignment_2 ) ) ( ( rule__CompositeCondition__ConditionsAssignment_2 )* ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4135:1: ( ( rule__CompositeCondition__ConditionsAssignment_2 ) ) ( ( rule__CompositeCondition__ConditionsAssignment_2 )* )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4135:1: ( ( rule__CompositeCondition__ConditionsAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4136:1: ( rule__CompositeCondition__ConditionsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getConditionsAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4137:1: ( rule__CompositeCondition__ConditionsAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4137:2: rule__CompositeCondition__ConditionsAssignment_2
            {
            pushFollow(FOLLOW_rule__CompositeCondition__ConditionsAssignment_2_in_rule__CompositeCondition__Group__2__Impl8482);
            rule__CompositeCondition__ConditionsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getConditionsAssignment_2()); 
            }

            }

            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4140:1: ( ( rule__CompositeCondition__ConditionsAssignment_2 )* )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4141:1: ( rule__CompositeCondition__ConditionsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getConditionsAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4142:1: ( rule__CompositeCondition__ConditionsAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=19 && LA15_0<=20)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4142:2: rule__CompositeCondition__ConditionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__CompositeCondition__ConditionsAssignment_2_in_rule__CompositeCondition__Group__2__Impl8494);
            	    rule__CompositeCondition__ConditionsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getConditionsAssignment_2()); 
            }

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4153:1: rule__CompositeCondition__Group__3 : rule__CompositeCondition__Group__3__Impl ;
    public final void rule__CompositeCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4157:1: ( rule__CompositeCondition__Group__3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4158:2: rule__CompositeCondition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CompositeCondition__Group__3__Impl_in_rule__CompositeCondition__Group__38527);
            rule__CompositeCondition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4164:1: rule__CompositeCondition__Group__3__Impl : ( ')' ) ;
    public final void rule__CompositeCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4168:1: ( ( ')' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4169:1: ( ')' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4169:1: ( ')' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4170:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,74,FOLLOW_74_in_rule__CompositeCondition__Group__3__Impl8555); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__CompositeCondition__Group__3__Impl"


    // $ANTLR start "rule__SignedDouble__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4191:1: rule__SignedDouble__Group__0 : rule__SignedDouble__Group__0__Impl rule__SignedDouble__Group__1 ;
    public final void rule__SignedDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4195:1: ( rule__SignedDouble__Group__0__Impl rule__SignedDouble__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4196:2: rule__SignedDouble__Group__0__Impl rule__SignedDouble__Group__1
            {
            pushFollow(FOLLOW_rule__SignedDouble__Group__0__Impl_in_rule__SignedDouble__Group__08594);
            rule__SignedDouble__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SignedDouble__Group__1_in_rule__SignedDouble__Group__08597);
            rule__SignedDouble__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SignedDouble__Group__0"


    // $ANTLR start "rule__SignedDouble__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4203:1: rule__SignedDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SignedDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4207:1: ( ( ( '-' )? ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4208:1: ( ( '-' )? )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4208:1: ( ( '-' )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4209:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedDoubleAccess().getHyphenMinusKeyword_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4210:1: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==76) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4211:2: '-'
                    {
                    match(input,76,FOLLOW_76_in_rule__SignedDouble__Group__0__Impl8626); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignedDoubleAccess().getHyphenMinusKeyword_0()); 
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
    // $ANTLR end "rule__SignedDouble__Group__0__Impl"


    // $ANTLR start "rule__SignedDouble__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4222:1: rule__SignedDouble__Group__1 : rule__SignedDouble__Group__1__Impl rule__SignedDouble__Group__2 ;
    public final void rule__SignedDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4226:1: ( rule__SignedDouble__Group__1__Impl rule__SignedDouble__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4227:2: rule__SignedDouble__Group__1__Impl rule__SignedDouble__Group__2
            {
            pushFollow(FOLLOW_rule__SignedDouble__Group__1__Impl_in_rule__SignedDouble__Group__18659);
            rule__SignedDouble__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SignedDouble__Group__2_in_rule__SignedDouble__Group__18662);
            rule__SignedDouble__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SignedDouble__Group__1"


    // $ANTLR start "rule__SignedDouble__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4234:1: rule__SignedDouble__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__SignedDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4238:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4239:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4239:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4240:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedDoubleAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SignedDouble__Group__1__Impl8689); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignedDoubleAccess().getINTTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__SignedDouble__Group__1__Impl"


    // $ANTLR start "rule__SignedDouble__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4251:1: rule__SignedDouble__Group__2 : rule__SignedDouble__Group__2__Impl rule__SignedDouble__Group__3 ;
    public final void rule__SignedDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4255:1: ( rule__SignedDouble__Group__2__Impl rule__SignedDouble__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4256:2: rule__SignedDouble__Group__2__Impl rule__SignedDouble__Group__3
            {
            pushFollow(FOLLOW_rule__SignedDouble__Group__2__Impl_in_rule__SignedDouble__Group__28718);
            rule__SignedDouble__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SignedDouble__Group__3_in_rule__SignedDouble__Group__28721);
            rule__SignedDouble__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SignedDouble__Group__2"


    // $ANTLR start "rule__SignedDouble__Group__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4263:1: rule__SignedDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__SignedDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4267:1: ( ( '.' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4268:1: ( '.' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4268:1: ( '.' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4269:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedDoubleAccess().getFullStopKeyword_2()); 
            }
            match(input,77,FOLLOW_77_in_rule__SignedDouble__Group__2__Impl8749); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignedDoubleAccess().getFullStopKeyword_2()); 
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
    // $ANTLR end "rule__SignedDouble__Group__2__Impl"


    // $ANTLR start "rule__SignedDouble__Group__3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4282:1: rule__SignedDouble__Group__3 : rule__SignedDouble__Group__3__Impl ;
    public final void rule__SignedDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4286:1: ( rule__SignedDouble__Group__3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4287:2: rule__SignedDouble__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SignedDouble__Group__3__Impl_in_rule__SignedDouble__Group__38780);
            rule__SignedDouble__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SignedDouble__Group__3"


    // $ANTLR start "rule__SignedDouble__Group__3__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4293:1: rule__SignedDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__SignedDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4297:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4298:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4298:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4299:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedDoubleAccess().getINTTerminalRuleCall_3()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SignedDouble__Group__3__Impl8807); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignedDoubleAccess().getINTTerminalRuleCall_3()); 
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
    // $ANTLR end "rule__SignedDouble__Group__3__Impl"


    // $ANTLR start "rule__SignedInteger__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4318:1: rule__SignedInteger__Group__0 : rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 ;
    public final void rule__SignedInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4322:1: ( rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4323:2: rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1
            {
            pushFollow(FOLLOW_rule__SignedInteger__Group__0__Impl_in_rule__SignedInteger__Group__08844);
            rule__SignedInteger__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SignedInteger__Group__1_in_rule__SignedInteger__Group__08847);
            rule__SignedInteger__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SignedInteger__Group__0"


    // $ANTLR start "rule__SignedInteger__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4330:1: rule__SignedInteger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SignedInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4334:1: ( ( ( '-' )? ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4335:1: ( ( '-' )? )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4335:1: ( ( '-' )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4336:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4337:1: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==76) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4338:2: '-'
                    {
                    match(input,76,FOLLOW_76_in_rule__SignedInteger__Group__0__Impl8876); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignedIntegerAccess().getHyphenMinusKeyword_0()); 
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
    // $ANTLR end "rule__SignedInteger__Group__0__Impl"


    // $ANTLR start "rule__SignedInteger__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4349:1: rule__SignedInteger__Group__1 : rule__SignedInteger__Group__1__Impl ;
    public final void rule__SignedInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4353:1: ( rule__SignedInteger__Group__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4354:2: rule__SignedInteger__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SignedInteger__Group__1__Impl_in_rule__SignedInteger__Group__18909);
            rule__SignedInteger__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SignedInteger__Group__1"


    // $ANTLR start "rule__SignedInteger__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4360:1: rule__SignedInteger__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__SignedInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4364:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4365:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4365:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4366:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedIntegerAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SignedInteger__Group__1__Impl8936); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignedIntegerAccess().getINTTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__SignedInteger__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4382:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4386:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4387:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08970);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08973);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4394:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4398:1: ( ( RULE_ID ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4399:1: ( RULE_ID )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4399:1: ( RULE_ID )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4400:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl9000); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4411:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4415:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4416:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__19029);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4422:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4426:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4427:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4427:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4428:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4429:1: ( rule__QualifiedName__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==77) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4429:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl9056);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4443:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4447:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4448:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__09091);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__09094);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4455:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4459:1: ( ( '.' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4460:1: ( '.' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4460:1: ( '.' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4461:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,77,FOLLOW_77_in_rule__QualifiedName__Group_1__0__Impl9122); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4474:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4478:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4479:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__19153);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4485:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4489:1: ( ( RULE_ID ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4490:1: ( RULE_ID )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4490:1: ( RULE_ID )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4491:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl9180); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__DecorationDescription__UnorderedGroup_3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4507:1: rule__DecorationDescription__UnorderedGroup_3 : rule__DecorationDescription__UnorderedGroup_3__0 {...}?;
    public final void rule__DecorationDescription__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3());
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4512:1: ( rule__DecorationDescription__UnorderedGroup_3__0 {...}?)
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4513:2: rule__DecorationDescription__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_rule__DecorationDescription__UnorderedGroup_3__0_in_rule__DecorationDescription__UnorderedGroup_39214);
            rule__DecorationDescription__UnorderedGroup_3__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__DecorationDescription__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationDescription__UnorderedGroup_3"


    // $ANTLR start "rule__DecorationDescription__UnorderedGroup_3__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4524:1: rule__DecorationDescription__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) ) ) ) ;
    public final void rule__DecorationDescription__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4529:1: ( ( ({...}? => ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) ) ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4530:3: ( ({...}? => ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4530:3: ( ({...}? => ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==55|| LA20_0 >=59 && LA20_0<=60 ||LA20_0==63) && getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 1) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4532:4: ({...}? => ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4532:4: ({...}? => ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4533:5: {...}? => ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__DecorationDescription__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4533:118: ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4534:6: ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4540:6: ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4541:6: ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4541:6: ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4542:7: ( rule__DecorationDescription__DecorationsAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecorationDescriptionAccess().getDecorationsAssignment_3_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4543:7: ( rule__DecorationDescription__DecorationsAssignment_3_0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4543:8: rule__DecorationDescription__DecorationsAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__DecorationDescription__DecorationsAssignment_3_0_in_rule__DecorationDescription__UnorderedGroup_3__Impl9304);
                    rule__DecorationDescription__DecorationsAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDecorationDescriptionAccess().getDecorationsAssignment_3_0()); 
                    }

                    }

                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4546:6: ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4547:7: ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecorationDescriptionAccess().getDecorationsAssignment_3_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4548:7: ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )*
                    loop19:
                    do {
                        int alt19=2;
                        switch ( input.LA(1) ) {
                        case 55:
                            {
                            int LA19_1 = input.LA(2);

                            if ( (synpred1_InternalEMFProfileDecorationLanguage()) ) {
                                alt19=1;
                            }


                            }
                            break;
                        case 59:
                            {
                            int LA19_2 = input.LA(2);

                            if ( (synpred1_InternalEMFProfileDecorationLanguage()) ) {
                                alt19=1;
                            }


                            }
                            break;
                        case 60:
                            {
                            int LA19_3 = input.LA(2);

                            if ( (synpred1_InternalEMFProfileDecorationLanguage()) ) {
                                alt19=1;
                            }


                            }
                            break;
                        case 63:
                            {
                            int LA19_4 = input.LA(2);

                            if ( (synpred1_InternalEMFProfileDecorationLanguage()) ) {
                                alt19=1;
                            }


                            }
                            break;

                        }

                        switch (alt19) {
                    	case 1 :
                    	    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4548:8: ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0
                    	    {
                    	    pushFollow(FOLLOW_rule__DecorationDescription__DecorationsAssignment_3_0_in_rule__DecorationDescription__UnorderedGroup_3__Impl9348);
                    	    rule__DecorationDescription__DecorationsAssignment_3_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDecorationDescriptionAccess().getDecorationsAssignment_3_0()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4554:4: ({...}? => ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4554:4: ({...}? => ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4555:5: {...}? => ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__DecorationDescription__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4555:118: ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4556:6: ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4562:6: ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4564:7: ( rule__DecorationDescription__ActivationAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecorationDescriptionAccess().getActivationAssignment_3_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4565:7: ( rule__DecorationDescription__ActivationAssignment_3_1 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4565:8: rule__DecorationDescription__ActivationAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__DecorationDescription__ActivationAssignment_3_1_in_rule__DecorationDescription__UnorderedGroup_3__Impl9446);
                    rule__DecorationDescription__ActivationAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDecorationDescriptionAccess().getActivationAssignment_3_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecorationDescription__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__DecorationDescription__UnorderedGroup_3__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4580:1: rule__DecorationDescription__UnorderedGroup_3__0 : rule__DecorationDescription__UnorderedGroup_3__Impl ( rule__DecorationDescription__UnorderedGroup_3__1 )? ;
    public final void rule__DecorationDescription__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4584:1: ( rule__DecorationDescription__UnorderedGroup_3__Impl ( rule__DecorationDescription__UnorderedGroup_3__1 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4585:2: rule__DecorationDescription__UnorderedGroup_3__Impl ( rule__DecorationDescription__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__DecorationDescription__UnorderedGroup_3__Impl_in_rule__DecorationDescription__UnorderedGroup_3__09505);
            rule__DecorationDescription__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4586:2: ( rule__DecorationDescription__UnorderedGroup_3__1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==55|| LA21_0 >=59 && LA21_0<=60 ||LA21_0==63) && getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 1) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4586:2: rule__DecorationDescription__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__DecorationDescription__UnorderedGroup_3__1_in_rule__DecorationDescription__UnorderedGroup_3__09508);
                    rule__DecorationDescription__UnorderedGroup_3__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__DecorationDescription__UnorderedGroup_3__0"


    // $ANTLR start "rule__DecorationDescription__UnorderedGroup_3__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4593:1: rule__DecorationDescription__UnorderedGroup_3__1 : rule__DecorationDescription__UnorderedGroup_3__Impl ;
    public final void rule__DecorationDescription__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4597:1: ( rule__DecorationDescription__UnorderedGroup_3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4598:2: rule__DecorationDescription__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__DecorationDescription__UnorderedGroup_3__Impl_in_rule__DecorationDescription__UnorderedGroup_3__19533);
            rule__DecorationDescription__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__DecorationDescription__UnorderedGroup_3__1"


    // $ANTLR start "rule__ImageDecoration__UnorderedGroup_3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4609:1: rule__ImageDecoration__UnorderedGroup_3 : rule__ImageDecoration__UnorderedGroup_3__0 {...}?;
    public final void rule__ImageDecoration__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3());
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4614:1: ( rule__ImageDecoration__UnorderedGroup_3__0 {...}?)
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4615:2: rule__ImageDecoration__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__0_in_rule__ImageDecoration__UnorderedGroup_39561);
            rule__ImageDecoration__UnorderedGroup_3__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__ImageDecoration__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDecoration__UnorderedGroup_3"


    // $ANTLR start "rule__ImageDecoration__UnorderedGroup_3__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4626:1: rule__ImageDecoration__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) ) ) ) ;
    public final void rule__ImageDecoration__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4631:1: ( ( ({...}? => ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) ) ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4632:3: ( ({...}? => ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4632:3: ( ({...}? => ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) ) ) )
            int alt22=5;
            int LA22_0 = input.LA(1);

            if ( LA22_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 ==69 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt22=2;
            }
            else if ( LA22_0 ==70 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt22=3;
            }
            else if ( LA22_0 ==58 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt22=4;
            }
            else if ( LA22_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4) ) {
                alt22=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4634:4: ({...}? => ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4634:4: ({...}? => ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4635:5: {...}? => ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ImageDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4635:112: ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4636:6: ( ( rule__ImageDecoration__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4642:6: ( ( rule__ImageDecoration__Group_3_0__0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4644:7: ( rule__ImageDecoration__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImageDecorationAccess().getGroup_3_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4645:7: ( rule__ImageDecoration__Group_3_0__0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4645:8: rule__ImageDecoration__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__Group_3_0__0_in_rule__ImageDecoration__UnorderedGroup_3__Impl9650);
                    rule__ImageDecoration__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImageDecorationAccess().getGroup_3_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4651:4: ({...}? => ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4651:4: ({...}? => ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4652:5: {...}? => ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ImageDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4652:112: ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4653:6: ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4659:6: ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4661:7: ( rule__ImageDecoration__DirectionAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImageDecorationAccess().getDirectionAssignment_3_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4662:7: ( rule__ImageDecoration__DirectionAssignment_3_1 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4662:8: rule__ImageDecoration__DirectionAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__DirectionAssignment_3_1_in_rule__ImageDecoration__UnorderedGroup_3__Impl9741);
                    rule__ImageDecoration__DirectionAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImageDecorationAccess().getDirectionAssignment_3_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4668:4: ({...}? => ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4668:4: ({...}? => ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4669:5: {...}? => ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ImageDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4669:112: ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4670:6: ( ( rule__ImageDecoration__MarginAssignment_3_2 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4676:6: ( ( rule__ImageDecoration__MarginAssignment_3_2 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4678:7: ( rule__ImageDecoration__MarginAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImageDecorationAccess().getMarginAssignment_3_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4679:7: ( rule__ImageDecoration__MarginAssignment_3_2 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4679:8: rule__ImageDecoration__MarginAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__MarginAssignment_3_2_in_rule__ImageDecoration__UnorderedGroup_3__Impl9832);
                    rule__ImageDecoration__MarginAssignment_3_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImageDecorationAccess().getMarginAssignment_3_2()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4685:4: ({...}? => ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4685:4: ({...}? => ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4686:5: {...}? => ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ImageDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4686:112: ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4687:6: ( ( rule__ImageDecoration__Group_3_3__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4693:6: ( ( rule__ImageDecoration__Group_3_3__0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4695:7: ( rule__ImageDecoration__Group_3_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImageDecorationAccess().getGroup_3_3()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4696:7: ( rule__ImageDecoration__Group_3_3__0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4696:8: rule__ImageDecoration__Group_3_3__0
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__Group_3_3__0_in_rule__ImageDecoration__UnorderedGroup_3__Impl9923);
                    rule__ImageDecoration__Group_3_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImageDecorationAccess().getGroup_3_3()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4702:4: ({...}? => ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4702:4: ({...}? => ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4703:5: {...}? => ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ImageDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4703:112: ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4704:6: ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4710:6: ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4712:7: ( rule__ImageDecoration__ActivationAssignment_3_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImageDecorationAccess().getActivationAssignment_3_4()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4713:7: ( rule__ImageDecoration__ActivationAssignment_3_4 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4713:8: rule__ImageDecoration__ActivationAssignment_3_4
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__ActivationAssignment_3_4_in_rule__ImageDecoration__UnorderedGroup_3__Impl10014);
                    rule__ImageDecoration__ActivationAssignment_3_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImageDecorationAccess().getActivationAssignment_3_4()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDecoration__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__ImageDecoration__UnorderedGroup_3__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4728:1: rule__ImageDecoration__UnorderedGroup_3__0 : rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__1 )? ;
    public final void rule__ImageDecoration__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4732:1: ( rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__1 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4733:2: rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__010073);
            rule__ImageDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4734:2: ( rule__ImageDecoration__UnorderedGroup_3__1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 ==69 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt23=1;
            }
            else if ( LA23_0 ==70 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt23=1;
            }
            else if ( LA23_0 ==58 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt23=1;
            }
            else if ( LA23_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4734:2: rule__ImageDecoration__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__1_in_rule__ImageDecoration__UnorderedGroup_3__010076);
                    rule__ImageDecoration__UnorderedGroup_3__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__ImageDecoration__UnorderedGroup_3__0"


    // $ANTLR start "rule__ImageDecoration__UnorderedGroup_3__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4741:1: rule__ImageDecoration__UnorderedGroup_3__1 : rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__2 )? ;
    public final void rule__ImageDecoration__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4745:1: ( rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__2 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4746:2: rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__110101);
            rule__ImageDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4747:2: ( rule__ImageDecoration__UnorderedGroup_3__2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 ==69 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt24=1;
            }
            else if ( LA24_0 ==70 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt24=1;
            }
            else if ( LA24_0 ==58 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt24=1;
            }
            else if ( LA24_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4747:2: rule__ImageDecoration__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__2_in_rule__ImageDecoration__UnorderedGroup_3__110104);
                    rule__ImageDecoration__UnorderedGroup_3__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__ImageDecoration__UnorderedGroup_3__1"


    // $ANTLR start "rule__ImageDecoration__UnorderedGroup_3__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4754:1: rule__ImageDecoration__UnorderedGroup_3__2 : rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__3 )? ;
    public final void rule__ImageDecoration__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4758:1: ( rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__3 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4759:2: rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__210129);
            rule__ImageDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4760:2: ( rule__ImageDecoration__UnorderedGroup_3__3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( LA25_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 ==69 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt25=1;
            }
            else if ( LA25_0 ==70 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt25=1;
            }
            else if ( LA25_0 ==58 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt25=1;
            }
            else if ( LA25_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4760:2: rule__ImageDecoration__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__3_in_rule__ImageDecoration__UnorderedGroup_3__210132);
                    rule__ImageDecoration__UnorderedGroup_3__3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__ImageDecoration__UnorderedGroup_3__2"


    // $ANTLR start "rule__ImageDecoration__UnorderedGroup_3__3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4767:1: rule__ImageDecoration__UnorderedGroup_3__3 : rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__4 )? ;
    public final void rule__ImageDecoration__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4771:1: ( rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__4 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4772:2: rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__4 )?
            {
            pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__310157);
            rule__ImageDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4773:2: ( rule__ImageDecoration__UnorderedGroup_3__4 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( LA26_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt26=1;
            }
            else if ( LA26_0 ==69 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt26=1;
            }
            else if ( LA26_0 ==70 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt26=1;
            }
            else if ( LA26_0 ==58 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt26=1;
            }
            else if ( LA26_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4773:2: rule__ImageDecoration__UnorderedGroup_3__4
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__4_in_rule__ImageDecoration__UnorderedGroup_3__310160);
                    rule__ImageDecoration__UnorderedGroup_3__4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__ImageDecoration__UnorderedGroup_3__3"


    // $ANTLR start "rule__ImageDecoration__UnorderedGroup_3__4"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4780:1: rule__ImageDecoration__UnorderedGroup_3__4 : rule__ImageDecoration__UnorderedGroup_3__Impl ;
    public final void rule__ImageDecoration__UnorderedGroup_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4784:1: ( rule__ImageDecoration__UnorderedGroup_3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4785:2: rule__ImageDecoration__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__410185);
            rule__ImageDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ImageDecoration__UnorderedGroup_3__4"


    // $ANTLR start "rule__BorderDecoration__UnorderedGroup_3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4802:1: rule__BorderDecoration__UnorderedGroup_3 : ( rule__BorderDecoration__UnorderedGroup_3__0 )? ;
    public final void rule__BorderDecoration__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3());
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4807:1: ( ( rule__BorderDecoration__UnorderedGroup_3__0 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4808:2: ( rule__BorderDecoration__UnorderedGroup_3__0 )?
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4808:2: ( rule__BorderDecoration__UnorderedGroup_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( LA27_0 ==68 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt27=1;
            }
            else if ( LA27_0 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt27=1;
            }
            else if ( LA27_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt27=1;
            }
            else if ( LA27_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4808:2: rule__BorderDecoration__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__0_in_rule__BorderDecoration__UnorderedGroup_310219);
                    rule__BorderDecoration__UnorderedGroup_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderDecoration__UnorderedGroup_3"


    // $ANTLR start "rule__BorderDecoration__UnorderedGroup_3__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4818:1: rule__BorderDecoration__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) ) ) ) ;
    public final void rule__BorderDecoration__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4823:1: ( ( ({...}? => ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) ) ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4824:3: ( ({...}? => ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4824:3: ( ({...}? => ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) ) ) )
            int alt28=4;
            int LA28_0 = input.LA(1);

            if ( LA28_0 ==68 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt28=2;
            }
            else if ( LA28_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt28=3;
            }
            else if ( LA28_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt28=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4826:4: ({...}? => ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4826:4: ({...}? => ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4827:5: {...}? => ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__BorderDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4827:113: ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4828:6: ( ( rule__BorderDecoration__SizeAssignment_3_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4834:6: ( ( rule__BorderDecoration__SizeAssignment_3_0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4836:7: ( rule__BorderDecoration__SizeAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBorderDecorationAccess().getSizeAssignment_3_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4837:7: ( rule__BorderDecoration__SizeAssignment_3_0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4837:8: rule__BorderDecoration__SizeAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__SizeAssignment_3_0_in_rule__BorderDecoration__UnorderedGroup_3__Impl10306);
                    rule__BorderDecoration__SizeAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBorderDecorationAccess().getSizeAssignment_3_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4843:4: ({...}? => ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4843:4: ({...}? => ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4844:5: {...}? => ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__BorderDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4844:113: ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4845:6: ( ( rule__BorderDecoration__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4851:6: ( ( rule__BorderDecoration__Group_3_1__0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4853:7: ( rule__BorderDecoration__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBorderDecorationAccess().getGroup_3_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4854:7: ( rule__BorderDecoration__Group_3_1__0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4854:8: rule__BorderDecoration__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__Group_3_1__0_in_rule__BorderDecoration__UnorderedGroup_3__Impl10397);
                    rule__BorderDecoration__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBorderDecorationAccess().getGroup_3_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4860:4: ({...}? => ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4860:4: ({...}? => ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4861:5: {...}? => ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__BorderDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4861:113: ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4862:6: ( ( rule__BorderDecoration__StyleAssignment_3_2 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4868:6: ( ( rule__BorderDecoration__StyleAssignment_3_2 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4870:7: ( rule__BorderDecoration__StyleAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBorderDecorationAccess().getStyleAssignment_3_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4871:7: ( rule__BorderDecoration__StyleAssignment_3_2 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4871:8: rule__BorderDecoration__StyleAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__StyleAssignment_3_2_in_rule__BorderDecoration__UnorderedGroup_3__Impl10488);
                    rule__BorderDecoration__StyleAssignment_3_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBorderDecorationAccess().getStyleAssignment_3_2()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4877:4: ({...}? => ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4877:4: ({...}? => ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4878:5: {...}? => ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__BorderDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4878:113: ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4879:6: ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4885:6: ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4887:7: ( rule__BorderDecoration__ActivationAssignment_3_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBorderDecorationAccess().getActivationAssignment_3_3()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4888:7: ( rule__BorderDecoration__ActivationAssignment_3_3 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4888:8: rule__BorderDecoration__ActivationAssignment_3_3
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__ActivationAssignment_3_3_in_rule__BorderDecoration__UnorderedGroup_3__Impl10579);
                    rule__BorderDecoration__ActivationAssignment_3_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBorderDecorationAccess().getActivationAssignment_3_3()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BorderDecoration__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__BorderDecoration__UnorderedGroup_3__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4903:1: rule__BorderDecoration__UnorderedGroup_3__0 : rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__1 )? ;
    public final void rule__BorderDecoration__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4907:1: ( rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__1 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4908:2: rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__010638);
            rule__BorderDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4909:2: ( rule__BorderDecoration__UnorderedGroup_3__1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( LA29_0 ==68 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt29=1;
            }
            else if ( LA29_0 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt29=1;
            }
            else if ( LA29_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt29=1;
            }
            else if ( LA29_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4909:2: rule__BorderDecoration__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__1_in_rule__BorderDecoration__UnorderedGroup_3__010641);
                    rule__BorderDecoration__UnorderedGroup_3__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__BorderDecoration__UnorderedGroup_3__0"


    // $ANTLR start "rule__BorderDecoration__UnorderedGroup_3__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4916:1: rule__BorderDecoration__UnorderedGroup_3__1 : rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__2 )? ;
    public final void rule__BorderDecoration__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4920:1: ( rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__2 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4921:2: rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__110666);
            rule__BorderDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4922:2: ( rule__BorderDecoration__UnorderedGroup_3__2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( LA30_0 ==68 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt30=1;
            }
            else if ( LA30_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt30=1;
            }
            else if ( LA30_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4922:2: rule__BorderDecoration__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__2_in_rule__BorderDecoration__UnorderedGroup_3__110669);
                    rule__BorderDecoration__UnorderedGroup_3__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__BorderDecoration__UnorderedGroup_3__1"


    // $ANTLR start "rule__BorderDecoration__UnorderedGroup_3__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4929:1: rule__BorderDecoration__UnorderedGroup_3__2 : rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__3 )? ;
    public final void rule__BorderDecoration__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4933:1: ( rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__3 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4934:2: rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__210694);
            rule__BorderDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4935:2: ( rule__BorderDecoration__UnorderedGroup_3__3 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 ==68 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt31=1;
            }
            else if ( LA31_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt31=1;
            }
            else if ( LA31_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4935:2: rule__BorderDecoration__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__3_in_rule__BorderDecoration__UnorderedGroup_3__210697);
                    rule__BorderDecoration__UnorderedGroup_3__3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__BorderDecoration__UnorderedGroup_3__2"


    // $ANTLR start "rule__BorderDecoration__UnorderedGroup_3__3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4942:1: rule__BorderDecoration__UnorderedGroup_3__3 : rule__BorderDecoration__UnorderedGroup_3__Impl ;
    public final void rule__BorderDecoration__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4946:1: ( rule__BorderDecoration__UnorderedGroup_3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4947:2: rule__BorderDecoration__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__310722);
            rule__BorderDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BorderDecoration__UnorderedGroup_3__3"


    // $ANTLR start "rule__ColorDecoration__UnorderedGroup_3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4962:1: rule__ColorDecoration__UnorderedGroup_3 : ( rule__ColorDecoration__UnorderedGroup_3__0 )? ;
    public final void rule__ColorDecoration__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3());
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4967:1: ( ( rule__ColorDecoration__UnorderedGroup_3__0 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4968:2: ( rule__ColorDecoration__UnorderedGroup_3__0 )?
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4968:2: ( rule__ColorDecoration__UnorderedGroup_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( LA32_0 ==61 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 ==62 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt32=1;
            }
            else if ( LA32_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4968:2: rule__ColorDecoration__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_rule__ColorDecoration__UnorderedGroup_3__0_in_rule__ColorDecoration__UnorderedGroup_310754);
                    rule__ColorDecoration__UnorderedGroup_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorDecoration__UnorderedGroup_3"


    // $ANTLR start "rule__ColorDecoration__UnorderedGroup_3__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4978:1: rule__ColorDecoration__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) ) ) ) ;
    public final void rule__ColorDecoration__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4983:1: ( ( ({...}? => ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) ) ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4984:3: ( ({...}? => ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4984:3: ( ({...}? => ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) ) ) )
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( LA33_0 ==61 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt33=1;
            }
            else if ( LA33_0 ==62 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt33=2;
            }
            else if ( LA33_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt33=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4986:4: ({...}? => ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4986:4: ({...}? => ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4987:5: {...}? => ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ColorDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4987:112: ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4988:6: ( ( rule__ColorDecoration__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4994:6: ( ( rule__ColorDecoration__Group_3_0__0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4996:7: ( rule__ColorDecoration__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorDecorationAccess().getGroup_3_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4997:7: ( rule__ColorDecoration__Group_3_0__0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4997:8: rule__ColorDecoration__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__ColorDecoration__Group_3_0__0_in_rule__ColorDecoration__UnorderedGroup_3__Impl10841);
                    rule__ColorDecoration__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorDecorationAccess().getGroup_3_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5003:4: ({...}? => ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5003:4: ({...}? => ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5004:5: {...}? => ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ColorDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5004:112: ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5005:6: ( ( rule__ColorDecoration__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5011:6: ( ( rule__ColorDecoration__Group_3_1__0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5013:7: ( rule__ColorDecoration__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorDecorationAccess().getGroup_3_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5014:7: ( rule__ColorDecoration__Group_3_1__0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5014:8: rule__ColorDecoration__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__ColorDecoration__Group_3_1__0_in_rule__ColorDecoration__UnorderedGroup_3__Impl10932);
                    rule__ColorDecoration__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorDecorationAccess().getGroup_3_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5020:4: ({...}? => ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5020:4: ({...}? => ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5021:5: {...}? => ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ColorDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5021:112: ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5022:6: ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5028:6: ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5030:7: ( rule__ColorDecoration__ActivationAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorDecorationAccess().getActivationAssignment_3_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5031:7: ( rule__ColorDecoration__ActivationAssignment_3_2 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5031:8: rule__ColorDecoration__ActivationAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__ColorDecoration__ActivationAssignment_3_2_in_rule__ColorDecoration__UnorderedGroup_3__Impl11023);
                    rule__ColorDecoration__ActivationAssignment_3_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorDecorationAccess().getActivationAssignment_3_2()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorDecoration__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__ColorDecoration__UnorderedGroup_3__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5046:1: rule__ColorDecoration__UnorderedGroup_3__0 : rule__ColorDecoration__UnorderedGroup_3__Impl ( rule__ColorDecoration__UnorderedGroup_3__1 )? ;
    public final void rule__ColorDecoration__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5050:1: ( rule__ColorDecoration__UnorderedGroup_3__Impl ( rule__ColorDecoration__UnorderedGroup_3__1 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5051:2: rule__ColorDecoration__UnorderedGroup_3__Impl ( rule__ColorDecoration__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__ColorDecoration__UnorderedGroup_3__Impl_in_rule__ColorDecoration__UnorderedGroup_3__011082);
            rule__ColorDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5052:2: ( rule__ColorDecoration__UnorderedGroup_3__1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( LA34_0 ==61 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt34=1;
            }
            else if ( LA34_0 ==62 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt34=1;
            }
            else if ( LA34_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5052:2: rule__ColorDecoration__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__ColorDecoration__UnorderedGroup_3__1_in_rule__ColorDecoration__UnorderedGroup_3__011085);
                    rule__ColorDecoration__UnorderedGroup_3__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__ColorDecoration__UnorderedGroup_3__0"


    // $ANTLR start "rule__ColorDecoration__UnorderedGroup_3__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5059:1: rule__ColorDecoration__UnorderedGroup_3__1 : rule__ColorDecoration__UnorderedGroup_3__Impl ( rule__ColorDecoration__UnorderedGroup_3__2 )? ;
    public final void rule__ColorDecoration__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5063:1: ( rule__ColorDecoration__UnorderedGroup_3__Impl ( rule__ColorDecoration__UnorderedGroup_3__2 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5064:2: rule__ColorDecoration__UnorderedGroup_3__Impl ( rule__ColorDecoration__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_rule__ColorDecoration__UnorderedGroup_3__Impl_in_rule__ColorDecoration__UnorderedGroup_3__111110);
            rule__ColorDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5065:2: ( rule__ColorDecoration__UnorderedGroup_3__2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( LA35_0 ==61 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt35=1;
            }
            else if ( LA35_0 ==62 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt35=1;
            }
            else if ( LA35_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5065:2: rule__ColorDecoration__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_rule__ColorDecoration__UnorderedGroup_3__2_in_rule__ColorDecoration__UnorderedGroup_3__111113);
                    rule__ColorDecoration__UnorderedGroup_3__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__ColorDecoration__UnorderedGroup_3__1"


    // $ANTLR start "rule__ColorDecoration__UnorderedGroup_3__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5072:1: rule__ColorDecoration__UnorderedGroup_3__2 : rule__ColorDecoration__UnorderedGroup_3__Impl ;
    public final void rule__ColorDecoration__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5076:1: ( rule__ColorDecoration__UnorderedGroup_3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5077:2: rule__ColorDecoration__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__ColorDecoration__UnorderedGroup_3__Impl_in_rule__ColorDecoration__UnorderedGroup_3__211138);
            rule__ColorDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ColorDecoration__UnorderedGroup_3__2"


    // $ANTLR start "rule__ConnectionDecoration__UnorderedGroup_3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5090:1: rule__ConnectionDecoration__UnorderedGroup_3 : ( rule__ConnectionDecoration__UnorderedGroup_3__0 )? ;
    public final void rule__ConnectionDecoration__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3());
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5095:1: ( ( rule__ConnectionDecoration__UnorderedGroup_3__0 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5096:2: ( rule__ConnectionDecoration__UnorderedGroup_3__0 )?
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5096:2: ( rule__ConnectionDecoration__UnorderedGroup_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( LA36_0 ==68 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt36=1;
            }
            else if ( LA36_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt36=1;
            }
            else if ( LA36_0 ==64 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt36=1;
            }
            else if ( LA36_0 ==65 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt36=1;
            }
            else if ( LA36_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5096:2: rule__ConnectionDecoration__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__0_in_rule__ConnectionDecoration__UnorderedGroup_311168);
                    rule__ConnectionDecoration__UnorderedGroup_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionDecoration__UnorderedGroup_3"


    // $ANTLR start "rule__ConnectionDecoration__UnorderedGroup_3__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5106:1: rule__ConnectionDecoration__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) ) ) ) ;
    public final void rule__ConnectionDecoration__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5111:1: ( ( ({...}? => ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) ) ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5112:3: ( ({...}? => ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5112:3: ( ({...}? => ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) ) ) )
            int alt37=5;
            int LA37_0 = input.LA(1);

            if ( LA37_0 ==68 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt37=1;
            }
            else if ( LA37_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt37=2;
            }
            else if ( LA37_0 ==64 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt37=3;
            }
            else if ( LA37_0 ==65 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt37=4;
            }
            else if ( LA37_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4) ) {
                alt37=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5114:4: ({...}? => ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5114:4: ({...}? => ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5115:5: {...}? => ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ConnectionDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5115:117: ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5116:6: ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5122:6: ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5124:7: ( rule__ConnectionDecoration__SizeAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConnectionDecorationAccess().getSizeAssignment_3_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5125:7: ( rule__ConnectionDecoration__SizeAssignment_3_0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5125:8: rule__ConnectionDecoration__SizeAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__SizeAssignment_3_0_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11255);
                    rule__ConnectionDecoration__SizeAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConnectionDecorationAccess().getSizeAssignment_3_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5131:4: ({...}? => ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5131:4: ({...}? => ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5132:5: {...}? => ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ConnectionDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5132:117: ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5133:6: ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5139:6: ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5141:7: ( rule__ConnectionDecoration__StyleAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConnectionDecorationAccess().getStyleAssignment_3_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5142:7: ( rule__ConnectionDecoration__StyleAssignment_3_1 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5142:8: rule__ConnectionDecoration__StyleAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__StyleAssignment_3_1_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11346);
                    rule__ConnectionDecoration__StyleAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConnectionDecorationAccess().getStyleAssignment_3_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5148:4: ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5148:4: ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5149:5: {...}? => ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ConnectionDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5149:117: ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5150:6: ( ( rule__ConnectionDecoration__Group_3_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5156:6: ( ( rule__ConnectionDecoration__Group_3_2__0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5158:7: ( rule__ConnectionDecoration__Group_3_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConnectionDecorationAccess().getGroup_3_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5159:7: ( rule__ConnectionDecoration__Group_3_2__0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5159:8: rule__ConnectionDecoration__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_2__0_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11437);
                    rule__ConnectionDecoration__Group_3_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConnectionDecorationAccess().getGroup_3_2()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5165:4: ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5165:4: ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5166:5: {...}? => ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ConnectionDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5166:117: ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5167:6: ( ( rule__ConnectionDecoration__Group_3_3__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5173:6: ( ( rule__ConnectionDecoration__Group_3_3__0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5175:7: ( rule__ConnectionDecoration__Group_3_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConnectionDecorationAccess().getGroup_3_3()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5176:7: ( rule__ConnectionDecoration__Group_3_3__0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5176:8: rule__ConnectionDecoration__Group_3_3__0
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_3__0_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11528);
                    rule__ConnectionDecoration__Group_3_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConnectionDecorationAccess().getGroup_3_3()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5182:4: ({...}? => ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5182:4: ({...}? => ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5183:5: {...}? => ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ConnectionDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5183:117: ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5184:6: ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5190:6: ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5192:7: ( rule__ConnectionDecoration__ActivationAssignment_3_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConnectionDecorationAccess().getActivationAssignment_3_4()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5193:7: ( rule__ConnectionDecoration__ActivationAssignment_3_4 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5193:8: rule__ConnectionDecoration__ActivationAssignment_3_4
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__ActivationAssignment_3_4_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11619);
                    rule__ConnectionDecoration__ActivationAssignment_3_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConnectionDecorationAccess().getActivationAssignment_3_4()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionDecoration__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__ConnectionDecoration__UnorderedGroup_3__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5208:1: rule__ConnectionDecoration__UnorderedGroup_3__0 : rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__1 )? ;
    public final void rule__ConnectionDecoration__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5212:1: ( rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__1 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5213:2: rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__011678);
            rule__ConnectionDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5214:2: ( rule__ConnectionDecoration__UnorderedGroup_3__1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( LA38_0 ==68 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt38=1;
            }
            else if ( LA38_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt38=1;
            }
            else if ( LA38_0 ==64 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt38=1;
            }
            else if ( LA38_0 ==65 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt38=1;
            }
            else if ( LA38_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5214:2: rule__ConnectionDecoration__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__1_in_rule__ConnectionDecoration__UnorderedGroup_3__011681);
                    rule__ConnectionDecoration__UnorderedGroup_3__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__ConnectionDecoration__UnorderedGroup_3__0"


    // $ANTLR start "rule__ConnectionDecoration__UnorderedGroup_3__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5221:1: rule__ConnectionDecoration__UnorderedGroup_3__1 : rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__2 )? ;
    public final void rule__ConnectionDecoration__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5225:1: ( rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__2 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5226:2: rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__111706);
            rule__ConnectionDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5227:2: ( rule__ConnectionDecoration__UnorderedGroup_3__2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( LA39_0 ==68 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt39=1;
            }
            else if ( LA39_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt39=1;
            }
            else if ( LA39_0 ==64 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt39=1;
            }
            else if ( LA39_0 ==65 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt39=1;
            }
            else if ( LA39_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5227:2: rule__ConnectionDecoration__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__2_in_rule__ConnectionDecoration__UnorderedGroup_3__111709);
                    rule__ConnectionDecoration__UnorderedGroup_3__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__ConnectionDecoration__UnorderedGroup_3__1"


    // $ANTLR start "rule__ConnectionDecoration__UnorderedGroup_3__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5234:1: rule__ConnectionDecoration__UnorderedGroup_3__2 : rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__3 )? ;
    public final void rule__ConnectionDecoration__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5238:1: ( rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__3 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5239:2: rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__211734);
            rule__ConnectionDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5240:2: ( rule__ConnectionDecoration__UnorderedGroup_3__3 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( LA40_0 ==68 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt40=1;
            }
            else if ( LA40_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt40=1;
            }
            else if ( LA40_0 ==64 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt40=1;
            }
            else if ( LA40_0 ==65 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt40=1;
            }
            else if ( LA40_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5240:2: rule__ConnectionDecoration__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__3_in_rule__ConnectionDecoration__UnorderedGroup_3__211737);
                    rule__ConnectionDecoration__UnorderedGroup_3__3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__ConnectionDecoration__UnorderedGroup_3__2"


    // $ANTLR start "rule__ConnectionDecoration__UnorderedGroup_3__3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5247:1: rule__ConnectionDecoration__UnorderedGroup_3__3 : rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__4 )? ;
    public final void rule__ConnectionDecoration__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5251:1: ( rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__4 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5252:2: rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__4 )?
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__311762);
            rule__ConnectionDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5253:2: ( rule__ConnectionDecoration__UnorderedGroup_3__4 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( LA41_0 ==68 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt41=1;
            }
            else if ( LA41_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt41=1;
            }
            else if ( LA41_0 ==64 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt41=1;
            }
            else if ( LA41_0 ==65 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt41=1;
            }
            else if ( LA41_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5253:2: rule__ConnectionDecoration__UnorderedGroup_3__4
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__4_in_rule__ConnectionDecoration__UnorderedGroup_3__311765);
                    rule__ConnectionDecoration__UnorderedGroup_3__4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__ConnectionDecoration__UnorderedGroup_3__3"


    // $ANTLR start "rule__ConnectionDecoration__UnorderedGroup_3__4"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5260:1: rule__ConnectionDecoration__UnorderedGroup_3__4 : rule__ConnectionDecoration__UnorderedGroup_3__Impl ;
    public final void rule__ConnectionDecoration__UnorderedGroup_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5264:1: ( rule__ConnectionDecoration__UnorderedGroup_3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5265:2: rule__ConnectionDecoration__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__411790);
            rule__ConnectionDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ConnectionDecoration__UnorderedGroup_3__4"


    // $ANTLR start "rule__DecorationModel__ImportURIAssignment_1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5282:1: rule__DecorationModel__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DecorationModel__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5286:1: ( ( RULE_STRING ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5287:1: ( RULE_STRING )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5287:1: ( RULE_STRING )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5288:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationModelAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DecorationModel__ImportURIAssignment_111828); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecorationModelAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__DecorationModel__ImportURIAssignment_1"


    // $ANTLR start "rule__DecorationModel__NamespaceAssignment_2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5297:1: rule__DecorationModel__NamespaceAssignment_2 : ( ruleNamespace ) ;
    public final void rule__DecorationModel__NamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5301:1: ( ( ruleNamespace ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5302:1: ( ruleNamespace )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5302:1: ( ruleNamespace )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5303:1: ruleNamespace
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationModelAccess().getNamespaceNamespaceParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleNamespace_in_rule__DecorationModel__NamespaceAssignment_211859);
            ruleNamespace();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecorationModelAccess().getNamespaceNamespaceParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__DecorationModel__NamespaceAssignment_2"


    // $ANTLR start "rule__DecorationModel__DecorationDescriptionsAssignment_3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5312:1: rule__DecorationModel__DecorationDescriptionsAssignment_3 : ( ruleDecorationDescription ) ;
    public final void rule__DecorationModel__DecorationDescriptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5316:1: ( ( ruleDecorationDescription ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5317:1: ( ruleDecorationDescription )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5317:1: ( ruleDecorationDescription )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5318:1: ruleDecorationDescription
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationModelAccess().getDecorationDescriptionsDecorationDescriptionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleDecorationDescription_in_rule__DecorationModel__DecorationDescriptionsAssignment_311890);
            ruleDecorationDescription();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecorationModelAccess().getDecorationDescriptionsDecorationDescriptionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__DecorationModel__DecorationDescriptionsAssignment_3"


    // $ANTLR start "rule__Namespace__ProfileAssignment_1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5327:1: rule__Namespace__ProfileAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Namespace__ProfileAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5331:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5332:1: ( ( ruleQualifiedName ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5332:1: ( ( ruleQualifiedName ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5333:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceAccess().getProfileProfileCrossReference_1_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5334:1: ( ruleQualifiedName )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5335:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceAccess().getProfileProfileQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Namespace__ProfileAssignment_111925);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceAccess().getProfileProfileQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamespaceAccess().getProfileProfileCrossReference_1_0()); 
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
    // $ANTLR end "rule__Namespace__ProfileAssignment_1"


    // $ANTLR start "rule__DecorationDescription__StereotypeAssignment_1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5346:1: rule__DecorationDescription__StereotypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DecorationDescription__StereotypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5350:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5351:1: ( ( ruleQualifiedName ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5351:1: ( ( ruleQualifiedName ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5352:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getStereotypeStereotypeCrossReference_1_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5353:1: ( ruleQualifiedName )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5354:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getStereotypeStereotypeQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DecorationDescription__StereotypeAssignment_111964);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecorationDescriptionAccess().getStereotypeStereotypeQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecorationDescriptionAccess().getStereotypeStereotypeCrossReference_1_0()); 
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
    // $ANTLR end "rule__DecorationDescription__StereotypeAssignment_1"


    // $ANTLR start "rule__DecorationDescription__DecorationsAssignment_3_0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5365:1: rule__DecorationDescription__DecorationsAssignment_3_0 : ( ruleAbstractDecoration ) ;
    public final void rule__DecorationDescription__DecorationsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5369:1: ( ( ruleAbstractDecoration ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5370:1: ( ruleAbstractDecoration )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5370:1: ( ruleAbstractDecoration )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5371:1: ruleAbstractDecoration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getDecorationsAbstractDecorationParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleAbstractDecoration_in_rule__DecorationDescription__DecorationsAssignment_3_011999);
            ruleAbstractDecoration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecorationDescriptionAccess().getDecorationsAbstractDecorationParserRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__DecorationDescription__DecorationsAssignment_3_0"


    // $ANTLR start "rule__DecorationDescription__ActivationAssignment_3_1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5380:1: rule__DecorationDescription__ActivationAssignment_3_1 : ( ruleActivation ) ;
    public final void rule__DecorationDescription__ActivationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5384:1: ( ( ruleActivation ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5385:1: ( ruleActivation )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5385:1: ( ruleActivation )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5386:1: ruleActivation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getActivationActivationParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleActivation_in_rule__DecorationDescription__ActivationAssignment_3_112030);
            ruleActivation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecorationDescriptionAccess().getActivationActivationParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__DecorationDescription__ActivationAssignment_3_1"


    // $ANTLR start "rule__ImageDecoration__Location_uriAssignment_3_0_2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5395:1: rule__ImageDecoration__Location_uriAssignment_3_0_2 : ( RULE_STRING ) ;
    public final void rule__ImageDecoration__Location_uriAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5399:1: ( ( RULE_STRING ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5400:1: ( RULE_STRING )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5400:1: ( RULE_STRING )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5401:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getLocation_uriSTRINGTerminalRuleCall_3_0_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ImageDecoration__Location_uriAssignment_3_0_212061); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageDecorationAccess().getLocation_uriSTRINGTerminalRuleCall_3_0_2_0()); 
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
    // $ANTLR end "rule__ImageDecoration__Location_uriAssignment_3_0_2"


    // $ANTLR start "rule__ImageDecoration__DirectionAssignment_3_1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5410:1: rule__ImageDecoration__DirectionAssignment_3_1 : ( ruleDirection ) ;
    public final void rule__ImageDecoration__DirectionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5414:1: ( ( ruleDirection ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5415:1: ( ruleDirection )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5415:1: ( ruleDirection )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5416:1: ruleDirection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getDirectionDirectionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleDirection_in_rule__ImageDecoration__DirectionAssignment_3_112092);
            ruleDirection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageDecorationAccess().getDirectionDirectionParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__ImageDecoration__DirectionAssignment_3_1"


    // $ANTLR start "rule__ImageDecoration__MarginAssignment_3_2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5425:1: rule__ImageDecoration__MarginAssignment_3_2 : ( ruleMargin ) ;
    public final void rule__ImageDecoration__MarginAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5429:1: ( ( ruleMargin ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5430:1: ( ruleMargin )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5430:1: ( ruleMargin )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5431:1: ruleMargin
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getMarginMarginParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleMargin_in_rule__ImageDecoration__MarginAssignment_3_212123);
            ruleMargin();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageDecorationAccess().getMarginMarginParserRuleCall_3_2_0()); 
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
    // $ANTLR end "rule__ImageDecoration__MarginAssignment_3_2"


    // $ANTLR start "rule__ImageDecoration__TooltipAssignment_3_3_2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5440:1: rule__ImageDecoration__TooltipAssignment_3_3_2 : ( ruleText ) ;
    public final void rule__ImageDecoration__TooltipAssignment_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5444:1: ( ( ruleText ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5445:1: ( ruleText )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5445:1: ( ruleText )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5446:1: ruleText
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getTooltipTextParserRuleCall_3_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleText_in_rule__ImageDecoration__TooltipAssignment_3_3_212154);
            ruleText();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageDecorationAccess().getTooltipTextParserRuleCall_3_3_2_0()); 
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
    // $ANTLR end "rule__ImageDecoration__TooltipAssignment_3_3_2"


    // $ANTLR start "rule__ImageDecoration__ActivationAssignment_3_4"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5455:1: rule__ImageDecoration__ActivationAssignment_3_4 : ( ruleActivation ) ;
    public final void rule__ImageDecoration__ActivationAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5459:1: ( ( ruleActivation ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5460:1: ( ruleActivation )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5460:1: ( ruleActivation )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5461:1: ruleActivation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getActivationActivationParserRuleCall_3_4_0()); 
            }
            pushFollow(FOLLOW_ruleActivation_in_rule__ImageDecoration__ActivationAssignment_3_412185);
            ruleActivation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageDecorationAccess().getActivationActivationParserRuleCall_3_4_0()); 
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
    // $ANTLR end "rule__ImageDecoration__ActivationAssignment_3_4"


    // $ANTLR start "rule__BorderDecoration__SizeAssignment_3_0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5470:1: rule__BorderDecoration__SizeAssignment_3_0 : ( ruleSize ) ;
    public final void rule__BorderDecoration__SizeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5474:1: ( ( ruleSize ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5475:1: ( ruleSize )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5475:1: ( ruleSize )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5476:1: ruleSize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getSizeSizeParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleSize_in_rule__BorderDecoration__SizeAssignment_3_012216);
            ruleSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBorderDecorationAccess().getSizeSizeParserRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__BorderDecoration__SizeAssignment_3_0"


    // $ANTLR start "rule__BorderDecoration__ColorAssignment_3_1_2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5485:1: rule__BorderDecoration__ColorAssignment_3_1_2 : ( ruleColor ) ;
    public final void rule__BorderDecoration__ColorAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5489:1: ( ( ruleColor ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5490:1: ( ruleColor )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5490:1: ( ruleColor )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5491:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getColorColorParserRuleCall_3_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__BorderDecoration__ColorAssignment_3_1_212247);
            ruleColor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBorderDecorationAccess().getColorColorParserRuleCall_3_1_2_0()); 
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
    // $ANTLR end "rule__BorderDecoration__ColorAssignment_3_1_2"


    // $ANTLR start "rule__BorderDecoration__StyleAssignment_3_2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5500:1: rule__BorderDecoration__StyleAssignment_3_2 : ( ruleStyle ) ;
    public final void rule__BorderDecoration__StyleAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5504:1: ( ( ruleStyle ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5505:1: ( ruleStyle )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5505:1: ( ruleStyle )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5506:1: ruleStyle
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getStyleStyleParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleStyle_in_rule__BorderDecoration__StyleAssignment_3_212278);
            ruleStyle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBorderDecorationAccess().getStyleStyleParserRuleCall_3_2_0()); 
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
    // $ANTLR end "rule__BorderDecoration__StyleAssignment_3_2"


    // $ANTLR start "rule__BorderDecoration__ActivationAssignment_3_3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5515:1: rule__BorderDecoration__ActivationAssignment_3_3 : ( ruleActivation ) ;
    public final void rule__BorderDecoration__ActivationAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5519:1: ( ( ruleActivation ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5520:1: ( ruleActivation )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5520:1: ( ruleActivation )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5521:1: ruleActivation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getActivationActivationParserRuleCall_3_3_0()); 
            }
            pushFollow(FOLLOW_ruleActivation_in_rule__BorderDecoration__ActivationAssignment_3_312309);
            ruleActivation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBorderDecorationAccess().getActivationActivationParserRuleCall_3_3_0()); 
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
    // $ANTLR end "rule__BorderDecoration__ActivationAssignment_3_3"


    // $ANTLR start "rule__ColorDecoration__BackgroundAssignment_3_0_2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5530:1: rule__ColorDecoration__BackgroundAssignment_3_0_2 : ( ruleColor ) ;
    public final void rule__ColorDecoration__BackgroundAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5534:1: ( ( ruleColor ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5535:1: ( ruleColor )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5535:1: ( ruleColor )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5536:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getBackgroundColorParserRuleCall_3_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__ColorDecoration__BackgroundAssignment_3_0_212340);
            ruleColor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorDecorationAccess().getBackgroundColorParserRuleCall_3_0_2_0()); 
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
    // $ANTLR end "rule__ColorDecoration__BackgroundAssignment_3_0_2"


    // $ANTLR start "rule__ColorDecoration__ForegroundAssignment_3_1_2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5545:1: rule__ColorDecoration__ForegroundAssignment_3_1_2 : ( ruleColor ) ;
    public final void rule__ColorDecoration__ForegroundAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5549:1: ( ( ruleColor ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5550:1: ( ruleColor )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5550:1: ( ruleColor )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5551:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getForegroundColorParserRuleCall_3_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__ColorDecoration__ForegroundAssignment_3_1_212371);
            ruleColor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorDecorationAccess().getForegroundColorParserRuleCall_3_1_2_0()); 
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
    // $ANTLR end "rule__ColorDecoration__ForegroundAssignment_3_1_2"


    // $ANTLR start "rule__ColorDecoration__ActivationAssignment_3_2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5560:1: rule__ColorDecoration__ActivationAssignment_3_2 : ( ruleActivation ) ;
    public final void rule__ColorDecoration__ActivationAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5564:1: ( ( ruleActivation ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5565:1: ( ruleActivation )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5565:1: ( ruleActivation )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5566:1: ruleActivation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getActivationActivationParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleActivation_in_rule__ColorDecoration__ActivationAssignment_3_212402);
            ruleActivation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorDecorationAccess().getActivationActivationParserRuleCall_3_2_0()); 
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
    // $ANTLR end "rule__ColorDecoration__ActivationAssignment_3_2"


    // $ANTLR start "rule__ConnectionDecoration__SizeAssignment_3_0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5575:1: rule__ConnectionDecoration__SizeAssignment_3_0 : ( ruleSize ) ;
    public final void rule__ConnectionDecoration__SizeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5579:1: ( ( ruleSize ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5580:1: ( ruleSize )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5580:1: ( ruleSize )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5581:1: ruleSize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getSizeSizeParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleSize_in_rule__ConnectionDecoration__SizeAssignment_3_012433);
            ruleSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectionDecorationAccess().getSizeSizeParserRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__ConnectionDecoration__SizeAssignment_3_0"


    // $ANTLR start "rule__ConnectionDecoration__StyleAssignment_3_1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5590:1: rule__ConnectionDecoration__StyleAssignment_3_1 : ( ruleStyle ) ;
    public final void rule__ConnectionDecoration__StyleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5594:1: ( ( ruleStyle ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5595:1: ( ruleStyle )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5595:1: ( ruleStyle )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5596:1: ruleStyle
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getStyleStyleParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleStyle_in_rule__ConnectionDecoration__StyleAssignment_3_112464);
            ruleStyle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectionDecorationAccess().getStyleStyleParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__ConnectionDecoration__StyleAssignment_3_1"


    // $ANTLR start "rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5605:1: rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2 : ( ruleColor ) ;
    public final void rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5609:1: ( ( ruleColor ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5610:1: ( ruleColor )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5610:1: ( ruleColor )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5611:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getForegroundColorColorParserRuleCall_3_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__ConnectionDecoration__ForegroundColorAssignment_3_2_212495);
            ruleColor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectionDecorationAccess().getForegroundColorColorParserRuleCall_3_2_2_0()); 
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
    // $ANTLR end "rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2"


    // $ANTLR start "rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5620:1: rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2 : ( ruleColor ) ;
    public final void rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5624:1: ( ( ruleColor ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5625:1: ( ruleColor )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5625:1: ( ruleColor )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5626:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getBackgroundColorColorParserRuleCall_3_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__ConnectionDecoration__BackgroundColorAssignment_3_3_212526);
            ruleColor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectionDecorationAccess().getBackgroundColorColorParserRuleCall_3_3_2_0()); 
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
    // $ANTLR end "rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2"


    // $ANTLR start "rule__ConnectionDecoration__ActivationAssignment_3_4"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5635:1: rule__ConnectionDecoration__ActivationAssignment_3_4 : ( ruleActivation ) ;
    public final void rule__ConnectionDecoration__ActivationAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5639:1: ( ( ruleActivation ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5640:1: ( ruleActivation )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5640:1: ( ruleActivation )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5641:1: ruleActivation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getActivationActivationParserRuleCall_3_4_0()); 
            }
            pushFollow(FOLLOW_ruleActivation_in_rule__ConnectionDecoration__ActivationAssignment_3_412557);
            ruleActivation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectionDecorationAccess().getActivationActivationParserRuleCall_3_4_0()); 
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
    // $ANTLR end "rule__ConnectionDecoration__ActivationAssignment_3_4"


    // $ANTLR start "rule__SimpleText__TextAssignment_0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5650:1: rule__SimpleText__TextAssignment_0 : ( RULE_STRING ) ;
    public final void rule__SimpleText__TextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5654:1: ( ( RULE_STRING ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5655:1: ( RULE_STRING )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5655:1: ( RULE_STRING )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5656:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleTextAccess().getTextSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleText__TextAssignment_012588); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleTextAccess().getTextSTRINGTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__SimpleText__TextAssignment_0"


    // $ANTLR start "rule__SimpleText__AttributeAssignment_1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5665:1: rule__SimpleText__AttributeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SimpleText__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5669:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5670:1: ( ( ruleQualifiedName ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5670:1: ( ( ruleQualifiedName ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5671:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleTextAccess().getAttributeEAttributeCrossReference_1_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5672:1: ( ruleQualifiedName )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5673:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleTextAccess().getAttributeEAttributeQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__SimpleText__AttributeAssignment_112623);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleTextAccess().getAttributeEAttributeQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleTextAccess().getAttributeEAttributeCrossReference_1_0()); 
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
    // $ANTLR end "rule__SimpleText__AttributeAssignment_1"


    // $ANTLR start "rule__ComplexText__LeftAssignment_0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5684:1: rule__ComplexText__LeftAssignment_0 : ( ruleSimpleText ) ;
    public final void rule__ComplexText__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5688:1: ( ( ruleSimpleText ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5689:1: ( ruleSimpleText )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5689:1: ( ruleSimpleText )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5690:1: ruleSimpleText
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTextAccess().getLeftSimpleTextParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSimpleText_in_rule__ComplexText__LeftAssignment_012658);
            ruleSimpleText();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTextAccess().getLeftSimpleTextParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__ComplexText__LeftAssignment_0"


    // $ANTLR start "rule__ComplexText__RightAssignment_2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5699:1: rule__ComplexText__RightAssignment_2 : ( ruleText ) ;
    public final void rule__ComplexText__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5703:1: ( ( ruleText ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5704:1: ( ruleText )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5704:1: ( ruleText )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5705:1: ruleText
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTextAccess().getRightTextParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleText_in_rule__ComplexText__RightAssignment_212689);
            ruleText();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTextAccess().getRightTextParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ComplexText__RightAssignment_2"


    // $ANTLR start "rule__Style__ValueAssignment_2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5714:1: rule__Style__ValueAssignment_2 : ( ruleLineStyle ) ;
    public final void rule__Style__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5718:1: ( ( ruleLineStyle ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5719:1: ( ruleLineStyle )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5719:1: ( ruleLineStyle )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5720:1: ruleLineStyle
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleAccess().getValueLineStyleEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleLineStyle_in_rule__Style__ValueAssignment_212720);
            ruleLineStyle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStyleAccess().getValueLineStyleEnumRuleCall_2_0()); 
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
    // $ANTLR end "rule__Style__ValueAssignment_2"


    // $ANTLR start "rule__Size__ValueAssignment_2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5729:1: rule__Size__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__Size__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5733:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5734:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5734:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5735:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getValueINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Size__ValueAssignment_212751); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSizeAccess().getValueINTTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Size__ValueAssignment_2"


    // $ANTLR start "rule__Direction__ValueAssignment_2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5744:1: rule__Direction__ValueAssignment_2 : ( ruleDirections ) ;
    public final void rule__Direction__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5748:1: ( ( ruleDirections ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5749:1: ( ruleDirections )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5749:1: ( ruleDirections )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5750:1: ruleDirections
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectionAccess().getValueDirectionsEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleDirections_in_rule__Direction__ValueAssignment_212782);
            ruleDirections();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectionAccess().getValueDirectionsEnumRuleCall_2_0()); 
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
    // $ANTLR end "rule__Direction__ValueAssignment_2"


    // $ANTLR start "rule__Margin__ValueAssignment_2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5759:1: rule__Margin__ValueAssignment_2 : ( ruleSignedInteger ) ;
    public final void rule__Margin__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5763:1: ( ( ruleSignedInteger ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5764:1: ( ruleSignedInteger )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5764:1: ( ruleSignedInteger )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5765:1: ruleSignedInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarginAccess().getValueSignedIntegerParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleSignedInteger_in_rule__Margin__ValueAssignment_212813);
            ruleSignedInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMarginAccess().getValueSignedIntegerParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Margin__ValueAssignment_2"


    // $ANTLR start "rule__Color__ValueAssignment_0_1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5774:1: rule__Color__ValueAssignment_0_1 : ( ruleColorConstant ) ;
    public final void rule__Color__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5778:1: ( ( ruleColorConstant ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5779:1: ( ruleColorConstant )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5779:1: ( ruleColorConstant )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5780:1: ruleColorConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getValueColorConstantParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleColorConstant_in_rule__Color__ValueAssignment_0_112844);
            ruleColorConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorAccess().getValueColorConstantParserRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__Color__ValueAssignment_0_1"


    // $ANTLR start "rule__Color__ConcreteAssignment_1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5789:1: rule__Color__ConcreteAssignment_1 : ( ruleConcreteColor ) ;
    public final void rule__Color__ConcreteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5793:1: ( ( ruleConcreteColor ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5794:1: ( ruleConcreteColor )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5794:1: ( ruleConcreteColor )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5795:1: ruleConcreteColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getConcreteConcreteColorParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleConcreteColor_in_rule__Color__ConcreteAssignment_112875);
            ruleConcreteColor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorAccess().getConcreteConcreteColorParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Color__ConcreteAssignment_1"


    // $ANTLR start "rule__RGB__RedAssignment_2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5804:1: rule__RGB__RedAssignment_2 : ( RULE_INT ) ;
    public final void rule__RGB__RedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5808:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5809:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5809:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5810:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRGBAccess().getRedINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RGB__RedAssignment_212906); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRGBAccess().getRedINTTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__RGB__RedAssignment_2"


    // $ANTLR start "rule__RGB__GreenAssignment_4"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5819:1: rule__RGB__GreenAssignment_4 : ( RULE_INT ) ;
    public final void rule__RGB__GreenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5823:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5824:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5824:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5825:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRGBAccess().getGreenINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RGB__GreenAssignment_412937); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRGBAccess().getGreenINTTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__RGB__GreenAssignment_4"


    // $ANTLR start "rule__RGB__BlueAssignment_6"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5834:1: rule__RGB__BlueAssignment_6 : ( RULE_INT ) ;
    public final void rule__RGB__BlueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5838:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5839:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5839:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5840:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRGBAccess().getBlueINTTerminalRuleCall_6_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RGB__BlueAssignment_612968); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRGBAccess().getBlueINTTerminalRuleCall_6_0()); 
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
    // $ANTLR end "rule__RGB__BlueAssignment_6"


    // $ANTLR start "rule__HexColor__HexCodeAssignment"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5849:1: rule__HexColor__HexCodeAssignment : ( RULE_HEX_COLOR ) ;
    public final void rule__HexColor__HexCodeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5853:1: ( ( RULE_HEX_COLOR ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5854:1: ( RULE_HEX_COLOR )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5854:1: ( RULE_HEX_COLOR )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5855:1: RULE_HEX_COLOR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHexColorAccess().getHexCodeHEX_COLORTerminalRuleCall_0()); 
            }
            match(input,RULE_HEX_COLOR,FOLLOW_RULE_HEX_COLOR_in_rule__HexColor__HexCodeAssignment12999); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHexColorAccess().getHexCodeHEX_COLORTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__HexColor__HexCodeAssignment"


    // $ANTLR start "rule__ColorConstant__ValueAssignment"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5864:1: rule__ColorConstant__ValueAssignment : ( ruleColors ) ;
    public final void rule__ColorConstant__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5868:1: ( ( ruleColors ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5869:1: ( ruleColors )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5869:1: ( ruleColors )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5870:1: ruleColors
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorConstantAccess().getValueColorsEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleColors_in_rule__ColorConstant__ValueAssignment13030);
            ruleColors();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorConstantAccess().getValueColorsEnumRuleCall_0()); 
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
    // $ANTLR end "rule__ColorConstant__ValueAssignment"


    // $ANTLR start "rule__Activation__ConditionAssignment_1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5879:1: rule__Activation__ConditionAssignment_1 : ( ruleAbstractCondition ) ;
    public final void rule__Activation__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5883:1: ( ( ruleAbstractCondition ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5884:1: ( ruleAbstractCondition )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5884:1: ( ruleAbstractCondition )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5885:1: ruleAbstractCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivationAccess().getConditionAbstractConditionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAbstractCondition_in_rule__Activation__ConditionAssignment_113061);
            ruleAbstractCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivationAccess().getConditionAbstractConditionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Activation__ConditionAssignment_1"


    // $ANTLR start "rule__Condition__AttributeAssignment_0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5894:1: rule__Condition__AttributeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Condition__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5898:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5899:1: ( ( ruleQualifiedName ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5899:1: ( ( ruleQualifiedName ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5900:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getAttributeEAttributeCrossReference_0_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5901:1: ( ruleQualifiedName )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5902:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getAttributeEAttributeQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Condition__AttributeAssignment_013096);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getAttributeEAttributeQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getAttributeEAttributeCrossReference_0_0()); 
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
    // $ANTLR end "rule__Condition__AttributeAssignment_0"


    // $ANTLR start "rule__Condition__OperatorAssignment_1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5913:1: rule__Condition__OperatorAssignment_1 : ( ruleComparisonOperator ) ;
    public final void rule__Condition__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5917:1: ( ( ruleComparisonOperator ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5918:1: ( ruleComparisonOperator )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5918:1: ( ruleComparisonOperator )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5919:1: ruleComparisonOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getOperatorComparisonOperatorEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleComparisonOperator_in_rule__Condition__OperatorAssignment_113131);
            ruleComparisonOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getOperatorComparisonOperatorEnumRuleCall_1_0()); 
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
    // $ANTLR end "rule__Condition__OperatorAssignment_1"


    // $ANTLR start "rule__Condition__ValueAssignment_2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5928:1: rule__Condition__ValueAssignment_2 : ( ruleType ) ;
    public final void rule__Condition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5932:1: ( ( ruleType ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5933:1: ( ruleType )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5933:1: ( ruleType )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5934:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getValueTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Condition__ValueAssignment_213162);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getValueTypeParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Condition__ValueAssignment_2"


    // $ANTLR start "rule__CompositeCondition__OperatorAssignment_0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5943:1: rule__CompositeCondition__OperatorAssignment_0 : ( ruleLogicalOperator ) ;
    public final void rule__CompositeCondition__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5947:1: ( ( ruleLogicalOperator ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5948:1: ( ruleLogicalOperator )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5948:1: ( ruleLogicalOperator )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5949:1: ruleLogicalOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getOperatorLogicalOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleLogicalOperator_in_rule__CompositeCondition__OperatorAssignment_013193);
            ruleLogicalOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getOperatorLogicalOperatorEnumRuleCall_0_0()); 
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
    // $ANTLR end "rule__CompositeCondition__OperatorAssignment_0"


    // $ANTLR start "rule__CompositeCondition__ConditionsAssignment_2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5958:1: rule__CompositeCondition__ConditionsAssignment_2 : ( ruleAbstractCondition ) ;
    public final void rule__CompositeCondition__ConditionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5962:1: ( ( ruleAbstractCondition ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5963:1: ( ruleAbstractCondition )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5963:1: ( ruleAbstractCondition )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5964:1: ruleAbstractCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getConditionsAbstractConditionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAbstractCondition_in_rule__CompositeCondition__ConditionsAssignment_213224);
            ruleAbstractCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getConditionsAbstractConditionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__CompositeCondition__ConditionsAssignment_2"

    // $ANTLR start synpred1_InternalEMFProfileDecorationLanguage
    public final void synpred1_InternalEMFProfileDecorationLanguage_fragment() throws RecognitionException {   
        // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4548:8: ( rule__DecorationDescription__DecorationsAssignment_3_0 )
        // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4548:9: rule__DecorationDescription__DecorationsAssignment_3_0
        {
        pushFollow(FOLLOW_rule__DecorationDescription__DecorationsAssignment_3_0_in_synpred1_InternalEMFProfileDecorationLanguage9345);
        rule__DecorationDescription__DecorationsAssignment_3_0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalEMFProfileDecorationLanguage

    // Delegated rules

    public final boolean synpred1_InternalEMFProfileDecorationLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalEMFProfileDecorationLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\7\uffff";
    static final String DFA2_eofS =
        "\1\uffff\2\4\3\uffff\1\4";
    static final String DFA2_minS =
        "\1\4\2\66\2\uffff\1\6\1\66";
    static final String DFA2_maxS =
        "\1\6\1\113\1\115\2\uffff\1\6\1\115";
    static final String DFA2_acceptS =
        "\3\uffff\1\2\1\1\2\uffff";
    static final String DFA2_specialS =
        "\7\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\uffff\1\2",
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

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "975:1: rule__Text__Alternatives : ( ( ruleSimpleText ) | ( ruleComplexText ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleDecorationModel_in_entryRuleDecorationModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecorationModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__0_in_ruleDecorationModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0_in_ruleNamespace154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecorationDescription_in_entryRuleDecorationDescription181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecorationDescription188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__0_in_ruleDecorationDescription214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDecoration_in_entryRuleAbstractDecoration241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDecoration248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractDecoration__Alternatives_in_ruleAbstractDecoration274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageDecoration_in_entryRuleImageDecoration301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageDecoration308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__0_in_ruleImageDecoration334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderDecoration_in_entryRuleBorderDecoration361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBorderDecoration368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__0_in_ruleBorderDecoration394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorDecoration_in_entryRuleColorDecoration421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorDecoration428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__0_in_ruleColorDecoration454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectionDecoration_in_entryRuleConnectionDecoration481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnectionDecoration488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__0_in_ruleConnectionDecoration514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__Alternatives_in_ruleText574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleText_in_entryRuleSimpleText601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleText608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleText__Alternatives_in_ruleSimpleText634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexText_in_entryRuleComplexText661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexText668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexText__Group__0_in_ruleComplexText694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyle_in_entryRuleStyle721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyle728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__Group__0_in_ruleStyle754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_entryRuleSize781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSize788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__0_in_ruleSize814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_entryRuleDirection841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirection848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Direction__Group__0_in_ruleDirection874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMargin_in_entryRuleMargin901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMargin908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Margin__Group__0_in_ruleMargin934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Alternatives_in_ruleColor994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteColor_in_entryRuleConcreteColor1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcreteColor1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Alternatives_in_ruleConcreteColor1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRGB_in_entryRuleRGB1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRGB1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGB__Group__0_in_ruleRGB1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexColor_in_entryRuleHexColor1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexColor1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexColor__HexCodeAssignment_in_ruleHexColor1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorConstant_in_entryRuleColorConstant1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorConstant1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorConstant__ValueAssignment_in_ruleColorConstant1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_entryRuleActivation1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivation1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activation__Group__0_in_ruleActivation1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractCondition_in_entryRuleAbstractCondition1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractCondition1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractCondition__Alternatives_in_ruleAbstractCondition1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0_in_ruleCondition1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeCondition1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__0_in_ruleCompositeCondition1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedDouble_in_entryRuleSignedDouble1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedDouble1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedDouble__Group__0_in_ruleSignedDouble1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInteger_in_entryRuleSignedInteger1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedInteger1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedInteger__Group__0_in_ruleSignedInteger1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperator__Alternatives_in_ruleComparisonOperator1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOperator__Alternatives_in_ruleLogicalOperator1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LineStyle__Alternatives_in_ruleLineStyle1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Colors__Alternatives_in_ruleColors1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Directions__Alternatives_in_ruleDirections1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageDecoration_in_rule__AbstractDecoration__Alternatives1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderDecoration_in_rule__AbstractDecoration__Alternatives1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorDecoration_in_rule__AbstractDecoration__Alternatives1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectionDecoration_in_rule__AbstractDecoration__Alternatives1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleText_in_rule__Text__Alternatives2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexText_in_rule__Text__Alternatives2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleText__TextAssignment_0_in_rule__SimpleText__Alternatives2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleText__AttributeAssignment_1_in_rule__SimpleText__Alternatives2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group_0__0_in_rule__Color__Alternatives2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__ConcreteAssignment_1_in_rule__Color__Alternatives2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRGB_in_rule__ConcreteColor__Alternatives2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexColor_in_rule__ConcreteColor__Alternatives2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__AbstractCondition__Alternatives2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeCondition_in_rule__AbstractCondition__Alternatives2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInteger_in_rule__Type__Alternatives2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedDouble_in_rule__Type__Alternatives2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Type__Alternatives2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__Type__Alternatives2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__Alternatives2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ComparisonOperator__Alternatives2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ComparisonOperator__Alternatives2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ComparisonOperator__Alternatives2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ComparisonOperator__Alternatives2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ComparisonOperator__Alternatives2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ComparisonOperator__Alternatives2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__LogicalOperator__Alternatives2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__LogicalOperator__Alternatives2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LineStyle__Alternatives2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LineStyle__Alternatives2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LineStyle__Alternatives2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__LineStyle__Alternatives2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__LineStyle__Alternatives2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Colors__Alternatives2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Colors__Alternatives2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Colors__Alternatives2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Colors__Alternatives2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Colors__Alternatives2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Colors__Alternatives2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Colors__Alternatives2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Colors__Alternatives2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Colors__Alternatives2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Colors__Alternatives2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Colors__Alternatives2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Colors__Alternatives2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Colors__Alternatives2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Colors__Alternatives2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Colors__Alternatives2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Directions__Alternatives3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Directions__Alternatives3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Directions__Alternatives3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Directions__Alternatives3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Directions__Alternatives3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Directions__Alternatives3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Directions__Alternatives3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Directions__Alternatives3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Directions__Alternatives3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__0__Impl_in_rule__DecorationModel__Group__03214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__1_in_rule__DecorationModel__Group__03217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__DecorationModel__Group__0__Impl3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__1__Impl_in_rule__DecorationModel__Group__13276 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__2_in_rule__DecorationModel__Group__13279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__ImportURIAssignment_1_in_rule__DecorationModel__Group__1__Impl3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__2__Impl_in_rule__DecorationModel__Group__23336 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__3_in_rule__DecorationModel__Group__23339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__NamespaceAssignment_2_in_rule__DecorationModel__Group__2__Impl3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__3__Impl_in_rule__DecorationModel__Group__33397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__DecorationDescriptionsAssignment_3_in_rule__DecorationModel__Group__3__Impl3424 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__03463 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__03466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Namespace__Group__0__Impl3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__13525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__ProfileAssignment_1_in_rule__Namespace__Group__1__Impl3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__0__Impl_in_rule__DecorationDescription__Group__03586 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__1_in_rule__DecorationDescription__Group__03589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__DecorationDescription__Group__0__Impl3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__1__Impl_in_rule__DecorationDescription__Group__13648 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__2_in_rule__DecorationDescription__Group__13651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__StereotypeAssignment_1_in_rule__DecorationDescription__Group__1__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__2__Impl_in_rule__DecorationDescription__Group__23708 = new BitSet(new long[]{0x9880000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__3_in_rule__DecorationDescription__Group__23711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__DecorationDescription__Group__2__Impl3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__3__Impl_in_rule__DecorationDescription__Group__33770 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__4_in_rule__DecorationDescription__Group__33773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__UnorderedGroup_3_in_rule__DecorationDescription__Group__3__Impl3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__4__Impl_in_rule__DecorationDescription__Group__43830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__DecorationDescription__Group__4__Impl3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__0__Impl_in_rule__ImageDecoration__Group__03899 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__1_in_rule__ImageDecoration__Group__03902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__1__Impl_in_rule__ImageDecoration__Group__13960 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__2_in_rule__ImageDecoration__Group__13963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__ImageDecoration__Group__1__Impl3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__2__Impl_in_rule__ImageDecoration__Group__24022 = new BitSet(new long[]{0x9D80000000000000L,0x0000000000000860L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__3_in_rule__ImageDecoration__Group__24025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__ImageDecoration__Group__2__Impl4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__3__Impl_in_rule__ImageDecoration__Group__34084 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__4_in_rule__ImageDecoration__Group__34087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3_in_rule__ImageDecoration__Group__3__Impl4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__4__Impl_in_rule__ImageDecoration__Group__44144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__ImageDecoration__Group__4__Impl4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_0__0__Impl_in_rule__ImageDecoration__Group_3_0__04213 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_0__1_in_rule__ImageDecoration__Group_3_0__04216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__ImageDecoration__Group_3_0__0__Impl4244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_0__1__Impl_in_rule__ImageDecoration__Group_3_0__14275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_0__2_in_rule__ImageDecoration__Group_3_0__14278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__ImageDecoration__Group_3_0__1__Impl4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_0__2__Impl_in_rule__ImageDecoration__Group_3_0__24337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Location_uriAssignment_3_0_2_in_rule__ImageDecoration__Group_3_0__2__Impl4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_3__0__Impl_in_rule__ImageDecoration__Group_3_3__04400 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_3__1_in_rule__ImageDecoration__Group_3_3__04403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__ImageDecoration__Group_3_3__0__Impl4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_3__1__Impl_in_rule__ImageDecoration__Group_3_3__14462 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_3__2_in_rule__ImageDecoration__Group_3_3__14465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__ImageDecoration__Group_3_3__1__Impl4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_3__2__Impl_in_rule__ImageDecoration__Group_3_3__24524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__TooltipAssignment_3_3_2_in_rule__ImageDecoration__Group_3_3__2__Impl4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__0__Impl_in_rule__BorderDecoration__Group__04587 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__1_in_rule__BorderDecoration__Group__04590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__1__Impl_in_rule__BorderDecoration__Group__14648 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__2_in_rule__BorderDecoration__Group__14651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__BorderDecoration__Group__1__Impl4679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__2__Impl_in_rule__BorderDecoration__Group__24710 = new BitSet(new long[]{0x9880000000000000L,0x0000000000000818L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__3_in_rule__BorderDecoration__Group__24713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__BorderDecoration__Group__2__Impl4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__3__Impl_in_rule__BorderDecoration__Group__34772 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__4_in_rule__BorderDecoration__Group__34775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3_in_rule__BorderDecoration__Group__3__Impl4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__4__Impl_in_rule__BorderDecoration__Group__44832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__BorderDecoration__Group__4__Impl4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group_3_1__0__Impl_in_rule__BorderDecoration__Group_3_1__04901 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group_3_1__1_in_rule__BorderDecoration__Group_3_1__04904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__BorderDecoration__Group_3_1__0__Impl4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group_3_1__1__Impl_in_rule__BorderDecoration__Group_3_1__14963 = new BitSet(new long[]{0x000001FFFC000100L,0x0000000000000080L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group_3_1__2_in_rule__BorderDecoration__Group_3_1__14966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__BorderDecoration__Group_3_1__1__Impl4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group_3_1__2__Impl_in_rule__BorderDecoration__Group_3_1__25025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__ColorAssignment_3_1_2_in_rule__BorderDecoration__Group_3_1__2__Impl5052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__0__Impl_in_rule__ColorDecoration__Group__05088 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__1_in_rule__ColorDecoration__Group__05091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__1__Impl_in_rule__ColorDecoration__Group__15149 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__2_in_rule__ColorDecoration__Group__15152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__ColorDecoration__Group__1__Impl5180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__2__Impl_in_rule__ColorDecoration__Group__25211 = new BitSet(new long[]{0xF880000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__3_in_rule__ColorDecoration__Group__25214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__ColorDecoration__Group__2__Impl5242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__3__Impl_in_rule__ColorDecoration__Group__35273 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__4_in_rule__ColorDecoration__Group__35276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__UnorderedGroup_3_in_rule__ColorDecoration__Group__3__Impl5303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__4__Impl_in_rule__ColorDecoration__Group__45333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__ColorDecoration__Group__4__Impl5361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_0__0__Impl_in_rule__ColorDecoration__Group_3_0__05402 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_0__1_in_rule__ColorDecoration__Group_3_0__05405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__ColorDecoration__Group_3_0__0__Impl5433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_0__1__Impl_in_rule__ColorDecoration__Group_3_0__15464 = new BitSet(new long[]{0x000001FFFC000100L,0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_0__2_in_rule__ColorDecoration__Group_3_0__15467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__ColorDecoration__Group_3_0__1__Impl5495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_0__2__Impl_in_rule__ColorDecoration__Group_3_0__25526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__BackgroundAssignment_3_0_2_in_rule__ColorDecoration__Group_3_0__2__Impl5553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_1__0__Impl_in_rule__ColorDecoration__Group_3_1__05589 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_1__1_in_rule__ColorDecoration__Group_3_1__05592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__ColorDecoration__Group_3_1__0__Impl5620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_1__1__Impl_in_rule__ColorDecoration__Group_3_1__15651 = new BitSet(new long[]{0x000001FFFC000100L,0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_1__2_in_rule__ColorDecoration__Group_3_1__15654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__ColorDecoration__Group_3_1__1__Impl5682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_1__2__Impl_in_rule__ColorDecoration__Group_3_1__25713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__ForegroundAssignment_3_1_2_in_rule__ColorDecoration__Group_3_1__2__Impl5740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__0__Impl_in_rule__ConnectionDecoration__Group__05776 = new BitSet(new long[]{0x9880000000000000L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__1_in_rule__ConnectionDecoration__Group__05779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__1__Impl_in_rule__ConnectionDecoration__Group__15837 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__2_in_rule__ConnectionDecoration__Group__15840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__ConnectionDecoration__Group__1__Impl5868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__2__Impl_in_rule__ConnectionDecoration__Group__25899 = new BitSet(new long[]{0x9880000000000000L,0x000000000000081BL});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__3_in_rule__ConnectionDecoration__Group__25902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__ConnectionDecoration__Group__2__Impl5930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__3__Impl_in_rule__ConnectionDecoration__Group__35961 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__4_in_rule__ConnectionDecoration__Group__35964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3_in_rule__ConnectionDecoration__Group__3__Impl5991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__4__Impl_in_rule__ConnectionDecoration__Group__46021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__ConnectionDecoration__Group__4__Impl6049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_2__0__Impl_in_rule__ConnectionDecoration__Group_3_2__06090 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_2__1_in_rule__ConnectionDecoration__Group_3_2__06093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__ConnectionDecoration__Group_3_2__0__Impl6121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_2__1__Impl_in_rule__ConnectionDecoration__Group_3_2__16152 = new BitSet(new long[]{0x000001FFFC000100L,0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_2__2_in_rule__ConnectionDecoration__Group_3_2__16155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__ConnectionDecoration__Group_3_2__1__Impl6183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_2__2__Impl_in_rule__ConnectionDecoration__Group_3_2__26214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2_in_rule__ConnectionDecoration__Group_3_2__2__Impl6241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_3__0__Impl_in_rule__ConnectionDecoration__Group_3_3__06277 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_3__1_in_rule__ConnectionDecoration__Group_3_3__06280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__ConnectionDecoration__Group_3_3__0__Impl6308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_3__1__Impl_in_rule__ConnectionDecoration__Group_3_3__16339 = new BitSet(new long[]{0x000001FFFC000100L,0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_3__2_in_rule__ConnectionDecoration__Group_3_3__16342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__ConnectionDecoration__Group_3_3__1__Impl6370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_3__2__Impl_in_rule__ConnectionDecoration__Group_3_3__26401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2_in_rule__ConnectionDecoration__Group_3_3__2__Impl6428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexText__Group__0__Impl_in_rule__ComplexText__Group__06464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__ComplexText__Group__1_in_rule__ComplexText__Group__06467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexText__LeftAssignment_0_in_rule__ComplexText__Group__0__Impl6494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexText__Group__1__Impl_in_rule__ComplexText__Group__16524 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__ComplexText__Group__2_in_rule__ComplexText__Group__16527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__ComplexText__Group__1__Impl6555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexText__Group__2__Impl_in_rule__ComplexText__Group__26586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexText__RightAssignment_2_in_rule__ComplexText__Group__2__Impl6613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__Group__0__Impl_in_rule__Style__Group__06649 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__Style__Group__1_in_rule__Style__Group__06652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__Style__Group__0__Impl6680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__Group__1__Impl_in_rule__Style__Group__16711 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_rule__Style__Group__2_in_rule__Style__Group__16714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Style__Group__1__Impl6742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__Group__2__Impl_in_rule__Style__Group__26773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__ValueAssignment_2_in_rule__Style__Group__2__Impl6800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__0__Impl_in_rule__Size__Group__06836 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__Size__Group__1_in_rule__Size__Group__06839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__Size__Group__0__Impl6867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__1__Impl_in_rule__Size__Group__16898 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Size__Group__2_in_rule__Size__Group__16901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Size__Group__1__Impl6929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__2__Impl_in_rule__Size__Group__26960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__ValueAssignment_2_in_rule__Size__Group__2__Impl6987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Direction__Group__0__Impl_in_rule__Direction__Group__07023 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__Direction__Group__1_in_rule__Direction__Group__07026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__Direction__Group__0__Impl7054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Direction__Group__1__Impl_in_rule__Direction__Group__17085 = new BitSet(new long[]{0x0003FE0000000000L});
    public static final BitSet FOLLOW_rule__Direction__Group__2_in_rule__Direction__Group__17088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Direction__Group__1__Impl7116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Direction__Group__2__Impl_in_rule__Direction__Group__27147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Direction__ValueAssignment_2_in_rule__Direction__Group__2__Impl7174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Margin__Group__0__Impl_in_rule__Margin__Group__07210 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__Margin__Group__1_in_rule__Margin__Group__07213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__Margin__Group__0__Impl7241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Margin__Group__1__Impl_in_rule__Margin__Group__17272 = new BitSet(new long[]{0x0000000000000080L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Margin__Group__2_in_rule__Margin__Group__17275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Margin__Group__1__Impl7303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Margin__Group__2__Impl_in_rule__Margin__Group__27334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Margin__ValueAssignment_2_in_rule__Margin__Group__2__Impl7361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group_0__0__Impl_in_rule__Color__Group_0__07397 = new BitSet(new long[]{0x000001FFFC000000L});
    public static final BitSet FOLLOW_rule__Color__Group_0__1_in_rule__Color__Group_0__07400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group_0__1__Impl_in_rule__Color__Group_0__17458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__ValueAssignment_0_1_in_rule__Color__Group_0__1__Impl7485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGB__Group__0__Impl_in_rule__RGB__Group__07519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__RGB__Group__1_in_rule__RGB__Group__07522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__RGB__Group__0__Impl7550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGB__Group__1__Impl_in_rule__RGB__Group__17581 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__RGB__Group__2_in_rule__RGB__Group__17584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__RGB__Group__1__Impl7612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGB__Group__2__Impl_in_rule__RGB__Group__27643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__RGB__Group__3_in_rule__RGB__Group__27646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGB__RedAssignment_2_in_rule__RGB__Group__2__Impl7673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGB__Group__3__Impl_in_rule__RGB__Group__37703 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__RGB__Group__4_in_rule__RGB__Group__37706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__RGB__Group__3__Impl7734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGB__Group__4__Impl_in_rule__RGB__Group__47765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__RGB__Group__5_in_rule__RGB__Group__47768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGB__GreenAssignment_4_in_rule__RGB__Group__4__Impl7795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGB__Group__5__Impl_in_rule__RGB__Group__57825 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__RGB__Group__6_in_rule__RGB__Group__57828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__RGB__Group__5__Impl7856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGB__Group__6__Impl_in_rule__RGB__Group__67887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__RGB__Group__7_in_rule__RGB__Group__67890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGB__BlueAssignment_6_in_rule__RGB__Group__6__Impl7917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGB__Group__7__Impl_in_rule__RGB__Group__77947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__RGB__Group__7__Impl7975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activation__Group__0__Impl_in_rule__Activation__Group__08022 = new BitSet(new long[]{0x0000000000180040L});
    public static final BitSet FOLLOW_rule__Activation__Group__1_in_rule__Activation__Group__08025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__Activation__Group__0__Impl8053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activation__Group__1__Impl_in_rule__Activation__Group__18084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activation__ConditionAssignment_1_in_rule__Activation__Group__1__Impl8111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__08145 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__08148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__AttributeAssignment_0_in_rule__Condition__Group__0__Impl8175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__18205 = new BitSet(new long[]{0x00000000000000F0L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__18208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__OperatorAssignment_1_in_rule__Condition__Group__1__Impl8235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__28265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__ValueAssignment_2_in_rule__Condition__Group__2__Impl8292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__0__Impl_in_rule__CompositeCondition__Group__08328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__1_in_rule__CompositeCondition__Group__08331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeCondition__OperatorAssignment_0_in_rule__CompositeCondition__Group__0__Impl8358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__1__Impl_in_rule__CompositeCondition__Group__18388 = new BitSet(new long[]{0x0000000000180040L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__2_in_rule__CompositeCondition__Group__18391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__CompositeCondition__Group__1__Impl8419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__2__Impl_in_rule__CompositeCondition__Group__28450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__3_in_rule__CompositeCondition__Group__28453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeCondition__ConditionsAssignment_2_in_rule__CompositeCondition__Group__2__Impl8482 = new BitSet(new long[]{0x0000000000180042L});
    public static final BitSet FOLLOW_rule__CompositeCondition__ConditionsAssignment_2_in_rule__CompositeCondition__Group__2__Impl8494 = new BitSet(new long[]{0x0000000000180042L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__3__Impl_in_rule__CompositeCondition__Group__38527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__CompositeCondition__Group__3__Impl8555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedDouble__Group__0__Impl_in_rule__SignedDouble__Group__08594 = new BitSet(new long[]{0x0000000000000080L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SignedDouble__Group__1_in_rule__SignedDouble__Group__08597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__SignedDouble__Group__0__Impl8626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedDouble__Group__1__Impl_in_rule__SignedDouble__Group__18659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SignedDouble__Group__2_in_rule__SignedDouble__Group__18662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SignedDouble__Group__1__Impl8689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedDouble__Group__2__Impl_in_rule__SignedDouble__Group__28718 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__SignedDouble__Group__3_in_rule__SignedDouble__Group__28721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rule__SignedDouble__Group__2__Impl8749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedDouble__Group__3__Impl_in_rule__SignedDouble__Group__38780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SignedDouble__Group__3__Impl8807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedInteger__Group__0__Impl_in_rule__SignedInteger__Group__08844 = new BitSet(new long[]{0x0000000000000080L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SignedInteger__Group__1_in_rule__SignedInteger__Group__08847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__SignedInteger__Group__0__Impl8876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedInteger__Group__1__Impl_in_rule__SignedInteger__Group__18909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SignedInteger__Group__1__Impl8936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl9000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__19029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl9056 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__09091 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__09094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rule__QualifiedName__Group_1__0__Impl9122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__19153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl9180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__UnorderedGroup_3__0_in_rule__DecorationDescription__UnorderedGroup_39214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__DecorationsAssignment_3_0_in_rule__DecorationDescription__UnorderedGroup_3__Impl9304 = new BitSet(new long[]{0x9880000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__DecorationsAssignment_3_0_in_rule__DecorationDescription__UnorderedGroup_3__Impl9348 = new BitSet(new long[]{0x9880000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__ActivationAssignment_3_1_in_rule__DecorationDescription__UnorderedGroup_3__Impl9446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__UnorderedGroup_3__Impl_in_rule__DecorationDescription__UnorderedGroup_3__09505 = new BitSet(new long[]{0x9880000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__DecorationDescription__UnorderedGroup_3__1_in_rule__DecorationDescription__UnorderedGroup_3__09508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__UnorderedGroup_3__Impl_in_rule__DecorationDescription__UnorderedGroup_3__19533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__0_in_rule__ImageDecoration__UnorderedGroup_39561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_0__0_in_rule__ImageDecoration__UnorderedGroup_3__Impl9650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__DirectionAssignment_3_1_in_rule__ImageDecoration__UnorderedGroup_3__Impl9741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__MarginAssignment_3_2_in_rule__ImageDecoration__UnorderedGroup_3__Impl9832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_3__0_in_rule__ImageDecoration__UnorderedGroup_3__Impl9923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__ActivationAssignment_3_4_in_rule__ImageDecoration__UnorderedGroup_3__Impl10014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__010073 = new BitSet(new long[]{0x9D80000000000002L,0x0000000000000860L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__1_in_rule__ImageDecoration__UnorderedGroup_3__010076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__110101 = new BitSet(new long[]{0x9D80000000000002L,0x0000000000000860L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__2_in_rule__ImageDecoration__UnorderedGroup_3__110104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__210129 = new BitSet(new long[]{0x9D80000000000002L,0x0000000000000860L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__3_in_rule__ImageDecoration__UnorderedGroup_3__210132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__310157 = new BitSet(new long[]{0x9D80000000000002L,0x0000000000000860L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__4_in_rule__ImageDecoration__UnorderedGroup_3__310160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__410185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__0_in_rule__BorderDecoration__UnorderedGroup_310219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__SizeAssignment_3_0_in_rule__BorderDecoration__UnorderedGroup_3__Impl10306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group_3_1__0_in_rule__BorderDecoration__UnorderedGroup_3__Impl10397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__StyleAssignment_3_2_in_rule__BorderDecoration__UnorderedGroup_3__Impl10488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__ActivationAssignment_3_3_in_rule__BorderDecoration__UnorderedGroup_3__Impl10579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__010638 = new BitSet(new long[]{0x9880000000000002L,0x0000000000000818L});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__1_in_rule__BorderDecoration__UnorderedGroup_3__010641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__110666 = new BitSet(new long[]{0x9880000000000002L,0x0000000000000818L});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__2_in_rule__BorderDecoration__UnorderedGroup_3__110669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__210694 = new BitSet(new long[]{0x9880000000000002L,0x0000000000000818L});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__3_in_rule__BorderDecoration__UnorderedGroup_3__210697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__310722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__UnorderedGroup_3__0_in_rule__ColorDecoration__UnorderedGroup_310754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_0__0_in_rule__ColorDecoration__UnorderedGroup_3__Impl10841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_1__0_in_rule__ColorDecoration__UnorderedGroup_3__Impl10932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__ActivationAssignment_3_2_in_rule__ColorDecoration__UnorderedGroup_3__Impl11023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__UnorderedGroup_3__Impl_in_rule__ColorDecoration__UnorderedGroup_3__011082 = new BitSet(new long[]{0xF880000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ColorDecoration__UnorderedGroup_3__1_in_rule__ColorDecoration__UnorderedGroup_3__011085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__UnorderedGroup_3__Impl_in_rule__ColorDecoration__UnorderedGroup_3__111110 = new BitSet(new long[]{0xF880000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ColorDecoration__UnorderedGroup_3__2_in_rule__ColorDecoration__UnorderedGroup_3__111113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__UnorderedGroup_3__Impl_in_rule__ColorDecoration__UnorderedGroup_3__211138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__0_in_rule__ConnectionDecoration__UnorderedGroup_311168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__SizeAssignment_3_0_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__StyleAssignment_3_1_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_2__0_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_3__0_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__ActivationAssignment_3_4_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__011678 = new BitSet(new long[]{0x9880000000000002L,0x000000000000081BL});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__1_in_rule__ConnectionDecoration__UnorderedGroup_3__011681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__111706 = new BitSet(new long[]{0x9880000000000002L,0x000000000000081BL});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__2_in_rule__ConnectionDecoration__UnorderedGroup_3__111709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__211734 = new BitSet(new long[]{0x9880000000000002L,0x000000000000081BL});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__3_in_rule__ConnectionDecoration__UnorderedGroup_3__211737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__311762 = new BitSet(new long[]{0x9880000000000002L,0x000000000000081BL});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__4_in_rule__ConnectionDecoration__UnorderedGroup_3__311765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__411790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DecorationModel__ImportURIAssignment_111828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_rule__DecorationModel__NamespaceAssignment_211859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecorationDescription_in_rule__DecorationModel__DecorationDescriptionsAssignment_311890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Namespace__ProfileAssignment_111925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DecorationDescription__StereotypeAssignment_111964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDecoration_in_rule__DecorationDescription__DecorationsAssignment_3_011999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_rule__DecorationDescription__ActivationAssignment_3_112030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ImageDecoration__Location_uriAssignment_3_0_212061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_rule__ImageDecoration__DirectionAssignment_3_112092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMargin_in_rule__ImageDecoration__MarginAssignment_3_212123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ImageDecoration__TooltipAssignment_3_3_212154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_rule__ImageDecoration__ActivationAssignment_3_412185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_rule__BorderDecoration__SizeAssignment_3_012216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__BorderDecoration__ColorAssignment_3_1_212247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyle_in_rule__BorderDecoration__StyleAssignment_3_212278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_rule__BorderDecoration__ActivationAssignment_3_312309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__ColorDecoration__BackgroundAssignment_3_0_212340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__ColorDecoration__ForegroundAssignment_3_1_212371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_rule__ColorDecoration__ActivationAssignment_3_212402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_rule__ConnectionDecoration__SizeAssignment_3_012433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyle_in_rule__ConnectionDecoration__StyleAssignment_3_112464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__ConnectionDecoration__ForegroundColorAssignment_3_2_212495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__ConnectionDecoration__BackgroundColorAssignment_3_3_212526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_rule__ConnectionDecoration__ActivationAssignment_3_412557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleText__TextAssignment_012588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__SimpleText__AttributeAssignment_112623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleText_in_rule__ComplexText__LeftAssignment_012658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ComplexText__RightAssignment_212689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineStyle_in_rule__Style__ValueAssignment_212720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Size__ValueAssignment_212751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirections_in_rule__Direction__ValueAssignment_212782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInteger_in_rule__Margin__ValueAssignment_212813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorConstant_in_rule__Color__ValueAssignment_0_112844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteColor_in_rule__Color__ConcreteAssignment_112875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RGB__RedAssignment_212906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RGB__GreenAssignment_412937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RGB__BlueAssignment_612968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_COLOR_in_rule__HexColor__HexCodeAssignment12999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColors_in_rule__ColorConstant__ValueAssignment13030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractCondition_in_rule__Activation__ConditionAssignment_113061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Condition__AttributeAssignment_013096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_rule__Condition__OperatorAssignment_113131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Condition__ValueAssignment_213162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOperator_in_rule__CompositeCondition__OperatorAssignment_013193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractCondition_in_rule__CompositeCondition__ConditionsAssignment_213224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__DecorationsAssignment_3_0_in_synpred1_InternalEMFProfileDecorationLanguage9345 = new BitSet(new long[]{0x0000000000000002L});

}
