package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.provider

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.Multimap
import org.eclipse.emf.ecore.EObject
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.EObjectDecorators
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription

class EObjectToDecoratorsMapper {

	private new() {
	}

	public static val EObjectToDecoratorsMapper INSTANCE = new EObjectToDecoratorsMapper()

	//	public val Map<EObject, EObjectDecorators> decorators = Maps.newHashMap()
	private val Multimap<EObject, EObjectDecorators> decorators = ArrayListMultimap.create

	def put(EObject object, EObjectDecorators eObjectDecorators) {
		this.decorators.put(object, eObjectDecorators)
	}

	def void decorate(GraphicalDecorationDescription graphicalDecorationDescription) {
		decorators.get(graphicalDecorationDescription.stereotypeApplication.appliedTo).forEach[
			it.decorate(graphicalDecorationDescription)]
	}

	def void removeDecoration(GraphicalDecorationDescription graphicalDecorationDescription) {
		decorators.get(graphicalDecorationDescription.stereotypeApplication.appliedTo).forEach[
			it.removeDecoration(graphicalDecorationDescription)]
	}
}
