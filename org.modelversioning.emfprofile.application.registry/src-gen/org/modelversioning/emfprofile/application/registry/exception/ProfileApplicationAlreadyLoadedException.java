package org.modelversioning.emfprofile.application.registry.exception;

import org.eclipse.core.resources.IFile;

/**
 * An exception that signals that a specific {@link IFile profile
 * application file} is already loaded.
 * 
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 * 
 */
public class ProfileApplicationAlreadyLoadedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6650443602783227939L;

	public ProfileApplicationAlreadyLoadedException() {
		super();
	}

	public ProfileApplicationAlreadyLoadedException(String message,
			Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ProfileApplicationAlreadyLoadedException(String message,
			Throwable cause) {
		super(message, cause);
	}

	public ProfileApplicationAlreadyLoadedException(String message) {
		super(message);
	}

	public ProfileApplicationAlreadyLoadedException(Throwable cause) {
		super(cause);
	}

}