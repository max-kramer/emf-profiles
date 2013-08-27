/**
 * Copyright (c) 2012 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.ui.observer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper;
import org.modelversioning.emfprofile.application.registry.exception.TraversingEObjectContainerChainException;
import org.modelversioning.emfprofileapplication.ProfileApplication;

/**
 * It will register {@link DecoratableEditorPartListener editor part listener}
 * to the active {@link IWorkbenchPage workbench page}. It will hook itself to
 * the workbench to perform clean up if there is workbench shut down. Same if
 * the View is closed it performs a clean up. After initialization please set
 * the viewer so that the services this class also activates can be started.
 * 
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 * 
 */
public class ActiveEditorObserver {

	public static ActiveEditorObserver INSTANCE = new ActiveEditorObserver();

	private IWorkbenchPage activePage;
	private TreeViewer viewer;

	private DecoratableEditorPartListener decoratableEditorPartListener;

	public DecoratableEditorPartListener getDecoratableEditorPartListener() {
		return decoratableEditorPartListener;
	}

	// hide default constructor
	private ActiveEditorObserver() {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		if (window == null)
			throw new RuntimeException(
					"could not locate workbench active window!");
		activePage = window.getActivePage();
		if (activePage == null)
			throw new RuntimeException(
					"could not locate active page for active window ");
	}

	/**
	 * To set the Tree Viewer from outside. After calling this method an
	 * {@link DecoratableEditorPartListener editor part listener} will be added
	 * on active page which registers activation of editors that can be
	 * decorated. </br> <b>Note:</b> without setting a tree viewer the services
	 * of this class implementation will not work properly.
	 * 
	 * @param viewer
	 */
	public void setViewer(TreeViewer viewer) {

		this.viewer = viewer;

		// listener that gets notified for workbench changes and registers
		// editor parts of interest
		decoratableEditorPartListener = new DecoratableEditorPartListener(
				viewer);
		activePage.addPartListener(decoratableEditorPartListener);

		// when workbench is about to close, we have to perform clean-up for all
		// editors of interest and their profile applications
		PlatformUI.getWorkbench().addWorkbenchListener(
				new IWorkbenchListener() {

					@Override
					public boolean preShutdown(IWorkbench workbench,
							boolean forced) {
						cleanUp();
						decoratableEditorPartListener
								.cleanUpForAllEditorParts();
						return true;
					}

					@Override
					public void postShutdown(IWorkbench workbench) {
						// nothing to do here
					}
				});
	}

	/**
	 * Complete refresh of the viewer tree if needed.
	 */
	public void refreshViewer() {
		if (viewer == null || viewer.getTree().isDisposed()) // viewer was
			// disposed
			return;
		viewer.getTree().getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				viewer.refresh();
				viewer.expandToLevel(2);
			}
		});
	}

	/**
	 * If we need {@link ProfileApplicationWrapper} because of its extended
	 * functionalities, and calling {@link EObject#eContainer()} will eventually
	 * return {@link ProfileApplication} but we cannot cast it to
	 * {@link ProfileApplicationWrapper}. Thus, the easiest way to get it is
	 * from the {@link ProfileApplicationRegistry}, which this method does for
	 * you.
	 * 
	 * @param eObject
	 * @return
	 * @throws TraversingEObjectContainerChainException
	 */
	public ProfileApplicationWrapper findProfileApplicationWrapper(
			EObject eObject) throws TraversingEObjectContainerChainException {
		return ProfileApplicationRegistry.INSTANCE
				.getProfileApplicationManager(
						decoratableEditorPartListener
								.getResourceSetOfDecoratableActiveEditor())
				.getProfileApplicationWrapperOfContainedEObject(eObject);
	}


	/**
	 * The cleanup is executed if the profile application view in workbench is
	 * closing, but not the Workbench. If the workbench is closing, then the
	 * clean-up will be executed in
	 * {@link IWorkbenchListener#preShutdown(IWorkbench, boolean)} which calls
	 * clean-up for all profile applications in
	 * {@link DecoratableEditorPartListener#cleanUpForAllEditorParts()}.
	 */
	public void cleanUp() {
		activePage.removePartListener(decoratableEditorPartListener);
		if (PlatformUI.getWorkbench().isClosing() == false) {
			decoratableEditorPartListener.cleanUpForAllEditorParts();
		}
	}

}
