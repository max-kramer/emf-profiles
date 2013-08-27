/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.ui.observer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry;
import org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationDecoratorNotFoundException;
import org.modelversioning.emfprofile.application.registry.ui.ProfileApplicationConstantsAndUtil;
import org.modelversioning.emfprofile.application.registry.ui.views.filters.AppliedStereotypesOfSelectedEObjectViewerFilter;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 * 
 */
public class ActiveDecoratableEditorSelectionListener implements
		ISelectionListener {

	private AppliedStereotypesOfSelectedEObjectViewerFilter viewerFilter;

	/**
	 * @param viewerFilter
	 * 
	 */
	public ActiveDecoratableEditorSelectionListener(
			AppliedStereotypesOfSelectedEObjectViewerFilter viewerFilter) {
		this.viewerFilter = viewerFilter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.ISelectionListener#selectionChanged(org.eclipse.ui.
	 * IWorkbenchPart, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if(part.equals(ActiveEditorObserver.INSTANCE.getDecoratableEditorPartListener().getLastActiveEditorPart())){
			try {
				EMFProfileApplicationDecorator decorator = ProfileApplicationRegistry.INSTANCE
						.getProfileApplicationDecoratorForEditorId(ProfileApplicationConstantsAndUtil
								.getEditorIdFromEditorPart(part));
				EObject eObject = decorator
						.resolveEObjectFromEditorSelection(selection);
				eObjectSelected(eObject);
			} catch (ProfileApplicationDecoratorNotFoundException e) {
				e.printStackTrace();
			}
		}
		
	}

	/**
	 * @param eObject
	 */
	public void eObjectSelected(EObject eObject) {
		if (eObject == null) {
			if (viewerFilter.getSelectedEObject() != null) {
				viewerFilter.setSelectedEObject(eObject);
				if (ActiveEditorObserver.INSTANCE
						.getDecoratableEditorPartListener()
						.isViewerFilterActivated())
					ActiveEditorObserver.INSTANCE.refreshViewer();
			}
		} else if (!eObject.equals(viewerFilter.getSelectedEObject())) {
			viewerFilter.setSelectedEObject(eObject);
			if (ActiveEditorObserver.INSTANCE
					.getDecoratableEditorPartListener()
					.isViewerFilterActivated())
				ActiveEditorObserver.INSTANCE.refreshViewer();
		}
	}

}
