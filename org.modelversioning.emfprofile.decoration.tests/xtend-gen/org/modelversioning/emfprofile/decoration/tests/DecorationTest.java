package org.modelversioning.emfprofile.decoration.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.modelversioning.emfprofile.Stereotype;
import org.modelversioning.emfprofile.decoration.EMFProfileDecorationLanguageInjectorProvider;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationModel;

@InjectWith(EMFProfileDecorationLanguageInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class DecorationTest {
  @Inject
  private ParseHelper<DecorationModel> parser;
  
  @Test
  public void test() {
    try {
      final DecorationModel model = this.parser.parse(
        "import resource \'profile.emfprofile_diagram\';\n\nprofile EJB_Profile\n\n\ndecoration IDAttribute {\n\tborder {\n\t\tsize : 23\n//\t\tactive when \n\t}\n}\n\ndecoration SessionBean {\n\ticon {   \n\t\tlocation-uri : \'/EJB_Profile/icons/nav_refresh.gif\'\n\t\tactive when any( \n\t\t\tattributeInBean != 4.4\n\t\t\tisUserManaged == true \n\t\t\tisUserManaged != false\n\t\t\t)\n\t} \n\tborder {\n\t\tsize : 23\n\t} \n\tactive when all (  \n\t\tisUserManaged != true;\n\t\tany (\n\t\t\tisUserManaged == false\n\t\t) \n\t)\n\t\n}\ndecoration Bean {\n\tborder {\n\t\tsize : 84\n\t}\n\tactive when attributeInBean > 34\n}\n\ndecoration EntityBean { \n\tborder {\n\t\tsize : 23  \n\t\tactive when all(\n\t\t\t// supported attribute types\n\t\t\tattributeInBean <= 5.5 // is EFloat\n\t\t\tisStateful != false\t\t// is EBoolean\n\t\t\tnumberDouble < 45.00\n\t\t\tnumberFloat > 55.434\n\t\t\tnumberInt >= 5\n\t\t\tstring != \'what\'\n\t\t\tstring == \'yes\'\n\t\t\t\n\t\t\t// it should be possible to parse an integer to double\n\t\t\tnumberFloat <= 45\n\t\t\t\n\t\t\t\n\t\t\t// EVERYTHING UNDER THIS IS WRONG AND SHOULD SHOW AN ERROR\n//\t\t\t\n//\t\t\t// unsupported operators for EString and EBoolean\n//\t\t\tstring < \'wrong\'\n//\t\t\tstring <= \'wrong\'\n//\t\t\tstring > \'wrong\'\n//\t\t\tstring >= \'wrong\'\n//\t\t\tisStateful < \'wrong\'\n//\t\t\tisStateful <= \'wrong\'\n//\t\t\tisStateful > \'wrong\'\n//\t\t\tisStateful >= \'wrong\'\n//\t\t\t \n//\t\t\t// these attribute types are not supported\n//\t\t\tbyte == 3\n//\t\t\tchar ==\'2\'\n//\t\t\tnumberLong == 123\n//\t\t\tnumberShort == 23\n//\t\t\tbyteArrayShouldNotBeVisible == 2\n//\t\t\t\n//\t\t\t// wrong value assignment\n//\t\t\tisStateful != \'false\'\t\t// is EBoolean\n//\t\t\tnumberDouble < \'wrong\'\n//\t\t\tnumberFloat > \'wrong\'\n//\t\t\tnumberInt >= \'wrong\'\n//\t\t\tstring != 1234.0\n//\t\t\tisStateful == \'true\'\n\t\t)\n\t}\n}\n\n");
      String _string = this.parser.toString();
      InputOutput.<String>println(_string);
      EList<DecorationDescription> _decorationDescriptions = model.getDecorationDescriptions();
      DecorationDescription _head = IterableExtensions.<DecorationDescription>head(_decorationDescriptions);
      final DecorationDescription entity = ((DecorationDescription) _head);
      Stereotype _stereotype = entity.getStereotype();
      InputOutput.<Stereotype>println(((Stereotype) _stereotype));
      EList<AbstractDecoration> _decorations = entity.getDecorations();
      AbstractDecoration _head_1 = IterableExtensions.<AbstractDecoration>head(_decorations);
      EObject _eContainer = _head_1.eContainer();
      Assert.assertSame(entity, _eContainer);
      Resource _eResource = model.eResource();
      EList<Diagnostic> _errors = _eResource.getErrors();
      final Procedure1<Diagnostic> _function = new Procedure1<Diagnostic>() {
        public void apply(final Diagnostic e) {
          InputOutput.<Diagnostic>println(e);
        }
      };
      IterableExtensions.<Diagnostic>forEach(_errors, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
