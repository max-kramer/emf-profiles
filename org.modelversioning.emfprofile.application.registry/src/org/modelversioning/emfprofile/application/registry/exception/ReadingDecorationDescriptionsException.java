/**
 * Copyright (c) 2013 modelversioning.org
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.modelversioning.emfprofile.application.registry.exception;

/**
 * Will be thrown if there is no decoration descriptions resource found in the
 * profile project or the syntax has errors or there are semantical violations.
 * These are visible when the decoration descriptions resource is opened in
 * editor.
 * 
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 * 
 */
public class ReadingDecorationDescriptionsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public ReadingDecorationDescriptionsException() {
	}

	/**
	 * @param message
	 */
	public ReadingDecorationDescriptionsException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ReadingDecorationDescriptionsException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ReadingDecorationDescriptionsException(String message,
			Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ReadingDecorationDescriptionsException(String message,
			Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
