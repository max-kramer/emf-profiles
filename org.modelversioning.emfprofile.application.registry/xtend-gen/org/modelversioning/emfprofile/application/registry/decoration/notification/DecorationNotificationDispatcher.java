/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.decoration.notification;

import org.modelversioning.emfprofile.Stereotype;
import org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator;
import org.modelversioning.emfprofile.application.registry.decoration.DecorationDescriptionsReader;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * Prepares {@link GraphicalDecorationDescription} to be send to the decorator.
 * It tracks the graphical decorations and considers their activation conditions
 * in order to decide if the notification will be sent to the decorator or not.
 * Mostly it depends of the previous {@link DecorationStatus} of a particular
 * {@link GraphicalDecorationDescription} or {@link GraphicalDecoration}.
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 */
@SuppressWarnings("all")
public class DecorationNotificationDispatcher {
  protected final EMFProfileApplicationDecorator decorator;
  
  private final DecorationDescriptionsReader reader;
  
  public DecorationNotificationDispatcher(final EMFProfileApplicationDecorator decorator, final DecorationDescriptionsReader reader) {
    this.decorator = decorator;
    this.reader = reader;
  }
  
  public void acceptAddNotification(final StereotypeApplication stereotypeApplication) {
    Stereotype _stereotype = stereotypeApplication.getStereotype();
    DecorationDescription _decorationDescription = this.reader.getDecorationDescription(_stereotype);
    GraphicalDecorationDescription _graphicalDecorationDescription = new GraphicalDecorationDescription(stereotypeApplication, _decorationDescription);
    this.decorator.decorate(_graphicalDecorationDescription);
  }
  
  public void acceptRemoveNotification(final StereotypeApplication stereotypeApplication) {
    Stereotype _stereotype = stereotypeApplication.getStereotype();
    DecorationDescription _decorationDescription = this.reader.getDecorationDescription(_stereotype);
    GraphicalDecorationDescription _graphicalDecorationDescription = new GraphicalDecorationDescription(stereotypeApplication, _decorationDescription);
    this.decorator.removeDecoration(_graphicalDecorationDescription);
  }
  
  public void acceptSetNotification(final StereotypeApplication stereotypeApplication) {
    Stereotype _stereotype = stereotypeApplication.getStereotype();
    DecorationDescription _decorationDescription = this.reader.getDecorationDescription(_stereotype);
    GraphicalDecorationDescription _graphicalDecorationDescription = new GraphicalDecorationDescription(stereotypeApplication, _decorationDescription);
    this.decorator.decorate(_graphicalDecorationDescription);
  }
  
  /**
   * Disposes of the {@link DecorationDescriptionsReader}
   */
  public void dispose() {
    if (this.reader!=null) {
      this.reader.dispose();
    }
  }
}
