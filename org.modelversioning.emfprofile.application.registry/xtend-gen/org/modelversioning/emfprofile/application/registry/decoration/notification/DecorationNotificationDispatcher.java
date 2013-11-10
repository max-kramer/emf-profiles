/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.decoration.notification;

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.modelversioning.emfprofile.Stereotype;
import org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator;
import org.modelversioning.emfprofile.application.registry.decoration.DecorationDescriptionsReader;
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecorationDescription;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * Prepares {@link GraphicalDecorationDescription} to be send to the decorator.
 * It tracks the graphical decorations and considers their activation conditions
 * in order to decide if the notification will be sent to the decorator or not.
 * Mostly it depends of the previous {@link DecorationStatus} of a particular
 * {@link GraphicalDecorationDescription} or {@link GraphicalDecoration}.
 * 
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 */
@SuppressWarnings("all")
public class DecorationNotificationDispatcher {
  protected final EMFProfileApplicationDecorator decorator;
  
  private final DecorationDescriptionsReader reader;
  
  private final Map<StereotypeApplication,GraphicalDecorationDescription> tracker = new Function0<Map<StereotypeApplication,GraphicalDecorationDescription>>() {
    public Map<StereotypeApplication,GraphicalDecorationDescription> apply() {
      HashMap<StereotypeApplication,GraphicalDecorationDescription> _newHashMap = Maps.<StereotypeApplication, GraphicalDecorationDescription>newHashMap();
      return _newHashMap;
    }
  }.apply();
  
  public DecorationNotificationDispatcher(final EMFProfileApplicationDecorator decorator, final DecorationDescriptionsReader reader) {
    this.decorator = decorator;
    this.reader = reader;
  }
  
  public void acceptAddNotification(final StereotypeApplication stereotypeApplication) {
    Stereotype _stereotype = stereotypeApplication.getStereotype();
    DecorationDescription _decorationDescription = this.reader.getDecorationDescription(_stereotype);
    GraphicalDecorationDescription _graphicalDecorationDescription = new GraphicalDecorationDescription(stereotypeApplication, _decorationDescription);
    final GraphicalDecorationDescription decorationDescription = _graphicalDecorationDescription;
    StereotypeApplication _stereotypeApplication = decorationDescription.getStereotypeApplication();
    boolean _containsKey = this.tracker.containsKey(_stereotypeApplication);
    boolean _equals = (_containsKey == false);
    if (_equals) {
      StereotypeApplication _stereotypeApplication_1 = decorationDescription.getStereotypeApplication();
      this.tracker.put(_stereotypeApplication_1, decorationDescription);
      this.decorator.decorate(decorationDescription);
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("ADD --- The elemet is already in the set: ");
      _builder.append(decorationDescription, "");
      IllegalStateException _illegalStateException = new IllegalStateException(_builder.toString());
      throw _illegalStateException;
    }
  }
  
  public void acceptRemoveNotification(final StereotypeApplication stereotypeApplication) {
    boolean _containsKey = this.tracker.containsKey(stereotypeApplication);
    if (_containsKey) {
      final GraphicalDecorationDescription decorationDescription = this.tracker.remove(stereotypeApplication);
      this.decorator.removeDecoration(decorationDescription);
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("REMOVE --- The elemet is unknown in the set for the: ");
      _builder.append(stereotypeApplication, "");
      IllegalStateException _illegalStateException = new IllegalStateException(_builder.toString());
      throw _illegalStateException;
    }
  }
  
  public void acceptSetNotification(final StereotypeApplication stereotypeApplication) {
    boolean _containsKey = this.tracker.containsKey(stereotypeApplication);
    if (_containsKey) {
      final GraphicalDecorationDescription decorationDescription = this.tracker.get(stereotypeApplication);
      boolean _reevaluate = decorationDescription.reevaluate();
      if (_reevaluate) {
        this.decorator.decorate(decorationDescription);
      }
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("SET --- The elemet is unknown in the set for the: ");
      _builder.append(stereotypeApplication, "");
      IllegalStateException _illegalStateException = new IllegalStateException(_builder.toString());
      throw _illegalStateException;
    }
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
