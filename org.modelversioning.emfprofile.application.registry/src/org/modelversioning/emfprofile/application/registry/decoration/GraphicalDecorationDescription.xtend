/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.decoration

import com.google.common.base.Objects
import java.util.HashSet
import java.util.Set
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
 * 
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 */
class GraphicalDecorationDescription {
	val StereotypeApplication stereotypeApplication
	val Set<GraphicalDecoration> decorations
	val AbstractCondition condition
	var DecorationStatus decorationStatus

	new(StereotypeApplication stereotypeApplication, DecorationDescription decorationDescription) {
		this.stereotypeApplication = stereotypeApplication
		if (decorationDescription != null) {
			this.decorations = new HashSet
			decorationDescription.decorations.forEach [ d |
				this.decorations.add(new GraphicalDecoration(d, stereotypeApplication))
			]
			this.condition = decorationDescription.activation?.condition
			reevaluate()
		} else {
			this.decorations = emptySet
			this.condition = DecorationLanguageFactory.eINSTANCE.createAbstractCondition
			this.decorationStatus = DecorationStatus::UNKNOWN
		}
	}

	def reevaluate() {
		decorations.forEach[it.reevaluate]
		if (condition == null) {
			decorationStatus = DecorationStatus::ACTIVE
		} else {
			decorationStatus = ConditionEvaluator::execute(condition, stereotypeApplication)
		}
		return
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
		if (obj === null || obj.getClass() != this.getClass()) {
			return false;
		}
		val guest = obj as GraphicalDecorationDescription
		Objects.equal(this.stereotypeApplication, guest.stereotypeApplication) &&
			Objects.equal(this.decorationStatus, guest.decorationStatus) && this.decorations.equals(guest.decorations)
	}

	override hashCode() {
		Objects.hashCode(stereotypeApplication, "a1b2c3d4e5")
	}

	override toString() {
		Objects.toStringHelper(this.class.simpleName + "@" + Integer.toHexString(this.hashCode)).add("Stereotype", stereotypeApplication.stereotype.name).add("appliedTo",
			(stereotypeApplication.appliedTo as ENamedElement).name).add("Status", decorationStatus).add("decorations size",
			decorations.size).add("stereotypeApplication",stereotypeApplication).toString
	}

}
