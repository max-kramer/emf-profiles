/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.xtext.emfprofile;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 *
 */
public class EMFProfileSupport extends AbstractGenericResourceSupport {

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport#createGuiceModule()
	 */
	@Override
	protected Module createGuiceModule() {
		return new EMFProfileRuntimeModule();
	}

}
