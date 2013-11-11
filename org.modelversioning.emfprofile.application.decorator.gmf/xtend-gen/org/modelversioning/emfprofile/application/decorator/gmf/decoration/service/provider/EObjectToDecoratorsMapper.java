package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.provider;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.EObjectDecorators;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

@SuppressWarnings("all")
public class EObjectToDecoratorsMapper {
  private EObjectToDecoratorsMapper() {
  }
  
  public final static EObjectToDecoratorsMapper INSTANCE = new Function0<EObjectToDecoratorsMapper>() {
    public EObjectToDecoratorsMapper apply() {
      EObjectToDecoratorsMapper _eObjectToDecoratorsMapper = new EObjectToDecoratorsMapper();
      return _eObjectToDecoratorsMapper;
    }
  }.apply();
  
  private final Multimap<EObject,EObjectDecorators> decorators = new Function0<Multimap<EObject,EObjectDecorators>>() {
    public Multimap<EObject,EObjectDecorators> apply() {
      ArrayListMultimap<EObject,EObjectDecorators> _create = ArrayListMultimap.<EObject, EObjectDecorators>create();
      return _create;
    }
  }.apply();
  
  public boolean put(final EObject object, final EObjectDecorators eObjectDecorators) {
    boolean _put = this.decorators.put(object, eObjectDecorators);
    return _put;
  }
  
  public void decorate(final GraphicalDecorationDescription graphicalDecorationDescription) {
    StereotypeApplication _stereotypeApplication = graphicalDecorationDescription.getStereotypeApplication();
    EObject _appliedTo = _stereotypeApplication.getAppliedTo();
    Collection<EObjectDecorators> _get = this.decorators.get(_appliedTo);
    final Procedure1<EObjectDecorators> _function = new Procedure1<EObjectDecorators>() {
      public void apply(final EObjectDecorators it) {
        it.decorate(graphicalDecorationDescription);
      }
    };
    IterableExtensions.<EObjectDecorators>forEach(_get, _function);
  }
  
  public void removeDecoration(final GraphicalDecorationDescription graphicalDecorationDescription) {
    StereotypeApplication _stereotypeApplication = graphicalDecorationDescription.getStereotypeApplication();
    EObject _appliedTo = _stereotypeApplication.getAppliedTo();
    Collection<EObjectDecorators> _get = this.decorators.get(_appliedTo);
    final Procedure1<EObjectDecorators> _function = new Procedure1<EObjectDecorators>() {
      public void apply(final EObjectDecorators it) {
        it.removeDecoration(graphicalDecorationDescription);
      }
    };
    IterableExtensions.<EObjectDecorators>forEach(_get, _function);
  }
}
