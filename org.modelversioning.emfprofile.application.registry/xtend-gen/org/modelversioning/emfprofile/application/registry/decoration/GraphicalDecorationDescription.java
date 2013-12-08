/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.decoration;

import com.google.common.base.Objects;
import com.google.common.base.Objects.ToStringHelper;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.modelversioning.emfprofile.Stereotype;
import org.modelversioning.emfprofile.application.registry.decoration.ConditionEvaluator;
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus;
import org.modelversioning.emfprofile.application.registry.decoration.GraphicalDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractCondition;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Activation;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguageFactory;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * Describes decorations that will be attached to the graphical
 * representation of the EObject at which the stereotype was applied.
 * Decoration status must be evaluated from the conditions to decide weather to
 * show or hide the decorations.
 * @see #reevaluate()
 * 
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 */
@SuppressWarnings("all")
public class GraphicalDecorationDescription {
  private final StereotypeApplication stereotypeApplication;
  
  private final List<GraphicalDecoration> decorations;
  
  private final AbstractCondition condition;
  
  private DecorationStatus decorationStatus;
  
  public GraphicalDecorationDescription(final StereotypeApplication stereotypeApplication, final DecorationDescription decorationDescription) {
    this.stereotypeApplication = stereotypeApplication;
    boolean _notEquals = (!Objects.equal(decorationDescription, null));
    if (_notEquals) {
      final List<GraphicalDecoration> tempList = Lists.<GraphicalDecoration>newArrayList();
      EList<AbstractDecoration> _decorations = decorationDescription.getDecorations();
      final Procedure1<AbstractDecoration> _function = new Procedure1<AbstractDecoration>() {
        public void apply(final AbstractDecoration d) {
          GraphicalDecoration _graphicalDecoration = new GraphicalDecoration(d, stereotypeApplication);
          tempList.add(_graphicalDecoration);
        }
      };
      IterableExtensions.<AbstractDecoration>forEach(_decorations, _function);
      ImmutableList<GraphicalDecoration> _copyOf = ImmutableList.<GraphicalDecoration>copyOf(tempList);
      this.decorations = _copyOf;
      Activation _activation = decorationDescription.getActivation();
      AbstractCondition _condition = null;
      if (_activation!=null) {
        _condition=_activation.getCondition();
      }
      this.condition = _condition;
      this.reevaluate();
    } else {
      List<GraphicalDecoration> _emptyList = CollectionLiterals.<GraphicalDecoration>emptyList();
      this.decorations = _emptyList;
      AbstractCondition _createAbstractCondition = DecorationLanguageFactory.eINSTANCE.createAbstractCondition();
      this.condition = _createAbstractCondition;
      this.decorationStatus = DecorationStatus.UNKNOWN;
    }
  }
  
  /**
   * Reevaluates the decoration status by examining the conditions found in {@link DecorationDescription}
   * 
   * @returns <code>true</code> if the activation status has changed.
   */
  public boolean reevaluate() {
    boolean changeOccured = false;
    boolean _isEmpty = this.decorations.isEmpty();
    boolean _equals = (_isEmpty == false);
    if (_equals) {
      for (final GraphicalDecoration d : this.decorations) {
        boolean _reevaluate = d.reevaluate();
        if (_reevaluate) {
          changeOccured = true;
        }
      }
    }
    boolean _equals_1 = Objects.equal(this.condition, null);
    if (_equals_1) {
      this.decorationStatus = DecorationStatus.ACTIVE;
    } else {
      final DecorationStatus newDecorationStatus = ConditionEvaluator.execute(this.condition, this.stereotypeApplication);
      boolean _equals_2 = Objects.equal(this.decorationStatus, DecorationStatus.INANCTIVE);
      if (_equals_2) {
        changeOccured = false;
      }
      boolean _notEquals = (!Objects.equal(newDecorationStatus, this.decorationStatus));
      if (_notEquals) {
        changeOccured = true;
      }
      this.decorationStatus = newDecorationStatus;
    }
    return changeOccured;
  }
  
  public List<GraphicalDecoration> getDecorations() {
    return this.decorations;
  }
  
  public StereotypeApplication getStereotypeApplication() {
    return this.stereotypeApplication;
  }
  
  public DecorationStatus getDecorationStatus() {
    return this.decorationStatus;
  }
  
  public boolean equals(final Object obj) {
    boolean _xblockexpression = false;
    {
      boolean _tripleEquals = (obj == this);
      if (_tripleEquals) {
        return true;
      }
      boolean _or = false;
      boolean _tripleEquals_1 = (obj == null);
      if (_tripleEquals_1) {
        _or = true;
      } else {
        Class<? extends Object> _class = obj.getClass();
        Class<? extends GraphicalDecorationDescription> _class_1 = this.getClass();
        boolean _tripleNotEquals = (_class != _class_1);
        _or = (_tripleEquals_1 || _tripleNotEquals);
      }
      if (_or) {
        return false;
      }
      final GraphicalDecorationDescription guest = ((GraphicalDecorationDescription) obj);
      boolean _and = false;
      boolean _equal = Objects.equal(this.stereotypeApplication, guest.stereotypeApplication);
      if (!_equal) {
        _and = false;
      } else {
        boolean _equals = this.decorations.equals(guest.decorations);
        _and = (_equal && _equals);
      }
      _xblockexpression = (_and);
    }
    return _xblockexpression;
  }
  
  public int hashCode() {
    int _hashCode = Objects.hashCode(this.stereotypeApplication, "31");
    return _hashCode;
  }
  
  public String toString() {
    String _xblockexpression = null;
    {
      Class<? extends GraphicalDecorationDescription> _class = this.getClass();
      String _simpleName = _class.getSimpleName();
      String _plus = (_simpleName + "@");
      int _hashCode = this.hashCode();
      String _hexString = Integer.toHexString(_hashCode);
      String _plus_1 = (_plus + _hexString);
      ToStringHelper _stringHelper = Objects.toStringHelper(_plus_1);
      ToStringHelper _add = _stringHelper.add("Status", this.decorationStatus);
      Stereotype _stereotype = this.stereotypeApplication.getStereotype();
      String _name = _stereotype.getName();
      ToStringHelper _add_1 = _add.add("Stereotype", _name);
      String _xifexpression = null;
      EObject _appliedTo = this.stereotypeApplication.getAppliedTo();
      if ((_appliedTo instanceof ENamedElement)) {
        EObject _appliedTo_1 = this.stereotypeApplication.getAppliedTo();
        String _name_1 = ((ENamedElement) _appliedTo_1).getName();
        _xifexpression = _name_1;
      } else {
        EObject _appliedTo_2 = this.stereotypeApplication.getAppliedTo();
        EClass _eClass = _appliedTo_2.eClass();
        String _name_2 = _eClass.getName();
        _xifexpression = _name_2;
      }
      ToStringHelper _add_2 = _add_1.add("appliedTo", _xifexpression);
      int _size = this.decorations.size();
      ToStringHelper _add_3 = _add_2.add("decorations size", _size);
      final ToStringHelper toStringHelper = _add_3.addValue(this.decorations);
      String _string = toStringHelper.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
}
