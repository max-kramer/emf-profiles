package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service

import com.google.common.collect.Maps
import java.net.URL
import java.util.Map
import org.eclipse.draw2d.FlowLayout
import org.eclipse.draw2d.Label
import org.eclipse.emf.common.util.URI
import org.eclipse.gef.editparts.AbstractConnectionEditPart
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.Decoration
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.swt.graphics.Image
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.ComplexText
import org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.SimpleText
import org.modelversioning.emfprofile.decoration.decorationLanguage.Text
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ImageDecorationImpl
import org.modelversioning.emfprofileapplication.StereotypeApplication
import org.eclipse.draw2d.MarginBorder
import org.eclipse.draw2d.LineBorder
import org.eclipse.draw2d.ColorConstants
import org.eclipse.draw2d.Graphics

class ImageDecorator extends AbstractManyDecorationsDecorator {

	public static val String KEY = "PROFILE_APPLICATION_IMAGE_DECORATION"

	new(IDecoratorTarget decoratorTarget) {
		super(decoratorTarget)
	}

	// THE REGISTRY FOR IMAGES
	public static val Map<URI, Image> imageRegistry = Maps.newHashMap

	def getIcon(String uri) {
		val URI imageURI = URI.createURI(uri)
		if (imageRegistry.containsKey(imageURI))
			return imageRegistry.get(imageURI)
		val ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL(new URL(imageURI.toString()));
		val Image image = imageDescriptor.createImage
		imageRegistry.put(imageURI, image)
		return image
	}
	
	override processAddDecoration(GraphicalDecoration graphicalDecoration) {
		if(targetEditPart instanceof LabelEditPart)
			return null
		val imageDecoration = graphicalDecoration.decoration as ImageDecoration 
		
//		println('''IMAGE TOOLTIP: «getText(imageDecoration.tooltip, graphicalDecoration.stereotypeApplication)»''')
		
		val Image image = getIcon(imageDecoration.location_uri)
		if(targetEditPart instanceof AbstractConnectionEditPart){
			val marginValue = if(imageDecoration.margin != null) {providePercentageValue(imageDecoration.margin.value)} else {50}
			val decoration = addConnectionDecoration(image, marginValue, false)
			if(imageDecoration.tooltip != null)
				return setTooltip(decoration, getText(imageDecoration.tooltip, graphicalDecoration.stereotypeApplication), image)
			return decoration
		}else {
			val marginValue = if(imageDecoration.margin != null) {imageDecoration.margin.value} else {-1}
			val decoration = addShapeDecoration(image, provideDirection(imageDecoration.direction), marginValue, false)
			if(imageDecoration.tooltip != null)
				return setTooltip(decoration, getText(imageDecoration.tooltip, graphicalDecoration.stereotypeApplication), image)
			return decoration
		}
	}
	
	override getDecorationType() {
		return ImageDecorationImpl
	}
	
	override processRemoveDecoration(Decoration decoration) {
		decoratorTarget.removeDecoration(decoration)
	}
	
	def setTooltip(Decoration decoration, String text, Image image){
//			val Label toolTip = new Label();
//			toolTip.setBorder(new LineBorder(ColorConstants.cyan, 2, Graphics.LINE_DASH))
//			val FlowLayout fl = new FlowLayout(false);
//			fl.setMinorSpacing(0);
//			toolTip.setLayoutManager(fl);
			val label = new Label(text, image)
			label.setBorder(new MarginBorder(3))
//			toolTip.add(label);
			decoration.setToolTip(label);
			decoration
	}
	
	def String getText(Text text, StereotypeApplication stereotypeApplication){
		switch text {
			SimpleText: {
				if(text.attribute != null){
					val attribute = stereotypeApplication.eClass.EAllAttributes.findFirst[name == text.attribute.name]
					return String.valueOf(stereotypeApplication.eGet(attribute));
				}else{
					return text.text
				}
			}
			ComplexText: {
				return getText(text.left, stereotypeApplication) + getText(text.right, stereotypeApplication);
			}
			default:
				return ""
			
		}
	}
}
