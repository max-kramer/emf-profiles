package org.modelversioning.emfprofile.application.decorator.graphiti.provider

import com.google.common.collect.Maps
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.graphiti.mm.pictograms.ContainerShape
import org.eclipse.graphiti.mm.pictograms.PictogramElement
import org.eclipse.graphiti.platform.IDiagramBehavior
import org.eclipse.graphiti.services.Graphiti
import org.eclipse.graphiti.tb.IDecorator
import org.modelversioning.emfprofile.application.decorator.graphiti.service.EObjectToDecorationsMapper
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription
import org.eclipse.graphiti.mm.pictograms.PictogramLink

class DecoratorsProvider {
	private new() {
	}

	public static final DecoratorsProvider INSTANCE = new DecoratorsProvider;

	private val Map<EObject, EObjectToDecorationsMapper> mapToDecorations = Maps.newHashMap

	public def IDecorator[] getDecorators(PictogramElement pictogramElement, IDiagramBehavior diagramBehaviour) {
		
		val EObject businessObject = Graphiti.linkService.getBusinessObjectForLinkedPictogramElement(pictogramElement)
		if (businessObject == null)
			return null;
		
		//////
//		println("This pe: " + pictogramElement)
//		println("All pictogram element for business object: " + businessObject)
//		Graphiti.linkService.getPictogramElements(diagramBehaviour.diagramContainer.diagramTypeProvider.diagram, businessObject).forEach[pe|
//			println("\t" + pe)
//		]
//		println()
		//////
		
		val decorations = mapToDecorations.get(businessObject)
		if (decorations != null) {
			return decorations.getDecorators()
		}
		mapToDecorations.put(businessObject, new EObjectToDecorationsMapper(pictogramElement, diagramBehaviour))
//		if decorations is null, this means that this method is called for the first time with this 
//		pictogram element in which case it means that for its business object there are no decorations
//		so we can just return null
		return null
	}
	
	public def void decorate(GraphicalDecorationDescription graphicalDecorationDescription){
		val businessObject = graphicalDecorationDescription.stereotypeApplication.appliedTo
		val decorations = mapToDecorations.get(businessObject)
		decorations.addGraphicalDecorationDescriptions(graphicalDecorationDescription)
	}
	
	public def void removeDecoration(GraphicalDecorationDescription graphicalDecorationDescription){
		val businessObject = graphicalDecorationDescription.stereotypeApplication.appliedTo
		val decorations = mapToDecorations.get(businessObject)
		decorations.removeGraphicalDecorationDescriptioins(graphicalDecorationDescription)
	}
	
}
