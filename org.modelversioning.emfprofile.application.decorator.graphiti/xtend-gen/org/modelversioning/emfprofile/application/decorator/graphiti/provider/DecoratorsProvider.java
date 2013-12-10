package org.modelversioning.emfprofile.application.decorator.graphiti.provider;

import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.platform.IDiagramBehavior;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.ILinkService;
import org.eclipse.graphiti.tb.IDecorator;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.modelversioning.emfprofile.application.decorator.graphiti.service.EObjectToDecorationsMapper;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

@SuppressWarnings("all")
public class DecoratorsProvider {
  private DecoratorsProvider() {
  }
  
  public final static DecoratorsProvider INSTANCE = new Function0<DecoratorsProvider>() {
    public DecoratorsProvider apply() {
      DecoratorsProvider _decoratorsProvider = new DecoratorsProvider();
      return _decoratorsProvider;
    }
  }.apply();
  
  private final Map<EObject,EObjectToDecorationsMapper> mapToDecorations = new Function0<Map<EObject,EObjectToDecorationsMapper>>() {
    public Map<EObject,EObjectToDecorationsMapper> apply() {
      HashMap<EObject,EObjectToDecorationsMapper> _newHashMap = Maps.<EObject, EObjectToDecorationsMapper>newHashMap();
      return _newHashMap;
    }
  }.apply();
  
  public IDecorator[] getDecorators(final PictogramElement pictogramElement, final IDiagramBehavior diagramBehaviour) {
    ILinkService _linkService = Graphiti.getLinkService();
    final EObject businessObject = _linkService.getBusinessObjectForLinkedPictogramElement(pictogramElement);
    boolean _equals = Objects.equal(businessObject, null);
    if (_equals) {
      return null;
    }
    final EObjectToDecorationsMapper decorations = this.mapToDecorations.get(businessObject);
    boolean _notEquals = (!Objects.equal(decorations, null));
    if (_notEquals) {
      return decorations.getDecorators();
    }
    EObjectToDecorationsMapper _eObjectToDecorationsMapper = new EObjectToDecorationsMapper(pictogramElement, diagramBehaviour);
    this.mapToDecorations.put(businessObject, _eObjectToDecorationsMapper);
    return null;
  }
  
  public void decorate(final GraphicalDecorationDescription graphicalDecorationDescription) {
    StereotypeApplication _stereotypeApplication = graphicalDecorationDescription.getStereotypeApplication();
    final EObject businessObject = _stereotypeApplication.getAppliedTo();
    final EObjectToDecorationsMapper decorations = this.mapToDecorations.get(businessObject);
    decorations.addGraphicalDecorationDescriptions(graphicalDecorationDescription);
  }
  
  public void removeDecoration(final GraphicalDecorationDescription graphicalDecorationDescription) {
    StereotypeApplication _stereotypeApplication = graphicalDecorationDescription.getStereotypeApplication();
    final EObject businessObject = _stereotypeApplication.getAppliedTo();
    final EObjectToDecorationsMapper decorations = this.mapToDecorations.get(businessObject);
    decorations.removeGraphicalDecorationDescriptioins(graphicalDecorationDescription);
  }
}
