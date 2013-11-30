/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.decoration.notification;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.modelversioning.emfprofile.Stereotype;
import org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator;
import org.modelversioning.emfprofile.application.registry.decoration.DecorationDescriptionsChangeListener;
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
 * Mostly it depends on the previous {@link DecorationStatus} of a particular
 * {@link GraphicalDecorationDescription} or {@link GraphicalDecoration}.
 * 
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 */
@SuppressWarnings("all")
public class DecorationNotificationDispatcher implements DecorationDescriptionsChangeListener {
  protected final EMFProfileApplicationDecorator decorator;
  
  private final DecorationDescriptionsReader reader;
  
  private final LinkedHashMap<StereotypeApplication,GraphicalDecorationDescription> tracker = new Function0<LinkedHashMap<StereotypeApplication,GraphicalDecorationDescription>>() {
    public LinkedHashMap<StereotypeApplication,GraphicalDecorationDescription> apply() {
      LinkedHashMap<StereotypeApplication,GraphicalDecorationDescription> _newLinkedHashMap = Maps.<StereotypeApplication, GraphicalDecorationDescription>newLinkedHashMap();
      return _newLinkedHashMap;
    }
  }.apply();
  
  private boolean decorationDescriptionsNotValid = false;
  
  /**
   * is used to track stereotype applications that for which to restore decorations when the resource has again valid descriptions
   */
  private List<StereotypeApplication> tempAppliedStereotypes = new Function0<List<StereotypeApplication>>() {
    public List<StereotypeApplication> apply() {
      List<StereotypeApplication> _emptyList = Collections.<StereotypeApplication>emptyList();
      return _emptyList;
    }
  }.apply();
  
  public DecorationNotificationDispatcher(final EMFProfileApplicationDecorator decorator, final DecorationDescriptionsReader reader) {
    this.decorator = decorator;
    this.reader = reader;
    DecorationDescriptionsReader _reader = this.reader;
    if (_reader!=null) {
      _reader.addDecorationDescriptionsChangeListener(this);
    }
  }
  
  public void acceptAddNotification(final StereotypeApplication stereotypeApplication) {
    if (this.decorationDescriptionsNotValid) {
      this.tempAppliedStereotypes.add(stereotypeApplication);
      return;
    }
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
    if (this.decorationDescriptionsNotValid) {
      this.tempAppliedStereotypes.remove(stereotypeApplication);
      return;
    }
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
    if (this.decorationDescriptionsNotValid) {
      return;
    }
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
  
  public void decorationDescriptionsChanged() {
    this.decorationDescriptionsNotValid = false;
    boolean _isEmpty = this.tempAppliedStereotypes.isEmpty();
    if (_isEmpty) {
      Set<StereotypeApplication> _keySet = this.tracker.keySet();
      ImmutableList<StereotypeApplication> _copyOf = ImmutableList.<StereotypeApplication>copyOf(_keySet);
      this.tempAppliedStereotypes = _copyOf;
      int _size = this.tempAppliedStereotypes.size();
      String _plus = ("Decoration Descriptions changed for stereotypeapplications size: " + Integer.valueOf(_size));
      InputOutput.<String>println(_plus);
      final Procedure1<StereotypeApplication> _function = new Procedure1<StereotypeApplication>() {
        public void apply(final StereotypeApplication stereotypeApplication) {
          DecorationNotificationDispatcher.this.acceptRemoveNotification(stereotypeApplication);
          DecorationNotificationDispatcher.this.acceptAddNotification(stereotypeApplication);
        }
      };
      IterableExtensions.<StereotypeApplication>forEach(this.tempAppliedStereotypes, _function);
    } else {
      final Procedure1<StereotypeApplication> _function_1 = new Procedure1<StereotypeApplication>() {
        public void apply(final StereotypeApplication stereotypeApplication) {
          DecorationNotificationDispatcher.this.acceptAddNotification(stereotypeApplication);
        }
      };
      IterableExtensions.<StereotypeApplication>forEach(this.tempAppliedStereotypes, _function_1);
    }
    List<StereotypeApplication> _emptyList = Collections.<StereotypeApplication>emptyList();
    this.tempAppliedStereotypes = _emptyList;
  }
  
  public void decorationDescriptionsChangedButHaveValidationProblems() {
    Set<StereotypeApplication> _keySet = this.tracker.keySet();
    LinkedList<StereotypeApplication> _newLinkedList = Lists.<StereotypeApplication>newLinkedList(_keySet);
    this.tempAppliedStereotypes = _newLinkedList;
    final Procedure1<StereotypeApplication> _function = new Procedure1<StereotypeApplication>() {
      public void apply(final StereotypeApplication stereotypeApplication) {
        DecorationNotificationDispatcher.this.acceptRemoveNotification(stereotypeApplication);
      }
    };
    IterableExtensions.<StereotypeApplication>forEach(this.tempAppliedStereotypes, _function);
    this.decorationDescriptionsNotValid = true;
  }
  
  /**
   * Removes all tracked decorations and disposes of the {@link DecorationDescriptionsReader}
   */
  public void dispose() {
    Set<StereotypeApplication> _keySet = this.tracker.keySet();
    HashSet<StereotypeApplication> _newHashSet = Sets.<StereotypeApplication>newHashSet(_keySet);
    final Procedure1<StereotypeApplication> _function = new Procedure1<StereotypeApplication>() {
      public void apply(final StereotypeApplication sa) {
        DecorationNotificationDispatcher.this.acceptRemoveNotification(sa);
      }
    };
    IterableExtensions.<StereotypeApplication>forEach(_newHashSet, _function);
    if (this.reader!=null) {
      this.reader.dispose();
    }
  }
}
