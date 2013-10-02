/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.xtext.ui.emfprofile;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;
import org.modelversioning.emfprofile.diagram.part.EMFProfileDiagramEditor;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 *
 */
public class EMFProfileEditorOpener extends LanguageSpecificURIEditorOpener {
	
	Logger log = Logger.getLogger(EMFProfileEditorOpener.class);
	
	@Override
    protected void selectAndReveal(IEditorPart openEditor, URI uri,
            EReference crossReference, int indexInList, boolean select) {
        EMFProfileDiagramEditor emfProfileEditor = (EMFProfileDiagramEditor) openEditor.getAdapter(EMFProfileDiagramEditor.class);
        if (emfProfileEditor != null) {
            EObject eObject = emfProfileEditor.getEditingDomain().getResourceSet().getEObject(uri, true);
            // FIXME cannot make selection in EMF Profile Diagram editor (GMF based)
//            emfProfileEditor.setSelectionToViewer(Collections.singletonList(eObject));
            log.info("EMF PROFILE DIAGRAM EDITOR - SELECTING " + eObject.toString());
        }
    }
}
