/**
 * Copyright (c) 2012 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.decorator.reflective;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * @author Philip Langer (langer@big.tuwien.ac.at)
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 */
public class EMFProfileApplicationDecoratorImpl extends MinimalEObjectImpl implements
		EMFProfileApplicationDecorator {
	private static final String ECORE_REFLECTIVE_EDITOR_ID = "org.eclipse.emf.ecore.presentation.ReflectiveEditorID";
	private static final String ECORE_EDITOR_ID = "org.eclipse.emf.ecore.presentation.EcoreEditorID";

	private static final String[] CAN_DECORATE_EDITORS = new String[] {
			ECORE_REFLECTIVE_EDITOR_ID, ECORE_EDITOR_ID };



	public EMFProfileApplicationDecoratorImpl() {
	}

	@Override
	public Collection<String> canDecorateEditorsWithFollowingIDs() {
		return Arrays.asList(CAN_DECORATE_EDITORS);
	}


	@Override
	public void decorate(StereotypeApplication stereotypeApplication) {
		// TODO implement decorate for reflective editor
		
	}



	@Override
	public void undecorate(StereotypeApplication stereotypeApplication) {
		// TODO implement undecorate for reflective editor 
		
	}



	@Override
	public EObject resolveEObjectFromEditorSelection(Object selection) {
		if (selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object element = structuredSelection.getFirstElement();
			if (element instanceof EObject) {
				EObject selectedEObject = (EObject) element;
				return selectedEObject;
			} 
		}
		return null;
	}

}
