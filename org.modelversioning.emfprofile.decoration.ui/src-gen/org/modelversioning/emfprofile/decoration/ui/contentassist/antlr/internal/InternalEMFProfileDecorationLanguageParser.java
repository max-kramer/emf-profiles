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




    // $ANTLR start "entryRuleEMFProfileDecorationModel"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:60:1: entryRuleEMFProfileDecorationModel : ruleEMFProfileDecorationModel EOF ;
    public final void entryRuleEMFProfileDecorationModel() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:61:1: ( ruleEMFProfileDecorationModel EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:62:1: ruleEMFProfileDecorationModel EOF
            {
             before(grammarAccess.getEMFProfileDecorationModelRule()); 
            pushFollow(FOLLOW_ruleEMFProfileDecorationModel_in_entryRuleEMFProfileDecorationModel61);
            ruleEMFProfileDecorationModel();

            state._fsp--;

             after(grammarAccess.getEMFProfileDecorationModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMFProfileDecorationModel68); 

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
    // $ANTLR end "entryRuleEMFProfileDecorationModel"


    // $ANTLR start "ruleEMFProfileDecorationModel"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:69:1: ruleEMFProfileDecorationModel : ( ( rule__EMFProfileDecorationModel__Group__0 ) ) ;
    public final void ruleEMFProfileDecorationModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:73:2: ( ( ( rule__EMFProfileDecorationModel__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:74:1: ( ( rule__EMFProfileDecorationModel__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:74:1: ( ( rule__EMFProfileDecorationModel__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:75:1: ( rule__EMFProfileDecorationModel__Group__0 )
            {
             before(grammarAccess.getEMFProfileDecorationModelAccess().getGroup()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:76:1: ( rule__EMFProfileDecorationModel__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:76:2: rule__EMFProfileDecorationModel__Group__0
            {
            pushFollow(FOLLOW_rule__EMFProfileDecorationModel__Group__0_in_ruleEMFProfileDecorationModel94);
            rule__EMFProfileDecorationModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEMFProfileDecorationModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEMFProfileDecorationModel"


    // $ANTLR start "entryRuleDecoration"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:88:1: entryRuleDecoration : ruleDecoration EOF ;
    public final void entryRuleDecoration() throws RecognitionException {
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:89:1: ( ruleDecoration EOF )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:90:1: ruleDecoration EOF
            {
             before(grammarAccess.getDecorationRule()); 
            pushFollow(FOLLOW_ruleDecoration_in_entryRuleDecoration121);
            ruleDecoration();

            state._fsp--;

             after(grammarAccess.getDecorationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecoration128); 

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
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:97:1: ruleDecoration : ( ( rule__Decoration__Group__0 ) ) ;
    public final void ruleDecoration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:101:2: ( ( ( rule__Decoration__Group__0 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:102:1: ( ( rule__Decoration__Group__0 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:102:1: ( ( rule__Decoration__Group__0 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:103:1: ( rule__Decoration__Group__0 )
            {
             before(grammarAccess.getDecorationAccess().getGroup()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:104:1: ( rule__Decoration__Group__0 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:104:2: rule__Decoration__Group__0
            {
            pushFollow(FOLLOW_rule__Decoration__Group__0_in_ruleDecoration154);
            rule__Decoration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecorationAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "rule__EMFProfileDecorationModel__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:118:1: rule__EMFProfileDecorationModel__Group__0 : rule__EMFProfileDecorationModel__Group__0__Impl rule__EMFProfileDecorationModel__Group__1 ;
    public final void rule__EMFProfileDecorationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:122:1: ( rule__EMFProfileDecorationModel__Group__0__Impl rule__EMFProfileDecorationModel__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:123:2: rule__EMFProfileDecorationModel__Group__0__Impl rule__EMFProfileDecorationModel__Group__1
            {
            pushFollow(FOLLOW_rule__EMFProfileDecorationModel__Group__0__Impl_in_rule__EMFProfileDecorationModel__Group__0188);
            rule__EMFProfileDecorationModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EMFProfileDecorationModel__Group__1_in_rule__EMFProfileDecorationModel__Group__0191);
            rule__EMFProfileDecorationModel__Group__1();

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
    // $ANTLR end "rule__EMFProfileDecorationModel__Group__0"


    // $ANTLR start "rule__EMFProfileDecorationModel__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:130:1: rule__EMFProfileDecorationModel__Group__0__Impl : ( 'decorating profile' ) ;
    public final void rule__EMFProfileDecorationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:134:1: ( ( 'decorating profile' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:135:1: ( 'decorating profile' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:135:1: ( 'decorating profile' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:136:1: 'decorating profile'
            {
             before(grammarAccess.getEMFProfileDecorationModelAccess().getDecoratingProfileKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__EMFProfileDecorationModel__Group__0__Impl219); 
             after(grammarAccess.getEMFProfileDecorationModelAccess().getDecoratingProfileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMFProfileDecorationModel__Group__0__Impl"


    // $ANTLR start "rule__EMFProfileDecorationModel__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:149:1: rule__EMFProfileDecorationModel__Group__1 : rule__EMFProfileDecorationModel__Group__1__Impl rule__EMFProfileDecorationModel__Group__2 ;
    public final void rule__EMFProfileDecorationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:153:1: ( rule__EMFProfileDecorationModel__Group__1__Impl rule__EMFProfileDecorationModel__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:154:2: rule__EMFProfileDecorationModel__Group__1__Impl rule__EMFProfileDecorationModel__Group__2
            {
            pushFollow(FOLLOW_rule__EMFProfileDecorationModel__Group__1__Impl_in_rule__EMFProfileDecorationModel__Group__1250);
            rule__EMFProfileDecorationModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EMFProfileDecorationModel__Group__2_in_rule__EMFProfileDecorationModel__Group__1253);
            rule__EMFProfileDecorationModel__Group__2();

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
    // $ANTLR end "rule__EMFProfileDecorationModel__Group__1"


    // $ANTLR start "rule__EMFProfileDecorationModel__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:161:1: rule__EMFProfileDecorationModel__Group__1__Impl : ( ( rule__EMFProfileDecorationModel__ImportURIAssignment_1 ) ) ;
    public final void rule__EMFProfileDecorationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:165:1: ( ( ( rule__EMFProfileDecorationModel__ImportURIAssignment_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:166:1: ( ( rule__EMFProfileDecorationModel__ImportURIAssignment_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:166:1: ( ( rule__EMFProfileDecorationModel__ImportURIAssignment_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:167:1: ( rule__EMFProfileDecorationModel__ImportURIAssignment_1 )
            {
             before(grammarAccess.getEMFProfileDecorationModelAccess().getImportURIAssignment_1()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:168:1: ( rule__EMFProfileDecorationModel__ImportURIAssignment_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:168:2: rule__EMFProfileDecorationModel__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__EMFProfileDecorationModel__ImportURIAssignment_1_in_rule__EMFProfileDecorationModel__Group__1__Impl280);
            rule__EMFProfileDecorationModel__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEMFProfileDecorationModelAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMFProfileDecorationModel__Group__1__Impl"


    // $ANTLR start "rule__EMFProfileDecorationModel__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:178:1: rule__EMFProfileDecorationModel__Group__2 : rule__EMFProfileDecorationModel__Group__2__Impl ;
    public final void rule__EMFProfileDecorationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:182:1: ( rule__EMFProfileDecorationModel__Group__2__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:183:2: rule__EMFProfileDecorationModel__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EMFProfileDecorationModel__Group__2__Impl_in_rule__EMFProfileDecorationModel__Group__2310);
            rule__EMFProfileDecorationModel__Group__2__Impl();

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
    // $ANTLR end "rule__EMFProfileDecorationModel__Group__2"


    // $ANTLR start "rule__EMFProfileDecorationModel__Group__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:189:1: rule__EMFProfileDecorationModel__Group__2__Impl : ( ( rule__EMFProfileDecorationModel__DecorationsAssignment_2 )* ) ;
    public final void rule__EMFProfileDecorationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:193:1: ( ( ( rule__EMFProfileDecorationModel__DecorationsAssignment_2 )* ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:194:1: ( ( rule__EMFProfileDecorationModel__DecorationsAssignment_2 )* )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:194:1: ( ( rule__EMFProfileDecorationModel__DecorationsAssignment_2 )* )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:195:1: ( rule__EMFProfileDecorationModel__DecorationsAssignment_2 )*
            {
             before(grammarAccess.getEMFProfileDecorationModelAccess().getDecorationsAssignment_2()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:196:1: ( rule__EMFProfileDecorationModel__DecorationsAssignment_2 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:196:2: rule__EMFProfileDecorationModel__DecorationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__EMFProfileDecorationModel__DecorationsAssignment_2_in_rule__EMFProfileDecorationModel__Group__2__Impl337);
            	    rule__EMFProfileDecorationModel__DecorationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getEMFProfileDecorationModelAccess().getDecorationsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMFProfileDecorationModel__Group__2__Impl"


    // $ANTLR start "rule__Decoration__Group__0"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:212:1: rule__Decoration__Group__0 : rule__Decoration__Group__0__Impl rule__Decoration__Group__1 ;
    public final void rule__Decoration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:216:1: ( rule__Decoration__Group__0__Impl rule__Decoration__Group__1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:217:2: rule__Decoration__Group__0__Impl rule__Decoration__Group__1
            {
            pushFollow(FOLLOW_rule__Decoration__Group__0__Impl_in_rule__Decoration__Group__0374);
            rule__Decoration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decoration__Group__1_in_rule__Decoration__Group__0377);
            rule__Decoration__Group__1();

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
    // $ANTLR end "rule__Decoration__Group__0"


    // $ANTLR start "rule__Decoration__Group__0__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:224:1: rule__Decoration__Group__0__Impl : ( 'decoration' ) ;
    public final void rule__Decoration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:228:1: ( ( 'decoration' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:229:1: ( 'decoration' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:229:1: ( 'decoration' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:230:1: 'decoration'
            {
             before(grammarAccess.getDecorationAccess().getDecorationKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Decoration__Group__0__Impl405); 
             after(grammarAccess.getDecorationAccess().getDecorationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decoration__Group__0__Impl"


    // $ANTLR start "rule__Decoration__Group__1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:243:1: rule__Decoration__Group__1 : rule__Decoration__Group__1__Impl rule__Decoration__Group__2 ;
    public final void rule__Decoration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:247:1: ( rule__Decoration__Group__1__Impl rule__Decoration__Group__2 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:248:2: rule__Decoration__Group__1__Impl rule__Decoration__Group__2
            {
            pushFollow(FOLLOW_rule__Decoration__Group__1__Impl_in_rule__Decoration__Group__1436);
            rule__Decoration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decoration__Group__2_in_rule__Decoration__Group__1439);
            rule__Decoration__Group__2();

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
    // $ANTLR end "rule__Decoration__Group__1"


    // $ANTLR start "rule__Decoration__Group__1__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:255:1: rule__Decoration__Group__1__Impl : ( ( rule__Decoration__DecorationsAssignment_1 ) ) ;
    public final void rule__Decoration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:259:1: ( ( ( rule__Decoration__DecorationsAssignment_1 ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:260:1: ( ( rule__Decoration__DecorationsAssignment_1 ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:260:1: ( ( rule__Decoration__DecorationsAssignment_1 ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:261:1: ( rule__Decoration__DecorationsAssignment_1 )
            {
             before(grammarAccess.getDecorationAccess().getDecorationsAssignment_1()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:262:1: ( rule__Decoration__DecorationsAssignment_1 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:262:2: rule__Decoration__DecorationsAssignment_1
            {
            pushFollow(FOLLOW_rule__Decoration__DecorationsAssignment_1_in_rule__Decoration__Group__1__Impl466);
            rule__Decoration__DecorationsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDecorationAccess().getDecorationsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decoration__Group__1__Impl"


    // $ANTLR start "rule__Decoration__Group__2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:272:1: rule__Decoration__Group__2 : rule__Decoration__Group__2__Impl rule__Decoration__Group__3 ;
    public final void rule__Decoration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:276:1: ( rule__Decoration__Group__2__Impl rule__Decoration__Group__3 )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:277:2: rule__Decoration__Group__2__Impl rule__Decoration__Group__3
            {
            pushFollow(FOLLOW_rule__Decoration__Group__2__Impl_in_rule__Decoration__Group__2496);
            rule__Decoration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decoration__Group__3_in_rule__Decoration__Group__2499);
            rule__Decoration__Group__3();

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
    // $ANTLR end "rule__Decoration__Group__2"


    // $ANTLR start "rule__Decoration__Group__2__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:284:1: rule__Decoration__Group__2__Impl : ( '{' ) ;
    public final void rule__Decoration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:288:1: ( ( '{' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:289:1: ( '{' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:289:1: ( '{' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:290:1: '{'
            {
             before(grammarAccess.getDecorationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Decoration__Group__2__Impl527); 
             after(grammarAccess.getDecorationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decoration__Group__2__Impl"


    // $ANTLR start "rule__Decoration__Group__3"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:303:1: rule__Decoration__Group__3 : rule__Decoration__Group__3__Impl ;
    public final void rule__Decoration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:307:1: ( rule__Decoration__Group__3__Impl )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:308:2: rule__Decoration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Decoration__Group__3__Impl_in_rule__Decoration__Group__3558);
            rule__Decoration__Group__3__Impl();

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
    // $ANTLR end "rule__Decoration__Group__3"


    // $ANTLR start "rule__Decoration__Group__3__Impl"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:314:1: rule__Decoration__Group__3__Impl : ( '}' ) ;
    public final void rule__Decoration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:318:1: ( ( '}' ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:319:1: ( '}' )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:319:1: ( '}' )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:320:1: '}'
            {
             before(grammarAccess.getDecorationAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Decoration__Group__3__Impl586); 
             after(grammarAccess.getDecorationAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decoration__Group__3__Impl"


    // $ANTLR start "rule__EMFProfileDecorationModel__ImportURIAssignment_1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:342:1: rule__EMFProfileDecorationModel__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EMFProfileDecorationModel__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:346:1: ( ( RULE_STRING ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:347:1: ( RULE_STRING )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:347:1: ( RULE_STRING )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:348:1: RULE_STRING
            {
             before(grammarAccess.getEMFProfileDecorationModelAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EMFProfileDecorationModel__ImportURIAssignment_1630); 
             after(grammarAccess.getEMFProfileDecorationModelAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMFProfileDecorationModel__ImportURIAssignment_1"


    // $ANTLR start "rule__EMFProfileDecorationModel__DecorationsAssignment_2"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:357:1: rule__EMFProfileDecorationModel__DecorationsAssignment_2 : ( ruleDecoration ) ;
    public final void rule__EMFProfileDecorationModel__DecorationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:361:1: ( ( ruleDecoration ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:362:1: ( ruleDecoration )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:362:1: ( ruleDecoration )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:363:1: ruleDecoration
            {
             before(grammarAccess.getEMFProfileDecorationModelAccess().getDecorationsDecorationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDecoration_in_rule__EMFProfileDecorationModel__DecorationsAssignment_2661);
            ruleDecoration();

            state._fsp--;

             after(grammarAccess.getEMFProfileDecorationModelAccess().getDecorationsDecorationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMFProfileDecorationModel__DecorationsAssignment_2"


    // $ANTLR start "rule__Decoration__DecorationsAssignment_1"
    // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:372:1: rule__Decoration__DecorationsAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Decoration__DecorationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:376:1: ( ( ( RULE_ID ) ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:377:1: ( ( RULE_ID ) )
            {
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:377:1: ( ( RULE_ID ) )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:378:1: ( RULE_ID )
            {
             before(grammarAccess.getDecorationAccess().getDecorationsStereotypeCrossReference_1_0()); 
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:379:1: ( RULE_ID )
            // ../org.modelversioning.emfprofile.decoration.ui/src-gen/org/modelversioning/emfprofile/decoration/ui/contentassist/antlr/internal/InternalEMFProfileDecorationLanguage.g:380:1: RULE_ID
            {
             before(grammarAccess.getDecorationAccess().getDecorationsStereotypeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decoration__DecorationsAssignment_1696); 
             after(grammarAccess.getDecorationAccess().getDecorationsStereotypeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDecorationAccess().getDecorationsStereotypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decoration__DecorationsAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleEMFProfileDecorationModel_in_entryRuleEMFProfileDecorationModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMFProfileDecorationModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMFProfileDecorationModel__Group__0_in_ruleEMFProfileDecorationModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecoration_in_entryRuleDecoration121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecoration128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decoration__Group__0_in_ruleDecoration154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMFProfileDecorationModel__Group__0__Impl_in_rule__EMFProfileDecorationModel__Group__0188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EMFProfileDecorationModel__Group__1_in_rule__EMFProfileDecorationModel__Group__0191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__EMFProfileDecorationModel__Group__0__Impl219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMFProfileDecorationModel__Group__1__Impl_in_rule__EMFProfileDecorationModel__Group__1250 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__EMFProfileDecorationModel__Group__2_in_rule__EMFProfileDecorationModel__Group__1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMFProfileDecorationModel__ImportURIAssignment_1_in_rule__EMFProfileDecorationModel__Group__1__Impl280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMFProfileDecorationModel__Group__2__Impl_in_rule__EMFProfileDecorationModel__Group__2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMFProfileDecorationModel__DecorationsAssignment_2_in_rule__EMFProfileDecorationModel__Group__2__Impl337 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Decoration__Group__0__Impl_in_rule__Decoration__Group__0374 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Decoration__Group__1_in_rule__Decoration__Group__0377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Decoration__Group__0__Impl405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decoration__Group__1__Impl_in_rule__Decoration__Group__1436 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Decoration__Group__2_in_rule__Decoration__Group__1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decoration__DecorationsAssignment_1_in_rule__Decoration__Group__1__Impl466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decoration__Group__2__Impl_in_rule__Decoration__Group__2496 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Decoration__Group__3_in_rule__Decoration__Group__2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Decoration__Group__2__Impl527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decoration__Group__3__Impl_in_rule__Decoration__Group__3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Decoration__Group__3__Impl586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EMFProfileDecorationModel__ImportURIAssignment_1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecoration_in_rule__EMFProfileDecorationModel__DecorationsAssignment_2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decoration__DecorationsAssignment_1696 = new BitSet(new long[]{0x0000000000000002L});

}