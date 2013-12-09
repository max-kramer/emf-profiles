package org.modelversioning.emfprofile.application.decorator.graphiti;

import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.ILinkService;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.modelversioning.emfprofile.application.decorator.AbstractEMFProfileApplicationDecorator;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription;

@SuppressWarnings("all")
public class GraphitiProfileApplicationDecorator extends AbstractEMFProfileApplicationDecorator {
  protected Set<String> provideEditorIds() {
    return Sets.<String>newHashSet("org.eclipse.graphiti.ui.editor.DiagramEditor");
  }
  
  public void decorate(final GraphicalDecorationDescription decorationDescription) {
    String _plus = ("NEW GRAPHITI DECORATING: " + decorationDescription);
    InputOutput.<String>println(_plus);
  }
  
  public void removeDecoration(final GraphicalDecorationDescription decorationDescription) {
    String _plus = ("NEW GRAPHITI REMOVING DECORATION: " + decorationDescription);
    InputOutput.<String>println(_plus);
  }
  
  public EObject resolveEObjectFromEditorSelection(final Object selection) {
    boolean _equals = Objects.equal(selection, null);
    if (_equals) {
      return null;
    }
    boolean _matched = false;
    if (!_matched) {
      if (selection instanceof IStructuredSelection) {
        final IStructuredSelection _iStructuredSelection = (IStructuredSelection)selection;
        _matched=true;
        Iterator _iterator = _iStructuredSelection.iterator();
        Iterable<Object> _iterable = IteratorExtensions.<Object>toIterable(_iterator);
        for (final Object object : _iterable) {
          if ((object instanceof EditPart)) {
            Object _model = ((EditPart) object).getModel();
            final EObject model = ((EObject) _model);
            if ((model instanceof PictogramElement)) {
              final PictogramElement pe = ((PictogramElement) model);
              ILinkService _linkService = Graphiti.getLinkService();
              final EObject businessObject = _linkService.getBusinessObjectForLinkedPictogramElement(pe);
              return businessObject;
            }
          }
        }
      }
    }
    if (!_matched) {
      if (selection instanceof EditPart) {
        final EditPart _editPart = (EditPart)selection;
        _matched=true;
        Object _model = _editPart.getModel();
        final EObject model = ((EObject) _model);
        if ((model instanceof PictogramElement)) {
          final PictogramElement pe = ((PictogramElement) model);
          ILinkService _linkService = Graphiti.getLinkService();
          final EObject businessObject = _linkService.getBusinessObjectForLinkedPictogramElement(pe);
          return businessObject;
        }
      }
    }
    return null;
  }
}
