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
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
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
import org.modelversioning.emfprofile.decoration.decorationLanguage.Activation;
import org.modelversioning.emfprofile.decoration.decorationLanguage.Decoration;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationDescription;
import org.modelversioning.emfprofile.decoration.decorationLanguage.DecorationLanguageFactory;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * Describes decorations that will be attached to the graphical
 * representation of the EObject at which the stereotype was applied.
 * Decoration status must be evaluated from the conditions to decide weather to
 * show or hide the decorations.
 * 
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 */
@SuppressWarnings("all")
public class GraphicalDecorationDescription {
  private final StereotypeApplication stereotypeApplication;
  
  private final Set<GraphicalDecoration> decorations;
  
  private final AbstractCondition condition;
  
  private DecorationStatus decorationStatus;
  
  public GraphicalDecorationDescription(final StereotypeApplication stereotypeApplication, final DecorationDescription decorationDescription) {
    this.stereotypeApplication = stereotypeApplication;
    boolean _notEquals = (!Objects.equal(decorationDescription, null));
    if (_notEquals) {
      HashSet<GraphicalDecoration> _hashSet = new HashSet<GraphicalDecoration>();
      this.decorations = _hashSet;
      EList<Decoration> _decorations = decorationDescription.getDecorations();
      final Procedure1<Decoration> _function = new Procedure1<Decoration>() {
          public void apply(final Decoration d) {
            GraphicalDecoration _graphicalDecoration = new GraphicalDecoration(d, stereotypeApplication);
            GraphicalDecorationDescription.this.decorations.add(_graphicalDecoration);
          }
        };
      IterableExtensions.<Decoration>forEach(_decorations, _function);
      Activation _activation = decorationDescription.getActivation();
      AbstractCondition _condition = null;
      if (_activation!=null) {
        _condition=_activation.getCondition();
      }
      this.condition = _condition;
      this.reevaluate();
    } else {
      Set<GraphicalDecoration> _emptySet = CollectionLiterals.<GraphicalDecoration>emptySet();
      this.decorations = _emptySet;
      AbstractCondition _createAbstractCondition = DecorationLanguageFactory.eINSTANCE.createAbstractCondition();
      this.condition = _createAbstractCondition;
      this.decorationStatus = DecorationStatus.UNKNOWN;
    }
  }
  
  public void reevaluate() {
    final Procedure1<GraphicalDecoration> _function = new Procedure1<GraphicalDecoration>() {
        public void apply(final GraphicalDecoration it) {
          it.reevaluate();
        }
      };
    IterableExtensions.<GraphicalDecoration>forEach(this.decorations, _function);
    boolean _equals = Objects.equal(this.condition, null);
    if (_equals) {
      this.decorationStatus = DecorationStatus.ACTIVE;
    } else {
      DecorationStatus _execute = ConditionEvaluator.execute(this.condition, this.stereotypeApplication);
      this.decorationStatus = _execute;
    }
    return;
  }
  
  public Set<GraphicalDecoration> getDecorations() {
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
        boolean _notEquals = (!Objects.equal(_class, _class_1));
        _or = (_tripleEquals_1 || _notEquals);
      }
      if (_or) {
        return false;
      }
      final GraphicalDecorationDescription guest = ((GraphicalDecorationDescription) obj);
      boolean _and = false;
      boolean _and_1 = false;
      boolean _equal = Objects.equal(this.stereotypeApplication, guest.stereotypeApplication);
      if (!_equal) {
        _and_1 = false;
      } else {
        boolean _equal_1 = Objects.equal(this.decorationStatus, guest.decorationStatus);
        _and_1 = (_equal && _equal_1);
      }
      if (!_and_1) {
        _and = false;
      } else {
        boolean _equals = this.decorations.equals(guest.decorations);
        _and = (_and_1 && _equals);
      }
      _xblockexpression = (_and);
    }
    return _xblockexpression;
  }
  
  public int hashCode() {
    int _hashCode = Objects.hashCode(this.stereotypeApplication, "a1b2c3d4e5");
    return _hashCode;
  }
  
  public String toString() {
    Class<? extends GraphicalDecorationDescription> _class = this.getClass();
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
    ToStringHelper _add_2 = _add_1.add("Status", this.decorationStatus);
    int _size = this.decorations.size();
    ToStringHelper _add_3 = _add_2.add("decorations size", _size);
    ToStringHelper _add_4 = _add_3.add("stereotypeApplication", this.stereotypeApplication);
    String _string = _add_4.toString();
    return _string;
  }
}
