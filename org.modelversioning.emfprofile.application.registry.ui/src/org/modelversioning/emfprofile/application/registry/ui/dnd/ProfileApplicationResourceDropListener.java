/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.ui.dnd;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerDropAdapter;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.TransferData;
import org.modelversioning.emfprofile.application.registry.ui.ProfileApplicationConstantsAndUtil;
import org.modelversioning.emfprofile.application.registry.ui.wizards.LoadProfileApplicationWizard;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 * 
 */
public class ProfileApplicationResourceDropListener extends ViewerDropAdapter {

	private final Viewer viewer;
	private final LoadProfileApplicationWizard loadProfileApplicationWizard = new LoadProfileApplicationWizard();

	/**
	 * @param viewer
	 */
	public ProfileApplicationResourceDropListener(Viewer viewer) {
		super(viewer);
		this.viewer = viewer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ViewerDropAdapter#performDrop(java.lang.Object)
	 */
	@Override
	public boolean performDrop(Object data) {
		String[] files = (String[]) data;
		boolean dropSuccessful = false;
		for (String fullPath : files) {
			if (fullPath
					.toLowerCase()
					.endsWith(
							ProfileApplicationConstantsAndUtil.EMF_PROFILE_APPLICATION_FILE_EXTENSION)) {
				boolean loadSuccessful = loadProfileApplicationWizard
						.loadProfileApplicationFile(ResourcesPlugin
								.getWorkspace().getRoot()
								.getFileForLocation(new Path(fullPath)));
				if (loadSuccessful && dropSuccessful == false)
					dropSuccessful = true;
			}
		}
		return dropSuccessful;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ViewerDropAdapter#validateDrop(java.lang.Object
	 * , int, org.eclipse.swt.dnd.TransferData)
	 */
	@Override
	public boolean validateDrop(Object target, int operation,
			TransferData transferType) {
		return FileTransfer.getInstance().isSupportedType(transferType);
	}

//	@Override
//	public void drop(DropTargetEvent event) {
//		int location = this.determineLocation(event);
//		String target = (String) determineTarget(event);
//		String translatedLocation = "";
//		switch (location) {
//		case 1:
//			translatedLocation = "Dropped before the target ";
//			break;
//		case 2:
//			translatedLocation = "Dropped after the target ";
//			break;
//		case 3:
//			translatedLocation = "Dropped on the target ";
//			break;
//		case 4:
//			translatedLocation = "Dropped into nothing ";
//			break;
//		}
//		System.out.println(translatedLocation);
//		System.out.println("The drop was done on the element: " + target);
//		super.drop(event);
//	}

}
