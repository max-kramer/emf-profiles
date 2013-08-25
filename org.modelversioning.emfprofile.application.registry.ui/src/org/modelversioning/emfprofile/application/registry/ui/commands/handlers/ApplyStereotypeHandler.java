/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.ui.commands.handlers;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper;
import org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationDecoratorNotFoundException;
import org.modelversioning.emfprofile.application.registry.ui.dialogs.ApplyStereotypeToEObjectDialog;
import org.modelversioning.emfprofile.application.registry.ui.observer.ActiveEditorObserver;
import org.modelversioning.emfprofileapplication.StereotypeApplicability;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 * 
 */
public class ApplyStereotypeHandler extends AbstractHandler implements IHandler {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.
	 * ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
			EObject eObject = ProfileApplicationRegistry.INSTANCE
					.getProfileApplicationDecoratorForEditorId(HandlerUtil.getActiveEditorId(event))
					.resolveEObjectFromEditorSelection(currentSelection);

			// we are looking in all loaded profiles if there are any stereotypes
			// applicable on eObject
			final Map<ProfileApplicationWrapper, Collection<StereotypeApplicability>> profileToStereotypeApplicabilityForEObjectMap = new HashMap<>();
			for (ProfileApplicationWrapper profileApplication : ProfileApplicationRegistry.INSTANCE
					.getProfileApplicationManager(
							ActiveEditorObserver.INSTANCE
									.getDecoratableEditorPartListener()
									.getResourceSetOfDecoratableActiveEditor())
					.getProfileApplications()) {
				profileToStereotypeApplicabilityForEObjectMap.put(
						profileApplication,
						(Collection<StereotypeApplicability>) profileApplication
								.getApplicableStereotypes(eObject));
			}
			boolean mayApplyStereotype = false;
			for (Collection<?> stereotypesApplicabilities : profileToStereotypeApplicabilityForEObjectMap
					.values()) {
				if (!stereotypesApplicabilities.isEmpty()) {
					mayApplyStereotype = true;
					break;
				}
			}
			if (mayApplyStereotype) {
				ApplyStereotypeToEObjectDialog applySteretypeDialog = new ApplyStereotypeToEObjectDialog(
						profileToStereotypeApplicabilityForEObjectMap);
				applySteretypeDialog.openApplyStereotypeDialog(eObject);
			} else {
				MessageDialog.openInformation(
						HandlerUtil.getActiveWorkbenchWindow(event).getShell(),
						"Info", "Can not apply any stereotype to EObject: "
								+ eObject.toString());
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ProfileApplicationDecoratorNotFoundException e) {
			MessageDialog.openInformation(
					HandlerUtil.getActiveWorkbenchWindow(event).getShell(),
					"Error", "Could not find any decorator implementation that can support this editor id: " + HandlerUtil.getActiveEditorId(event));
			e.printStackTrace();
		}
		return null;
	}

}
