/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.xtext.ui.emfprofile;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.LanguageSpecific;
import org.eclipse.xtext.ui.editor.IURIEditorOpener;
import org.eclipse.xtext.ui.resource.generic.EmfUiModule;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 *
 */
public class EMFProfileUiModule extends EmfUiModule {
	
	public EMFProfileUiModule(AbstractUIPlugin plugin) {
        super(plugin);
    }
 
    @Override
    public void configureLanguageSpecificURIEditorOpener(com.google.inject.Binder binder) {
        binder.bind(IURIEditorOpener.class).annotatedWith(LanguageSpecific.class).to(EMFProfileEditorOpener.class);
    }
}
