/*
 * generated by Xtext
 */
package org.modelversioning.emfprofile.decoration.ui.contentassist

import com.google.inject.Inject
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.EcorePackage.Literals
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.modelversioning.emfprofile.Stereotype
import org.modelversioning.emfprofile.decoration.decorationLanguage.ComparisonOperator
import org.modelversioning.emfprofile.decoration.decorationLanguage.Condition
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationModel
import org.modelversioning.emfprofile.decoration.scoping.EMFProfileDecorationLanguageScopeProvider

/**
 * see http://www.eclipse.org/Xtext/documentation.html#contentAssist on how to customize content assistant
 */
class EMFProfileDecorationLanguageProposalProvider extends AbstractEMFProfileDecorationLanguageProposalProvider {

	/*
	 * Resolving cross-references to steretypes defined in the profile model.
	 * Filtering them to show only those which are not already used in the decoration model. 
	 */
	override completeDecorationDescription_Stereotype(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {

		//		super.completeDecorationDescription_Stereotype(model, assignment, context, acceptor)
		lookupCrossReference(assignment.terminal as CrossReference, context, acceptor,
			[
//				var temp = EObjectOrProxy as Stereotype
//				if (temp.eIsProxy)
//					temp = model.eResource.resourceSet.getEObject(EObjectURI, true) as Stereotype
//				val stereotypeInQuestion = temp
				val stereotypeInQuestion = EObjectOrProxy as Stereotype
				val decoration = (model as DecorationDescription)
				val decorationModel = (decoration.eContainer as DecorationModel)
//				if (stereotypeInQuestion.interface || stereotypeInQuestion.abstract)
//					return false
//				model.eResource.resourceSet.resources.map[contents.get(0)].forEach [
//					switch it {
//						Profile: println("it is a package: " + it)
//						default: println("something else: " + it)
//					}
//				]
//				println("Finished")
				decorationModel.decorationDescriptions.map[stereotype].exists[s|s == stereotypeInQuestion] == false
			])
	}
	
	/*
	 * Showing also the ecore type of the attribute shown by the content assist.
	 */
	override getDisplayString(EObject element, String qualifiedNameAsString, String shortName) {
		switch element {
			EAttribute : {
//				println("shortName: " + shortName + ", qulifiedNameAsString: " + qualifiedNameAsString + ", element: " + element)
				return shortName + " : " + element.EType.name
			}
			default :
				super.getDisplayString(element, qualifiedNameAsString, shortName)
		}
		
	}
	

	/*
	 * Restricting proposals of comparison operators for String and Boolean 
	 */
	override completeKeyword(Keyword object, ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		switch context.currentModel {
			Condition : {
				val condition = context.currentModel as Condition
				val attributeType = condition.attribute.EType
				switch attributeType {
					case attributeType.name == EcorePackage.Literals.EBOOLEAN.name ||
						 attributeType.name == EcorePackage.Literals.ESTRING.name : {
						if(object.value == ComparisonOperator.EQUAL.literal || object.value == ComparisonOperator.UNEQUAL.literal){
							super.completeKeyword(object, context, acceptor)
						}
					}
					default : 
					super.completeKeyword(object, context, acceptor)
				}
			}
			default : 
			super.completeKeyword(object, context, acceptor)
		}
	}
	
	/*
	 * Content assist will show only attributes of the steretype that can be used in a condition.
	 */
	override completeCondition_Attribute(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		lookupCrossReference(assignment.terminal as CrossReference, context, acceptor, [
			val attribute = EObjectOrProxy as EAttribute
			switch attribute {
				case attribute.EType == Literals.EBOOLEAN || attribute.EType == Literals.ESTRING || attribute.EType == Literals.EINT 
					|| attribute.EType == Literals.EFLOAT || attribute.EType == Literals.EDOUBLE:
					return true
				default :
					return false
			}
		])
	}
	
	/*
	 * For EBoolean attribute type show completion proposals for true and false.
	 */
	override completeCondition_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		val condition = model as Condition
		val attributeType = condition.attribute.EType
		switch attributeType {
			case attributeType == Literals.EBOOLEAN : {
				acceptor.accept(createCompletionProposal("false", context))
				acceptor.accept(createCompletionProposal("true", context))
			}
			default:
				super.completeRuleCall(assignment.terminal as RuleCall, context, acceptor)			
		}
	}
}
