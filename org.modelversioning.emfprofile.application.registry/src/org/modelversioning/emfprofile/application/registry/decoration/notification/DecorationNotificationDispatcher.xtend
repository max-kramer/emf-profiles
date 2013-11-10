/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.decoration.notification

import com.google.common.collect.Maps
import java.util.Map
import org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper
import org.modelversioning.emfprofile.application.registry.decoration.DecorationDescriptionsReader
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription
import org.modelversioning.emfprofileapplication.StereotypeApplication

/**
 * Prepares {@link GraphicalDecorationDescription} to be send to the decorator. 
 * It tracks the graphical decorations and considers their activation conditions 
 * in order to decide if the notification will be sent to the decorator or not.
 * Mostly it depends of the previous {@link DecorationStatus} of a particular 
 * {@link GraphicalDecorationDescription} or {@link GraphicalDecoration}.
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 */
class DecorationNotificationDispatcher {

	protected val EMFProfileApplicationDecorator decorator
	val DecorationDescriptionsReader reader

	val Map<StereotypeApplication, GraphicalDecorationDescription> tracker = Maps.newHashMap()

	new(EMFProfileApplicationDecorator decorator, DecorationDescriptionsReader reader) {
		this.decorator = decorator
		this.reader = reader
	}

	def acceptAddNotification(StereotypeApplication stereotypeApplication) {
		val decorationDescription = new GraphicalDecorationDescription(stereotypeApplication,
			reader.getDecorationDescription(stereotypeApplication.stereotype))
		if (tracker.containsKey(decorationDescription.stereotypeApplication) == false) {
			tracker.put(decorationDescription.stereotypeApplication, decorationDescription)
			decorator.decorate(decorationDescription)
		} else {
			throw new IllegalStateException('''ADD --- The elemet is already in the set: «decorationDescription»''')
		}
	}

	def acceptRemoveNotification(StereotypeApplication stereotypeApplication) {
		val decorationDescription = new GraphicalDecorationDescription(stereotypeApplication,
			reader.getDecorationDescription(stereotypeApplication.stereotype))
		if (tracker.containsKey(decorationDescription.stereotypeApplication)) {
			tracker.remove(decorationDescription.stereotypeApplication)
			decorator.removeDecoration(decorationDescription)
		} else {
			throw new IllegalStateException('''REMOVE --- The elemet is unknown in the set: «decorationDescription»''')
		}
	}

	def acceptSetNotification(StereotypeApplication stereotypeApplication) {
		val decorationDescription = new GraphicalDecorationDescription(stereotypeApplication,
			reader.getDecorationDescription(stereotypeApplication.stereotype))
		if (tracker.containsKey(decorationDescription.stereotypeApplication)) {
			if (tracker.get(decorationDescription.stereotypeApplication) != decorationDescription) {
				tracker.put(decorationDescription.stereotypeApplication, decorationDescription)
				decorator.decorate(decorationDescription)
			}
		} else {
			throw new IllegalStateException('''SET --- The elemet is unknown in the set: «decorationDescription»''')
		}
	}

	/**
	 * Disposes of the {@link DecorationDescriptionsReader}
	 */
	def dispose() {
		reader?.dispose
	}
}

///////////////////// SimpleDecorationNotificationDispatcher /////////////////////////
/**
 * It is just a place holder for the {@link DecorationNotificationDispatcher}
 * until the {@link EMFProfileApplicationDecorator} is set in
 * the {@link ProfileApplicationWrapper} after which the 
 * {@link DecorationDescriptionsReader} will also be initialized and used by the 
 * {@link DecorationNotificationDispatcher}.
 */
class SimpleDecorationNotificationDispatcher extends DecorationNotificationDispatcher {
	new(EMFProfileApplicationDecorator decorator, DecorationDescriptionsReader reader) {
		super(decorator, reader)
	}

	override def acceptAddNotification(StereotypeApplication stereotypeApplication) {
		decorator.decorate(new GraphicalDecorationDescription(stereotypeApplication, null))
	}

	override def acceptRemoveNotification(StereotypeApplication stereotypeApplication) {
		decorator.removeDecoration(new GraphicalDecorationDescription(stereotypeApplication, null))
	}

	override def acceptSetNotification(StereotypeApplication stereotypeApplication) {
		decorator.decorate(new GraphicalDecorationDescription(stereotypeApplication, null))
	}
}
