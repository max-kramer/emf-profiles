package org.modelversioning.emfprofile.application.decorator.graphiti.service

import org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration
import org.modelversioning.emfprofile.application.decorator.graphiti.service.util.DecoratorUtil
import org.modelversioning.emfprofileapplication.StereotypeApplication
import org.eclipse.graphiti.util.IColorConstant

class BoxDecorator extends org.eclipse.graphiti.tb.TextDecorator {
	
	new(String text) {
		super(text)
	}
	
	// We can not get to the image because how Graphiti handles images, 
	// so image decoration inside the BoxDecoration will be ignored.
	// Also it is not possible to specify the border, and the size in width and height.
	// Actually, the width and height are used to calculate the position for the TextDecoration.
	new (BoxDecoration boxDecoration, StereotypeApplication stereotypeApplicaiton) {
		super(DecoratorUtil.provideText(boxDecoration.text, stereotypeApplicaiton))
		setMessage(DecoratorUtil.provideText(boxDecoration.tooltip, stereotypeApplicaiton))
		setFontSize(12)
		setX(boxDecoration.width / 2)
		setY(boxDecoration.height / 2)
		if (boxDecoration.foregroundColor == null) {
			setForegroundColor(IColorConstant.BLACK)
		}else{
			setForegroundColor(DecoratorUtil.provideColor(boxDecoration.foregroundColor))
		}
		if(boxDecoration.backgroundColor == null) {
			setBackgroundColor(IColorConstant.WHITE)			
		}else{
			setBackgroundColor(DecoratorUtil.provideColor(boxDecoration.backgroundColor))
		}
	}
	

}