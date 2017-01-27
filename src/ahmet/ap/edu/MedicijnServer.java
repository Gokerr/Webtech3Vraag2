package ahmet.ap.edu;

import org.restlet.Component;

import org.restlet.data.Protocol;


public class MedicijnServer {

	public static void main(String[] args) {
try {
			
			// Create a new Component.
		    Component component = new Component();
	
		    // Add a new HTTP server listening on port 8181.
		    component.getServers().add(Protocol.HTTP, 8186);
	
		    // Attach the sample application.
		    component.getDefaultHost().attach("/medicijn", new MedicijnApplication());
			component.start();
		} 
	    catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	

}
