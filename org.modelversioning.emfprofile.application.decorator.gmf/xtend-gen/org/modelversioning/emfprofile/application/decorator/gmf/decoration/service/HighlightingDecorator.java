package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service;

import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.AbstractOnlyOneDecorationDecorator;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;

@SuppressWarnings("all")
public class HighlightingDecorator extends AbstractOnlyOneDecorationDecorator {
  public final static String KEY = "PROFILE_APPLICATION_HIGHLIGHTING_DECORATION";
  
  public HighlightingDecorator(final IDecoratorTarget decoratorTarget) {
    super(decoratorTarget);
  }
  
  public Class<? extends AbstractDecoration> getDecorationType() {
    return null;
  }
  
  public void refresh() {
  }
}
