/**
 * Copyright (c) 2010 - 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry;

import java.util.Collection;
import org.eclipse.emf.ecore.EObject;
import org.modelversioning.emfprofileapplication.StereotypeApplication;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>EMF Profile Application Decorator</b></em>'. <!-- end-user-doc -->
 * 
 * 
 * @see org.modelversioning.emfprofile.application.registry.metadata.EMFProfileApplicationRegistryPackage#getEMFProfileApplicationDecorator()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EMFProfileApplicationDecorator extends EObject {

	/**
	 * <!-- begin-user-doc --> Return a collection of editor IDs which this
	 * decorator supports.<!-- end-user-doc -->
	 * 
	 * @model dataType=
	 *        "org.modelversioning.emfprofile.application.registry.Collection<org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	Collection<String> canDecorateEditorsWithFollowingIDs();

	/**
	 * <!-- begin-user-doc -->Will decorate graphical representation of
	 * {@link EObject} found in {@link StereotypeApplication#getAppliedTo()}
	 * with decoration description that can be found for a
	 * {@link StereotypeApplication#getStereotype()}.<!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void decorate(StereotypeApplication stereotypeApplication);

	/**
	 * <!-- begin-user-doc -->Undecorates graphical representation of an
	 * {@link EObject}.<!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void undecorate(StereotypeApplication stereotypeApplication);

	/**
	 * <!-- begin-user-doc -->The implementation of this method will try to
	 * resolve the {@link EObject} from the provided parameter. It is expected
	 * to provide an editor selection from which an {@link EObject} will be
	 * resolved.
	 * 
	 * @return an instance of {@link EObject} found under the selection or
	 *         <code>null</code> if no {@link EObject} could be found. <!--
	 *         end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject resolveEObjectFromEditorSelection(Object selection);
} // EMFProfileApplicationDecorator
