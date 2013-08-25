/**
 * Copyright (c) 2012 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.ui;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.EditorPart;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 *
 */
public final class ProfileApplicationConstantsAndUtil {
	// hides default constructor
	private ProfileApplicationConstantsAndUtil() {	}

	public static final String EMF_PROFILE_APPLICATION_FILE_EXTENSION = "pa.xmi";
	
	/**
	 * Returns the resolved {@link ResourceSet resource set} from the editing domain of the supplied
	 * <code>editorPart</code>. 
	 * 
	 * @param editorPart
	 * @return the resource set.
	 * @throws NullPointerException
	 */
	public static final ResourceSet getResourceSet(IEditorPart editorPart) throws NullPointerException {
		Object adapter = editorPart.getAdapter(IEditingDomainProvider.class);
		if (adapter != null && adapter instanceof IEditingDomainProvider) {
			IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) adapter;
			return editingDomainProvider.getEditingDomain().getResourceSet();
		} 
		throw new NullPointerException("This editor part does not poses an editing domain from which the resource set could be resolved.");
	}
	
	/**
	 * Gets an Editor Id from the provided {@link IWorkbenchPart workbench part}.
	 * @param part
	 * @return
	 */
	public static final String getEditorIdFromEditorPart(IWorkbenchPart part) {
		return part.getSite().getId();
	}

}
