/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.decoration;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 * 
 */
class DecorationLanguageResourceChangeListener implements
		IResourceChangeListener {
	private final DecorationDescriptionsReader reader;

	public DecorationLanguageResourceChangeListener(
			DecorationDescriptionsReader reader) {
		this.reader = reader;
		listenToResourceChanges();
	}

	public void resourceChanged(IResourceChangeEvent event) {
		// we are only interested in POST_CHANGE events
		if (event.getType() != IResourceChangeEvent.POST_CHANGE)
			return;
		IResourceDelta rootDelta = event.getDelta();
		// get the delta, if any, for the decoration descriptions resource
		IResourceDelta resourceDelta = rootDelta.findMember(reader
				.getDecorationDescriptionsIFile().getFullPath());
		if (resourceDelta == null)
			return;

		// interested in changed or deleted resource events
		if(resourceDelta.getKind() == IResourceDelta.CHANGED){
			if ((resourceDelta.getFlags() & IResourceDelta.CONTENT) != 0){
				System.out.println("RESOURCE CHANGED: " + reader.getDecorationDescriptionsIFile().getLocation().toString());
				reader.reloadResource();
			}
		} else if (resourceDelta.getKind() == IResourceDelta.REMOVED){
			stopListeningToResourceChanges();
			System.out.println("RESOURCE REMOVED: " + reader.getDecorationDescriptionsIFile().getLocation().toString());
			reader.resourceRemoved();
		}
	}

	private void listenToResourceChanges() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}

	private void stopListeningToResourceChanges() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
	}

	public void dispose() {
		stopListeningToResourceChanges();
	}
}