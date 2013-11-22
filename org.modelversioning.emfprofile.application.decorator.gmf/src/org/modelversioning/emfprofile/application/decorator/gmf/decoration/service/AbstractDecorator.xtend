package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service

import com.google.common.collect.Lists
import com.google.common.collect.Maps
import java.util.LinkedHashMap
import java.util.List
import java.util.Map
import org.eclipse.draw2d.ColorConstants
import org.eclipse.draw2d.Graphics
import org.eclipse.draw2d.IFigure
import org.eclipse.emf.common.notify.Notification
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DecorationEditPolicy.DecoratorTarget
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.Decoration
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecorator
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget.Direction
import org.eclipse.gmf.runtime.notation.NotationPackage
import org.eclipse.swt.graphics.Color
import org.eclipse.swt.graphics.Image
import org.eclipse.swt.graphics.RGB
import org.eclipse.swt.widgets.Display
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration
import org.modelversioning.emfprofile.decoration.decorationLanguage.Colors
import org.modelversioning.emfprofile.decoration.decorationLanguage.LineStyle
import org.modelversioning.emfprofile.decoration.decorationLanguage.Style
import org.modelversioning.emfprofileapplication.StereotypeApplication

abstract class AbstractDecorator implements IDecorator {
	/** to cash created colors. they are disposed when the plug-in is stop method is called */
	val public static Map<RGB, Color> createdColors = Maps.newHashMap()

	/** the notificationListener. */
	protected val NotificationListener notificationListener = new NotificationListenerImpl(this)

	protected val LinkedHashMap<StereotypeApplication, GraphicalDecorationDescription> graphicalDecorationDescriptions = Maps.
		newLinkedHashMap

	/** the object to be decorated */
	protected val DecoratorTarget decoratorTarget

	/**
	 * Creates a new <code>AbstractDecorator</code> for the decorator target
	 * passed in.
	 * 
	 * @param decoratorTarget
	 *            the object to be decorated
	 */
	new(IDecoratorTarget decoratorTarget) {
		this.decoratorTarget = decoratorTarget as DecoratorTarget
	}

	protected def IGraphicalEditPart getTargetEditPart() {
		return decoratorTarget.getAdapter(IGraphicalEditPart) as IGraphicalEditPart;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see IDecorator#activate()
	 */
	override activate() {
		val IGraphicalEditPart gep = getTargetEditPart()
		DiagramEventBroker.getInstance(gep.getEditingDomain()).addNotificationListener(gep.getNotationView(),
			NotationPackage.eINSTANCE.getNode_LayoutConstraint(), notificationListener);
	}

	/**
	 * Deactivates the decoration.
	 * 
	 * @see IDecorator#deactivate()
	 */
	override def deactivate() {
		val IGraphicalEditPart gep = getTargetEditPart();
		DiagramEventBroker.getInstance(gep.getEditingDomain()).removeNotificationListener(gep.getNotationView(),
			NotationPackage.eINSTANCE.getNode_LayoutConstraint(), notificationListener);
	}

	/**
	 * is to be called by {@link EObjectDecorators} when stereotype was applied to a semantical element
	 * or a stereotype application attribute values have changed
	 */
	def applyDecorations(GraphicalDecorationDescription graphicalDecorationDescription) {
		graphicalDecorationDescriptions.put(graphicalDecorationDescription.stereotypeApplication,
			graphicalDecorationDescription)
		refresh()
	}

	/**
	 * is to be called by {@link EObjectDecorators} when stereotype application is removed
	 */
	def removeAppliedDecorations(GraphicalDecorationDescription graphicalDecorationDescription) {
		graphicalDecorationDescriptions.remove(graphicalDecorationDescription.stereotypeApplication)
		refresh()
	}
	
	/**
	 * This method should provide all graphical decorations that can be processed by the decorator.
	 */
	protected def List<GraphicalDecoration> getGraphicalDecorations(
		GraphicalDecorationDescription graphicalDecorationDescription,
		Class<? extends AbstractDecoration> decorationType) {
		val List<GraphicalDecoration> graphicalDecorations = Lists.newLinkedList()
		graphicalDecorationDescription.decorations.forEach [ gd |
			if (gd.decoration.class == decorationType) {
				graphicalDecorations.add(gd)
			}
		]
		return graphicalDecorations
	}
	
	/**
	 * Returns the class type of {@link AbstractDecoration} for which the concrete decorator is interested.
	 */
	abstract def Class<? extends AbstractDecoration> getDecorationType()
	
	
	//+++++++++++ Utility methods for decoration of shapes and connections +++++++++++
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		/**
	 * Adds figure decoration to the connection 
	 */
	protected def Decoration addConnectionDecoration(IFigure figure, int percentageFromSource, boolean isVolatile){
		decoratorTarget.addConnectionDecoration(figure, correctPercentageValue(percentageFromSource), isVolatile) as Decoration
	}
	
	/**
	 * Adds image decoration to the connection 
	 */
	protected def Decoration addConnectionDecoration(Image image, int percentageFromSource, boolean isVolatile){
		decoratorTarget.addConnectionDecoration(image, correctPercentageValue(percentageFromSource), isVolatile) as Decoration
	}

	/**
	 * Adds figure decoration to the shape 
	 */	
	protected def Decoration addShapeDecoration(IFigure figure, Direction direction, int margin, boolean isVolatile){
		decoratorTarget.addShapeDecoration(figure, IDecoratorTarget.Direction.NORTH_EAST, -1, false) as Decoration
	}
	
	/**
	 * Adds image decoration to the shape 
	 */
	protected def Decoration addShapeDecoration(Image image, Direction direction, int margin, boolean isVolatile){
		decoratorTarget.addShapeDecoration(image, IDecoratorTarget.Direction.NORTH_EAST, -1, false) as Decoration
	}
	
	private def int correctPercentageValue(int number){
		if(number > 100)
			return 100
		if(number < 0)
			return 0
		return number
	}
	
		protected def int provideStyle(Style style) {
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
	
	protected def Color provideColor(org.modelversioning.emfprofile.decoration.decorationLanguage.Color color) {
		if(color == null)
			return ColorConstants.red
		
		val concreteColor = color.concret
		if(concreteColor != null) {
			val rgb = new RGB(concreteColor.red,concreteColor.green,concreteColor.blue)
			if(createdColors.containsKey(rgb)){
				return createdColors.get(rgb)
			}
			val Color newColor = new Color(Display.getCurrent(), rgb)
			createdColors.put(newColor.RGB, newColor)
			return newColor	
		} else {
			val constantColor = color.value
			if(constantColor == null)
				return ColorConstants.red
			val colorCode = constantColor.value
			switch colorCode {
				case colorCode == Colors::BLACK : return ColorConstants.black
				case colorCode == Colors::BLUE : return ColorConstants.blue
				case colorCode == Colors::BLUE_DARK : return ColorConstants.darkBlue
				case colorCode == Colors::BLUE_LIGHT : return ColorConstants.lightBlue
				case colorCode == Colors::CYAN : return ColorConstants.cyan
				case colorCode == Colors::GRAY : return ColorConstants.gray
				case colorCode == Colors::GRAY_DARK : return ColorConstants.darkGray
				case colorCode == Colors::GRAY_LIGHT : return ColorConstants.lightGray
				case colorCode == Colors::GREEN : return ColorConstants.green
				case colorCode == Colors::GREEN_DARK : return ColorConstants.darkGreen
				case colorCode == Colors::GREEN_LIGHT : return ColorConstants.lightGreen
				case colorCode == Colors::ORANGE : return ColorConstants.orange
				case colorCode == Colors::RED : return ColorConstants.red
				case colorCode == Colors::WHITE : return ColorConstants.white
				case colorCode == Colors::YELLOW : return ColorConstants.yellow
				default:
					return ColorConstants.red
			}
		}
		
	}

}

//+++++++++++ Simple implementation of the NotificationListener +++++++++++
class NotificationListenerImpl implements NotificationListener {
	val AbstractDecorator decorator

	new(AbstractDecorator decorator) {
		this.decorator = decorator
	}

	override notifyChanged(Notification notification) {

		// on each notification, just refresh the decorator.
		decorator.refresh
	}
	
	

}
