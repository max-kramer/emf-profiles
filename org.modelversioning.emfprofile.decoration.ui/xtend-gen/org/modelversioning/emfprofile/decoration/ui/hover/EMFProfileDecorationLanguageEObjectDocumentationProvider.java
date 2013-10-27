package org.modelversioning.emfprofile.decoration.ui.hover;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.modelversioning.emfprofile.Stereotype;

@SuppressWarnings("all")
public class EMFProfileDecorationLanguageEObjectDocumentationProvider implements IEObjectDocumentationProvider {
  public String getDocumentation(final EObject o) {
    String _xblockexpression = null;
    {
      InputOutput.<EObject>println(o);
      String _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        if (o instanceof EAttribute) {
          final EAttribute _eAttribute = (EAttribute)o;
          _matched=true;
          String _xblockexpression_1 = null;
          {
            EObject _eContainer = _eAttribute.eContainer();
            final Stereotype stereotype = ((Stereotype) _eContainer);
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("attribute of the stereotype class <b>");
            EClass _eClass = stereotype.eClass();
            String _name = _eClass.getName();
            _builder.append(_name, "");
            _builder.append("</b>");
            _xblockexpression_1 = (_builder.toString());
          }
          _switchResult = _xblockexpression_1;
        }
      }
      if (!_matched) {
        _switchResult = null;
      }
      _xblockexpression = (_switchResult);
    }
    return _xblockexpression;
  }
}
