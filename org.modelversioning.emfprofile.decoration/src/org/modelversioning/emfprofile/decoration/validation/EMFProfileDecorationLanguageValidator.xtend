/*
 * generated by Xtext
 */
package org.modelversioning.emfprofile.decoration.validation

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EcorePackage.Literals
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl
import org.eclipse.xtext.validation.Check
import org.modelversioning.emfprofile.decoration.decorationLanguage.ComparisonOperator
import org.modelversioning.emfprofile.decoration.decorationLanguage.Condition
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguagePackage
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationModel
import org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.RGB

//import org.eclipse.xtext.validation.Check
/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class EMFProfileDecorationLanguageValidator extends AbstractEMFProfileDecorationLanguageValidator { //  public static val INVALID_NAME = 'invalidName'
	private static val uriConverter = new ExtensibleURIConverterImpl

	@Check
	def checkThatThereIsOnlyOneDecorationDescriptionForSameStereotype(DecorationDescription decorationDescription) {
		if ((decorationDescription.eContainer as DecorationModel).decorationDescriptions.exists[
			it != decorationDescription && it.stereotype == decorationDescription.stereotype])
			error('''Decoration description already defined for the «decorationDescription.stereotype.name»''',
				decorationDescription, DecorationLanguagePackage.Literals.DECORATION_DESCRIPTION__STEREOTYPE)

	}

	@Check
	def checkImageDecorationLocationURI(ImageDecoration imageDecoration) {
		try {

			var URI iconURI = URI.createURI(imageDecoration.location_uri);
			if (iconURI.isRelative()) {
				error(
					'''The URI must be absolute. Please use the path schema like: 
	"platform:/resource/Project_Name/path_to_image_file"
or
	"platform:/plugin/Plugin_ID/path_to_image_file"''', imageDecoration,
					DecorationLanguagePackage.Literals.IMAGE_DECORATION__LOCATION_URI)
			}

			if (uriConverter.exists(iconURI, null) == false) {
				error(
					'''The URI does not point to the icon location. Please use the path schema like: 
	"platform:/resource/Project_Name/path_to_image_file"
or
	"platform:/plugin/Plugin_ID/path_to_icon_file"''', imageDecoration,
					DecorationLanguagePackage.Literals.IMAGE_DECORATION__LOCATION_URI)
			}
		} catch (IllegalArgumentException iae) {
			println("\tCould not create URI, illegal argument exception is thrown: " + iae.message)
			error(iae.message, imageDecoration, DecorationLanguagePackage.Literals.IMAGE_DECORATION__LOCATION_URI)
		}
	}

	@Check
	def checkCondition(Condition condition) {
		val EAttribute attribute = condition.attribute
		val ComparisonOperator operator = condition.operator
		val String value = condition.value

		switch attribute.EType {
			case attribute.EType == Literals.EBOOLEAN || attribute.EType == Literals.ESTRING: {

				// if the type is boolean or string then only equal and unequal operator is right!
				if (! (operator == ComparisonOperator.EQUAL || operator == ComparisonOperator.UNEQUAL)) {
					error('''The comparison operator is not supported with the attribute type «attribute.EType.name»''',
						condition, DecorationLanguagePackage.Literals.CONDITION__OPERATOR)
				}

				// now we have to test if the value of the condition can be parsed into the attribute type
				if (attribute.EType == Literals.EBOOLEAN) {
					if (! (value == 'true' || value == 'false'))
						error('''Expecting a boolean value. Use ctrl-space to acctivate content assist.''', condition,
							DecorationLanguagePackage.Literals.CONDITION__VALUE)
				} else { // it is a string type
					if (! ((value.startsWith('"') && value.endsWith('"')) ||
						(value.startsWith("'") && value.endsWith("'"))))
						error('''Expecting a string literal.''', condition,
							DecorationLanguagePackage.Literals.CONDITION__VALUE)
				}
			}
			// now testing the values of the number type
			case attribute.EType == Literals.EINT: {
				try {
					Integer.parseInt(value)
					return
				} catch (NumberFormatException nfe) {
					error('''Expecting an integer number.''', condition,
						DecorationLanguagePackage.Literals.CONDITION__VALUE)
				}
			}
			case attribute.EType == Literals.EFLOAT || attribute.EType == Literals.EDOUBLE: {
				try {
					Double.parseDouble(value)
					return
				} catch (NumberFormatException nfe) {
					error('''Expecting a real number.''', condition, DecorationLanguagePackage.Literals.CONDITION__VALUE)
				}
			}
			// enumeration type
			case Literals.EENUM.isInstance(attribute.EType): {
				val literals = attribute.EType.eContents.map(content|content.toString)
				if (literals.contains(value) == false) {
					val validLiterals = literals.reduce([a, b|a + ", " + b])
					error('''Wrong enumeration literal value. Valid values are: «validLiterals»''', condition,
						DecorationLanguagePackage.Literals.CONDITION__VALUE)
				}
			}
			default:
				error(
					'''The attribute of the type «attribute.EType.name» is not supported. 
				Supported types are: Boolean, String, Int, Float, Double and Enumerations defined in the metamodel.''', condition,
					DecorationLanguagePackage.Literals.CONDITION__ATTRIBUTE)
		}
	}

	@Check
	def checkRGB(RGB color) {
		if (color.red < 0 || color.red > 255) {
			error('''Color values must be in range 0 - 255''', color, DecorationLanguagePackage.Literals.RGB__RED)
		} else if (color.green < 0 || color.green > 255) {
			error('''Color values must be in range 0 - 255''', color, DecorationLanguagePackage.Literals.RGB__GREEN)
		} else if (color.blue < 0 || color.blue > 255) {
			error('''Color values must be in range 0 - 255''', color, DecorationLanguagePackage.Literals.RGB__BLUE)
		}
	}
	
}
