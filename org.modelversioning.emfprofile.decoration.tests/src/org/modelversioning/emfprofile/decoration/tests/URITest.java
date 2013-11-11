package org.modelversioning.emfprofile.decoration.tests;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.junit.Test;

public class URITest {


	@Test
	public final void test() throws CoreException {

		IProject project = 
				ResourcesPlugin.getWorkspace().getRoot().getProject("myproject");
				if (!project.exists())
				{
				  project.create(new NullProgressMonitor());
				}

				System.out.println("\n==== platform:/resource ====");
				{
				  URI uri = URI.createPlatformResourceURI("myproject", true);
				  System.out.println(uri);
				  System.out.println(CommonPlugin.resolve(uri));
				  
				  uri = uri.appendSegments(new String[]{"folder", "file.txt"});
				  System.out.println(uri);
				  System.out.println(CommonPlugin.resolve(uri));
				}

				System.out.println("\n==== platform:/plugin ====");
				{
				  // Just for fun, choose a bundle that is not in the default location
				  URI uri = URI.createPlatformPluginURI("org.eclipse.emf.ecore", true);
				  System.out.println(uri);
				  System.out.println(CommonPlugin.resolve(uri));
				  
				  uri = uri.appendSegments(new String[]{"model", "Ecore.ecore"});
				  System.out.println(uri);
				  System.out.println(CommonPlugin.resolve(uri));

				  // Choose a bundle that is in the default location (<eclipse-dir>/plugins)
				  uri = URI.createPlatformPluginURI("org.eclipse.core.resources", true);
				  System.out.println(uri);
				  System.out.println(CommonPlugin.resolve(uri));

				  uri = uri.appendSegments(new String[]{"META-INF", "MANIFEST.MF"});
				  System.out.println(uri);
				  System.out.println(CommonPlugin.resolve(uri));
				}

				System.out.println("\n==== platform:/fragment ====");
				{
				  URI uri = URI.createURI("platform:/fragment/org.eclipse.swt");
				  System.out.println(uri);
				  System.out.println(CommonPlugin.resolve(uri));
				  
				  uri = uri.appendSegments(new String[]{"META-INF", "MANIFEST.MF"});
				  System.out.println(uri);
				  System.out.println(CommonPlugin.resolve(uri));
				}    

				System.out.println("\n==== platform:/config ====");
				{
				  URI uri = URI.createURI("platform:/config/");
				  System.out.println(uri);
				  System.out.println(CommonPlugin.resolve(uri));      
				}    

				System.out.println("\n==== platform:/base ====");
				{
				  URI uri = URI.createURI("platform:/base/");
				  System.out.println(uri);
				  System.out.println(CommonPlugin.resolve(uri));      
				}
	}

}
