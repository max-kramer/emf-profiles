/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.decorator.gmf

import com.google.common.base.Objects
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.Platform
import org.eclipse.gef.EditPart
import org.eclipse.gmf.runtime.notation.View
import org.eclipse.jface.viewers.IStructuredSelection
import org.modelversioning.emfprofile.application.decorator.AbstractEMFProfileApplicationDecorator
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.provider.EObjectToDecoratorsMapper
import org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription

/**
 * Implementation of the {@link EMFProfileApplicationDecorator} that serves GMF-based editors.
 *  
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a> (initial API and
 *         implementation)
 * @author <a href="mailto:langer@big.tuwien.ac.at">Philip Langer</a>
 *         (generalization to support all GMF-based editors)
 */
class GMFProfileApplicationDecorator extends AbstractEMFProfileApplicationDecorator {
	
	val mapper = EObjectToDecoratorsMapper.INSTANCE 

	override decorate(GraphicalDecorationDescription graphicalDecorationDescription) {
		mapper.decorate(graphicalDecorationDescription)
	}

	override removeDecoration(GraphicalDecorationDescription graphicalDecorationDescription) {
		mapper.removeDecoration(graphicalDecorationDescription)
	}
	
	/**
	 * {@inheritDoc}
	 */
	override resolveEObjectFromEditorSelection(Object selection) {
		if(selection == null) return null

		switch selection {
			IStructuredSelection: {
				val editPart = selection.firstElement as EditPart
				val model = editPart.model
				switch model {
					View : return model.element
				}
			}
			EditPart: {
				val model = selection.model
				switch model {
					View : return model.element
				}
			}
		}
		return null
	}
	
	override protected provideEditorIds() {
		val configElements = Platform.getExtensionRegistry().getConfigurationElementsFor("org.eclipse.ui.editors")
		configElements.filter[declaresGMFBasedEditor].map[getAttribute('id')].filterNull.toSet
	}

	private def declaresGMFBasedEditor(IConfigurationElement element) {
		Objects.equal("gmf-editor", element.getDeclaringExtension.getSimpleIdentifier)
	}

}
