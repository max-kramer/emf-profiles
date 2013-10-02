/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.xtext.emfprofile;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 *
 */
public class EMFProfileRuntimeModule extends
		AbstractGenericResourceRuntimeModule {

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule#getLanguageName()
	 */
	@Override
	protected String getLanguageName() {
		return "org.modelversioning.emfprofile.diagram.part.EMFProfileDiagramEditorID";
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule#getFileExtensions()
	 */
	@Override
	protected String getFileExtensions() {
		return "emfprofile_diagram";
	}

	public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
        return EMFProfileResourceDescriptionStrategy.class;
    }
 
    @Override
    public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return EMFProfileQualifiedNameProvider.class;
    }
}
