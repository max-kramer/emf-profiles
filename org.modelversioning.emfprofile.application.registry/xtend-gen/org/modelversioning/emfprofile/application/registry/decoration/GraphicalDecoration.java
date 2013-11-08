/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.decoration;

import com.google.common.base.Objects;
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
}
