package org.modelversioning.emfprofile.decoration.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.modelversioning.emfprofile.Stereotype
import org.modelversioning.emfprofile.decoration.EMFProfileDecorationLanguageInjectorProvider
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationModel

import static org.junit.Assert.*

@InjectWith(EMFProfileDecorationLanguageInjectorProvider)
@RunWith(XtextRunner)
class DecorationTest {

	@Inject
	ParseHelper<DecorationModel> parser;

	@Test
	def void test() {
		val model = parser.parse(
			"import resource 'profile.emfprofile_diagram';

profile EJB_Profile


decoration IDAttribute {
	border {
		size : 23
//		active when 
	}
}

decoration SessionBean {
	icon {   
		location-uri : '/EJB_Profile/icons/nav_refresh.gif'
		active when any( 
			attributeInBean != 4.4
			isUserManaged == true 
			isUserManaged != false
			)
	} 
	border {
		size : 23
	} 
	active when all (  
		isUserManaged != true;
		any (
			isUserManaged == false
		) 
	)
	
}
decoration Bean {
	border {
		size : 84
	}
	active when attributeInBean > 34
}

decoration EntityBean { 
	border {
		size : 23  
		active when all(
			// supported attribute types
			attributeInBean <= 5.5 // is EFloat
			isStateful != false		// is EBoolean
			numberDouble < 45.00
			numberFloat > 55.434
			numberInt >= 5
			string != 'what'
			string == 'yes'
			
			// it should be possible to parse an integer to double
			numberFloat <= 45
			
			
			// EVERYTHING UNDER THIS IS WRONG AND SHOULD SHOW AN ERROR
//			
//			// unsupported operators for EString and EBoolean
//			string < 'wrong'
//			string <= 'wrong'
//			string > 'wrong'
//			string >= 'wrong'
//			isStateful < 'wrong'
//			isStateful <= 'wrong'
//			isStateful > 'wrong'
//			isStateful >= 'wrong'
//			 
//			// these attribute types are not supported
//			byte == 3
//			char =='2'
//			numberLong == 123
//			numberShort == 23
//			byteArrayShouldNotBeVisible == 2
//			
//			// wrong value assignment
//			isStateful != 'false'		// is EBoolean
//			numberDouble < 'wrong'
//			numberFloat > 'wrong'
//			numberInt >= 'wrong'
//			string != 1234.0
//			isStateful == 'true'
		)
	}
}

")
		println(parser.toString)
		val entity = model.decorationDescriptions.head as DecorationDescription
		println((entity.stereotype as Stereotype))
		assertSame(entity, entity.decorations.head.eContainer)
		model.eResource.errors.forEach[e|println(e)]
//		assertTrue("There are validation errors in the model.", model.eResource.errors.empty)
		// well this can not be tested here because we need to load profile model to be able to resolve cross references
		// that is done in ReadingTheModelResourceSet
	}
}
