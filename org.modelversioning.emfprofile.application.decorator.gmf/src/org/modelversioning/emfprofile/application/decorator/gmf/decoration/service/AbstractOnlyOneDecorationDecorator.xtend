package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service

import com.google.common.base.Objects
import com.google.common.collect.Lists
import org.eclipse.draw2d.IFigure
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure
import org.eclipse.swt.graphics.Color
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration

abstract class AbstractOnlyOneDecorationDecorator extends AbstractDecorator {

	new(IDecoratorTarget decoratorTarget) {
		super(decoratorTarget)
	}

	/**
	 * returns {@link AbstractDecoration} or <code>null</code> if there is none.
	 */
	def AbstractDecoration getAbstractDecorationWithHighestPrecedence() {
		if(graphicalDecorationDescriptions.empty)
			return null
		val abstractDecoration = Lists.newLinkedList(graphicalDecorationDescriptions.values).reverse.filter[
			it.decorationStatus == DecorationStatus::ACTIVE].map[decorations].flatten.filter[
			it.decoration.class == decorationType && it.decorationStatus == DecorationStatus::ACTIVE].head?.decoration 

		return abstractDecoration
	}
	
	/**
	 * Utility method to provide the right figure for coloring.
	 * @param editPart the graphical edit part 
	 */
	protected def IFigure getFigureForColoring(IGraphicalEditPart editPart) {
		var IFigure figure = editPart.getFigure()
		
		printChildrenOfFigure(figure, 0)
		
		if (figure instanceof BorderedNodeFigure) {
			figure = figure.children.get(0) as IFigure
		} 
		if (figure instanceof DefaultSizeNodeFigure) {
			figure = figure.children.get(0) as IFigure
		} 
		return figure;
	}
	
	private def void printChildrenOfFigure(IFigure figure, int level){
		println("FIGURE " + figure + ", class: " + figure.class)
		figure.children.forEach[f | 
			var step = 0
			while(step <= level){
				print("\t")
				step = step +1
			}
			print("CHILD" ); 
			printChildrenOfFigure((f as IFigure), level+1)
		]
	}
	
	protected def boolean colorEqual(Color color, Color other){
		return Objects.equal(color, other)
	}

}
