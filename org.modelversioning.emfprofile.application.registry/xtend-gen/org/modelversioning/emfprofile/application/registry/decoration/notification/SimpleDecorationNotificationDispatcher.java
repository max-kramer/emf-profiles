/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.decoration.notification;

import org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationWrapper;
import org.modelversioning.emfprofile.application.registry.decoration.DecorationDescriptionsReader;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription;
import org.modelversioning.emfprofile.application.registry.decoration.notification.DecorationNotificationDispatcher;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * It is just a place holder for the {@link DecorationNotificationDispatcher}
 * until the {@link EMFProfileApplicationDecorator} is set in
 * the {@link ProfileApplicationWrapper} after which the
 * {@link DecorationDescriptionsReader} will also be initialized and used by the
 * {@link DecorationNotificationDispatcher}.
 */
@SuppressWarnings("all")
public class SimpleDecorationNotificationDispatcher extends DecorationNotificationDispatcher {
  public SimpleDecorationNotificationDispatcher(final EMFProfileApplicationDecorator decorator, final DecorationDescriptionsReader reader) {
    super(decorator, reader);
  }
  
  public void acceptAddNotification(final StereotypeApplication stereotypeApplication) {
    GraphicalDecorationDescription _graphicalDecorationDescription = new GraphicalDecorationDescription(stereotypeApplication, null);
    this.decorator.decorate(_graphicalDecorationDescription);
  }
  
  public void acceptRemoveNotification(final StereotypeApplication stereotypeApplication) {
    GraphicalDecorationDescription _graphicalDecorationDescription = new GraphicalDecorationDescription(stereotypeApplication, null);
    this.decorator.removeDecoration(_graphicalDecorationDescription);
  }
  
  public void acceptSetNotification(final StereotypeApplication stereotypeApplication) {
    GraphicalDecorationDescription _graphicalDecorationDescription = new GraphicalDecorationDescription(stereotypeApplication, null);
    this.decorator.decorate(_graphicalDecorationDescription);
  }
}
