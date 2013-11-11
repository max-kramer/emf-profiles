package org.modelversioning.emfprofile.application.decorator.gmf.decoration.service;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.AbstractDecorator;

@SuppressWarnings("all")
public class NotificationListenerImpl implements NotificationListener {
  private final AbstractDecorator decorator;
  
  public NotificationListenerImpl(final AbstractDecorator decorator) {
    this.decorator = decorator;
  }
  
  public void notifyChanged(final Notification notification) {
    this.decorator.refresh();
  }
}
