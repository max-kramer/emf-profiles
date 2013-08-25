/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.ui.propertytester;

import org.eclipse.core.expressions.PropertyTester;
import org.modelversioning.emfprofile.application.registry.ProfileApplicationRegistry;

/**
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 *
 */
public class ShouldShowPopupMenuContributionForApplyStereotypeTester extends
		PropertyTester {

	/**
	 * 
	 */
	public ShouldShowPopupMenuContributionForApplyStereotypeTester() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.expressions.IPropertyTester#test(java.lang.Object, java.lang.String, java.lang.Object[], java.lang.Object)
	 */
	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		String activePartId = receiver.toString();
		return ProfileApplicationRegistry.INSTANCE.hasProfileApplicationDecoratorForEditorId(activePartId);
	}

}
