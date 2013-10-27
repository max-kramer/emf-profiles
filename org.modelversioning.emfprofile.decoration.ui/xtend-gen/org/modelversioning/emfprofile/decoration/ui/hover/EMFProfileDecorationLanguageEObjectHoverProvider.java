package org.modelversioning.emfprofile.decoration.ui.hover;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class EMFProfileDecorationLanguageEObjectHoverProvider extends DefaultEObjectHoverProvider {
  protected String getFirstLine(final EObject o) {
    String _xblockexpression = null;
    {
      String _plus = ("FirstLine: " + o);
      InputOutput.<String>println(_plus);
      String _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        if (o instanceof EAttribute) {
          final EAttribute _eAttribute = (EAttribute)o;
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("<b>");
          String _name = _eAttribute.getName();
          _builder.append(_name, "");
          _builder.append("</b> : ");
          EClassifier _eType = _eAttribute.getEType();
          String _name_1 = _eType.getName();
          _builder.append(_name_1, "");
          _switchResult = _builder.toString();
        }
      }
      if (!_matched) {
        String _firstLine = super.getFirstLine(o);
        _switchResult = _firstLine;
      }
      _xblockexpression = (_switchResult);
    }
    return _xblockexpression;
  }
}
