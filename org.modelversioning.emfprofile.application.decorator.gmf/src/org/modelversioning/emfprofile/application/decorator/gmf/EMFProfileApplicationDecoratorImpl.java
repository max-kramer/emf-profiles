/**
 * Copyright (c) 2012 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.decorator.gmf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecorator;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a> (initial API and
 *         implementation)
 * @author <a href="mailto:langer@big.tuwien.ac.at">Philip Langer</a>
 *         (generalization to support all GMF-based editors)
 * 
 */
public class EMFProfileApplicationDecoratorImpl extends MinimalEObjectImpl
		implements EMFProfileApplicationDecorator {

	private final List<String> decorateableEditors = new ArrayList<String>();

	/** {@link EObject} to {@link IDecorator} map. */
	private static Map<EObject, IDecorator> eObjectToDecoratorMap = new HashMap<EObject, IDecorator>();


	/**
	 * default constructor
	 */
	public EMFProfileApplicationDecoratorImpl() {
		obtainRegisteredGMFEditors();
	}

	private void obtainRegisteredGMFEditors() {
		IConfigurationElement[] config = Platform.getExtensionRegistry()
				.getConfigurationElementsFor("org.eclipse.ui.editors"); //$NON-NLS-1$
		for (IConfigurationElement e : config) {
			if (declaresGMFBasedEditor(e)) {
				String editorID = e.getAttribute("id"); //$NON-NLS-1$
				if (editorID != null)
					decorateableEditors.add(editorID);
			}
		}
	}

	private boolean declaresGMFBasedEditor(IConfigurationElement e) {
		String simpleIdentifier = e.getDeclaringExtension()
				.getSimpleIdentifier();
		return "gmf-editor".equals(simpleIdentifier); //$NON-NLS-1$
	}


	@Override
	public Collection<String> canDecorateEditorsWithFollowingIDs() {
		return Collections.unmodifiableCollection(decorateableEditors);
	}

	public static void registerDecoratorForEObject(EObject eObject,
			IDecorator decorator) {
		EMFProfileApplicationDecoratorImpl.eObjectToDecoratorMap.put(eObject,
				decorator);
	}

	public static void unregisterDecoratorForEObject(EObject eObject) {
		EMFProfileApplicationDecoratorImpl.eObjectToDecoratorMap
				.remove(eObject);
	}

//	@Override
//	public void decorate(StereotypeApplication stereotypeApplication) {
////		System.out.println("GMF deco SA: " + stereotypeApplication);
//		// TODO provide decorate implementation
//		System.out.println("GMF Decorating EObject: "
//				+ stereotypeApplication.getAppliedTo().getClass().getName()
//				+ ", with stereotype: "
//				+ stereotypeApplication.getStereotype().getName());
//	}
//
//	@Override
//	public void undecorate(StereotypeApplication stereotypeApplication) {
////		System.out.println("GMF undeco SA: " + stereotypeApplication);
//		// TODO provide undecorate implementation
//		System.out.println("GMF UNdecorating EObject: "
//				+ stereotypeApplication.getAppliedTo().getClass().getName()
//				+ ", for stereotype: "
//				+ stereotypeApplication.getStereotype().getName());
//	}

	@Override
	public EObject resolveEObjectFromEditorSelection(Object selection) {
		if (selection == null)
			return null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			EditPart editPart = (EditPart) structuredSelection
					.getFirstElement();
			Object model = editPart.getModel();
			if (model instanceof Node) {
				Node node = (Node) model;
				EObject selectedEObject = node.getElement();
				return selectedEObject;
			}
		} else if (selection instanceof EditPart) {
			EditPart editPart = (EditPart) selection;
			Object model = editPart.getModel();
			if (model instanceof Node) {
				Node node = (Node) model;
				EObject selectedEObject = node.getElement();
				return selectedEObject;
			}
		}
		return null;
	}

	@Override
	public void decorate(GraphicalDecorationDescription decorationDescription) {
//	System.out.println("GMF deco SA: " + stereotypeApplication);
	// TODO provide decorate implementation
	System.out.println("GMF Decorating EObject: "
			+ decorationDescription.getStereotypeApplication().getAppliedTo().getClass().getName()
			+ ", with stereotype: "
			+ decorationDescription.getStereotypeApplication().getStereotype().getName());

	}

	// @Override
	// public void decorate(EObject eObject, List<Image> images,
	// List<String> toolTipTexts) {
	// if (eObject == null || images == null || toolTipTexts == null)
	// throw new IllegalArgumentException(
	// "Parametrs can not have null value.");
	// if (EMFProfileApplicationDecoratorImpl.eObjectToDecoratorMap
	// .containsKey(eObject)) {
	// EMFProfileDecorator decorator = (EMFProfileDecorator)
	// EMFProfileApplicationDecoratorImpl.eObjectToDecoratorMap
	// .get(eObject);
	// decorator.refresh(images, toolTipTexts);
	// }
	// }
}
