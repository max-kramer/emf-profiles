/**
 * Copyright (c) 2012 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.ui.observer;

import java.util.Collections;

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

	/**
	 * Every editor of interest will be mapped here in order to easily access
	 * its resource set and to know if editor parts were just out of focus or
	 * newly opened when editor parts are activated
	 */
	// private Map<IWorkbenchPart, ResourceSet> editorPartToResourceSetMap = new
	// HashMap<>();
	// private Map<IWorkbenchPart, ViewerState> editorPartToViewerStateMap = new
	// HashMap<>();

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

	// public IEditorPart getLastActiveEditorPart() {
	// return decoratableEditorPartListener.getLastActiveEditPart();
	// }

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
				if (viewer.getInput().equals(Collections.emptyList())) {
					viewer.setInput(ProfileApplicationRegistry.INSTANCE
							.getProfileApplicationManager(
									decoratableEditorPartListener
											.getResourceSetOfDecoratableActiveEditor()));
//											.getProfileApplications());
				} else {
					viewer.refresh();
					viewer.expandToLevel(2);
				}

			}
		});
	}

	// /**
	// * Collection can be provided as parameter. Refresh will be executed
	// * asynchronously for whole group of collection items in one runnable.
	// *
	// * @param object
	// * an viewer tree element or a collection of them.
	// */
	// public void refreshViewer(final Object object) {
	// if (viewer == null || viewer.getTree().isDisposed())
	// return;
	// viewer.getTree().getDisplay().asyncExec(new Runnable() {
	//
	// @Override
	// public void run() {
	// if (object instanceof Collection<?>) {
	// Iterator<?> iterator = ((Collection<?>) object).iterator();
	// while (iterator.hasNext())
	// viewer.refresh(iterator.next());
	// } else {
	// viewer.refresh(object);
	// }
	// viewer.expandToLevel(2);
	// }
	// });
	//
	// }

	// /**
	// * Updates the element of the viewer.
	// *
	// * @param element
	// * of the tree in question.
	// */
	// public void updateViewer(final Object element) {
	// if (viewer == null || viewer.getTree().isDisposed())
	// return;
	// viewer.getTree().getDisplay().asyncExec(new Runnable() {
	//
	// @Override
	// public void run() {
	// viewer.update(element, null);
	// }
	// });
	// }

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

	public void revealElement(final Object element) {
		if (viewer == null || viewer.getTree().isDisposed())
			return;
		viewer.getTree().getDisplay().asyncExec(new Runnable() {

			@Override
			public void run() {
				viewer.reveal(element);
			}
		});
	}

	// public ResourceSet getResourceSetOfEditorPart(IEditorPart editorPart) {
	// return editorPartToResourceSetMap.get(editorPart);
	// }

//	/**
//	 * {@inheritDoc}
//	 */
//	@Override
//	public void applyStereotype(final EObject eObject) {
//		Assert.isNotNull(eObject);
//		// we are looking in all loaded profiles if there are any stereotypes
//		// applicable on eObject
//		final Map<ProfileApplicationWrapper, Collection<StereotypeApplicability>> profileToStereotypeApplicabilityForEObjectMap = new HashMap<>();
//		for (ProfileApplicationWrapper profileApplication : ProfileApplicationRegistry.INSTANCE
//				.getProfileApplicationManager(
//						decoratableEditorPartListener
//										.getResourceSetOfActiveEditor())
//				.getProfileApplications()) {
//			profileToStereotypeApplicabilityForEObjectMap.put(
//					profileApplication,
//					(Collection<StereotypeApplicability>) profileApplication
//							.getApplicableStereotypes(eObject));
//		}
//		boolean mayApplyStereotype = false;
//		for (Collection<?> stereotypesApplicabilities : profileToStereotypeApplicabilityForEObjectMap
//				.values()) {
//			if (!stereotypesApplicabilities.isEmpty()) {
//				mayApplyStereotype = true;
//				break;
//			}
//		}
//		if (mayApplyStereotype) {
//			ApplyStereotypeToEObjectDialog applySteretypeDialog = new ApplyStereotypeToEObjectDialog(
//					profileToStereotypeApplicabilityForEObjectMap);
//			applySteretypeDialog.openApplyStereotypeDialog(eObject);
//		} else {
//			MessageDialog.openInformation(viewer.getControl().getShell(),
//					"Info", "Can not apply any stereotype to EObject: "
//							+ eObject.toString());
//		}
//	}


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

	// private void showError(String message, Throwable throwable) {
	// ErrorDialog.openError(PlatformUI.getWorkbench()
	// .getActiveWorkbenchWindow().getShell(), "Error Occured",
	// message, new Status(IStatus.ERROR,
	// EMFProfileApplicationRegistryUIPlugin.PLUGIN_ID,
	// throwable.getMessage(), throwable));
	// }
	//
	// /**
	// * It calls the {@link #refreshDecoration(EObject)} for each {@link
	// EObject}
	// * . </br> <b>Note:</b> This method can be used to refresh decorations
	// when
	// * loading or unloading profile applications.
	// *
	// * @param eObjects
	// * collection of {@link EObject}s for which decorations must be
	// * refreshed.
	// */
	// public void refreshDecorations(Collection<EObject> eObjects) {
	// for (EObject eObject : eObjects) {
	// refreshDecoration(eObject);
	// }
	// }
	//
	//
	// /**
	// * The method collects all stereotypes applied to <code>eObject</code>
	// from
	// * profile applications that can be found for this model in
	// * {@link ProfileApplicationRegistry} and then informs active editor
	// * decorator to decorate the eObject.
	// *
	// * @param eObject
	// * that has stereotype applications
	// */
	// public void refreshDecoration(final EObject eObject) {
	//
	// final EMFProfileApplicationDecorator decorator;
	// if (decoratableEditorPartListener.getCleaningUpForEditorPart() != null) {
	// // if editor is disposed then there is no need to refresh
	// // decorations
	// if (decoratableEditorPartListener.isCleaningUpForClosedEditorPart()) {
	// return;
	// }
	// decorator = decoratorHandler
	// .getDecoratorForEditorPart(decoratableEditorPartListener
	// .getCleaningUpForEditorPart());
	// } else {
	// decorator = decoratorHandler
	// .getDecoratorForEditorPart(decoratableEditorPartListener
	// .getLastActiveEditPart());
	// }
	// final List<Image> images = new ArrayList<>();
	// final List<String> toolTipTexts = new ArrayList<>();
	// for (ProfileApplicationWrapper profileApplication :
	// ProfileApplicationRegistry.INSTANCE
	// .getProfileApplicationManager(
	// editorPartToResourceSetMap
	// .get(getLastActiveEditorPart()))
	// .getProfileApplications()) {
	// Collection<StereotypeApplication> stereotypeApplications =
	// profileApplication
	// .getStereotypeApplications(eObject);
	// for (StereotypeApplication stereotypeApplication :
	// stereotypeApplications) {
	// images.add(((ILabelProvider) viewer.getLabelProvider())
	// .getImage(stereotypeApplication));
	// toolTipTexts.add(getStereotypeLabel(stereotypeApplication));
	// }
	// }
	// PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
	// public void run() {
	// try {
	// TransactionalEditingDomain editingDomain = TransactionUtil
	// .getEditingDomain(eObject.eResource());
	// if (editingDomain != null) {
	// editingDomain.runExclusive(new Runnable() {
	// public void run() {
	// decorator.decorate(eObject, images,
	// toolTipTexts);
	// }
	// });
	// } else {
	// decorator.decorate(eObject, images, toolTipTexts);
	// }
	// } catch (Exception e) {
	// e.printStackTrace();
	// showError(
	// "Calling decorate method on decorator for editor id: "
	// + decoratableEditorPartListener
	// .getLastActiveEditPart().getSite()
	// .getId() + " throw an exception:",
	// e);
	// }
	// }
	// });
	// }
	//
	// /**
	// * Returns the tool tip text for the supplied
	// * <code>stereotypeApplication</code>.
	// *
	// * @param stereotypeApplication
	// * to get tool tip text for.
	// * @return the tool tip text.
	// */
	// private String getStereotypeLabel(
	// StereotypeApplication stereotypeApplication) {
	// if (stereotypeApplication.eClass() instanceof Stereotype) {
	//			return "<<" + ((Stereotype) stereotypeApplication.eClass()).getName() + ">>"; //$NON-NLS-1$ $NON-NLS-2$
	// }
	//		return "Stereotype application"; //$NON-NLS-1$
	// }
	//
	//
	//
	// /**
	// * This method will be called from
	// * {@link ProfileApplicationWrapperReflectiveItemProviderAdapterFactory}
	// * when notification is fired that an attribute is changed in properties
	// * view. Notifications will be fired for every change, but we are here
	// only
	// * interested in scenario when only one tree element is selected and we
	// can
	// * find profile application decorator from it, otherwise this method will
	// do
	// * nothing.
	// */
	// public void setProfileApplicationChanged() {
	// viewer.getTree().getDisplay().asyncExec(new Runnable() {
	// @Override
	// public void run() {
	// // we have to find current selection in the view tree,
	// // then traverse to profile application decorator
	// // and set it to dirty and update the view tree
	// ISelection selection = viewer.getSelection();
	// if (selection != null
	// && selection instanceof IStructuredSelection) {
	// if (((IStructuredSelection) selection).getFirstElement() instanceof
	// ProfileApplicationWrapper) {
	// ProfileApplicationWrapper profileApplication =
	// (ProfileApplicationWrapper) ((IStructuredSelection) selection)
	// .getFirstElement();
	// updateViewer(profileApplication);
	// } else {
	// EObject eObject = (EObject) ((IStructuredSelection) selection)
	// .getFirstElement();
	// if (eObject == null) // probably was deleted, so nothing
	// // to do
	// return;
	// ProfileApplicationWrapper profileApplication;
	// try {
	// profileApplication = findProfileApplicationWrapper(eObject);
	// if (profileApplication == null) // could not find
	// // it, do nothing
	// return;
	// updateViewer(profileApplication);
	// } catch (TraversingEObjectContainerChainException e) {
	// // e.getLastParentFound();
	// }
	// }
	// }
	// }
	// });
	//
	// }
	//
}
