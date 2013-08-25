/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.ui.propertytester;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.ui.IEditorPart;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry;
import org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationDecoratorNotFoundException;
import org.modelversioning.emfprofile.application.registry.ui.ProfileApplicationConstantsAndUtil;
import org.modelversioning.emfprofile.application.registry.ui.observer.ActiveEditorObserver;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 * 
 */
public class SelectionContainsModelObjectTester extends PropertyTester {

	/**
	 * 
	 */
	public SelectionContainsModelObjectTester() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.expressions.IPropertyTester#test(java.lang.Object,
	 * java.lang.String, java.lang.Object[], java.lang.Object)
	 */
	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {

		try {
			IEditorPart editorPart = ActiveEditorObserver.INSTANCE
					.getDecoratableEditorPartListener()
					.getLastActiveEditorPart();
			if (editorPart == null)
				return false;
			String editorId = ProfileApplicationConstantsAndUtil
					.getEditorIdFromEditorPart(editorPart);
			if (ProfileApplicationRegistry.INSTANCE
					.getProfileApplicationDecoratorForEditorId(editorId)
					.resolveEObjectFromEditorSelection(receiver) == null)
				return false;
			else
				return true;
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ProfileApplicationDecoratorNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}

}
