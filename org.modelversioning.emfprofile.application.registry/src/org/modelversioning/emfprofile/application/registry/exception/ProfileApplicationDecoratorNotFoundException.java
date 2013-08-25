/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.exception;

/**
 * Registry provides an extension point for which specific profile application
 * decorators can be implemented. Decorators are implemented for specific EMF
 * graphical editors. This exception is thrown when for a specific editor id no
 * profile application decorator implementation exists.
 * 
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 * 
 */
public class ProfileApplicationDecoratorNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public ProfileApplicationDecoratorNotFoundException() {
	}

	/**
	 * @param message
	 */
	public ProfileApplicationDecoratorNotFoundException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ProfileApplicationDecoratorNotFoundException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ProfileApplicationDecoratorNotFoundException(String message,
			Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ProfileApplicationDecoratorNotFoundException(String message,
			Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
