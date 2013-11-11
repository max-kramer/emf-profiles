/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.decorator

import com.google.common.collect.ImmutableSet
import java.util.Set
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl
import org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator

/**
 * EMF Profile Application Decorators should extend this class.
 * 
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 */
abstract class AbstractEMFProfileApplicationDecorator extends MinimalEObjectImpl implements EMFProfileApplicationDecorator {
	
	val Set<String> decoratableEditorIds

	new() {
		this.decoratableEditorIds = provideEditorIds()
	}
	
	abstract protected def Set<String> provideEditorIds() 
	 
	override canDecorateEditorsWithFollowingIDs() {
		ImmutableSet.copyOf(decoratableEditorIds)
	}
	 
}