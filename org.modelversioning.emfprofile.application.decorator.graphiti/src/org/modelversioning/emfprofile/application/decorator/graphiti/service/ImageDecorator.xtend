package org.modelversioning.emfprofile.application.decorator.graphiti.service

import org.eclipse.graphiti.platform.IPlatformImageConstants
import org.modelversioning.emfprofile.application.decorator.graphiti.service.util.DecoratorUtil
import org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration
import org.modelversioning.emfprofileapplication.StereotypeApplication

/**
 * This is not going to work because graphiti uses image providers where we need to specify
 * relative path to images inside this plug-in. Really stupid.
 * Because of this it is not possible to use URI, which we get from decoration description,
 * to use images from profile plug-ins.   
 */
class ImageDecorator extends org.eclipse.graphiti.tb.ImageDecorator {
	
	new (ImageDecoration imageDecoration, StereotypeApplication stereotypeApplication, String imageId){
		// this is just to demonstrate how we can use our own Image Provider although in our scenario it doesn't help much.
		// well, great! Now I see we have to amend plugin.xml file of the target editor to specify the id of our image provider so that it can be used. Splendid.
//		super(ProfileApplicationImageProvider::TOKEN_IMAGE_ID)
		super(IPlatformImageConstants.IMG_ECLIPSE_INFORMATION)

		setMessage(DecoratorUtil::provideText(imageDecoration.tooltip, stereotypeApplication))
	}
}