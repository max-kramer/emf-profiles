package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service

import com.google.common.collect.Maps
import com.google.common.collect.Sets
import java.net.URL
import java.util.Map
import java.util.Set
import org.eclipse.emf.common.util.URI
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.Decoration
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.swt.graphics.Image
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.ComplexText
import org.modelversioning.emfprofile.decoration.decorationLanguage.SimpleText
import org.modelversioning.emfprofile.decoration.decorationLanguage.Text
import org.modelversioning.emfprofileapplication.StereotypeApplication

abstract class AbstractManyDecorationsDecorator extends AbstractDecorator {

	new(IDecoratorTarget decoratorTarget) {
		super(decoratorTarget)
	}

	/**
	 * holding references of visualized decorations
	 */
	protected val Set<Decoration> decorationsOnEObject = Sets.newHashSet

	// THE REGISTRY FOR IMAGES
	public static val Map<URI, Image> imageRegistry = Maps.newHashMap

	def getIcon(String uri) {
		val URI imageURI = URI.createURI(uri)
		if (imageRegistry.containsKey(imageURI))
			return imageRegistry.get(imageURI)
		val ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL(new URL(imageURI.toString()));
		val Image image = imageDescriptor.createImage
		imageRegistry.put(imageURI, image)
		return image
	}

	def String getText(Text text, StereotypeApplication stereotypeApplication) {
		switch text {
			SimpleText: {
				if (text.attribute != null) {
					val attribute = stereotypeApplication.eClass.EAllAttributes.findFirst[name == text.attribute.name]
					return String.valueOf(stereotypeApplication.eGet(attribute));
				} else {
					return text.text
				}
			}
			ComplexText: {
				return getText(text.left, stereotypeApplication) + getText(text.right, stereotypeApplication);
			}
			default:
				return ""
		}
	}

	override deactivate() {
		super.deactivate()

		//		Removes all decorations that are applied on the decorator target. Filtering null values
		decorationsOnEObject.forEach [ decoration |
			processRemoveDecoration(decoration)
		]
		decorationsOnEObject.clear
	}

	override refresh() {

		//		println("REFRESHING size: " + decorationsOnEObject.size + " : "+ decoratorTarget)
		removeVisualizedDecorations()
		visualizeDecorations()
	}

	private def removeVisualizedDecorations() {
		decorationsOnEObject.forEach [ d |
			processRemoveDecoration(d)
		]
		decorationsOnEObject.clear()
	}

	private def visualizeDecorations() {
		graphicalDecorationDescriptions.values.forEach [ graphicalDecorationDescription |
			if (graphicalDecorationDescription.decorationStatus == DecorationStatus::ACTIVE) {
				getGraphicalDecorations(graphicalDecorationDescription, decorationType).forEach [ gd |
					val decorationStatus = gd.decorationStatus
					switch decorationStatus {
						case decorationStatus == DecorationStatus::ACTIVE: {
							decorationsOnEObject.add(processAddDecoration(gd))
						}
						case decorationStatus == DecorationStatus::INANCTIVE: {
							//						do nothing
						}
						default:
							throw new IllegalStateException('''Unknown decoration status: «decorationStatus»''')
					}
				]
			}
		]
	}

	/**
	 * instructs the decorator to visualize the decoration on the decoration target.
	 */
	abstract def Decoration processAddDecoration(GraphicalDecoration graphicalDecoration)

	/**
	 * instructs the decorator to remove the visualized decoration from the decoration target.
	 */
	abstract def void processRemoveDecoration(Decoration decoration)
}
