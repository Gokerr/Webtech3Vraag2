package ahmet.ap.edu;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class SearchResource extends ServerResource {

	@Get("txt")
	public static String getmedicijn(){
		String medi = getAttribute("medi");
		StringBuilder sb = new StringBuilder();
		for (String q : MedicijnenOphalen.getMedicijnen(medi)){
			sb.append(q + ";;");
		}
		return sb.toString();
	}
	
	
	
}
