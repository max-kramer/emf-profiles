package org.modelversioning.emfprofile.application.decorator.graphiti.service;

import org.eclipse.graphiti.platform.IPlatformImageConstants;
import org.modelversioning.emfprofile.application.decorator.graphiti.service.util.DecoratorUtil;
import org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Text;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * This is not going to work because graphiti uses image providers where we need to specify
 * relative path to images inside this plug-in. Really stupid.
 * Because of this it is not possible to use URI, which we get from decoration description,
 * to use images from profile plug-ins.
 */
@SuppressWarnings("all")
public class ImageDecorator extends org.eclipse.graphiti.tb.ImageDecorator {
  public ImageDecorator(final ImageDecoration imageDecoration, final StereotypeApplication stereotypeApplication, final String imageId) {
    super(IPlatformImageConstants.IMG_ECLIPSE_ERROR);
    Text _tooltip = imageDecoration.getTooltip();
    String _provideText = DecoratorUtil.provideText(_tooltip, stereotypeApplication);
    this.setMessage(_provideText);
  }
}
