/**
 * Copyright (c) 2012 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.ui.observer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.ISources;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.handlers.RegistryToggleState;
import org.eclipse.ui.services.ISourceProviderService;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper;
import org.modelversioning.emfprofile.application.registry.ui.EMFProfileApplicationRegistryUIPlugin;
import org.modelversioning.emfprofile.application.registry.ui.ProfileApplicationConstantsAndUtil;
import org.modelversioning.emfprofile.application.registry.ui.commands.handlers.StereotypeApplicationsOnSelectedElementHandler;
import org.modelversioning.emfprofile.application.registry.ui.commands.handlers.UnloadProfileApplicationHandler;
import org.modelversioning.emfprofile.application.registry.ui.commands.sourceprovider.ToolbarCommandEnabledState;
import org.modelversioning.emfprofile.application.registry.ui.views.filters.AppliedStereotypesOfSelectedEObjectViewerFilter;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 * 
 */
public final class DecoratableEditorPartListener implements IPartListener {

	private Map<IWorkbenchPart, ResourceSet> editorPartToResourceSetMap = new HashMap<>();
	private IEditorPart lastActiveEditorPart = null;
	private IWorkbenchPart cleaningUpForEditorPart = null;
	private TreeViewer viewer = null;
	private ToolbarCommandEnabledState toolbarCommandEnabeldStateService = null;

	private Map<IWorkbenchPart, ViewerState> editorPartToViewerStateMap = new HashMap<>();

	private AppliedStereotypesOfSelectedEObjectViewerFilter viewerFilter = new AppliedStereotypesOfSelectedEObjectViewerFilter();
	private boolean viewerFilterActivated = false;

	public boolean isViewerFilterActivated() {
		return viewerFilterActivated;
	}

	private ActiveDecoratableEditorSelectionListener editorSelectionListener = null;

	private boolean cleaningUpForClosedEditor = false;

	// Retrieve the corresponding Services
	IHandlerService handlerService = (IHandlerService) PlatformUI
			.getWorkbench().getService(IHandlerService.class);
	ICommandService commandService = (ICommandService) PlatformUI
			.getWorkbench().getService(ICommandService.class);

	// Retrieve commands
	Command unloadCmd = commandService
			.getCommand(UnloadProfileApplicationHandler.COMMAND_ID);
	private IWorkbenchPage activePage;

	/**
	 * Constructor
	 * 
	 * @param viewer
	 */
	public DecoratableEditorPartListener(TreeViewer viewer) {
		super();
		this.viewer = viewer;
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		if (window == null)
			throw new RuntimeException(
					"could not locate workbench active window!");

		// Get the source provider service
		ISourceProviderService sourceProviderService = (ISourceProviderService) window
				.getService(ISourceProviderService.class);
		// Now get the service for enabling/disabling menu commands in viewer
		// toolbar
		toolbarCommandEnabeldStateService = (ToolbarCommandEnabledState) sourceProviderService
				.getSourceProvider(ToolbarCommandEnabledState.MY_STATE);
		activePage = window.getActivePage();
		if (activePage == null)
			throw new RuntimeException(
					"could not locate active page for active window ");

		// getting the value of the viewer command for activating/deactivating
		// viewer tree filter
		ICommandService commandService = (ICommandService) PlatformUI
				.getWorkbench().getService(ICommandService.class);
		Command cmdActivateViewerFilter = commandService
				.getCommand(StereotypeApplicationsOnSelectedElementHandler.COMMAND_ID);
		editorSelectionListener = new ActiveDecoratableEditorSelectionListener(
				viewerFilter);
		setActivateViewFilter((Boolean) cmdActivateViewerFilter.getState(
				RegistryToggleState.STATE_ID).getValue());

		// When the plug-in starts, we should check if there is an active editor
		// and if it can be decorated
		IEditorPart editorPart = activePage.getActiveEditor();
		IEditorPart lastActiveEditorPart = null;
		if (editorPart != null) {
			if (ProfileApplicationRegistry.INSTANCE
					.hasProfileApplicationDecoratorForEditorId(ProfileApplicationConstantsAndUtil
							.getEditorIdFromEditorPart(editorPart))) {

				lastActiveEditorPart = editorPart;
				setViewerInputAndTrackEditorPart(editorPart);
				toolbarCommandEnabeldStateService.setEnabled(true);

			}
		}

		this.lastActiveEditorPart = lastActiveEditorPart;
	}

	private void setViewerInputAndTrackEditorPart(IEditorPart editorPart) {
		// get the resource set of the editor and put it into map for
		// tracking editors that can be decorated
		ResourceSet editorResourceSet = ProfileApplicationConstantsAndUtil
				.getResourceSet(editorPart);
		editorPartToResourceSetMap.put(editorPart, editorResourceSet);
		viewer.setInput(ProfileApplicationRegistry.INSTANCE
				.getProfileApplicationManager(editorResourceSet));
		viewer.setAutoExpandLevel(TreeViewer.ALL_LEVELS);
	}

	/**
	 * Called by {@link StereotypeApplicationsOnSelectedElementHandler}
	 * 
	 * @param activateFilter
	 *            <code>true</code> or <code>false</code>
	 */
	public void setActivateViewFilter(boolean activateFilter) {
		this.viewerFilterActivated = activateFilter;
		if (activateFilter) {
			viewer.addFilter(viewerFilter);
			activePage.addSelectionListener(editorSelectionListener);
		} else {
			viewer.removeFilter(viewerFilter);
			activePage.removeSelectionListener(editorSelectionListener);
		}
		viewer.expandToLevel(2);
	}

	@Override
	public void partOpened(IWorkbenchPart part) {
		// ignore
	}

	@Override
	public void partDeactivated(IWorkbenchPart part) {
		// ignore
	}

	@Override
	public void partClosed(IWorkbenchPart part) {
		// check if this part was registered in the map
		if (editorPartToResourceSetMap.containsKey(part)) {
			if (part.equals(lastActiveEditorPart)) {
				setLastActiveEditorPart(null);
				try {
					viewer.setInput(Collections.emptyList());
				} catch (IllegalStateException e) {
					// viewer control is null or disposed
				}
			}
			cleaningUpForClosedEditor = true;
			cleanUp(part);
			cleaningUpForClosedEditor = false;
			editorPartToViewerStateMap.remove(part);
			editorPartToResourceSetMap.remove(part);
		}
	}

	@Override
	public void partBroughtToTop(IWorkbenchPart part) {
		// ignore
	}

	@Override
	public void partActivated(IWorkbenchPart part) {
		if (ProfileApplicationRegistry.INSTANCE
				.hasProfileApplicationDecoratorForEditorId(ProfileApplicationConstantsAndUtil
						.getEditorIdFromEditorPart(part))) {
			if (editorPartToResourceSetMap.containsKey(part)) {
				// editor part is already known.
				// it is possible that the user was clicking around at view
				// parts so, check if last active editor part was this one.
				// if it was then no input model change on viewer is needed.
				if (!part.equals(lastActiveEditorPart)) {
					// Restore viewer state and save the viewer state of last
					// active editor part
					// if last active editor part is not null then save it
					if (lastActiveEditorPart != null) {
						editorPartToViewerStateMap.put(lastActiveEditorPart,
								new ViewerState(viewer));
					}
					// restore viewer part for already known part
					editorPartToViewerStateMap.get(part)
							.restoreTreeViewerState(viewer);
					// remove viewer state from map for this part
					editorPartToViewerStateMap.remove(part);
				}
			} else {
				// editor part first time accessed or editor opened with double
				// click on resource file,
				
				// Here we need to save last active editor part viewer state if
				// it was not null and clear the view
				if (lastActiveEditorPart != null) {
					// save last active editor part viewer state
					editorPartToViewerStateMap.put(lastActiveEditorPart,
							new ViewerState(viewer));
					viewer.setInput(Collections.emptyList());
				}
				setViewerInputAndTrackEditorPart((IEditorPart)part);
			}
			setLastActiveEditorPart((IEditorPart) part);

		} else {
			// if unsupported editor part was activated clear the view
			if (part instanceof IEditorPart) {
				// unset last active editor part if it is not already
				if (lastActiveEditorPart != null) {
					// save last active editor part viewer state
					editorPartToViewerStateMap.put(lastActiveEditorPart,
							new ViewerState(viewer));
					setLastActiveEditorPart(null);
					viewer.setInput(Collections.emptyList());
				}
			}
		}
	}

	private void setLastActiveEditorPart(IEditorPart editorPart) {
		activePage.removeSelectionListener(editorSelectionListener);
		lastActiveEditorPart = editorPart;
		if (lastActiveEditorPart == null) {
			toolbarCommandEnabeldStateService.setEnabled(false);
		} else {
			toolbarCommandEnabeldStateService.setEnabled(true);
			if (viewerFilterActivated)
				activePage.addSelectionListener(editorSelectionListener);
		}
	}

	public IEditorPart getLastActiveEditorPart() {
		return this.lastActiveEditorPart;
	}

	/**
	 * It is needed when the decorations need to be refreshed. The
	 * {@link #cleanUp(IWorkbenchPart)} sets the reference of editor part at the
	 * beginning of clean up and unsets it at the end.
	 * 
	 * @return
	 */
	// TODO look into this after the implementation of notifications for
	// decorations, then this is maybe not needed
	public IWorkbenchPart getCleaningUpForEditorPart() {
		return cleaningUpForEditorPart;
	}

	public void cleanUpForAllEditorParts() {
		for (IWorkbenchPart editorPart : editorPartToResourceSetMap.keySet()) {
			cleanUp(editorPart);
		}
		editorPartToResourceSetMap.clear();
		editorPartToViewerStateMap.clear();
	}

	// TODO look into cleanUp method after you have implemented decorations in
	// registry with usage of notification. Probably you wont need some things
	// of logic in this method
	private void cleanUp(IWorkbenchPart editorPart) {
		cleaningUpForEditorPart = editorPart;
		ExecutionEvent executionEvent;
		ResourceSet resourceSet = editorPartToResourceSetMap
				.get((IEditorPart) editorPart);
		Collection<ProfileApplicationWrapper> profileApplications = new ArrayList<>(
				ProfileApplicationRegistry.INSTANCE
						.getProfileApplicationManager(resourceSet)
						.getProfileApplications());
		for (ProfileApplicationWrapper profileApplication : profileApplications) {
			// Create an ExecutionEvent and specify the profile application
			// associated
			executionEvent = handlerService.createExecutionEvent(unloadCmd,
					new Event());
			((IEvaluationContext) executionEvent.getApplicationContext())
					.addVariable(ISources.ACTIVE_CURRENT_SELECTION_NAME,
							new StructuredSelection(profileApplication));

			// Launch the command
			try {
				unloadCmd.executeWithChecks(executionEvent);
			} catch (ExecutionException | NotDefinedException
					| NotEnabledException | NotHandledException e) {
				System.err
						.println("Calling unload command throwed following exception: "
								+ e.getMessage());
				// e.printStackTrace();
			}
		}
		try {
			ProfileApplicationRegistry.INSTANCE.getProfileApplicationManager(
					resourceSet).dispose();
		} catch (IllegalArgumentException e) {
			EMFProfileApplicationRegistryUIPlugin.getPlugin().log(
					new Status(IStatus.WARNING,
							EMFProfileApplicationRegistryUIPlugin.PLUGIN_ID, e
									.getMessage()));
		}
		cleaningUpForEditorPart = null;
	}

	public boolean isCleaningUpForClosedEditorPart() {
		return cleaningUpForClosedEditor;
	}

	public ResourceSet getResourceSetOfDecoratableActiveEditor() {
		return editorPartToResourceSetMap.get(getLastActiveEditorPart());
	}
}
