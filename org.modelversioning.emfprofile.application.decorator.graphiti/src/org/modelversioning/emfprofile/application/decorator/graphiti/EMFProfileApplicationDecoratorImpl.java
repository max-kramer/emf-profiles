/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.decorator.graphiti;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 *
 */
public class EMFProfileApplicationDecoratorImpl extends MinimalEObjectImpl implements
		EMFProfileApplicationDecorator {

	private final List<String> decorateableEditors = new ArrayList<String>();

	
	/**
	 * 
	 */
	public EMFProfileApplicationDecoratorImpl() {
		decorateableEditors.add("org.eclipse.graphiti.ui.editor.DiagramEditor");
	}

	@Override
	public Collection<String> canDecorateEditorsWithFollowingIDs() {
		return Collections.unmodifiableCollection(decorateableEditors);
	}

	@Override
	public void decorate(StereotypeApplication stereotypeApplication) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void undecorate(StereotypeApplication stereotypeApplication) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EObject resolveEObjectFromEditorSelection(Object selection) {
		
//		TODO CHECK THE IMPLEMENTATION
		
		if (selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Iterator<?> selectionElements = ((IStructuredSelection) selection).iterator();
			while (selectionElements.hasNext()) {
				Object se = selectionElements.next();
				if(se instanceof EditPart){
					Object object = ((EditPart)se).getModel();
					EObject robj = (EObject) object;
					if (robj instanceof PictogramElement) {
						PictogramElement pe = (PictogramElement) robj;
						EObject businessObject = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
						if (businessObject == null) {
							return null;
						} else {
//							TODO remove syso graphiti found object
							System.out.println("Found EObject: " + businessObject.toString());
							return businessObject;
						
						}
					}
				}
//				if (se instanceof GraphitiShapeEditPart && !selectionElements.hasNext()) {					
//					PictogramElement pe = ((GraphitiShapeEditPart) se).getPictogramElement();
//					Object bo = MyFeatureProvider.getbusinessobject(pe);
//					if (bo instanceof MybusinessClass) {
//						// whatever
//					}
						
//				}
			}
//			if(activeEditor instanceof DiagramEditor){
//				DiagramEditor de = (DiagramEditor) activeEditor;
//				de.getDiagramTypeProvider().
//				de.getDiagramTypeProvider().getFeatureProvider().getb
//			}
			System.out.println(structuredSelection);
//			EditPart editPart = (EditPart) structuredSelection
//					.getFirstElement();
//			Object model = editPart.getModel();
//			if (model instanceof Node) {
//				Node node = (Node) model;
//				EObject selectedEObject = node.getElement();
//				EMFProfileApplicationDecoratorImpl
//						.getPluginExtensionOperationsListener()
//						.eObjectSelected(selectedEObject);
//			} else {
//				EMFProfileApplicationDecoratorImpl
//						.getPluginExtensionOperationsListener()
//						.eObjectSelected(null);
//			}
		}
		return null;
	}
}
