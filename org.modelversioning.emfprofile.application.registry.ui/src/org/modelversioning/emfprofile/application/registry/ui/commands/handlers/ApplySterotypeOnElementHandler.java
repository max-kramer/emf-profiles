package org.modelversioning.emfprofile.application.registry.ui.commands.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.source.IVerticalRulerInfo;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public class ApplySterotypeOnElementHandler extends AbstractHandler implements IHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        try {
            applyStereotypeOnElement(HandlerUtil.getActiveEditor(event));
        } catch (BadLocationException e) {
            // TODO log error message and perform error handling
        }

        return null;
    }

    private void applyStereotypeOnElement(IEditorPart activeEditor) throws org.eclipse.jface.text.BadLocationException {
        IVerticalRulerInfo rulerInfo = (IVerticalRulerInfo) activeEditor.getAdapter(IVerticalRulerInfo.class);

        if (rulerInfo == null || !(activeEditor instanceof XtextEditor))
            return; // TODO maybe throw error

        XtextEditor xtextEditor = (XtextEditor) activeEditor;
        IXtextDocument document = xtextEditor.getDocument();

        XtextResource resource = document.readOnly(new IUnitOfWork<XtextResource, XtextResource>() {
            public XtextResource exec(XtextResource state) throws Exception {
                return state;
            }
        });

        int linenumber = rulerInfo.getLineOfLastMouseButtonActivity();
        EObjectAtOffsetHelper helper = new EObjectAtOffsetHelper();
        EObject element = helper.resolveElementAt(resource, document.getLineOffset(linenumber));
        
        // TODO: open dialog for choosing and applying stereotype. set an appropriate message for the marker.
        
        IMarker myMarker = createStereotypeMarker(xtextEditor.getResource(), element.toString(), linenumber + 1);
    }

    public IMarker createStereotypeMarker(IResource resource, String message, int linenumber) {
        try {
            //TODO: create own marker type
            IMarker marker = resource.createMarker("org.modelversioning.emfprofile.application.registry.ui.sterotypemarker");
            marker.setAttribute(IMarker.MESSAGE, message);
            marker.setAttribute(IMarker.LINE_NUMBER, linenumber);
            return marker;
        } catch (CoreException e) {
            // TODO: Handle the cases where attribute value is rejected
        }
        return null;
    }

}
