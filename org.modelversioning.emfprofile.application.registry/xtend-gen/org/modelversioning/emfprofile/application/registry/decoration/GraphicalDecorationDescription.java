/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.decoration;

import com.google.common.base.Objects;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
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
}
