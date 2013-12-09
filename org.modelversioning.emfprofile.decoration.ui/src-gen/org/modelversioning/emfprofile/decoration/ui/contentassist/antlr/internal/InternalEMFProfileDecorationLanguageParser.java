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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'all'", "'any'", "'solid'", "'dot'", "'dash'", "'dash_dot'", "'dash_dot_dot'", "'red'", "'black'", "'white'", "'green'", "'green_light'", "'green_dark'", "'blue'", "'blue_light'", "'blue_dark'", "'gray'", "'gray_light'", "'gray_dark'", "'orange'", "'yellow'", "'cyan'", "'center'", "'north'", "'south'", "'west'", "'east'", "'north_east'", "'north_west'", "'south_east'", "'south_west'", "'import resource'", "'profile'", "'decoration'", "'{'", "'}'", "'image'", "'location-uri'", "'='", "'tooltip'", "'border'", "'color'", "'background'", "'foreground'", "'connection'", "'foreground-color'", "'background-color'", "'+'", "'line-style'", "'size'", "'direction'", "'margin'", "'RGB'", "'('", "','", "')'", "'active when'", "'-'", "'.'"
    };
    public static final int T__68=68;
    public static final int RULE_BOOLEAN=5;
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
    public static final int RULE_INT=6;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:517:1: ruleConcreteColor : ( ( rule__ConcreteColor__Group__0 ) ) ;
    public final void ruleConcreteColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:521:2: ( ( ( rule__ConcreteColor__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:522:1: ( ( rule__ConcreteColor__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:522:1: ( ( rule__ConcreteColor__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:523:1: ( rule__ConcreteColor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:524:1: ( rule__ConcreteColor__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:524:2: rule__ConcreteColor__Group__0
            {
            pushFollow(FOLLOW_rule__ConcreteColor__Group__0_in_ruleConcreteColor1054);
            rule__ConcreteColor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcreteColorAccess().getGroup()); 
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


    // $ANTLR start "entryRuleColorConstant"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:536:1: entryRuleColorConstant : ruleColorConstant EOF ;
    public final void entryRuleColorConstant() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:537:1: ( ruleColorConstant EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:538:1: ruleColorConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorConstantRule()); 
            }
            pushFollow(FOLLOW_ruleColorConstant_in_entryRuleColorConstant1081);
            ruleColorConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColorConstantRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorConstant1088); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:545:1: ruleColorConstant : ( ( rule__ColorConstant__ValueAssignment ) ) ;
    public final void ruleColorConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:549:2: ( ( ( rule__ColorConstant__ValueAssignment ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:550:1: ( ( rule__ColorConstant__ValueAssignment ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:550:1: ( ( rule__ColorConstant__ValueAssignment ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:551:1: ( rule__ColorConstant__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorConstantAccess().getValueAssignment()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:552:1: ( rule__ColorConstant__ValueAssignment )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:552:2: rule__ColorConstant__ValueAssignment
            {
            pushFollow(FOLLOW_rule__ColorConstant__ValueAssignment_in_ruleColorConstant1114);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:564:1: entryRuleActivation : ruleActivation EOF ;
    public final void entryRuleActivation() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:565:1: ( ruleActivation EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:566:1: ruleActivation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivationRule()); 
            }
            pushFollow(FOLLOW_ruleActivation_in_entryRuleActivation1141);
            ruleActivation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivation1148); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:573:1: ruleActivation : ( ( rule__Activation__Group__0 ) ) ;
    public final void ruleActivation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:577:2: ( ( ( rule__Activation__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:578:1: ( ( rule__Activation__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:578:1: ( ( rule__Activation__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:579:1: ( rule__Activation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivationAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:580:1: ( rule__Activation__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:580:2: rule__Activation__Group__0
            {
            pushFollow(FOLLOW_rule__Activation__Group__0_in_ruleActivation1174);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:592:1: entryRuleAbstractCondition : ruleAbstractCondition EOF ;
    public final void entryRuleAbstractCondition() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:593:1: ( ruleAbstractCondition EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:594:1: ruleAbstractCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractConditionRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractCondition_in_entryRuleAbstractCondition1201);
            ruleAbstractCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractConditionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractCondition1208); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:601:1: ruleAbstractCondition : ( ( rule__AbstractCondition__Alternatives ) ) ;
    public final void ruleAbstractCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:605:2: ( ( ( rule__AbstractCondition__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:606:1: ( ( rule__AbstractCondition__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:606:1: ( ( rule__AbstractCondition__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:607:1: ( rule__AbstractCondition__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractConditionAccess().getAlternatives()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:608:1: ( rule__AbstractCondition__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:608:2: rule__AbstractCondition__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractCondition__Alternatives_in_ruleAbstractCondition1234);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:620:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:621:1: ( ruleCondition EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:622:1: ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition1261);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition1268); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:629:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:633:2: ( ( ( rule__Condition__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:634:1: ( ( rule__Condition__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:634:1: ( ( rule__Condition__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:635:1: ( rule__Condition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:636:1: ( rule__Condition__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:636:2: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_rule__Condition__Group__0_in_ruleCondition1294);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:648:1: entryRuleCompositeCondition : ruleCompositeCondition EOF ;
    public final void entryRuleCompositeCondition() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:649:1: ( ruleCompositeCondition EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:650:1: ruleCompositeCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition1321);
            ruleCompositeCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeCondition1328); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:657:1: ruleCompositeCondition : ( ( rule__CompositeCondition__Group__0 ) ) ;
    public final void ruleCompositeCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:661:2: ( ( ( rule__CompositeCondition__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:662:1: ( ( rule__CompositeCondition__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:662:1: ( ( rule__CompositeCondition__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:663:1: ( rule__CompositeCondition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:664:1: ( rule__CompositeCondition__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:664:2: rule__CompositeCondition__Group__0
            {
            pushFollow(FOLLOW_rule__CompositeCondition__Group__0_in_ruleCompositeCondition1354);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:676:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:677:1: ( ruleType EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:678:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType1381);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1388); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:685:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:689:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:690:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:690:1: ( ( rule__Type__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:691:1: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:692:1: ( rule__Type__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:692:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1414);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:704:1: entryRuleSignedDouble : ruleSignedDouble EOF ;
    public final void entryRuleSignedDouble() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:705:1: ( ruleSignedDouble EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:706:1: ruleSignedDouble EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedDoubleRule()); 
            }
            pushFollow(FOLLOW_ruleSignedDouble_in_entryRuleSignedDouble1441);
            ruleSignedDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignedDoubleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedDouble1448); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:713:1: ruleSignedDouble : ( ( rule__SignedDouble__Group__0 ) ) ;
    public final void ruleSignedDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:717:2: ( ( ( rule__SignedDouble__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:718:1: ( ( rule__SignedDouble__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:718:1: ( ( rule__SignedDouble__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:719:1: ( rule__SignedDouble__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedDoubleAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:720:1: ( rule__SignedDouble__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:720:2: rule__SignedDouble__Group__0
            {
            pushFollow(FOLLOW_rule__SignedDouble__Group__0_in_ruleSignedDouble1474);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:732:1: entryRuleSignedInteger : ruleSignedInteger EOF ;
    public final void entryRuleSignedInteger() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:733:1: ( ruleSignedInteger EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:734:1: ruleSignedInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleSignedInteger_in_entryRuleSignedInteger1501);
            ruleSignedInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignedIntegerRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedInteger1508); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:741:1: ruleSignedInteger : ( ( rule__SignedInteger__Group__0 ) ) ;
    public final void ruleSignedInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:745:2: ( ( ( rule__SignedInteger__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:746:1: ( ( rule__SignedInteger__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:746:1: ( ( rule__SignedInteger__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:747:1: ( rule__SignedInteger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedIntegerAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:748:1: ( rule__SignedInteger__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:748:2: rule__SignedInteger__Group__0
            {
            pushFollow(FOLLOW_rule__SignedInteger__Group__0_in_ruleSignedInteger1534);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:762:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:763:1: ( ruleQualifiedName EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:764:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1563);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1570); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:771:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:775:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:776:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:776:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:777:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:778:1: ( rule__QualifiedName__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:778:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1596);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:791:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:795:1: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:796:1: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:796:1: ( ( rule__ComparisonOperator__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:797:1: ( rule__ComparisonOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:798:1: ( rule__ComparisonOperator__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:798:2: rule__ComparisonOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__ComparisonOperator__Alternatives_in_ruleComparisonOperator1633);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:810:1: ruleLogicalOperator : ( ( rule__LogicalOperator__Alternatives ) ) ;
    public final void ruleLogicalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:814:1: ( ( ( rule__LogicalOperator__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:815:1: ( ( rule__LogicalOperator__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:815:1: ( ( rule__LogicalOperator__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:816:1: ( rule__LogicalOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOperatorAccess().getAlternatives()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:817:1: ( rule__LogicalOperator__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:817:2: rule__LogicalOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__LogicalOperator__Alternatives_in_ruleLogicalOperator1669);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:829:1: ruleLineStyle : ( ( rule__LineStyle__Alternatives ) ) ;
    public final void ruleLineStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:833:1: ( ( ( rule__LineStyle__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:834:1: ( ( rule__LineStyle__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:834:1: ( ( rule__LineStyle__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:835:1: ( rule__LineStyle__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLineStyleAccess().getAlternatives()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:836:1: ( rule__LineStyle__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:836:2: rule__LineStyle__Alternatives
            {
            pushFollow(FOLLOW_rule__LineStyle__Alternatives_in_ruleLineStyle1705);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:848:1: ruleColors : ( ( rule__Colors__Alternatives ) ) ;
    public final void ruleColors() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:852:1: ( ( ( rule__Colors__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:853:1: ( ( rule__Colors__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:853:1: ( ( rule__Colors__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:854:1: ( rule__Colors__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorsAccess().getAlternatives()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:855:1: ( rule__Colors__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:855:2: rule__Colors__Alternatives
            {
            pushFollow(FOLLOW_rule__Colors__Alternatives_in_ruleColors1741);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:867:1: ruleDirections : ( ( rule__Directions__Alternatives ) ) ;
    public final void ruleDirections() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:871:1: ( ( ( rule__Directions__Alternatives ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:872:1: ( ( rule__Directions__Alternatives ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:872:1: ( ( rule__Directions__Alternatives ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:873:1: ( rule__Directions__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectionsAccess().getAlternatives()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:874:1: ( rule__Directions__Alternatives )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:874:2: rule__Directions__Alternatives
            {
            pushFollow(FOLLOW_rule__Directions__Alternatives_in_ruleDirections1777);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:885:1: rule__AbstractDecoration__Alternatives : ( ( ruleImageDecoration ) | ( ruleBorderDecoration ) | ( ruleColorDecoration ) | ( ruleConnectionDecoration ) );
    public final void rule__AbstractDecoration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:889:1: ( ( ruleImageDecoration ) | ( ruleBorderDecoration ) | ( ruleColorDecoration ) | ( ruleConnectionDecoration ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt1=1;
                }
                break;
            case 58:
                {
                alt1=2;
                }
                break;
            case 59:
                {
                alt1=3;
                }
                break;
            case 62:
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:890:1: ( ruleImageDecoration )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:890:1: ( ruleImageDecoration )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:891:1: ruleImageDecoration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractDecorationAccess().getImageDecorationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleImageDecoration_in_rule__AbstractDecoration__Alternatives1812);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:896:6: ( ruleBorderDecoration )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:896:6: ( ruleBorderDecoration )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:897:1: ruleBorderDecoration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractDecorationAccess().getBorderDecorationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleBorderDecoration_in_rule__AbstractDecoration__Alternatives1829);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:902:6: ( ruleColorDecoration )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:902:6: ( ruleColorDecoration )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:903:1: ruleColorDecoration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractDecorationAccess().getColorDecorationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleColorDecoration_in_rule__AbstractDecoration__Alternatives1846);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:908:6: ( ruleConnectionDecoration )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:908:6: ( ruleConnectionDecoration )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:909:1: ruleConnectionDecoration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractDecorationAccess().getConnectionDecorationParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleConnectionDecoration_in_rule__AbstractDecoration__Alternatives1863);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:919:1: rule__Text__Alternatives : ( ( ruleSimpleText ) | ( ruleComplexText ) );
    public final void rule__Text__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:923:1: ( ( ruleSimpleText ) | ( ruleComplexText ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:924:1: ( ruleSimpleText )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:924:1: ( ruleSimpleText )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:925:1: ruleSimpleText
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getSimpleTextParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSimpleText_in_rule__Text__Alternatives1895);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:930:6: ( ruleComplexText )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:930:6: ( ruleComplexText )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:931:1: ruleComplexText
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getComplexTextParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleComplexText_in_rule__Text__Alternatives1912);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:941:1: rule__SimpleText__Alternatives : ( ( ( rule__SimpleText__TextAssignment_0 ) ) | ( ( rule__SimpleText__AttributeAssignment_1 ) ) );
    public final void rule__SimpleText__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:945:1: ( ( ( rule__SimpleText__TextAssignment_0 ) ) | ( ( rule__SimpleText__AttributeAssignment_1 ) ) )
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:946:1: ( ( rule__SimpleText__TextAssignment_0 ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:946:1: ( ( rule__SimpleText__TextAssignment_0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:947:1: ( rule__SimpleText__TextAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleTextAccess().getTextAssignment_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:948:1: ( rule__SimpleText__TextAssignment_0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:948:2: rule__SimpleText__TextAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SimpleText__TextAssignment_0_in_rule__SimpleText__Alternatives1944);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:952:6: ( ( rule__SimpleText__AttributeAssignment_1 ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:952:6: ( ( rule__SimpleText__AttributeAssignment_1 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:953:1: ( rule__SimpleText__AttributeAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleTextAccess().getAttributeAssignment_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:954:1: ( rule__SimpleText__AttributeAssignment_1 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:954:2: rule__SimpleText__AttributeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SimpleText__AttributeAssignment_1_in_rule__SimpleText__Alternatives1962);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:963:1: rule__Color__Alternatives : ( ( ( rule__Color__Group_0__0 ) ) | ( ( rule__Color__ConcreteAssignment_1 ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:967:1: ( ( ( rule__Color__Group_0__0 ) ) | ( ( rule__Color__ConcreteAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=25 && LA4_0<=39)) ) {
                alt4=1;
            }
            else if ( (LA4_0==70) ) {
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:968:1: ( ( rule__Color__Group_0__0 ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:968:1: ( ( rule__Color__Group_0__0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:969:1: ( rule__Color__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorAccess().getGroup_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:970:1: ( rule__Color__Group_0__0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:970:2: rule__Color__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Color__Group_0__0_in_rule__Color__Alternatives1995);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:974:6: ( ( rule__Color__ConcreteAssignment_1 ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:974:6: ( ( rule__Color__ConcreteAssignment_1 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:975:1: ( rule__Color__ConcreteAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorAccess().getConcreteAssignment_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:976:1: ( rule__Color__ConcreteAssignment_1 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:976:2: rule__Color__ConcreteAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Color__ConcreteAssignment_1_in_rule__Color__Alternatives2013);
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


    // $ANTLR start "rule__AbstractCondition__Alternatives"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:985:1: rule__AbstractCondition__Alternatives : ( ( ruleCondition ) | ( ruleCompositeCondition ) );
    public final void rule__AbstractCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:989:1: ( ( ruleCondition ) | ( ruleCompositeCondition ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=18 && LA5_0<=19)) ) {
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:990:1: ( ruleCondition )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:990:1: ( ruleCondition )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:991:1: ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractConditionAccess().getConditionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCondition_in_rule__AbstractCondition__Alternatives2046);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:996:6: ( ruleCompositeCondition )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:996:6: ( ruleCompositeCondition )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:997:1: ruleCompositeCondition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractConditionAccess().getCompositeConditionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCompositeCondition_in_rule__AbstractCondition__Alternatives2063);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1007:1: rule__Type__Alternatives : ( ( ruleSignedInteger ) | ( ruleSignedDouble ) | ( RULE_STRING ) | ( RULE_BOOLEAN ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1011:1: ( ( ruleSignedInteger ) | ( ruleSignedDouble ) | ( RULE_STRING ) | ( RULE_BOOLEAN ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 75:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_INT) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==76) ) {
                        alt6=2;
                    }
                    else if ( (LA6_2==EOF||LA6_2==RULE_ID||(LA6_2>=18 && LA6_2<=19)||(LA6_2>=53 && LA6_2<=55)||(LA6_2>=57 && LA6_2<=64)||(LA6_2>=66 && LA6_2<=69)||(LA6_2>=73 && LA6_2<=74)) ) {
                        alt6=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==76) ) {
                    alt6=2;
                }
                else if ( (LA6_2==EOF||LA6_2==RULE_ID||(LA6_2>=18 && LA6_2<=19)||(LA6_2>=53 && LA6_2<=55)||(LA6_2>=57 && LA6_2<=64)||(LA6_2>=66 && LA6_2<=69)||(LA6_2>=73 && LA6_2<=74)) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt6=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1012:1: ( ruleSignedInteger )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1012:1: ( ruleSignedInteger )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1013:1: ruleSignedInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getSignedIntegerParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSignedInteger_in_rule__Type__Alternatives2095);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1018:6: ( ruleSignedDouble )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1018:6: ( ruleSignedDouble )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1019:1: ruleSignedDouble
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getSignedDoubleParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSignedDouble_in_rule__Type__Alternatives2112);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1024:6: ( RULE_STRING )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1024:6: ( RULE_STRING )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1025:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getSTRINGTerminalRuleCall_2()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Type__Alternatives2129); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getSTRINGTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1030:6: ( RULE_BOOLEAN )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1030:6: ( RULE_BOOLEAN )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1031:1: RULE_BOOLEAN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getBOOLEANTerminalRuleCall_3()); 
                    }
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__Type__Alternatives2146); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getBOOLEANTerminalRuleCall_3()); 
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1041:1: rule__ComparisonOperator__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1045:1: ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            case 15:
                {
                alt7=4;
                }
                break;
            case 16:
                {
                alt7=5;
                }
                break;
            case 17:
                {
                alt7=6;
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1046:1: ( ( '==' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1046:1: ( ( '==' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1047:1: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1048:1: ( '==' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1048:3: '=='
                    {
                    match(input,12,FOLLOW_12_in_rule__ComparisonOperator__Alternatives2179); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1053:6: ( ( '!=' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1053:6: ( ( '!=' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1054:1: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getUNEQUALEnumLiteralDeclaration_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1055:1: ( '!=' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1055:3: '!='
                    {
                    match(input,13,FOLLOW_13_in_rule__ComparisonOperator__Alternatives2200); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getUNEQUALEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1060:6: ( ( '>' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1060:6: ( ( '>' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1061:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1062:1: ( '>' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1062:3: '>'
                    {
                    match(input,14,FOLLOW_14_in_rule__ComparisonOperator__Alternatives2221); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1067:6: ( ( '>=' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1067:6: ( ( '>=' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1068:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getGREATEROREQUALEnumLiteralDeclaration_3()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1069:1: ( '>=' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1069:3: '>='
                    {
                    match(input,15,FOLLOW_15_in_rule__ComparisonOperator__Alternatives2242); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getGREATEROREQUALEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1074:6: ( ( '<' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1074:6: ( ( '<' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1075:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getLOWEREnumLiteralDeclaration_4()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1076:1: ( '<' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1076:3: '<'
                    {
                    match(input,16,FOLLOW_16_in_rule__ComparisonOperator__Alternatives2263); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getLOWEREnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1081:6: ( ( '<=' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1081:6: ( ( '<=' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1082:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getLOWEROREQUALEnumLiteralDeclaration_5()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1083:1: ( '<=' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1083:3: '<='
                    {
                    match(input,17,FOLLOW_17_in_rule__ComparisonOperator__Alternatives2284); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1093:1: rule__LogicalOperator__Alternatives : ( ( ( 'all' ) ) | ( ( 'any' ) ) );
    public final void rule__LogicalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1097:1: ( ( ( 'all' ) ) | ( ( 'any' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1098:1: ( ( 'all' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1098:1: ( ( 'all' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1099:1: ( 'all' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicalOperatorAccess().getALLEnumLiteralDeclaration_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1100:1: ( 'all' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1100:3: 'all'
                    {
                    match(input,18,FOLLOW_18_in_rule__LogicalOperator__Alternatives2320); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicalOperatorAccess().getALLEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1105:6: ( ( 'any' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1105:6: ( ( 'any' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1106:1: ( 'any' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicalOperatorAccess().getANYEnumLiteralDeclaration_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1107:1: ( 'any' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1107:3: 'any'
                    {
                    match(input,19,FOLLOW_19_in_rule__LogicalOperator__Alternatives2341); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1117:1: rule__LineStyle__Alternatives : ( ( ( 'solid' ) ) | ( ( 'dot' ) ) | ( ( 'dash' ) ) | ( ( 'dash_dot' ) ) | ( ( 'dash_dot_dot' ) ) );
    public final void rule__LineStyle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1121:1: ( ( ( 'solid' ) ) | ( ( 'dot' ) ) | ( ( 'dash' ) ) | ( ( 'dash_dot' ) ) | ( ( 'dash_dot_dot' ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            case 22:
                {
                alt9=3;
                }
                break;
            case 23:
                {
                alt9=4;
                }
                break;
            case 24:
                {
                alt9=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1122:1: ( ( 'solid' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1122:1: ( ( 'solid' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1123:1: ( 'solid' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLineStyleAccess().getLINE_SOLIDEnumLiteralDeclaration_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1124:1: ( 'solid' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1124:3: 'solid'
                    {
                    match(input,20,FOLLOW_20_in_rule__LineStyle__Alternatives2377); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLineStyleAccess().getLINE_SOLIDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1129:6: ( ( 'dot' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1129:6: ( ( 'dot' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1130:1: ( 'dot' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLineStyleAccess().getLINE_DOTEnumLiteralDeclaration_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1131:1: ( 'dot' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1131:3: 'dot'
                    {
                    match(input,21,FOLLOW_21_in_rule__LineStyle__Alternatives2398); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLineStyleAccess().getLINE_DOTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1136:6: ( ( 'dash' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1136:6: ( ( 'dash' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1137:1: ( 'dash' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLineStyleAccess().getLINE_DASHEnumLiteralDeclaration_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1138:1: ( 'dash' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1138:3: 'dash'
                    {
                    match(input,22,FOLLOW_22_in_rule__LineStyle__Alternatives2419); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLineStyleAccess().getLINE_DASHEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1143:6: ( ( 'dash_dot' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1143:6: ( ( 'dash_dot' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1144:1: ( 'dash_dot' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLineStyleAccess().getLINE_DASHDOTEnumLiteralDeclaration_3()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1145:1: ( 'dash_dot' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1145:3: 'dash_dot'
                    {
                    match(input,23,FOLLOW_23_in_rule__LineStyle__Alternatives2440); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLineStyleAccess().getLINE_DASHDOTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1150:6: ( ( 'dash_dot_dot' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1150:6: ( ( 'dash_dot_dot' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1151:1: ( 'dash_dot_dot' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLineStyleAccess().getLINE_DASHDOTDOTEnumLiteralDeclaration_4()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1152:1: ( 'dash_dot_dot' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1152:3: 'dash_dot_dot'
                    {
                    match(input,24,FOLLOW_24_in_rule__LineStyle__Alternatives2461); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1162:1: rule__Colors__Alternatives : ( ( ( 'red' ) ) | ( ( 'black' ) ) | ( ( 'white' ) ) | ( ( 'green' ) ) | ( ( 'green_light' ) ) | ( ( 'green_dark' ) ) | ( ( 'blue' ) ) | ( ( 'blue_light' ) ) | ( ( 'blue_dark' ) ) | ( ( 'gray' ) ) | ( ( 'gray_light' ) ) | ( ( 'gray_dark' ) ) | ( ( 'orange' ) ) | ( ( 'yellow' ) ) | ( ( 'cyan' ) ) );
    public final void rule__Colors__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1166:1: ( ( ( 'red' ) ) | ( ( 'black' ) ) | ( ( 'white' ) ) | ( ( 'green' ) ) | ( ( 'green_light' ) ) | ( ( 'green_dark' ) ) | ( ( 'blue' ) ) | ( ( 'blue_light' ) ) | ( ( 'blue_dark' ) ) | ( ( 'gray' ) ) | ( ( 'gray_light' ) ) | ( ( 'gray_dark' ) ) | ( ( 'orange' ) ) | ( ( 'yellow' ) ) | ( ( 'cyan' ) ) )
            int alt10=15;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt10=1;
                }
                break;
            case 26:
                {
                alt10=2;
                }
                break;
            case 27:
                {
                alt10=3;
                }
                break;
            case 28:
                {
                alt10=4;
                }
                break;
            case 29:
                {
                alt10=5;
                }
                break;
            case 30:
                {
                alt10=6;
                }
                break;
            case 31:
                {
                alt10=7;
                }
                break;
            case 32:
                {
                alt10=8;
                }
                break;
            case 33:
                {
                alt10=9;
                }
                break;
            case 34:
                {
                alt10=10;
                }
                break;
            case 35:
                {
                alt10=11;
                }
                break;
            case 36:
                {
                alt10=12;
                }
                break;
            case 37:
                {
                alt10=13;
                }
                break;
            case 38:
                {
                alt10=14;
                }
                break;
            case 39:
                {
                alt10=15;
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1167:1: ( ( 'red' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1167:1: ( ( 'red' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1168:1: ( 'red' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1169:1: ( 'red' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1169:3: 'red'
                    {
                    match(input,25,FOLLOW_25_in_rule__Colors__Alternatives2497); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1174:6: ( ( 'black' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1174:6: ( ( 'black' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1175:1: ( 'black' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1176:1: ( 'black' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1176:3: 'black'
                    {
                    match(input,26,FOLLOW_26_in_rule__Colors__Alternatives2518); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1181:6: ( ( 'white' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1181:6: ( ( 'white' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1182:1: ( 'white' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1183:1: ( 'white' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1183:3: 'white'
                    {
                    match(input,27,FOLLOW_27_in_rule__Colors__Alternatives2539); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1188:6: ( ( 'green' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1188:6: ( ( 'green' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1189:1: ( 'green' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_3()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1190:1: ( 'green' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1190:3: 'green'
                    {
                    match(input,28,FOLLOW_28_in_rule__Colors__Alternatives2560); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1195:6: ( ( 'green_light' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1195:6: ( ( 'green_light' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1196:1: ( 'green_light' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getGREEN_LIGHTEnumLiteralDeclaration_4()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1197:1: ( 'green_light' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1197:3: 'green_light'
                    {
                    match(input,29,FOLLOW_29_in_rule__Colors__Alternatives2581); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getGREEN_LIGHTEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1202:6: ( ( 'green_dark' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1202:6: ( ( 'green_dark' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1203:1: ( 'green_dark' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getGREEN_DARKEnumLiteralDeclaration_5()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1204:1: ( 'green_dark' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1204:3: 'green_dark'
                    {
                    match(input,30,FOLLOW_30_in_rule__Colors__Alternatives2602); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getGREEN_DARKEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1209:6: ( ( 'blue' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1209:6: ( ( 'blue' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1210:1: ( 'blue' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_6()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1211:1: ( 'blue' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1211:3: 'blue'
                    {
                    match(input,31,FOLLOW_31_in_rule__Colors__Alternatives2623); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1216:6: ( ( 'blue_light' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1216:6: ( ( 'blue_light' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1217:1: ( 'blue_light' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getBLUE_LIGHTEnumLiteralDeclaration_7()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1218:1: ( 'blue_light' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1218:3: 'blue_light'
                    {
                    match(input,32,FOLLOW_32_in_rule__Colors__Alternatives2644); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getBLUE_LIGHTEnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1223:6: ( ( 'blue_dark' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1223:6: ( ( 'blue_dark' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1224:1: ( 'blue_dark' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getBLUE_DARKEnumLiteralDeclaration_8()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1225:1: ( 'blue_dark' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1225:3: 'blue_dark'
                    {
                    match(input,33,FOLLOW_33_in_rule__Colors__Alternatives2665); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getBLUE_DARKEnumLiteralDeclaration_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1230:6: ( ( 'gray' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1230:6: ( ( 'gray' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1231:1: ( 'gray' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_9()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1232:1: ( 'gray' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1232:3: 'gray'
                    {
                    match(input,34,FOLLOW_34_in_rule__Colors__Alternatives2686); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1237:6: ( ( 'gray_light' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1237:6: ( ( 'gray_light' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1238:1: ( 'gray_light' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getGRAY_LIGHTEnumLiteralDeclaration_10()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1239:1: ( 'gray_light' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1239:3: 'gray_light'
                    {
                    match(input,35,FOLLOW_35_in_rule__Colors__Alternatives2707); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getGRAY_LIGHTEnumLiteralDeclaration_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1244:6: ( ( 'gray_dark' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1244:6: ( ( 'gray_dark' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1245:1: ( 'gray_dark' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getGRAY_DARKEnumLiteralDeclaration_11()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1246:1: ( 'gray_dark' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1246:3: 'gray_dark'
                    {
                    match(input,36,FOLLOW_36_in_rule__Colors__Alternatives2728); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getGRAY_DARKEnumLiteralDeclaration_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1251:6: ( ( 'orange' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1251:6: ( ( 'orange' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1252:1: ( 'orange' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_12()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1253:1: ( 'orange' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1253:3: 'orange'
                    {
                    match(input,37,FOLLOW_37_in_rule__Colors__Alternatives2749); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1258:6: ( ( 'yellow' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1258:6: ( ( 'yellow' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1259:1: ( 'yellow' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_13()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1260:1: ( 'yellow' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1260:3: 'yellow'
                    {
                    match(input,38,FOLLOW_38_in_rule__Colors__Alternatives2770); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1265:6: ( ( 'cyan' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1265:6: ( ( 'cyan' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1266:1: ( 'cyan' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getCYANEnumLiteralDeclaration_14()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1267:1: ( 'cyan' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1267:3: 'cyan'
                    {
                    match(input,39,FOLLOW_39_in_rule__Colors__Alternatives2791); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1277:1: rule__Directions__Alternatives : ( ( ( 'center' ) ) | ( ( 'north' ) ) | ( ( 'south' ) ) | ( ( 'west' ) ) | ( ( 'east' ) ) | ( ( 'north_east' ) ) | ( ( 'north_west' ) ) | ( ( 'south_east' ) ) | ( ( 'south_west' ) ) );
    public final void rule__Directions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1281:1: ( ( ( 'center' ) ) | ( ( 'north' ) ) | ( ( 'south' ) ) | ( ( 'west' ) ) | ( ( 'east' ) ) | ( ( 'north_east' ) ) | ( ( 'north_west' ) ) | ( ( 'south_east' ) ) | ( ( 'south_west' ) ) )
            int alt11=9;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt11=1;
                }
                break;
            case 41:
                {
                alt11=2;
                }
                break;
            case 42:
                {
                alt11=3;
                }
                break;
            case 43:
                {
                alt11=4;
                }
                break;
            case 44:
                {
                alt11=5;
                }
                break;
            case 45:
                {
                alt11=6;
                }
                break;
            case 46:
                {
                alt11=7;
                }
                break;
            case 47:
                {
                alt11=8;
                }
                break;
            case 48:
                {
                alt11=9;
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1282:1: ( ( 'center' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1282:1: ( ( 'center' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1283:1: ( 'center' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getCENTEREnumLiteralDeclaration_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1284:1: ( 'center' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1284:3: 'center'
                    {
                    match(input,40,FOLLOW_40_in_rule__Directions__Alternatives2827); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getCENTEREnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1289:6: ( ( 'north' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1289:6: ( ( 'north' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1290:1: ( 'north' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getNORHTEnumLiteralDeclaration_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1291:1: ( 'north' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1291:3: 'north'
                    {
                    match(input,41,FOLLOW_41_in_rule__Directions__Alternatives2848); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getNORHTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1296:6: ( ( 'south' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1296:6: ( ( 'south' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1297:1: ( 'south' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getSOUTHEnumLiteralDeclaration_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1298:1: ( 'south' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1298:3: 'south'
                    {
                    match(input,42,FOLLOW_42_in_rule__Directions__Alternatives2869); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getSOUTHEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1303:6: ( ( 'west' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1303:6: ( ( 'west' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1304:1: ( 'west' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getWESTEnumLiteralDeclaration_3()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1305:1: ( 'west' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1305:3: 'west'
                    {
                    match(input,43,FOLLOW_43_in_rule__Directions__Alternatives2890); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getWESTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1310:6: ( ( 'east' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1310:6: ( ( 'east' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1311:1: ( 'east' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getEASTEnumLiteralDeclaration_4()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1312:1: ( 'east' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1312:3: 'east'
                    {
                    match(input,44,FOLLOW_44_in_rule__Directions__Alternatives2911); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getEASTEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1317:6: ( ( 'north_east' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1317:6: ( ( 'north_east' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1318:1: ( 'north_east' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getNORTH_EASTEnumLiteralDeclaration_5()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1319:1: ( 'north_east' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1319:3: 'north_east'
                    {
                    match(input,45,FOLLOW_45_in_rule__Directions__Alternatives2932); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getNORTH_EASTEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1324:6: ( ( 'north_west' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1324:6: ( ( 'north_west' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1325:1: ( 'north_west' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getNORTH_WESTEnumLiteralDeclaration_6()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1326:1: ( 'north_west' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1326:3: 'north_west'
                    {
                    match(input,46,FOLLOW_46_in_rule__Directions__Alternatives2953); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getNORTH_WESTEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1331:6: ( ( 'south_east' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1331:6: ( ( 'south_east' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1332:1: ( 'south_east' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getSOUTH_EASTEnumLiteralDeclaration_7()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1333:1: ( 'south_east' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1333:3: 'south_east'
                    {
                    match(input,47,FOLLOW_47_in_rule__Directions__Alternatives2974); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getSOUTH_EASTEnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1338:6: ( ( 'south_west' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1338:6: ( ( 'south_west' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1339:1: ( 'south_west' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getSOUTH_WESTEnumLiteralDeclaration_8()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1340:1: ( 'south_west' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1340:3: 'south_west'
                    {
                    match(input,48,FOLLOW_48_in_rule__Directions__Alternatives2995); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1352:1: rule__DecorationModel__Group__0 : rule__DecorationModel__Group__0__Impl rule__DecorationModel__Group__1 ;
    public final void rule__DecorationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1356:1: ( rule__DecorationModel__Group__0__Impl rule__DecorationModel__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1357:2: rule__DecorationModel__Group__0__Impl rule__DecorationModel__Group__1
            {
            pushFollow(FOLLOW_rule__DecorationModel__Group__0__Impl_in_rule__DecorationModel__Group__03028);
            rule__DecorationModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DecorationModel__Group__1_in_rule__DecorationModel__Group__03031);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1364:1: rule__DecorationModel__Group__0__Impl : ( 'import resource' ) ;
    public final void rule__DecorationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1368:1: ( ( 'import resource' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1369:1: ( 'import resource' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1369:1: ( 'import resource' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1370:1: 'import resource'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationModelAccess().getImportResourceKeyword_0()); 
            }
            match(input,49,FOLLOW_49_in_rule__DecorationModel__Group__0__Impl3059); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1383:1: rule__DecorationModel__Group__1 : rule__DecorationModel__Group__1__Impl rule__DecorationModel__Group__2 ;
    public final void rule__DecorationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1387:1: ( rule__DecorationModel__Group__1__Impl rule__DecorationModel__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1388:2: rule__DecorationModel__Group__1__Impl rule__DecorationModel__Group__2
            {
            pushFollow(FOLLOW_rule__DecorationModel__Group__1__Impl_in_rule__DecorationModel__Group__13090);
            rule__DecorationModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DecorationModel__Group__2_in_rule__DecorationModel__Group__13093);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1395:1: rule__DecorationModel__Group__1__Impl : ( ( rule__DecorationModel__ImportURIAssignment_1 ) ) ;
    public final void rule__DecorationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1399:1: ( ( ( rule__DecorationModel__ImportURIAssignment_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1400:1: ( ( rule__DecorationModel__ImportURIAssignment_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1400:1: ( ( rule__DecorationModel__ImportURIAssignment_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1401:1: ( rule__DecorationModel__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationModelAccess().getImportURIAssignment_1()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1402:1: ( rule__DecorationModel__ImportURIAssignment_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1402:2: rule__DecorationModel__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__DecorationModel__ImportURIAssignment_1_in_rule__DecorationModel__Group__1__Impl3120);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1412:1: rule__DecorationModel__Group__2 : rule__DecorationModel__Group__2__Impl rule__DecorationModel__Group__3 ;
    public final void rule__DecorationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1416:1: ( rule__DecorationModel__Group__2__Impl rule__DecorationModel__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1417:2: rule__DecorationModel__Group__2__Impl rule__DecorationModel__Group__3
            {
            pushFollow(FOLLOW_rule__DecorationModel__Group__2__Impl_in_rule__DecorationModel__Group__23150);
            rule__DecorationModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DecorationModel__Group__3_in_rule__DecorationModel__Group__23153);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1424:1: rule__DecorationModel__Group__2__Impl : ( ( rule__DecorationModel__NamespaceAssignment_2 )? ) ;
    public final void rule__DecorationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1428:1: ( ( ( rule__DecorationModel__NamespaceAssignment_2 )? ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1429:1: ( ( rule__DecorationModel__NamespaceAssignment_2 )? )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1429:1: ( ( rule__DecorationModel__NamespaceAssignment_2 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1430:1: ( rule__DecorationModel__NamespaceAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationModelAccess().getNamespaceAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1431:1: ( rule__DecorationModel__NamespaceAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==50) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1431:2: rule__DecorationModel__NamespaceAssignment_2
                    {
                    pushFollow(FOLLOW_rule__DecorationModel__NamespaceAssignment_2_in_rule__DecorationModel__Group__2__Impl3180);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1441:1: rule__DecorationModel__Group__3 : rule__DecorationModel__Group__3__Impl ;
    public final void rule__DecorationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1445:1: ( rule__DecorationModel__Group__3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1446:2: rule__DecorationModel__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DecorationModel__Group__3__Impl_in_rule__DecorationModel__Group__33211);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1452:1: rule__DecorationModel__Group__3__Impl : ( ( rule__DecorationModel__DecorationDescriptionsAssignment_3 )* ) ;
    public final void rule__DecorationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1456:1: ( ( ( rule__DecorationModel__DecorationDescriptionsAssignment_3 )* ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1457:1: ( ( rule__DecorationModel__DecorationDescriptionsAssignment_3 )* )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1457:1: ( ( rule__DecorationModel__DecorationDescriptionsAssignment_3 )* )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1458:1: ( rule__DecorationModel__DecorationDescriptionsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationModelAccess().getDecorationDescriptionsAssignment_3()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1459:1: ( rule__DecorationModel__DecorationDescriptionsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==51) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1459:2: rule__DecorationModel__DecorationDescriptionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__DecorationModel__DecorationDescriptionsAssignment_3_in_rule__DecorationModel__Group__3__Impl3238);
            	    rule__DecorationModel__DecorationDescriptionsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1477:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1481:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1482:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__03277);
            rule__Namespace__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__03280);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1489:1: rule__Namespace__Group__0__Impl : ( 'profile' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1493:1: ( ( 'profile' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1494:1: ( 'profile' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1494:1: ( 'profile' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1495:1: 'profile'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceAccess().getProfileKeyword_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__Namespace__Group__0__Impl3308); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1508:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1512:1: ( rule__Namespace__Group__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1513:2: rule__Namespace__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__13339);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1519:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__ProfileAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1523:1: ( ( ( rule__Namespace__ProfileAssignment_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1524:1: ( ( rule__Namespace__ProfileAssignment_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1524:1: ( ( rule__Namespace__ProfileAssignment_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1525:1: ( rule__Namespace__ProfileAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceAccess().getProfileAssignment_1()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1526:1: ( rule__Namespace__ProfileAssignment_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1526:2: rule__Namespace__ProfileAssignment_1
            {
            pushFollow(FOLLOW_rule__Namespace__ProfileAssignment_1_in_rule__Namespace__Group__1__Impl3366);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1540:1: rule__DecorationDescription__Group__0 : rule__DecorationDescription__Group__0__Impl rule__DecorationDescription__Group__1 ;
    public final void rule__DecorationDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1544:1: ( rule__DecorationDescription__Group__0__Impl rule__DecorationDescription__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1545:2: rule__DecorationDescription__Group__0__Impl rule__DecorationDescription__Group__1
            {
            pushFollow(FOLLOW_rule__DecorationDescription__Group__0__Impl_in_rule__DecorationDescription__Group__03400);
            rule__DecorationDescription__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DecorationDescription__Group__1_in_rule__DecorationDescription__Group__03403);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1552:1: rule__DecorationDescription__Group__0__Impl : ( 'decoration' ) ;
    public final void rule__DecorationDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1556:1: ( ( 'decoration' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1557:1: ( 'decoration' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1557:1: ( 'decoration' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1558:1: 'decoration'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getDecorationKeyword_0()); 
            }
            match(input,51,FOLLOW_51_in_rule__DecorationDescription__Group__0__Impl3431); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1571:1: rule__DecorationDescription__Group__1 : rule__DecorationDescription__Group__1__Impl rule__DecorationDescription__Group__2 ;
    public final void rule__DecorationDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1575:1: ( rule__DecorationDescription__Group__1__Impl rule__DecorationDescription__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1576:2: rule__DecorationDescription__Group__1__Impl rule__DecorationDescription__Group__2
            {
            pushFollow(FOLLOW_rule__DecorationDescription__Group__1__Impl_in_rule__DecorationDescription__Group__13462);
            rule__DecorationDescription__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DecorationDescription__Group__2_in_rule__DecorationDescription__Group__13465);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1583:1: rule__DecorationDescription__Group__1__Impl : ( ( rule__DecorationDescription__StereotypeAssignment_1 ) ) ;
    public final void rule__DecorationDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1587:1: ( ( ( rule__DecorationDescription__StereotypeAssignment_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1588:1: ( ( rule__DecorationDescription__StereotypeAssignment_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1588:1: ( ( rule__DecorationDescription__StereotypeAssignment_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1589:1: ( rule__DecorationDescription__StereotypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getStereotypeAssignment_1()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1590:1: ( rule__DecorationDescription__StereotypeAssignment_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1590:2: rule__DecorationDescription__StereotypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DecorationDescription__StereotypeAssignment_1_in_rule__DecorationDescription__Group__1__Impl3492);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1600:1: rule__DecorationDescription__Group__2 : rule__DecorationDescription__Group__2__Impl rule__DecorationDescription__Group__3 ;
    public final void rule__DecorationDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1604:1: ( rule__DecorationDescription__Group__2__Impl rule__DecorationDescription__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1605:2: rule__DecorationDescription__Group__2__Impl rule__DecorationDescription__Group__3
            {
            pushFollow(FOLLOW_rule__DecorationDescription__Group__2__Impl_in_rule__DecorationDescription__Group__23522);
            rule__DecorationDescription__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DecorationDescription__Group__3_in_rule__DecorationDescription__Group__23525);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1612:1: rule__DecorationDescription__Group__2__Impl : ( '{' ) ;
    public final void rule__DecorationDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1616:1: ( ( '{' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1617:1: ( '{' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1617:1: ( '{' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1618:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,52,FOLLOW_52_in_rule__DecorationDescription__Group__2__Impl3553); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1631:1: rule__DecorationDescription__Group__3 : rule__DecorationDescription__Group__3__Impl rule__DecorationDescription__Group__4 ;
    public final void rule__DecorationDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1635:1: ( rule__DecorationDescription__Group__3__Impl rule__DecorationDescription__Group__4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1636:2: rule__DecorationDescription__Group__3__Impl rule__DecorationDescription__Group__4
            {
            pushFollow(FOLLOW_rule__DecorationDescription__Group__3__Impl_in_rule__DecorationDescription__Group__33584);
            rule__DecorationDescription__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DecorationDescription__Group__4_in_rule__DecorationDescription__Group__33587);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1643:1: rule__DecorationDescription__Group__3__Impl : ( ( rule__DecorationDescription__UnorderedGroup_3 ) ) ;
    public final void rule__DecorationDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1647:1: ( ( ( rule__DecorationDescription__UnorderedGroup_3 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1648:1: ( ( rule__DecorationDescription__UnorderedGroup_3 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1648:1: ( ( rule__DecorationDescription__UnorderedGroup_3 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1649:1: ( rule__DecorationDescription__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1650:1: ( rule__DecorationDescription__UnorderedGroup_3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1650:2: rule__DecorationDescription__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__DecorationDescription__UnorderedGroup_3_in_rule__DecorationDescription__Group__3__Impl3614);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1660:1: rule__DecorationDescription__Group__4 : rule__DecorationDescription__Group__4__Impl ;
    public final void rule__DecorationDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1664:1: ( rule__DecorationDescription__Group__4__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1665:2: rule__DecorationDescription__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DecorationDescription__Group__4__Impl_in_rule__DecorationDescription__Group__43644);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1671:1: rule__DecorationDescription__Group__4__Impl : ( '}' ) ;
    public final void rule__DecorationDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1675:1: ( ( '}' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1676:1: ( '}' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1676:1: ( '}' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1677:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,53,FOLLOW_53_in_rule__DecorationDescription__Group__4__Impl3672); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1700:1: rule__ImageDecoration__Group__0 : rule__ImageDecoration__Group__0__Impl rule__ImageDecoration__Group__1 ;
    public final void rule__ImageDecoration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1704:1: ( rule__ImageDecoration__Group__0__Impl rule__ImageDecoration__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1705:2: rule__ImageDecoration__Group__0__Impl rule__ImageDecoration__Group__1
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group__0__Impl_in_rule__ImageDecoration__Group__03713);
            rule__ImageDecoration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group__1_in_rule__ImageDecoration__Group__03716);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1712:1: rule__ImageDecoration__Group__0__Impl : ( () ) ;
    public final void rule__ImageDecoration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1716:1: ( ( () ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1717:1: ( () )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1717:1: ( () )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1718:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getImageDecorationAction_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1719:1: ()
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1721:1: 
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1731:1: rule__ImageDecoration__Group__1 : rule__ImageDecoration__Group__1__Impl rule__ImageDecoration__Group__2 ;
    public final void rule__ImageDecoration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1735:1: ( rule__ImageDecoration__Group__1__Impl rule__ImageDecoration__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1736:2: rule__ImageDecoration__Group__1__Impl rule__ImageDecoration__Group__2
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group__1__Impl_in_rule__ImageDecoration__Group__13774);
            rule__ImageDecoration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group__2_in_rule__ImageDecoration__Group__13777);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1743:1: rule__ImageDecoration__Group__1__Impl : ( 'image' ) ;
    public final void rule__ImageDecoration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1747:1: ( ( 'image' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1748:1: ( 'image' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1748:1: ( 'image' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1749:1: 'image'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getImageKeyword_1()); 
            }
            match(input,54,FOLLOW_54_in_rule__ImageDecoration__Group__1__Impl3805); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1762:1: rule__ImageDecoration__Group__2 : rule__ImageDecoration__Group__2__Impl rule__ImageDecoration__Group__3 ;
    public final void rule__ImageDecoration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1766:1: ( rule__ImageDecoration__Group__2__Impl rule__ImageDecoration__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1767:2: rule__ImageDecoration__Group__2__Impl rule__ImageDecoration__Group__3
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group__2__Impl_in_rule__ImageDecoration__Group__23836);
            rule__ImageDecoration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group__3_in_rule__ImageDecoration__Group__23839);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1774:1: rule__ImageDecoration__Group__2__Impl : ( '{' ) ;
    public final void rule__ImageDecoration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1778:1: ( ( '{' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1779:1: ( '{' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1779:1: ( '{' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1780:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,52,FOLLOW_52_in_rule__ImageDecoration__Group__2__Impl3867); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1793:1: rule__ImageDecoration__Group__3 : rule__ImageDecoration__Group__3__Impl rule__ImageDecoration__Group__4 ;
    public final void rule__ImageDecoration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1797:1: ( rule__ImageDecoration__Group__3__Impl rule__ImageDecoration__Group__4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1798:2: rule__ImageDecoration__Group__3__Impl rule__ImageDecoration__Group__4
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group__3__Impl_in_rule__ImageDecoration__Group__33898);
            rule__ImageDecoration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group__4_in_rule__ImageDecoration__Group__33901);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1805:1: rule__ImageDecoration__Group__3__Impl : ( ( rule__ImageDecoration__UnorderedGroup_3 ) ) ;
    public final void rule__ImageDecoration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1809:1: ( ( ( rule__ImageDecoration__UnorderedGroup_3 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1810:1: ( ( rule__ImageDecoration__UnorderedGroup_3 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1810:1: ( ( rule__ImageDecoration__UnorderedGroup_3 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1811:1: ( rule__ImageDecoration__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1812:1: ( rule__ImageDecoration__UnorderedGroup_3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1812:2: rule__ImageDecoration__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3_in_rule__ImageDecoration__Group__3__Impl3928);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1822:1: rule__ImageDecoration__Group__4 : rule__ImageDecoration__Group__4__Impl ;
    public final void rule__ImageDecoration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1826:1: ( rule__ImageDecoration__Group__4__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1827:2: rule__ImageDecoration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group__4__Impl_in_rule__ImageDecoration__Group__43958);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1833:1: rule__ImageDecoration__Group__4__Impl : ( '}' ) ;
    public final void rule__ImageDecoration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1837:1: ( ( '}' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1838:1: ( '}' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1838:1: ( '}' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1839:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,53,FOLLOW_53_in_rule__ImageDecoration__Group__4__Impl3986); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1862:1: rule__ImageDecoration__Group_3_0__0 : rule__ImageDecoration__Group_3_0__0__Impl rule__ImageDecoration__Group_3_0__1 ;
    public final void rule__ImageDecoration__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1866:1: ( rule__ImageDecoration__Group_3_0__0__Impl rule__ImageDecoration__Group_3_0__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1867:2: rule__ImageDecoration__Group_3_0__0__Impl rule__ImageDecoration__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_0__0__Impl_in_rule__ImageDecoration__Group_3_0__04027);
            rule__ImageDecoration__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_0__1_in_rule__ImageDecoration__Group_3_0__04030);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1874:1: rule__ImageDecoration__Group_3_0__0__Impl : ( 'location-uri' ) ;
    public final void rule__ImageDecoration__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1878:1: ( ( 'location-uri' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1879:1: ( 'location-uri' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1879:1: ( 'location-uri' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1880:1: 'location-uri'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getLocationUriKeyword_3_0_0()); 
            }
            match(input,55,FOLLOW_55_in_rule__ImageDecoration__Group_3_0__0__Impl4058); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1893:1: rule__ImageDecoration__Group_3_0__1 : rule__ImageDecoration__Group_3_0__1__Impl rule__ImageDecoration__Group_3_0__2 ;
    public final void rule__ImageDecoration__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1897:1: ( rule__ImageDecoration__Group_3_0__1__Impl rule__ImageDecoration__Group_3_0__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1898:2: rule__ImageDecoration__Group_3_0__1__Impl rule__ImageDecoration__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_0__1__Impl_in_rule__ImageDecoration__Group_3_0__14089);
            rule__ImageDecoration__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_0__2_in_rule__ImageDecoration__Group_3_0__14092);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1905:1: rule__ImageDecoration__Group_3_0__1__Impl : ( '=' ) ;
    public final void rule__ImageDecoration__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1909:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1910:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1910:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1911:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getEqualsSignKeyword_3_0_1()); 
            }
            match(input,56,FOLLOW_56_in_rule__ImageDecoration__Group_3_0__1__Impl4120); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1924:1: rule__ImageDecoration__Group_3_0__2 : rule__ImageDecoration__Group_3_0__2__Impl ;
    public final void rule__ImageDecoration__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1928:1: ( rule__ImageDecoration__Group_3_0__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1929:2: rule__ImageDecoration__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_0__2__Impl_in_rule__ImageDecoration__Group_3_0__24151);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1935:1: rule__ImageDecoration__Group_3_0__2__Impl : ( ( rule__ImageDecoration__Location_uriAssignment_3_0_2 ) ) ;
    public final void rule__ImageDecoration__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1939:1: ( ( ( rule__ImageDecoration__Location_uriAssignment_3_0_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1940:1: ( ( rule__ImageDecoration__Location_uriAssignment_3_0_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1940:1: ( ( rule__ImageDecoration__Location_uriAssignment_3_0_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1941:1: ( rule__ImageDecoration__Location_uriAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getLocation_uriAssignment_3_0_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1942:1: ( rule__ImageDecoration__Location_uriAssignment_3_0_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1942:2: rule__ImageDecoration__Location_uriAssignment_3_0_2
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Location_uriAssignment_3_0_2_in_rule__ImageDecoration__Group_3_0__2__Impl4178);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1958:1: rule__ImageDecoration__Group_3_3__0 : rule__ImageDecoration__Group_3_3__0__Impl rule__ImageDecoration__Group_3_3__1 ;
    public final void rule__ImageDecoration__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1962:1: ( rule__ImageDecoration__Group_3_3__0__Impl rule__ImageDecoration__Group_3_3__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1963:2: rule__ImageDecoration__Group_3_3__0__Impl rule__ImageDecoration__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_3__0__Impl_in_rule__ImageDecoration__Group_3_3__04214);
            rule__ImageDecoration__Group_3_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_3__1_in_rule__ImageDecoration__Group_3_3__04217);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1970:1: rule__ImageDecoration__Group_3_3__0__Impl : ( 'tooltip' ) ;
    public final void rule__ImageDecoration__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1974:1: ( ( 'tooltip' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1975:1: ( 'tooltip' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1975:1: ( 'tooltip' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1976:1: 'tooltip'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getTooltipKeyword_3_3_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__ImageDecoration__Group_3_3__0__Impl4245); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1989:1: rule__ImageDecoration__Group_3_3__1 : rule__ImageDecoration__Group_3_3__1__Impl rule__ImageDecoration__Group_3_3__2 ;
    public final void rule__ImageDecoration__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1993:1: ( rule__ImageDecoration__Group_3_3__1__Impl rule__ImageDecoration__Group_3_3__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1994:2: rule__ImageDecoration__Group_3_3__1__Impl rule__ImageDecoration__Group_3_3__2
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_3__1__Impl_in_rule__ImageDecoration__Group_3_3__14276);
            rule__ImageDecoration__Group_3_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_3__2_in_rule__ImageDecoration__Group_3_3__14279);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2001:1: rule__ImageDecoration__Group_3_3__1__Impl : ( '=' ) ;
    public final void rule__ImageDecoration__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2005:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2006:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2006:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2007:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getEqualsSignKeyword_3_3_1()); 
            }
            match(input,56,FOLLOW_56_in_rule__ImageDecoration__Group_3_3__1__Impl4307); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2020:1: rule__ImageDecoration__Group_3_3__2 : rule__ImageDecoration__Group_3_3__2__Impl ;
    public final void rule__ImageDecoration__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2024:1: ( rule__ImageDecoration__Group_3_3__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2025:2: rule__ImageDecoration__Group_3_3__2__Impl
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_3__2__Impl_in_rule__ImageDecoration__Group_3_3__24338);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2031:1: rule__ImageDecoration__Group_3_3__2__Impl : ( ( rule__ImageDecoration__TooltipAssignment_3_3_2 ) ) ;
    public final void rule__ImageDecoration__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2035:1: ( ( ( rule__ImageDecoration__TooltipAssignment_3_3_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2036:1: ( ( rule__ImageDecoration__TooltipAssignment_3_3_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2036:1: ( ( rule__ImageDecoration__TooltipAssignment_3_3_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2037:1: ( rule__ImageDecoration__TooltipAssignment_3_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getTooltipAssignment_3_3_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2038:1: ( rule__ImageDecoration__TooltipAssignment_3_3_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2038:2: rule__ImageDecoration__TooltipAssignment_3_3_2
            {
            pushFollow(FOLLOW_rule__ImageDecoration__TooltipAssignment_3_3_2_in_rule__ImageDecoration__Group_3_3__2__Impl4365);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2054:1: rule__BorderDecoration__Group__0 : rule__BorderDecoration__Group__0__Impl rule__BorderDecoration__Group__1 ;
    public final void rule__BorderDecoration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2058:1: ( rule__BorderDecoration__Group__0__Impl rule__BorderDecoration__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2059:2: rule__BorderDecoration__Group__0__Impl rule__BorderDecoration__Group__1
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__0__Impl_in_rule__BorderDecoration__Group__04401);
            rule__BorderDecoration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BorderDecoration__Group__1_in_rule__BorderDecoration__Group__04404);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2066:1: rule__BorderDecoration__Group__0__Impl : ( () ) ;
    public final void rule__BorderDecoration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2070:1: ( ( () ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2071:1: ( () )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2071:1: ( () )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2072:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getBorderDecorationAction_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2073:1: ()
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2075:1: 
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2085:1: rule__BorderDecoration__Group__1 : rule__BorderDecoration__Group__1__Impl rule__BorderDecoration__Group__2 ;
    public final void rule__BorderDecoration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2089:1: ( rule__BorderDecoration__Group__1__Impl rule__BorderDecoration__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2090:2: rule__BorderDecoration__Group__1__Impl rule__BorderDecoration__Group__2
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__1__Impl_in_rule__BorderDecoration__Group__14462);
            rule__BorderDecoration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BorderDecoration__Group__2_in_rule__BorderDecoration__Group__14465);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2097:1: rule__BorderDecoration__Group__1__Impl : ( 'border' ) ;
    public final void rule__BorderDecoration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2101:1: ( ( 'border' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2102:1: ( 'border' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2102:1: ( 'border' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2103:1: 'border'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getBorderKeyword_1()); 
            }
            match(input,58,FOLLOW_58_in_rule__BorderDecoration__Group__1__Impl4493); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2116:1: rule__BorderDecoration__Group__2 : rule__BorderDecoration__Group__2__Impl rule__BorderDecoration__Group__3 ;
    public final void rule__BorderDecoration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2120:1: ( rule__BorderDecoration__Group__2__Impl rule__BorderDecoration__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2121:2: rule__BorderDecoration__Group__2__Impl rule__BorderDecoration__Group__3
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__2__Impl_in_rule__BorderDecoration__Group__24524);
            rule__BorderDecoration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BorderDecoration__Group__3_in_rule__BorderDecoration__Group__24527);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2128:1: rule__BorderDecoration__Group__2__Impl : ( '{' ) ;
    public final void rule__BorderDecoration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2132:1: ( ( '{' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2133:1: ( '{' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2133:1: ( '{' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2134:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,52,FOLLOW_52_in_rule__BorderDecoration__Group__2__Impl4555); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2147:1: rule__BorderDecoration__Group__3 : rule__BorderDecoration__Group__3__Impl rule__BorderDecoration__Group__4 ;
    public final void rule__BorderDecoration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2151:1: ( rule__BorderDecoration__Group__3__Impl rule__BorderDecoration__Group__4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2152:2: rule__BorderDecoration__Group__3__Impl rule__BorderDecoration__Group__4
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__3__Impl_in_rule__BorderDecoration__Group__34586);
            rule__BorderDecoration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BorderDecoration__Group__4_in_rule__BorderDecoration__Group__34589);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2159:1: rule__BorderDecoration__Group__3__Impl : ( ( rule__BorderDecoration__UnorderedGroup_3 ) ) ;
    public final void rule__BorderDecoration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2163:1: ( ( ( rule__BorderDecoration__UnorderedGroup_3 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2164:1: ( ( rule__BorderDecoration__UnorderedGroup_3 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2164:1: ( ( rule__BorderDecoration__UnorderedGroup_3 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2165:1: ( rule__BorderDecoration__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2166:1: ( rule__BorderDecoration__UnorderedGroup_3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2166:2: rule__BorderDecoration__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3_in_rule__BorderDecoration__Group__3__Impl4616);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2176:1: rule__BorderDecoration__Group__4 : rule__BorderDecoration__Group__4__Impl ;
    public final void rule__BorderDecoration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2180:1: ( rule__BorderDecoration__Group__4__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2181:2: rule__BorderDecoration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__4__Impl_in_rule__BorderDecoration__Group__44646);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2187:1: rule__BorderDecoration__Group__4__Impl : ( '}' ) ;
    public final void rule__BorderDecoration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2191:1: ( ( '}' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2192:1: ( '}' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2192:1: ( '}' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2193:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,53,FOLLOW_53_in_rule__BorderDecoration__Group__4__Impl4674); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2216:1: rule__BorderDecoration__Group_3_1__0 : rule__BorderDecoration__Group_3_1__0__Impl rule__BorderDecoration__Group_3_1__1 ;
    public final void rule__BorderDecoration__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2220:1: ( rule__BorderDecoration__Group_3_1__0__Impl rule__BorderDecoration__Group_3_1__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2221:2: rule__BorderDecoration__Group_3_1__0__Impl rule__BorderDecoration__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group_3_1__0__Impl_in_rule__BorderDecoration__Group_3_1__04715);
            rule__BorderDecoration__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BorderDecoration__Group_3_1__1_in_rule__BorderDecoration__Group_3_1__04718);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2228:1: rule__BorderDecoration__Group_3_1__0__Impl : ( 'color' ) ;
    public final void rule__BorderDecoration__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2232:1: ( ( 'color' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2233:1: ( 'color' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2233:1: ( 'color' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2234:1: 'color'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getColorKeyword_3_1_0()); 
            }
            match(input,59,FOLLOW_59_in_rule__BorderDecoration__Group_3_1__0__Impl4746); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2247:1: rule__BorderDecoration__Group_3_1__1 : rule__BorderDecoration__Group_3_1__1__Impl rule__BorderDecoration__Group_3_1__2 ;
    public final void rule__BorderDecoration__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2251:1: ( rule__BorderDecoration__Group_3_1__1__Impl rule__BorderDecoration__Group_3_1__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2252:2: rule__BorderDecoration__Group_3_1__1__Impl rule__BorderDecoration__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group_3_1__1__Impl_in_rule__BorderDecoration__Group_3_1__14777);
            rule__BorderDecoration__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BorderDecoration__Group_3_1__2_in_rule__BorderDecoration__Group_3_1__14780);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2259:1: rule__BorderDecoration__Group_3_1__1__Impl : ( '=' ) ;
    public final void rule__BorderDecoration__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2263:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2264:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2264:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2265:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getEqualsSignKeyword_3_1_1()); 
            }
            match(input,56,FOLLOW_56_in_rule__BorderDecoration__Group_3_1__1__Impl4808); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2278:1: rule__BorderDecoration__Group_3_1__2 : rule__BorderDecoration__Group_3_1__2__Impl ;
    public final void rule__BorderDecoration__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2282:1: ( rule__BorderDecoration__Group_3_1__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2283:2: rule__BorderDecoration__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group_3_1__2__Impl_in_rule__BorderDecoration__Group_3_1__24839);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2289:1: rule__BorderDecoration__Group_3_1__2__Impl : ( ( rule__BorderDecoration__ColorAssignment_3_1_2 ) ) ;
    public final void rule__BorderDecoration__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2293:1: ( ( ( rule__BorderDecoration__ColorAssignment_3_1_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2294:1: ( ( rule__BorderDecoration__ColorAssignment_3_1_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2294:1: ( ( rule__BorderDecoration__ColorAssignment_3_1_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2295:1: ( rule__BorderDecoration__ColorAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getColorAssignment_3_1_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2296:1: ( rule__BorderDecoration__ColorAssignment_3_1_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2296:2: rule__BorderDecoration__ColorAssignment_3_1_2
            {
            pushFollow(FOLLOW_rule__BorderDecoration__ColorAssignment_3_1_2_in_rule__BorderDecoration__Group_3_1__2__Impl4866);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2312:1: rule__ColorDecoration__Group__0 : rule__ColorDecoration__Group__0__Impl rule__ColorDecoration__Group__1 ;
    public final void rule__ColorDecoration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2316:1: ( rule__ColorDecoration__Group__0__Impl rule__ColorDecoration__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2317:2: rule__ColorDecoration__Group__0__Impl rule__ColorDecoration__Group__1
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group__0__Impl_in_rule__ColorDecoration__Group__04902);
            rule__ColorDecoration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group__1_in_rule__ColorDecoration__Group__04905);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2324:1: rule__ColorDecoration__Group__0__Impl : ( () ) ;
    public final void rule__ColorDecoration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2328:1: ( ( () ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2329:1: ( () )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2329:1: ( () )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2330:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getColorDecorationAction_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2331:1: ()
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2333:1: 
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2343:1: rule__ColorDecoration__Group__1 : rule__ColorDecoration__Group__1__Impl rule__ColorDecoration__Group__2 ;
    public final void rule__ColorDecoration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2347:1: ( rule__ColorDecoration__Group__1__Impl rule__ColorDecoration__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2348:2: rule__ColorDecoration__Group__1__Impl rule__ColorDecoration__Group__2
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group__1__Impl_in_rule__ColorDecoration__Group__14963);
            rule__ColorDecoration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group__2_in_rule__ColorDecoration__Group__14966);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2355:1: rule__ColorDecoration__Group__1__Impl : ( 'color' ) ;
    public final void rule__ColorDecoration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2359:1: ( ( 'color' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2360:1: ( 'color' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2360:1: ( 'color' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2361:1: 'color'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getColorKeyword_1()); 
            }
            match(input,59,FOLLOW_59_in_rule__ColorDecoration__Group__1__Impl4994); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2374:1: rule__ColorDecoration__Group__2 : rule__ColorDecoration__Group__2__Impl rule__ColorDecoration__Group__3 ;
    public final void rule__ColorDecoration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2378:1: ( rule__ColorDecoration__Group__2__Impl rule__ColorDecoration__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2379:2: rule__ColorDecoration__Group__2__Impl rule__ColorDecoration__Group__3
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group__2__Impl_in_rule__ColorDecoration__Group__25025);
            rule__ColorDecoration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group__3_in_rule__ColorDecoration__Group__25028);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2386:1: rule__ColorDecoration__Group__2__Impl : ( '{' ) ;
    public final void rule__ColorDecoration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2390:1: ( ( '{' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2391:1: ( '{' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2391:1: ( '{' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2392:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,52,FOLLOW_52_in_rule__ColorDecoration__Group__2__Impl5056); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2405:1: rule__ColorDecoration__Group__3 : rule__ColorDecoration__Group__3__Impl rule__ColorDecoration__Group__4 ;
    public final void rule__ColorDecoration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2409:1: ( rule__ColorDecoration__Group__3__Impl rule__ColorDecoration__Group__4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2410:2: rule__ColorDecoration__Group__3__Impl rule__ColorDecoration__Group__4
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group__3__Impl_in_rule__ColorDecoration__Group__35087);
            rule__ColorDecoration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group__4_in_rule__ColorDecoration__Group__35090);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2417:1: rule__ColorDecoration__Group__3__Impl : ( ( rule__ColorDecoration__UnorderedGroup_3 ) ) ;
    public final void rule__ColorDecoration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2421:1: ( ( ( rule__ColorDecoration__UnorderedGroup_3 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2422:1: ( ( rule__ColorDecoration__UnorderedGroup_3 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2422:1: ( ( rule__ColorDecoration__UnorderedGroup_3 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2423:1: ( rule__ColorDecoration__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2424:1: ( rule__ColorDecoration__UnorderedGroup_3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2424:2: rule__ColorDecoration__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__ColorDecoration__UnorderedGroup_3_in_rule__ColorDecoration__Group__3__Impl5117);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2434:1: rule__ColorDecoration__Group__4 : rule__ColorDecoration__Group__4__Impl ;
    public final void rule__ColorDecoration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2438:1: ( rule__ColorDecoration__Group__4__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2439:2: rule__ColorDecoration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group__4__Impl_in_rule__ColorDecoration__Group__45147);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2445:1: rule__ColorDecoration__Group__4__Impl : ( '}' ) ;
    public final void rule__ColorDecoration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2449:1: ( ( '}' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2450:1: ( '}' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2450:1: ( '}' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2451:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,53,FOLLOW_53_in_rule__ColorDecoration__Group__4__Impl5175); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2474:1: rule__ColorDecoration__Group_3_0__0 : rule__ColorDecoration__Group_3_0__0__Impl rule__ColorDecoration__Group_3_0__1 ;
    public final void rule__ColorDecoration__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2478:1: ( rule__ColorDecoration__Group_3_0__0__Impl rule__ColorDecoration__Group_3_0__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2479:2: rule__ColorDecoration__Group_3_0__0__Impl rule__ColorDecoration__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_0__0__Impl_in_rule__ColorDecoration__Group_3_0__05216);
            rule__ColorDecoration__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_0__1_in_rule__ColorDecoration__Group_3_0__05219);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2486:1: rule__ColorDecoration__Group_3_0__0__Impl : ( 'background' ) ;
    public final void rule__ColorDecoration__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2490:1: ( ( 'background' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2491:1: ( 'background' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2491:1: ( 'background' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2492:1: 'background'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getBackgroundKeyword_3_0_0()); 
            }
            match(input,60,FOLLOW_60_in_rule__ColorDecoration__Group_3_0__0__Impl5247); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2505:1: rule__ColorDecoration__Group_3_0__1 : rule__ColorDecoration__Group_3_0__1__Impl rule__ColorDecoration__Group_3_0__2 ;
    public final void rule__ColorDecoration__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2509:1: ( rule__ColorDecoration__Group_3_0__1__Impl rule__ColorDecoration__Group_3_0__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2510:2: rule__ColorDecoration__Group_3_0__1__Impl rule__ColorDecoration__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_0__1__Impl_in_rule__ColorDecoration__Group_3_0__15278);
            rule__ColorDecoration__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_0__2_in_rule__ColorDecoration__Group_3_0__15281);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2517:1: rule__ColorDecoration__Group_3_0__1__Impl : ( '=' ) ;
    public final void rule__ColorDecoration__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2521:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2522:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2522:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2523:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getEqualsSignKeyword_3_0_1()); 
            }
            match(input,56,FOLLOW_56_in_rule__ColorDecoration__Group_3_0__1__Impl5309); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2536:1: rule__ColorDecoration__Group_3_0__2 : rule__ColorDecoration__Group_3_0__2__Impl ;
    public final void rule__ColorDecoration__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2540:1: ( rule__ColorDecoration__Group_3_0__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2541:2: rule__ColorDecoration__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_0__2__Impl_in_rule__ColorDecoration__Group_3_0__25340);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2547:1: rule__ColorDecoration__Group_3_0__2__Impl : ( ( rule__ColorDecoration__BackgroundAssignment_3_0_2 ) ) ;
    public final void rule__ColorDecoration__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2551:1: ( ( ( rule__ColorDecoration__BackgroundAssignment_3_0_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2552:1: ( ( rule__ColorDecoration__BackgroundAssignment_3_0_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2552:1: ( ( rule__ColorDecoration__BackgroundAssignment_3_0_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2553:1: ( rule__ColorDecoration__BackgroundAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getBackgroundAssignment_3_0_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2554:1: ( rule__ColorDecoration__BackgroundAssignment_3_0_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2554:2: rule__ColorDecoration__BackgroundAssignment_3_0_2
            {
            pushFollow(FOLLOW_rule__ColorDecoration__BackgroundAssignment_3_0_2_in_rule__ColorDecoration__Group_3_0__2__Impl5367);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2570:1: rule__ColorDecoration__Group_3_1__0 : rule__ColorDecoration__Group_3_1__0__Impl rule__ColorDecoration__Group_3_1__1 ;
    public final void rule__ColorDecoration__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2574:1: ( rule__ColorDecoration__Group_3_1__0__Impl rule__ColorDecoration__Group_3_1__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2575:2: rule__ColorDecoration__Group_3_1__0__Impl rule__ColorDecoration__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_1__0__Impl_in_rule__ColorDecoration__Group_3_1__05403);
            rule__ColorDecoration__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_1__1_in_rule__ColorDecoration__Group_3_1__05406);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2582:1: rule__ColorDecoration__Group_3_1__0__Impl : ( 'foreground' ) ;
    public final void rule__ColorDecoration__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2586:1: ( ( 'foreground' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2587:1: ( 'foreground' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2587:1: ( 'foreground' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2588:1: 'foreground'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getForegroundKeyword_3_1_0()); 
            }
            match(input,61,FOLLOW_61_in_rule__ColorDecoration__Group_3_1__0__Impl5434); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2601:1: rule__ColorDecoration__Group_3_1__1 : rule__ColorDecoration__Group_3_1__1__Impl rule__ColorDecoration__Group_3_1__2 ;
    public final void rule__ColorDecoration__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2605:1: ( rule__ColorDecoration__Group_3_1__1__Impl rule__ColorDecoration__Group_3_1__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2606:2: rule__ColorDecoration__Group_3_1__1__Impl rule__ColorDecoration__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_1__1__Impl_in_rule__ColorDecoration__Group_3_1__15465);
            rule__ColorDecoration__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_1__2_in_rule__ColorDecoration__Group_3_1__15468);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2613:1: rule__ColorDecoration__Group_3_1__1__Impl : ( '=' ) ;
    public final void rule__ColorDecoration__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2617:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2618:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2618:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2619:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getEqualsSignKeyword_3_1_1()); 
            }
            match(input,56,FOLLOW_56_in_rule__ColorDecoration__Group_3_1__1__Impl5496); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2632:1: rule__ColorDecoration__Group_3_1__2 : rule__ColorDecoration__Group_3_1__2__Impl ;
    public final void rule__ColorDecoration__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2636:1: ( rule__ColorDecoration__Group_3_1__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2637:2: rule__ColorDecoration__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_1__2__Impl_in_rule__ColorDecoration__Group_3_1__25527);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2643:1: rule__ColorDecoration__Group_3_1__2__Impl : ( ( rule__ColorDecoration__ForegroundAssignment_3_1_2 ) ) ;
    public final void rule__ColorDecoration__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2647:1: ( ( ( rule__ColorDecoration__ForegroundAssignment_3_1_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2648:1: ( ( rule__ColorDecoration__ForegroundAssignment_3_1_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2648:1: ( ( rule__ColorDecoration__ForegroundAssignment_3_1_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2649:1: ( rule__ColorDecoration__ForegroundAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getForegroundAssignment_3_1_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2650:1: ( rule__ColorDecoration__ForegroundAssignment_3_1_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2650:2: rule__ColorDecoration__ForegroundAssignment_3_1_2
            {
            pushFollow(FOLLOW_rule__ColorDecoration__ForegroundAssignment_3_1_2_in_rule__ColorDecoration__Group_3_1__2__Impl5554);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2666:1: rule__ConnectionDecoration__Group__0 : rule__ConnectionDecoration__Group__0__Impl rule__ConnectionDecoration__Group__1 ;
    public final void rule__ConnectionDecoration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2670:1: ( rule__ConnectionDecoration__Group__0__Impl rule__ConnectionDecoration__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2671:2: rule__ConnectionDecoration__Group__0__Impl rule__ConnectionDecoration__Group__1
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__0__Impl_in_rule__ConnectionDecoration__Group__05590);
            rule__ConnectionDecoration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__1_in_rule__ConnectionDecoration__Group__05593);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2678:1: rule__ConnectionDecoration__Group__0__Impl : ( () ) ;
    public final void rule__ConnectionDecoration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2682:1: ( ( () ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2683:1: ( () )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2683:1: ( () )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2684:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getConnectionDecorationAction_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2685:1: ()
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2687:1: 
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2697:1: rule__ConnectionDecoration__Group__1 : rule__ConnectionDecoration__Group__1__Impl rule__ConnectionDecoration__Group__2 ;
    public final void rule__ConnectionDecoration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2701:1: ( rule__ConnectionDecoration__Group__1__Impl rule__ConnectionDecoration__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2702:2: rule__ConnectionDecoration__Group__1__Impl rule__ConnectionDecoration__Group__2
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__1__Impl_in_rule__ConnectionDecoration__Group__15651);
            rule__ConnectionDecoration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__2_in_rule__ConnectionDecoration__Group__15654);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2709:1: rule__ConnectionDecoration__Group__1__Impl : ( 'connection' ) ;
    public final void rule__ConnectionDecoration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2713:1: ( ( 'connection' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2714:1: ( 'connection' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2714:1: ( 'connection' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2715:1: 'connection'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getConnectionKeyword_1()); 
            }
            match(input,62,FOLLOW_62_in_rule__ConnectionDecoration__Group__1__Impl5682); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2728:1: rule__ConnectionDecoration__Group__2 : rule__ConnectionDecoration__Group__2__Impl rule__ConnectionDecoration__Group__3 ;
    public final void rule__ConnectionDecoration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2732:1: ( rule__ConnectionDecoration__Group__2__Impl rule__ConnectionDecoration__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2733:2: rule__ConnectionDecoration__Group__2__Impl rule__ConnectionDecoration__Group__3
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__2__Impl_in_rule__ConnectionDecoration__Group__25713);
            rule__ConnectionDecoration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__3_in_rule__ConnectionDecoration__Group__25716);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2740:1: rule__ConnectionDecoration__Group__2__Impl : ( '{' ) ;
    public final void rule__ConnectionDecoration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2744:1: ( ( '{' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2745:1: ( '{' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2745:1: ( '{' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2746:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,52,FOLLOW_52_in_rule__ConnectionDecoration__Group__2__Impl5744); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2759:1: rule__ConnectionDecoration__Group__3 : rule__ConnectionDecoration__Group__3__Impl rule__ConnectionDecoration__Group__4 ;
    public final void rule__ConnectionDecoration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2763:1: ( rule__ConnectionDecoration__Group__3__Impl rule__ConnectionDecoration__Group__4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2764:2: rule__ConnectionDecoration__Group__3__Impl rule__ConnectionDecoration__Group__4
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__3__Impl_in_rule__ConnectionDecoration__Group__35775);
            rule__ConnectionDecoration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__4_in_rule__ConnectionDecoration__Group__35778);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2771:1: rule__ConnectionDecoration__Group__3__Impl : ( ( rule__ConnectionDecoration__UnorderedGroup_3 ) ) ;
    public final void rule__ConnectionDecoration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2775:1: ( ( ( rule__ConnectionDecoration__UnorderedGroup_3 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2776:1: ( ( rule__ConnectionDecoration__UnorderedGroup_3 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2776:1: ( ( rule__ConnectionDecoration__UnorderedGroup_3 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2777:1: ( rule__ConnectionDecoration__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2778:1: ( rule__ConnectionDecoration__UnorderedGroup_3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2778:2: rule__ConnectionDecoration__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3_in_rule__ConnectionDecoration__Group__3__Impl5805);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2788:1: rule__ConnectionDecoration__Group__4 : rule__ConnectionDecoration__Group__4__Impl ;
    public final void rule__ConnectionDecoration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2792:1: ( rule__ConnectionDecoration__Group__4__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2793:2: rule__ConnectionDecoration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__4__Impl_in_rule__ConnectionDecoration__Group__45835);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2799:1: rule__ConnectionDecoration__Group__4__Impl : ( '}' ) ;
    public final void rule__ConnectionDecoration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2803:1: ( ( '}' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2804:1: ( '}' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2804:1: ( '}' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2805:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,53,FOLLOW_53_in_rule__ConnectionDecoration__Group__4__Impl5863); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2828:1: rule__ConnectionDecoration__Group_3_2__0 : rule__ConnectionDecoration__Group_3_2__0__Impl rule__ConnectionDecoration__Group_3_2__1 ;
    public final void rule__ConnectionDecoration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2832:1: ( rule__ConnectionDecoration__Group_3_2__0__Impl rule__ConnectionDecoration__Group_3_2__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2833:2: rule__ConnectionDecoration__Group_3_2__0__Impl rule__ConnectionDecoration__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_2__0__Impl_in_rule__ConnectionDecoration__Group_3_2__05904);
            rule__ConnectionDecoration__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_2__1_in_rule__ConnectionDecoration__Group_3_2__05907);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2840:1: rule__ConnectionDecoration__Group_3_2__0__Impl : ( 'foreground-color' ) ;
    public final void rule__ConnectionDecoration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2844:1: ( ( 'foreground-color' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2845:1: ( 'foreground-color' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2845:1: ( 'foreground-color' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2846:1: 'foreground-color'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getForegroundColorKeyword_3_2_0()); 
            }
            match(input,63,FOLLOW_63_in_rule__ConnectionDecoration__Group_3_2__0__Impl5935); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2859:1: rule__ConnectionDecoration__Group_3_2__1 : rule__ConnectionDecoration__Group_3_2__1__Impl rule__ConnectionDecoration__Group_3_2__2 ;
    public final void rule__ConnectionDecoration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2863:1: ( rule__ConnectionDecoration__Group_3_2__1__Impl rule__ConnectionDecoration__Group_3_2__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2864:2: rule__ConnectionDecoration__Group_3_2__1__Impl rule__ConnectionDecoration__Group_3_2__2
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_2__1__Impl_in_rule__ConnectionDecoration__Group_3_2__15966);
            rule__ConnectionDecoration__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_2__2_in_rule__ConnectionDecoration__Group_3_2__15969);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2871:1: rule__ConnectionDecoration__Group_3_2__1__Impl : ( '=' ) ;
    public final void rule__ConnectionDecoration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2875:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2876:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2876:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2877:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getEqualsSignKeyword_3_2_1()); 
            }
            match(input,56,FOLLOW_56_in_rule__ConnectionDecoration__Group_3_2__1__Impl5997); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2890:1: rule__ConnectionDecoration__Group_3_2__2 : rule__ConnectionDecoration__Group_3_2__2__Impl ;
    public final void rule__ConnectionDecoration__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2894:1: ( rule__ConnectionDecoration__Group_3_2__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2895:2: rule__ConnectionDecoration__Group_3_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_2__2__Impl_in_rule__ConnectionDecoration__Group_3_2__26028);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2901:1: rule__ConnectionDecoration__Group_3_2__2__Impl : ( ( rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2 ) ) ;
    public final void rule__ConnectionDecoration__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2905:1: ( ( ( rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2906:1: ( ( rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2906:1: ( ( rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2907:1: ( rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getForegroundColorAssignment_3_2_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2908:1: ( rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2908:2: rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2_in_rule__ConnectionDecoration__Group_3_2__2__Impl6055);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2924:1: rule__ConnectionDecoration__Group_3_3__0 : rule__ConnectionDecoration__Group_3_3__0__Impl rule__ConnectionDecoration__Group_3_3__1 ;
    public final void rule__ConnectionDecoration__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2928:1: ( rule__ConnectionDecoration__Group_3_3__0__Impl rule__ConnectionDecoration__Group_3_3__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2929:2: rule__ConnectionDecoration__Group_3_3__0__Impl rule__ConnectionDecoration__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_3__0__Impl_in_rule__ConnectionDecoration__Group_3_3__06091);
            rule__ConnectionDecoration__Group_3_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_3__1_in_rule__ConnectionDecoration__Group_3_3__06094);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2936:1: rule__ConnectionDecoration__Group_3_3__0__Impl : ( 'background-color' ) ;
    public final void rule__ConnectionDecoration__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2940:1: ( ( 'background-color' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2941:1: ( 'background-color' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2941:1: ( 'background-color' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2942:1: 'background-color'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getBackgroundColorKeyword_3_3_0()); 
            }
            match(input,64,FOLLOW_64_in_rule__ConnectionDecoration__Group_3_3__0__Impl6122); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2955:1: rule__ConnectionDecoration__Group_3_3__1 : rule__ConnectionDecoration__Group_3_3__1__Impl rule__ConnectionDecoration__Group_3_3__2 ;
    public final void rule__ConnectionDecoration__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2959:1: ( rule__ConnectionDecoration__Group_3_3__1__Impl rule__ConnectionDecoration__Group_3_3__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2960:2: rule__ConnectionDecoration__Group_3_3__1__Impl rule__ConnectionDecoration__Group_3_3__2
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_3__1__Impl_in_rule__ConnectionDecoration__Group_3_3__16153);
            rule__ConnectionDecoration__Group_3_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_3__2_in_rule__ConnectionDecoration__Group_3_3__16156);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2967:1: rule__ConnectionDecoration__Group_3_3__1__Impl : ( '=' ) ;
    public final void rule__ConnectionDecoration__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2971:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2972:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2972:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2973:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getEqualsSignKeyword_3_3_1()); 
            }
            match(input,56,FOLLOW_56_in_rule__ConnectionDecoration__Group_3_3__1__Impl6184); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2986:1: rule__ConnectionDecoration__Group_3_3__2 : rule__ConnectionDecoration__Group_3_3__2__Impl ;
    public final void rule__ConnectionDecoration__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2990:1: ( rule__ConnectionDecoration__Group_3_3__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2991:2: rule__ConnectionDecoration__Group_3_3__2__Impl
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_3__2__Impl_in_rule__ConnectionDecoration__Group_3_3__26215);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2997:1: rule__ConnectionDecoration__Group_3_3__2__Impl : ( ( rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2 ) ) ;
    public final void rule__ConnectionDecoration__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3001:1: ( ( ( rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3002:1: ( ( rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3002:1: ( ( rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3003:1: ( rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getBackgroundColorAssignment_3_3_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3004:1: ( rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3004:2: rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2_in_rule__ConnectionDecoration__Group_3_3__2__Impl6242);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3020:1: rule__ComplexText__Group__0 : rule__ComplexText__Group__0__Impl rule__ComplexText__Group__1 ;
    public final void rule__ComplexText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3024:1: ( rule__ComplexText__Group__0__Impl rule__ComplexText__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3025:2: rule__ComplexText__Group__0__Impl rule__ComplexText__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexText__Group__0__Impl_in_rule__ComplexText__Group__06278);
            rule__ComplexText__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ComplexText__Group__1_in_rule__ComplexText__Group__06281);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3032:1: rule__ComplexText__Group__0__Impl : ( ( rule__ComplexText__LeftAssignment_0 ) ) ;
    public final void rule__ComplexText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3036:1: ( ( ( rule__ComplexText__LeftAssignment_0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3037:1: ( ( rule__ComplexText__LeftAssignment_0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3037:1: ( ( rule__ComplexText__LeftAssignment_0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3038:1: ( rule__ComplexText__LeftAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTextAccess().getLeftAssignment_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3039:1: ( rule__ComplexText__LeftAssignment_0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3039:2: rule__ComplexText__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__ComplexText__LeftAssignment_0_in_rule__ComplexText__Group__0__Impl6308);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3049:1: rule__ComplexText__Group__1 : rule__ComplexText__Group__1__Impl rule__ComplexText__Group__2 ;
    public final void rule__ComplexText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3053:1: ( rule__ComplexText__Group__1__Impl rule__ComplexText__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3054:2: rule__ComplexText__Group__1__Impl rule__ComplexText__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexText__Group__1__Impl_in_rule__ComplexText__Group__16338);
            rule__ComplexText__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ComplexText__Group__2_in_rule__ComplexText__Group__16341);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3061:1: rule__ComplexText__Group__1__Impl : ( '+' ) ;
    public final void rule__ComplexText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3065:1: ( ( '+' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3066:1: ( '+' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3066:1: ( '+' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3067:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTextAccess().getPlusSignKeyword_1()); 
            }
            match(input,65,FOLLOW_65_in_rule__ComplexText__Group__1__Impl6369); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3080:1: rule__ComplexText__Group__2 : rule__ComplexText__Group__2__Impl ;
    public final void rule__ComplexText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3084:1: ( rule__ComplexText__Group__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3085:2: rule__ComplexText__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ComplexText__Group__2__Impl_in_rule__ComplexText__Group__26400);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3091:1: rule__ComplexText__Group__2__Impl : ( ( rule__ComplexText__RightAssignment_2 ) ) ;
    public final void rule__ComplexText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3095:1: ( ( ( rule__ComplexText__RightAssignment_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3096:1: ( ( rule__ComplexText__RightAssignment_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3096:1: ( ( rule__ComplexText__RightAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3097:1: ( rule__ComplexText__RightAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTextAccess().getRightAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3098:1: ( rule__ComplexText__RightAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3098:2: rule__ComplexText__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__ComplexText__RightAssignment_2_in_rule__ComplexText__Group__2__Impl6427);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3114:1: rule__Style__Group__0 : rule__Style__Group__0__Impl rule__Style__Group__1 ;
    public final void rule__Style__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3118:1: ( rule__Style__Group__0__Impl rule__Style__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3119:2: rule__Style__Group__0__Impl rule__Style__Group__1
            {
            pushFollow(FOLLOW_rule__Style__Group__0__Impl_in_rule__Style__Group__06463);
            rule__Style__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Style__Group__1_in_rule__Style__Group__06466);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3126:1: rule__Style__Group__0__Impl : ( 'line-style' ) ;
    public final void rule__Style__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3130:1: ( ( 'line-style' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3131:1: ( 'line-style' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3131:1: ( 'line-style' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3132:1: 'line-style'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleAccess().getLineStyleKeyword_0()); 
            }
            match(input,66,FOLLOW_66_in_rule__Style__Group__0__Impl6494); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3145:1: rule__Style__Group__1 : rule__Style__Group__1__Impl rule__Style__Group__2 ;
    public final void rule__Style__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3149:1: ( rule__Style__Group__1__Impl rule__Style__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3150:2: rule__Style__Group__1__Impl rule__Style__Group__2
            {
            pushFollow(FOLLOW_rule__Style__Group__1__Impl_in_rule__Style__Group__16525);
            rule__Style__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Style__Group__2_in_rule__Style__Group__16528);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3157:1: rule__Style__Group__1__Impl : ( '=' ) ;
    public final void rule__Style__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3161:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3162:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3162:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3163:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleAccess().getEqualsSignKeyword_1()); 
            }
            match(input,56,FOLLOW_56_in_rule__Style__Group__1__Impl6556); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3176:1: rule__Style__Group__2 : rule__Style__Group__2__Impl ;
    public final void rule__Style__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3180:1: ( rule__Style__Group__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3181:2: rule__Style__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Style__Group__2__Impl_in_rule__Style__Group__26587);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3187:1: rule__Style__Group__2__Impl : ( ( rule__Style__ValueAssignment_2 ) ) ;
    public final void rule__Style__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3191:1: ( ( ( rule__Style__ValueAssignment_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3192:1: ( ( rule__Style__ValueAssignment_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3192:1: ( ( rule__Style__ValueAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3193:1: ( rule__Style__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleAccess().getValueAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3194:1: ( rule__Style__ValueAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3194:2: rule__Style__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Style__ValueAssignment_2_in_rule__Style__Group__2__Impl6614);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3210:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3214:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3215:2: rule__Size__Group__0__Impl rule__Size__Group__1
            {
            pushFollow(FOLLOW_rule__Size__Group__0__Impl_in_rule__Size__Group__06650);
            rule__Size__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Size__Group__1_in_rule__Size__Group__06653);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3222:1: rule__Size__Group__0__Impl : ( 'size' ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3226:1: ( ( 'size' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3227:1: ( 'size' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3227:1: ( 'size' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3228:1: 'size'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getSizeKeyword_0()); 
            }
            match(input,67,FOLLOW_67_in_rule__Size__Group__0__Impl6681); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3241:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3245:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3246:2: rule__Size__Group__1__Impl rule__Size__Group__2
            {
            pushFollow(FOLLOW_rule__Size__Group__1__Impl_in_rule__Size__Group__16712);
            rule__Size__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Size__Group__2_in_rule__Size__Group__16715);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3253:1: rule__Size__Group__1__Impl : ( '=' ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3257:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3258:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3258:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3259:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getEqualsSignKeyword_1()); 
            }
            match(input,56,FOLLOW_56_in_rule__Size__Group__1__Impl6743); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3272:1: rule__Size__Group__2 : rule__Size__Group__2__Impl ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3276:1: ( rule__Size__Group__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3277:2: rule__Size__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Size__Group__2__Impl_in_rule__Size__Group__26774);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3283:1: rule__Size__Group__2__Impl : ( ( rule__Size__ValueAssignment_2 ) ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3287:1: ( ( ( rule__Size__ValueAssignment_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3288:1: ( ( rule__Size__ValueAssignment_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3288:1: ( ( rule__Size__ValueAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3289:1: ( rule__Size__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getValueAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3290:1: ( rule__Size__ValueAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3290:2: rule__Size__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Size__ValueAssignment_2_in_rule__Size__Group__2__Impl6801);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3306:1: rule__Direction__Group__0 : rule__Direction__Group__0__Impl rule__Direction__Group__1 ;
    public final void rule__Direction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3310:1: ( rule__Direction__Group__0__Impl rule__Direction__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3311:2: rule__Direction__Group__0__Impl rule__Direction__Group__1
            {
            pushFollow(FOLLOW_rule__Direction__Group__0__Impl_in_rule__Direction__Group__06837);
            rule__Direction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Direction__Group__1_in_rule__Direction__Group__06840);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3318:1: rule__Direction__Group__0__Impl : ( 'direction' ) ;
    public final void rule__Direction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3322:1: ( ( 'direction' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3323:1: ( 'direction' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3323:1: ( 'direction' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3324:1: 'direction'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectionAccess().getDirectionKeyword_0()); 
            }
            match(input,68,FOLLOW_68_in_rule__Direction__Group__0__Impl6868); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3337:1: rule__Direction__Group__1 : rule__Direction__Group__1__Impl rule__Direction__Group__2 ;
    public final void rule__Direction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3341:1: ( rule__Direction__Group__1__Impl rule__Direction__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3342:2: rule__Direction__Group__1__Impl rule__Direction__Group__2
            {
            pushFollow(FOLLOW_rule__Direction__Group__1__Impl_in_rule__Direction__Group__16899);
            rule__Direction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Direction__Group__2_in_rule__Direction__Group__16902);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3349:1: rule__Direction__Group__1__Impl : ( '=' ) ;
    public final void rule__Direction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3353:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3354:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3354:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3355:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,56,FOLLOW_56_in_rule__Direction__Group__1__Impl6930); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3368:1: rule__Direction__Group__2 : rule__Direction__Group__2__Impl ;
    public final void rule__Direction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3372:1: ( rule__Direction__Group__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3373:2: rule__Direction__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Direction__Group__2__Impl_in_rule__Direction__Group__26961);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3379:1: rule__Direction__Group__2__Impl : ( ( rule__Direction__ValueAssignment_2 ) ) ;
    public final void rule__Direction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3383:1: ( ( ( rule__Direction__ValueAssignment_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3384:1: ( ( rule__Direction__ValueAssignment_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3384:1: ( ( rule__Direction__ValueAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3385:1: ( rule__Direction__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectionAccess().getValueAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3386:1: ( rule__Direction__ValueAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3386:2: rule__Direction__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Direction__ValueAssignment_2_in_rule__Direction__Group__2__Impl6988);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3402:1: rule__Margin__Group__0 : rule__Margin__Group__0__Impl rule__Margin__Group__1 ;
    public final void rule__Margin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3406:1: ( rule__Margin__Group__0__Impl rule__Margin__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3407:2: rule__Margin__Group__0__Impl rule__Margin__Group__1
            {
            pushFollow(FOLLOW_rule__Margin__Group__0__Impl_in_rule__Margin__Group__07024);
            rule__Margin__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Margin__Group__1_in_rule__Margin__Group__07027);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3414:1: rule__Margin__Group__0__Impl : ( 'margin' ) ;
    public final void rule__Margin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3418:1: ( ( 'margin' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3419:1: ( 'margin' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3419:1: ( 'margin' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3420:1: 'margin'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarginAccess().getMarginKeyword_0()); 
            }
            match(input,69,FOLLOW_69_in_rule__Margin__Group__0__Impl7055); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3433:1: rule__Margin__Group__1 : rule__Margin__Group__1__Impl rule__Margin__Group__2 ;
    public final void rule__Margin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3437:1: ( rule__Margin__Group__1__Impl rule__Margin__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3438:2: rule__Margin__Group__1__Impl rule__Margin__Group__2
            {
            pushFollow(FOLLOW_rule__Margin__Group__1__Impl_in_rule__Margin__Group__17086);
            rule__Margin__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Margin__Group__2_in_rule__Margin__Group__17089);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3445:1: rule__Margin__Group__1__Impl : ( '=' ) ;
    public final void rule__Margin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3449:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3450:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3450:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3451:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarginAccess().getEqualsSignKeyword_1()); 
            }
            match(input,56,FOLLOW_56_in_rule__Margin__Group__1__Impl7117); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3464:1: rule__Margin__Group__2 : rule__Margin__Group__2__Impl ;
    public final void rule__Margin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3468:1: ( rule__Margin__Group__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3469:2: rule__Margin__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Margin__Group__2__Impl_in_rule__Margin__Group__27148);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3475:1: rule__Margin__Group__2__Impl : ( ( rule__Margin__ValueAssignment_2 ) ) ;
    public final void rule__Margin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3479:1: ( ( ( rule__Margin__ValueAssignment_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3480:1: ( ( rule__Margin__ValueAssignment_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3480:1: ( ( rule__Margin__ValueAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3481:1: ( rule__Margin__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarginAccess().getValueAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3482:1: ( rule__Margin__ValueAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3482:2: rule__Margin__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Margin__ValueAssignment_2_in_rule__Margin__Group__2__Impl7175);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3498:1: rule__Color__Group_0__0 : rule__Color__Group_0__0__Impl rule__Color__Group_0__1 ;
    public final void rule__Color__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3502:1: ( rule__Color__Group_0__0__Impl rule__Color__Group_0__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3503:2: rule__Color__Group_0__0__Impl rule__Color__Group_0__1
            {
            pushFollow(FOLLOW_rule__Color__Group_0__0__Impl_in_rule__Color__Group_0__07211);
            rule__Color__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Color__Group_0__1_in_rule__Color__Group_0__07214);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3510:1: rule__Color__Group_0__0__Impl : ( () ) ;
    public final void rule__Color__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3514:1: ( ( () ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3515:1: ( () )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3515:1: ( () )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3516:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getColorAction_0_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3517:1: ()
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3519:1: 
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3529:1: rule__Color__Group_0__1 : rule__Color__Group_0__1__Impl ;
    public final void rule__Color__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3533:1: ( rule__Color__Group_0__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3534:2: rule__Color__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Color__Group_0__1__Impl_in_rule__Color__Group_0__17272);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3540:1: rule__Color__Group_0__1__Impl : ( ( rule__Color__ValueAssignment_0_1 ) ) ;
    public final void rule__Color__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3544:1: ( ( ( rule__Color__ValueAssignment_0_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3545:1: ( ( rule__Color__ValueAssignment_0_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3545:1: ( ( rule__Color__ValueAssignment_0_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3546:1: ( rule__Color__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getValueAssignment_0_1()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3547:1: ( rule__Color__ValueAssignment_0_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3547:2: rule__Color__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Color__ValueAssignment_0_1_in_rule__Color__Group_0__1__Impl7299);
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


    // $ANTLR start "rule__ConcreteColor__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3561:1: rule__ConcreteColor__Group__0 : rule__ConcreteColor__Group__0__Impl rule__ConcreteColor__Group__1 ;
    public final void rule__ConcreteColor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3565:1: ( rule__ConcreteColor__Group__0__Impl rule__ConcreteColor__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3566:2: rule__ConcreteColor__Group__0__Impl rule__ConcreteColor__Group__1
            {
            pushFollow(FOLLOW_rule__ConcreteColor__Group__0__Impl_in_rule__ConcreteColor__Group__07333);
            rule__ConcreteColor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConcreteColor__Group__1_in_rule__ConcreteColor__Group__07336);
            rule__ConcreteColor__Group__1();

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
    // $ANTLR end "rule__ConcreteColor__Group__0"


    // $ANTLR start "rule__ConcreteColor__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3573:1: rule__ConcreteColor__Group__0__Impl : ( 'RGB' ) ;
    public final void rule__ConcreteColor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3577:1: ( ( 'RGB' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3578:1: ( 'RGB' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3578:1: ( 'RGB' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3579:1: 'RGB'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getRGBKeyword_0()); 
            }
            match(input,70,FOLLOW_70_in_rule__ConcreteColor__Group__0__Impl7364); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcreteColorAccess().getRGBKeyword_0()); 
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
    // $ANTLR end "rule__ConcreteColor__Group__0__Impl"


    // $ANTLR start "rule__ConcreteColor__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3592:1: rule__ConcreteColor__Group__1 : rule__ConcreteColor__Group__1__Impl rule__ConcreteColor__Group__2 ;
    public final void rule__ConcreteColor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3596:1: ( rule__ConcreteColor__Group__1__Impl rule__ConcreteColor__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3597:2: rule__ConcreteColor__Group__1__Impl rule__ConcreteColor__Group__2
            {
            pushFollow(FOLLOW_rule__ConcreteColor__Group__1__Impl_in_rule__ConcreteColor__Group__17395);
            rule__ConcreteColor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConcreteColor__Group__2_in_rule__ConcreteColor__Group__17398);
            rule__ConcreteColor__Group__2();

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
    // $ANTLR end "rule__ConcreteColor__Group__1"


    // $ANTLR start "rule__ConcreteColor__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3604:1: rule__ConcreteColor__Group__1__Impl : ( '(' ) ;
    public final void rule__ConcreteColor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3608:1: ( ( '(' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3609:1: ( '(' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3609:1: ( '(' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3610:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,71,FOLLOW_71_in_rule__ConcreteColor__Group__1__Impl7426); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcreteColorAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__ConcreteColor__Group__1__Impl"


    // $ANTLR start "rule__ConcreteColor__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3623:1: rule__ConcreteColor__Group__2 : rule__ConcreteColor__Group__2__Impl rule__ConcreteColor__Group__3 ;
    public final void rule__ConcreteColor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3627:1: ( rule__ConcreteColor__Group__2__Impl rule__ConcreteColor__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3628:2: rule__ConcreteColor__Group__2__Impl rule__ConcreteColor__Group__3
            {
            pushFollow(FOLLOW_rule__ConcreteColor__Group__2__Impl_in_rule__ConcreteColor__Group__27457);
            rule__ConcreteColor__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConcreteColor__Group__3_in_rule__ConcreteColor__Group__27460);
            rule__ConcreteColor__Group__3();

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
    // $ANTLR end "rule__ConcreteColor__Group__2"


    // $ANTLR start "rule__ConcreteColor__Group__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3635:1: rule__ConcreteColor__Group__2__Impl : ( ( rule__ConcreteColor__RedAssignment_2 ) ) ;
    public final void rule__ConcreteColor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3639:1: ( ( ( rule__ConcreteColor__RedAssignment_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3640:1: ( ( rule__ConcreteColor__RedAssignment_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3640:1: ( ( rule__ConcreteColor__RedAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3641:1: ( rule__ConcreteColor__RedAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getRedAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3642:1: ( rule__ConcreteColor__RedAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3642:2: rule__ConcreteColor__RedAssignment_2
            {
            pushFollow(FOLLOW_rule__ConcreteColor__RedAssignment_2_in_rule__ConcreteColor__Group__2__Impl7487);
            rule__ConcreteColor__RedAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcreteColorAccess().getRedAssignment_2()); 
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
    // $ANTLR end "rule__ConcreteColor__Group__2__Impl"


    // $ANTLR start "rule__ConcreteColor__Group__3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3652:1: rule__ConcreteColor__Group__3 : rule__ConcreteColor__Group__3__Impl rule__ConcreteColor__Group__4 ;
    public final void rule__ConcreteColor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3656:1: ( rule__ConcreteColor__Group__3__Impl rule__ConcreteColor__Group__4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3657:2: rule__ConcreteColor__Group__3__Impl rule__ConcreteColor__Group__4
            {
            pushFollow(FOLLOW_rule__ConcreteColor__Group__3__Impl_in_rule__ConcreteColor__Group__37517);
            rule__ConcreteColor__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConcreteColor__Group__4_in_rule__ConcreteColor__Group__37520);
            rule__ConcreteColor__Group__4();

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
    // $ANTLR end "rule__ConcreteColor__Group__3"


    // $ANTLR start "rule__ConcreteColor__Group__3__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3664:1: rule__ConcreteColor__Group__3__Impl : ( ',' ) ;
    public final void rule__ConcreteColor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3668:1: ( ( ',' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3669:1: ( ',' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3669:1: ( ',' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3670:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getCommaKeyword_3()); 
            }
            match(input,72,FOLLOW_72_in_rule__ConcreteColor__Group__3__Impl7548); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcreteColorAccess().getCommaKeyword_3()); 
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
    // $ANTLR end "rule__ConcreteColor__Group__3__Impl"


    // $ANTLR start "rule__ConcreteColor__Group__4"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3683:1: rule__ConcreteColor__Group__4 : rule__ConcreteColor__Group__4__Impl rule__ConcreteColor__Group__5 ;
    public final void rule__ConcreteColor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3687:1: ( rule__ConcreteColor__Group__4__Impl rule__ConcreteColor__Group__5 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3688:2: rule__ConcreteColor__Group__4__Impl rule__ConcreteColor__Group__5
            {
            pushFollow(FOLLOW_rule__ConcreteColor__Group__4__Impl_in_rule__ConcreteColor__Group__47579);
            rule__ConcreteColor__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConcreteColor__Group__5_in_rule__ConcreteColor__Group__47582);
            rule__ConcreteColor__Group__5();

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
    // $ANTLR end "rule__ConcreteColor__Group__4"


    // $ANTLR start "rule__ConcreteColor__Group__4__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3695:1: rule__ConcreteColor__Group__4__Impl : ( ( rule__ConcreteColor__GreenAssignment_4 ) ) ;
    public final void rule__ConcreteColor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3699:1: ( ( ( rule__ConcreteColor__GreenAssignment_4 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3700:1: ( ( rule__ConcreteColor__GreenAssignment_4 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3700:1: ( ( rule__ConcreteColor__GreenAssignment_4 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3701:1: ( rule__ConcreteColor__GreenAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getGreenAssignment_4()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3702:1: ( rule__ConcreteColor__GreenAssignment_4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3702:2: rule__ConcreteColor__GreenAssignment_4
            {
            pushFollow(FOLLOW_rule__ConcreteColor__GreenAssignment_4_in_rule__ConcreteColor__Group__4__Impl7609);
            rule__ConcreteColor__GreenAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcreteColorAccess().getGreenAssignment_4()); 
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
    // $ANTLR end "rule__ConcreteColor__Group__4__Impl"


    // $ANTLR start "rule__ConcreteColor__Group__5"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3712:1: rule__ConcreteColor__Group__5 : rule__ConcreteColor__Group__5__Impl rule__ConcreteColor__Group__6 ;
    public final void rule__ConcreteColor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3716:1: ( rule__ConcreteColor__Group__5__Impl rule__ConcreteColor__Group__6 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3717:2: rule__ConcreteColor__Group__5__Impl rule__ConcreteColor__Group__6
            {
            pushFollow(FOLLOW_rule__ConcreteColor__Group__5__Impl_in_rule__ConcreteColor__Group__57639);
            rule__ConcreteColor__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConcreteColor__Group__6_in_rule__ConcreteColor__Group__57642);
            rule__ConcreteColor__Group__6();

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
    // $ANTLR end "rule__ConcreteColor__Group__5"


    // $ANTLR start "rule__ConcreteColor__Group__5__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3724:1: rule__ConcreteColor__Group__5__Impl : ( ',' ) ;
    public final void rule__ConcreteColor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3728:1: ( ( ',' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3729:1: ( ',' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3729:1: ( ',' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3730:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getCommaKeyword_5()); 
            }
            match(input,72,FOLLOW_72_in_rule__ConcreteColor__Group__5__Impl7670); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcreteColorAccess().getCommaKeyword_5()); 
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
    // $ANTLR end "rule__ConcreteColor__Group__5__Impl"


    // $ANTLR start "rule__ConcreteColor__Group__6"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3743:1: rule__ConcreteColor__Group__6 : rule__ConcreteColor__Group__6__Impl rule__ConcreteColor__Group__7 ;
    public final void rule__ConcreteColor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3747:1: ( rule__ConcreteColor__Group__6__Impl rule__ConcreteColor__Group__7 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3748:2: rule__ConcreteColor__Group__6__Impl rule__ConcreteColor__Group__7
            {
            pushFollow(FOLLOW_rule__ConcreteColor__Group__6__Impl_in_rule__ConcreteColor__Group__67701);
            rule__ConcreteColor__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConcreteColor__Group__7_in_rule__ConcreteColor__Group__67704);
            rule__ConcreteColor__Group__7();

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
    // $ANTLR end "rule__ConcreteColor__Group__6"


    // $ANTLR start "rule__ConcreteColor__Group__6__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3755:1: rule__ConcreteColor__Group__6__Impl : ( ( rule__ConcreteColor__BlueAssignment_6 ) ) ;
    public final void rule__ConcreteColor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3759:1: ( ( ( rule__ConcreteColor__BlueAssignment_6 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3760:1: ( ( rule__ConcreteColor__BlueAssignment_6 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3760:1: ( ( rule__ConcreteColor__BlueAssignment_6 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3761:1: ( rule__ConcreteColor__BlueAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getBlueAssignment_6()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3762:1: ( rule__ConcreteColor__BlueAssignment_6 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3762:2: rule__ConcreteColor__BlueAssignment_6
            {
            pushFollow(FOLLOW_rule__ConcreteColor__BlueAssignment_6_in_rule__ConcreteColor__Group__6__Impl7731);
            rule__ConcreteColor__BlueAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcreteColorAccess().getBlueAssignment_6()); 
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
    // $ANTLR end "rule__ConcreteColor__Group__6__Impl"


    // $ANTLR start "rule__ConcreteColor__Group__7"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3772:1: rule__ConcreteColor__Group__7 : rule__ConcreteColor__Group__7__Impl ;
    public final void rule__ConcreteColor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3776:1: ( rule__ConcreteColor__Group__7__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3777:2: rule__ConcreteColor__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ConcreteColor__Group__7__Impl_in_rule__ConcreteColor__Group__77761);
            rule__ConcreteColor__Group__7__Impl();

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
    // $ANTLR end "rule__ConcreteColor__Group__7"


    // $ANTLR start "rule__ConcreteColor__Group__7__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3783:1: rule__ConcreteColor__Group__7__Impl : ( ')' ) ;
    public final void rule__ConcreteColor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3787:1: ( ( ')' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3788:1: ( ')' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3788:1: ( ')' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3789:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,73,FOLLOW_73_in_rule__ConcreteColor__Group__7__Impl7789); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcreteColorAccess().getRightParenthesisKeyword_7()); 
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
    // $ANTLR end "rule__ConcreteColor__Group__7__Impl"


    // $ANTLR start "rule__Activation__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3818:1: rule__Activation__Group__0 : rule__Activation__Group__0__Impl rule__Activation__Group__1 ;
    public final void rule__Activation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3822:1: ( rule__Activation__Group__0__Impl rule__Activation__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3823:2: rule__Activation__Group__0__Impl rule__Activation__Group__1
            {
            pushFollow(FOLLOW_rule__Activation__Group__0__Impl_in_rule__Activation__Group__07836);
            rule__Activation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activation__Group__1_in_rule__Activation__Group__07839);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3830:1: rule__Activation__Group__0__Impl : ( 'active when' ) ;
    public final void rule__Activation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3834:1: ( ( 'active when' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3835:1: ( 'active when' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3835:1: ( 'active when' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3836:1: 'active when'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivationAccess().getActiveWhenKeyword_0()); 
            }
            match(input,74,FOLLOW_74_in_rule__Activation__Group__0__Impl7867); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3849:1: rule__Activation__Group__1 : rule__Activation__Group__1__Impl ;
    public final void rule__Activation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3853:1: ( rule__Activation__Group__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3854:2: rule__Activation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Activation__Group__1__Impl_in_rule__Activation__Group__17898);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3860:1: rule__Activation__Group__1__Impl : ( ( rule__Activation__ConditionAssignment_1 ) ) ;
    public final void rule__Activation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3864:1: ( ( ( rule__Activation__ConditionAssignment_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3865:1: ( ( rule__Activation__ConditionAssignment_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3865:1: ( ( rule__Activation__ConditionAssignment_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3866:1: ( rule__Activation__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivationAccess().getConditionAssignment_1()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3867:1: ( rule__Activation__ConditionAssignment_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3867:2: rule__Activation__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__Activation__ConditionAssignment_1_in_rule__Activation__Group__1__Impl7925);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3881:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3885:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3886:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__07959);
            rule__Condition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__07962);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3893:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__AttributeAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3897:1: ( ( ( rule__Condition__AttributeAssignment_0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3898:1: ( ( rule__Condition__AttributeAssignment_0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3898:1: ( ( rule__Condition__AttributeAssignment_0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3899:1: ( rule__Condition__AttributeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getAttributeAssignment_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3900:1: ( rule__Condition__AttributeAssignment_0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3900:2: rule__Condition__AttributeAssignment_0
            {
            pushFollow(FOLLOW_rule__Condition__AttributeAssignment_0_in_rule__Condition__Group__0__Impl7989);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3910:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3914:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3915:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__18019);
            rule__Condition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__18022);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3922:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__OperatorAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3926:1: ( ( ( rule__Condition__OperatorAssignment_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3927:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3927:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3928:1: ( rule__Condition__OperatorAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getOperatorAssignment_1()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3929:1: ( rule__Condition__OperatorAssignment_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3929:2: rule__Condition__OperatorAssignment_1
            {
            pushFollow(FOLLOW_rule__Condition__OperatorAssignment_1_in_rule__Condition__Group__1__Impl8049);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3939:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3943:1: ( rule__Condition__Group__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3944:2: rule__Condition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__28079);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3950:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__ValueAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3954:1: ( ( ( rule__Condition__ValueAssignment_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3955:1: ( ( rule__Condition__ValueAssignment_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3955:1: ( ( rule__Condition__ValueAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3956:1: ( rule__Condition__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getValueAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3957:1: ( rule__Condition__ValueAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3957:2: rule__Condition__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Condition__ValueAssignment_2_in_rule__Condition__Group__2__Impl8106);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3973:1: rule__CompositeCondition__Group__0 : rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1 ;
    public final void rule__CompositeCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3977:1: ( rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3978:2: rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1
            {
            pushFollow(FOLLOW_rule__CompositeCondition__Group__0__Impl_in_rule__CompositeCondition__Group__08142);
            rule__CompositeCondition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompositeCondition__Group__1_in_rule__CompositeCondition__Group__08145);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3985:1: rule__CompositeCondition__Group__0__Impl : ( ( rule__CompositeCondition__OperatorAssignment_0 ) ) ;
    public final void rule__CompositeCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3989:1: ( ( ( rule__CompositeCondition__OperatorAssignment_0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3990:1: ( ( rule__CompositeCondition__OperatorAssignment_0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3990:1: ( ( rule__CompositeCondition__OperatorAssignment_0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3991:1: ( rule__CompositeCondition__OperatorAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getOperatorAssignment_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3992:1: ( rule__CompositeCondition__OperatorAssignment_0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3992:2: rule__CompositeCondition__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__CompositeCondition__OperatorAssignment_0_in_rule__CompositeCondition__Group__0__Impl8172);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4002:1: rule__CompositeCondition__Group__1 : rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2 ;
    public final void rule__CompositeCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4006:1: ( rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4007:2: rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2
            {
            pushFollow(FOLLOW_rule__CompositeCondition__Group__1__Impl_in_rule__CompositeCondition__Group__18202);
            rule__CompositeCondition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompositeCondition__Group__2_in_rule__CompositeCondition__Group__18205);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4014:1: rule__CompositeCondition__Group__1__Impl : ( '(' ) ;
    public final void rule__CompositeCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4018:1: ( ( '(' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4019:1: ( '(' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4019:1: ( '(' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4020:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,71,FOLLOW_71_in_rule__CompositeCondition__Group__1__Impl8233); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4033:1: rule__CompositeCondition__Group__2 : rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3 ;
    public final void rule__CompositeCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4037:1: ( rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4038:2: rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3
            {
            pushFollow(FOLLOW_rule__CompositeCondition__Group__2__Impl_in_rule__CompositeCondition__Group__28264);
            rule__CompositeCondition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompositeCondition__Group__3_in_rule__CompositeCondition__Group__28267);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4045:1: rule__CompositeCondition__Group__2__Impl : ( ( ( rule__CompositeCondition__ConditionsAssignment_2 ) ) ( ( rule__CompositeCondition__ConditionsAssignment_2 )* ) ) ;
    public final void rule__CompositeCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4049:1: ( ( ( ( rule__CompositeCondition__ConditionsAssignment_2 ) ) ( ( rule__CompositeCondition__ConditionsAssignment_2 )* ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4050:1: ( ( ( rule__CompositeCondition__ConditionsAssignment_2 ) ) ( ( rule__CompositeCondition__ConditionsAssignment_2 )* ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4050:1: ( ( ( rule__CompositeCondition__ConditionsAssignment_2 ) ) ( ( rule__CompositeCondition__ConditionsAssignment_2 )* ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4051:1: ( ( rule__CompositeCondition__ConditionsAssignment_2 ) ) ( ( rule__CompositeCondition__ConditionsAssignment_2 )* )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4051:1: ( ( rule__CompositeCondition__ConditionsAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4052:1: ( rule__CompositeCondition__ConditionsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getConditionsAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4053:1: ( rule__CompositeCondition__ConditionsAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4053:2: rule__CompositeCondition__ConditionsAssignment_2
            {
            pushFollow(FOLLOW_rule__CompositeCondition__ConditionsAssignment_2_in_rule__CompositeCondition__Group__2__Impl8296);
            rule__CompositeCondition__ConditionsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getConditionsAssignment_2()); 
            }

            }

            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4056:1: ( ( rule__CompositeCondition__ConditionsAssignment_2 )* )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4057:1: ( rule__CompositeCondition__ConditionsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getConditionsAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4058:1: ( rule__CompositeCondition__ConditionsAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=18 && LA14_0<=19)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4058:2: rule__CompositeCondition__ConditionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__CompositeCondition__ConditionsAssignment_2_in_rule__CompositeCondition__Group__2__Impl8308);
            	    rule__CompositeCondition__ConditionsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4069:1: rule__CompositeCondition__Group__3 : rule__CompositeCondition__Group__3__Impl ;
    public final void rule__CompositeCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4073:1: ( rule__CompositeCondition__Group__3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4074:2: rule__CompositeCondition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CompositeCondition__Group__3__Impl_in_rule__CompositeCondition__Group__38341);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4080:1: rule__CompositeCondition__Group__3__Impl : ( ')' ) ;
    public final void rule__CompositeCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4084:1: ( ( ')' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4085:1: ( ')' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4085:1: ( ')' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4086:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,73,FOLLOW_73_in_rule__CompositeCondition__Group__3__Impl8369); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4107:1: rule__SignedDouble__Group__0 : rule__SignedDouble__Group__0__Impl rule__SignedDouble__Group__1 ;
    public final void rule__SignedDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4111:1: ( rule__SignedDouble__Group__0__Impl rule__SignedDouble__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4112:2: rule__SignedDouble__Group__0__Impl rule__SignedDouble__Group__1
            {
            pushFollow(FOLLOW_rule__SignedDouble__Group__0__Impl_in_rule__SignedDouble__Group__08408);
            rule__SignedDouble__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SignedDouble__Group__1_in_rule__SignedDouble__Group__08411);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4119:1: rule__SignedDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SignedDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4123:1: ( ( ( '-' )? ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4124:1: ( ( '-' )? )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4124:1: ( ( '-' )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4125:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedDoubleAccess().getHyphenMinusKeyword_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4126:1: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==75) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4127:2: '-'
                    {
                    match(input,75,FOLLOW_75_in_rule__SignedDouble__Group__0__Impl8440); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4138:1: rule__SignedDouble__Group__1 : rule__SignedDouble__Group__1__Impl rule__SignedDouble__Group__2 ;
    public final void rule__SignedDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4142:1: ( rule__SignedDouble__Group__1__Impl rule__SignedDouble__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4143:2: rule__SignedDouble__Group__1__Impl rule__SignedDouble__Group__2
            {
            pushFollow(FOLLOW_rule__SignedDouble__Group__1__Impl_in_rule__SignedDouble__Group__18473);
            rule__SignedDouble__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SignedDouble__Group__2_in_rule__SignedDouble__Group__18476);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4150:1: rule__SignedDouble__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__SignedDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4154:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4155:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4155:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4156:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedDoubleAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SignedDouble__Group__1__Impl8503); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4167:1: rule__SignedDouble__Group__2 : rule__SignedDouble__Group__2__Impl rule__SignedDouble__Group__3 ;
    public final void rule__SignedDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4171:1: ( rule__SignedDouble__Group__2__Impl rule__SignedDouble__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4172:2: rule__SignedDouble__Group__2__Impl rule__SignedDouble__Group__3
            {
            pushFollow(FOLLOW_rule__SignedDouble__Group__2__Impl_in_rule__SignedDouble__Group__28532);
            rule__SignedDouble__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SignedDouble__Group__3_in_rule__SignedDouble__Group__28535);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4179:1: rule__SignedDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__SignedDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4183:1: ( ( '.' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4184:1: ( '.' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4184:1: ( '.' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4185:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedDoubleAccess().getFullStopKeyword_2()); 
            }
            match(input,76,FOLLOW_76_in_rule__SignedDouble__Group__2__Impl8563); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4198:1: rule__SignedDouble__Group__3 : rule__SignedDouble__Group__3__Impl ;
    public final void rule__SignedDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4202:1: ( rule__SignedDouble__Group__3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4203:2: rule__SignedDouble__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SignedDouble__Group__3__Impl_in_rule__SignedDouble__Group__38594);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4209:1: rule__SignedDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__SignedDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4213:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4214:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4214:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4215:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedDoubleAccess().getINTTerminalRuleCall_3()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SignedDouble__Group__3__Impl8621); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4234:1: rule__SignedInteger__Group__0 : rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 ;
    public final void rule__SignedInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4238:1: ( rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4239:2: rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1
            {
            pushFollow(FOLLOW_rule__SignedInteger__Group__0__Impl_in_rule__SignedInteger__Group__08658);
            rule__SignedInteger__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SignedInteger__Group__1_in_rule__SignedInteger__Group__08661);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4246:1: rule__SignedInteger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SignedInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4250:1: ( ( ( '-' )? ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4251:1: ( ( '-' )? )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4251:1: ( ( '-' )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4252:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4253:1: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==75) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4254:2: '-'
                    {
                    match(input,75,FOLLOW_75_in_rule__SignedInteger__Group__0__Impl8690); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4265:1: rule__SignedInteger__Group__1 : rule__SignedInteger__Group__1__Impl ;
    public final void rule__SignedInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4269:1: ( rule__SignedInteger__Group__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4270:2: rule__SignedInteger__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SignedInteger__Group__1__Impl_in_rule__SignedInteger__Group__18723);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4276:1: rule__SignedInteger__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__SignedInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4280:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4281:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4281:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4282:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedIntegerAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SignedInteger__Group__1__Impl8750); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4298:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4302:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4303:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08784);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08787);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4310:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4314:1: ( ( RULE_ID ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4315:1: ( RULE_ID )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4315:1: ( RULE_ID )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4316:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8814); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4327:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4331:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4332:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18843);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4338:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4342:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4343:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4343:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4344:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4345:1: ( rule__QualifiedName__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==76) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4345:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8870);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4359:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4363:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4364:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08905);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08908);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4371:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4375:1: ( ( '.' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4376:1: ( '.' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4376:1: ( '.' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4377:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,76,FOLLOW_76_in_rule__QualifiedName__Group_1__0__Impl8936); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4390:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4394:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4395:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18967);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4401:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4405:1: ( ( RULE_ID ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4406:1: ( RULE_ID )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4406:1: ( RULE_ID )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4407:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl8994); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4423:1: rule__DecorationDescription__UnorderedGroup_3 : rule__DecorationDescription__UnorderedGroup_3__0 {...}?;
    public final void rule__DecorationDescription__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3());
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4428:1: ( rule__DecorationDescription__UnorderedGroup_3__0 {...}?)
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4429:2: rule__DecorationDescription__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_rule__DecorationDescription__UnorderedGroup_3__0_in_rule__DecorationDescription__UnorderedGroup_39028);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4440:1: rule__DecorationDescription__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) ) ) ) ;
    public final void rule__DecorationDescription__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4445:1: ( ( ({...}? => ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) ) ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4446:3: ( ({...}? => ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4446:3: ( ({...}? => ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==54|| LA19_0 >=58 && LA19_0<=59 ||LA19_0==62) && getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 0) ) {
                alt19=1;
            }
            else if ( LA19_0 ==74 && getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 1) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4448:4: ({...}? => ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4448:4: ({...}? => ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4449:5: {...}? => ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__DecorationDescription__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4449:118: ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4450:6: ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4456:6: ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4457:6: ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4457:6: ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4458:7: ( rule__DecorationDescription__DecorationsAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecorationDescriptionAccess().getDecorationsAssignment_3_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4459:7: ( rule__DecorationDescription__DecorationsAssignment_3_0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4459:8: rule__DecorationDescription__DecorationsAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__DecorationDescription__DecorationsAssignment_3_0_in_rule__DecorationDescription__UnorderedGroup_3__Impl9118);
                    rule__DecorationDescription__DecorationsAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDecorationDescriptionAccess().getDecorationsAssignment_3_0()); 
                    }

                    }

                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4462:6: ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4463:7: ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecorationDescriptionAccess().getDecorationsAssignment_3_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4464:7: ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )*
                    loop18:
                    do {
                        int alt18=2;
                        switch ( input.LA(1) ) {
                        case 54:
                            {
                            int LA18_1 = input.LA(2);

                            if ( (synpred1_InternalEMFProfileDecorationLanguage()) ) {
                                alt18=1;
                            }


                            }
                            break;
                        case 58:
                            {
                            int LA18_2 = input.LA(2);

                            if ( (synpred1_InternalEMFProfileDecorationLanguage()) ) {
                                alt18=1;
                            }


                            }
                            break;
                        case 59:
                            {
                            int LA18_3 = input.LA(2);

                            if ( (synpred1_InternalEMFProfileDecorationLanguage()) ) {
                                alt18=1;
                            }


                            }
                            break;
                        case 62:
                            {
                            int LA18_4 = input.LA(2);

                            if ( (synpred1_InternalEMFProfileDecorationLanguage()) ) {
                                alt18=1;
                            }


                            }
                            break;

                        }

                        switch (alt18) {
                    	case 1 :
                    	    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4464:8: ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0
                    	    {
                    	    pushFollow(FOLLOW_rule__DecorationDescription__DecorationsAssignment_3_0_in_rule__DecorationDescription__UnorderedGroup_3__Impl9162);
                    	    rule__DecorationDescription__DecorationsAssignment_3_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4470:4: ({...}? => ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4470:4: ({...}? => ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4471:5: {...}? => ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__DecorationDescription__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4471:118: ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4472:6: ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4478:6: ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4480:7: ( rule__DecorationDescription__ActivationAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecorationDescriptionAccess().getActivationAssignment_3_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4481:7: ( rule__DecorationDescription__ActivationAssignment_3_1 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4481:8: rule__DecorationDescription__ActivationAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__DecorationDescription__ActivationAssignment_3_1_in_rule__DecorationDescription__UnorderedGroup_3__Impl9260);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4496:1: rule__DecorationDescription__UnorderedGroup_3__0 : rule__DecorationDescription__UnorderedGroup_3__Impl ( rule__DecorationDescription__UnorderedGroup_3__1 )? ;
    public final void rule__DecorationDescription__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4500:1: ( rule__DecorationDescription__UnorderedGroup_3__Impl ( rule__DecorationDescription__UnorderedGroup_3__1 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4501:2: rule__DecorationDescription__UnorderedGroup_3__Impl ( rule__DecorationDescription__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__DecorationDescription__UnorderedGroup_3__Impl_in_rule__DecorationDescription__UnorderedGroup_3__09319);
            rule__DecorationDescription__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4502:2: ( rule__DecorationDescription__UnorderedGroup_3__1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==54|| LA20_0 >=58 && LA20_0<=59 ||LA20_0==62) && getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 ==74 && getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 1) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4502:2: rule__DecorationDescription__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__DecorationDescription__UnorderedGroup_3__1_in_rule__DecorationDescription__UnorderedGroup_3__09322);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4509:1: rule__DecorationDescription__UnorderedGroup_3__1 : rule__DecorationDescription__UnorderedGroup_3__Impl ;
    public final void rule__DecorationDescription__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4513:1: ( rule__DecorationDescription__UnorderedGroup_3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4514:2: rule__DecorationDescription__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__DecorationDescription__UnorderedGroup_3__Impl_in_rule__DecorationDescription__UnorderedGroup_3__19347);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4525:1: rule__ImageDecoration__UnorderedGroup_3 : rule__ImageDecoration__UnorderedGroup_3__0 {...}?;
    public final void rule__ImageDecoration__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3());
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4530:1: ( rule__ImageDecoration__UnorderedGroup_3__0 {...}?)
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4531:2: rule__ImageDecoration__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__0_in_rule__ImageDecoration__UnorderedGroup_39375);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4542:1: rule__ImageDecoration__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) ) ) ) ;
    public final void rule__ImageDecoration__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4547:1: ( ( ({...}? => ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) ) ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4548:3: ( ({...}? => ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4548:3: ( ({...}? => ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) ) ) )
            int alt21=5;
            int LA21_0 = input.LA(1);

            if ( LA21_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 ==68 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt21=2;
            }
            else if ( LA21_0 ==69 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt21=3;
            }
            else if ( LA21_0 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt21=4;
            }
            else if ( LA21_0 ==74 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4) ) {
                alt21=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4550:4: ({...}? => ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4550:4: ({...}? => ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4551:5: {...}? => ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ImageDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4551:112: ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4552:6: ( ( rule__ImageDecoration__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4558:6: ( ( rule__ImageDecoration__Group_3_0__0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4560:7: ( rule__ImageDecoration__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImageDecorationAccess().getGroup_3_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4561:7: ( rule__ImageDecoration__Group_3_0__0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4561:8: rule__ImageDecoration__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__Group_3_0__0_in_rule__ImageDecoration__UnorderedGroup_3__Impl9464);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4567:4: ({...}? => ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4567:4: ({...}? => ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4568:5: {...}? => ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ImageDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4568:112: ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4569:6: ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4575:6: ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4577:7: ( rule__ImageDecoration__DirectionAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImageDecorationAccess().getDirectionAssignment_3_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4578:7: ( rule__ImageDecoration__DirectionAssignment_3_1 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4578:8: rule__ImageDecoration__DirectionAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__DirectionAssignment_3_1_in_rule__ImageDecoration__UnorderedGroup_3__Impl9555);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4584:4: ({...}? => ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4584:4: ({...}? => ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4585:5: {...}? => ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ImageDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4585:112: ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4586:6: ( ( rule__ImageDecoration__MarginAssignment_3_2 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4592:6: ( ( rule__ImageDecoration__MarginAssignment_3_2 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4594:7: ( rule__ImageDecoration__MarginAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImageDecorationAccess().getMarginAssignment_3_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4595:7: ( rule__ImageDecoration__MarginAssignment_3_2 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4595:8: rule__ImageDecoration__MarginAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__MarginAssignment_3_2_in_rule__ImageDecoration__UnorderedGroup_3__Impl9646);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4601:4: ({...}? => ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4601:4: ({...}? => ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4602:5: {...}? => ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ImageDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4602:112: ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4603:6: ( ( rule__ImageDecoration__Group_3_3__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4609:6: ( ( rule__ImageDecoration__Group_3_3__0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4611:7: ( rule__ImageDecoration__Group_3_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImageDecorationAccess().getGroup_3_3()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4612:7: ( rule__ImageDecoration__Group_3_3__0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4612:8: rule__ImageDecoration__Group_3_3__0
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__Group_3_3__0_in_rule__ImageDecoration__UnorderedGroup_3__Impl9737);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4618:4: ({...}? => ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4618:4: ({...}? => ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4619:5: {...}? => ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ImageDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4619:112: ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4620:6: ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4626:6: ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4628:7: ( rule__ImageDecoration__ActivationAssignment_3_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImageDecorationAccess().getActivationAssignment_3_4()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4629:7: ( rule__ImageDecoration__ActivationAssignment_3_4 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4629:8: rule__ImageDecoration__ActivationAssignment_3_4
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__ActivationAssignment_3_4_in_rule__ImageDecoration__UnorderedGroup_3__Impl9828);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4644:1: rule__ImageDecoration__UnorderedGroup_3__0 : rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__1 )? ;
    public final void rule__ImageDecoration__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4648:1: ( rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__1 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4649:2: rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__09887);
            rule__ImageDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4650:2: ( rule__ImageDecoration__UnorderedGroup_3__1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 ==68 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt22=1;
            }
            else if ( LA22_0 ==69 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt22=1;
            }
            else if ( LA22_0 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt22=1;
            }
            else if ( LA22_0 ==74 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4650:2: rule__ImageDecoration__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__1_in_rule__ImageDecoration__UnorderedGroup_3__09890);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4657:1: rule__ImageDecoration__UnorderedGroup_3__1 : rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__2 )? ;
    public final void rule__ImageDecoration__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4661:1: ( rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__2 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4662:2: rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__19915);
            rule__ImageDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4663:2: ( rule__ImageDecoration__UnorderedGroup_3__2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 ==68 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt23=1;
            }
            else if ( LA23_0 ==69 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt23=1;
            }
            else if ( LA23_0 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt23=1;
            }
            else if ( LA23_0 ==74 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4663:2: rule__ImageDecoration__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__2_in_rule__ImageDecoration__UnorderedGroup_3__19918);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4670:1: rule__ImageDecoration__UnorderedGroup_3__2 : rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__3 )? ;
    public final void rule__ImageDecoration__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4674:1: ( rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__3 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4675:2: rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__29943);
            rule__ImageDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4676:2: ( rule__ImageDecoration__UnorderedGroup_3__3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 ==68 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt24=1;
            }
            else if ( LA24_0 ==69 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt24=1;
            }
            else if ( LA24_0 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt24=1;
            }
            else if ( LA24_0 ==74 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4676:2: rule__ImageDecoration__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__3_in_rule__ImageDecoration__UnorderedGroup_3__29946);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4683:1: rule__ImageDecoration__UnorderedGroup_3__3 : rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__4 )? ;
    public final void rule__ImageDecoration__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4687:1: ( rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__4 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4688:2: rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__4 )?
            {
            pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__39971);
            rule__ImageDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4689:2: ( rule__ImageDecoration__UnorderedGroup_3__4 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( LA25_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 ==68 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt25=1;
            }
            else if ( LA25_0 ==69 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt25=1;
            }
            else if ( LA25_0 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt25=1;
            }
            else if ( LA25_0 ==74 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4689:2: rule__ImageDecoration__UnorderedGroup_3__4
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__4_in_rule__ImageDecoration__UnorderedGroup_3__39974);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4696:1: rule__ImageDecoration__UnorderedGroup_3__4 : rule__ImageDecoration__UnorderedGroup_3__Impl ;
    public final void rule__ImageDecoration__UnorderedGroup_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4700:1: ( rule__ImageDecoration__UnorderedGroup_3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4701:2: rule__ImageDecoration__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__49999);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4718:1: rule__BorderDecoration__UnorderedGroup_3 : ( rule__BorderDecoration__UnorderedGroup_3__0 )? ;
    public final void rule__BorderDecoration__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3());
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4723:1: ( ( rule__BorderDecoration__UnorderedGroup_3__0 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4724:2: ( rule__BorderDecoration__UnorderedGroup_3__0 )?
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4724:2: ( rule__BorderDecoration__UnorderedGroup_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( LA26_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt26=1;
            }
            else if ( LA26_0 ==59 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt26=1;
            }
            else if ( LA26_0 ==66 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt26=1;
            }
            else if ( LA26_0 ==74 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4724:2: rule__BorderDecoration__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__0_in_rule__BorderDecoration__UnorderedGroup_310033);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4734:1: rule__BorderDecoration__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) ) ) ) ;
    public final void rule__BorderDecoration__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4739:1: ( ( ({...}? => ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) ) ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4740:3: ( ({...}? => ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4740:3: ( ({...}? => ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) ) ) )
            int alt27=4;
            int LA27_0 = input.LA(1);

            if ( LA27_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt27=1;
            }
            else if ( LA27_0 ==59 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt27=2;
            }
            else if ( LA27_0 ==66 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt27=3;
            }
            else if ( LA27_0 ==74 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt27=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4742:4: ({...}? => ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4742:4: ({...}? => ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4743:5: {...}? => ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__BorderDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4743:113: ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4744:6: ( ( rule__BorderDecoration__SizeAssignment_3_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4750:6: ( ( rule__BorderDecoration__SizeAssignment_3_0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4752:7: ( rule__BorderDecoration__SizeAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBorderDecorationAccess().getSizeAssignment_3_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4753:7: ( rule__BorderDecoration__SizeAssignment_3_0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4753:8: rule__BorderDecoration__SizeAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__SizeAssignment_3_0_in_rule__BorderDecoration__UnorderedGroup_3__Impl10120);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4759:4: ({...}? => ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4759:4: ({...}? => ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4760:5: {...}? => ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__BorderDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4760:113: ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4761:6: ( ( rule__BorderDecoration__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4767:6: ( ( rule__BorderDecoration__Group_3_1__0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4769:7: ( rule__BorderDecoration__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBorderDecorationAccess().getGroup_3_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4770:7: ( rule__BorderDecoration__Group_3_1__0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4770:8: rule__BorderDecoration__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__Group_3_1__0_in_rule__BorderDecoration__UnorderedGroup_3__Impl10211);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4776:4: ({...}? => ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4776:4: ({...}? => ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4777:5: {...}? => ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__BorderDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4777:113: ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4778:6: ( ( rule__BorderDecoration__StyleAssignment_3_2 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4784:6: ( ( rule__BorderDecoration__StyleAssignment_3_2 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4786:7: ( rule__BorderDecoration__StyleAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBorderDecorationAccess().getStyleAssignment_3_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4787:7: ( rule__BorderDecoration__StyleAssignment_3_2 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4787:8: rule__BorderDecoration__StyleAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__StyleAssignment_3_2_in_rule__BorderDecoration__UnorderedGroup_3__Impl10302);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4793:4: ({...}? => ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4793:4: ({...}? => ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4794:5: {...}? => ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__BorderDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4794:113: ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4795:6: ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4801:6: ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4803:7: ( rule__BorderDecoration__ActivationAssignment_3_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBorderDecorationAccess().getActivationAssignment_3_3()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4804:7: ( rule__BorderDecoration__ActivationAssignment_3_3 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4804:8: rule__BorderDecoration__ActivationAssignment_3_3
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__ActivationAssignment_3_3_in_rule__BorderDecoration__UnorderedGroup_3__Impl10393);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4819:1: rule__BorderDecoration__UnorderedGroup_3__0 : rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__1 )? ;
    public final void rule__BorderDecoration__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4823:1: ( rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__1 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4824:2: rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__010452);
            rule__BorderDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4825:2: ( rule__BorderDecoration__UnorderedGroup_3__1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( LA28_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 ==59 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt28=1;
            }
            else if ( LA28_0 ==66 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt28=1;
            }
            else if ( LA28_0 ==74 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4825:2: rule__BorderDecoration__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__1_in_rule__BorderDecoration__UnorderedGroup_3__010455);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4832:1: rule__BorderDecoration__UnorderedGroup_3__1 : rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__2 )? ;
    public final void rule__BorderDecoration__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4836:1: ( rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__2 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4837:2: rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__110480);
            rule__BorderDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4838:2: ( rule__BorderDecoration__UnorderedGroup_3__2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( LA29_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt29=1;
            }
            else if ( LA29_0 ==59 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt29=1;
            }
            else if ( LA29_0 ==66 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt29=1;
            }
            else if ( LA29_0 ==74 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4838:2: rule__BorderDecoration__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__2_in_rule__BorderDecoration__UnorderedGroup_3__110483);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4845:1: rule__BorderDecoration__UnorderedGroup_3__2 : rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__3 )? ;
    public final void rule__BorderDecoration__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4849:1: ( rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__3 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4850:2: rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__210508);
            rule__BorderDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4851:2: ( rule__BorderDecoration__UnorderedGroup_3__3 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( LA30_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 ==59 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt30=1;
            }
            else if ( LA30_0 ==66 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt30=1;
            }
            else if ( LA30_0 ==74 && getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4851:2: rule__BorderDecoration__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__3_in_rule__BorderDecoration__UnorderedGroup_3__210511);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4858:1: rule__BorderDecoration__UnorderedGroup_3__3 : rule__BorderDecoration__UnorderedGroup_3__Impl ;
    public final void rule__BorderDecoration__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4862:1: ( rule__BorderDecoration__UnorderedGroup_3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4863:2: rule__BorderDecoration__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__310536);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4878:1: rule__ColorDecoration__UnorderedGroup_3 : ( rule__ColorDecoration__UnorderedGroup_3__0 )? ;
    public final void rule__ColorDecoration__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3());
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4883:1: ( ( rule__ColorDecoration__UnorderedGroup_3__0 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4884:2: ( rule__ColorDecoration__UnorderedGroup_3__0 )?
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4884:2: ( rule__ColorDecoration__UnorderedGroup_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 ==61 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt31=1;
            }
            else if ( LA31_0 ==74 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4884:2: rule__ColorDecoration__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_rule__ColorDecoration__UnorderedGroup_3__0_in_rule__ColorDecoration__UnorderedGroup_310568);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4894:1: rule__ColorDecoration__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) ) ) ) ;
    public final void rule__ColorDecoration__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4899:1: ( ( ({...}? => ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) ) ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4900:3: ( ({...}? => ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4900:3: ( ({...}? => ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) ) ) )
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( LA32_0 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 ==61 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt32=2;
            }
            else if ( LA32_0 ==74 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt32=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4902:4: ({...}? => ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4902:4: ({...}? => ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4903:5: {...}? => ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ColorDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4903:112: ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4904:6: ( ( rule__ColorDecoration__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4910:6: ( ( rule__ColorDecoration__Group_3_0__0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4912:7: ( rule__ColorDecoration__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorDecorationAccess().getGroup_3_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4913:7: ( rule__ColorDecoration__Group_3_0__0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4913:8: rule__ColorDecoration__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__ColorDecoration__Group_3_0__0_in_rule__ColorDecoration__UnorderedGroup_3__Impl10655);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4919:4: ({...}? => ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4919:4: ({...}? => ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4920:5: {...}? => ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ColorDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4920:112: ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4921:6: ( ( rule__ColorDecoration__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4927:6: ( ( rule__ColorDecoration__Group_3_1__0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4929:7: ( rule__ColorDecoration__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorDecorationAccess().getGroup_3_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4930:7: ( rule__ColorDecoration__Group_3_1__0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4930:8: rule__ColorDecoration__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__ColorDecoration__Group_3_1__0_in_rule__ColorDecoration__UnorderedGroup_3__Impl10746);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4936:4: ({...}? => ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4936:4: ({...}? => ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4937:5: {...}? => ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ColorDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4937:112: ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4938:6: ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4944:6: ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4946:7: ( rule__ColorDecoration__ActivationAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorDecorationAccess().getActivationAssignment_3_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4947:7: ( rule__ColorDecoration__ActivationAssignment_3_2 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4947:8: rule__ColorDecoration__ActivationAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__ColorDecoration__ActivationAssignment_3_2_in_rule__ColorDecoration__UnorderedGroup_3__Impl10837);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4962:1: rule__ColorDecoration__UnorderedGroup_3__0 : rule__ColorDecoration__UnorderedGroup_3__Impl ( rule__ColorDecoration__UnorderedGroup_3__1 )? ;
    public final void rule__ColorDecoration__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4966:1: ( rule__ColorDecoration__UnorderedGroup_3__Impl ( rule__ColorDecoration__UnorderedGroup_3__1 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4967:2: rule__ColorDecoration__UnorderedGroup_3__Impl ( rule__ColorDecoration__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__ColorDecoration__UnorderedGroup_3__Impl_in_rule__ColorDecoration__UnorderedGroup_3__010896);
            rule__ColorDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4968:2: ( rule__ColorDecoration__UnorderedGroup_3__1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( LA33_0 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt33=1;
            }
            else if ( LA33_0 ==61 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt33=1;
            }
            else if ( LA33_0 ==74 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4968:2: rule__ColorDecoration__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__ColorDecoration__UnorderedGroup_3__1_in_rule__ColorDecoration__UnorderedGroup_3__010899);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4975:1: rule__ColorDecoration__UnorderedGroup_3__1 : rule__ColorDecoration__UnorderedGroup_3__Impl ( rule__ColorDecoration__UnorderedGroup_3__2 )? ;
    public final void rule__ColorDecoration__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4979:1: ( rule__ColorDecoration__UnorderedGroup_3__Impl ( rule__ColorDecoration__UnorderedGroup_3__2 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4980:2: rule__ColorDecoration__UnorderedGroup_3__Impl ( rule__ColorDecoration__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_rule__ColorDecoration__UnorderedGroup_3__Impl_in_rule__ColorDecoration__UnorderedGroup_3__110924);
            rule__ColorDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4981:2: ( rule__ColorDecoration__UnorderedGroup_3__2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( LA34_0 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt34=1;
            }
            else if ( LA34_0 ==61 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt34=1;
            }
            else if ( LA34_0 ==74 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4981:2: rule__ColorDecoration__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_rule__ColorDecoration__UnorderedGroup_3__2_in_rule__ColorDecoration__UnorderedGroup_3__110927);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4988:1: rule__ColorDecoration__UnorderedGroup_3__2 : rule__ColorDecoration__UnorderedGroup_3__Impl ;
    public final void rule__ColorDecoration__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4992:1: ( rule__ColorDecoration__UnorderedGroup_3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4993:2: rule__ColorDecoration__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__ColorDecoration__UnorderedGroup_3__Impl_in_rule__ColorDecoration__UnorderedGroup_3__210952);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5006:1: rule__ConnectionDecoration__UnorderedGroup_3 : ( rule__ConnectionDecoration__UnorderedGroup_3__0 )? ;
    public final void rule__ConnectionDecoration__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3());
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5011:1: ( ( rule__ConnectionDecoration__UnorderedGroup_3__0 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5012:2: ( rule__ConnectionDecoration__UnorderedGroup_3__0 )?
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5012:2: ( rule__ConnectionDecoration__UnorderedGroup_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( LA35_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt35=1;
            }
            else if ( LA35_0 ==66 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt35=1;
            }
            else if ( LA35_0 ==63 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt35=1;
            }
            else if ( LA35_0 ==64 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt35=1;
            }
            else if ( LA35_0 ==74 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5012:2: rule__ConnectionDecoration__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__0_in_rule__ConnectionDecoration__UnorderedGroup_310982);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5022:1: rule__ConnectionDecoration__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) ) ) ) ;
    public final void rule__ConnectionDecoration__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5027:1: ( ( ({...}? => ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) ) ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5028:3: ( ({...}? => ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5028:3: ( ({...}? => ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) ) ) )
            int alt36=5;
            int LA36_0 = input.LA(1);

            if ( LA36_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt36=1;
            }
            else if ( LA36_0 ==66 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt36=2;
            }
            else if ( LA36_0 ==63 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt36=3;
            }
            else if ( LA36_0 ==64 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt36=4;
            }
            else if ( LA36_0 ==74 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4) ) {
                alt36=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5030:4: ({...}? => ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5030:4: ({...}? => ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5031:5: {...}? => ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ConnectionDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5031:117: ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5032:6: ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5038:6: ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5040:7: ( rule__ConnectionDecoration__SizeAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConnectionDecorationAccess().getSizeAssignment_3_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5041:7: ( rule__ConnectionDecoration__SizeAssignment_3_0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5041:8: rule__ConnectionDecoration__SizeAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__SizeAssignment_3_0_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11069);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5047:4: ({...}? => ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5047:4: ({...}? => ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5048:5: {...}? => ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ConnectionDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5048:117: ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5049:6: ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5055:6: ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5057:7: ( rule__ConnectionDecoration__StyleAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConnectionDecorationAccess().getStyleAssignment_3_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5058:7: ( rule__ConnectionDecoration__StyleAssignment_3_1 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5058:8: rule__ConnectionDecoration__StyleAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__StyleAssignment_3_1_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11160);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5064:4: ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5064:4: ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5065:5: {...}? => ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ConnectionDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5065:117: ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5066:6: ( ( rule__ConnectionDecoration__Group_3_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5072:6: ( ( rule__ConnectionDecoration__Group_3_2__0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5074:7: ( rule__ConnectionDecoration__Group_3_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConnectionDecorationAccess().getGroup_3_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5075:7: ( rule__ConnectionDecoration__Group_3_2__0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5075:8: rule__ConnectionDecoration__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_2__0_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11251);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5081:4: ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5081:4: ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5082:5: {...}? => ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ConnectionDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5082:117: ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5083:6: ( ( rule__ConnectionDecoration__Group_3_3__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5089:6: ( ( rule__ConnectionDecoration__Group_3_3__0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5091:7: ( rule__ConnectionDecoration__Group_3_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConnectionDecorationAccess().getGroup_3_3()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5092:7: ( rule__ConnectionDecoration__Group_3_3__0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5092:8: rule__ConnectionDecoration__Group_3_3__0
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_3__0_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11342);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5098:4: ({...}? => ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5098:4: ({...}? => ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5099:5: {...}? => ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ConnectionDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5099:117: ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5100:6: ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5106:6: ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5108:7: ( rule__ConnectionDecoration__ActivationAssignment_3_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConnectionDecorationAccess().getActivationAssignment_3_4()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5109:7: ( rule__ConnectionDecoration__ActivationAssignment_3_4 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5109:8: rule__ConnectionDecoration__ActivationAssignment_3_4
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__ActivationAssignment_3_4_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11433);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5124:1: rule__ConnectionDecoration__UnorderedGroup_3__0 : rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__1 )? ;
    public final void rule__ConnectionDecoration__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5128:1: ( rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__1 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5129:2: rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__011492);
            rule__ConnectionDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5130:2: ( rule__ConnectionDecoration__UnorderedGroup_3__1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( LA37_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt37=1;
            }
            else if ( LA37_0 ==66 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt37=1;
            }
            else if ( LA37_0 ==63 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt37=1;
            }
            else if ( LA37_0 ==64 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt37=1;
            }
            else if ( LA37_0 ==74 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5130:2: rule__ConnectionDecoration__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__1_in_rule__ConnectionDecoration__UnorderedGroup_3__011495);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5137:1: rule__ConnectionDecoration__UnorderedGroup_3__1 : rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__2 )? ;
    public final void rule__ConnectionDecoration__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5141:1: ( rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__2 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5142:2: rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__111520);
            rule__ConnectionDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5143:2: ( rule__ConnectionDecoration__UnorderedGroup_3__2 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( LA38_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt38=1;
            }
            else if ( LA38_0 ==66 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt38=1;
            }
            else if ( LA38_0 ==63 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt38=1;
            }
            else if ( LA38_0 ==64 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt38=1;
            }
            else if ( LA38_0 ==74 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5143:2: rule__ConnectionDecoration__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__2_in_rule__ConnectionDecoration__UnorderedGroup_3__111523);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5150:1: rule__ConnectionDecoration__UnorderedGroup_3__2 : rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__3 )? ;
    public final void rule__ConnectionDecoration__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5154:1: ( rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__3 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5155:2: rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__211548);
            rule__ConnectionDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5156:2: ( rule__ConnectionDecoration__UnorderedGroup_3__3 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( LA39_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt39=1;
            }
            else if ( LA39_0 ==66 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt39=1;
            }
            else if ( LA39_0 ==63 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt39=1;
            }
            else if ( LA39_0 ==64 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt39=1;
            }
            else if ( LA39_0 ==74 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5156:2: rule__ConnectionDecoration__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__3_in_rule__ConnectionDecoration__UnorderedGroup_3__211551);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5163:1: rule__ConnectionDecoration__UnorderedGroup_3__3 : rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__4 )? ;
    public final void rule__ConnectionDecoration__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5167:1: ( rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__4 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5168:2: rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__4 )?
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__311576);
            rule__ConnectionDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5169:2: ( rule__ConnectionDecoration__UnorderedGroup_3__4 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( LA40_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0) ) {
                alt40=1;
            }
            else if ( LA40_0 ==66 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1) ) {
                alt40=1;
            }
            else if ( LA40_0 ==63 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2) ) {
                alt40=1;
            }
            else if ( LA40_0 ==64 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3) ) {
                alt40=1;
            }
            else if ( LA40_0 ==74 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5169:2: rule__ConnectionDecoration__UnorderedGroup_3__4
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__4_in_rule__ConnectionDecoration__UnorderedGroup_3__311579);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5176:1: rule__ConnectionDecoration__UnorderedGroup_3__4 : rule__ConnectionDecoration__UnorderedGroup_3__Impl ;
    public final void rule__ConnectionDecoration__UnorderedGroup_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5180:1: ( rule__ConnectionDecoration__UnorderedGroup_3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5181:2: rule__ConnectionDecoration__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__411604);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5198:1: rule__DecorationModel__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DecorationModel__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5202:1: ( ( RULE_STRING ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5203:1: ( RULE_STRING )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5203:1: ( RULE_STRING )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5204:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationModelAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DecorationModel__ImportURIAssignment_111642); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5213:1: rule__DecorationModel__NamespaceAssignment_2 : ( ruleNamespace ) ;
    public final void rule__DecorationModel__NamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5217:1: ( ( ruleNamespace ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5218:1: ( ruleNamespace )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5218:1: ( ruleNamespace )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5219:1: ruleNamespace
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationModelAccess().getNamespaceNamespaceParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleNamespace_in_rule__DecorationModel__NamespaceAssignment_211673);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5228:1: rule__DecorationModel__DecorationDescriptionsAssignment_3 : ( ruleDecorationDescription ) ;
    public final void rule__DecorationModel__DecorationDescriptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5232:1: ( ( ruleDecorationDescription ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5233:1: ( ruleDecorationDescription )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5233:1: ( ruleDecorationDescription )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5234:1: ruleDecorationDescription
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationModelAccess().getDecorationDescriptionsDecorationDescriptionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleDecorationDescription_in_rule__DecorationModel__DecorationDescriptionsAssignment_311704);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5243:1: rule__Namespace__ProfileAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Namespace__ProfileAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5247:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5248:1: ( ( ruleQualifiedName ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5248:1: ( ( ruleQualifiedName ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5249:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceAccess().getProfileProfileCrossReference_1_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5250:1: ( ruleQualifiedName )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5251:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceAccess().getProfileProfileQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Namespace__ProfileAssignment_111739);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5262:1: rule__DecorationDescription__StereotypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DecorationDescription__StereotypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5266:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5267:1: ( ( ruleQualifiedName ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5267:1: ( ( ruleQualifiedName ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5268:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getStereotypeStereotypeCrossReference_1_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5269:1: ( ruleQualifiedName )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5270:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getStereotypeStereotypeQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DecorationDescription__StereotypeAssignment_111778);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5281:1: rule__DecorationDescription__DecorationsAssignment_3_0 : ( ruleAbstractDecoration ) ;
    public final void rule__DecorationDescription__DecorationsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5285:1: ( ( ruleAbstractDecoration ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5286:1: ( ruleAbstractDecoration )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5286:1: ( ruleAbstractDecoration )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5287:1: ruleAbstractDecoration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getDecorationsAbstractDecorationParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleAbstractDecoration_in_rule__DecorationDescription__DecorationsAssignment_3_011813);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5296:1: rule__DecorationDescription__ActivationAssignment_3_1 : ( ruleActivation ) ;
    public final void rule__DecorationDescription__ActivationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5300:1: ( ( ruleActivation ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5301:1: ( ruleActivation )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5301:1: ( ruleActivation )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5302:1: ruleActivation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getActivationActivationParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleActivation_in_rule__DecorationDescription__ActivationAssignment_3_111844);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5311:1: rule__ImageDecoration__Location_uriAssignment_3_0_2 : ( RULE_STRING ) ;
    public final void rule__ImageDecoration__Location_uriAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5315:1: ( ( RULE_STRING ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5316:1: ( RULE_STRING )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5316:1: ( RULE_STRING )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5317:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getLocation_uriSTRINGTerminalRuleCall_3_0_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ImageDecoration__Location_uriAssignment_3_0_211875); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5326:1: rule__ImageDecoration__DirectionAssignment_3_1 : ( ruleDirection ) ;
    public final void rule__ImageDecoration__DirectionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5330:1: ( ( ruleDirection ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5331:1: ( ruleDirection )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5331:1: ( ruleDirection )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5332:1: ruleDirection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getDirectionDirectionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleDirection_in_rule__ImageDecoration__DirectionAssignment_3_111906);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5341:1: rule__ImageDecoration__MarginAssignment_3_2 : ( ruleMargin ) ;
    public final void rule__ImageDecoration__MarginAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5345:1: ( ( ruleMargin ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5346:1: ( ruleMargin )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5346:1: ( ruleMargin )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5347:1: ruleMargin
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getMarginMarginParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleMargin_in_rule__ImageDecoration__MarginAssignment_3_211937);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5356:1: rule__ImageDecoration__TooltipAssignment_3_3_2 : ( ruleText ) ;
    public final void rule__ImageDecoration__TooltipAssignment_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5360:1: ( ( ruleText ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5361:1: ( ruleText )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5361:1: ( ruleText )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5362:1: ruleText
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getTooltipTextParserRuleCall_3_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleText_in_rule__ImageDecoration__TooltipAssignment_3_3_211968);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5371:1: rule__ImageDecoration__ActivationAssignment_3_4 : ( ruleActivation ) ;
    public final void rule__ImageDecoration__ActivationAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5375:1: ( ( ruleActivation ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5376:1: ( ruleActivation )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5376:1: ( ruleActivation )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5377:1: ruleActivation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getActivationActivationParserRuleCall_3_4_0()); 
            }
            pushFollow(FOLLOW_ruleActivation_in_rule__ImageDecoration__ActivationAssignment_3_411999);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5386:1: rule__BorderDecoration__SizeAssignment_3_0 : ( ruleSize ) ;
    public final void rule__BorderDecoration__SizeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5390:1: ( ( ruleSize ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5391:1: ( ruleSize )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5391:1: ( ruleSize )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5392:1: ruleSize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getSizeSizeParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleSize_in_rule__BorderDecoration__SizeAssignment_3_012030);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5401:1: rule__BorderDecoration__ColorAssignment_3_1_2 : ( ruleColor ) ;
    public final void rule__BorderDecoration__ColorAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5405:1: ( ( ruleColor ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5406:1: ( ruleColor )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5406:1: ( ruleColor )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5407:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getColorColorParserRuleCall_3_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__BorderDecoration__ColorAssignment_3_1_212061);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5416:1: rule__BorderDecoration__StyleAssignment_3_2 : ( ruleStyle ) ;
    public final void rule__BorderDecoration__StyleAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5420:1: ( ( ruleStyle ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5421:1: ( ruleStyle )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5421:1: ( ruleStyle )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5422:1: ruleStyle
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getStyleStyleParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleStyle_in_rule__BorderDecoration__StyleAssignment_3_212092);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5431:1: rule__BorderDecoration__ActivationAssignment_3_3 : ( ruleActivation ) ;
    public final void rule__BorderDecoration__ActivationAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5435:1: ( ( ruleActivation ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5436:1: ( ruleActivation )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5436:1: ( ruleActivation )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5437:1: ruleActivation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getActivationActivationParserRuleCall_3_3_0()); 
            }
            pushFollow(FOLLOW_ruleActivation_in_rule__BorderDecoration__ActivationAssignment_3_312123);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5446:1: rule__ColorDecoration__BackgroundAssignment_3_0_2 : ( ruleColor ) ;
    public final void rule__ColorDecoration__BackgroundAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5450:1: ( ( ruleColor ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5451:1: ( ruleColor )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5451:1: ( ruleColor )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5452:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getBackgroundColorParserRuleCall_3_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__ColorDecoration__BackgroundAssignment_3_0_212154);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5461:1: rule__ColorDecoration__ForegroundAssignment_3_1_2 : ( ruleColor ) ;
    public final void rule__ColorDecoration__ForegroundAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5465:1: ( ( ruleColor ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5466:1: ( ruleColor )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5466:1: ( ruleColor )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5467:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getForegroundColorParserRuleCall_3_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__ColorDecoration__ForegroundAssignment_3_1_212185);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5476:1: rule__ColorDecoration__ActivationAssignment_3_2 : ( ruleActivation ) ;
    public final void rule__ColorDecoration__ActivationAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5480:1: ( ( ruleActivation ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5481:1: ( ruleActivation )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5481:1: ( ruleActivation )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5482:1: ruleActivation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getActivationActivationParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleActivation_in_rule__ColorDecoration__ActivationAssignment_3_212216);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5491:1: rule__ConnectionDecoration__SizeAssignment_3_0 : ( ruleSize ) ;
    public final void rule__ConnectionDecoration__SizeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5495:1: ( ( ruleSize ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5496:1: ( ruleSize )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5496:1: ( ruleSize )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5497:1: ruleSize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getSizeSizeParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleSize_in_rule__ConnectionDecoration__SizeAssignment_3_012247);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5506:1: rule__ConnectionDecoration__StyleAssignment_3_1 : ( ruleStyle ) ;
    public final void rule__ConnectionDecoration__StyleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5510:1: ( ( ruleStyle ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5511:1: ( ruleStyle )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5511:1: ( ruleStyle )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5512:1: ruleStyle
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getStyleStyleParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleStyle_in_rule__ConnectionDecoration__StyleAssignment_3_112278);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5521:1: rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2 : ( ruleColor ) ;
    public final void rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5525:1: ( ( ruleColor ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5526:1: ( ruleColor )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5526:1: ( ruleColor )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5527:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getForegroundColorColorParserRuleCall_3_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__ConnectionDecoration__ForegroundColorAssignment_3_2_212309);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5536:1: rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2 : ( ruleColor ) ;
    public final void rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5540:1: ( ( ruleColor ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5541:1: ( ruleColor )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5541:1: ( ruleColor )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5542:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getBackgroundColorColorParserRuleCall_3_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__ConnectionDecoration__BackgroundColorAssignment_3_3_212340);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5551:1: rule__ConnectionDecoration__ActivationAssignment_3_4 : ( ruleActivation ) ;
    public final void rule__ConnectionDecoration__ActivationAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5555:1: ( ( ruleActivation ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5556:1: ( ruleActivation )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5556:1: ( ruleActivation )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5557:1: ruleActivation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getActivationActivationParserRuleCall_3_4_0()); 
            }
            pushFollow(FOLLOW_ruleActivation_in_rule__ConnectionDecoration__ActivationAssignment_3_412371);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5566:1: rule__SimpleText__TextAssignment_0 : ( RULE_STRING ) ;
    public final void rule__SimpleText__TextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5570:1: ( ( RULE_STRING ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5571:1: ( RULE_STRING )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5571:1: ( RULE_STRING )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5572:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleTextAccess().getTextSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleText__TextAssignment_012402); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5581:1: rule__SimpleText__AttributeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SimpleText__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5585:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5586:1: ( ( ruleQualifiedName ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5586:1: ( ( ruleQualifiedName ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5587:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleTextAccess().getAttributeEAttributeCrossReference_1_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5588:1: ( ruleQualifiedName )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5589:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleTextAccess().getAttributeEAttributeQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__SimpleText__AttributeAssignment_112437);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5600:1: rule__ComplexText__LeftAssignment_0 : ( ruleSimpleText ) ;
    public final void rule__ComplexText__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5604:1: ( ( ruleSimpleText ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5605:1: ( ruleSimpleText )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5605:1: ( ruleSimpleText )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5606:1: ruleSimpleText
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTextAccess().getLeftSimpleTextParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSimpleText_in_rule__ComplexText__LeftAssignment_012472);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5615:1: rule__ComplexText__RightAssignment_2 : ( ruleText ) ;
    public final void rule__ComplexText__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5619:1: ( ( ruleText ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5620:1: ( ruleText )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5620:1: ( ruleText )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5621:1: ruleText
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTextAccess().getRightTextParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleText_in_rule__ComplexText__RightAssignment_212503);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5630:1: rule__Style__ValueAssignment_2 : ( ruleLineStyle ) ;
    public final void rule__Style__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5634:1: ( ( ruleLineStyle ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5635:1: ( ruleLineStyle )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5635:1: ( ruleLineStyle )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5636:1: ruleLineStyle
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleAccess().getValueLineStyleEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleLineStyle_in_rule__Style__ValueAssignment_212534);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5645:1: rule__Size__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__Size__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5649:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5650:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5650:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5651:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getValueINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Size__ValueAssignment_212565); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5660:1: rule__Direction__ValueAssignment_2 : ( ruleDirections ) ;
    public final void rule__Direction__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5664:1: ( ( ruleDirections ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5665:1: ( ruleDirections )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5665:1: ( ruleDirections )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5666:1: ruleDirections
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectionAccess().getValueDirectionsEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleDirections_in_rule__Direction__ValueAssignment_212596);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5675:1: rule__Margin__ValueAssignment_2 : ( ruleSignedInteger ) ;
    public final void rule__Margin__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5679:1: ( ( ruleSignedInteger ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5680:1: ( ruleSignedInteger )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5680:1: ( ruleSignedInteger )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5681:1: ruleSignedInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarginAccess().getValueSignedIntegerParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleSignedInteger_in_rule__Margin__ValueAssignment_212627);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5690:1: rule__Color__ValueAssignment_0_1 : ( ruleColorConstant ) ;
    public final void rule__Color__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5694:1: ( ( ruleColorConstant ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5695:1: ( ruleColorConstant )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5695:1: ( ruleColorConstant )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5696:1: ruleColorConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getValueColorConstantParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleColorConstant_in_rule__Color__ValueAssignment_0_112658);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5705:1: rule__Color__ConcreteAssignment_1 : ( ruleConcreteColor ) ;
    public final void rule__Color__ConcreteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5709:1: ( ( ruleConcreteColor ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5710:1: ( ruleConcreteColor )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5710:1: ( ruleConcreteColor )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5711:1: ruleConcreteColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getConcreteConcreteColorParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleConcreteColor_in_rule__Color__ConcreteAssignment_112689);
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


    // $ANTLR start "rule__ConcreteColor__RedAssignment_2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5720:1: rule__ConcreteColor__RedAssignment_2 : ( RULE_INT ) ;
    public final void rule__ConcreteColor__RedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5724:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5725:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5725:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5726:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getRedINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ConcreteColor__RedAssignment_212720); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcreteColorAccess().getRedINTTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__ConcreteColor__RedAssignment_2"


    // $ANTLR start "rule__ConcreteColor__GreenAssignment_4"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5735:1: rule__ConcreteColor__GreenAssignment_4 : ( RULE_INT ) ;
    public final void rule__ConcreteColor__GreenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5739:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5740:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5740:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5741:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getGreenINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ConcreteColor__GreenAssignment_412751); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcreteColorAccess().getGreenINTTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__ConcreteColor__GreenAssignment_4"


    // $ANTLR start "rule__ConcreteColor__BlueAssignment_6"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5750:1: rule__ConcreteColor__BlueAssignment_6 : ( RULE_INT ) ;
    public final void rule__ConcreteColor__BlueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5754:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5755:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5755:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5756:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getBlueINTTerminalRuleCall_6_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ConcreteColor__BlueAssignment_612782); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcreteColorAccess().getBlueINTTerminalRuleCall_6_0()); 
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
    // $ANTLR end "rule__ConcreteColor__BlueAssignment_6"


    // $ANTLR start "rule__ColorConstant__ValueAssignment"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5765:1: rule__ColorConstant__ValueAssignment : ( ruleColors ) ;
    public final void rule__ColorConstant__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5769:1: ( ( ruleColors ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5770:1: ( ruleColors )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5770:1: ( ruleColors )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5771:1: ruleColors
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorConstantAccess().getValueColorsEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleColors_in_rule__ColorConstant__ValueAssignment12813);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5780:1: rule__Activation__ConditionAssignment_1 : ( ruleAbstractCondition ) ;
    public final void rule__Activation__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5784:1: ( ( ruleAbstractCondition ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5785:1: ( ruleAbstractCondition )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5785:1: ( ruleAbstractCondition )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5786:1: ruleAbstractCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivationAccess().getConditionAbstractConditionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAbstractCondition_in_rule__Activation__ConditionAssignment_112844);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5795:1: rule__Condition__AttributeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Condition__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5799:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5800:1: ( ( ruleQualifiedName ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5800:1: ( ( ruleQualifiedName ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5801:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getAttributeEAttributeCrossReference_0_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5802:1: ( ruleQualifiedName )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5803:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getAttributeEAttributeQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Condition__AttributeAssignment_012879);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5814:1: rule__Condition__OperatorAssignment_1 : ( ruleComparisonOperator ) ;
    public final void rule__Condition__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5818:1: ( ( ruleComparisonOperator ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5819:1: ( ruleComparisonOperator )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5819:1: ( ruleComparisonOperator )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5820:1: ruleComparisonOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getOperatorComparisonOperatorEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleComparisonOperator_in_rule__Condition__OperatorAssignment_112914);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5829:1: rule__Condition__ValueAssignment_2 : ( ruleType ) ;
    public final void rule__Condition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5833:1: ( ( ruleType ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5834:1: ( ruleType )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5834:1: ( ruleType )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5835:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getValueTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Condition__ValueAssignment_212945);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5844:1: rule__CompositeCondition__OperatorAssignment_0 : ( ruleLogicalOperator ) ;
    public final void rule__CompositeCondition__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5848:1: ( ( ruleLogicalOperator ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5849:1: ( ruleLogicalOperator )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5849:1: ( ruleLogicalOperator )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5850:1: ruleLogicalOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getOperatorLogicalOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleLogicalOperator_in_rule__CompositeCondition__OperatorAssignment_012976);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5859:1: rule__CompositeCondition__ConditionsAssignment_2 : ( ruleAbstractCondition ) ;
    public final void rule__CompositeCondition__ConditionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5863:1: ( ( ruleAbstractCondition ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5864:1: ( ruleAbstractCondition )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5864:1: ( ruleAbstractCondition )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5865:1: ruleAbstractCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getConditionsAbstractConditionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAbstractCondition_in_rule__CompositeCondition__ConditionsAssignment_213007);
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
        // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4464:8: ( rule__DecorationDescription__DecorationsAssignment_3_0 )
        // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4464:9: rule__DecorationDescription__DecorationsAssignment_3_0
        {
        pushFollow(FOLLOW_rule__DecorationDescription__DecorationsAssignment_3_0_in_synpred1_InternalEMFProfileDecorationLanguage9159);
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
        "\1\uffff\2\3\3\uffff\1\3";
    static final String DFA2_minS =
        "\1\4\2\65\2\uffff\1\7\1\65";
    static final String DFA2_maxS =
        "\1\7\1\112\1\114\2\uffff\1\7\1\114";
    static final String DFA2_acceptS =
        "\3\uffff\1\1\1\2\2\uffff";
    static final String DFA2_specialS =
        "\7\uffff}>";
    static final String[] DFA2_transitionS = {
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
            return "919:1: rule__Text__Alternatives : ( ( ruleSimpleText ) | ( ruleComplexText ) );";
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
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__0_in_ruleConcreteColor1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorConstant_in_entryRuleColorConstant1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorConstant1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorConstant__ValueAssignment_in_ruleColorConstant1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_entryRuleActivation1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivation1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activation__Group__0_in_ruleActivation1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractCondition_in_entryRuleAbstractCondition1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractCondition1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractCondition__Alternatives_in_ruleAbstractCondition1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0_in_ruleCondition1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeCondition1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__0_in_ruleCompositeCondition1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedDouble_in_entryRuleSignedDouble1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedDouble1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedDouble__Group__0_in_ruleSignedDouble1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInteger_in_entryRuleSignedInteger1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedInteger1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedInteger__Group__0_in_ruleSignedInteger1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperator__Alternatives_in_ruleComparisonOperator1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOperator__Alternatives_in_ruleLogicalOperator1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LineStyle__Alternatives_in_ruleLineStyle1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Colors__Alternatives_in_ruleColors1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Directions__Alternatives_in_ruleDirections1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageDecoration_in_rule__AbstractDecoration__Alternatives1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBorderDecoration_in_rule__AbstractDecoration__Alternatives1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorDecoration_in_rule__AbstractDecoration__Alternatives1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectionDecoration_in_rule__AbstractDecoration__Alternatives1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleText_in_rule__Text__Alternatives1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexText_in_rule__Text__Alternatives1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleText__TextAssignment_0_in_rule__SimpleText__Alternatives1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleText__AttributeAssignment_1_in_rule__SimpleText__Alternatives1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group_0__0_in_rule__Color__Alternatives1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__ConcreteAssignment_1_in_rule__Color__Alternatives2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__AbstractCondition__Alternatives2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeCondition_in_rule__AbstractCondition__Alternatives2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInteger_in_rule__Type__Alternatives2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedDouble_in_rule__Type__Alternatives2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Type__Alternatives2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__Type__Alternatives2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ComparisonOperator__Alternatives2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ComparisonOperator__Alternatives2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ComparisonOperator__Alternatives2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ComparisonOperator__Alternatives2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ComparisonOperator__Alternatives2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ComparisonOperator__Alternatives2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__LogicalOperator__Alternatives2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__LogicalOperator__Alternatives2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__LineStyle__Alternatives2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LineStyle__Alternatives2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LineStyle__Alternatives2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LineStyle__Alternatives2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__LineStyle__Alternatives2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Colors__Alternatives2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Colors__Alternatives2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Colors__Alternatives2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Colors__Alternatives2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Colors__Alternatives2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Colors__Alternatives2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Colors__Alternatives2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Colors__Alternatives2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Colors__Alternatives2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Colors__Alternatives2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Colors__Alternatives2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Colors__Alternatives2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Colors__Alternatives2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Colors__Alternatives2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Colors__Alternatives2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Directions__Alternatives2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Directions__Alternatives2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Directions__Alternatives2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Directions__Alternatives2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Directions__Alternatives2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Directions__Alternatives2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Directions__Alternatives2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Directions__Alternatives2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Directions__Alternatives2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__0__Impl_in_rule__DecorationModel__Group__03028 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__1_in_rule__DecorationModel__Group__03031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__DecorationModel__Group__0__Impl3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__1__Impl_in_rule__DecorationModel__Group__13090 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__2_in_rule__DecorationModel__Group__13093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__ImportURIAssignment_1_in_rule__DecorationModel__Group__1__Impl3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__2__Impl_in_rule__DecorationModel__Group__23150 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__3_in_rule__DecorationModel__Group__23153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__NamespaceAssignment_2_in_rule__DecorationModel__Group__2__Impl3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__3__Impl_in_rule__DecorationModel__Group__33211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__DecorationDescriptionsAssignment_3_in_rule__DecorationModel__Group__3__Impl3238 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__03277 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__03280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Namespace__Group__0__Impl3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__13339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__ProfileAssignment_1_in_rule__Namespace__Group__1__Impl3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__0__Impl_in_rule__DecorationDescription__Group__03400 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__1_in_rule__DecorationDescription__Group__03403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__DecorationDescription__Group__0__Impl3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__1__Impl_in_rule__DecorationDescription__Group__13462 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__2_in_rule__DecorationDescription__Group__13465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__StereotypeAssignment_1_in_rule__DecorationDescription__Group__1__Impl3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__2__Impl_in_rule__DecorationDescription__Group__23522 = new BitSet(new long[]{0x4C40000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__3_in_rule__DecorationDescription__Group__23525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__DecorationDescription__Group__2__Impl3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__3__Impl_in_rule__DecorationDescription__Group__33584 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__4_in_rule__DecorationDescription__Group__33587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__UnorderedGroup_3_in_rule__DecorationDescription__Group__3__Impl3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__4__Impl_in_rule__DecorationDescription__Group__43644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__DecorationDescription__Group__4__Impl3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__0__Impl_in_rule__ImageDecoration__Group__03713 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__1_in_rule__ImageDecoration__Group__03716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__1__Impl_in_rule__ImageDecoration__Group__13774 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__2_in_rule__ImageDecoration__Group__13777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__ImageDecoration__Group__1__Impl3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__2__Impl_in_rule__ImageDecoration__Group__23836 = new BitSet(new long[]{0x4EC0000000000000L,0x0000000000000430L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__3_in_rule__ImageDecoration__Group__23839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ImageDecoration__Group__2__Impl3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__3__Impl_in_rule__ImageDecoration__Group__33898 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__4_in_rule__ImageDecoration__Group__33901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3_in_rule__ImageDecoration__Group__3__Impl3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__4__Impl_in_rule__ImageDecoration__Group__43958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__ImageDecoration__Group__4__Impl3986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_0__0__Impl_in_rule__ImageDecoration__Group_3_0__04027 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_0__1_in_rule__ImageDecoration__Group_3_0__04030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__ImageDecoration__Group_3_0__0__Impl4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_0__1__Impl_in_rule__ImageDecoration__Group_3_0__14089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_0__2_in_rule__ImageDecoration__Group_3_0__14092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__ImageDecoration__Group_3_0__1__Impl4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_0__2__Impl_in_rule__ImageDecoration__Group_3_0__24151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Location_uriAssignment_3_0_2_in_rule__ImageDecoration__Group_3_0__2__Impl4178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_3__0__Impl_in_rule__ImageDecoration__Group_3_3__04214 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_3__1_in_rule__ImageDecoration__Group_3_3__04217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__ImageDecoration__Group_3_3__0__Impl4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_3__1__Impl_in_rule__ImageDecoration__Group_3_3__14276 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_3__2_in_rule__ImageDecoration__Group_3_3__14279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__ImageDecoration__Group_3_3__1__Impl4307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_3__2__Impl_in_rule__ImageDecoration__Group_3_3__24338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__TooltipAssignment_3_3_2_in_rule__ImageDecoration__Group_3_3__2__Impl4365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__0__Impl_in_rule__BorderDecoration__Group__04401 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__1_in_rule__BorderDecoration__Group__04404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__1__Impl_in_rule__BorderDecoration__Group__14462 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__2_in_rule__BorderDecoration__Group__14465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__BorderDecoration__Group__1__Impl4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__2__Impl_in_rule__BorderDecoration__Group__24524 = new BitSet(new long[]{0x4C40000000000000L,0x000000000000040CL});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__3_in_rule__BorderDecoration__Group__24527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__BorderDecoration__Group__2__Impl4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__3__Impl_in_rule__BorderDecoration__Group__34586 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__4_in_rule__BorderDecoration__Group__34589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3_in_rule__BorderDecoration__Group__3__Impl4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__4__Impl_in_rule__BorderDecoration__Group__44646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__BorderDecoration__Group__4__Impl4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group_3_1__0__Impl_in_rule__BorderDecoration__Group_3_1__04715 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group_3_1__1_in_rule__BorderDecoration__Group_3_1__04718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__BorderDecoration__Group_3_1__0__Impl4746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group_3_1__1__Impl_in_rule__BorderDecoration__Group_3_1__14777 = new BitSet(new long[]{0x000000FFFE000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group_3_1__2_in_rule__BorderDecoration__Group_3_1__14780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__BorderDecoration__Group_3_1__1__Impl4808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group_3_1__2__Impl_in_rule__BorderDecoration__Group_3_1__24839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__ColorAssignment_3_1_2_in_rule__BorderDecoration__Group_3_1__2__Impl4866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__0__Impl_in_rule__ColorDecoration__Group__04902 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__1_in_rule__ColorDecoration__Group__04905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__1__Impl_in_rule__ColorDecoration__Group__14963 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__2_in_rule__ColorDecoration__Group__14966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__ColorDecoration__Group__1__Impl4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__2__Impl_in_rule__ColorDecoration__Group__25025 = new BitSet(new long[]{0x7C40000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__3_in_rule__ColorDecoration__Group__25028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ColorDecoration__Group__2__Impl5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__3__Impl_in_rule__ColorDecoration__Group__35087 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__4_in_rule__ColorDecoration__Group__35090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__UnorderedGroup_3_in_rule__ColorDecoration__Group__3__Impl5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__4__Impl_in_rule__ColorDecoration__Group__45147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__ColorDecoration__Group__4__Impl5175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_0__0__Impl_in_rule__ColorDecoration__Group_3_0__05216 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_0__1_in_rule__ColorDecoration__Group_3_0__05219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__ColorDecoration__Group_3_0__0__Impl5247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_0__1__Impl_in_rule__ColorDecoration__Group_3_0__15278 = new BitSet(new long[]{0x000000FFFE000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_0__2_in_rule__ColorDecoration__Group_3_0__15281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__ColorDecoration__Group_3_0__1__Impl5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_0__2__Impl_in_rule__ColorDecoration__Group_3_0__25340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__BackgroundAssignment_3_0_2_in_rule__ColorDecoration__Group_3_0__2__Impl5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_1__0__Impl_in_rule__ColorDecoration__Group_3_1__05403 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_1__1_in_rule__ColorDecoration__Group_3_1__05406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__ColorDecoration__Group_3_1__0__Impl5434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_1__1__Impl_in_rule__ColorDecoration__Group_3_1__15465 = new BitSet(new long[]{0x000000FFFE000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_1__2_in_rule__ColorDecoration__Group_3_1__15468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__ColorDecoration__Group_3_1__1__Impl5496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_1__2__Impl_in_rule__ColorDecoration__Group_3_1__25527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__ForegroundAssignment_3_1_2_in_rule__ColorDecoration__Group_3_1__2__Impl5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__0__Impl_in_rule__ConnectionDecoration__Group__05590 = new BitSet(new long[]{0x4C40000000000000L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__1_in_rule__ConnectionDecoration__Group__05593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__1__Impl_in_rule__ConnectionDecoration__Group__15651 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__2_in_rule__ConnectionDecoration__Group__15654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__ConnectionDecoration__Group__1__Impl5682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__2__Impl_in_rule__ConnectionDecoration__Group__25713 = new BitSet(new long[]{0xCC40000000000000L,0x000000000000040DL});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__3_in_rule__ConnectionDecoration__Group__25716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ConnectionDecoration__Group__2__Impl5744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__3__Impl_in_rule__ConnectionDecoration__Group__35775 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__4_in_rule__ConnectionDecoration__Group__35778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3_in_rule__ConnectionDecoration__Group__3__Impl5805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__4__Impl_in_rule__ConnectionDecoration__Group__45835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__ConnectionDecoration__Group__4__Impl5863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_2__0__Impl_in_rule__ConnectionDecoration__Group_3_2__05904 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_2__1_in_rule__ConnectionDecoration__Group_3_2__05907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__ConnectionDecoration__Group_3_2__0__Impl5935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_2__1__Impl_in_rule__ConnectionDecoration__Group_3_2__15966 = new BitSet(new long[]{0x000000FFFE000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_2__2_in_rule__ConnectionDecoration__Group_3_2__15969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__ConnectionDecoration__Group_3_2__1__Impl5997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_2__2__Impl_in_rule__ConnectionDecoration__Group_3_2__26028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2_in_rule__ConnectionDecoration__Group_3_2__2__Impl6055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_3__0__Impl_in_rule__ConnectionDecoration__Group_3_3__06091 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_3__1_in_rule__ConnectionDecoration__Group_3_3__06094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__ConnectionDecoration__Group_3_3__0__Impl6122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_3__1__Impl_in_rule__ConnectionDecoration__Group_3_3__16153 = new BitSet(new long[]{0x000000FFFE000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_3__2_in_rule__ConnectionDecoration__Group_3_3__16156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__ConnectionDecoration__Group_3_3__1__Impl6184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_3__2__Impl_in_rule__ConnectionDecoration__Group_3_3__26215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2_in_rule__ConnectionDecoration__Group_3_3__2__Impl6242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexText__Group__0__Impl_in_rule__ComplexText__Group__06278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexText__Group__1_in_rule__ComplexText__Group__06281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexText__LeftAssignment_0_in_rule__ComplexText__Group__0__Impl6308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexText__Group__1__Impl_in_rule__ComplexText__Group__16338 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_rule__ComplexText__Group__2_in_rule__ComplexText__Group__16341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__ComplexText__Group__1__Impl6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexText__Group__2__Impl_in_rule__ComplexText__Group__26400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexText__RightAssignment_2_in_rule__ComplexText__Group__2__Impl6427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__Group__0__Impl_in_rule__Style__Group__06463 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__Style__Group__1_in_rule__Style__Group__06466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__Style__Group__0__Impl6494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__Group__1__Impl_in_rule__Style__Group__16525 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_rule__Style__Group__2_in_rule__Style__Group__16528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Style__Group__1__Impl6556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__Group__2__Impl_in_rule__Style__Group__26587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__ValueAssignment_2_in_rule__Style__Group__2__Impl6614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__0__Impl_in_rule__Size__Group__06650 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__Size__Group__1_in_rule__Size__Group__06653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__Size__Group__0__Impl6681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__1__Impl_in_rule__Size__Group__16712 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Size__Group__2_in_rule__Size__Group__16715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Size__Group__1__Impl6743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__2__Impl_in_rule__Size__Group__26774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__ValueAssignment_2_in_rule__Size__Group__2__Impl6801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Direction__Group__0__Impl_in_rule__Direction__Group__06837 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__Direction__Group__1_in_rule__Direction__Group__06840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__Direction__Group__0__Impl6868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Direction__Group__1__Impl_in_rule__Direction__Group__16899 = new BitSet(new long[]{0x0001FF0000000000L});
    public static final BitSet FOLLOW_rule__Direction__Group__2_in_rule__Direction__Group__16902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Direction__Group__1__Impl6930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Direction__Group__2__Impl_in_rule__Direction__Group__26961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Direction__ValueAssignment_2_in_rule__Direction__Group__2__Impl6988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Margin__Group__0__Impl_in_rule__Margin__Group__07024 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__Margin__Group__1_in_rule__Margin__Group__07027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__Margin__Group__0__Impl7055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Margin__Group__1__Impl_in_rule__Margin__Group__17086 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Margin__Group__2_in_rule__Margin__Group__17089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Margin__Group__1__Impl7117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Margin__Group__2__Impl_in_rule__Margin__Group__27148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Margin__ValueAssignment_2_in_rule__Margin__Group__2__Impl7175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group_0__0__Impl_in_rule__Color__Group_0__07211 = new BitSet(new long[]{0x000000FFFE000000L});
    public static final BitSet FOLLOW_rule__Color__Group_0__1_in_rule__Color__Group_0__07214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group_0__1__Impl_in_rule__Color__Group_0__17272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__ValueAssignment_0_1_in_rule__Color__Group_0__1__Impl7299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__0__Impl_in_rule__ConcreteColor__Group__07333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__1_in_rule__ConcreteColor__Group__07336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__ConcreteColor__Group__0__Impl7364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__1__Impl_in_rule__ConcreteColor__Group__17395 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__2_in_rule__ConcreteColor__Group__17398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__ConcreteColor__Group__1__Impl7426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__2__Impl_in_rule__ConcreteColor__Group__27457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__3_in_rule__ConcreteColor__Group__27460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteColor__RedAssignment_2_in_rule__ConcreteColor__Group__2__Impl7487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__3__Impl_in_rule__ConcreteColor__Group__37517 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__4_in_rule__ConcreteColor__Group__37520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__ConcreteColor__Group__3__Impl7548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__4__Impl_in_rule__ConcreteColor__Group__47579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__5_in_rule__ConcreteColor__Group__47582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteColor__GreenAssignment_4_in_rule__ConcreteColor__Group__4__Impl7609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__5__Impl_in_rule__ConcreteColor__Group__57639 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__6_in_rule__ConcreteColor__Group__57642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__ConcreteColor__Group__5__Impl7670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__6__Impl_in_rule__ConcreteColor__Group__67701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__7_in_rule__ConcreteColor__Group__67704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteColor__BlueAssignment_6_in_rule__ConcreteColor__Group__6__Impl7731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__7__Impl_in_rule__ConcreteColor__Group__77761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__ConcreteColor__Group__7__Impl7789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activation__Group__0__Impl_in_rule__Activation__Group__07836 = new BitSet(new long[]{0x00000000000C0080L});
    public static final BitSet FOLLOW_rule__Activation__Group__1_in_rule__Activation__Group__07839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__Activation__Group__0__Impl7867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activation__Group__1__Impl_in_rule__Activation__Group__17898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activation__ConditionAssignment_1_in_rule__Activation__Group__1__Impl7925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__07959 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__07962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__AttributeAssignment_0_in_rule__Condition__Group__0__Impl7989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__18019 = new BitSet(new long[]{0x0000000000000070L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__18022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__OperatorAssignment_1_in_rule__Condition__Group__1__Impl8049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__28079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__ValueAssignment_2_in_rule__Condition__Group__2__Impl8106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__0__Impl_in_rule__CompositeCondition__Group__08142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__1_in_rule__CompositeCondition__Group__08145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeCondition__OperatorAssignment_0_in_rule__CompositeCondition__Group__0__Impl8172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__1__Impl_in_rule__CompositeCondition__Group__18202 = new BitSet(new long[]{0x00000000000C0080L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__2_in_rule__CompositeCondition__Group__18205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__CompositeCondition__Group__1__Impl8233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__2__Impl_in_rule__CompositeCondition__Group__28264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__3_in_rule__CompositeCondition__Group__28267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeCondition__ConditionsAssignment_2_in_rule__CompositeCondition__Group__2__Impl8296 = new BitSet(new long[]{0x00000000000C0082L});
    public static final BitSet FOLLOW_rule__CompositeCondition__ConditionsAssignment_2_in_rule__CompositeCondition__Group__2__Impl8308 = new BitSet(new long[]{0x00000000000C0082L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__3__Impl_in_rule__CompositeCondition__Group__38341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__CompositeCondition__Group__3__Impl8369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedDouble__Group__0__Impl_in_rule__SignedDouble__Group__08408 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__SignedDouble__Group__1_in_rule__SignedDouble__Group__08411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__SignedDouble__Group__0__Impl8440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedDouble__Group__1__Impl_in_rule__SignedDouble__Group__18473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SignedDouble__Group__2_in_rule__SignedDouble__Group__18476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SignedDouble__Group__1__Impl8503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedDouble__Group__2__Impl_in_rule__SignedDouble__Group__28532 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SignedDouble__Group__3_in_rule__SignedDouble__Group__28535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__SignedDouble__Group__2__Impl8563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedDouble__Group__3__Impl_in_rule__SignedDouble__Group__38594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SignedDouble__Group__3__Impl8621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedInteger__Group__0__Impl_in_rule__SignedInteger__Group__08658 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__SignedInteger__Group__1_in_rule__SignedInteger__Group__08661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__SignedInteger__Group__0__Impl8690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedInteger__Group__1__Impl_in_rule__SignedInteger__Group__18723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SignedInteger__Group__1__Impl8750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8870 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08905 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__QualifiedName__Group_1__0__Impl8936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl8994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__UnorderedGroup_3__0_in_rule__DecorationDescription__UnorderedGroup_39028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__DecorationsAssignment_3_0_in_rule__DecorationDescription__UnorderedGroup_3__Impl9118 = new BitSet(new long[]{0x4C40000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__DecorationsAssignment_3_0_in_rule__DecorationDescription__UnorderedGroup_3__Impl9162 = new BitSet(new long[]{0x4C40000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__ActivationAssignment_3_1_in_rule__DecorationDescription__UnorderedGroup_3__Impl9260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__UnorderedGroup_3__Impl_in_rule__DecorationDescription__UnorderedGroup_3__09319 = new BitSet(new long[]{0x4C40000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__DecorationDescription__UnorderedGroup_3__1_in_rule__DecorationDescription__UnorderedGroup_3__09322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__UnorderedGroup_3__Impl_in_rule__DecorationDescription__UnorderedGroup_3__19347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__0_in_rule__ImageDecoration__UnorderedGroup_39375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_0__0_in_rule__ImageDecoration__UnorderedGroup_3__Impl9464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__DirectionAssignment_3_1_in_rule__ImageDecoration__UnorderedGroup_3__Impl9555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__MarginAssignment_3_2_in_rule__ImageDecoration__UnorderedGroup_3__Impl9646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_3__0_in_rule__ImageDecoration__UnorderedGroup_3__Impl9737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__ActivationAssignment_3_4_in_rule__ImageDecoration__UnorderedGroup_3__Impl9828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__09887 = new BitSet(new long[]{0x4EC0000000000002L,0x0000000000000430L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__1_in_rule__ImageDecoration__UnorderedGroup_3__09890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__19915 = new BitSet(new long[]{0x4EC0000000000002L,0x0000000000000430L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__2_in_rule__ImageDecoration__UnorderedGroup_3__19918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__29943 = new BitSet(new long[]{0x4EC0000000000002L,0x0000000000000430L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__3_in_rule__ImageDecoration__UnorderedGroup_3__29946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__39971 = new BitSet(new long[]{0x4EC0000000000002L,0x0000000000000430L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__4_in_rule__ImageDecoration__UnorderedGroup_3__39974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__49999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__0_in_rule__BorderDecoration__UnorderedGroup_310033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__SizeAssignment_3_0_in_rule__BorderDecoration__UnorderedGroup_3__Impl10120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group_3_1__0_in_rule__BorderDecoration__UnorderedGroup_3__Impl10211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__StyleAssignment_3_2_in_rule__BorderDecoration__UnorderedGroup_3__Impl10302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__ActivationAssignment_3_3_in_rule__BorderDecoration__UnorderedGroup_3__Impl10393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__010452 = new BitSet(new long[]{0x4C40000000000002L,0x000000000000040CL});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__1_in_rule__BorderDecoration__UnorderedGroup_3__010455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__110480 = new BitSet(new long[]{0x4C40000000000002L,0x000000000000040CL});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__2_in_rule__BorderDecoration__UnorderedGroup_3__110483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__210508 = new BitSet(new long[]{0x4C40000000000002L,0x000000000000040CL});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__3_in_rule__BorderDecoration__UnorderedGroup_3__210511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__310536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__UnorderedGroup_3__0_in_rule__ColorDecoration__UnorderedGroup_310568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_0__0_in_rule__ColorDecoration__UnorderedGroup_3__Impl10655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_1__0_in_rule__ColorDecoration__UnorderedGroup_3__Impl10746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__ActivationAssignment_3_2_in_rule__ColorDecoration__UnorderedGroup_3__Impl10837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__UnorderedGroup_3__Impl_in_rule__ColorDecoration__UnorderedGroup_3__010896 = new BitSet(new long[]{0x7C40000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__ColorDecoration__UnorderedGroup_3__1_in_rule__ColorDecoration__UnorderedGroup_3__010899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__UnorderedGroup_3__Impl_in_rule__ColorDecoration__UnorderedGroup_3__110924 = new BitSet(new long[]{0x7C40000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__ColorDecoration__UnorderedGroup_3__2_in_rule__ColorDecoration__UnorderedGroup_3__110927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__UnorderedGroup_3__Impl_in_rule__ColorDecoration__UnorderedGroup_3__210952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__0_in_rule__ConnectionDecoration__UnorderedGroup_310982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__SizeAssignment_3_0_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__StyleAssignment_3_1_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_2__0_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_3__0_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__ActivationAssignment_3_4_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__011492 = new BitSet(new long[]{0xCC40000000000002L,0x000000000000040DL});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__1_in_rule__ConnectionDecoration__UnorderedGroup_3__011495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__111520 = new BitSet(new long[]{0xCC40000000000002L,0x000000000000040DL});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__2_in_rule__ConnectionDecoration__UnorderedGroup_3__111523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__211548 = new BitSet(new long[]{0xCC40000000000002L,0x000000000000040DL});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__3_in_rule__ConnectionDecoration__UnorderedGroup_3__211551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__311576 = new BitSet(new long[]{0xCC40000000000002L,0x000000000000040DL});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__4_in_rule__ConnectionDecoration__UnorderedGroup_3__311579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__411604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DecorationModel__ImportURIAssignment_111642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_rule__DecorationModel__NamespaceAssignment_211673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecorationDescription_in_rule__DecorationModel__DecorationDescriptionsAssignment_311704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Namespace__ProfileAssignment_111739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DecorationDescription__StereotypeAssignment_111778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDecoration_in_rule__DecorationDescription__DecorationsAssignment_3_011813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_rule__DecorationDescription__ActivationAssignment_3_111844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ImageDecoration__Location_uriAssignment_3_0_211875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_rule__ImageDecoration__DirectionAssignment_3_111906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMargin_in_rule__ImageDecoration__MarginAssignment_3_211937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ImageDecoration__TooltipAssignment_3_3_211968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_rule__ImageDecoration__ActivationAssignment_3_411999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_rule__BorderDecoration__SizeAssignment_3_012030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__BorderDecoration__ColorAssignment_3_1_212061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyle_in_rule__BorderDecoration__StyleAssignment_3_212092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_rule__BorderDecoration__ActivationAssignment_3_312123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__ColorDecoration__BackgroundAssignment_3_0_212154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__ColorDecoration__ForegroundAssignment_3_1_212185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_rule__ColorDecoration__ActivationAssignment_3_212216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_rule__ConnectionDecoration__SizeAssignment_3_012247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyle_in_rule__ConnectionDecoration__StyleAssignment_3_112278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__ConnectionDecoration__ForegroundColorAssignment_3_2_212309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__ConnectionDecoration__BackgroundColorAssignment_3_3_212340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_rule__ConnectionDecoration__ActivationAssignment_3_412371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleText__TextAssignment_012402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__SimpleText__AttributeAssignment_112437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleText_in_rule__ComplexText__LeftAssignment_012472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ComplexText__RightAssignment_212503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineStyle_in_rule__Style__ValueAssignment_212534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Size__ValueAssignment_212565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirections_in_rule__Direction__ValueAssignment_212596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInteger_in_rule__Margin__ValueAssignment_212627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorConstant_in_rule__Color__ValueAssignment_0_112658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteColor_in_rule__Color__ConcreteAssignment_112689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ConcreteColor__RedAssignment_212720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ConcreteColor__GreenAssignment_412751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ConcreteColor__BlueAssignment_612782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColors_in_rule__ColorConstant__ValueAssignment12813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractCondition_in_rule__Activation__ConditionAssignment_112844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Condition__AttributeAssignment_012879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_rule__Condition__OperatorAssignment_112914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Condition__ValueAssignment_212945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOperator_in_rule__CompositeCondition__OperatorAssignment_012976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractCondition_in_rule__CompositeCondition__ConditionsAssignment_213007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__DecorationsAssignment_3_0_in_synpred1_InternalEMFProfileDecorationLanguage9159 = new BitSet(new long[]{0x0000000000000002L});

}
