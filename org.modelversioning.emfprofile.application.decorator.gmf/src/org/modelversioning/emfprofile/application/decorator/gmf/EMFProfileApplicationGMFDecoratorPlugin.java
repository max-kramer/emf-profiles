package org.modelversioning.emfprofile.application.decorator.gmf;

import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.graphics.Image;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.IconDecorator;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class EMFProfileApplicationGMFDecoratorPlugin implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		EMFProfileApplicationGMFDecoratorPlugin.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		EMFProfileApplicationGMFDecoratorPlugin.context = null;

		// dispose created images
		for (Entry<URI, Image> entry : IconDecorator.imageRegistry.entrySet()) {
			entry.getValue().dispose();
		}
	}

}
