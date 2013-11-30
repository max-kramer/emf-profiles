package org.modelversioning.emfprofile.application.decorator.gmf;

import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.AbstractDecorator;
import org.modelversioning.emfprofile.application.decorator.gmf.decoration.service.ImageDecorator;
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
		for (Entry<URI, Image> entry : ImageDecorator.imageRegistry.entrySet()) {
			entry.getValue().dispose();
		}
		
		// displose created colors
		for (Entry<RGB, Color> entry : AbstractDecorator.createdColors.entrySet()){
			entry.getValue().dispose();
		}
	}

}
