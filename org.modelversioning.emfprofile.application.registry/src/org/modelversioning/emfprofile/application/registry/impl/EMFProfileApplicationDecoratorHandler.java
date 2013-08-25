/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator;

/**
 * This is a handler which looks in platform's extension registry for
 * {@link EMFProfileApplicationDecorator} extension points and manages a map of
 * editor part id to decorators that can decorate the elements of that editor.
 * Concrete implementations of {@link EMFProfileApplicationDecorator} interface
 * are provided by decorator extension point plug-ins.
 * 
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 * 
 */
public class EMFProfileApplicationDecoratorHandler {

	public static final String DECORATOR_ID = "org.modelversioning.emfprofile.application.registry.extensionpoint.decorator";

	/** editor part id, decorators that support it */
	private Map<String, Collection<EMFProfileApplicationDecorator>> decorators = new HashMap<>();

	EMFProfileApplicationDecoratorHandler() {
		IConfigurationElement[] config = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(DECORATOR_ID);

		for (IConfigurationElement e : config) {
			Object o = null;
			try {
				o = e.createExecutableExtension("class");
			} catch (CoreException e2) {
				e2.printStackTrace();
			}
			if (o != null) {
				EMFProfileApplicationDecorator decorator = (EMFProfileApplicationDecorator) o;
				Collection<String> supportedEditorIDs = null;
				try {
					supportedEditorIDs = decorator
							.canDecorateEditorsWithFollowingIDs();
					for (String id : supportedEditorIDs) {
						if (!decorators.containsKey(id)) {
							decorators
									.put(id,
											new ArrayList<EMFProfileApplicationDecorator>());
						}
						decorators.get(id).add(decorator);
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
		
		System.out.println("\nDecorators for following editor ids found: ");
		for (String editorId : decorators.keySet()) {
			System.out.println(editorId);
		}
		System.out.println("-------------------------");
	}

	public boolean hasDecoratorForPartId(String partId) {
		return decorators.containsKey(partId);
	}

	public EMFProfileApplicationDecorator getDecoratorForEditorId(
			String editorId) {
		return decorators.get(editorId).iterator().next();
	}

}
