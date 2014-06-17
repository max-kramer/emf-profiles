package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.provider

import org.eclipse.core.runtime.Assert
import org.eclipse.emf.ecore.EObject
import org.eclipse.gef.EditPart
import org.eclipse.gef.EditPartViewer
import org.eclipse.gef.RootEditPart
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider
import org.eclipse.gmf.runtime.common.core.service.IOperation
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.CreateDecoratorsOperation
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorProvider
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget
import org.eclipse.gmf.runtime.notation.Diagram
import org.eclipse.gmf.runtime.notation.Edge
import org.eclipse.gmf.runtime.notation.Node
import org.eclipse.gmf.runtime.notation.View
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.BorderDecorator
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.BoxDecorator
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.ColorDecorator
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.ConnectionDecorator
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.EObjectDecorators
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.ImageDecorator
import org.modelversioning.emfprofile.diagram.edit.parts.EAttributeEditPart
import org.modelversioning.emfprofile.diagram.edit.parts.EClassAttributesEditPart
import org.modelversioning.emfprofile.diagram.edit.parts.EClassEditPart
import org.modelversioning.emfprofile.diagram.edit.parts.EClassNameEditPart
import org.modelversioning.emfprofile.diagram.edit.parts.EClassOperationsEditPart
import org.modelversioning.emfprofile.diagram.edit.parts.EOperationEditPart
import org.modelversioning.emfprofile.diagram.edit.parts.EReferenceEditPart
import org.modelversioning.emfprofile.diagram.edit.parts.EReferenceLowerBoundUpperBoundEditPart
import org.modelversioning.emfprofile.diagram.edit.parts.EReferenceNameEditPart

class GMFProfileDecoratorProvider extends AbstractProvider implements IDecoratorProvider {

	val mapper = EObjectToDecoratorsMapper.INSTANCE

	override provides(IOperation operation) {
		Assert.isNotNull(operation);
		if (!(operation instanceof CreateDecoratorsOperation)) {
			return false;
		}
		val decoratorTarget = (operation as CreateDecoratorsOperation).getDecoratorTarget();
		val eObject = getEObjectFromDecoratorTarget(decoratorTarget)
		val editPart = decoratorTarget.getAdapter(typeof(EditPart)) as EditPart
		if (eObject != null) {
		
			// only provide decorator for root nodes of an element - not for
			// compartments of the same element
			switch editPart {
				CompartmentEditPart: {
					val parentEditPart = editPart.getParent()
					if (parentEditPart.model instanceof Node) {
						val node = parentEditPart.getModel() as Node
						val parentEObject = node.getElement()
						return !parentEObject.equals(eObject)
					}
				}
				default:
					return true
			}
		}
		return false
	}
	
	def something(){
		// Node
		val EClassEditPart eClassEditPart = null
		val EClassNameEditPart eClassNameEditPart = null
		val EClassAttributesEditPart eClassAttributesEditPart = null
		val EAttributeEditPart eAttributeEditPart = null
		val EClassOperationsEditPart eClassOperationsEditPart = null
		val EOperationEditPart eOperationEditPart = null
		val EReferenceNameEditPart eReferenceNameEditPart = null
		val EReferenceLowerBoundUpperBoundEditPart eReferenceLowerBoundUpperBoundEditPart = null
		
		// Edge
		val EReferenceEditPart eReferenceEditPart = null
		
		val Edge edge = null
		val Node node = null
		
//		val HighlightingSupportAdapter shshs = null
	}

	//	override provides(IOperation operation) {
	//		if (operation instanceof CreateDecoratorsOperation) {
	//			val IDecoratorTarget decoratorTarget = (operation as CreateDecoratorsOperation).getDecoratorTarget()
	//			return shouldDecorate(decoratorTarget)
	//		}
	//		return false;
	//	}
	//	override createDecorators(IDecoratorTarget decoratorTarget) {
	//		val View view = decoratorTarget.getAdapter(typeof(View)) as View
	//		if (shouldDecorate(view)) {
	//			val ITextAwareEditPart label = decoratorTarget.getAdapter(typeof(ITextAwareEditPart)) as ITextAwareEditPart
	//
	//			//			if (label != null && isNode(view)) {
	//			//				// a label = a node representation + a textholder
	//			//				decoratorTarget.installDecorator(DIFF, new DiffLabelDecorator(decoratorTarget));
	//			//			} else 
	//			if (isEdge(view)) {
	//				installEdgeDecorators(decoratorTarget)
	//
	//			//				decoratorTarget.installDecorator(DIFF, new DiffEdgeDecorator(decoratorTarget));
	//			} else if (isNode(view)) {
	//				installNodeDecorators(decoratorTarget)
	////				decoratorTarget.installDecorator(DIFF, new DiffNodeDecorator(decoratorTarget));
	//			} else {
	//				println("UNABLE TO DECORATE TARGET: " + view)
	//			}
	//		}
	//	}
//	def installNodeDecorators(IDecoratorTarget decoratorTarget) {
//		installEdgeDecorators(decoratorTarget)
//	}
//
//	def installEdgeDecorators(IDecoratorTarget decoratorTarget) {
//		val eObject = getEObjectFromDecoratorTarget(decoratorTarget)
//		if (eObject != null) {
//
//			//			val decorator = new EMFProfileDecorator(decoratorTarget);
//			val imageDecorator = new ImageDecorator(decoratorTarget)
//			val borderDecorator = new BorderDecorator(decoratorTarget)
//			val highlightingDecorator = new HighlightingDecorator(decoratorTarget)
//
//			decoratorTarget.installDecorator(ImageDecorator::KEY, imageDecorator)
//			decoratorTarget.installDecorator(BorderDecorator::KEY, borderDecorator)
//			decoratorTarget.installDecorator(HighlightingDecorator::KEY, highlightingDecorator)
//			
//			mapper.put(eObject,
//				new EObjectDecorators(
//					decoratorTarget,
//					imageDecorator,
//					borderDecorator,
//					highlightingDecorator
//				))
//		}
//
//	}

	override createDecorators(IDecoratorTarget decoratorTarget) {
		val eObject = getEObjectFromDecoratorTarget(decoratorTarget)
		if (eObject != null) {

			//			val decorator = new EMFProfileDecorator(decoratorTarget);
			val imageDecorator = new ImageDecorator(decoratorTarget)
			val borderDecorator = new BorderDecorator(decoratorTarget)
			val colorDecorator = new ColorDecorator(decoratorTarget)
			val connectionDecorator = new ConnectionDecorator(decoratorTarget)
			val boxDecorator = new BoxDecorator(decoratorTarget)

			decoratorTarget.installDecorator(ImageDecorator::KEY, imageDecorator)
			decoratorTarget.installDecorator(BorderDecorator::KEY, borderDecorator)
			decoratorTarget.installDecorator(BoxDecorator::KEY, boxDecorator)
println('''Creating decorators for: «eObject», node: «getDecoratorTargetNode(decoratorTarget)»''')
			mapper.put(eObject,
				new EObjectDecorators(
					decoratorTarget,
					imageDecorator,
					borderDecorator,
					colorDecorator,
					connectionDecorator, 
					boxDecorator
				))
		}
	}

	/**
	 * Check if the target should be decorated
	 * 
	 * @param decoratorTarget
	 *            the target to test
	 * @return true if target should be decorated
	 */
	public static def boolean shouldDecorate(IDecoratorTarget decoratorTarget) {
		return shouldDecorate(decoratorTarget.getAdapter(typeof(View)) as View)
	}

	/**
	 * Check if the view node is instance of {@link Node} or {@link Edge}.
	 * 
	 * @param view
	 *            the view element to check
	 * @return true if view should be decorated
	 */
	public static def boolean shouldDecorate(View view) {
		return view instanceof Node || view instanceof Edge
	}

	/**
	 * Check if the view is a link representation.
	 * 
	 * @param view
	 *            the gmf view
	 * @return true if the view is an edge
	 */
	private static def boolean isEdge(View view) {
		return view != null && (view instanceof Edge) && view.eContainer() instanceof Diagram
	}

	/**
	 * Check if the view is a node representation.
	 * 
	 * @param view
	 *            the gmf view
	 * @return true if the view is a node
	 */
	private static def boolean isNode(View view) {
		return view != null && (view instanceof Node)
	}

	//	 +++++++++++++++++++ UTILITY METHODS +++++++++++++++++++
	//	+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		/**
	 * Utility method to retrieve {@link View} from the supplied
	 * <code>decoratorTarget</code>.
	 * 
	 * @param decoratorTarget
	 *            {@link IDecoratorTarget} to retrieve {@link View} from.
	 * @return {@link View} from the <code>decoratorElement</code> or
	 *         <code>null</code> if not retrievable.
	 */
	def static View getDecoratorTargetView(IDecoratorTarget decoratorTarget) {
		val view = decoratorTarget.getAdapter(typeof(View)) as View
		return view
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
	def static Node getDecoratorTargetNode(IDecoratorTarget decoratorTarget) {
		val view = decoratorTarget.getAdapter(typeof(View)) as View
		switch view {
			Node:
				return view
			default:
				return null
		}
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
	def static EObject getEObjectFromDecoratorTarget(IDecoratorTarget decoratorTarget) {
		val node = getDecoratorTargetView(decoratorTarget)
		return node?.element
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
	def static EditPartViewer getEditPartViewer(IDecoratorTarget decoratorTarget) {
		val editPart = decoratorTarget.getAdapter(typeof(EditPart)) as EditPart
		return editPart?.root.viewer
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
	def static RootEditPart getRootEditPart(IDecoratorTarget decoratorTarget) {
		val editPart = decoratorTarget.getAdapter(typeof(EditPart)) as EditPart
		return editPart?.root
	}

}
