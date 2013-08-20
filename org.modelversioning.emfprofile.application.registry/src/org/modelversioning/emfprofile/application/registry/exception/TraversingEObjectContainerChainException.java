package org.modelversioning.emfprofile.application.registry.exception;

import org.eclipse.emf.ecore.EObject;

/**
 * An exception that signals that at some point of traversal a container
 * {@link EObject} was <code>null</code> and that in that case the link to
 * desired parent was broken. <br />
 * The last container/parent {@link EObject} that was found by traversing
 * the parent chain can be retrieved by calling the
 * {@link #getLastParentFound()} method.
 * 
 * @author <a href="mailto:becirb@gmail.com">Becir Basic</a>
 * 
 */
public class TraversingEObjectContainerChainException extends Exception {
	private static final long serialVersionUID = 4744210451615438874L;

	private EObject parent;

	public TraversingEObjectContainerChainException() {
		super();
	}

	public TraversingEObjectContainerChainException(String message,
			Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public TraversingEObjectContainerChainException(String message,
			Throwable cause) {
		super(message, cause);
	}

	public TraversingEObjectContainerChainException(String message) {
		super(message);
	}

	public TraversingEObjectContainerChainException(Throwable cause) {
		super(cause);
	}

	public TraversingEObjectContainerChainException(EObject parent) {
		super(
				"Could not traverse to desired parent. The last reachable was: "
						+ parent.toString());
		this.parent = parent;
	}

	/**
	 * @return the last container/parent {@link EObject} that was found by
	 *         traversing the parent chain.
	 */
	public EObject getLastParentFound() {
		return this.parent;
	}
}