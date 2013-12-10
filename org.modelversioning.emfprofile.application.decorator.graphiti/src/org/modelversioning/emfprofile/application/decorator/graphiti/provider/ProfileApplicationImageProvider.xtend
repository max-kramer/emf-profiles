package org.modelversioning.emfprofile.application.decorator.graphiti.provider

import org.eclipse.graphiti.ui.platform.AbstractImageProvider
import org.modelversioning.emfprofile.application.decorator.graphiti.plugin.EMFProfilesApplicationDeocoratorForGraphitiEditorPlugin

class ProfileApplicationImageProvider extends AbstractImageProvider {
	
	public final static String ID = "org.modelversioning.emfprofile.application.decorator.graphiti.provider.ProfileApplicationImageProvider";
	
	private static final String ROOT_FOLDER_FOR_IMG = "icons/"
	public static final String TOKEN_IMAGE_ID = "TOKEN_IMAGE_ID"
	
	new() {
		super()
		setPluginId(EMFProfilesApplicationDeocoratorForGraphitiEditorPlugin.PLUGIN_ID);
	}
	
	override protected addAvailableImages() {
		println("ProfileApplicationImageProvider ADDING AVAILABLE IMAGES!!!!")
		addImageFilePath(ProfileApplicationImageProvider.TOKEN_IMAGE_ID, ROOT_FOLDER_FOR_IMG + "token.gif")
	}
	
}