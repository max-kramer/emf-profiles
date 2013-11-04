/**
 * <copyright>
 *
 * Copyright (c) 2010 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * </copyright>
 */

package org.modelversioning.emfprofile.application.registry.ui.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationManager;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry;
import org.modelversioning.emfprofile.application.registry.exception.ProfileApplicationAlreadyLoadedException;
import org.modelversioning.emfprofile.application.registry.exception.ReadingDecorationDescriptionsException;
import org.modelversioning.emfprofile.application.registry.ui.EMFProfileApplicationRegistryUIPlugin;
import org.modelversioning.emfprofile.application.registry.ui.ProfileApplicationConstantsAndUtil;
import org.modelversioning.emfprofile.application.registry.ui.observer.ActiveEditorObserver;
import org.modelversioning.emfprofileapplication.ProfileApplication;

/**
 * Wizard for collecting necessary information to import a
 * {@link ProfileApplication}.
 * 
 * @author <a href="mailto:langer@big.tuwien.ac.at">Philip Langer</a>
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 */
public class LoadProfileApplicationWizard extends Wizard {

	private static final String PROFILE_APPLICATION_PAGE_NAME = "newFilePage1"; //$NON-NLS-1$
	private static final String WINDOW_TITLE = "Select Profile Application File";

	private SelectProfileApplicationFilePage profileAppFilePage = null;

	// private ISelection selection;

	/**
	 * The default constructor
	 */
	public LoadProfileApplicationWizard() {
		setHelpAvailable(false);
		setWindowTitle(WINDOW_TITLE);
	}

	/**
	 * Calls the {@link ProfileApplicationRegistry} to load the profile
	 * application.
	 */
	@Override
	public boolean performFinish() {
		IFile profileApplicationFile = profileAppFilePage.getSelectedFile();
		return loadProfileApplicationFile(profileApplicationFile);
	}

	/**
	 * @param profileApplicationFile
	 * @return <code>true</code> if the load was successful, <code>false</code> otherwise.
	 */
	public boolean loadProfileApplicationFile(IFile profileApplicationFile) {
		try {
			IEditorPart activeEditor = ActiveEditorObserver.INSTANCE.getDecoratableEditorPartListener().getLastActiveEditorPart();
			ResourceSet resourceSet = ActiveEditorObserver.INSTANCE
					.getDecoratableEditorPartListener()
					.getResourceSetOfDecoratableActiveEditor();// getResourceSetOfEditorPart(targetEditorPart);
			if (resourceSet == null)
				throw new RuntimeException(
						"Could not find the ResourceSet of this editor part: "
								+ activeEditor);
			String editorId = ProfileApplicationConstantsAndUtil.getEditorIdFromEditorPart(activeEditor);
			ProfileApplicationManager manager = ProfileApplicationRegistry.INSTANCE.getProfileApplicationManager(resourceSet);
			// bind a decorator of the active editor within the profile application manager
			manager.bindProfileApplicationDecorator(editorId);
			manager.loadProfileApplication(profileApplicationFile);
		} catch (ProfileApplicationAlreadyLoadedException paale){
			MessageDialog.openInformation(PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getShell(),"Won't load!",
							paale.getMessage());
			return false;
		} catch (ReadingDecorationDescriptionsException rdde){
			MessageDialog.openWarning(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Decoration Descriptions", rdde.getMessage());
		} catch (Exception e) {
//			e.printStackTrace();
			IStatus status = new Status(IStatus.ERROR,
					EMFProfileApplicationRegistryUIPlugin.PLUGIN_ID,
					e.getMessage(), e);
			ErrorDialog
					.openError(PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getShell(),
							"Error Loading Profile Application",
							e.getMessage(), status);
			return false;
		}
		return true;
	}

	/**
	 * Adds the {@link SelectProfileFilePage} and the
	 * {@link SelectProfileApplicationFilePage}.
	 */
	@Override
	public void addPages() {
		super.addPages();
		profileAppFilePage = new SelectProfileApplicationFilePage(
				PROFILE_APPLICATION_PAGE_NAME,
				"Select Profile Application File", null);
		// profileAppFilePage.setSelection(getNewSelection());
		super.addPage(profileAppFilePage);
	}

}
