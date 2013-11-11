/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.decorator;

import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Set;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.modelversioning.emfprofile.application.registry.EMFProfileApplicationDecorator;

/**
 * EMF Profile Application Decorators should extend this class.
 * 
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 */
@SuppressWarnings("all")
public abstract class AbstractEMFProfileApplicationDecorator extends MinimalEObjectImpl implements EMFProfileApplicationDecorator {
  private final Set<String> decoratableEditorIds;
  
  public AbstractEMFProfileApplicationDecorator() {
    Set<String> _provideEditorIds = this.provideEditorIds();
    this.decoratableEditorIds = _provideEditorIds;
  }
  
  protected abstract Set<String> provideEditorIds();
  
  public Collection<String> canDecorateEditorsWithFollowingIDs() {
    ImmutableSet<String> _copyOf = ImmutableSet.<String>copyOf(this.decoratableEditorIds);
    return _copyOf;
  }
}
