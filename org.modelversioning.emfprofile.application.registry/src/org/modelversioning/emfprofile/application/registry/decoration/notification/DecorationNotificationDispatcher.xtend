/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.decoration.notification

import com.google.common.collect.ImmutableList
import com.google.common.collect.Lists
import com.google.common.collect.Maps
import com.google.common.collect.Sets
import java.util.Collections
import java.util.LinkedHashMap
import java.util.List
import org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper
import org.modelversioning.emfprofile.application.registry.decoration.DecorationDescriptionsChangeListener
import org.modelversioning.emfprofile.application.registry.decoration.DecorationDescriptionsReader
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription
import org.modelversioning.emfprofileapplication.StereotypeApplication

/**
 * Prepares {@link GraphicalDecorationDescription} to be send to the decorator. 
 * It tracks the graphical decorations and considers their activation conditions 
 * in order to decide if the notification will be sent to the decorator or not.
 * Mostly it depends on the previous {@link DecorationStatus} of a particular 
 * {@link GraphicalDecorationDescription} or {@link GraphicalDecoration}.
 * 
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 */
class DecorationNotificationDispatcher implements DecorationDescriptionsChangeListener {

	protected val EMFProfileApplicationDecorator decorator
	val DecorationDescriptionsReader reader

	val LinkedHashMap<StereotypeApplication, GraphicalDecorationDescription> tracker = Maps.newLinkedHashMap()

	boolean decorationDescriptionsNotValid = false

	/**
	 * is used to track stereotype applications that for which to restore decorations when the resource has again valid descriptions
	 */
	var List<StereotypeApplication> tempAppliedStereotypes = Collections.emptyList

	new(EMFProfileApplicationDecorator decorator, DecorationDescriptionsReader reader) {
		this.decorator = decorator
		this.reader = reader
		this.reader?.addDecorationDescriptionsChangeListener(this)
	}

	def acceptAddNotification(StereotypeApplication stereotypeApplication) {
		if (decorationDescriptionsNotValid){
			tempAppliedStereotypes.add(stereotypeApplication)			
			return;
		}
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
		if (decorationDescriptionsNotValid){
			tempAppliedStereotypes.remove(stereotypeApplication)			
			return;
		}
		if (tracker.containsKey(stereotypeApplication)) {
			val decorationDescription = tracker.remove(stereotypeApplication)
			decorator.removeDecoration(decorationDescription)
		} else {
			throw new IllegalStateException(
				'''REMOVE --- The elemet is unknown in the set for the: «stereotypeApplication»''')
		}
	}

	def acceptSetNotification(StereotypeApplication stereotypeApplication) {
		if (decorationDescriptionsNotValid)
			return;
		if (tracker.containsKey(stereotypeApplication)) {
			val decorationDescription = tracker.get(stereotypeApplication)
			if (decorationDescription.reevaluate) {
				decorator.decorate(decorationDescription)
			}
		} else {
			throw new IllegalStateException(
				'''SET --- The elemet is unknown in the set for the: «stereotypeApplication»''')
		}
	}

	override decorationDescriptionsChanged() {
		decorationDescriptionsNotValid = false

		// we need a copy of applied stereotypes
		if (tempAppliedStereotypes.empty) {
			tempAppliedStereotypes = ImmutableList.copyOf(tracker.keySet)
			println("Decoration Descriptions changed for stereotypeapplications size: " + tempAppliedStereotypes.size)

			// and then we send notifications to remove decorations of applied stereotypes and add them for new decoration descriptions
			tempAppliedStereotypes.forEach [ stereotypeApplication |
				acceptRemoveNotification(stereotypeApplication)
				acceptAddNotification(stereotypeApplication)
			]
		} else {
			tempAppliedStereotypes.forEach [ stereotypeApplication |
				acceptAddNotification(stereotypeApplication)
			]
		}
		tempAppliedStereotypes = Collections.emptyList
	}

	override decorationDescriptionsChangedButHaveValidationProblems() {
		tempAppliedStereotypes = Lists.newLinkedList(tracker.keySet)
		tempAppliedStereotypes.forEach [ stereotypeApplication |
			acceptRemoveNotification(stereotypeApplication)
		]
		decorationDescriptionsNotValid = true
	}

	/**
	 * Removes all tracked decorations and disposes of the {@link DecorationDescriptionsReader}
	 */
	def dispose() {
		Sets.newHashSet(tracker.keySet).forEach[sa |
			acceptRemoveNotification(sa)
		]
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
