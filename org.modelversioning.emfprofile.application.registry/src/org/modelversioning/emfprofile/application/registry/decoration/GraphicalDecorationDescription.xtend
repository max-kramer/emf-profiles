/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.decoration

import com.google.common.base.Objects
import com.google.common.collect.ImmutableList
import com.google.common.collect.Lists
import java.util.List
import org.eclipse.emf.ecore.ENamedElement
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractCondition
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguageFactory
import org.modelversioning.emfprofileapplication.StereotypeApplication

/**
 * Describes decorations that will be attached to the graphical
 * representation of the EObject at which the stereotype was applied.
 * Decoration status must be evaluated from the conditions to decide weather to 
 * show or hide the decorations.
 * @see #reevaluate()
 * 
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 */
class GraphicalDecorationDescription {
	val StereotypeApplication stereotypeApplication
	val List<GraphicalDecoration> decorations
	val AbstractCondition condition
	var DecorationStatus decorationStatus

	new(StereotypeApplication stereotypeApplication, DecorationDescription decorationDescription) {
		this.stereotypeApplication = stereotypeApplication
		if (decorationDescription != null) {
			val List<GraphicalDecoration> tempList = Lists.newArrayList
			decorationDescription.decorations.forEach [ d |
				tempList.add(new GraphicalDecoration(d, stereotypeApplication))
			]
			this.decorations = ImmutableList.copyOf(tempList)
			this.condition = decorationDescription.activation?.condition
			reevaluate()
		} else {
			this.decorations = emptyList
			this.condition = DecorationLanguageFactory.eINSTANCE.createAbstractCondition
			this.decorationStatus = DecorationStatus::UNKNOWN
		}
	}

	/**
	 * Reevaluates the decoration status by examining the conditions found in {@link DecorationDescription}
	 * 
	 * @returns <code>true</code> if the activation status has changed.
	 */
	def boolean reevaluate() {
		var changeOccured = false
		if (decorations.empty == false){
			for(GraphicalDecoration d : decorations){
				if(d.reevaluate)
					changeOccured = true
			}
		}
		if (condition == null) {
			decorationStatus = DecorationStatus::ACTIVE
		} else {
			val newDecorationStatus = ConditionEvaluator::execute(condition, stereotypeApplication)

			// if decoration description as whole is inactive then no need to propagate 
			// change occurrence in contained decorations
			if (decorationStatus == DecorationStatus::INANCTIVE) {
				changeOccured = false
			}
			if (newDecorationStatus != decorationStatus) {
				changeOccured = true
			}
			decorationStatus = newDecorationStatus
		}
		return changeOccured
	}

	def getDecorations() {
		decorations
	}

	def getStereotypeApplication() {
		stereotypeApplication
	}

	def getDecorationStatus() {
		decorationStatus
	}

	override def equals(Object obj) {
		if (obj === this) {
			return true;
		}
		if (obj === null || obj.getClass() !== this.getClass()) {
			return false;
		}
		val guest = obj as GraphicalDecorationDescription
		Objects.equal(this.stereotypeApplication, guest.stereotypeApplication) 
//			&& Objects.equal(this.decorationStatus, guest.decorationStatus) 
			&& this.decorations.equals(guest.decorations)
	}

	override hashCode() {
		Objects.hashCode(stereotypeApplication, "31")
	}

	override toString() {
		val toStringHelper = Objects.toStringHelper(this.class.simpleName + "@" + Integer.toHexString(this.hashCode)).
			add("Status", decorationStatus).add("Stereotype", stereotypeApplication.stereotype.name).add("appliedTo",
				if(stereotypeApplication.appliedTo instanceof ENamedElement){
					(stereotypeApplication.appliedTo as ENamedElement).name
				} else {
					stereotypeApplication.appliedTo.eClass.name
				}
				).add("decorations size", decorations.size).
			addValue(decorations)

		toStringHelper.toString
	}

}
