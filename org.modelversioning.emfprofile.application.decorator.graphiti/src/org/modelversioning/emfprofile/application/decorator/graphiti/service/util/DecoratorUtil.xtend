package org.modelversioning.emfprofile.application.decorator.graphiti.service.util

import org.eclipse.draw2d.Graphics
import org.eclipse.graphiti.util.IColorConstant
import org.modelversioning.emfprofile.decoration.decorationLanguage.Color
import org.modelversioning.emfprofile.decoration.decorationLanguage.Colors
import org.modelversioning.emfprofile.decoration.decorationLanguage.ComplexText
import org.modelversioning.emfprofile.decoration.decorationLanguage.LineStyle
import org.modelversioning.emfprofile.decoration.decorationLanguage.SimpleText
import org.modelversioning.emfprofile.decoration.decorationLanguage.Style
import org.modelversioning.emfprofile.decoration.decorationLanguage.Text
import org.modelversioning.emfprofileapplication.StereotypeApplication

class DecoratorUtil {
	private new(){}
	
	/**
	 * utility method to convert colors from decoration description language to types acceptable by Graphiti
	 */
	static def IColorConstant provideColor(Color color) {
		if(color == null)
			return IColorConstant.BLACK
		
		val concreteColor = color.concrete 
		if(concreteColor != null) { // in graphiti this is not possible because we can only use predefined colors from IColorConstant
			return IColorConstant.BLACK	
		} else {
			val constantColor = color.value
			if(constantColor == null)
				return IColorConstant.RED
			val colorCode = constantColor.value
			switch colorCode {
				case colorCode == Colors::BLACK : return IColorConstant.BLACK
				case colorCode == Colors::BLUE : return IColorConstant.BLUE
				case colorCode == Colors::BLUE_DARK : return IColorConstant.DARK_BLUE
				case colorCode == Colors::BLUE_LIGHT : return IColorConstant.LIGHT_BLUE
				case colorCode == Colors::CYAN : return IColorConstant.CYAN
				case colorCode == Colors::GRAY : return IColorConstant.GRAY
				case colorCode == Colors::GRAY_DARK : return IColorConstant.DARK_GRAY
				case colorCode == Colors::GRAY_LIGHT : return IColorConstant.LIGHT_GRAY
				case colorCode == Colors::GREEN : return IColorConstant.GREEN
				case colorCode == Colors::GREEN_DARK : return IColorConstant.DARK_GREEN
				case colorCode == Colors::GREEN_LIGHT : return IColorConstant.LIGHT_GREEN
				case colorCode == Colors::ORANGE : return IColorConstant.ORANGE
				case colorCode == Colors::RED : return IColorConstant.RED
				case colorCode == Colors::WHITE : return IColorConstant.WHITE
				case colorCode == Colors::YELLOW : return IColorConstant.YELLOW
				default:
					return IColorConstant.BLACK
			}
		}
	}
	
	/**
	 * utility method to convert styles from decoration description language to types acceptable by GMF
	 */
	static def int provideStyle(Style style) {
		if(style == null)
			return Graphics.LINE_SOLID
		val ls = style.value
		switch ls {
			case ls == LineStyle::LINE_DASH : return Graphics::LINE_DASH
			case ls == LineStyle::LINE_DASHDOT : return Graphics::LINE_DASHDOT
			case ls == LineStyle::LINE_DASHDOTDOT : return Graphics::LINE_DASHDOTDOT
			case ls == LineStyle::LINE_DOT : return Graphics::LINE_DOT
			case ls == LineStyle::LINE_SOLID : return Graphics::LINE_SOLID
			default:
				Graphics::LINE_SOLID
		}
	}
		
	/**
	 * utility method to produce text from decoration description language text for the stereotype application
	 */
	static def String provideText(Text text, StereotypeApplication stereotypeApplication){
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
				return provideText(text.left, stereotypeApplication) + provideText(text.right, stereotypeApplication);
			}
			default:
				return ""
			
		}
	}
}