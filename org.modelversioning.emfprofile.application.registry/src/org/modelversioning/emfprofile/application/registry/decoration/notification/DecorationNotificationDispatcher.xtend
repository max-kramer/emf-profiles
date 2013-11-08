/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.decoration.notification

import org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper
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
	val org.modelversioning.emfprofile.application.registry.decoration.DecorationDescriptionsReader reader

	new(EMFProfileApplicationDecorator decorator, org.modelversioning.emfprofile.application.registry.decoration.DecorationDescriptionsReader reader) {
		this.decorator = decorator
		this.reader = reader
	}
	
	def acceptAddNotification(StereotypeApplication stereotypeApplication){
		decorator.decorate(new org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription(stereotypeApplication, reader.getDecorationDescription(stereotypeApplication.stereotype)))
	}

	def acceptRemoveNotification(StereotypeApplication stereotypeApplication){
		decorator.removeDecoration(new org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription(stereotypeApplication, reader.getDecorationDescription(stereotypeApplication.stereotype)))
	}

	def acceptSetNotification(StereotypeApplication stereotypeApplication){
		decorator.decorate(new org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription(stereotypeApplication, reader.getDecorationDescription(stereotypeApplication.stereotype)))
	}
	
	/**
	 * Disposes of the {@link DecorationDescriptionsReader}
	 */
	def dispose(){
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
	new(EMFProfileApplicationDecorator decorator, org.modelversioning.emfprofile.application.registry.decoration.DecorationDescriptionsReader reader) {
		super(decorator, reader)
	}
	override def acceptAddNotification(StereotypeApplication stereotypeApplication) {
		decorator.decorate(new org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription(stereotypeApplication, null))
	}
	override def acceptRemoveNotification(StereotypeApplication stereotypeApplication){
		decorator.removeDecoration(new org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription(stereotypeApplication, null))
	}
	override def acceptSetNotification(StereotypeApplication stereotypeApplication){
		decorator.decorate(new org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription(stereotypeApplication, null))
	}
}