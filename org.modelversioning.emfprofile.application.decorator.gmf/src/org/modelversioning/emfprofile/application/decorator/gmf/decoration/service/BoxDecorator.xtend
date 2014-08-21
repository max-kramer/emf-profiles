package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service

import org.eclipse.draw2d.Label
import org.eclipse.draw2d.LineBorder
import org.eclipse.draw2d.MarginBorder
import org.eclipse.draw2d.PositionConstants
import org.eclipse.gef.editparts.AbstractConnectionEditPart
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.Decoration
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel
import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.Font
import org.eclipse.swt.graphics.Image
import org.modelversioning.emfprofile.application.decorator.gmf.plugin.EMFProfileApplicationGMFDecoratorPlugin
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.BoxImageOrientation
import org.modelversioning.emfprofile.decoration.decorationLanguage.Directions
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BoxDecorationImpl
import org.modelversioning.emfprofileapplication.StereotypeApplication

class BoxDecorator extends AbstractManyDecorationsDecorator {
	public static val String KEY = "PROFILE_APPLICATION_BOX_DECORATION"

	new(IDecoratorTarget decoratorTarget) {
		super(decoratorTarget)
	}
	
	override processAddDecoration(GraphicalDecoration graphicalDecoration) {
		if(targetEditPart instanceof LabelEditPart)
			return null
		val boxDecoration = graphicalDecoration.decoration as BoxDecoration 
		
		val WrappingLabel figure = getBoxFigure(boxDecoration, graphicalDecoration.stereotypeApplication)
		var Decoration decoration
		if(targetEditPart instanceof AbstractConnectionEditPart){
			val marginValue = if(boxDecoration.margin != null) {providePercentageValue(boxDecoration.margin.value)} else {50}
			decoration = addConnectionDecoration(figure, marginValue, false)
			if(boxDecoration.tooltip != null)
				decoration = setTooltip(decoration, getText(boxDecoration.tooltip, graphicalDecoration.stereotypeApplication), figure.icon)
			
		}else {
			val marginValue = if(boxDecoration.margin != null) {boxDecoration.margin.value} else {-1}
			decoration = addShapeDecoration(figure, provideDirection(boxDecoration.direction), marginValue, false)
			if(boxDecoration.tooltip != null)
				decoration = setTooltip(decoration, getText(boxDecoration.tooltip, graphicalDecoration.stereotypeApplication), figure.icon)
		}
		
		return decoration
	}
	
	def getBoxFigure(BoxDecoration decoration, StereotypeApplication stereotypeApplication) {
		var WrappingLabel figure 
		if(decoration.image != null) {
			figure = new WrappingLabelEx(getText(decoration.text, stereotypeApplication), getIcon(decoration.image.location_uri))
			setTextPlacement(figure, decoration.image.placement)
		} else {
			figure = new WrappingLabelEx(getText(decoration.text, stereotypeApplication))
		}
		figure.setTextWrap(true);
		
		if(decoration.foregroundColor != null) {
			figure.setForegroundColor(provideColor(decoration.foregroundColor))
		}
		if(decoration.backgroundColor != null) {
			figure.setOpaque(true)
			figure.setBackgroundColor(provideColor(decoration.backgroundColor))
		}
		if(decoration.border != null) {
			val size = if(decoration.border.size != null) decoration.border.size.value else 1;
			val color = provideColor(decoration.border.color)
			val style = provideStyle(decoration.border.style)
			figure.setBorder(new LineBorder(color,size,style))
		}
		setContentDirection(figure, decoration.contentDirection)
				
		figure.setSize(decoration.width, decoration.height)
		
		return figure
	}
	
	def setContentDirection(WrappingLabel label, Directions direction) {
		switch direction {
			case direction == Directions.NORTH_WEST : {
				label.setAlignment(EMFProfileApplicationGMFDecoratorPlugin.integerBinaryOr(PositionConstants.TOP, PositionConstants.LEFT))
			}
			case direction == Directions.NORTH : {
				label.setAlignment(PositionConstants.TOP)
			}
			case direction == Directions.NORTH_EAST : {
				label.setAlignment(EMFProfileApplicationGMFDecoratorPlugin.integerBinaryOr(PositionConstants.TOP, PositionConstants.RIGHT))
			}
			case direction == Directions.WEST : {
				label.setAlignment(PositionConstants.LEFT)
			}
			case direction == Directions.CENTER : {
				label.setAlignment(PositionConstants.CENTER)
			}
			case direction == Directions.EAST : {
				label.setAlignment(PositionConstants.RIGHT)
			}
			case direction == Directions.SOUTH_WEST : {
				label.setAlignment(EMFProfileApplicationGMFDecoratorPlugin.integerBinaryOr(PositionConstants.BOTTOM, PositionConstants.LEFT))
			}
			case direction == Directions.SOUTH : {
				label.setAlignment(PositionConstants.BOTTOM)
			}
			case direction == Directions.SOUTH_EAST : {
				label.setAlignment(EMFProfileApplicationGMFDecoratorPlugin.integerBinaryOr(PositionConstants.BOTTOM, PositionConstants.RIGHT))
			}
			default : 
				label.setAlignment(PositionConstants.CENTER)
		}
	}
	
	def setTextPlacement(WrappingLabel label, BoxImageOrientation orientation) {
		switch orientation {
			case orientation == BoxImageOrientation.EAST : {
				label.setTextPlacement(PositionConstants.WEST)
				label.setTextAlignment(PositionConstants.CENTER)
				label.setIconAlignment(PositionConstants.CENTER)
			}
			case orientation == BoxImageOrientation.WEST : {
				label.setTextPlacement(PositionConstants.EAST)
				label.setTextAlignment(PositionConstants.CENTER)
				label.setIconAlignment(PositionConstants.CENTER)
			}
			case orientation == BoxImageOrientation.SOUTH : {
				label.setTextPlacement(PositionConstants.NORTH)
				label.setTextAlignment(PositionConstants.CENTER)
				label.setIconAlignment(PositionConstants.CENTER)
			}
			case orientation == BoxImageOrientation.NORTH : {
				label.setTextPlacement(PositionConstants.SOUTH)
				label.setTextAlignment(PositionConstants.CENTER)
				label.setIconAlignment(PositionConstants.CENTER)
			}
			default : {
				label.setTextPlacement(PositionConstants.EAST)
				label.setTextAlignment(PositionConstants.CENTER)
				label.setIconAlignment(PositionConstants.CENTER)
			}
				
		}
	}
	
	override getDecorationType() {
		return BoxDecorationImpl
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

class WrappingLabelEx extends WrappingLabel {
	
	new(String string, Image image) {
		super(string, image)
	}
	
	new(String string) {
		super(string)
	}
	
	override getIconTextGap() {
//		super.getIconTextGap()
		return 0;
	}
	
}