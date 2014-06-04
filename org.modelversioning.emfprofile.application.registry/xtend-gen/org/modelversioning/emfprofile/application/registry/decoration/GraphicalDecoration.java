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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.modelversioning.emfprofile.Stereotype;
import org.modelversioning.emfprofile.application.registry.decoration.ConditionEvaluator;
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractCondition;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractDecoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Activation;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 */
@SuppressWarnings("all")
public class GraphicalDecoration {
  private final AbstractDecoration decoration;
  
  private final StereotypeApplication stereotypeApplication;
  
  private DecorationStatus decorationStatus;
  
  public GraphicalDecoration(final AbstractDecoration decoration, final StereotypeApplication stereotypeApplication) {
    this.decoration = decoration;
    this.stereotypeApplication = stereotypeApplication;
    this.reevaluate();
  }
  
  public boolean reevaluate() {
    boolean changeOccured = false;
    Activation _activation = this.decoration.getActivation();
    AbstractCondition _condition = null;
    if (_activation!=null) {
      _condition=_activation.getCondition();
    }
    final AbstractCondition condition = _condition;
    InputOutput.<AbstractCondition>println(condition);
    boolean _equals = Objects.equal(condition, null);
    if (_equals) {
      this.decorationStatus = DecorationStatus.ACTIVE;
      changeOccured = true;
    } else {
      final DecorationStatus newDecorationStatus = ConditionEvaluator.execute(condition, this.stereotypeApplication);
      boolean _and = false;
      boolean _equals_1 = Objects.equal(this.decorationStatus, DecorationStatus.INANCTIVE);
      if (!_equals_1) {
        _and = false;
      } else {
        boolean _equals_2 = Objects.equal(newDecorationStatus, DecorationStatus.INANCTIVE);
        _and = (_equals_1 && _equals_2);
      }
      if (_and) {
        return false;
      }
      this.decorationStatus = newDecorationStatus;
      changeOccured = true;
    }
    return changeOccured;
  }
  
  public AbstractDecoration getDecoration() {
    return this.decoration;
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
        Class<? extends GraphicalDecoration> _class_1 = this.getClass();
        boolean _tripleNotEquals = (_class != _class_1);
        _or = (_tripleEquals_1 || _tripleNotEquals);
      }
      if (_or) {
        return false;
      }
      final GraphicalDecoration guest = ((GraphicalDecoration) obj);
      boolean _and = false;
      boolean _equal = Objects.equal(this.stereotypeApplication, guest.stereotypeApplication);
      if (!_equal) {
        _and = false;
      } else {
        boolean _equal_1 = Objects.equal(this.decoration, guest.decoration);
        _and = (_equal && _equal_1);
      }
      _xblockexpression = (_and);
    }
    return _xblockexpression;
  }
  
  public int hashCode() {
    int _hashCode = Objects.hashCode(this.stereotypeApplication, this.decoration);
    return _hashCode;
  }
  
  public String toString() {
    Class<? extends GraphicalDecoration> _class = this.getClass();
    String _simpleName = _class.getSimpleName();
    String _plus = (_simpleName + "@");
    int _hashCode = this.hashCode();
    String _hexString = Integer.toHexString(_hashCode);
    String _plus_1 = (_plus + _hexString);
    ToStringHelper _stringHelper = Objects.toStringHelper(_plus_1);
    ToStringHelper _addValue = _stringHelper.addValue(this.decoration);
    ToStringHelper _add = _addValue.add("Status", this.decorationStatus);
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
    String _string = _add_2.toString();
    return _string;
  }
}
