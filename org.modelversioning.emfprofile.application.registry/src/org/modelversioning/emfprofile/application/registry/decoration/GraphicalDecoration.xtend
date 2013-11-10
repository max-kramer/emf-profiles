/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.decoration

import com.google.common.base.Objects
import org.eclipse.emf.ecore.ENamedElement
import org.modelversioning.emfprofile.decoration.decorationLanguage.Decoration
import org.modelversioning.emfprofileapplication.StereotypeApplication

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 */
class GraphicalDecoration {
	val Decoration decoration
	val StereotypeApplication stereotypeApplication
	var DecorationStatus decorationStatus

	new(Decoration decoration, StereotypeApplication stereotypeApplication) {
		this.decoration = decoration
		this.stereotypeApplication = stereotypeApplication
		reevaluate()
	}

	def reevaluate() {
		val condition = decoration.activation?.condition
		if (condition == null) {
			decorationStatus = DecorationStatus::ACTIVE
		} else {
			decorationStatus = ConditionEvaluator::execute(
				condition,
				stereotypeApplication
			)
		}
		return
	}

	def getStereotypeApplication() {
		stereotypeApplication
	}

	def getDecorationStatus() {
		decorationStatus
	}

	override equals(Object obj) {
		if (obj === this) {
			return true;
		}
		if (obj === null || obj.getClass() != this.getClass()) {
			return false;
		}
		val guest = obj as GraphicalDecoration
		Objects.equal(this.stereotypeApplication, guest.stereotypeApplication) &&
			Objects.equal(this.decoration, guest.decoration) &&
			Objects.equal(this.decorationStatus, guest.decorationStatus)
	}

	override hashCode() {
		Objects.hashCode(stereotypeApplication, decoration)
	}

	override toString() {
		Objects.toStringHelper(this.class.simpleName + "@" + Integer.toHexString(this.hashCode)).add("Stereotype", stereotypeApplication.stereotype.name).add("appliedTo",
			(stereotypeApplication.appliedTo as ENamedElement).name).add("Decoration", decoration.eClass.name).add("Status",
			decorationStatus).toString
	}

}
