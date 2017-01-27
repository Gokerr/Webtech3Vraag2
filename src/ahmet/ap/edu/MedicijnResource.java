package ahmet.ap.edu;

import java.io.BufferedWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONObject;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;


public class MedicijnResource extends ServerResource {
	
	private static final String FILENAME = "C:\\Users/AG/Desktop/Nieuwemap/test.txt";
	
	@Get
	public String Alles(){
		
		 {
			StringBuilder sb = new StringBuilder();
			for (String q : MedicijnenOphalen.allmedicijnen()){
				sb.append(q + "{");
			}
			return sb.toString();
		}
	}

	@Post("txt")
	public void VoegToe(String json) throws IOException{
		
		JSONObject medicijn = new JSONObject(json);
		medicijn.getString("naam");
		medicijn.getString("vervaldatum");
		medicijn.getString("producent");
		medicijn.getString("hoeveelheid");	
		
		File file=new File(FILENAME);
		FileWriter fw=new FileWriter(file,true);
		BufferedWriter bf=new BufferedWriter(fw);
		PrintWriter pr=new PrintWriter(bf);
		pr.print(medicijn.toString());
		pr.close();
		
		
	}

}
