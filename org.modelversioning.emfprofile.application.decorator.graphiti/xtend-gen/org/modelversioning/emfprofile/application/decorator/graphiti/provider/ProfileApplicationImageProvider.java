package org.modelversioning.emfprofile.application.decorator.graphiti.provider;

import org.eclipse.graphiti.ui.platform.AbstractImageProvider;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.modelversioning.emfprofile.application.decorator.graphiti.plugin.EMFProfilesApplicationDeocoratorForGraphitiEditorPlugin;

@SuppressWarnings("all")
public class ProfileApplicationImageProvider extends AbstractImageProvider {
  public final static String ID = "org.modelversioning.emfprofile.application.decorator.graphiti.provider.ProfileApplicationImageProvider";
  
  private final static String ROOT_FOLDER_FOR_IMG = "icons/";
  
  public final static String TOKEN_IMAGE_ID = "TOKEN_IMAGE_ID";
  
  public ProfileApplicationImageProvider() {
    super();
    this.setPluginId(EMFProfilesApplicationDeocoratorForGraphitiEditorPlugin.PLUGIN_ID);
  }
  
  protected void addAvailableImages() {
    InputOutput.<String>println("ProfileApplicationImageProvider ADDING AVAILABLE IMAGES!!!!");
    String _plus = (ProfileApplicationImageProvider.ROOT_FOLDER_FOR_IMG + "token.gif");
    this.addImageFilePath(ProfileApplicationImageProvider.TOKEN_IMAGE_ID, _plus);
  }
}
