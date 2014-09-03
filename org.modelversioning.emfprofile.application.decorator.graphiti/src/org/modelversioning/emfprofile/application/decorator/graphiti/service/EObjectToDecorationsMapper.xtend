package org.modelversioning.emfprofile.application.decorator.graphiti.service

import com.google.common.collect.Lists
import java.util.Collection
import java.util.LinkedList
import java.util.List
import org.eclipse.graphiti.mm.pictograms.PictogramElement
import org.eclipse.graphiti.platform.IDiagramBehavior
import org.eclipse.graphiti.tb.IDecorator
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.BorderDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.BoxDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.ColorDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.ConnectionDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.ImageDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BorderDecorationImpl
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.BoxDecorationImpl
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ColorDecorationImpl
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ConnectionDecorationImpl
import org.modelversioning.emfprofile.decoration.decorationLanguage.impl.ImageDecorationImpl
import org.modelversioning.emfprofileapplication.StereotypeApplication

@Data
class EObjectToDecorationsMapper {
	val PictogramElement pictogramElement
	val IDiagramBehavior diagramBehaviour

	private val LinkedList<GraphicalDecorationDescription> gdDescriptions = Lists.newLinkedList

	def void addGraphicalDecorationDescriptions(GraphicalDecorationDescription graphicalDecorationDescription) {
		if (gdDescriptions.contains(graphicalDecorationDescription)) {
			gdDescriptions.set(gdDescriptions.indexOf(graphicalDecorationDescription), graphicalDecorationDescription)
		} else {
			gdDescriptions.add(graphicalDecorationDescription)
		}
		diagramBehaviour.refreshRenderingDecorators(pictogramElement)
	}

	def void removeGraphicalDecorationDescriptioins(GraphicalDecorationDescription graphicalDecorationDescription) {
		if (gdDescriptions.remove(graphicalDecorationDescription))
			diagramBehaviour.refreshRenderingDecorators(pictogramElement)
	}

	/**
	 * To be called by the decorations provider.
	 * This method returns all decorators that should be visible on the pictogram element
	 */
	def IDecorator[] getDecorators() {

		//		TODO iterate in reverse order over all graphical decoration descriptions and collect decorators: Image decorators, Border decorator, Color decorator
		var BorderDecorator borderDecorator = null
		var ColorDecorator colorDecorator = null
		var ConnectionDecorator connectionDecorator = null

		val activeGraphicalDecorationDescriptions = gdDescriptions.reverseView.filter[
			it.decorationStatus == DecorationStatus::ACTIVE]
			
		// handle border decorator	
		var tempDecoration = findActiveDecoration(typeof(BorderDecorationImpl), activeGraphicalDecorationDescriptions)
		if (tempDecoration != null) {
			borderDecorator = new BorderDecorator(tempDecoration as BorderDecoration)
		}
		
		// handle color decorator
		tempDecoration = findActiveDecoration(typeof(ColorDecorationImpl), activeGraphicalDecorationDescriptions)
		if (tempDecoration != null) {
			colorDecorator = new ColorDecorator(tempDecoration as ColorDecoration)
		}
		
		// handle connection decorator
		tempDecoration = findActiveDecoration(typeof(ConnectionDecorationImpl), activeGraphicalDecorationDescriptions)
		if (tempDecoration != null) {
			connectionDecorator = new ConnectionDecorator(tempDecoration as ConnectionDecoration)
		}
		
		// handle image decorators
		val imageDecorations = findAllActiveDecorations(typeof(ImageDecorationImpl), activeGraphicalDecorationDescriptions)
		
		// handle box decorators
		val boxDecorations = findAllActiveDecorations(typeof(BoxDecorationImpl), activeGraphicalDecorationDescriptions)
		
		val List<IDecorator> decorators = Lists.newArrayList
		imageDecorations.forEach[decoration |
			decorators.add(new ImageDecorator(decoration.decoration as ImageDecoration, decoration.stereotypeApplication, null))
		]
		boxDecorations.forEach[decoration |
			decorators.add(new BoxDecorator(decoration.decoration as BoxDecoration, decoration.stereotypeApplication))
		]
		decorators.add(borderDecorator)
		decorators.add(colorDecorator)
		decorators.add(connectionDecorator)
		
		return decorators
	}

	private def Collection<DecorationWithStereotypeApplication> findAllActiveDecorations(Class<? extends AbstractDecoration> type, GraphicalDecorationDescription... graphicalDecorationDescriptions) {
		val activeDecorations = Lists.newArrayList
		for (GraphicalDecorationDescription gdd : graphicalDecorationDescriptions) {
			val tempDecorations = findAllActiveDecorations(type, gdd.decorations)
			activeDecorations.addAll(tempDecorations)
		}
		return activeDecorations
	}
	
	private def Collection<DecorationWithStereotypeApplication> findAllActiveDecorations(Class<? extends AbstractDecoration> type, GraphicalDecoration... graphicalDecorations) {
		val activeDecorations = Lists.newArrayList
		for (GraphicalDecoration gd : graphicalDecorations) {
			if (gd.decoration.class == type && gd.decorationStatus == DecorationStatus::ACTIVE) {
				activeDecorations.add(new DecorationWithStereotypeApplication(gd.decoration, gd.stereotypeApplication))
			}
		}
		return activeDecorations
	}
	

	private def AbstractDecoration findActiveDecoration(
		Class<? extends AbstractDecoration> type, GraphicalDecorationDescription... graphicalDecorationDescriptions) {
		for (GraphicalDecorationDescription gdd : graphicalDecorationDescriptions) {
			val tempDecoration = findActiveDecoration(type, gdd.decorations)
			if (tempDecoration != null)
				return tempDecoration
		}
		return null
	}

	private def AbstractDecoration findActiveDecoration(Class<? extends AbstractDecoration> type, GraphicalDecoration... graphicalDecorations) {
		for (GraphicalDecoration gd : graphicalDecorations) {
			if (gd.decoration.class == type && gd.decorationStatus == DecorationStatus::ACTIVE) {
				return gd.decoration
			}
		}
		return null
	}
	
}

@Data	
class DecorationWithStereotypeApplication {
	val AbstractDecoration decoration
	val StereotypeApplication stereotypeApplication
}