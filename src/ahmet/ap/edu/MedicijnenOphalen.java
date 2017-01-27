package ahmet.ap.edu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MedicijnenOphalen {
	private static final String FILENAME = "C:\\Users/AG/Desktop/Nieuwemap/test.txt";
	
public static ArrayList<String> getMedicijnen(String search) {
		
		ArrayList<String> array = new ArrayList<>();
		
		for (String medicijn : allmedicijnen()){
			if (medicijn.contains(search)) {
				array.add(medicijn);
			}
		}
		return array;
	}
	
	public static String[] allmedicijnen(){
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		try {
			br = new BufferedReader(new FileReader(FILENAME));
		    String line = br.readLine();

		    while (line != null) {
		    	if (line.length() == 0) {
		    		sb.append("{");
		    	}
		    	else{
		    		sb.append(line);
		    	}
		        
		        line = br.readLine();
		    }
		}
	    catch (Exception e){
		    System.out.println(e.getMessage());
	    }
		finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
		System.out.println(sb.toString());
		
		return sb.toString().split("{");
	}

}
