package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service

import org.eclipse.draw2d.Label
import org.eclipse.draw2d.MarginBorder
import org.eclipse.gef.editparts.AbstractConnectionEditPart
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.Decoration
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget
import org.eclipse.swt.graphics.Image
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ImageDecorationImpl

class ImageDecorator extends AbstractManyDecorationsDecorator {

	public static val String KEY = "PROFILE_APPLICATION_IMAGE_DECORATION"

	new(IDecoratorTarget decoratorTarget) {
		super(decoratorTarget)
	}

	override processAddDecoration(GraphicalDecoration graphicalDecoration) {
		if(targetEditPart instanceof LabelEditPart)
			return null
		val imageDecoration = graphicalDecoration.decoration as ImageDecoration 
		
//		println('''IMAGE TOOLTIP: «getText(imageDecoration.tooltip, graphicalDecoration.stereotypeApplication)»''')
		var Decoration decoration
		val Image image = getIcon(imageDecoration.location_uri)
		if(targetEditPart instanceof AbstractConnectionEditPart){
			val marginValue = if(imageDecoration.margin != null) {providePercentageValue(imageDecoration.margin.value)} else {50}
			decoration = addConnectionDecoration(image, marginValue, false)
			if(imageDecoration.tooltip != null)
				decoration = setTooltip(decoration, getText(imageDecoration.tooltip, graphicalDecoration.stereotypeApplication), image)
		}else {
			val marginValue = if(imageDecoration.margin != null) {imageDecoration.margin.value} else {-1}
			decoration = addShapeDecoration(image, provideDirection(imageDecoration.direction), marginValue, false)
			if(imageDecoration.tooltip != null)
				decoration = setTooltip(decoration, getText(imageDecoration.tooltip, graphicalDecoration.stereotypeApplication), image)
		}
		return decoration
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
	
}
