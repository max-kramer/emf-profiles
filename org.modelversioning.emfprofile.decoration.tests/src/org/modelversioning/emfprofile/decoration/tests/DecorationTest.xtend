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
			"import EJB_Profile.*;

decoration SessionBean {
	icone {
		location-uri : \"Location_uri\";
	}
	active when: all ( 
		isUserManaged != false
		isUserManaged >= 5
		isUserManaged == true
		
		
	)
}")
		val entity = model.decorationDescriptions.head as DecorationDescription
		println((entity.stereotype as Stereotype))
		assertSame(entity, entity.decorations.head.eContainer)
	}
}
