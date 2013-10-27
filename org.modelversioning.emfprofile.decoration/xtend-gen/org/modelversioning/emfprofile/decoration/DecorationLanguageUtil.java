package org.modelversioning.emfprofile.decoration;

import org.eclipse.emf.ecore.EObject;
import org.modelversioning.emfprofile.Stereotype;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription;

@SuppressWarnings("all")
public final class DecorationLanguageUtil {
  /**
   * Can be used to traverse back the containment path to find the Stereotype
   * which is cross-referenced in DecorationDescription
   */
  public static final Stereotype getStereotype(final EObject object) {
    Stereotype _xblockexpression = null;
    {
      final EObject parent = object.eContainer();
      Stereotype _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        if (parent instanceof DecorationDescription) {
          final DecorationDescription _decorationDescription = (DecorationDescription)parent;
          _matched=true;
          return ((DecorationDescription) _decorationDescription).getStereotype();
        }
      }
      if (!_matched) {
        Stereotype _stereotype = DecorationLanguageUtil.getStereotype(parent);
        _switchResult = _stereotype;
      }
      _xblockexpression = (_switchResult);
    }
    return _xblockexpression;
  }
}
