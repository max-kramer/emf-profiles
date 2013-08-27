/**
 * Copyright (c) 2012 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.ui.commands.handlers;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper;
import org.modelversioning.emfprofile.application.registry.exception.TraversingEObjectContainerChainException;
import org.modelversioning.emfprofile.application.registry.ui.observer.ActiveEditorObserver;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 * 
 */
public class RemoveStereotypeApplicationOrNestedClassHandler extends
		AbstractHandler implements IHandler {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.
	 * ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection sSelection = (IStructuredSelection) selection;
			Iterator<EObject> selectedObjectsIterator = sSelection.iterator();
			while (selectedObjectsIterator.hasNext()) {
				EObject eObject = selectedObjectsIterator.next();
				if (!(eObject instanceof ProfileApplication)) {
					ProfileApplicationWrapper profileApplicationWrapper;
					try {
						profileApplicationWrapper = ActiveEditorObserver.INSTANCE
								.findProfileApplicationWrapper(eObject);
						if (eObject instanceof StereotypeApplication) {
							StereotypeApplication stereotypeApplication = (StereotypeApplication) eObject;
							profileApplicationWrapper
									.removeEObject(stereotypeApplication);
						} else {
							// code for removing nested objects
							profileApplicationWrapper.removeEObject(eObject);
						}
					} catch (TraversingEObjectContainerChainException e) {
						// if it couldn't be found, that most probably indicates
						// that one container object in the chain to the root
						// (which is profile application) was removed.
						continue;
					}

				}
				// TODO Consider removing the resource of profile application
				// with this handler

			}

		}
		return null;
	}

}
