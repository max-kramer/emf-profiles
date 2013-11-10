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
import org.modelversioning.emfprofile.Stereotype;
import org.modelversioning.emfprofile.application.registry.decoration.ConditionEvaluator;
import org.modelversioning.emfprofile.application.registry.decoration.DecorationStatus;
import org.modelversioning.emfprofile.decoration.decorationLanguage.AbstractCondition;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Activation;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Decoration;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 */
@SuppressWarnings("all")
public class GraphicalDecoration {
  private final Decoration decoration;
  
  private final StereotypeApplication stereotypeApplication;
  
  private DecorationStatus decorationStatus;
  
  public GraphicalDecoration(final Decoration decoration, final StereotypeApplication stereotypeApplication) {
    this.decoration = decoration;
    this.stereotypeApplication = stereotypeApplication;
    this.reevaluate();
  }
  
  public void reevaluate() {
    Activation _activation = this.decoration.getActivation();
    AbstractCondition _condition = null;
    if (_activation!=null) {
      _condition=_activation.getCondition();
    }
    final AbstractCondition condition = _condition;
    boolean _equals = Objects.equal(condition, null);
    if (_equals) {
      this.decorationStatus = DecorationStatus.ACTIVE;
    } else {
      DecorationStatus _execute = ConditionEvaluator.execute(condition, 
        this.stereotypeApplication);
      this.decorationStatus = _execute;
    }
    return;
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
        boolean _notEquals = (!Objects.equal(_class, _class_1));
        _or = (_tripleEquals_1 || _notEquals);
      }
      if (_or) {
        return false;
      }
      final GraphicalDecoration guest = ((GraphicalDecoration) obj);
      boolean _and = false;
      boolean _and_1 = false;
      boolean _equal = Objects.equal(this.stereotypeApplication, guest.stereotypeApplication);
      if (!_equal) {
        _and_1 = false;
      } else {
        boolean _equal_1 = Objects.equal(this.decoration, guest.decoration);
        _and_1 = (_equal && _equal_1);
      }
      if (!_and_1) {
        _and = false;
      } else {
        boolean _equal_2 = Objects.equal(this.decorationStatus, guest.decorationStatus);
        _and = (_and_1 && _equal_2);
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
    Stereotype _stereotype = this.stereotypeApplication.getStereotype();
    String _name = _stereotype.getName();
    ToStringHelper _add = _stringHelper.add("Stereotype", _name);
    EObject _appliedTo = this.stereotypeApplication.getAppliedTo();
    String _name_1 = ((ENamedElement) _appliedTo).getName();
    ToStringHelper _add_1 = _add.add("appliedTo", _name_1);
    EClass _eClass = this.decoration.eClass();
    String _name_2 = _eClass.getName();
    ToStringHelper _add_2 = _add_1.add("Decoration", _name_2);
    ToStringHelper _add_3 = _add_2.add("Status", 
      this.decorationStatus);
    String _string = _add_3.toString();
    return _string;
  }
}
