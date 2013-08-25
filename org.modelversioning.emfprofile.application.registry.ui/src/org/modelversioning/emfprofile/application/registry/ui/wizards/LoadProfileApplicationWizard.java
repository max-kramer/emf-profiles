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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IEditorPart;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper;
import org.modelversioning.emfprofile.application.registry.ui.EMFProfileApplicationRegistryUIPlugin;
import org.modelversioning.emfprofile.application.registry.ui.observer.ActiveEditorObserver;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * Wizard for collecting necessary information to import a
 * {@link ProfileApplication}.
 * 
 * @author <a href="mailto:langer@big.tuwien.ac.at">Philip Langer</a>
 * 
 */
public class LoadProfileApplicationWizard extends Wizard {

	private static final String PROFILE_APPLICATION_PAGE_NAME = "newFilePage1"; //$NON-NLS-1$
	private static final String WINDOW_TITLE = "Select Profile Application File";

	//TODO remove targetEditorPart
	private IEditorPart targetEditorPart = null;
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
		// TODO remove me
		System.out.println(profileApplicationFile.toString());
		System.out.println(profileApplicationFile.getLocation().toString());
		try {
			ResourceSet resourceSet = ActiveEditorObserver.INSTANCE
					.getDecoratableEditorPartListener().getResourceSetOfDecoratableActiveEditor();//getResourceSetOfEditorPart(targetEditorPart);
			if (resourceSet == null)
				throw new RuntimeException(
						"Could not find the ResourceSet of this editor part: "
								+ targetEditorPart);
			ProfileApplicationWrapper profileApplication = ProfileApplicationRegistry.INSTANCE
					.getProfileApplicationManager(resourceSet)
					.loadProfileApplication(profileApplicationFile);

			ActiveEditorObserver.INSTANCE.refreshViewer();
			EList<EObject> eObjects = new BasicEList<>();
			for (StereotypeApplication stereotypeApplication : profileApplication
					.getStereotypeApplications()) {
				eObjects.add(stereotypeApplication.getAppliedTo());
			}
//			TODO remove refresh decorations stuff
//			ActiveEditorObserver.INSTANCE.refreshDecorations(eObjects);
		} catch (Exception e) {
			e.printStackTrace();
			IStatus status = new Status(IStatus.ERROR,
					EMFProfileApplicationRegistryUIPlugin.PLUGIN_ID,
					e.getMessage(), e);
			ErrorDialog
					.openError(targetEditorPart.getSite().getShell(),
							"Error Loading Profile Application",
							e.getMessage(), status);
			// EMFProfileApplicationRegistryUIPlugin.getDefault().getLog()
			// .log(status);
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

	/**
	 * Sets the workbench part to use for profile application creation.
	 * 
	 * @param editorPart
	 *            to set.
	 */
	public void setEditorPart(IEditorPart editorPart) {
		this.targetEditorPart = editorPart;
	}
}
