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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'all'", "'any'", "'solid'", "'dot'", "'dash'", "'dash_dot'", "'dash_dot_dot'", "'red'", "'black'", "'white'", "'green'", "'green_light'", "'green_dark'", "'blue'", "'blue_light'", "'blue_dark'", "'gray'", "'gray_light'", "'gray_dark'", "'orange'", "'yellow'", "'cyan'", "'center'", "'north'", "'south'", "'west'", "'east'", "'north_east'", "'north_west'", "'south_east'", "'south_west'", "'import resource'", "'profile'", "'decoration'", "'{'", "'}'", "'image'", "'location-uri'", "'='", "'tooltip'", "'border'", "'color'", "'background'", "'foreground'", "'connection'", "'foreground-color'", "'background-color'", "'+'", "'line-style'", "'size'", "'direction'", "'margin'", "'RGB'", "'('", "','", "')'", "'active when'", "'-'", "'.'"
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
    public static final int T__12=12;
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
    public static final int RULE_ML_COMMENT=8;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1007:1: rule__Type__Alternatives : ( ( ruleSignedInteger ) | ( ruleSignedDouble ) | ( RULE_STRING ) | ( RULE_BOOLEAN ) | ( RULE_ID ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1011:1: ( ( ruleSignedInteger ) | ( ruleSignedDouble ) | ( RULE_STRING ) | ( RULE_BOOLEAN ) | ( RULE_ID ) )
            int alt6=5;
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
            case RULE_ID:
                {
                alt6=5;
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
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1036:6: ( RULE_ID )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1036:6: ( RULE_ID )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1037:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getIDTerminalRuleCall_4()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Type__Alternatives2163); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1047:1: rule__ComparisonOperator__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1051:1: ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) )
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1052:1: ( ( '==' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1052:1: ( ( '==' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1053:1: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1054:1: ( '==' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1054:3: '=='
                    {
                    match(input,12,FOLLOW_12_in_rule__ComparisonOperator__Alternatives2196); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1059:6: ( ( '!=' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1059:6: ( ( '!=' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1060:1: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getUNEQUALEnumLiteralDeclaration_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1061:1: ( '!=' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1061:3: '!='
                    {
                    match(input,13,FOLLOW_13_in_rule__ComparisonOperator__Alternatives2217); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getUNEQUALEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1066:6: ( ( '>' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1066:6: ( ( '>' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1067:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1068:1: ( '>' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1068:3: '>'
                    {
                    match(input,14,FOLLOW_14_in_rule__ComparisonOperator__Alternatives2238); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1073:6: ( ( '>=' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1073:6: ( ( '>=' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1074:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getGREATEROREQUALEnumLiteralDeclaration_3()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1075:1: ( '>=' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1075:3: '>='
                    {
                    match(input,15,FOLLOW_15_in_rule__ComparisonOperator__Alternatives2259); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getGREATEROREQUALEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1080:6: ( ( '<' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1080:6: ( ( '<' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1081:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getLOWEREnumLiteralDeclaration_4()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1082:1: ( '<' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1082:3: '<'
                    {
                    match(input,16,FOLLOW_16_in_rule__ComparisonOperator__Alternatives2280); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getLOWEREnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1087:6: ( ( '<=' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1087:6: ( ( '<=' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1088:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getLOWEROREQUALEnumLiteralDeclaration_5()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1089:1: ( '<=' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1089:3: '<='
                    {
                    match(input,17,FOLLOW_17_in_rule__ComparisonOperator__Alternatives2301); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1099:1: rule__LogicalOperator__Alternatives : ( ( ( 'all' ) ) | ( ( 'any' ) ) );
    public final void rule__LogicalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1103:1: ( ( ( 'all' ) ) | ( ( 'any' ) ) )
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1104:1: ( ( 'all' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1104:1: ( ( 'all' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1105:1: ( 'all' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicalOperatorAccess().getALLEnumLiteralDeclaration_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1106:1: ( 'all' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1106:3: 'all'
                    {
                    match(input,18,FOLLOW_18_in_rule__LogicalOperator__Alternatives2337); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicalOperatorAccess().getALLEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1111:6: ( ( 'any' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1111:6: ( ( 'any' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1112:1: ( 'any' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicalOperatorAccess().getANYEnumLiteralDeclaration_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1113:1: ( 'any' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1113:3: 'any'
                    {
                    match(input,19,FOLLOW_19_in_rule__LogicalOperator__Alternatives2358); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1123:1: rule__LineStyle__Alternatives : ( ( ( 'solid' ) ) | ( ( 'dot' ) ) | ( ( 'dash' ) ) | ( ( 'dash_dot' ) ) | ( ( 'dash_dot_dot' ) ) );
    public final void rule__LineStyle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1127:1: ( ( ( 'solid' ) ) | ( ( 'dot' ) ) | ( ( 'dash' ) ) | ( ( 'dash_dot' ) ) | ( ( 'dash_dot_dot' ) ) )
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1128:1: ( ( 'solid' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1128:1: ( ( 'solid' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1129:1: ( 'solid' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLineStyleAccess().getLINE_SOLIDEnumLiteralDeclaration_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1130:1: ( 'solid' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1130:3: 'solid'
                    {
                    match(input,20,FOLLOW_20_in_rule__LineStyle__Alternatives2394); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLineStyleAccess().getLINE_SOLIDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1135:6: ( ( 'dot' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1135:6: ( ( 'dot' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1136:1: ( 'dot' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLineStyleAccess().getLINE_DOTEnumLiteralDeclaration_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1137:1: ( 'dot' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1137:3: 'dot'
                    {
                    match(input,21,FOLLOW_21_in_rule__LineStyle__Alternatives2415); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLineStyleAccess().getLINE_DOTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1142:6: ( ( 'dash' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1142:6: ( ( 'dash' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1143:1: ( 'dash' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLineStyleAccess().getLINE_DASHEnumLiteralDeclaration_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1144:1: ( 'dash' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1144:3: 'dash'
                    {
                    match(input,22,FOLLOW_22_in_rule__LineStyle__Alternatives2436); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLineStyleAccess().getLINE_DASHEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1149:6: ( ( 'dash_dot' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1149:6: ( ( 'dash_dot' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1150:1: ( 'dash_dot' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLineStyleAccess().getLINE_DASHDOTEnumLiteralDeclaration_3()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1151:1: ( 'dash_dot' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1151:3: 'dash_dot'
                    {
                    match(input,23,FOLLOW_23_in_rule__LineStyle__Alternatives2457); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLineStyleAccess().getLINE_DASHDOTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1156:6: ( ( 'dash_dot_dot' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1156:6: ( ( 'dash_dot_dot' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1157:1: ( 'dash_dot_dot' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLineStyleAccess().getLINE_DASHDOTDOTEnumLiteralDeclaration_4()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1158:1: ( 'dash_dot_dot' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1158:3: 'dash_dot_dot'
                    {
                    match(input,24,FOLLOW_24_in_rule__LineStyle__Alternatives2478); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1168:1: rule__Colors__Alternatives : ( ( ( 'red' ) ) | ( ( 'black' ) ) | ( ( 'white' ) ) | ( ( 'green' ) ) | ( ( 'green_light' ) ) | ( ( 'green_dark' ) ) | ( ( 'blue' ) ) | ( ( 'blue_light' ) ) | ( ( 'blue_dark' ) ) | ( ( 'gray' ) ) | ( ( 'gray_light' ) ) | ( ( 'gray_dark' ) ) | ( ( 'orange' ) ) | ( ( 'yellow' ) ) | ( ( 'cyan' ) ) );
    public final void rule__Colors__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1172:1: ( ( ( 'red' ) ) | ( ( 'black' ) ) | ( ( 'white' ) ) | ( ( 'green' ) ) | ( ( 'green_light' ) ) | ( ( 'green_dark' ) ) | ( ( 'blue' ) ) | ( ( 'blue_light' ) ) | ( ( 'blue_dark' ) ) | ( ( 'gray' ) ) | ( ( 'gray_light' ) ) | ( ( 'gray_dark' ) ) | ( ( 'orange' ) ) | ( ( 'yellow' ) ) | ( ( 'cyan' ) ) )
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1173:1: ( ( 'red' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1173:1: ( ( 'red' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1174:1: ( 'red' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1175:1: ( 'red' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1175:3: 'red'
                    {
                    match(input,25,FOLLOW_25_in_rule__Colors__Alternatives2514); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1180:6: ( ( 'black' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1180:6: ( ( 'black' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1181:1: ( 'black' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1182:1: ( 'black' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1182:3: 'black'
                    {
                    match(input,26,FOLLOW_26_in_rule__Colors__Alternatives2535); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1187:6: ( ( 'white' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1187:6: ( ( 'white' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1188:1: ( 'white' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1189:1: ( 'white' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1189:3: 'white'
                    {
                    match(input,27,FOLLOW_27_in_rule__Colors__Alternatives2556); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1194:6: ( ( 'green' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1194:6: ( ( 'green' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1195:1: ( 'green' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_3()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1196:1: ( 'green' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1196:3: 'green'
                    {
                    match(input,28,FOLLOW_28_in_rule__Colors__Alternatives2577); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1201:6: ( ( 'green_light' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1201:6: ( ( 'green_light' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1202:1: ( 'green_light' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getGREEN_LIGHTEnumLiteralDeclaration_4()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1203:1: ( 'green_light' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1203:3: 'green_light'
                    {
                    match(input,29,FOLLOW_29_in_rule__Colors__Alternatives2598); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getGREEN_LIGHTEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1208:6: ( ( 'green_dark' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1208:6: ( ( 'green_dark' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1209:1: ( 'green_dark' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getGREEN_DARKEnumLiteralDeclaration_5()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1210:1: ( 'green_dark' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1210:3: 'green_dark'
                    {
                    match(input,30,FOLLOW_30_in_rule__Colors__Alternatives2619); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getGREEN_DARKEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1215:6: ( ( 'blue' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1215:6: ( ( 'blue' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1216:1: ( 'blue' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_6()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1217:1: ( 'blue' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1217:3: 'blue'
                    {
                    match(input,31,FOLLOW_31_in_rule__Colors__Alternatives2640); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1222:6: ( ( 'blue_light' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1222:6: ( ( 'blue_light' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1223:1: ( 'blue_light' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getBLUE_LIGHTEnumLiteralDeclaration_7()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1224:1: ( 'blue_light' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1224:3: 'blue_light'
                    {
                    match(input,32,FOLLOW_32_in_rule__Colors__Alternatives2661); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getBLUE_LIGHTEnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1229:6: ( ( 'blue_dark' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1229:6: ( ( 'blue_dark' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1230:1: ( 'blue_dark' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getBLUE_DARKEnumLiteralDeclaration_8()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1231:1: ( 'blue_dark' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1231:3: 'blue_dark'
                    {
                    match(input,33,FOLLOW_33_in_rule__Colors__Alternatives2682); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getBLUE_DARKEnumLiteralDeclaration_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1236:6: ( ( 'gray' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1236:6: ( ( 'gray' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1237:1: ( 'gray' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_9()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1238:1: ( 'gray' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1238:3: 'gray'
                    {
                    match(input,34,FOLLOW_34_in_rule__Colors__Alternatives2703); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1243:6: ( ( 'gray_light' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1243:6: ( ( 'gray_light' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1244:1: ( 'gray_light' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getGRAY_LIGHTEnumLiteralDeclaration_10()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1245:1: ( 'gray_light' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1245:3: 'gray_light'
                    {
                    match(input,35,FOLLOW_35_in_rule__Colors__Alternatives2724); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getGRAY_LIGHTEnumLiteralDeclaration_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1250:6: ( ( 'gray_dark' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1250:6: ( ( 'gray_dark' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1251:1: ( 'gray_dark' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getGRAY_DARKEnumLiteralDeclaration_11()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1252:1: ( 'gray_dark' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1252:3: 'gray_dark'
                    {
                    match(input,36,FOLLOW_36_in_rule__Colors__Alternatives2745); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getGRAY_DARKEnumLiteralDeclaration_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1257:6: ( ( 'orange' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1257:6: ( ( 'orange' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1258:1: ( 'orange' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_12()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1259:1: ( 'orange' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1259:3: 'orange'
                    {
                    match(input,37,FOLLOW_37_in_rule__Colors__Alternatives2766); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1264:6: ( ( 'yellow' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1264:6: ( ( 'yellow' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1265:1: ( 'yellow' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_13()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1266:1: ( 'yellow' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1266:3: 'yellow'
                    {
                    match(input,38,FOLLOW_38_in_rule__Colors__Alternatives2787); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1271:6: ( ( 'cyan' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1271:6: ( ( 'cyan' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1272:1: ( 'cyan' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorsAccess().getCYANEnumLiteralDeclaration_14()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1273:1: ( 'cyan' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1273:3: 'cyan'
                    {
                    match(input,39,FOLLOW_39_in_rule__Colors__Alternatives2808); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1283:1: rule__Directions__Alternatives : ( ( ( 'center' ) ) | ( ( 'north' ) ) | ( ( 'south' ) ) | ( ( 'west' ) ) | ( ( 'east' ) ) | ( ( 'north_east' ) ) | ( ( 'north_west' ) ) | ( ( 'south_east' ) ) | ( ( 'south_west' ) ) );
    public final void rule__Directions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1287:1: ( ( ( 'center' ) ) | ( ( 'north' ) ) | ( ( 'south' ) ) | ( ( 'west' ) ) | ( ( 'east' ) ) | ( ( 'north_east' ) ) | ( ( 'north_west' ) ) | ( ( 'south_east' ) ) | ( ( 'south_west' ) ) )
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1288:1: ( ( 'center' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1288:1: ( ( 'center' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1289:1: ( 'center' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getCENTEREnumLiteralDeclaration_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1290:1: ( 'center' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1290:3: 'center'
                    {
                    match(input,40,FOLLOW_40_in_rule__Directions__Alternatives2844); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getCENTEREnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1295:6: ( ( 'north' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1295:6: ( ( 'north' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1296:1: ( 'north' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getNORHTEnumLiteralDeclaration_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1297:1: ( 'north' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1297:3: 'north'
                    {
                    match(input,41,FOLLOW_41_in_rule__Directions__Alternatives2865); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getNORHTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1302:6: ( ( 'south' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1302:6: ( ( 'south' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1303:1: ( 'south' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getSOUTHEnumLiteralDeclaration_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1304:1: ( 'south' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1304:3: 'south'
                    {
                    match(input,42,FOLLOW_42_in_rule__Directions__Alternatives2886); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getSOUTHEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1309:6: ( ( 'west' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1309:6: ( ( 'west' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1310:1: ( 'west' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getWESTEnumLiteralDeclaration_3()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1311:1: ( 'west' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1311:3: 'west'
                    {
                    match(input,43,FOLLOW_43_in_rule__Directions__Alternatives2907); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getWESTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1316:6: ( ( 'east' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1316:6: ( ( 'east' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1317:1: ( 'east' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getEASTEnumLiteralDeclaration_4()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1318:1: ( 'east' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1318:3: 'east'
                    {
                    match(input,44,FOLLOW_44_in_rule__Directions__Alternatives2928); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getEASTEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1323:6: ( ( 'north_east' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1323:6: ( ( 'north_east' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1324:1: ( 'north_east' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getNORTH_EASTEnumLiteralDeclaration_5()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1325:1: ( 'north_east' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1325:3: 'north_east'
                    {
                    match(input,45,FOLLOW_45_in_rule__Directions__Alternatives2949); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getNORTH_EASTEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1330:6: ( ( 'north_west' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1330:6: ( ( 'north_west' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1331:1: ( 'north_west' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getNORTH_WESTEnumLiteralDeclaration_6()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1332:1: ( 'north_west' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1332:3: 'north_west'
                    {
                    match(input,46,FOLLOW_46_in_rule__Directions__Alternatives2970); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getNORTH_WESTEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1337:6: ( ( 'south_east' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1337:6: ( ( 'south_east' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1338:1: ( 'south_east' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getSOUTH_EASTEnumLiteralDeclaration_7()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1339:1: ( 'south_east' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1339:3: 'south_east'
                    {
                    match(input,47,FOLLOW_47_in_rule__Directions__Alternatives2991); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDirectionsAccess().getSOUTH_EASTEnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1344:6: ( ( 'south_west' ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1344:6: ( ( 'south_west' ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1345:1: ( 'south_west' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDirectionsAccess().getSOUTH_WESTEnumLiteralDeclaration_8()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1346:1: ( 'south_west' )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1346:3: 'south_west'
                    {
                    match(input,48,FOLLOW_48_in_rule__Directions__Alternatives3012); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1358:1: rule__DecorationModel__Group__0 : rule__DecorationModel__Group__0__Impl rule__DecorationModel__Group__1 ;
    public final void rule__DecorationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1362:1: ( rule__DecorationModel__Group__0__Impl rule__DecorationModel__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1363:2: rule__DecorationModel__Group__0__Impl rule__DecorationModel__Group__1
            {
            pushFollow(FOLLOW_rule__DecorationModel__Group__0__Impl_in_rule__DecorationModel__Group__03045);
            rule__DecorationModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DecorationModel__Group__1_in_rule__DecorationModel__Group__03048);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1370:1: rule__DecorationModel__Group__0__Impl : ( 'import resource' ) ;
    public final void rule__DecorationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1374:1: ( ( 'import resource' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1375:1: ( 'import resource' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1375:1: ( 'import resource' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1376:1: 'import resource'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationModelAccess().getImportResourceKeyword_0()); 
            }
            match(input,49,FOLLOW_49_in_rule__DecorationModel__Group__0__Impl3076); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1389:1: rule__DecorationModel__Group__1 : rule__DecorationModel__Group__1__Impl rule__DecorationModel__Group__2 ;
    public final void rule__DecorationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1393:1: ( rule__DecorationModel__Group__1__Impl rule__DecorationModel__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1394:2: rule__DecorationModel__Group__1__Impl rule__DecorationModel__Group__2
            {
            pushFollow(FOLLOW_rule__DecorationModel__Group__1__Impl_in_rule__DecorationModel__Group__13107);
            rule__DecorationModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DecorationModel__Group__2_in_rule__DecorationModel__Group__13110);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1401:1: rule__DecorationModel__Group__1__Impl : ( ( rule__DecorationModel__ImportURIAssignment_1 ) ) ;
    public final void rule__DecorationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1405:1: ( ( ( rule__DecorationModel__ImportURIAssignment_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1406:1: ( ( rule__DecorationModel__ImportURIAssignment_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1406:1: ( ( rule__DecorationModel__ImportURIAssignment_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1407:1: ( rule__DecorationModel__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationModelAccess().getImportURIAssignment_1()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1408:1: ( rule__DecorationModel__ImportURIAssignment_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1408:2: rule__DecorationModel__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__DecorationModel__ImportURIAssignment_1_in_rule__DecorationModel__Group__1__Impl3137);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1418:1: rule__DecorationModel__Group__2 : rule__DecorationModel__Group__2__Impl rule__DecorationModel__Group__3 ;
    public final void rule__DecorationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1422:1: ( rule__DecorationModel__Group__2__Impl rule__DecorationModel__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1423:2: rule__DecorationModel__Group__2__Impl rule__DecorationModel__Group__3
            {
            pushFollow(FOLLOW_rule__DecorationModel__Group__2__Impl_in_rule__DecorationModel__Group__23167);
            rule__DecorationModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DecorationModel__Group__3_in_rule__DecorationModel__Group__23170);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1430:1: rule__DecorationModel__Group__2__Impl : ( ( rule__DecorationModel__NamespaceAssignment_2 )? ) ;
    public final void rule__DecorationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1434:1: ( ( ( rule__DecorationModel__NamespaceAssignment_2 )? ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1435:1: ( ( rule__DecorationModel__NamespaceAssignment_2 )? )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1435:1: ( ( rule__DecorationModel__NamespaceAssignment_2 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1436:1: ( rule__DecorationModel__NamespaceAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationModelAccess().getNamespaceAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1437:1: ( rule__DecorationModel__NamespaceAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==50) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1437:2: rule__DecorationModel__NamespaceAssignment_2
                    {
                    pushFollow(FOLLOW_rule__DecorationModel__NamespaceAssignment_2_in_rule__DecorationModel__Group__2__Impl3197);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1447:1: rule__DecorationModel__Group__3 : rule__DecorationModel__Group__3__Impl ;
    public final void rule__DecorationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1451:1: ( rule__DecorationModel__Group__3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1452:2: rule__DecorationModel__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DecorationModel__Group__3__Impl_in_rule__DecorationModel__Group__33228);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1458:1: rule__DecorationModel__Group__3__Impl : ( ( rule__DecorationModel__DecorationDescriptionsAssignment_3 )* ) ;
    public final void rule__DecorationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1462:1: ( ( ( rule__DecorationModel__DecorationDescriptionsAssignment_3 )* ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1463:1: ( ( rule__DecorationModel__DecorationDescriptionsAssignment_3 )* )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1463:1: ( ( rule__DecorationModel__DecorationDescriptionsAssignment_3 )* )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1464:1: ( rule__DecorationModel__DecorationDescriptionsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationModelAccess().getDecorationDescriptionsAssignment_3()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1465:1: ( rule__DecorationModel__DecorationDescriptionsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==51) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1465:2: rule__DecorationModel__DecorationDescriptionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__DecorationModel__DecorationDescriptionsAssignment_3_in_rule__DecorationModel__Group__3__Impl3255);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1483:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1487:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1488:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__03294);
            rule__Namespace__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__03297);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1495:1: rule__Namespace__Group__0__Impl : ( 'profile' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1499:1: ( ( 'profile' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1500:1: ( 'profile' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1500:1: ( 'profile' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1501:1: 'profile'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceAccess().getProfileKeyword_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__Namespace__Group__0__Impl3325); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1514:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1518:1: ( rule__Namespace__Group__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1519:2: rule__Namespace__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__13356);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1525:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__ProfileAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1529:1: ( ( ( rule__Namespace__ProfileAssignment_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1530:1: ( ( rule__Namespace__ProfileAssignment_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1530:1: ( ( rule__Namespace__ProfileAssignment_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1531:1: ( rule__Namespace__ProfileAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceAccess().getProfileAssignment_1()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1532:1: ( rule__Namespace__ProfileAssignment_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1532:2: rule__Namespace__ProfileAssignment_1
            {
            pushFollow(FOLLOW_rule__Namespace__ProfileAssignment_1_in_rule__Namespace__Group__1__Impl3383);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1546:1: rule__DecorationDescription__Group__0 : rule__DecorationDescription__Group__0__Impl rule__DecorationDescription__Group__1 ;
    public final void rule__DecorationDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1550:1: ( rule__DecorationDescription__Group__0__Impl rule__DecorationDescription__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1551:2: rule__DecorationDescription__Group__0__Impl rule__DecorationDescription__Group__1
            {
            pushFollow(FOLLOW_rule__DecorationDescription__Group__0__Impl_in_rule__DecorationDescription__Group__03417);
            rule__DecorationDescription__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DecorationDescription__Group__1_in_rule__DecorationDescription__Group__03420);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1558:1: rule__DecorationDescription__Group__0__Impl : ( 'decoration' ) ;
    public final void rule__DecorationDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1562:1: ( ( 'decoration' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1563:1: ( 'decoration' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1563:1: ( 'decoration' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1564:1: 'decoration'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getDecorationKeyword_0()); 
            }
            match(input,51,FOLLOW_51_in_rule__DecorationDescription__Group__0__Impl3448); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1577:1: rule__DecorationDescription__Group__1 : rule__DecorationDescription__Group__1__Impl rule__DecorationDescription__Group__2 ;
    public final void rule__DecorationDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1581:1: ( rule__DecorationDescription__Group__1__Impl rule__DecorationDescription__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1582:2: rule__DecorationDescription__Group__1__Impl rule__DecorationDescription__Group__2
            {
            pushFollow(FOLLOW_rule__DecorationDescription__Group__1__Impl_in_rule__DecorationDescription__Group__13479);
            rule__DecorationDescription__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DecorationDescription__Group__2_in_rule__DecorationDescription__Group__13482);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1589:1: rule__DecorationDescription__Group__1__Impl : ( ( rule__DecorationDescription__StereotypeAssignment_1 ) ) ;
    public final void rule__DecorationDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1593:1: ( ( ( rule__DecorationDescription__StereotypeAssignment_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1594:1: ( ( rule__DecorationDescription__StereotypeAssignment_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1594:1: ( ( rule__DecorationDescription__StereotypeAssignment_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1595:1: ( rule__DecorationDescription__StereotypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getStereotypeAssignment_1()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1596:1: ( rule__DecorationDescription__StereotypeAssignment_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1596:2: rule__DecorationDescription__StereotypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DecorationDescription__StereotypeAssignment_1_in_rule__DecorationDescription__Group__1__Impl3509);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1606:1: rule__DecorationDescription__Group__2 : rule__DecorationDescription__Group__2__Impl rule__DecorationDescription__Group__3 ;
    public final void rule__DecorationDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1610:1: ( rule__DecorationDescription__Group__2__Impl rule__DecorationDescription__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1611:2: rule__DecorationDescription__Group__2__Impl rule__DecorationDescription__Group__3
            {
            pushFollow(FOLLOW_rule__DecorationDescription__Group__2__Impl_in_rule__DecorationDescription__Group__23539);
            rule__DecorationDescription__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DecorationDescription__Group__3_in_rule__DecorationDescription__Group__23542);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1618:1: rule__DecorationDescription__Group__2__Impl : ( '{' ) ;
    public final void rule__DecorationDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1622:1: ( ( '{' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1623:1: ( '{' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1623:1: ( '{' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1624:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,52,FOLLOW_52_in_rule__DecorationDescription__Group__2__Impl3570); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1637:1: rule__DecorationDescription__Group__3 : rule__DecorationDescription__Group__3__Impl rule__DecorationDescription__Group__4 ;
    public final void rule__DecorationDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1641:1: ( rule__DecorationDescription__Group__3__Impl rule__DecorationDescription__Group__4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1642:2: rule__DecorationDescription__Group__3__Impl rule__DecorationDescription__Group__4
            {
            pushFollow(FOLLOW_rule__DecorationDescription__Group__3__Impl_in_rule__DecorationDescription__Group__33601);
            rule__DecorationDescription__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DecorationDescription__Group__4_in_rule__DecorationDescription__Group__33604);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1649:1: rule__DecorationDescription__Group__3__Impl : ( ( rule__DecorationDescription__UnorderedGroup_3 ) ) ;
    public final void rule__DecorationDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1653:1: ( ( ( rule__DecorationDescription__UnorderedGroup_3 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1654:1: ( ( rule__DecorationDescription__UnorderedGroup_3 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1654:1: ( ( rule__DecorationDescription__UnorderedGroup_3 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1655:1: ( rule__DecorationDescription__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1656:1: ( rule__DecorationDescription__UnorderedGroup_3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1656:2: rule__DecorationDescription__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__DecorationDescription__UnorderedGroup_3_in_rule__DecorationDescription__Group__3__Impl3631);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1666:1: rule__DecorationDescription__Group__4 : rule__DecorationDescription__Group__4__Impl ;
    public final void rule__DecorationDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1670:1: ( rule__DecorationDescription__Group__4__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1671:2: rule__DecorationDescription__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DecorationDescription__Group__4__Impl_in_rule__DecorationDescription__Group__43661);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1677:1: rule__DecorationDescription__Group__4__Impl : ( '}' ) ;
    public final void rule__DecorationDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1681:1: ( ( '}' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1682:1: ( '}' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1682:1: ( '}' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1683:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,53,FOLLOW_53_in_rule__DecorationDescription__Group__4__Impl3689); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1706:1: rule__ImageDecoration__Group__0 : rule__ImageDecoration__Group__0__Impl rule__ImageDecoration__Group__1 ;
    public final void rule__ImageDecoration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1710:1: ( rule__ImageDecoration__Group__0__Impl rule__ImageDecoration__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1711:2: rule__ImageDecoration__Group__0__Impl rule__ImageDecoration__Group__1
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group__0__Impl_in_rule__ImageDecoration__Group__03730);
            rule__ImageDecoration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group__1_in_rule__ImageDecoration__Group__03733);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1718:1: rule__ImageDecoration__Group__0__Impl : ( () ) ;
    public final void rule__ImageDecoration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1722:1: ( ( () ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1723:1: ( () )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1723:1: ( () )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1724:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getImageDecorationAction_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1725:1: ()
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1727:1: 
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1737:1: rule__ImageDecoration__Group__1 : rule__ImageDecoration__Group__1__Impl rule__ImageDecoration__Group__2 ;
    public final void rule__ImageDecoration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1741:1: ( rule__ImageDecoration__Group__1__Impl rule__ImageDecoration__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1742:2: rule__ImageDecoration__Group__1__Impl rule__ImageDecoration__Group__2
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group__1__Impl_in_rule__ImageDecoration__Group__13791);
            rule__ImageDecoration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group__2_in_rule__ImageDecoration__Group__13794);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1749:1: rule__ImageDecoration__Group__1__Impl : ( 'image' ) ;
    public final void rule__ImageDecoration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1753:1: ( ( 'image' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1754:1: ( 'image' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1754:1: ( 'image' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1755:1: 'image'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getImageKeyword_1()); 
            }
            match(input,54,FOLLOW_54_in_rule__ImageDecoration__Group__1__Impl3822); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1768:1: rule__ImageDecoration__Group__2 : rule__ImageDecoration__Group__2__Impl rule__ImageDecoration__Group__3 ;
    public final void rule__ImageDecoration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1772:1: ( rule__ImageDecoration__Group__2__Impl rule__ImageDecoration__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1773:2: rule__ImageDecoration__Group__2__Impl rule__ImageDecoration__Group__3
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group__2__Impl_in_rule__ImageDecoration__Group__23853);
            rule__ImageDecoration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group__3_in_rule__ImageDecoration__Group__23856);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1780:1: rule__ImageDecoration__Group__2__Impl : ( '{' ) ;
    public final void rule__ImageDecoration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1784:1: ( ( '{' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1785:1: ( '{' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1785:1: ( '{' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1786:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,52,FOLLOW_52_in_rule__ImageDecoration__Group__2__Impl3884); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1799:1: rule__ImageDecoration__Group__3 : rule__ImageDecoration__Group__3__Impl rule__ImageDecoration__Group__4 ;
    public final void rule__ImageDecoration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1803:1: ( rule__ImageDecoration__Group__3__Impl rule__ImageDecoration__Group__4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1804:2: rule__ImageDecoration__Group__3__Impl rule__ImageDecoration__Group__4
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group__3__Impl_in_rule__ImageDecoration__Group__33915);
            rule__ImageDecoration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group__4_in_rule__ImageDecoration__Group__33918);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1811:1: rule__ImageDecoration__Group__3__Impl : ( ( rule__ImageDecoration__UnorderedGroup_3 ) ) ;
    public final void rule__ImageDecoration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1815:1: ( ( ( rule__ImageDecoration__UnorderedGroup_3 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1816:1: ( ( rule__ImageDecoration__UnorderedGroup_3 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1816:1: ( ( rule__ImageDecoration__UnorderedGroup_3 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1817:1: ( rule__ImageDecoration__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1818:1: ( rule__ImageDecoration__UnorderedGroup_3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1818:2: rule__ImageDecoration__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3_in_rule__ImageDecoration__Group__3__Impl3945);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1828:1: rule__ImageDecoration__Group__4 : rule__ImageDecoration__Group__4__Impl ;
    public final void rule__ImageDecoration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1832:1: ( rule__ImageDecoration__Group__4__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1833:2: rule__ImageDecoration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group__4__Impl_in_rule__ImageDecoration__Group__43975);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1839:1: rule__ImageDecoration__Group__4__Impl : ( '}' ) ;
    public final void rule__ImageDecoration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1843:1: ( ( '}' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1844:1: ( '}' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1844:1: ( '}' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1845:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,53,FOLLOW_53_in_rule__ImageDecoration__Group__4__Impl4003); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1868:1: rule__ImageDecoration__Group_3_0__0 : rule__ImageDecoration__Group_3_0__0__Impl rule__ImageDecoration__Group_3_0__1 ;
    public final void rule__ImageDecoration__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1872:1: ( rule__ImageDecoration__Group_3_0__0__Impl rule__ImageDecoration__Group_3_0__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1873:2: rule__ImageDecoration__Group_3_0__0__Impl rule__ImageDecoration__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_0__0__Impl_in_rule__ImageDecoration__Group_3_0__04044);
            rule__ImageDecoration__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_0__1_in_rule__ImageDecoration__Group_3_0__04047);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1880:1: rule__ImageDecoration__Group_3_0__0__Impl : ( 'location-uri' ) ;
    public final void rule__ImageDecoration__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1884:1: ( ( 'location-uri' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1885:1: ( 'location-uri' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1885:1: ( 'location-uri' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1886:1: 'location-uri'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getLocationUriKeyword_3_0_0()); 
            }
            match(input,55,FOLLOW_55_in_rule__ImageDecoration__Group_3_0__0__Impl4075); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1899:1: rule__ImageDecoration__Group_3_0__1 : rule__ImageDecoration__Group_3_0__1__Impl rule__ImageDecoration__Group_3_0__2 ;
    public final void rule__ImageDecoration__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1903:1: ( rule__ImageDecoration__Group_3_0__1__Impl rule__ImageDecoration__Group_3_0__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1904:2: rule__ImageDecoration__Group_3_0__1__Impl rule__ImageDecoration__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_0__1__Impl_in_rule__ImageDecoration__Group_3_0__14106);
            rule__ImageDecoration__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_0__2_in_rule__ImageDecoration__Group_3_0__14109);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1911:1: rule__ImageDecoration__Group_3_0__1__Impl : ( '=' ) ;
    public final void rule__ImageDecoration__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1915:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1916:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1916:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1917:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getEqualsSignKeyword_3_0_1()); 
            }
            match(input,56,FOLLOW_56_in_rule__ImageDecoration__Group_3_0__1__Impl4137); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1930:1: rule__ImageDecoration__Group_3_0__2 : rule__ImageDecoration__Group_3_0__2__Impl ;
    public final void rule__ImageDecoration__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1934:1: ( rule__ImageDecoration__Group_3_0__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1935:2: rule__ImageDecoration__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_0__2__Impl_in_rule__ImageDecoration__Group_3_0__24168);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1941:1: rule__ImageDecoration__Group_3_0__2__Impl : ( ( rule__ImageDecoration__Location_uriAssignment_3_0_2 ) ) ;
    public final void rule__ImageDecoration__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1945:1: ( ( ( rule__ImageDecoration__Location_uriAssignment_3_0_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1946:1: ( ( rule__ImageDecoration__Location_uriAssignment_3_0_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1946:1: ( ( rule__ImageDecoration__Location_uriAssignment_3_0_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1947:1: ( rule__ImageDecoration__Location_uriAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getLocation_uriAssignment_3_0_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1948:1: ( rule__ImageDecoration__Location_uriAssignment_3_0_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1948:2: rule__ImageDecoration__Location_uriAssignment_3_0_2
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Location_uriAssignment_3_0_2_in_rule__ImageDecoration__Group_3_0__2__Impl4195);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1964:1: rule__ImageDecoration__Group_3_3__0 : rule__ImageDecoration__Group_3_3__0__Impl rule__ImageDecoration__Group_3_3__1 ;
    public final void rule__ImageDecoration__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1968:1: ( rule__ImageDecoration__Group_3_3__0__Impl rule__ImageDecoration__Group_3_3__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1969:2: rule__ImageDecoration__Group_3_3__0__Impl rule__ImageDecoration__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_3__0__Impl_in_rule__ImageDecoration__Group_3_3__04231);
            rule__ImageDecoration__Group_3_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_3__1_in_rule__ImageDecoration__Group_3_3__04234);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1976:1: rule__ImageDecoration__Group_3_3__0__Impl : ( 'tooltip' ) ;
    public final void rule__ImageDecoration__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1980:1: ( ( 'tooltip' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1981:1: ( 'tooltip' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1981:1: ( 'tooltip' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1982:1: 'tooltip'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getTooltipKeyword_3_3_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__ImageDecoration__Group_3_3__0__Impl4262); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1995:1: rule__ImageDecoration__Group_3_3__1 : rule__ImageDecoration__Group_3_3__1__Impl rule__ImageDecoration__Group_3_3__2 ;
    public final void rule__ImageDecoration__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:1999:1: ( rule__ImageDecoration__Group_3_3__1__Impl rule__ImageDecoration__Group_3_3__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2000:2: rule__ImageDecoration__Group_3_3__1__Impl rule__ImageDecoration__Group_3_3__2
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_3__1__Impl_in_rule__ImageDecoration__Group_3_3__14293);
            rule__ImageDecoration__Group_3_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_3__2_in_rule__ImageDecoration__Group_3_3__14296);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2007:1: rule__ImageDecoration__Group_3_3__1__Impl : ( '=' ) ;
    public final void rule__ImageDecoration__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2011:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2012:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2012:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2013:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getEqualsSignKeyword_3_3_1()); 
            }
            match(input,56,FOLLOW_56_in_rule__ImageDecoration__Group_3_3__1__Impl4324); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2026:1: rule__ImageDecoration__Group_3_3__2 : rule__ImageDecoration__Group_3_3__2__Impl ;
    public final void rule__ImageDecoration__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2030:1: ( rule__ImageDecoration__Group_3_3__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2031:2: rule__ImageDecoration__Group_3_3__2__Impl
            {
            pushFollow(FOLLOW_rule__ImageDecoration__Group_3_3__2__Impl_in_rule__ImageDecoration__Group_3_3__24355);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2037:1: rule__ImageDecoration__Group_3_3__2__Impl : ( ( rule__ImageDecoration__TooltipAssignment_3_3_2 ) ) ;
    public final void rule__ImageDecoration__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2041:1: ( ( ( rule__ImageDecoration__TooltipAssignment_3_3_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2042:1: ( ( rule__ImageDecoration__TooltipAssignment_3_3_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2042:1: ( ( rule__ImageDecoration__TooltipAssignment_3_3_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2043:1: ( rule__ImageDecoration__TooltipAssignment_3_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getTooltipAssignment_3_3_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2044:1: ( rule__ImageDecoration__TooltipAssignment_3_3_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2044:2: rule__ImageDecoration__TooltipAssignment_3_3_2
            {
            pushFollow(FOLLOW_rule__ImageDecoration__TooltipAssignment_3_3_2_in_rule__ImageDecoration__Group_3_3__2__Impl4382);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2060:1: rule__BorderDecoration__Group__0 : rule__BorderDecoration__Group__0__Impl rule__BorderDecoration__Group__1 ;
    public final void rule__BorderDecoration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2064:1: ( rule__BorderDecoration__Group__0__Impl rule__BorderDecoration__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2065:2: rule__BorderDecoration__Group__0__Impl rule__BorderDecoration__Group__1
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__0__Impl_in_rule__BorderDecoration__Group__04418);
            rule__BorderDecoration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BorderDecoration__Group__1_in_rule__BorderDecoration__Group__04421);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2072:1: rule__BorderDecoration__Group__0__Impl : ( () ) ;
    public final void rule__BorderDecoration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2076:1: ( ( () ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2077:1: ( () )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2077:1: ( () )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2078:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getBorderDecorationAction_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2079:1: ()
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2081:1: 
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2091:1: rule__BorderDecoration__Group__1 : rule__BorderDecoration__Group__1__Impl rule__BorderDecoration__Group__2 ;
    public final void rule__BorderDecoration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2095:1: ( rule__BorderDecoration__Group__1__Impl rule__BorderDecoration__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2096:2: rule__BorderDecoration__Group__1__Impl rule__BorderDecoration__Group__2
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__1__Impl_in_rule__BorderDecoration__Group__14479);
            rule__BorderDecoration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BorderDecoration__Group__2_in_rule__BorderDecoration__Group__14482);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2103:1: rule__BorderDecoration__Group__1__Impl : ( 'border' ) ;
    public final void rule__BorderDecoration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2107:1: ( ( 'border' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2108:1: ( 'border' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2108:1: ( 'border' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2109:1: 'border'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getBorderKeyword_1()); 
            }
            match(input,58,FOLLOW_58_in_rule__BorderDecoration__Group__1__Impl4510); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2122:1: rule__BorderDecoration__Group__2 : rule__BorderDecoration__Group__2__Impl rule__BorderDecoration__Group__3 ;
    public final void rule__BorderDecoration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2126:1: ( rule__BorderDecoration__Group__2__Impl rule__BorderDecoration__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2127:2: rule__BorderDecoration__Group__2__Impl rule__BorderDecoration__Group__3
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__2__Impl_in_rule__BorderDecoration__Group__24541);
            rule__BorderDecoration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BorderDecoration__Group__3_in_rule__BorderDecoration__Group__24544);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2134:1: rule__BorderDecoration__Group__2__Impl : ( '{' ) ;
    public final void rule__BorderDecoration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2138:1: ( ( '{' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2139:1: ( '{' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2139:1: ( '{' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2140:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,52,FOLLOW_52_in_rule__BorderDecoration__Group__2__Impl4572); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2153:1: rule__BorderDecoration__Group__3 : rule__BorderDecoration__Group__3__Impl rule__BorderDecoration__Group__4 ;
    public final void rule__BorderDecoration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2157:1: ( rule__BorderDecoration__Group__3__Impl rule__BorderDecoration__Group__4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2158:2: rule__BorderDecoration__Group__3__Impl rule__BorderDecoration__Group__4
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__3__Impl_in_rule__BorderDecoration__Group__34603);
            rule__BorderDecoration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BorderDecoration__Group__4_in_rule__BorderDecoration__Group__34606);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2165:1: rule__BorderDecoration__Group__3__Impl : ( ( rule__BorderDecoration__UnorderedGroup_3 ) ) ;
    public final void rule__BorderDecoration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2169:1: ( ( ( rule__BorderDecoration__UnorderedGroup_3 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2170:1: ( ( rule__BorderDecoration__UnorderedGroup_3 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2170:1: ( ( rule__BorderDecoration__UnorderedGroup_3 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2171:1: ( rule__BorderDecoration__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2172:1: ( rule__BorderDecoration__UnorderedGroup_3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2172:2: rule__BorderDecoration__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3_in_rule__BorderDecoration__Group__3__Impl4633);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2182:1: rule__BorderDecoration__Group__4 : rule__BorderDecoration__Group__4__Impl ;
    public final void rule__BorderDecoration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2186:1: ( rule__BorderDecoration__Group__4__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2187:2: rule__BorderDecoration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group__4__Impl_in_rule__BorderDecoration__Group__44663);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2193:1: rule__BorderDecoration__Group__4__Impl : ( '}' ) ;
    public final void rule__BorderDecoration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2197:1: ( ( '}' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2198:1: ( '}' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2198:1: ( '}' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2199:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,53,FOLLOW_53_in_rule__BorderDecoration__Group__4__Impl4691); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2222:1: rule__BorderDecoration__Group_3_1__0 : rule__BorderDecoration__Group_3_1__0__Impl rule__BorderDecoration__Group_3_1__1 ;
    public final void rule__BorderDecoration__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2226:1: ( rule__BorderDecoration__Group_3_1__0__Impl rule__BorderDecoration__Group_3_1__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2227:2: rule__BorderDecoration__Group_3_1__0__Impl rule__BorderDecoration__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group_3_1__0__Impl_in_rule__BorderDecoration__Group_3_1__04732);
            rule__BorderDecoration__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BorderDecoration__Group_3_1__1_in_rule__BorderDecoration__Group_3_1__04735);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2234:1: rule__BorderDecoration__Group_3_1__0__Impl : ( 'color' ) ;
    public final void rule__BorderDecoration__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2238:1: ( ( 'color' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2239:1: ( 'color' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2239:1: ( 'color' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2240:1: 'color'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getColorKeyword_3_1_0()); 
            }
            match(input,59,FOLLOW_59_in_rule__BorderDecoration__Group_3_1__0__Impl4763); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2253:1: rule__BorderDecoration__Group_3_1__1 : rule__BorderDecoration__Group_3_1__1__Impl rule__BorderDecoration__Group_3_1__2 ;
    public final void rule__BorderDecoration__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2257:1: ( rule__BorderDecoration__Group_3_1__1__Impl rule__BorderDecoration__Group_3_1__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2258:2: rule__BorderDecoration__Group_3_1__1__Impl rule__BorderDecoration__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group_3_1__1__Impl_in_rule__BorderDecoration__Group_3_1__14794);
            rule__BorderDecoration__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BorderDecoration__Group_3_1__2_in_rule__BorderDecoration__Group_3_1__14797);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2265:1: rule__BorderDecoration__Group_3_1__1__Impl : ( '=' ) ;
    public final void rule__BorderDecoration__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2269:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2270:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2270:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2271:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getEqualsSignKeyword_3_1_1()); 
            }
            match(input,56,FOLLOW_56_in_rule__BorderDecoration__Group_3_1__1__Impl4825); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2284:1: rule__BorderDecoration__Group_3_1__2 : rule__BorderDecoration__Group_3_1__2__Impl ;
    public final void rule__BorderDecoration__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2288:1: ( rule__BorderDecoration__Group_3_1__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2289:2: rule__BorderDecoration__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BorderDecoration__Group_3_1__2__Impl_in_rule__BorderDecoration__Group_3_1__24856);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2295:1: rule__BorderDecoration__Group_3_1__2__Impl : ( ( rule__BorderDecoration__ColorAssignment_3_1_2 ) ) ;
    public final void rule__BorderDecoration__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2299:1: ( ( ( rule__BorderDecoration__ColorAssignment_3_1_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2300:1: ( ( rule__BorderDecoration__ColorAssignment_3_1_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2300:1: ( ( rule__BorderDecoration__ColorAssignment_3_1_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2301:1: ( rule__BorderDecoration__ColorAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getColorAssignment_3_1_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2302:1: ( rule__BorderDecoration__ColorAssignment_3_1_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2302:2: rule__BorderDecoration__ColorAssignment_3_1_2
            {
            pushFollow(FOLLOW_rule__BorderDecoration__ColorAssignment_3_1_2_in_rule__BorderDecoration__Group_3_1__2__Impl4883);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2318:1: rule__ColorDecoration__Group__0 : rule__ColorDecoration__Group__0__Impl rule__ColorDecoration__Group__1 ;
    public final void rule__ColorDecoration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2322:1: ( rule__ColorDecoration__Group__0__Impl rule__ColorDecoration__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2323:2: rule__ColorDecoration__Group__0__Impl rule__ColorDecoration__Group__1
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group__0__Impl_in_rule__ColorDecoration__Group__04919);
            rule__ColorDecoration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group__1_in_rule__ColorDecoration__Group__04922);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2330:1: rule__ColorDecoration__Group__0__Impl : ( () ) ;
    public final void rule__ColorDecoration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2334:1: ( ( () ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2335:1: ( () )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2335:1: ( () )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2336:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getColorDecorationAction_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2337:1: ()
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2339:1: 
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2349:1: rule__ColorDecoration__Group__1 : rule__ColorDecoration__Group__1__Impl rule__ColorDecoration__Group__2 ;
    public final void rule__ColorDecoration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2353:1: ( rule__ColorDecoration__Group__1__Impl rule__ColorDecoration__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2354:2: rule__ColorDecoration__Group__1__Impl rule__ColorDecoration__Group__2
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group__1__Impl_in_rule__ColorDecoration__Group__14980);
            rule__ColorDecoration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group__2_in_rule__ColorDecoration__Group__14983);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2361:1: rule__ColorDecoration__Group__1__Impl : ( 'color' ) ;
    public final void rule__ColorDecoration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2365:1: ( ( 'color' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2366:1: ( 'color' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2366:1: ( 'color' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2367:1: 'color'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getColorKeyword_1()); 
            }
            match(input,59,FOLLOW_59_in_rule__ColorDecoration__Group__1__Impl5011); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2380:1: rule__ColorDecoration__Group__2 : rule__ColorDecoration__Group__2__Impl rule__ColorDecoration__Group__3 ;
    public final void rule__ColorDecoration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2384:1: ( rule__ColorDecoration__Group__2__Impl rule__ColorDecoration__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2385:2: rule__ColorDecoration__Group__2__Impl rule__ColorDecoration__Group__3
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group__2__Impl_in_rule__ColorDecoration__Group__25042);
            rule__ColorDecoration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group__3_in_rule__ColorDecoration__Group__25045);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2392:1: rule__ColorDecoration__Group__2__Impl : ( '{' ) ;
    public final void rule__ColorDecoration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2396:1: ( ( '{' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2397:1: ( '{' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2397:1: ( '{' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2398:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,52,FOLLOW_52_in_rule__ColorDecoration__Group__2__Impl5073); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2411:1: rule__ColorDecoration__Group__3 : rule__ColorDecoration__Group__3__Impl rule__ColorDecoration__Group__4 ;
    public final void rule__ColorDecoration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2415:1: ( rule__ColorDecoration__Group__3__Impl rule__ColorDecoration__Group__4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2416:2: rule__ColorDecoration__Group__3__Impl rule__ColorDecoration__Group__4
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group__3__Impl_in_rule__ColorDecoration__Group__35104);
            rule__ColorDecoration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group__4_in_rule__ColorDecoration__Group__35107);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2423:1: rule__ColorDecoration__Group__3__Impl : ( ( rule__ColorDecoration__UnorderedGroup_3 ) ) ;
    public final void rule__ColorDecoration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2427:1: ( ( ( rule__ColorDecoration__UnorderedGroup_3 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2428:1: ( ( rule__ColorDecoration__UnorderedGroup_3 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2428:1: ( ( rule__ColorDecoration__UnorderedGroup_3 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2429:1: ( rule__ColorDecoration__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2430:1: ( rule__ColorDecoration__UnorderedGroup_3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2430:2: rule__ColorDecoration__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__ColorDecoration__UnorderedGroup_3_in_rule__ColorDecoration__Group__3__Impl5134);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2440:1: rule__ColorDecoration__Group__4 : rule__ColorDecoration__Group__4__Impl ;
    public final void rule__ColorDecoration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2444:1: ( rule__ColorDecoration__Group__4__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2445:2: rule__ColorDecoration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group__4__Impl_in_rule__ColorDecoration__Group__45164);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2451:1: rule__ColorDecoration__Group__4__Impl : ( '}' ) ;
    public final void rule__ColorDecoration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2455:1: ( ( '}' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2456:1: ( '}' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2456:1: ( '}' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2457:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,53,FOLLOW_53_in_rule__ColorDecoration__Group__4__Impl5192); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2480:1: rule__ColorDecoration__Group_3_0__0 : rule__ColorDecoration__Group_3_0__0__Impl rule__ColorDecoration__Group_3_0__1 ;
    public final void rule__ColorDecoration__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2484:1: ( rule__ColorDecoration__Group_3_0__0__Impl rule__ColorDecoration__Group_3_0__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2485:2: rule__ColorDecoration__Group_3_0__0__Impl rule__ColorDecoration__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_0__0__Impl_in_rule__ColorDecoration__Group_3_0__05233);
            rule__ColorDecoration__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_0__1_in_rule__ColorDecoration__Group_3_0__05236);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2492:1: rule__ColorDecoration__Group_3_0__0__Impl : ( 'background' ) ;
    public final void rule__ColorDecoration__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2496:1: ( ( 'background' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2497:1: ( 'background' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2497:1: ( 'background' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2498:1: 'background'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getBackgroundKeyword_3_0_0()); 
            }
            match(input,60,FOLLOW_60_in_rule__ColorDecoration__Group_3_0__0__Impl5264); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2511:1: rule__ColorDecoration__Group_3_0__1 : rule__ColorDecoration__Group_3_0__1__Impl rule__ColorDecoration__Group_3_0__2 ;
    public final void rule__ColorDecoration__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2515:1: ( rule__ColorDecoration__Group_3_0__1__Impl rule__ColorDecoration__Group_3_0__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2516:2: rule__ColorDecoration__Group_3_0__1__Impl rule__ColorDecoration__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_0__1__Impl_in_rule__ColorDecoration__Group_3_0__15295);
            rule__ColorDecoration__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_0__2_in_rule__ColorDecoration__Group_3_0__15298);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2523:1: rule__ColorDecoration__Group_3_0__1__Impl : ( '=' ) ;
    public final void rule__ColorDecoration__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2527:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2528:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2528:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2529:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getEqualsSignKeyword_3_0_1()); 
            }
            match(input,56,FOLLOW_56_in_rule__ColorDecoration__Group_3_0__1__Impl5326); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2542:1: rule__ColorDecoration__Group_3_0__2 : rule__ColorDecoration__Group_3_0__2__Impl ;
    public final void rule__ColorDecoration__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2546:1: ( rule__ColorDecoration__Group_3_0__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2547:2: rule__ColorDecoration__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_0__2__Impl_in_rule__ColorDecoration__Group_3_0__25357);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2553:1: rule__ColorDecoration__Group_3_0__2__Impl : ( ( rule__ColorDecoration__BackgroundAssignment_3_0_2 ) ) ;
    public final void rule__ColorDecoration__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2557:1: ( ( ( rule__ColorDecoration__BackgroundAssignment_3_0_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2558:1: ( ( rule__ColorDecoration__BackgroundAssignment_3_0_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2558:1: ( ( rule__ColorDecoration__BackgroundAssignment_3_0_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2559:1: ( rule__ColorDecoration__BackgroundAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getBackgroundAssignment_3_0_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2560:1: ( rule__ColorDecoration__BackgroundAssignment_3_0_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2560:2: rule__ColorDecoration__BackgroundAssignment_3_0_2
            {
            pushFollow(FOLLOW_rule__ColorDecoration__BackgroundAssignment_3_0_2_in_rule__ColorDecoration__Group_3_0__2__Impl5384);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2576:1: rule__ColorDecoration__Group_3_1__0 : rule__ColorDecoration__Group_3_1__0__Impl rule__ColorDecoration__Group_3_1__1 ;
    public final void rule__ColorDecoration__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2580:1: ( rule__ColorDecoration__Group_3_1__0__Impl rule__ColorDecoration__Group_3_1__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2581:2: rule__ColorDecoration__Group_3_1__0__Impl rule__ColorDecoration__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_1__0__Impl_in_rule__ColorDecoration__Group_3_1__05420);
            rule__ColorDecoration__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_1__1_in_rule__ColorDecoration__Group_3_1__05423);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2588:1: rule__ColorDecoration__Group_3_1__0__Impl : ( 'foreground' ) ;
    public final void rule__ColorDecoration__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2592:1: ( ( 'foreground' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2593:1: ( 'foreground' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2593:1: ( 'foreground' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2594:1: 'foreground'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getForegroundKeyword_3_1_0()); 
            }
            match(input,61,FOLLOW_61_in_rule__ColorDecoration__Group_3_1__0__Impl5451); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2607:1: rule__ColorDecoration__Group_3_1__1 : rule__ColorDecoration__Group_3_1__1__Impl rule__ColorDecoration__Group_3_1__2 ;
    public final void rule__ColorDecoration__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2611:1: ( rule__ColorDecoration__Group_3_1__1__Impl rule__ColorDecoration__Group_3_1__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2612:2: rule__ColorDecoration__Group_3_1__1__Impl rule__ColorDecoration__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_1__1__Impl_in_rule__ColorDecoration__Group_3_1__15482);
            rule__ColorDecoration__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_1__2_in_rule__ColorDecoration__Group_3_1__15485);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2619:1: rule__ColorDecoration__Group_3_1__1__Impl : ( '=' ) ;
    public final void rule__ColorDecoration__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2623:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2624:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2624:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2625:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getEqualsSignKeyword_3_1_1()); 
            }
            match(input,56,FOLLOW_56_in_rule__ColorDecoration__Group_3_1__1__Impl5513); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2638:1: rule__ColorDecoration__Group_3_1__2 : rule__ColorDecoration__Group_3_1__2__Impl ;
    public final void rule__ColorDecoration__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2642:1: ( rule__ColorDecoration__Group_3_1__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2643:2: rule__ColorDecoration__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ColorDecoration__Group_3_1__2__Impl_in_rule__ColorDecoration__Group_3_1__25544);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2649:1: rule__ColorDecoration__Group_3_1__2__Impl : ( ( rule__ColorDecoration__ForegroundAssignment_3_1_2 ) ) ;
    public final void rule__ColorDecoration__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2653:1: ( ( ( rule__ColorDecoration__ForegroundAssignment_3_1_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2654:1: ( ( rule__ColorDecoration__ForegroundAssignment_3_1_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2654:1: ( ( rule__ColorDecoration__ForegroundAssignment_3_1_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2655:1: ( rule__ColorDecoration__ForegroundAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getForegroundAssignment_3_1_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2656:1: ( rule__ColorDecoration__ForegroundAssignment_3_1_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2656:2: rule__ColorDecoration__ForegroundAssignment_3_1_2
            {
            pushFollow(FOLLOW_rule__ColorDecoration__ForegroundAssignment_3_1_2_in_rule__ColorDecoration__Group_3_1__2__Impl5571);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2672:1: rule__ConnectionDecoration__Group__0 : rule__ConnectionDecoration__Group__0__Impl rule__ConnectionDecoration__Group__1 ;
    public final void rule__ConnectionDecoration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2676:1: ( rule__ConnectionDecoration__Group__0__Impl rule__ConnectionDecoration__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2677:2: rule__ConnectionDecoration__Group__0__Impl rule__ConnectionDecoration__Group__1
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__0__Impl_in_rule__ConnectionDecoration__Group__05607);
            rule__ConnectionDecoration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__1_in_rule__ConnectionDecoration__Group__05610);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2684:1: rule__ConnectionDecoration__Group__0__Impl : ( () ) ;
    public final void rule__ConnectionDecoration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2688:1: ( ( () ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2689:1: ( () )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2689:1: ( () )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2690:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getConnectionDecorationAction_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2691:1: ()
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2693:1: 
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2703:1: rule__ConnectionDecoration__Group__1 : rule__ConnectionDecoration__Group__1__Impl rule__ConnectionDecoration__Group__2 ;
    public final void rule__ConnectionDecoration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2707:1: ( rule__ConnectionDecoration__Group__1__Impl rule__ConnectionDecoration__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2708:2: rule__ConnectionDecoration__Group__1__Impl rule__ConnectionDecoration__Group__2
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__1__Impl_in_rule__ConnectionDecoration__Group__15668);
            rule__ConnectionDecoration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__2_in_rule__ConnectionDecoration__Group__15671);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2715:1: rule__ConnectionDecoration__Group__1__Impl : ( 'connection' ) ;
    public final void rule__ConnectionDecoration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2719:1: ( ( 'connection' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2720:1: ( 'connection' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2720:1: ( 'connection' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2721:1: 'connection'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getConnectionKeyword_1()); 
            }
            match(input,62,FOLLOW_62_in_rule__ConnectionDecoration__Group__1__Impl5699); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2734:1: rule__ConnectionDecoration__Group__2 : rule__ConnectionDecoration__Group__2__Impl rule__ConnectionDecoration__Group__3 ;
    public final void rule__ConnectionDecoration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2738:1: ( rule__ConnectionDecoration__Group__2__Impl rule__ConnectionDecoration__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2739:2: rule__ConnectionDecoration__Group__2__Impl rule__ConnectionDecoration__Group__3
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__2__Impl_in_rule__ConnectionDecoration__Group__25730);
            rule__ConnectionDecoration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__3_in_rule__ConnectionDecoration__Group__25733);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2746:1: rule__ConnectionDecoration__Group__2__Impl : ( '{' ) ;
    public final void rule__ConnectionDecoration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2750:1: ( ( '{' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2751:1: ( '{' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2751:1: ( '{' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2752:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,52,FOLLOW_52_in_rule__ConnectionDecoration__Group__2__Impl5761); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2765:1: rule__ConnectionDecoration__Group__3 : rule__ConnectionDecoration__Group__3__Impl rule__ConnectionDecoration__Group__4 ;
    public final void rule__ConnectionDecoration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2769:1: ( rule__ConnectionDecoration__Group__3__Impl rule__ConnectionDecoration__Group__4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2770:2: rule__ConnectionDecoration__Group__3__Impl rule__ConnectionDecoration__Group__4
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__3__Impl_in_rule__ConnectionDecoration__Group__35792);
            rule__ConnectionDecoration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__4_in_rule__ConnectionDecoration__Group__35795);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2777:1: rule__ConnectionDecoration__Group__3__Impl : ( ( rule__ConnectionDecoration__UnorderedGroup_3 ) ) ;
    public final void rule__ConnectionDecoration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2781:1: ( ( ( rule__ConnectionDecoration__UnorderedGroup_3 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2782:1: ( ( rule__ConnectionDecoration__UnorderedGroup_3 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2782:1: ( ( rule__ConnectionDecoration__UnorderedGroup_3 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2783:1: ( rule__ConnectionDecoration__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2784:1: ( rule__ConnectionDecoration__UnorderedGroup_3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2784:2: rule__ConnectionDecoration__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3_in_rule__ConnectionDecoration__Group__3__Impl5822);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2794:1: rule__ConnectionDecoration__Group__4 : rule__ConnectionDecoration__Group__4__Impl ;
    public final void rule__ConnectionDecoration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2798:1: ( rule__ConnectionDecoration__Group__4__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2799:2: rule__ConnectionDecoration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group__4__Impl_in_rule__ConnectionDecoration__Group__45852);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2805:1: rule__ConnectionDecoration__Group__4__Impl : ( '}' ) ;
    public final void rule__ConnectionDecoration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2809:1: ( ( '}' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2810:1: ( '}' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2810:1: ( '}' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2811:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,53,FOLLOW_53_in_rule__ConnectionDecoration__Group__4__Impl5880); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2834:1: rule__ConnectionDecoration__Group_3_2__0 : rule__ConnectionDecoration__Group_3_2__0__Impl rule__ConnectionDecoration__Group_3_2__1 ;
    public final void rule__ConnectionDecoration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2838:1: ( rule__ConnectionDecoration__Group_3_2__0__Impl rule__ConnectionDecoration__Group_3_2__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2839:2: rule__ConnectionDecoration__Group_3_2__0__Impl rule__ConnectionDecoration__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_2__0__Impl_in_rule__ConnectionDecoration__Group_3_2__05921);
            rule__ConnectionDecoration__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_2__1_in_rule__ConnectionDecoration__Group_3_2__05924);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2846:1: rule__ConnectionDecoration__Group_3_2__0__Impl : ( 'foreground-color' ) ;
    public final void rule__ConnectionDecoration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2850:1: ( ( 'foreground-color' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2851:1: ( 'foreground-color' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2851:1: ( 'foreground-color' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2852:1: 'foreground-color'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getForegroundColorKeyword_3_2_0()); 
            }
            match(input,63,FOLLOW_63_in_rule__ConnectionDecoration__Group_3_2__0__Impl5952); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2865:1: rule__ConnectionDecoration__Group_3_2__1 : rule__ConnectionDecoration__Group_3_2__1__Impl rule__ConnectionDecoration__Group_3_2__2 ;
    public final void rule__ConnectionDecoration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2869:1: ( rule__ConnectionDecoration__Group_3_2__1__Impl rule__ConnectionDecoration__Group_3_2__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2870:2: rule__ConnectionDecoration__Group_3_2__1__Impl rule__ConnectionDecoration__Group_3_2__2
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_2__1__Impl_in_rule__ConnectionDecoration__Group_3_2__15983);
            rule__ConnectionDecoration__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_2__2_in_rule__ConnectionDecoration__Group_3_2__15986);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2877:1: rule__ConnectionDecoration__Group_3_2__1__Impl : ( '=' ) ;
    public final void rule__ConnectionDecoration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2881:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2882:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2882:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2883:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getEqualsSignKeyword_3_2_1()); 
            }
            match(input,56,FOLLOW_56_in_rule__ConnectionDecoration__Group_3_2__1__Impl6014); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2896:1: rule__ConnectionDecoration__Group_3_2__2 : rule__ConnectionDecoration__Group_3_2__2__Impl ;
    public final void rule__ConnectionDecoration__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2900:1: ( rule__ConnectionDecoration__Group_3_2__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2901:2: rule__ConnectionDecoration__Group_3_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_2__2__Impl_in_rule__ConnectionDecoration__Group_3_2__26045);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2907:1: rule__ConnectionDecoration__Group_3_2__2__Impl : ( ( rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2 ) ) ;
    public final void rule__ConnectionDecoration__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2911:1: ( ( ( rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2912:1: ( ( rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2912:1: ( ( rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2913:1: ( rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getForegroundColorAssignment_3_2_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2914:1: ( rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2914:2: rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2_in_rule__ConnectionDecoration__Group_3_2__2__Impl6072);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2930:1: rule__ConnectionDecoration__Group_3_3__0 : rule__ConnectionDecoration__Group_3_3__0__Impl rule__ConnectionDecoration__Group_3_3__1 ;
    public final void rule__ConnectionDecoration__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2934:1: ( rule__ConnectionDecoration__Group_3_3__0__Impl rule__ConnectionDecoration__Group_3_3__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2935:2: rule__ConnectionDecoration__Group_3_3__0__Impl rule__ConnectionDecoration__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_3__0__Impl_in_rule__ConnectionDecoration__Group_3_3__06108);
            rule__ConnectionDecoration__Group_3_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_3__1_in_rule__ConnectionDecoration__Group_3_3__06111);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2942:1: rule__ConnectionDecoration__Group_3_3__0__Impl : ( 'background-color' ) ;
    public final void rule__ConnectionDecoration__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2946:1: ( ( 'background-color' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2947:1: ( 'background-color' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2947:1: ( 'background-color' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2948:1: 'background-color'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getBackgroundColorKeyword_3_3_0()); 
            }
            match(input,64,FOLLOW_64_in_rule__ConnectionDecoration__Group_3_3__0__Impl6139); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2961:1: rule__ConnectionDecoration__Group_3_3__1 : rule__ConnectionDecoration__Group_3_3__1__Impl rule__ConnectionDecoration__Group_3_3__2 ;
    public final void rule__ConnectionDecoration__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2965:1: ( rule__ConnectionDecoration__Group_3_3__1__Impl rule__ConnectionDecoration__Group_3_3__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2966:2: rule__ConnectionDecoration__Group_3_3__1__Impl rule__ConnectionDecoration__Group_3_3__2
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_3__1__Impl_in_rule__ConnectionDecoration__Group_3_3__16170);
            rule__ConnectionDecoration__Group_3_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_3__2_in_rule__ConnectionDecoration__Group_3_3__16173);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2973:1: rule__ConnectionDecoration__Group_3_3__1__Impl : ( '=' ) ;
    public final void rule__ConnectionDecoration__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2977:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2978:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2978:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2979:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getEqualsSignKeyword_3_3_1()); 
            }
            match(input,56,FOLLOW_56_in_rule__ConnectionDecoration__Group_3_3__1__Impl6201); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2992:1: rule__ConnectionDecoration__Group_3_3__2 : rule__ConnectionDecoration__Group_3_3__2__Impl ;
    public final void rule__ConnectionDecoration__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2996:1: ( rule__ConnectionDecoration__Group_3_3__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:2997:2: rule__ConnectionDecoration__Group_3_3__2__Impl
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_3__2__Impl_in_rule__ConnectionDecoration__Group_3_3__26232);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3003:1: rule__ConnectionDecoration__Group_3_3__2__Impl : ( ( rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2 ) ) ;
    public final void rule__ConnectionDecoration__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3007:1: ( ( ( rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3008:1: ( ( rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3008:1: ( ( rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3009:1: ( rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getBackgroundColorAssignment_3_3_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3010:1: ( rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3010:2: rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2_in_rule__ConnectionDecoration__Group_3_3__2__Impl6259);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3026:1: rule__ComplexText__Group__0 : rule__ComplexText__Group__0__Impl rule__ComplexText__Group__1 ;
    public final void rule__ComplexText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3030:1: ( rule__ComplexText__Group__0__Impl rule__ComplexText__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3031:2: rule__ComplexText__Group__0__Impl rule__ComplexText__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexText__Group__0__Impl_in_rule__ComplexText__Group__06295);
            rule__ComplexText__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ComplexText__Group__1_in_rule__ComplexText__Group__06298);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3038:1: rule__ComplexText__Group__0__Impl : ( ( rule__ComplexText__LeftAssignment_0 ) ) ;
    public final void rule__ComplexText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3042:1: ( ( ( rule__ComplexText__LeftAssignment_0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3043:1: ( ( rule__ComplexText__LeftAssignment_0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3043:1: ( ( rule__ComplexText__LeftAssignment_0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3044:1: ( rule__ComplexText__LeftAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTextAccess().getLeftAssignment_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3045:1: ( rule__ComplexText__LeftAssignment_0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3045:2: rule__ComplexText__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__ComplexText__LeftAssignment_0_in_rule__ComplexText__Group__0__Impl6325);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3055:1: rule__ComplexText__Group__1 : rule__ComplexText__Group__1__Impl rule__ComplexText__Group__2 ;
    public final void rule__ComplexText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3059:1: ( rule__ComplexText__Group__1__Impl rule__ComplexText__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3060:2: rule__ComplexText__Group__1__Impl rule__ComplexText__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexText__Group__1__Impl_in_rule__ComplexText__Group__16355);
            rule__ComplexText__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ComplexText__Group__2_in_rule__ComplexText__Group__16358);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3067:1: rule__ComplexText__Group__1__Impl : ( '+' ) ;
    public final void rule__ComplexText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3071:1: ( ( '+' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3072:1: ( '+' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3072:1: ( '+' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3073:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTextAccess().getPlusSignKeyword_1()); 
            }
            match(input,65,FOLLOW_65_in_rule__ComplexText__Group__1__Impl6386); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3086:1: rule__ComplexText__Group__2 : rule__ComplexText__Group__2__Impl ;
    public final void rule__ComplexText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3090:1: ( rule__ComplexText__Group__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3091:2: rule__ComplexText__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ComplexText__Group__2__Impl_in_rule__ComplexText__Group__26417);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3097:1: rule__ComplexText__Group__2__Impl : ( ( rule__ComplexText__RightAssignment_2 ) ) ;
    public final void rule__ComplexText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3101:1: ( ( ( rule__ComplexText__RightAssignment_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3102:1: ( ( rule__ComplexText__RightAssignment_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3102:1: ( ( rule__ComplexText__RightAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3103:1: ( rule__ComplexText__RightAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTextAccess().getRightAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3104:1: ( rule__ComplexText__RightAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3104:2: rule__ComplexText__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__ComplexText__RightAssignment_2_in_rule__ComplexText__Group__2__Impl6444);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3120:1: rule__Style__Group__0 : rule__Style__Group__0__Impl rule__Style__Group__1 ;
    public final void rule__Style__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3124:1: ( rule__Style__Group__0__Impl rule__Style__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3125:2: rule__Style__Group__0__Impl rule__Style__Group__1
            {
            pushFollow(FOLLOW_rule__Style__Group__0__Impl_in_rule__Style__Group__06480);
            rule__Style__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Style__Group__1_in_rule__Style__Group__06483);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3132:1: rule__Style__Group__0__Impl : ( 'line-style' ) ;
    public final void rule__Style__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3136:1: ( ( 'line-style' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3137:1: ( 'line-style' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3137:1: ( 'line-style' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3138:1: 'line-style'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleAccess().getLineStyleKeyword_0()); 
            }
            match(input,66,FOLLOW_66_in_rule__Style__Group__0__Impl6511); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3151:1: rule__Style__Group__1 : rule__Style__Group__1__Impl rule__Style__Group__2 ;
    public final void rule__Style__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3155:1: ( rule__Style__Group__1__Impl rule__Style__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3156:2: rule__Style__Group__1__Impl rule__Style__Group__2
            {
            pushFollow(FOLLOW_rule__Style__Group__1__Impl_in_rule__Style__Group__16542);
            rule__Style__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Style__Group__2_in_rule__Style__Group__16545);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3163:1: rule__Style__Group__1__Impl : ( '=' ) ;
    public final void rule__Style__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3167:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3168:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3168:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3169:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleAccess().getEqualsSignKeyword_1()); 
            }
            match(input,56,FOLLOW_56_in_rule__Style__Group__1__Impl6573); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3182:1: rule__Style__Group__2 : rule__Style__Group__2__Impl ;
    public final void rule__Style__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3186:1: ( rule__Style__Group__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3187:2: rule__Style__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Style__Group__2__Impl_in_rule__Style__Group__26604);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3193:1: rule__Style__Group__2__Impl : ( ( rule__Style__ValueAssignment_2 ) ) ;
    public final void rule__Style__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3197:1: ( ( ( rule__Style__ValueAssignment_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3198:1: ( ( rule__Style__ValueAssignment_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3198:1: ( ( rule__Style__ValueAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3199:1: ( rule__Style__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleAccess().getValueAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3200:1: ( rule__Style__ValueAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3200:2: rule__Style__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Style__ValueAssignment_2_in_rule__Style__Group__2__Impl6631);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3216:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3220:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3221:2: rule__Size__Group__0__Impl rule__Size__Group__1
            {
            pushFollow(FOLLOW_rule__Size__Group__0__Impl_in_rule__Size__Group__06667);
            rule__Size__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Size__Group__1_in_rule__Size__Group__06670);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3228:1: rule__Size__Group__0__Impl : ( 'size' ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3232:1: ( ( 'size' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3233:1: ( 'size' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3233:1: ( 'size' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3234:1: 'size'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getSizeKeyword_0()); 
            }
            match(input,67,FOLLOW_67_in_rule__Size__Group__0__Impl6698); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3247:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3251:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3252:2: rule__Size__Group__1__Impl rule__Size__Group__2
            {
            pushFollow(FOLLOW_rule__Size__Group__1__Impl_in_rule__Size__Group__16729);
            rule__Size__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Size__Group__2_in_rule__Size__Group__16732);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3259:1: rule__Size__Group__1__Impl : ( '=' ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3263:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3264:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3264:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3265:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getEqualsSignKeyword_1()); 
            }
            match(input,56,FOLLOW_56_in_rule__Size__Group__1__Impl6760); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3278:1: rule__Size__Group__2 : rule__Size__Group__2__Impl ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3282:1: ( rule__Size__Group__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3283:2: rule__Size__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Size__Group__2__Impl_in_rule__Size__Group__26791);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3289:1: rule__Size__Group__2__Impl : ( ( rule__Size__ValueAssignment_2 ) ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3293:1: ( ( ( rule__Size__ValueAssignment_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3294:1: ( ( rule__Size__ValueAssignment_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3294:1: ( ( rule__Size__ValueAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3295:1: ( rule__Size__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getValueAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3296:1: ( rule__Size__ValueAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3296:2: rule__Size__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Size__ValueAssignment_2_in_rule__Size__Group__2__Impl6818);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3312:1: rule__Direction__Group__0 : rule__Direction__Group__0__Impl rule__Direction__Group__1 ;
    public final void rule__Direction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3316:1: ( rule__Direction__Group__0__Impl rule__Direction__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3317:2: rule__Direction__Group__0__Impl rule__Direction__Group__1
            {
            pushFollow(FOLLOW_rule__Direction__Group__0__Impl_in_rule__Direction__Group__06854);
            rule__Direction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Direction__Group__1_in_rule__Direction__Group__06857);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3324:1: rule__Direction__Group__0__Impl : ( 'direction' ) ;
    public final void rule__Direction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3328:1: ( ( 'direction' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3329:1: ( 'direction' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3329:1: ( 'direction' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3330:1: 'direction'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectionAccess().getDirectionKeyword_0()); 
            }
            match(input,68,FOLLOW_68_in_rule__Direction__Group__0__Impl6885); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3343:1: rule__Direction__Group__1 : rule__Direction__Group__1__Impl rule__Direction__Group__2 ;
    public final void rule__Direction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3347:1: ( rule__Direction__Group__1__Impl rule__Direction__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3348:2: rule__Direction__Group__1__Impl rule__Direction__Group__2
            {
            pushFollow(FOLLOW_rule__Direction__Group__1__Impl_in_rule__Direction__Group__16916);
            rule__Direction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Direction__Group__2_in_rule__Direction__Group__16919);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3355:1: rule__Direction__Group__1__Impl : ( '=' ) ;
    public final void rule__Direction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3359:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3360:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3360:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3361:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,56,FOLLOW_56_in_rule__Direction__Group__1__Impl6947); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3374:1: rule__Direction__Group__2 : rule__Direction__Group__2__Impl ;
    public final void rule__Direction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3378:1: ( rule__Direction__Group__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3379:2: rule__Direction__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Direction__Group__2__Impl_in_rule__Direction__Group__26978);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3385:1: rule__Direction__Group__2__Impl : ( ( rule__Direction__ValueAssignment_2 ) ) ;
    public final void rule__Direction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3389:1: ( ( ( rule__Direction__ValueAssignment_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3390:1: ( ( rule__Direction__ValueAssignment_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3390:1: ( ( rule__Direction__ValueAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3391:1: ( rule__Direction__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectionAccess().getValueAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3392:1: ( rule__Direction__ValueAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3392:2: rule__Direction__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Direction__ValueAssignment_2_in_rule__Direction__Group__2__Impl7005);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3408:1: rule__Margin__Group__0 : rule__Margin__Group__0__Impl rule__Margin__Group__1 ;
    public final void rule__Margin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3412:1: ( rule__Margin__Group__0__Impl rule__Margin__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3413:2: rule__Margin__Group__0__Impl rule__Margin__Group__1
            {
            pushFollow(FOLLOW_rule__Margin__Group__0__Impl_in_rule__Margin__Group__07041);
            rule__Margin__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Margin__Group__1_in_rule__Margin__Group__07044);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3420:1: rule__Margin__Group__0__Impl : ( 'margin' ) ;
    public final void rule__Margin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3424:1: ( ( 'margin' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3425:1: ( 'margin' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3425:1: ( 'margin' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3426:1: 'margin'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarginAccess().getMarginKeyword_0()); 
            }
            match(input,69,FOLLOW_69_in_rule__Margin__Group__0__Impl7072); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3439:1: rule__Margin__Group__1 : rule__Margin__Group__1__Impl rule__Margin__Group__2 ;
    public final void rule__Margin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3443:1: ( rule__Margin__Group__1__Impl rule__Margin__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3444:2: rule__Margin__Group__1__Impl rule__Margin__Group__2
            {
            pushFollow(FOLLOW_rule__Margin__Group__1__Impl_in_rule__Margin__Group__17103);
            rule__Margin__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Margin__Group__2_in_rule__Margin__Group__17106);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3451:1: rule__Margin__Group__1__Impl : ( '=' ) ;
    public final void rule__Margin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3455:1: ( ( '=' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3456:1: ( '=' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3456:1: ( '=' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3457:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarginAccess().getEqualsSignKeyword_1()); 
            }
            match(input,56,FOLLOW_56_in_rule__Margin__Group__1__Impl7134); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3470:1: rule__Margin__Group__2 : rule__Margin__Group__2__Impl ;
    public final void rule__Margin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3474:1: ( rule__Margin__Group__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3475:2: rule__Margin__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Margin__Group__2__Impl_in_rule__Margin__Group__27165);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3481:1: rule__Margin__Group__2__Impl : ( ( rule__Margin__ValueAssignment_2 ) ) ;
    public final void rule__Margin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3485:1: ( ( ( rule__Margin__ValueAssignment_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3486:1: ( ( rule__Margin__ValueAssignment_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3486:1: ( ( rule__Margin__ValueAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3487:1: ( rule__Margin__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarginAccess().getValueAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3488:1: ( rule__Margin__ValueAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3488:2: rule__Margin__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Margin__ValueAssignment_2_in_rule__Margin__Group__2__Impl7192);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3504:1: rule__Color__Group_0__0 : rule__Color__Group_0__0__Impl rule__Color__Group_0__1 ;
    public final void rule__Color__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3508:1: ( rule__Color__Group_0__0__Impl rule__Color__Group_0__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3509:2: rule__Color__Group_0__0__Impl rule__Color__Group_0__1
            {
            pushFollow(FOLLOW_rule__Color__Group_0__0__Impl_in_rule__Color__Group_0__07228);
            rule__Color__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Color__Group_0__1_in_rule__Color__Group_0__07231);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3516:1: rule__Color__Group_0__0__Impl : ( () ) ;
    public final void rule__Color__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3520:1: ( ( () ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3521:1: ( () )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3521:1: ( () )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3522:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getColorAction_0_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3523:1: ()
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3525:1: 
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3535:1: rule__Color__Group_0__1 : rule__Color__Group_0__1__Impl ;
    public final void rule__Color__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3539:1: ( rule__Color__Group_0__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3540:2: rule__Color__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Color__Group_0__1__Impl_in_rule__Color__Group_0__17289);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3546:1: rule__Color__Group_0__1__Impl : ( ( rule__Color__ValueAssignment_0_1 ) ) ;
    public final void rule__Color__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3550:1: ( ( ( rule__Color__ValueAssignment_0_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3551:1: ( ( rule__Color__ValueAssignment_0_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3551:1: ( ( rule__Color__ValueAssignment_0_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3552:1: ( rule__Color__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getValueAssignment_0_1()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3553:1: ( rule__Color__ValueAssignment_0_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3553:2: rule__Color__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Color__ValueAssignment_0_1_in_rule__Color__Group_0__1__Impl7316);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3567:1: rule__ConcreteColor__Group__0 : rule__ConcreteColor__Group__0__Impl rule__ConcreteColor__Group__1 ;
    public final void rule__ConcreteColor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3571:1: ( rule__ConcreteColor__Group__0__Impl rule__ConcreteColor__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3572:2: rule__ConcreteColor__Group__0__Impl rule__ConcreteColor__Group__1
            {
            pushFollow(FOLLOW_rule__ConcreteColor__Group__0__Impl_in_rule__ConcreteColor__Group__07350);
            rule__ConcreteColor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConcreteColor__Group__1_in_rule__ConcreteColor__Group__07353);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3579:1: rule__ConcreteColor__Group__0__Impl : ( 'RGB' ) ;
    public final void rule__ConcreteColor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3583:1: ( ( 'RGB' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3584:1: ( 'RGB' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3584:1: ( 'RGB' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3585:1: 'RGB'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getRGBKeyword_0()); 
            }
            match(input,70,FOLLOW_70_in_rule__ConcreteColor__Group__0__Impl7381); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3598:1: rule__ConcreteColor__Group__1 : rule__ConcreteColor__Group__1__Impl rule__ConcreteColor__Group__2 ;
    public final void rule__ConcreteColor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3602:1: ( rule__ConcreteColor__Group__1__Impl rule__ConcreteColor__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3603:2: rule__ConcreteColor__Group__1__Impl rule__ConcreteColor__Group__2
            {
            pushFollow(FOLLOW_rule__ConcreteColor__Group__1__Impl_in_rule__ConcreteColor__Group__17412);
            rule__ConcreteColor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConcreteColor__Group__2_in_rule__ConcreteColor__Group__17415);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3610:1: rule__ConcreteColor__Group__1__Impl : ( '(' ) ;
    public final void rule__ConcreteColor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3614:1: ( ( '(' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3615:1: ( '(' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3615:1: ( '(' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3616:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,71,FOLLOW_71_in_rule__ConcreteColor__Group__1__Impl7443); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3629:1: rule__ConcreteColor__Group__2 : rule__ConcreteColor__Group__2__Impl rule__ConcreteColor__Group__3 ;
    public final void rule__ConcreteColor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3633:1: ( rule__ConcreteColor__Group__2__Impl rule__ConcreteColor__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3634:2: rule__ConcreteColor__Group__2__Impl rule__ConcreteColor__Group__3
            {
            pushFollow(FOLLOW_rule__ConcreteColor__Group__2__Impl_in_rule__ConcreteColor__Group__27474);
            rule__ConcreteColor__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConcreteColor__Group__3_in_rule__ConcreteColor__Group__27477);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3641:1: rule__ConcreteColor__Group__2__Impl : ( ( rule__ConcreteColor__RedAssignment_2 ) ) ;
    public final void rule__ConcreteColor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3645:1: ( ( ( rule__ConcreteColor__RedAssignment_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3646:1: ( ( rule__ConcreteColor__RedAssignment_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3646:1: ( ( rule__ConcreteColor__RedAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3647:1: ( rule__ConcreteColor__RedAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getRedAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3648:1: ( rule__ConcreteColor__RedAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3648:2: rule__ConcreteColor__RedAssignment_2
            {
            pushFollow(FOLLOW_rule__ConcreteColor__RedAssignment_2_in_rule__ConcreteColor__Group__2__Impl7504);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3658:1: rule__ConcreteColor__Group__3 : rule__ConcreteColor__Group__3__Impl rule__ConcreteColor__Group__4 ;
    public final void rule__ConcreteColor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3662:1: ( rule__ConcreteColor__Group__3__Impl rule__ConcreteColor__Group__4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3663:2: rule__ConcreteColor__Group__3__Impl rule__ConcreteColor__Group__4
            {
            pushFollow(FOLLOW_rule__ConcreteColor__Group__3__Impl_in_rule__ConcreteColor__Group__37534);
            rule__ConcreteColor__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConcreteColor__Group__4_in_rule__ConcreteColor__Group__37537);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3670:1: rule__ConcreteColor__Group__3__Impl : ( ',' ) ;
    public final void rule__ConcreteColor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3674:1: ( ( ',' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3675:1: ( ',' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3675:1: ( ',' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3676:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getCommaKeyword_3()); 
            }
            match(input,72,FOLLOW_72_in_rule__ConcreteColor__Group__3__Impl7565); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3689:1: rule__ConcreteColor__Group__4 : rule__ConcreteColor__Group__4__Impl rule__ConcreteColor__Group__5 ;
    public final void rule__ConcreteColor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3693:1: ( rule__ConcreteColor__Group__4__Impl rule__ConcreteColor__Group__5 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3694:2: rule__ConcreteColor__Group__4__Impl rule__ConcreteColor__Group__5
            {
            pushFollow(FOLLOW_rule__ConcreteColor__Group__4__Impl_in_rule__ConcreteColor__Group__47596);
            rule__ConcreteColor__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConcreteColor__Group__5_in_rule__ConcreteColor__Group__47599);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3701:1: rule__ConcreteColor__Group__4__Impl : ( ( rule__ConcreteColor__GreenAssignment_4 ) ) ;
    public final void rule__ConcreteColor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3705:1: ( ( ( rule__ConcreteColor__GreenAssignment_4 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3706:1: ( ( rule__ConcreteColor__GreenAssignment_4 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3706:1: ( ( rule__ConcreteColor__GreenAssignment_4 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3707:1: ( rule__ConcreteColor__GreenAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getGreenAssignment_4()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3708:1: ( rule__ConcreteColor__GreenAssignment_4 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3708:2: rule__ConcreteColor__GreenAssignment_4
            {
            pushFollow(FOLLOW_rule__ConcreteColor__GreenAssignment_4_in_rule__ConcreteColor__Group__4__Impl7626);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3718:1: rule__ConcreteColor__Group__5 : rule__ConcreteColor__Group__5__Impl rule__ConcreteColor__Group__6 ;
    public final void rule__ConcreteColor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3722:1: ( rule__ConcreteColor__Group__5__Impl rule__ConcreteColor__Group__6 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3723:2: rule__ConcreteColor__Group__5__Impl rule__ConcreteColor__Group__6
            {
            pushFollow(FOLLOW_rule__ConcreteColor__Group__5__Impl_in_rule__ConcreteColor__Group__57656);
            rule__ConcreteColor__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConcreteColor__Group__6_in_rule__ConcreteColor__Group__57659);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3730:1: rule__ConcreteColor__Group__5__Impl : ( ',' ) ;
    public final void rule__ConcreteColor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3734:1: ( ( ',' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3735:1: ( ',' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3735:1: ( ',' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3736:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getCommaKeyword_5()); 
            }
            match(input,72,FOLLOW_72_in_rule__ConcreteColor__Group__5__Impl7687); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3749:1: rule__ConcreteColor__Group__6 : rule__ConcreteColor__Group__6__Impl rule__ConcreteColor__Group__7 ;
    public final void rule__ConcreteColor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3753:1: ( rule__ConcreteColor__Group__6__Impl rule__ConcreteColor__Group__7 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3754:2: rule__ConcreteColor__Group__6__Impl rule__ConcreteColor__Group__7
            {
            pushFollow(FOLLOW_rule__ConcreteColor__Group__6__Impl_in_rule__ConcreteColor__Group__67718);
            rule__ConcreteColor__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConcreteColor__Group__7_in_rule__ConcreteColor__Group__67721);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3761:1: rule__ConcreteColor__Group__6__Impl : ( ( rule__ConcreteColor__BlueAssignment_6 ) ) ;
    public final void rule__ConcreteColor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3765:1: ( ( ( rule__ConcreteColor__BlueAssignment_6 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3766:1: ( ( rule__ConcreteColor__BlueAssignment_6 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3766:1: ( ( rule__ConcreteColor__BlueAssignment_6 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3767:1: ( rule__ConcreteColor__BlueAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getBlueAssignment_6()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3768:1: ( rule__ConcreteColor__BlueAssignment_6 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3768:2: rule__ConcreteColor__BlueAssignment_6
            {
            pushFollow(FOLLOW_rule__ConcreteColor__BlueAssignment_6_in_rule__ConcreteColor__Group__6__Impl7748);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3778:1: rule__ConcreteColor__Group__7 : rule__ConcreteColor__Group__7__Impl ;
    public final void rule__ConcreteColor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3782:1: ( rule__ConcreteColor__Group__7__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3783:2: rule__ConcreteColor__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ConcreteColor__Group__7__Impl_in_rule__ConcreteColor__Group__77778);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3789:1: rule__ConcreteColor__Group__7__Impl : ( ')' ) ;
    public final void rule__ConcreteColor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3793:1: ( ( ')' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3794:1: ( ')' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3794:1: ( ')' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3795:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,73,FOLLOW_73_in_rule__ConcreteColor__Group__7__Impl7806); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3824:1: rule__Activation__Group__0 : rule__Activation__Group__0__Impl rule__Activation__Group__1 ;
    public final void rule__Activation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3828:1: ( rule__Activation__Group__0__Impl rule__Activation__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3829:2: rule__Activation__Group__0__Impl rule__Activation__Group__1
            {
            pushFollow(FOLLOW_rule__Activation__Group__0__Impl_in_rule__Activation__Group__07853);
            rule__Activation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activation__Group__1_in_rule__Activation__Group__07856);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3836:1: rule__Activation__Group__0__Impl : ( 'active when' ) ;
    public final void rule__Activation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3840:1: ( ( 'active when' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3841:1: ( 'active when' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3841:1: ( 'active when' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3842:1: 'active when'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivationAccess().getActiveWhenKeyword_0()); 
            }
            match(input,74,FOLLOW_74_in_rule__Activation__Group__0__Impl7884); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3855:1: rule__Activation__Group__1 : rule__Activation__Group__1__Impl ;
    public final void rule__Activation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3859:1: ( rule__Activation__Group__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3860:2: rule__Activation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Activation__Group__1__Impl_in_rule__Activation__Group__17915);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3866:1: rule__Activation__Group__1__Impl : ( ( rule__Activation__ConditionAssignment_1 ) ) ;
    public final void rule__Activation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3870:1: ( ( ( rule__Activation__ConditionAssignment_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3871:1: ( ( rule__Activation__ConditionAssignment_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3871:1: ( ( rule__Activation__ConditionAssignment_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3872:1: ( rule__Activation__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivationAccess().getConditionAssignment_1()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3873:1: ( rule__Activation__ConditionAssignment_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3873:2: rule__Activation__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__Activation__ConditionAssignment_1_in_rule__Activation__Group__1__Impl7942);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3887:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3891:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3892:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__07976);
            rule__Condition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__07979);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3899:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__AttributeAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3903:1: ( ( ( rule__Condition__AttributeAssignment_0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3904:1: ( ( rule__Condition__AttributeAssignment_0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3904:1: ( ( rule__Condition__AttributeAssignment_0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3905:1: ( rule__Condition__AttributeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getAttributeAssignment_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3906:1: ( rule__Condition__AttributeAssignment_0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3906:2: rule__Condition__AttributeAssignment_0
            {
            pushFollow(FOLLOW_rule__Condition__AttributeAssignment_0_in_rule__Condition__Group__0__Impl8006);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3916:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3920:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3921:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__18036);
            rule__Condition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__18039);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3928:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__OperatorAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3932:1: ( ( ( rule__Condition__OperatorAssignment_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3933:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3933:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3934:1: ( rule__Condition__OperatorAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getOperatorAssignment_1()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3935:1: ( rule__Condition__OperatorAssignment_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3935:2: rule__Condition__OperatorAssignment_1
            {
            pushFollow(FOLLOW_rule__Condition__OperatorAssignment_1_in_rule__Condition__Group__1__Impl8066);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3945:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3949:1: ( rule__Condition__Group__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3950:2: rule__Condition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__28096);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3956:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__ValueAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3960:1: ( ( ( rule__Condition__ValueAssignment_2 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3961:1: ( ( rule__Condition__ValueAssignment_2 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3961:1: ( ( rule__Condition__ValueAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3962:1: ( rule__Condition__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getValueAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3963:1: ( rule__Condition__ValueAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3963:2: rule__Condition__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Condition__ValueAssignment_2_in_rule__Condition__Group__2__Impl8123);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3979:1: rule__CompositeCondition__Group__0 : rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1 ;
    public final void rule__CompositeCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3983:1: ( rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3984:2: rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1
            {
            pushFollow(FOLLOW_rule__CompositeCondition__Group__0__Impl_in_rule__CompositeCondition__Group__08159);
            rule__CompositeCondition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompositeCondition__Group__1_in_rule__CompositeCondition__Group__08162);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3991:1: rule__CompositeCondition__Group__0__Impl : ( ( rule__CompositeCondition__OperatorAssignment_0 ) ) ;
    public final void rule__CompositeCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3995:1: ( ( ( rule__CompositeCondition__OperatorAssignment_0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3996:1: ( ( rule__CompositeCondition__OperatorAssignment_0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3996:1: ( ( rule__CompositeCondition__OperatorAssignment_0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3997:1: ( rule__CompositeCondition__OperatorAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getOperatorAssignment_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3998:1: ( rule__CompositeCondition__OperatorAssignment_0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:3998:2: rule__CompositeCondition__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__CompositeCondition__OperatorAssignment_0_in_rule__CompositeCondition__Group__0__Impl8189);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4008:1: rule__CompositeCondition__Group__1 : rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2 ;
    public final void rule__CompositeCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4012:1: ( rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4013:2: rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2
            {
            pushFollow(FOLLOW_rule__CompositeCondition__Group__1__Impl_in_rule__CompositeCondition__Group__18219);
            rule__CompositeCondition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompositeCondition__Group__2_in_rule__CompositeCondition__Group__18222);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4020:1: rule__CompositeCondition__Group__1__Impl : ( '(' ) ;
    public final void rule__CompositeCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4024:1: ( ( '(' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4025:1: ( '(' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4025:1: ( '(' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4026:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,71,FOLLOW_71_in_rule__CompositeCondition__Group__1__Impl8250); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4039:1: rule__CompositeCondition__Group__2 : rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3 ;
    public final void rule__CompositeCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4043:1: ( rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4044:2: rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3
            {
            pushFollow(FOLLOW_rule__CompositeCondition__Group__2__Impl_in_rule__CompositeCondition__Group__28281);
            rule__CompositeCondition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompositeCondition__Group__3_in_rule__CompositeCondition__Group__28284);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4051:1: rule__CompositeCondition__Group__2__Impl : ( ( ( rule__CompositeCondition__ConditionsAssignment_2 ) ) ( ( rule__CompositeCondition__ConditionsAssignment_2 )* ) ) ;
    public final void rule__CompositeCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4055:1: ( ( ( ( rule__CompositeCondition__ConditionsAssignment_2 ) ) ( ( rule__CompositeCondition__ConditionsAssignment_2 )* ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4056:1: ( ( ( rule__CompositeCondition__ConditionsAssignment_2 ) ) ( ( rule__CompositeCondition__ConditionsAssignment_2 )* ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4056:1: ( ( ( rule__CompositeCondition__ConditionsAssignment_2 ) ) ( ( rule__CompositeCondition__ConditionsAssignment_2 )* ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4057:1: ( ( rule__CompositeCondition__ConditionsAssignment_2 ) ) ( ( rule__CompositeCondition__ConditionsAssignment_2 )* )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4057:1: ( ( rule__CompositeCondition__ConditionsAssignment_2 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4058:1: ( rule__CompositeCondition__ConditionsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getConditionsAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4059:1: ( rule__CompositeCondition__ConditionsAssignment_2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4059:2: rule__CompositeCondition__ConditionsAssignment_2
            {
            pushFollow(FOLLOW_rule__CompositeCondition__ConditionsAssignment_2_in_rule__CompositeCondition__Group__2__Impl8313);
            rule__CompositeCondition__ConditionsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getConditionsAssignment_2()); 
            }

            }

            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4062:1: ( ( rule__CompositeCondition__ConditionsAssignment_2 )* )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4063:1: ( rule__CompositeCondition__ConditionsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getConditionsAssignment_2()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4064:1: ( rule__CompositeCondition__ConditionsAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=18 && LA14_0<=19)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4064:2: rule__CompositeCondition__ConditionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__CompositeCondition__ConditionsAssignment_2_in_rule__CompositeCondition__Group__2__Impl8325);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4075:1: rule__CompositeCondition__Group__3 : rule__CompositeCondition__Group__3__Impl ;
    public final void rule__CompositeCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4079:1: ( rule__CompositeCondition__Group__3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4080:2: rule__CompositeCondition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CompositeCondition__Group__3__Impl_in_rule__CompositeCondition__Group__38358);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4086:1: rule__CompositeCondition__Group__3__Impl : ( ')' ) ;
    public final void rule__CompositeCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4090:1: ( ( ')' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4091:1: ( ')' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4091:1: ( ')' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4092:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,73,FOLLOW_73_in_rule__CompositeCondition__Group__3__Impl8386); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4113:1: rule__SignedDouble__Group__0 : rule__SignedDouble__Group__0__Impl rule__SignedDouble__Group__1 ;
    public final void rule__SignedDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4117:1: ( rule__SignedDouble__Group__0__Impl rule__SignedDouble__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4118:2: rule__SignedDouble__Group__0__Impl rule__SignedDouble__Group__1
            {
            pushFollow(FOLLOW_rule__SignedDouble__Group__0__Impl_in_rule__SignedDouble__Group__08425);
            rule__SignedDouble__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SignedDouble__Group__1_in_rule__SignedDouble__Group__08428);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4125:1: rule__SignedDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SignedDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4129:1: ( ( ( '-' )? ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4130:1: ( ( '-' )? )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4130:1: ( ( '-' )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4131:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedDoubleAccess().getHyphenMinusKeyword_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4132:1: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==75) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4133:2: '-'
                    {
                    match(input,75,FOLLOW_75_in_rule__SignedDouble__Group__0__Impl8457); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4144:1: rule__SignedDouble__Group__1 : rule__SignedDouble__Group__1__Impl rule__SignedDouble__Group__2 ;
    public final void rule__SignedDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4148:1: ( rule__SignedDouble__Group__1__Impl rule__SignedDouble__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4149:2: rule__SignedDouble__Group__1__Impl rule__SignedDouble__Group__2
            {
            pushFollow(FOLLOW_rule__SignedDouble__Group__1__Impl_in_rule__SignedDouble__Group__18490);
            rule__SignedDouble__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SignedDouble__Group__2_in_rule__SignedDouble__Group__18493);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4156:1: rule__SignedDouble__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__SignedDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4160:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4161:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4161:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4162:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedDoubleAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SignedDouble__Group__1__Impl8520); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4173:1: rule__SignedDouble__Group__2 : rule__SignedDouble__Group__2__Impl rule__SignedDouble__Group__3 ;
    public final void rule__SignedDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4177:1: ( rule__SignedDouble__Group__2__Impl rule__SignedDouble__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4178:2: rule__SignedDouble__Group__2__Impl rule__SignedDouble__Group__3
            {
            pushFollow(FOLLOW_rule__SignedDouble__Group__2__Impl_in_rule__SignedDouble__Group__28549);
            rule__SignedDouble__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SignedDouble__Group__3_in_rule__SignedDouble__Group__28552);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4185:1: rule__SignedDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__SignedDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4189:1: ( ( '.' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4190:1: ( '.' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4190:1: ( '.' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4191:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedDoubleAccess().getFullStopKeyword_2()); 
            }
            match(input,76,FOLLOW_76_in_rule__SignedDouble__Group__2__Impl8580); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4204:1: rule__SignedDouble__Group__3 : rule__SignedDouble__Group__3__Impl ;
    public final void rule__SignedDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4208:1: ( rule__SignedDouble__Group__3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4209:2: rule__SignedDouble__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SignedDouble__Group__3__Impl_in_rule__SignedDouble__Group__38611);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4215:1: rule__SignedDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__SignedDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4219:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4220:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4220:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4221:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedDoubleAccess().getINTTerminalRuleCall_3()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SignedDouble__Group__3__Impl8638); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4240:1: rule__SignedInteger__Group__0 : rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 ;
    public final void rule__SignedInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4244:1: ( rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4245:2: rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1
            {
            pushFollow(FOLLOW_rule__SignedInteger__Group__0__Impl_in_rule__SignedInteger__Group__08675);
            rule__SignedInteger__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SignedInteger__Group__1_in_rule__SignedInteger__Group__08678);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4252:1: rule__SignedInteger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SignedInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4256:1: ( ( ( '-' )? ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4257:1: ( ( '-' )? )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4257:1: ( ( '-' )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4258:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4259:1: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==75) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4260:2: '-'
                    {
                    match(input,75,FOLLOW_75_in_rule__SignedInteger__Group__0__Impl8707); if (state.failed) return ;

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4271:1: rule__SignedInteger__Group__1 : rule__SignedInteger__Group__1__Impl ;
    public final void rule__SignedInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4275:1: ( rule__SignedInteger__Group__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4276:2: rule__SignedInteger__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SignedInteger__Group__1__Impl_in_rule__SignedInteger__Group__18740);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4282:1: rule__SignedInteger__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__SignedInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4286:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4287:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4287:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4288:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignedIntegerAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SignedInteger__Group__1__Impl8767); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4304:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4308:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4309:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08801);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08804);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4316:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4320:1: ( ( RULE_ID ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4321:1: ( RULE_ID )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4321:1: ( RULE_ID )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4322:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8831); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4333:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4337:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4338:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18860);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4344:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4348:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4349:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4349:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4350:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4351:1: ( rule__QualifiedName__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==76) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4351:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8887);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4365:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4369:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4370:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08922);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08925);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4377:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4381:1: ( ( '.' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4382:1: ( '.' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4382:1: ( '.' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4383:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,76,FOLLOW_76_in_rule__QualifiedName__Group_1__0__Impl8953); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4396:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4400:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4401:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18984);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4407:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4411:1: ( ( RULE_ID ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4412:1: ( RULE_ID )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4412:1: ( RULE_ID )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4413:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl9011); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4429:1: rule__DecorationDescription__UnorderedGroup_3 : rule__DecorationDescription__UnorderedGroup_3__0 {...}?;
    public final void rule__DecorationDescription__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3());
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4434:1: ( rule__DecorationDescription__UnorderedGroup_3__0 {...}?)
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4435:2: rule__DecorationDescription__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_rule__DecorationDescription__UnorderedGroup_3__0_in_rule__DecorationDescription__UnorderedGroup_39045);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4446:1: rule__DecorationDescription__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) ) ) ) ;
    public final void rule__DecorationDescription__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4451:1: ( ( ({...}? => ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) ) ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4452:3: ( ({...}? => ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4452:3: ( ({...}? => ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) ) ) )
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4454:4: ({...}? => ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4454:4: ({...}? => ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4455:5: {...}? => ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__DecorationDescription__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4455:118: ( ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4456:6: ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4462:6: ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4463:6: ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) ) ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4463:6: ( ( rule__DecorationDescription__DecorationsAssignment_3_0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4464:7: ( rule__DecorationDescription__DecorationsAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecorationDescriptionAccess().getDecorationsAssignment_3_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4465:7: ( rule__DecorationDescription__DecorationsAssignment_3_0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4465:8: rule__DecorationDescription__DecorationsAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__DecorationDescription__DecorationsAssignment_3_0_in_rule__DecorationDescription__UnorderedGroup_3__Impl9135);
                    rule__DecorationDescription__DecorationsAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDecorationDescriptionAccess().getDecorationsAssignment_3_0()); 
                    }

                    }

                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4468:6: ( ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )* )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4469:7: ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecorationDescriptionAccess().getDecorationsAssignment_3_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4470:7: ( ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0 )*
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
                    	    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4470:8: ( rule__DecorationDescription__DecorationsAssignment_3_0 )=> rule__DecorationDescription__DecorationsAssignment_3_0
                    	    {
                    	    pushFollow(FOLLOW_rule__DecorationDescription__DecorationsAssignment_3_0_in_rule__DecorationDescription__UnorderedGroup_3__Impl9179);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4476:4: ({...}? => ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4476:4: ({...}? => ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4477:5: {...}? => ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__DecorationDescription__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4477:118: ( ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4478:6: ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getDecorationDescriptionAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4484:6: ( ( rule__DecorationDescription__ActivationAssignment_3_1 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4486:7: ( rule__DecorationDescription__ActivationAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecorationDescriptionAccess().getActivationAssignment_3_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4487:7: ( rule__DecorationDescription__ActivationAssignment_3_1 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4487:8: rule__DecorationDescription__ActivationAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__DecorationDescription__ActivationAssignment_3_1_in_rule__DecorationDescription__UnorderedGroup_3__Impl9277);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4502:1: rule__DecorationDescription__UnorderedGroup_3__0 : rule__DecorationDescription__UnorderedGroup_3__Impl ( rule__DecorationDescription__UnorderedGroup_3__1 )? ;
    public final void rule__DecorationDescription__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4506:1: ( rule__DecorationDescription__UnorderedGroup_3__Impl ( rule__DecorationDescription__UnorderedGroup_3__1 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4507:2: rule__DecorationDescription__UnorderedGroup_3__Impl ( rule__DecorationDescription__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__DecorationDescription__UnorderedGroup_3__Impl_in_rule__DecorationDescription__UnorderedGroup_3__09336);
            rule__DecorationDescription__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4508:2: ( rule__DecorationDescription__UnorderedGroup_3__1 )?
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4508:2: rule__DecorationDescription__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__DecorationDescription__UnorderedGroup_3__1_in_rule__DecorationDescription__UnorderedGroup_3__09339);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4515:1: rule__DecorationDescription__UnorderedGroup_3__1 : rule__DecorationDescription__UnorderedGroup_3__Impl ;
    public final void rule__DecorationDescription__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4519:1: ( rule__DecorationDescription__UnorderedGroup_3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4520:2: rule__DecorationDescription__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__DecorationDescription__UnorderedGroup_3__Impl_in_rule__DecorationDescription__UnorderedGroup_3__19364);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4531:1: rule__ImageDecoration__UnorderedGroup_3 : rule__ImageDecoration__UnorderedGroup_3__0 {...}?;
    public final void rule__ImageDecoration__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3());
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4536:1: ( rule__ImageDecoration__UnorderedGroup_3__0 {...}?)
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4537:2: rule__ImageDecoration__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__0_in_rule__ImageDecoration__UnorderedGroup_39392);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4548:1: rule__ImageDecoration__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) ) ) ) ;
    public final void rule__ImageDecoration__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4553:1: ( ( ({...}? => ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) ) ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4554:3: ( ({...}? => ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4554:3: ( ({...}? => ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) ) ) )
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4556:4: ({...}? => ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4556:4: ({...}? => ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4557:5: {...}? => ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ImageDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4557:112: ( ( ( rule__ImageDecoration__Group_3_0__0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4558:6: ( ( rule__ImageDecoration__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4564:6: ( ( rule__ImageDecoration__Group_3_0__0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4566:7: ( rule__ImageDecoration__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImageDecorationAccess().getGroup_3_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4567:7: ( rule__ImageDecoration__Group_3_0__0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4567:8: rule__ImageDecoration__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__Group_3_0__0_in_rule__ImageDecoration__UnorderedGroup_3__Impl9481);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4573:4: ({...}? => ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4573:4: ({...}? => ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4574:5: {...}? => ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ImageDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4574:112: ( ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4575:6: ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4581:6: ( ( rule__ImageDecoration__DirectionAssignment_3_1 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4583:7: ( rule__ImageDecoration__DirectionAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImageDecorationAccess().getDirectionAssignment_3_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4584:7: ( rule__ImageDecoration__DirectionAssignment_3_1 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4584:8: rule__ImageDecoration__DirectionAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__DirectionAssignment_3_1_in_rule__ImageDecoration__UnorderedGroup_3__Impl9572);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4590:4: ({...}? => ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4590:4: ({...}? => ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4591:5: {...}? => ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ImageDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4591:112: ( ( ( rule__ImageDecoration__MarginAssignment_3_2 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4592:6: ( ( rule__ImageDecoration__MarginAssignment_3_2 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 2);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4598:6: ( ( rule__ImageDecoration__MarginAssignment_3_2 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4600:7: ( rule__ImageDecoration__MarginAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImageDecorationAccess().getMarginAssignment_3_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4601:7: ( rule__ImageDecoration__MarginAssignment_3_2 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4601:8: rule__ImageDecoration__MarginAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__MarginAssignment_3_2_in_rule__ImageDecoration__UnorderedGroup_3__Impl9663);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4607:4: ({...}? => ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4607:4: ({...}? => ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4608:5: {...}? => ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ImageDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4608:112: ( ( ( rule__ImageDecoration__Group_3_3__0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4609:6: ( ( rule__ImageDecoration__Group_3_3__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 3);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4615:6: ( ( rule__ImageDecoration__Group_3_3__0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4617:7: ( rule__ImageDecoration__Group_3_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImageDecorationAccess().getGroup_3_3()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4618:7: ( rule__ImageDecoration__Group_3_3__0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4618:8: rule__ImageDecoration__Group_3_3__0
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__Group_3_3__0_in_rule__ImageDecoration__UnorderedGroup_3__Impl9754);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4624:4: ({...}? => ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4624:4: ({...}? => ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4625:5: {...}? => ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ImageDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4625:112: ( ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4626:6: ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getImageDecorationAccess().getUnorderedGroup_3(), 4);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4632:6: ( ( rule__ImageDecoration__ActivationAssignment_3_4 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4634:7: ( rule__ImageDecoration__ActivationAssignment_3_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImageDecorationAccess().getActivationAssignment_3_4()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4635:7: ( rule__ImageDecoration__ActivationAssignment_3_4 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4635:8: rule__ImageDecoration__ActivationAssignment_3_4
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__ActivationAssignment_3_4_in_rule__ImageDecoration__UnorderedGroup_3__Impl9845);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4650:1: rule__ImageDecoration__UnorderedGroup_3__0 : rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__1 )? ;
    public final void rule__ImageDecoration__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4654:1: ( rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__1 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4655:2: rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__09904);
            rule__ImageDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4656:2: ( rule__ImageDecoration__UnorderedGroup_3__1 )?
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4656:2: rule__ImageDecoration__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__1_in_rule__ImageDecoration__UnorderedGroup_3__09907);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4663:1: rule__ImageDecoration__UnorderedGroup_3__1 : rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__2 )? ;
    public final void rule__ImageDecoration__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4667:1: ( rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__2 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4668:2: rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__19932);
            rule__ImageDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4669:2: ( rule__ImageDecoration__UnorderedGroup_3__2 )?
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4669:2: rule__ImageDecoration__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__2_in_rule__ImageDecoration__UnorderedGroup_3__19935);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4676:1: rule__ImageDecoration__UnorderedGroup_3__2 : rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__3 )? ;
    public final void rule__ImageDecoration__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4680:1: ( rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__3 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4681:2: rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__29960);
            rule__ImageDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4682:2: ( rule__ImageDecoration__UnorderedGroup_3__3 )?
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4682:2: rule__ImageDecoration__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__3_in_rule__ImageDecoration__UnorderedGroup_3__29963);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4689:1: rule__ImageDecoration__UnorderedGroup_3__3 : rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__4 )? ;
    public final void rule__ImageDecoration__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4693:1: ( rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__4 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4694:2: rule__ImageDecoration__UnorderedGroup_3__Impl ( rule__ImageDecoration__UnorderedGroup_3__4 )?
            {
            pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__39988);
            rule__ImageDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4695:2: ( rule__ImageDecoration__UnorderedGroup_3__4 )?
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4695:2: rule__ImageDecoration__UnorderedGroup_3__4
                    {
                    pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__4_in_rule__ImageDecoration__UnorderedGroup_3__39991);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4702:1: rule__ImageDecoration__UnorderedGroup_3__4 : rule__ImageDecoration__UnorderedGroup_3__Impl ;
    public final void rule__ImageDecoration__UnorderedGroup_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4706:1: ( rule__ImageDecoration__UnorderedGroup_3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4707:2: rule__ImageDecoration__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__410016);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4724:1: rule__BorderDecoration__UnorderedGroup_3 : ( rule__BorderDecoration__UnorderedGroup_3__0 )? ;
    public final void rule__BorderDecoration__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3());
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4729:1: ( ( rule__BorderDecoration__UnorderedGroup_3__0 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4730:2: ( rule__BorderDecoration__UnorderedGroup_3__0 )?
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4730:2: ( rule__BorderDecoration__UnorderedGroup_3__0 )?
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4730:2: rule__BorderDecoration__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__0_in_rule__BorderDecoration__UnorderedGroup_310050);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4740:1: rule__BorderDecoration__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) ) ) ) ;
    public final void rule__BorderDecoration__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4745:1: ( ( ({...}? => ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) ) ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4746:3: ( ({...}? => ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4746:3: ( ({...}? => ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) ) ) )
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4748:4: ({...}? => ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4748:4: ({...}? => ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4749:5: {...}? => ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__BorderDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4749:113: ( ( ( rule__BorderDecoration__SizeAssignment_3_0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4750:6: ( ( rule__BorderDecoration__SizeAssignment_3_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4756:6: ( ( rule__BorderDecoration__SizeAssignment_3_0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4758:7: ( rule__BorderDecoration__SizeAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBorderDecorationAccess().getSizeAssignment_3_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4759:7: ( rule__BorderDecoration__SizeAssignment_3_0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4759:8: rule__BorderDecoration__SizeAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__SizeAssignment_3_0_in_rule__BorderDecoration__UnorderedGroup_3__Impl10137);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4765:4: ({...}? => ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4765:4: ({...}? => ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4766:5: {...}? => ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__BorderDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4766:113: ( ( ( rule__BorderDecoration__Group_3_1__0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4767:6: ( ( rule__BorderDecoration__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4773:6: ( ( rule__BorderDecoration__Group_3_1__0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4775:7: ( rule__BorderDecoration__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBorderDecorationAccess().getGroup_3_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4776:7: ( rule__BorderDecoration__Group_3_1__0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4776:8: rule__BorderDecoration__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__Group_3_1__0_in_rule__BorderDecoration__UnorderedGroup_3__Impl10228);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4782:4: ({...}? => ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4782:4: ({...}? => ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4783:5: {...}? => ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__BorderDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4783:113: ( ( ( rule__BorderDecoration__StyleAssignment_3_2 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4784:6: ( ( rule__BorderDecoration__StyleAssignment_3_2 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 2);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4790:6: ( ( rule__BorderDecoration__StyleAssignment_3_2 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4792:7: ( rule__BorderDecoration__StyleAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBorderDecorationAccess().getStyleAssignment_3_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4793:7: ( rule__BorderDecoration__StyleAssignment_3_2 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4793:8: rule__BorderDecoration__StyleAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__StyleAssignment_3_2_in_rule__BorderDecoration__UnorderedGroup_3__Impl10319);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4799:4: ({...}? => ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4799:4: ({...}? => ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4800:5: {...}? => ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__BorderDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4800:113: ( ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4801:6: ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBorderDecorationAccess().getUnorderedGroup_3(), 3);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4807:6: ( ( rule__BorderDecoration__ActivationAssignment_3_3 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4809:7: ( rule__BorderDecoration__ActivationAssignment_3_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBorderDecorationAccess().getActivationAssignment_3_3()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4810:7: ( rule__BorderDecoration__ActivationAssignment_3_3 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4810:8: rule__BorderDecoration__ActivationAssignment_3_3
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__ActivationAssignment_3_3_in_rule__BorderDecoration__UnorderedGroup_3__Impl10410);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4825:1: rule__BorderDecoration__UnorderedGroup_3__0 : rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__1 )? ;
    public final void rule__BorderDecoration__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4829:1: ( rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__1 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4830:2: rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__010469);
            rule__BorderDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4831:2: ( rule__BorderDecoration__UnorderedGroup_3__1 )?
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4831:2: rule__BorderDecoration__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__1_in_rule__BorderDecoration__UnorderedGroup_3__010472);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4838:1: rule__BorderDecoration__UnorderedGroup_3__1 : rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__2 )? ;
    public final void rule__BorderDecoration__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4842:1: ( rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__2 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4843:2: rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__110497);
            rule__BorderDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4844:2: ( rule__BorderDecoration__UnorderedGroup_3__2 )?
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4844:2: rule__BorderDecoration__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__2_in_rule__BorderDecoration__UnorderedGroup_3__110500);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4851:1: rule__BorderDecoration__UnorderedGroup_3__2 : rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__3 )? ;
    public final void rule__BorderDecoration__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4855:1: ( rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__3 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4856:2: rule__BorderDecoration__UnorderedGroup_3__Impl ( rule__BorderDecoration__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__210525);
            rule__BorderDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4857:2: ( rule__BorderDecoration__UnorderedGroup_3__3 )?
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4857:2: rule__BorderDecoration__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__3_in_rule__BorderDecoration__UnorderedGroup_3__210528);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4864:1: rule__BorderDecoration__UnorderedGroup_3__3 : rule__BorderDecoration__UnorderedGroup_3__Impl ;
    public final void rule__BorderDecoration__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4868:1: ( rule__BorderDecoration__UnorderedGroup_3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4869:2: rule__BorderDecoration__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__310553);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4884:1: rule__ColorDecoration__UnorderedGroup_3 : ( rule__ColorDecoration__UnorderedGroup_3__0 )? ;
    public final void rule__ColorDecoration__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3());
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4889:1: ( ( rule__ColorDecoration__UnorderedGroup_3__0 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4890:2: ( rule__ColorDecoration__UnorderedGroup_3__0 )?
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4890:2: ( rule__ColorDecoration__UnorderedGroup_3__0 )?
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4890:2: rule__ColorDecoration__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_rule__ColorDecoration__UnorderedGroup_3__0_in_rule__ColorDecoration__UnorderedGroup_310585);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4900:1: rule__ColorDecoration__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) ) ) ) ;
    public final void rule__ColorDecoration__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4905:1: ( ( ({...}? => ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) ) ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4906:3: ( ({...}? => ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4906:3: ( ({...}? => ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) ) ) )
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4908:4: ({...}? => ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4908:4: ({...}? => ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4909:5: {...}? => ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ColorDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4909:112: ( ( ( rule__ColorDecoration__Group_3_0__0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4910:6: ( ( rule__ColorDecoration__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4916:6: ( ( rule__ColorDecoration__Group_3_0__0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4918:7: ( rule__ColorDecoration__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorDecorationAccess().getGroup_3_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4919:7: ( rule__ColorDecoration__Group_3_0__0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4919:8: rule__ColorDecoration__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__ColorDecoration__Group_3_0__0_in_rule__ColorDecoration__UnorderedGroup_3__Impl10672);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4925:4: ({...}? => ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4925:4: ({...}? => ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4926:5: {...}? => ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ColorDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4926:112: ( ( ( rule__ColorDecoration__Group_3_1__0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4927:6: ( ( rule__ColorDecoration__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4933:6: ( ( rule__ColorDecoration__Group_3_1__0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4935:7: ( rule__ColorDecoration__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorDecorationAccess().getGroup_3_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4936:7: ( rule__ColorDecoration__Group_3_1__0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4936:8: rule__ColorDecoration__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__ColorDecoration__Group_3_1__0_in_rule__ColorDecoration__UnorderedGroup_3__Impl10763);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4942:4: ({...}? => ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4942:4: ({...}? => ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4943:5: {...}? => ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ColorDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4943:112: ( ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4944:6: ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getColorDecorationAccess().getUnorderedGroup_3(), 2);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4950:6: ( ( rule__ColorDecoration__ActivationAssignment_3_2 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4952:7: ( rule__ColorDecoration__ActivationAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getColorDecorationAccess().getActivationAssignment_3_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4953:7: ( rule__ColorDecoration__ActivationAssignment_3_2 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4953:8: rule__ColorDecoration__ActivationAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__ColorDecoration__ActivationAssignment_3_2_in_rule__ColorDecoration__UnorderedGroup_3__Impl10854);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4968:1: rule__ColorDecoration__UnorderedGroup_3__0 : rule__ColorDecoration__UnorderedGroup_3__Impl ( rule__ColorDecoration__UnorderedGroup_3__1 )? ;
    public final void rule__ColorDecoration__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4972:1: ( rule__ColorDecoration__UnorderedGroup_3__Impl ( rule__ColorDecoration__UnorderedGroup_3__1 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4973:2: rule__ColorDecoration__UnorderedGroup_3__Impl ( rule__ColorDecoration__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__ColorDecoration__UnorderedGroup_3__Impl_in_rule__ColorDecoration__UnorderedGroup_3__010913);
            rule__ColorDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4974:2: ( rule__ColorDecoration__UnorderedGroup_3__1 )?
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4974:2: rule__ColorDecoration__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__ColorDecoration__UnorderedGroup_3__1_in_rule__ColorDecoration__UnorderedGroup_3__010916);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4981:1: rule__ColorDecoration__UnorderedGroup_3__1 : rule__ColorDecoration__UnorderedGroup_3__Impl ( rule__ColorDecoration__UnorderedGroup_3__2 )? ;
    public final void rule__ColorDecoration__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4985:1: ( rule__ColorDecoration__UnorderedGroup_3__Impl ( rule__ColorDecoration__UnorderedGroup_3__2 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4986:2: rule__ColorDecoration__UnorderedGroup_3__Impl ( rule__ColorDecoration__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_rule__ColorDecoration__UnorderedGroup_3__Impl_in_rule__ColorDecoration__UnorderedGroup_3__110941);
            rule__ColorDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4987:2: ( rule__ColorDecoration__UnorderedGroup_3__2 )?
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4987:2: rule__ColorDecoration__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_rule__ColorDecoration__UnorderedGroup_3__2_in_rule__ColorDecoration__UnorderedGroup_3__110944);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4994:1: rule__ColorDecoration__UnorderedGroup_3__2 : rule__ColorDecoration__UnorderedGroup_3__Impl ;
    public final void rule__ColorDecoration__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4998:1: ( rule__ColorDecoration__UnorderedGroup_3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4999:2: rule__ColorDecoration__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__ColorDecoration__UnorderedGroup_3__Impl_in_rule__ColorDecoration__UnorderedGroup_3__210969);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5012:1: rule__ConnectionDecoration__UnorderedGroup_3 : ( rule__ConnectionDecoration__UnorderedGroup_3__0 )? ;
    public final void rule__ConnectionDecoration__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3());
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5017:1: ( ( rule__ConnectionDecoration__UnorderedGroup_3__0 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5018:2: ( rule__ConnectionDecoration__UnorderedGroup_3__0 )?
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5018:2: ( rule__ConnectionDecoration__UnorderedGroup_3__0 )?
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5018:2: rule__ConnectionDecoration__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__0_in_rule__ConnectionDecoration__UnorderedGroup_310999);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5028:1: rule__ConnectionDecoration__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) ) ) ) ;
    public final void rule__ConnectionDecoration__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5033:1: ( ( ({...}? => ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) ) ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5034:3: ( ({...}? => ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) ) ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5034:3: ( ({...}? => ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) ) ) | ({...}? => ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) ) ) )
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5036:4: ({...}? => ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5036:4: ({...}? => ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5037:5: {...}? => ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ConnectionDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5037:117: ( ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5038:6: ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5044:6: ( ( rule__ConnectionDecoration__SizeAssignment_3_0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5046:7: ( rule__ConnectionDecoration__SizeAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConnectionDecorationAccess().getSizeAssignment_3_0()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5047:7: ( rule__ConnectionDecoration__SizeAssignment_3_0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5047:8: rule__ConnectionDecoration__SizeAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__SizeAssignment_3_0_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11086);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5053:4: ({...}? => ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5053:4: ({...}? => ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5054:5: {...}? => ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ConnectionDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5054:117: ( ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5055:6: ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5061:6: ( ( rule__ConnectionDecoration__StyleAssignment_3_1 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5063:7: ( rule__ConnectionDecoration__StyleAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConnectionDecorationAccess().getStyleAssignment_3_1()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5064:7: ( rule__ConnectionDecoration__StyleAssignment_3_1 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5064:8: rule__ConnectionDecoration__StyleAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__StyleAssignment_3_1_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11177);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5070:4: ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5070:4: ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5071:5: {...}? => ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ConnectionDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5071:117: ( ( ( rule__ConnectionDecoration__Group_3_2__0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5072:6: ( ( rule__ConnectionDecoration__Group_3_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 2);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5078:6: ( ( rule__ConnectionDecoration__Group_3_2__0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5080:7: ( rule__ConnectionDecoration__Group_3_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConnectionDecorationAccess().getGroup_3_2()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5081:7: ( rule__ConnectionDecoration__Group_3_2__0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5081:8: rule__ConnectionDecoration__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_2__0_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11268);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5087:4: ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5087:4: ({...}? => ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5088:5: {...}? => ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ConnectionDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5088:117: ( ( ( rule__ConnectionDecoration__Group_3_3__0 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5089:6: ( ( rule__ConnectionDecoration__Group_3_3__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 3);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5095:6: ( ( rule__ConnectionDecoration__Group_3_3__0 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5097:7: ( rule__ConnectionDecoration__Group_3_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConnectionDecorationAccess().getGroup_3_3()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5098:7: ( rule__ConnectionDecoration__Group_3_3__0 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5098:8: rule__ConnectionDecoration__Group_3_3__0
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__Group_3_3__0_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11359);
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5104:4: ({...}? => ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) ) )
                    {
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5104:4: ({...}? => ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5105:5: {...}? => ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ConnectionDecoration__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4)");
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5105:117: ( ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5106:6: ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getConnectionDecorationAccess().getUnorderedGroup_3(), 4);
                    selected = true;
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5112:6: ( ( rule__ConnectionDecoration__ActivationAssignment_3_4 ) )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5114:7: ( rule__ConnectionDecoration__ActivationAssignment_3_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConnectionDecorationAccess().getActivationAssignment_3_4()); 
                    }
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5115:7: ( rule__ConnectionDecoration__ActivationAssignment_3_4 )
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5115:8: rule__ConnectionDecoration__ActivationAssignment_3_4
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__ActivationAssignment_3_4_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11450);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5130:1: rule__ConnectionDecoration__UnorderedGroup_3__0 : rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__1 )? ;
    public final void rule__ConnectionDecoration__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5134:1: ( rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__1 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5135:2: rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__011509);
            rule__ConnectionDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5136:2: ( rule__ConnectionDecoration__UnorderedGroup_3__1 )?
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5136:2: rule__ConnectionDecoration__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__1_in_rule__ConnectionDecoration__UnorderedGroup_3__011512);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5143:1: rule__ConnectionDecoration__UnorderedGroup_3__1 : rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__2 )? ;
    public final void rule__ConnectionDecoration__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5147:1: ( rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__2 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5148:2: rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__111537);
            rule__ConnectionDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5149:2: ( rule__ConnectionDecoration__UnorderedGroup_3__2 )?
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5149:2: rule__ConnectionDecoration__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__2_in_rule__ConnectionDecoration__UnorderedGroup_3__111540);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5156:1: rule__ConnectionDecoration__UnorderedGroup_3__2 : rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__3 )? ;
    public final void rule__ConnectionDecoration__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5160:1: ( rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__3 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5161:2: rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__211565);
            rule__ConnectionDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5162:2: ( rule__ConnectionDecoration__UnorderedGroup_3__3 )?
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5162:2: rule__ConnectionDecoration__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__3_in_rule__ConnectionDecoration__UnorderedGroup_3__211568);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5169:1: rule__ConnectionDecoration__UnorderedGroup_3__3 : rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__4 )? ;
    public final void rule__ConnectionDecoration__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5173:1: ( rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__4 )? )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5174:2: rule__ConnectionDecoration__UnorderedGroup_3__Impl ( rule__ConnectionDecoration__UnorderedGroup_3__4 )?
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__311593);
            rule__ConnectionDecoration__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5175:2: ( rule__ConnectionDecoration__UnorderedGroup_3__4 )?
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
                    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5175:2: rule__ConnectionDecoration__UnorderedGroup_3__4
                    {
                    pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__4_in_rule__ConnectionDecoration__UnorderedGroup_3__311596);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5182:1: rule__ConnectionDecoration__UnorderedGroup_3__4 : rule__ConnectionDecoration__UnorderedGroup_3__Impl ;
    public final void rule__ConnectionDecoration__UnorderedGroup_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5186:1: ( rule__ConnectionDecoration__UnorderedGroup_3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5187:2: rule__ConnectionDecoration__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__411621);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5204:1: rule__DecorationModel__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DecorationModel__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5208:1: ( ( RULE_STRING ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5209:1: ( RULE_STRING )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5209:1: ( RULE_STRING )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5210:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationModelAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DecorationModel__ImportURIAssignment_111659); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5219:1: rule__DecorationModel__NamespaceAssignment_2 : ( ruleNamespace ) ;
    public final void rule__DecorationModel__NamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5223:1: ( ( ruleNamespace ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5224:1: ( ruleNamespace )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5224:1: ( ruleNamespace )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5225:1: ruleNamespace
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationModelAccess().getNamespaceNamespaceParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleNamespace_in_rule__DecorationModel__NamespaceAssignment_211690);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5234:1: rule__DecorationModel__DecorationDescriptionsAssignment_3 : ( ruleDecorationDescription ) ;
    public final void rule__DecorationModel__DecorationDescriptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5238:1: ( ( ruleDecorationDescription ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5239:1: ( ruleDecorationDescription )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5239:1: ( ruleDecorationDescription )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5240:1: ruleDecorationDescription
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationModelAccess().getDecorationDescriptionsDecorationDescriptionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleDecorationDescription_in_rule__DecorationModel__DecorationDescriptionsAssignment_311721);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5249:1: rule__Namespace__ProfileAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Namespace__ProfileAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5253:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5254:1: ( ( ruleQualifiedName ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5254:1: ( ( ruleQualifiedName ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5255:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceAccess().getProfileProfileCrossReference_1_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5256:1: ( ruleQualifiedName )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5257:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamespaceAccess().getProfileProfileQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Namespace__ProfileAssignment_111756);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5268:1: rule__DecorationDescription__StereotypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DecorationDescription__StereotypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5272:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5273:1: ( ( ruleQualifiedName ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5273:1: ( ( ruleQualifiedName ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5274:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getStereotypeStereotypeCrossReference_1_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5275:1: ( ruleQualifiedName )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5276:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getStereotypeStereotypeQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DecorationDescription__StereotypeAssignment_111795);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5287:1: rule__DecorationDescription__DecorationsAssignment_3_0 : ( ruleAbstractDecoration ) ;
    public final void rule__DecorationDescription__DecorationsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5291:1: ( ( ruleAbstractDecoration ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5292:1: ( ruleAbstractDecoration )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5292:1: ( ruleAbstractDecoration )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5293:1: ruleAbstractDecoration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getDecorationsAbstractDecorationParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleAbstractDecoration_in_rule__DecorationDescription__DecorationsAssignment_3_011830);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5302:1: rule__DecorationDescription__ActivationAssignment_3_1 : ( ruleActivation ) ;
    public final void rule__DecorationDescription__ActivationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5306:1: ( ( ruleActivation ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5307:1: ( ruleActivation )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5307:1: ( ruleActivation )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5308:1: ruleActivation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecorationDescriptionAccess().getActivationActivationParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleActivation_in_rule__DecorationDescription__ActivationAssignment_3_111861);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5317:1: rule__ImageDecoration__Location_uriAssignment_3_0_2 : ( RULE_STRING ) ;
    public final void rule__ImageDecoration__Location_uriAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5321:1: ( ( RULE_STRING ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5322:1: ( RULE_STRING )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5322:1: ( RULE_STRING )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5323:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getLocation_uriSTRINGTerminalRuleCall_3_0_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ImageDecoration__Location_uriAssignment_3_0_211892); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5332:1: rule__ImageDecoration__DirectionAssignment_3_1 : ( ruleDirection ) ;
    public final void rule__ImageDecoration__DirectionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5336:1: ( ( ruleDirection ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5337:1: ( ruleDirection )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5337:1: ( ruleDirection )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5338:1: ruleDirection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getDirectionDirectionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleDirection_in_rule__ImageDecoration__DirectionAssignment_3_111923);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5347:1: rule__ImageDecoration__MarginAssignment_3_2 : ( ruleMargin ) ;
    public final void rule__ImageDecoration__MarginAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5351:1: ( ( ruleMargin ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5352:1: ( ruleMargin )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5352:1: ( ruleMargin )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5353:1: ruleMargin
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getMarginMarginParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleMargin_in_rule__ImageDecoration__MarginAssignment_3_211954);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5362:1: rule__ImageDecoration__TooltipAssignment_3_3_2 : ( ruleText ) ;
    public final void rule__ImageDecoration__TooltipAssignment_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5366:1: ( ( ruleText ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5367:1: ( ruleText )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5367:1: ( ruleText )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5368:1: ruleText
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getTooltipTextParserRuleCall_3_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleText_in_rule__ImageDecoration__TooltipAssignment_3_3_211985);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5377:1: rule__ImageDecoration__ActivationAssignment_3_4 : ( ruleActivation ) ;
    public final void rule__ImageDecoration__ActivationAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5381:1: ( ( ruleActivation ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5382:1: ( ruleActivation )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5382:1: ( ruleActivation )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5383:1: ruleActivation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageDecorationAccess().getActivationActivationParserRuleCall_3_4_0()); 
            }
            pushFollow(FOLLOW_ruleActivation_in_rule__ImageDecoration__ActivationAssignment_3_412016);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5392:1: rule__BorderDecoration__SizeAssignment_3_0 : ( ruleSize ) ;
    public final void rule__BorderDecoration__SizeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5396:1: ( ( ruleSize ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5397:1: ( ruleSize )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5397:1: ( ruleSize )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5398:1: ruleSize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getSizeSizeParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleSize_in_rule__BorderDecoration__SizeAssignment_3_012047);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5407:1: rule__BorderDecoration__ColorAssignment_3_1_2 : ( ruleColor ) ;
    public final void rule__BorderDecoration__ColorAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5411:1: ( ( ruleColor ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5412:1: ( ruleColor )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5412:1: ( ruleColor )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5413:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getColorColorParserRuleCall_3_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__BorderDecoration__ColorAssignment_3_1_212078);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5422:1: rule__BorderDecoration__StyleAssignment_3_2 : ( ruleStyle ) ;
    public final void rule__BorderDecoration__StyleAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5426:1: ( ( ruleStyle ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5427:1: ( ruleStyle )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5427:1: ( ruleStyle )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5428:1: ruleStyle
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getStyleStyleParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleStyle_in_rule__BorderDecoration__StyleAssignment_3_212109);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5437:1: rule__BorderDecoration__ActivationAssignment_3_3 : ( ruleActivation ) ;
    public final void rule__BorderDecoration__ActivationAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5441:1: ( ( ruleActivation ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5442:1: ( ruleActivation )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5442:1: ( ruleActivation )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5443:1: ruleActivation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBorderDecorationAccess().getActivationActivationParserRuleCall_3_3_0()); 
            }
            pushFollow(FOLLOW_ruleActivation_in_rule__BorderDecoration__ActivationAssignment_3_312140);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5452:1: rule__ColorDecoration__BackgroundAssignment_3_0_2 : ( ruleColor ) ;
    public final void rule__ColorDecoration__BackgroundAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5456:1: ( ( ruleColor ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5457:1: ( ruleColor )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5457:1: ( ruleColor )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5458:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getBackgroundColorParserRuleCall_3_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__ColorDecoration__BackgroundAssignment_3_0_212171);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5467:1: rule__ColorDecoration__ForegroundAssignment_3_1_2 : ( ruleColor ) ;
    public final void rule__ColorDecoration__ForegroundAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5471:1: ( ( ruleColor ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5472:1: ( ruleColor )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5472:1: ( ruleColor )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5473:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getForegroundColorParserRuleCall_3_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__ColorDecoration__ForegroundAssignment_3_1_212202);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5482:1: rule__ColorDecoration__ActivationAssignment_3_2 : ( ruleActivation ) ;
    public final void rule__ColorDecoration__ActivationAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5486:1: ( ( ruleActivation ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5487:1: ( ruleActivation )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5487:1: ( ruleActivation )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5488:1: ruleActivation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorDecorationAccess().getActivationActivationParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleActivation_in_rule__ColorDecoration__ActivationAssignment_3_212233);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5497:1: rule__ConnectionDecoration__SizeAssignment_3_0 : ( ruleSize ) ;
    public final void rule__ConnectionDecoration__SizeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5501:1: ( ( ruleSize ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5502:1: ( ruleSize )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5502:1: ( ruleSize )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5503:1: ruleSize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getSizeSizeParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleSize_in_rule__ConnectionDecoration__SizeAssignment_3_012264);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5512:1: rule__ConnectionDecoration__StyleAssignment_3_1 : ( ruleStyle ) ;
    public final void rule__ConnectionDecoration__StyleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5516:1: ( ( ruleStyle ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5517:1: ( ruleStyle )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5517:1: ( ruleStyle )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5518:1: ruleStyle
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getStyleStyleParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleStyle_in_rule__ConnectionDecoration__StyleAssignment_3_112295);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5527:1: rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2 : ( ruleColor ) ;
    public final void rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5531:1: ( ( ruleColor ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5532:1: ( ruleColor )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5532:1: ( ruleColor )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5533:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getForegroundColorColorParserRuleCall_3_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__ConnectionDecoration__ForegroundColorAssignment_3_2_212326);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5542:1: rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2 : ( ruleColor ) ;
    public final void rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5546:1: ( ( ruleColor ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5547:1: ( ruleColor )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5547:1: ( ruleColor )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5548:1: ruleColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getBackgroundColorColorParserRuleCall_3_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleColor_in_rule__ConnectionDecoration__BackgroundColorAssignment_3_3_212357);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5557:1: rule__ConnectionDecoration__ActivationAssignment_3_4 : ( ruleActivation ) ;
    public final void rule__ConnectionDecoration__ActivationAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5561:1: ( ( ruleActivation ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5562:1: ( ruleActivation )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5562:1: ( ruleActivation )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5563:1: ruleActivation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionDecorationAccess().getActivationActivationParserRuleCall_3_4_0()); 
            }
            pushFollow(FOLLOW_ruleActivation_in_rule__ConnectionDecoration__ActivationAssignment_3_412388);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5572:1: rule__SimpleText__TextAssignment_0 : ( RULE_STRING ) ;
    public final void rule__SimpleText__TextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5576:1: ( ( RULE_STRING ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5577:1: ( RULE_STRING )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5577:1: ( RULE_STRING )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5578:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleTextAccess().getTextSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleText__TextAssignment_012419); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5587:1: rule__SimpleText__AttributeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SimpleText__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5591:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5592:1: ( ( ruleQualifiedName ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5592:1: ( ( ruleQualifiedName ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5593:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleTextAccess().getAttributeEAttributeCrossReference_1_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5594:1: ( ruleQualifiedName )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5595:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleTextAccess().getAttributeEAttributeQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__SimpleText__AttributeAssignment_112454);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5606:1: rule__ComplexText__LeftAssignment_0 : ( ruleSimpleText ) ;
    public final void rule__ComplexText__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5610:1: ( ( ruleSimpleText ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5611:1: ( ruleSimpleText )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5611:1: ( ruleSimpleText )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5612:1: ruleSimpleText
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTextAccess().getLeftSimpleTextParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSimpleText_in_rule__ComplexText__LeftAssignment_012489);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5621:1: rule__ComplexText__RightAssignment_2 : ( ruleText ) ;
    public final void rule__ComplexText__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5625:1: ( ( ruleText ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5626:1: ( ruleText )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5626:1: ( ruleText )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5627:1: ruleText
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTextAccess().getRightTextParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleText_in_rule__ComplexText__RightAssignment_212520);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5636:1: rule__Style__ValueAssignment_2 : ( ruleLineStyle ) ;
    public final void rule__Style__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5640:1: ( ( ruleLineStyle ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5641:1: ( ruleLineStyle )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5641:1: ( ruleLineStyle )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5642:1: ruleLineStyle
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStyleAccess().getValueLineStyleEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleLineStyle_in_rule__Style__ValueAssignment_212551);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5651:1: rule__Size__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__Size__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5655:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5656:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5656:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5657:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSizeAccess().getValueINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Size__ValueAssignment_212582); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5666:1: rule__Direction__ValueAssignment_2 : ( ruleDirections ) ;
    public final void rule__Direction__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5670:1: ( ( ruleDirections ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5671:1: ( ruleDirections )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5671:1: ( ruleDirections )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5672:1: ruleDirections
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectionAccess().getValueDirectionsEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleDirections_in_rule__Direction__ValueAssignment_212613);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5681:1: rule__Margin__ValueAssignment_2 : ( ruleSignedInteger ) ;
    public final void rule__Margin__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5685:1: ( ( ruleSignedInteger ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5686:1: ( ruleSignedInteger )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5686:1: ( ruleSignedInteger )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5687:1: ruleSignedInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMarginAccess().getValueSignedIntegerParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleSignedInteger_in_rule__Margin__ValueAssignment_212644);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5696:1: rule__Color__ValueAssignment_0_1 : ( ruleColorConstant ) ;
    public final void rule__Color__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5700:1: ( ( ruleColorConstant ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5701:1: ( ruleColorConstant )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5701:1: ( ruleColorConstant )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5702:1: ruleColorConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getValueColorConstantParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleColorConstant_in_rule__Color__ValueAssignment_0_112675);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5711:1: rule__Color__ConcreteAssignment_1 : ( ruleConcreteColor ) ;
    public final void rule__Color__ConcreteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5715:1: ( ( ruleConcreteColor ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5716:1: ( ruleConcreteColor )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5716:1: ( ruleConcreteColor )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5717:1: ruleConcreteColor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorAccess().getConcreteConcreteColorParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleConcreteColor_in_rule__Color__ConcreteAssignment_112706);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5726:1: rule__ConcreteColor__RedAssignment_2 : ( RULE_INT ) ;
    public final void rule__ConcreteColor__RedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5730:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5731:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5731:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5732:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getRedINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ConcreteColor__RedAssignment_212737); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5741:1: rule__ConcreteColor__GreenAssignment_4 : ( RULE_INT ) ;
    public final void rule__ConcreteColor__GreenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5745:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5746:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5746:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5747:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getGreenINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ConcreteColor__GreenAssignment_412768); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5756:1: rule__ConcreteColor__BlueAssignment_6 : ( RULE_INT ) ;
    public final void rule__ConcreteColor__BlueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5760:1: ( ( RULE_INT ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5761:1: ( RULE_INT )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5761:1: ( RULE_INT )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5762:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteColorAccess().getBlueINTTerminalRuleCall_6_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ConcreteColor__BlueAssignment_612799); if (state.failed) return ;
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5771:1: rule__ColorConstant__ValueAssignment : ( ruleColors ) ;
    public final void rule__ColorConstant__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5775:1: ( ( ruleColors ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5776:1: ( ruleColors )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5776:1: ( ruleColors )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5777:1: ruleColors
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColorConstantAccess().getValueColorsEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleColors_in_rule__ColorConstant__ValueAssignment12830);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5786:1: rule__Activation__ConditionAssignment_1 : ( ruleAbstractCondition ) ;
    public final void rule__Activation__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5790:1: ( ( ruleAbstractCondition ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5791:1: ( ruleAbstractCondition )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5791:1: ( ruleAbstractCondition )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5792:1: ruleAbstractCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivationAccess().getConditionAbstractConditionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAbstractCondition_in_rule__Activation__ConditionAssignment_112861);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5801:1: rule__Condition__AttributeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Condition__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5805:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5806:1: ( ( ruleQualifiedName ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5806:1: ( ( ruleQualifiedName ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5807:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getAttributeEAttributeCrossReference_0_0()); 
            }
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5808:1: ( ruleQualifiedName )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5809:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getAttributeEAttributeQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Condition__AttributeAssignment_012896);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5820:1: rule__Condition__OperatorAssignment_1 : ( ruleComparisonOperator ) ;
    public final void rule__Condition__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5824:1: ( ( ruleComparisonOperator ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5825:1: ( ruleComparisonOperator )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5825:1: ( ruleComparisonOperator )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5826:1: ruleComparisonOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getOperatorComparisonOperatorEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleComparisonOperator_in_rule__Condition__OperatorAssignment_112931);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5835:1: rule__Condition__ValueAssignment_2 : ( ruleType ) ;
    public final void rule__Condition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5839:1: ( ( ruleType ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5840:1: ( ruleType )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5840:1: ( ruleType )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5841:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getValueTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Condition__ValueAssignment_212962);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5850:1: rule__CompositeCondition__OperatorAssignment_0 : ( ruleLogicalOperator ) ;
    public final void rule__CompositeCondition__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5854:1: ( ( ruleLogicalOperator ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5855:1: ( ruleLogicalOperator )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5855:1: ( ruleLogicalOperator )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5856:1: ruleLogicalOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getOperatorLogicalOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleLogicalOperator_in_rule__CompositeCondition__OperatorAssignment_012993);
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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5865:1: rule__CompositeCondition__ConditionsAssignment_2 : ( ruleAbstractCondition ) ;
    public final void rule__CompositeCondition__ConditionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5869:1: ( ( ruleAbstractCondition ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5870:1: ( ruleAbstractCondition )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5870:1: ( ruleAbstractCondition )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:5871:1: ruleAbstractCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getConditionsAbstractConditionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAbstractCondition_in_rule__CompositeCondition__ConditionsAssignment_213024);
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
        // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4470:8: ( rule__DecorationDescription__DecorationsAssignment_3_0 )
        // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:4470:9: rule__DecorationDescription__DecorationsAssignment_3_0
        {
        pushFollow(FOLLOW_rule__DecorationDescription__DecorationsAssignment_3_0_in_synpred1_InternalEMFProfileDecorationLanguage9176);
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
        "\1\4\2\65\2\uffff\1\6\1\65";
    static final String DFA2_maxS =
        "\1\6\1\112\1\114\2\uffff\1\6\1\114";
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
    public static final BitSet FOLLOW_RULE_ID_in_rule__Type__Alternatives2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ComparisonOperator__Alternatives2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ComparisonOperator__Alternatives2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ComparisonOperator__Alternatives2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ComparisonOperator__Alternatives2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ComparisonOperator__Alternatives2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ComparisonOperator__Alternatives2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__LogicalOperator__Alternatives2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__LogicalOperator__Alternatives2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__LineStyle__Alternatives2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LineStyle__Alternatives2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LineStyle__Alternatives2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LineStyle__Alternatives2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__LineStyle__Alternatives2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Colors__Alternatives2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Colors__Alternatives2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Colors__Alternatives2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Colors__Alternatives2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Colors__Alternatives2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Colors__Alternatives2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Colors__Alternatives2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Colors__Alternatives2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Colors__Alternatives2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Colors__Alternatives2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Colors__Alternatives2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Colors__Alternatives2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Colors__Alternatives2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Colors__Alternatives2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Colors__Alternatives2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Directions__Alternatives2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Directions__Alternatives2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Directions__Alternatives2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Directions__Alternatives2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Directions__Alternatives2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Directions__Alternatives2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Directions__Alternatives2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Directions__Alternatives2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Directions__Alternatives3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__0__Impl_in_rule__DecorationModel__Group__03045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__1_in_rule__DecorationModel__Group__03048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__DecorationModel__Group__0__Impl3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__1__Impl_in_rule__DecorationModel__Group__13107 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__2_in_rule__DecorationModel__Group__13110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__ImportURIAssignment_1_in_rule__DecorationModel__Group__1__Impl3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__2__Impl_in_rule__DecorationModel__Group__23167 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__3_in_rule__DecorationModel__Group__23170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__NamespaceAssignment_2_in_rule__DecorationModel__Group__2__Impl3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__Group__3__Impl_in_rule__DecorationModel__Group__33228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationModel__DecorationDescriptionsAssignment_3_in_rule__DecorationModel__Group__3__Impl3255 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__03294 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__03297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Namespace__Group__0__Impl3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__13356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__ProfileAssignment_1_in_rule__Namespace__Group__1__Impl3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__0__Impl_in_rule__DecorationDescription__Group__03417 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__1_in_rule__DecorationDescription__Group__03420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__DecorationDescription__Group__0__Impl3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__1__Impl_in_rule__DecorationDescription__Group__13479 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__2_in_rule__DecorationDescription__Group__13482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__StereotypeAssignment_1_in_rule__DecorationDescription__Group__1__Impl3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__2__Impl_in_rule__DecorationDescription__Group__23539 = new BitSet(new long[]{0x4C40000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__3_in_rule__DecorationDescription__Group__23542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__DecorationDescription__Group__2__Impl3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__3__Impl_in_rule__DecorationDescription__Group__33601 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__4_in_rule__DecorationDescription__Group__33604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__UnorderedGroup_3_in_rule__DecorationDescription__Group__3__Impl3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__Group__4__Impl_in_rule__DecorationDescription__Group__43661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__DecorationDescription__Group__4__Impl3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__0__Impl_in_rule__ImageDecoration__Group__03730 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__1_in_rule__ImageDecoration__Group__03733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__1__Impl_in_rule__ImageDecoration__Group__13791 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__2_in_rule__ImageDecoration__Group__13794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__ImageDecoration__Group__1__Impl3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__2__Impl_in_rule__ImageDecoration__Group__23853 = new BitSet(new long[]{0x4EC0000000000000L,0x0000000000000430L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__3_in_rule__ImageDecoration__Group__23856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ImageDecoration__Group__2__Impl3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__3__Impl_in_rule__ImageDecoration__Group__33915 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__4_in_rule__ImageDecoration__Group__33918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3_in_rule__ImageDecoration__Group__3__Impl3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group__4__Impl_in_rule__ImageDecoration__Group__43975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__ImageDecoration__Group__4__Impl4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_0__0__Impl_in_rule__ImageDecoration__Group_3_0__04044 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_0__1_in_rule__ImageDecoration__Group_3_0__04047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__ImageDecoration__Group_3_0__0__Impl4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_0__1__Impl_in_rule__ImageDecoration__Group_3_0__14106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_0__2_in_rule__ImageDecoration__Group_3_0__14109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__ImageDecoration__Group_3_0__1__Impl4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_0__2__Impl_in_rule__ImageDecoration__Group_3_0__24168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Location_uriAssignment_3_0_2_in_rule__ImageDecoration__Group_3_0__2__Impl4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_3__0__Impl_in_rule__ImageDecoration__Group_3_3__04231 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_3__1_in_rule__ImageDecoration__Group_3_3__04234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__ImageDecoration__Group_3_3__0__Impl4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_3__1__Impl_in_rule__ImageDecoration__Group_3_3__14293 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_3__2_in_rule__ImageDecoration__Group_3_3__14296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__ImageDecoration__Group_3_3__1__Impl4324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_3__2__Impl_in_rule__ImageDecoration__Group_3_3__24355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__TooltipAssignment_3_3_2_in_rule__ImageDecoration__Group_3_3__2__Impl4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__0__Impl_in_rule__BorderDecoration__Group__04418 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__1_in_rule__BorderDecoration__Group__04421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__1__Impl_in_rule__BorderDecoration__Group__14479 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__2_in_rule__BorderDecoration__Group__14482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__BorderDecoration__Group__1__Impl4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__2__Impl_in_rule__BorderDecoration__Group__24541 = new BitSet(new long[]{0x4C40000000000000L,0x000000000000040CL});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__3_in_rule__BorderDecoration__Group__24544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__BorderDecoration__Group__2__Impl4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__3__Impl_in_rule__BorderDecoration__Group__34603 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__4_in_rule__BorderDecoration__Group__34606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3_in_rule__BorderDecoration__Group__3__Impl4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group__4__Impl_in_rule__BorderDecoration__Group__44663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__BorderDecoration__Group__4__Impl4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group_3_1__0__Impl_in_rule__BorderDecoration__Group_3_1__04732 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group_3_1__1_in_rule__BorderDecoration__Group_3_1__04735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__BorderDecoration__Group_3_1__0__Impl4763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group_3_1__1__Impl_in_rule__BorderDecoration__Group_3_1__14794 = new BitSet(new long[]{0x000000FFFE000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group_3_1__2_in_rule__BorderDecoration__Group_3_1__14797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__BorderDecoration__Group_3_1__1__Impl4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group_3_1__2__Impl_in_rule__BorderDecoration__Group_3_1__24856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__ColorAssignment_3_1_2_in_rule__BorderDecoration__Group_3_1__2__Impl4883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__0__Impl_in_rule__ColorDecoration__Group__04919 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__1_in_rule__ColorDecoration__Group__04922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__1__Impl_in_rule__ColorDecoration__Group__14980 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__2_in_rule__ColorDecoration__Group__14983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__ColorDecoration__Group__1__Impl5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__2__Impl_in_rule__ColorDecoration__Group__25042 = new BitSet(new long[]{0x7C40000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__3_in_rule__ColorDecoration__Group__25045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ColorDecoration__Group__2__Impl5073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__3__Impl_in_rule__ColorDecoration__Group__35104 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__4_in_rule__ColorDecoration__Group__35107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__UnorderedGroup_3_in_rule__ColorDecoration__Group__3__Impl5134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group__4__Impl_in_rule__ColorDecoration__Group__45164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__ColorDecoration__Group__4__Impl5192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_0__0__Impl_in_rule__ColorDecoration__Group_3_0__05233 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_0__1_in_rule__ColorDecoration__Group_3_0__05236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__ColorDecoration__Group_3_0__0__Impl5264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_0__1__Impl_in_rule__ColorDecoration__Group_3_0__15295 = new BitSet(new long[]{0x000000FFFE000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_0__2_in_rule__ColorDecoration__Group_3_0__15298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__ColorDecoration__Group_3_0__1__Impl5326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_0__2__Impl_in_rule__ColorDecoration__Group_3_0__25357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__BackgroundAssignment_3_0_2_in_rule__ColorDecoration__Group_3_0__2__Impl5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_1__0__Impl_in_rule__ColorDecoration__Group_3_1__05420 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_1__1_in_rule__ColorDecoration__Group_3_1__05423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__ColorDecoration__Group_3_1__0__Impl5451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_1__1__Impl_in_rule__ColorDecoration__Group_3_1__15482 = new BitSet(new long[]{0x000000FFFE000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_1__2_in_rule__ColorDecoration__Group_3_1__15485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__ColorDecoration__Group_3_1__1__Impl5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_1__2__Impl_in_rule__ColorDecoration__Group_3_1__25544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__ForegroundAssignment_3_1_2_in_rule__ColorDecoration__Group_3_1__2__Impl5571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__0__Impl_in_rule__ConnectionDecoration__Group__05607 = new BitSet(new long[]{0x4C40000000000000L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__1_in_rule__ConnectionDecoration__Group__05610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__1__Impl_in_rule__ConnectionDecoration__Group__15668 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__2_in_rule__ConnectionDecoration__Group__15671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__ConnectionDecoration__Group__1__Impl5699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__2__Impl_in_rule__ConnectionDecoration__Group__25730 = new BitSet(new long[]{0xCC40000000000000L,0x000000000000040DL});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__3_in_rule__ConnectionDecoration__Group__25733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ConnectionDecoration__Group__2__Impl5761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__3__Impl_in_rule__ConnectionDecoration__Group__35792 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__4_in_rule__ConnectionDecoration__Group__35795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3_in_rule__ConnectionDecoration__Group__3__Impl5822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group__4__Impl_in_rule__ConnectionDecoration__Group__45852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__ConnectionDecoration__Group__4__Impl5880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_2__0__Impl_in_rule__ConnectionDecoration__Group_3_2__05921 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_2__1_in_rule__ConnectionDecoration__Group_3_2__05924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__ConnectionDecoration__Group_3_2__0__Impl5952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_2__1__Impl_in_rule__ConnectionDecoration__Group_3_2__15983 = new BitSet(new long[]{0x000000FFFE000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_2__2_in_rule__ConnectionDecoration__Group_3_2__15986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__ConnectionDecoration__Group_3_2__1__Impl6014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_2__2__Impl_in_rule__ConnectionDecoration__Group_3_2__26045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__ForegroundColorAssignment_3_2_2_in_rule__ConnectionDecoration__Group_3_2__2__Impl6072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_3__0__Impl_in_rule__ConnectionDecoration__Group_3_3__06108 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_3__1_in_rule__ConnectionDecoration__Group_3_3__06111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__ConnectionDecoration__Group_3_3__0__Impl6139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_3__1__Impl_in_rule__ConnectionDecoration__Group_3_3__16170 = new BitSet(new long[]{0x000000FFFE000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_3__2_in_rule__ConnectionDecoration__Group_3_3__16173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__ConnectionDecoration__Group_3_3__1__Impl6201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_3__2__Impl_in_rule__ConnectionDecoration__Group_3_3__26232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__BackgroundColorAssignment_3_3_2_in_rule__ConnectionDecoration__Group_3_3__2__Impl6259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexText__Group__0__Impl_in_rule__ComplexText__Group__06295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexText__Group__1_in_rule__ComplexText__Group__06298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexText__LeftAssignment_0_in_rule__ComplexText__Group__0__Impl6325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexText__Group__1__Impl_in_rule__ComplexText__Group__16355 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__ComplexText__Group__2_in_rule__ComplexText__Group__16358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__ComplexText__Group__1__Impl6386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexText__Group__2__Impl_in_rule__ComplexText__Group__26417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexText__RightAssignment_2_in_rule__ComplexText__Group__2__Impl6444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__Group__0__Impl_in_rule__Style__Group__06480 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__Style__Group__1_in_rule__Style__Group__06483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__Style__Group__0__Impl6511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__Group__1__Impl_in_rule__Style__Group__16542 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_rule__Style__Group__2_in_rule__Style__Group__16545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Style__Group__1__Impl6573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__Group__2__Impl_in_rule__Style__Group__26604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__ValueAssignment_2_in_rule__Style__Group__2__Impl6631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__0__Impl_in_rule__Size__Group__06667 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__Size__Group__1_in_rule__Size__Group__06670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__Size__Group__0__Impl6698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__1__Impl_in_rule__Size__Group__16729 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Size__Group__2_in_rule__Size__Group__16732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Size__Group__1__Impl6760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__Group__2__Impl_in_rule__Size__Group__26791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Size__ValueAssignment_2_in_rule__Size__Group__2__Impl6818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Direction__Group__0__Impl_in_rule__Direction__Group__06854 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__Direction__Group__1_in_rule__Direction__Group__06857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__Direction__Group__0__Impl6885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Direction__Group__1__Impl_in_rule__Direction__Group__16916 = new BitSet(new long[]{0x0001FF0000000000L});
    public static final BitSet FOLLOW_rule__Direction__Group__2_in_rule__Direction__Group__16919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Direction__Group__1__Impl6947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Direction__Group__2__Impl_in_rule__Direction__Group__26978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Direction__ValueAssignment_2_in_rule__Direction__Group__2__Impl7005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Margin__Group__0__Impl_in_rule__Margin__Group__07041 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__Margin__Group__1_in_rule__Margin__Group__07044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__Margin__Group__0__Impl7072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Margin__Group__1__Impl_in_rule__Margin__Group__17103 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Margin__Group__2_in_rule__Margin__Group__17106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Margin__Group__1__Impl7134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Margin__Group__2__Impl_in_rule__Margin__Group__27165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Margin__ValueAssignment_2_in_rule__Margin__Group__2__Impl7192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group_0__0__Impl_in_rule__Color__Group_0__07228 = new BitSet(new long[]{0x000000FFFE000000L});
    public static final BitSet FOLLOW_rule__Color__Group_0__1_in_rule__Color__Group_0__07231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group_0__1__Impl_in_rule__Color__Group_0__17289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__ValueAssignment_0_1_in_rule__Color__Group_0__1__Impl7316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__0__Impl_in_rule__ConcreteColor__Group__07350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__1_in_rule__ConcreteColor__Group__07353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__ConcreteColor__Group__0__Impl7381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__1__Impl_in_rule__ConcreteColor__Group__17412 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__2_in_rule__ConcreteColor__Group__17415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__ConcreteColor__Group__1__Impl7443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__2__Impl_in_rule__ConcreteColor__Group__27474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__3_in_rule__ConcreteColor__Group__27477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteColor__RedAssignment_2_in_rule__ConcreteColor__Group__2__Impl7504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__3__Impl_in_rule__ConcreteColor__Group__37534 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__4_in_rule__ConcreteColor__Group__37537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__ConcreteColor__Group__3__Impl7565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__4__Impl_in_rule__ConcreteColor__Group__47596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__5_in_rule__ConcreteColor__Group__47599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteColor__GreenAssignment_4_in_rule__ConcreteColor__Group__4__Impl7626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__5__Impl_in_rule__ConcreteColor__Group__57656 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__6_in_rule__ConcreteColor__Group__57659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__ConcreteColor__Group__5__Impl7687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__6__Impl_in_rule__ConcreteColor__Group__67718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__7_in_rule__ConcreteColor__Group__67721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteColor__BlueAssignment_6_in_rule__ConcreteColor__Group__6__Impl7748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteColor__Group__7__Impl_in_rule__ConcreteColor__Group__77778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__ConcreteColor__Group__7__Impl7806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activation__Group__0__Impl_in_rule__Activation__Group__07853 = new BitSet(new long[]{0x00000000000C0040L});
    public static final BitSet FOLLOW_rule__Activation__Group__1_in_rule__Activation__Group__07856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__Activation__Group__0__Impl7884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activation__Group__1__Impl_in_rule__Activation__Group__17915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activation__ConditionAssignment_1_in_rule__Activation__Group__1__Impl7942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__07976 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__07979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__AttributeAssignment_0_in_rule__Condition__Group__0__Impl8006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__18036 = new BitSet(new long[]{0x00000000000000F0L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__18039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__OperatorAssignment_1_in_rule__Condition__Group__1__Impl8066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__28096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__ValueAssignment_2_in_rule__Condition__Group__2__Impl8123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__0__Impl_in_rule__CompositeCondition__Group__08159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__1_in_rule__CompositeCondition__Group__08162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeCondition__OperatorAssignment_0_in_rule__CompositeCondition__Group__0__Impl8189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__1__Impl_in_rule__CompositeCondition__Group__18219 = new BitSet(new long[]{0x00000000000C0040L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__2_in_rule__CompositeCondition__Group__18222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__CompositeCondition__Group__1__Impl8250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__2__Impl_in_rule__CompositeCondition__Group__28281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__3_in_rule__CompositeCondition__Group__28284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeCondition__ConditionsAssignment_2_in_rule__CompositeCondition__Group__2__Impl8313 = new BitSet(new long[]{0x00000000000C0042L});
    public static final BitSet FOLLOW_rule__CompositeCondition__ConditionsAssignment_2_in_rule__CompositeCondition__Group__2__Impl8325 = new BitSet(new long[]{0x00000000000C0042L});
    public static final BitSet FOLLOW_rule__CompositeCondition__Group__3__Impl_in_rule__CompositeCondition__Group__38358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__CompositeCondition__Group__3__Impl8386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedDouble__Group__0__Impl_in_rule__SignedDouble__Group__08425 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__SignedDouble__Group__1_in_rule__SignedDouble__Group__08428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__SignedDouble__Group__0__Impl8457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedDouble__Group__1__Impl_in_rule__SignedDouble__Group__18490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SignedDouble__Group__2_in_rule__SignedDouble__Group__18493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SignedDouble__Group__1__Impl8520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedDouble__Group__2__Impl_in_rule__SignedDouble__Group__28549 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__SignedDouble__Group__3_in_rule__SignedDouble__Group__28552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__SignedDouble__Group__2__Impl8580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedDouble__Group__3__Impl_in_rule__SignedDouble__Group__38611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SignedDouble__Group__3__Impl8638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedInteger__Group__0__Impl_in_rule__SignedInteger__Group__08675 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__SignedInteger__Group__1_in_rule__SignedInteger__Group__08678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__SignedInteger__Group__0__Impl8707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignedInteger__Group__1__Impl_in_rule__SignedInteger__Group__18740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SignedInteger__Group__1__Impl8767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8887 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08922 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__QualifiedName__Group_1__0__Impl8953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl9011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__UnorderedGroup_3__0_in_rule__DecorationDescription__UnorderedGroup_39045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__DecorationsAssignment_3_0_in_rule__DecorationDescription__UnorderedGroup_3__Impl9135 = new BitSet(new long[]{0x4C40000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__DecorationsAssignment_3_0_in_rule__DecorationDescription__UnorderedGroup_3__Impl9179 = new BitSet(new long[]{0x4C40000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__ActivationAssignment_3_1_in_rule__DecorationDescription__UnorderedGroup_3__Impl9277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__UnorderedGroup_3__Impl_in_rule__DecorationDescription__UnorderedGroup_3__09336 = new BitSet(new long[]{0x4C40000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__DecorationDescription__UnorderedGroup_3__1_in_rule__DecorationDescription__UnorderedGroup_3__09339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__UnorderedGroup_3__Impl_in_rule__DecorationDescription__UnorderedGroup_3__19364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__0_in_rule__ImageDecoration__UnorderedGroup_39392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_0__0_in_rule__ImageDecoration__UnorderedGroup_3__Impl9481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__DirectionAssignment_3_1_in_rule__ImageDecoration__UnorderedGroup_3__Impl9572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__MarginAssignment_3_2_in_rule__ImageDecoration__UnorderedGroup_3__Impl9663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__Group_3_3__0_in_rule__ImageDecoration__UnorderedGroup_3__Impl9754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__ActivationAssignment_3_4_in_rule__ImageDecoration__UnorderedGroup_3__Impl9845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__09904 = new BitSet(new long[]{0x4EC0000000000002L,0x0000000000000430L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__1_in_rule__ImageDecoration__UnorderedGroup_3__09907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__19932 = new BitSet(new long[]{0x4EC0000000000002L,0x0000000000000430L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__2_in_rule__ImageDecoration__UnorderedGroup_3__19935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__29960 = new BitSet(new long[]{0x4EC0000000000002L,0x0000000000000430L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__3_in_rule__ImageDecoration__UnorderedGroup_3__29963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__39988 = new BitSet(new long[]{0x4EC0000000000002L,0x0000000000000430L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__4_in_rule__ImageDecoration__UnorderedGroup_3__39991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageDecoration__UnorderedGroup_3__Impl_in_rule__ImageDecoration__UnorderedGroup_3__410016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__0_in_rule__BorderDecoration__UnorderedGroup_310050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__SizeAssignment_3_0_in_rule__BorderDecoration__UnorderedGroup_3__Impl10137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__Group_3_1__0_in_rule__BorderDecoration__UnorderedGroup_3__Impl10228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__StyleAssignment_3_2_in_rule__BorderDecoration__UnorderedGroup_3__Impl10319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__ActivationAssignment_3_3_in_rule__BorderDecoration__UnorderedGroup_3__Impl10410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__010469 = new BitSet(new long[]{0x4C40000000000002L,0x000000000000040CL});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__1_in_rule__BorderDecoration__UnorderedGroup_3__010472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__110497 = new BitSet(new long[]{0x4C40000000000002L,0x000000000000040CL});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__2_in_rule__BorderDecoration__UnorderedGroup_3__110500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__210525 = new BitSet(new long[]{0x4C40000000000002L,0x000000000000040CL});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__3_in_rule__BorderDecoration__UnorderedGroup_3__210528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BorderDecoration__UnorderedGroup_3__Impl_in_rule__BorderDecoration__UnorderedGroup_3__310553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__UnorderedGroup_3__0_in_rule__ColorDecoration__UnorderedGroup_310585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_0__0_in_rule__ColorDecoration__UnorderedGroup_3__Impl10672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__Group_3_1__0_in_rule__ColorDecoration__UnorderedGroup_3__Impl10763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__ActivationAssignment_3_2_in_rule__ColorDecoration__UnorderedGroup_3__Impl10854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__UnorderedGroup_3__Impl_in_rule__ColorDecoration__UnorderedGroup_3__010913 = new BitSet(new long[]{0x7C40000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__ColorDecoration__UnorderedGroup_3__1_in_rule__ColorDecoration__UnorderedGroup_3__010916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__UnorderedGroup_3__Impl_in_rule__ColorDecoration__UnorderedGroup_3__110941 = new BitSet(new long[]{0x7C40000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__ColorDecoration__UnorderedGroup_3__2_in_rule__ColorDecoration__UnorderedGroup_3__110944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorDecoration__UnorderedGroup_3__Impl_in_rule__ColorDecoration__UnorderedGroup_3__210969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__0_in_rule__ConnectionDecoration__UnorderedGroup_310999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__SizeAssignment_3_0_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__StyleAssignment_3_1_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_2__0_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__Group_3_3__0_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__ActivationAssignment_3_4_in_rule__ConnectionDecoration__UnorderedGroup_3__Impl11450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__011509 = new BitSet(new long[]{0xCC40000000000002L,0x000000000000040DL});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__1_in_rule__ConnectionDecoration__UnorderedGroup_3__011512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__111537 = new BitSet(new long[]{0xCC40000000000002L,0x000000000000040DL});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__2_in_rule__ConnectionDecoration__UnorderedGroup_3__111540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__211565 = new BitSet(new long[]{0xCC40000000000002L,0x000000000000040DL});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__3_in_rule__ConnectionDecoration__UnorderedGroup_3__211568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__311593 = new BitSet(new long[]{0xCC40000000000002L,0x000000000000040DL});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__4_in_rule__ConnectionDecoration__UnorderedGroup_3__311596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionDecoration__UnorderedGroup_3__Impl_in_rule__ConnectionDecoration__UnorderedGroup_3__411621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DecorationModel__ImportURIAssignment_111659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_rule__DecorationModel__NamespaceAssignment_211690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecorationDescription_in_rule__DecorationModel__DecorationDescriptionsAssignment_311721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Namespace__ProfileAssignment_111756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DecorationDescription__StereotypeAssignment_111795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDecoration_in_rule__DecorationDescription__DecorationsAssignment_3_011830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_rule__DecorationDescription__ActivationAssignment_3_111861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ImageDecoration__Location_uriAssignment_3_0_211892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirection_in_rule__ImageDecoration__DirectionAssignment_3_111923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMargin_in_rule__ImageDecoration__MarginAssignment_3_211954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ImageDecoration__TooltipAssignment_3_3_211985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_rule__ImageDecoration__ActivationAssignment_3_412016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_rule__BorderDecoration__SizeAssignment_3_012047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__BorderDecoration__ColorAssignment_3_1_212078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyle_in_rule__BorderDecoration__StyleAssignment_3_212109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_rule__BorderDecoration__ActivationAssignment_3_312140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__ColorDecoration__BackgroundAssignment_3_0_212171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__ColorDecoration__ForegroundAssignment_3_1_212202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_rule__ColorDecoration__ActivationAssignment_3_212233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSize_in_rule__ConnectionDecoration__SizeAssignment_3_012264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyle_in_rule__ConnectionDecoration__StyleAssignment_3_112295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__ConnectionDecoration__ForegroundColorAssignment_3_2_212326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__ConnectionDecoration__BackgroundColorAssignment_3_3_212357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivation_in_rule__ConnectionDecoration__ActivationAssignment_3_412388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleText__TextAssignment_012419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__SimpleText__AttributeAssignment_112454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleText_in_rule__ComplexText__LeftAssignment_012489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ComplexText__RightAssignment_212520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineStyle_in_rule__Style__ValueAssignment_212551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Size__ValueAssignment_212582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirections_in_rule__Direction__ValueAssignment_212613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInteger_in_rule__Margin__ValueAssignment_212644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorConstant_in_rule__Color__ValueAssignment_0_112675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteColor_in_rule__Color__ConcreteAssignment_112706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ConcreteColor__RedAssignment_212737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ConcreteColor__GreenAssignment_412768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ConcreteColor__BlueAssignment_612799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColors_in_rule__ColorConstant__ValueAssignment12830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractCondition_in_rule__Activation__ConditionAssignment_112861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Condition__AttributeAssignment_012896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_rule__Condition__OperatorAssignment_112931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Condition__ValueAssignment_212962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOperator_in_rule__CompositeCondition__OperatorAssignment_012993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractCondition_in_rule__CompositeCondition__ConditionsAssignment_213024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecorationDescription__DecorationsAssignment_3_0_in_synpred1_InternalEMFProfileDecorationLanguage9176 = new BitSet(new long[]{0x0000000000000002L});

}
