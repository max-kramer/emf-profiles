/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.impl;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationManager;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription;

/**
 * This class is intended to be used as place holder in the initialization of
 * the {@link ProfileApplicationWrapper} for a decorator which for the decoration
 * notifications does nothing until the concrete decorator is registered in the
 * {@link ProfileApplicationManager manager} of this wrapper which in turn
 * replaces the instance of this class with the instance of the concrete
 * decorator for every wrapper that it holds.
 * 
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 * 
 */
public class SimpleEMFProfileApplicationDecorator extends MinimalEObjectImpl
		implements EMFProfileApplicationDecorator {

	/**
	 * Always returns empty collection.
	 * 
	 * @see org.modelversioning.emfprofile.application.registry.
	 * EMFProfileApplicationDecorator#canDecorateEditorsWithFollowingIDs()
	 */
	@Override
	public Collection<String> canDecorateEditorsWithFollowingIDs() {
		return Collections.emptyList();
	}

	/**
	 * Always returns <code>null</code>.
	 * 
	 * @see org.modelversioning.emfprofile.application.registry.
	 * EMFProfileApplicationDecorator
	 * #resolveEObjectFromEditorSelection(java.lang.Object)
	 */
	@Override
	public EObject resolveEObjectFromEditorSelection(Object selection) {
		return null;
	}

	/* Can not decorate anything.
	 * (non-Javadoc)
	 * @see org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator#decorate(org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration)
	 */
	@Override
	public void decorate(GraphicalDecorationDescription decorationDescription) {
		System.out.println("Simple DECORATING: " + decorationDescription.toString());
	}

}
