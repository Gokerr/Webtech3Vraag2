package ahmet.ap.edu;

import org.json.JSONObject;

import org.restlet.resource.ClientResource;

public class MedicijnClient {

	public static void main(String[] args) {
		try {
        	ClientResource resource = new ClientResource("http://127.0.0.1:8186/medicijn/medicijn");
        	
        	
        	JSONObject json = new JSONObject();
        	json.put("naam", "Defalgan");
    		json.put("vervaldatum", "02/04/2018");
    		json.put("producent", "MC-Hospital");
    		json.put("hoeveelheid", "500g");

    		resource.post(json.toString());
    		System.out.println(resource.getResponseEntity().getText());
    		
    		
        	JSONObject json2 = new JSONObject();
        	json2.put("naam", "Fitiligo");
    		json2.put("vervaldatum", "05/05/2020");
    		json2.put("producent", "Flexo");
    		json2.put("hoeveelheid", "500");
    		
    		resource.post(json2.toString());
    		System.out.println(resource.getResponseEntity().getText());
        	
        }
        catch (Exception e) {
            System.out.println("Je hebt een fout " + e.getMessage());
        }
    

	}

	

}
