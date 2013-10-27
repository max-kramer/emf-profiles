package org.modelversioning.emfprofile.decoration.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
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
        "import EJB_Profile.*;\n\ndecoration SessionBean {\n\ticone {\n\t\tlocation-uri : \"Location_uri\";\n\t}\n\tactive when: all ( \n\t\tisUserManaged != false\n\t\tisUserManaged >= 5\n\t\tisUserManaged == true\n\t\t\n\t\t\n\t)\n}");
      EList<DecorationDescription> _decorationDescriptions = model.getDecorationDescriptions();
      DecorationDescription _head = IterableExtensions.<DecorationDescription>head(_decorationDescriptions);
      final DecorationDescription entity = ((DecorationDescription) _head);
      Stereotype _stereotype = entity.getStereotype();
      InputOutput.<Stereotype>println(((Stereotype) _stereotype));
      EList<AbstractDecoration> _decorations = entity.getDecorations();
      AbstractDecoration _head_1 = IterableExtensions.<AbstractDecoration>head(_decorations);
      EObject _eContainer = _head_1.eContainer();
      Assert.assertSame(entity, _eContainer);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
