/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.decoration

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
}
