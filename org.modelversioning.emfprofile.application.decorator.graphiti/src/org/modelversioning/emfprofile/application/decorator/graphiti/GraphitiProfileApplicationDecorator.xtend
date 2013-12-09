package org.modelversioning.emfprofile.application.decorator.graphiti

import com.google.common.collect.Sets
import org.eclipse.emf.ecore.EObject
import org.eclipse.gef.EditPart
import org.eclipse.graphiti.mm.pictograms.PictogramElement
import org.eclipse.graphiti.services.Graphiti
import org.eclipse.jface.viewers.IStructuredSelection
import org.modelversioning.emfprofile.application.decorator.AbstractEMFProfileApplicationDecorator
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription

class GraphitiProfileApplicationDecorator extends AbstractEMFProfileApplicationDecorator {

	override protected provideEditorIds() {
		return Sets.newHashSet("org.eclipse.graphiti.ui.editor.DiagramEditor")
	}

	override decorate(GraphicalDecorationDescription decorationDescription) {
		println("NEW GRAPHITI DECORATING: " + decorationDescription)
	}

	override removeDecoration(GraphicalDecorationDescription decorationDescription) {
		println("NEW GRAPHITI REMOVING DECORATION: " + decorationDescription)
	}

	override resolveEObjectFromEditorSelection(Object selection) {
		if(selection == null) return null;

		switch selection {
			IStructuredSelection: {
				for (Object object : selection.iterator.toIterable) {
					if (object instanceof EditPart) {
						val model = (object as EditPart).model as EObject
						if (model instanceof PictogramElement) {
							val pe = model as PictogramElement;
							val businessObject = Graphiti.getLinkService().
								getBusinessObjectForLinkedPictogramElement(pe);
							return businessObject;
						}
					}
				}
			}
			EditPart: {
				val model = selection.model as EObject;
				if (model instanceof PictogramElement) {
					val pe = model as PictogramElement;
					val businessObject = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
					return businessObject;
				}
			}
		}
		return null;
	}

}
