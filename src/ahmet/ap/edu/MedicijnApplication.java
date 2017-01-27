package ahmet.ap.edu;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;



public class MedicijnApplication extends Application {
	@Override
	public synchronized Restlet createInboundRoot(){
		
		Router router = new Router(getContext());

        // Defines only one route
        router.attach("/medicijn", MedicijnResource.class);
        router.attach("/medicijn/{medi}",SearchResource.class);
        return router;
		
		
		
	}

}
