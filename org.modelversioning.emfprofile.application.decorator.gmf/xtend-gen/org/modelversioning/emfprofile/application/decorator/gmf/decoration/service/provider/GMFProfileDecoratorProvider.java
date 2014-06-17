package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.provider;

import com.google.common.base.Objects;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.CreateDecoratorsOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.BorderDecorator;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.BoxDecorator;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.ColorDecorator;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.ConnectionDecorator;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.EObjectDecorators;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.ImageDecorator;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.provider.EObjectToDecoratorsMapper;
import org.modelversioning.emfprofile.diagram.edit.parts.EAttributeEditPart;
import org.modelversioning.emfprofile.diagram.edit.parts.EClassAttributesEditPart;
import org.modelversioning.emfprofile.diagram.edit.parts.EClassEditPart;
import org.modelversioning.emfprofile.diagram.edit.parts.EClassNameEditPart;
import org.modelversioning.emfprofile.diagram.edit.parts.EClassOperationsEditPart;
import org.modelversioning.emfprofile.diagram.edit.parts.EOperationEditPart;
import org.modelversioning.emfprofile.diagram.edit.parts.EReferenceEditPart;
import org.modelversioning.emfprofile.diagram.edit.parts.EReferenceLowerBoundUpperBoundEditPart;
import org.modelversioning.emfprofile.diagram.edit.parts.EReferenceNameEditPart;

@SuppressWarnings("all")
public class GMFProfileDecoratorProvider extends AbstractProvider implements IDecoratorProvider {
  private final EObjectToDecoratorsMapper mapper = EObjectToDecoratorsMapper.INSTANCE;
  
  public boolean provides(final IOperation operation) {
    Assert.isNotNull(operation);
    boolean _not = (!(operation instanceof CreateDecoratorsOperation));
    if (_not) {
      return false;
    }
    final IDecoratorTarget decoratorTarget = ((CreateDecoratorsOperation) operation).getDecoratorTarget();
    final EObject eObject = GMFProfileDecoratorProvider.getEObjectFromDecoratorTarget(decoratorTarget);
    Object _adapter = decoratorTarget.getAdapter(EditPart.class);
    final EditPart editPart = ((EditPart) _adapter);
    boolean _notEquals = (!Objects.equal(eObject, null));
    if (_notEquals) {
      boolean _matched = false;
      if (!_matched) {
        if (editPart instanceof CompartmentEditPart) {
          final CompartmentEditPart _compartmentEditPart = (CompartmentEditPart)editPart;
          _matched=true;
          final EditPart parentEditPart = _compartmentEditPart.getParent();
          Object _model = parentEditPart.getModel();
          if ((_model instanceof Node)) {
            Object _model_1 = parentEditPart.getModel();
            final Node node = ((Node) _model_1);
            final EObject parentEObject = node.getElement();
            boolean _equals = parentEObject.equals(eObject);
            return (!_equals);
          }
        }
      }
      if (!_matched) {
        return true;
      }
    }
    return false;
  }
  
  public void something() {
    final EClassEditPart eClassEditPart = null;
    final EClassNameEditPart eClassNameEditPart = null;
    final EClassAttributesEditPart eClassAttributesEditPart = null;
    final EAttributeEditPart eAttributeEditPart = null;
    final EClassOperationsEditPart eClassOperationsEditPart = null;
    final EOperationEditPart eOperationEditPart = null;
    final EReferenceNameEditPart eReferenceNameEditPart = null;
    final EReferenceLowerBoundUpperBoundEditPart eReferenceLowerBoundUpperBoundEditPart = null;
    final EReferenceEditPart eReferenceEditPart = null;
    final Edge edge = null;
    final Node node = null;
  }
  
  public void createDecorators(final IDecoratorTarget decoratorTarget) {
    final EObject eObject = GMFProfileDecoratorProvider.getEObjectFromDecoratorTarget(decoratorTarget);
    boolean _notEquals = (!Objects.equal(eObject, null));
    if (_notEquals) {
      ImageDecorator _imageDecorator = new ImageDecorator(decoratorTarget);
      final ImageDecorator imageDecorator = _imageDecorator;
      BorderDecorator _borderDecorator = new BorderDecorator(decoratorTarget);
      final BorderDecorator borderDecorator = _borderDecorator;
      ColorDecorator _colorDecorator = new ColorDecorator(decoratorTarget);
      final ColorDecorator colorDecorator = _colorDecorator;
      ConnectionDecorator _connectionDecorator = new ConnectionDecorator(decoratorTarget);
      final ConnectionDecorator connectionDecorator = _connectionDecorator;
      BoxDecorator _boxDecorator = new BoxDecorator(decoratorTarget);
      final BoxDecorator boxDecorator = _boxDecorator;
      decoratorTarget.installDecorator(ImageDecorator.KEY, imageDecorator);
      decoratorTarget.installDecorator(BorderDecorator.KEY, borderDecorator);
      decoratorTarget.installDecorator(BoxDecorator.KEY, boxDecorator);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Creating decorators for: ");
      _builder.append(eObject, "");
      _builder.append(", node: ");
      Node _decoratorTargetNode = GMFProfileDecoratorProvider.getDecoratorTargetNode(decoratorTarget);
      _builder.append(_decoratorTargetNode, "");
      InputOutput.<String>println(_builder.toString());
      EObjectDecorators _eObjectDecorators = new EObjectDecorators(decoratorTarget, imageDecorator, borderDecorator, colorDecorator, connectionDecorator, boxDecorator);
      this.mapper.put(eObject, _eObjectDecorators);
    }
  }
  
  /**
   * Check if the target should be decorated
   * 
   * @param decoratorTarget
   *            the target to test
   * @return true if target should be decorated
   */
  public static boolean shouldDecorate(final IDecoratorTarget decoratorTarget) {
    Object _adapter = decoratorTarget.getAdapter(View.class);
    return GMFProfileDecoratorProvider.shouldDecorate(((View) _adapter));
  }
  
  /**
   * Check if the view node is instance of {@link Node} or {@link Edge}.
   * 
   * @param view
   *            the view element to check
   * @return true if view should be decorated
   */
  public static boolean shouldDecorate(final View view) {
    boolean _or = false;
    if ((view instanceof Node)) {
      _or = true;
    } else {
      _or = ((view instanceof Node) || (view instanceof Edge));
    }
    return _or;
  }
  
  /**
   * Check if the view is a link representation.
   * 
   * @param view
   *            the gmf view
   * @return true if the view is an edge
   */
  private static boolean isEdge(final View view) {
    boolean _and = false;
    boolean _and_1 = false;
    boolean _notEquals = (!Objects.equal(view, null));
    if (!_notEquals) {
      _and_1 = false;
    } else {
      _and_1 = (_notEquals && (view instanceof Edge));
    }
    if (!_and_1) {
      _and = false;
    } else {
      EObject _eContainer = view.eContainer();
      _and = (_and_1 && (_eContainer instanceof Diagram));
    }
    return _and;
  }
  
  /**
   * Check if the view is a node representation.
   * 
   * @param view
   *            the gmf view
   * @return true if the view is a node
   */
  private static boolean isNode(final View view) {
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(view, null));
    if (!_notEquals) {
      _and = false;
    } else {
      _and = (_notEquals && (view instanceof Node));
    }
    return _and;
  }
  
  /**
   * Utility method to retrieve {@link View} from the supplied
   * <code>decoratorTarget</code>.
   * 
   * @param decoratorTarget
   *            {@link IDecoratorTarget} to retrieve {@link View} from.
   * @return {@link View} from the <code>decoratorElement</code> or
   *         <code>null</code> if not retrievable.
   */
  public static View getDecoratorTargetView(final IDecoratorTarget decoratorTarget) {
    Object _adapter = decoratorTarget.getAdapter(View.class);
    final View view = ((View) _adapter);
    return view;
  }
  
  /**
   * Utility method to retrieve {@link Node} from the supplied
   * <code>decoratorTarget</code>.
   * 
   * @param decoratorTarget
   *            {@link IDecoratorTarget} to retrieve {@link Node} from.
   * @return node {@link Node} from the <code>decoratorElement</code> or
   *         <code>null</code> if not retrievable.
   */
  public static Node getDecoratorTargetNode(final IDecoratorTarget decoratorTarget) {
    Object _adapter = decoratorTarget.getAdapter(View.class);
    final View view = ((View) _adapter);
    boolean _matched = false;
    if (!_matched) {
      if (view instanceof Node) {
        final Node _node = (Node)view;
        _matched=true;
        return _node;
      }
    }
    return null;
  }
  
  /**
   * Utility method to retrieve the {@link EObject} from the supplied
   * <code>decoratorTarget</code>.
   * 
   * @param decoratorTarget
   *            {@link IDecoratorTarget} to retrieve {@link EObject} from.
   * @return eObject {@link EObject} from the <code>decoratorElement</code> or
   *         <code>null</code> if not retrievable.
   */
  public static EObject getEObjectFromDecoratorTarget(final IDecoratorTarget decoratorTarget) {
    final View node = GMFProfileDecoratorProvider.getDecoratorTargetView(decoratorTarget);
    EObject _element = null;
    if (node!=null) {
      _element=node.getElement();
    }
    return _element;
  }
  
  /**
   * Utility method to retrieve the root {@link EditPartViewer} from the
   * supplied <code>decoratorTarget</code>.
   * 
   * @param decoratorTarget
   *            {@link IDecoratorTarget} to retrieve {@link EditPartViewer}
   *            from.
   * @return editPart {@link EditPartViewer} from the
   *         <code>decoratorElement</code> or <code>null</code> if not
   *         retrievable.
   */
  public static EditPartViewer getEditPartViewer(final IDecoratorTarget decoratorTarget) {
    Object _adapter = decoratorTarget.getAdapter(EditPart.class);
    final EditPart editPart = ((EditPart) _adapter);
    RootEditPart _root = null;
    if (editPart!=null) {
      _root=editPart.getRoot();
    }
    return _root.getViewer();
  }
  
  /**
   * Utility method to retrieve the root {@link RootEditPart} from the
   * supplied <code>decoratorTarget</code>.
   * 
   * @param decoratorTarget
   *            {@link IDecoratorTarget} to retrieve {@link RootEditPart}
   *            from.
   * @return editPart {@link RootEditPart} from the
   *         <code>decoratorElement</code> or <code>null</code> if not
   *         retrievable.
   */
  public static RootEditPart getRootEditPart(final IDecoratorTarget decoratorTarget) {
    Object _adapter = decoratorTarget.getAdapter(EditPart.class);
    final EditPart editPart = ((EditPart) _adapter);
    RootEditPart _root = null;
    if (editPart!=null) {
      _root=editPart.getRoot();
    }
    return _root;
  }
}
