package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service

import com.google.common.collect.Maps
import java.net.URL
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.gef.editparts.AbstractConnectionEditPart
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.Decoration
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.swt.graphics.Image
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.IconDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.IconDecorationImpl

class IconDecorator extends AbstractManyDecorationsDecorator {

	public static val String KEY = "PROFILE_APPLICATION_ICON_DECORATION"

	new(IDecoratorTarget decoratorTarget) {
		super(decoratorTarget)
	}

	// THE REGISTRY FOR IMAGES
	public static val Map<URI, Image> imageRegistry = Maps.newHashMap

	def getIcon(String uri) {
		val URI iconURI = URI.createURI(uri)
		if (imageRegistry.containsKey(iconURI))
			return imageRegistry.get(iconURI)
		val ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL(new URL(iconURI.toString()));
		val Image image = imageDescriptor.createImage
		imageRegistry.put(iconURI, image)
		return image
	}
	
	override processAddDecoration(AbstractDecoration decoration) {
		if(targetEditPart instanceof LabelEditPart)
			return null
		val iconDecoration = decoration as IconDecoration 
		val Image icon = getIcon(iconDecoration.location_uri)
		if(targetEditPart instanceof AbstractConnectionEditPart){
			addConnectionDecoration(icon, 50, false)
		}else {
			addShapeDecoration(icon, IDecoratorTarget.Direction.NORTH_EAST, -1, false)
		}
	}
	
	override getDecorationType() {
		return IconDecorationImpl
	}
	
	override processRemoveDecoration(Decoration decoration) {
		decoratorTarget.removeDecoration(decoration)
	}
	
}
