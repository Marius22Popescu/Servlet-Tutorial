package model;

import java.util.ArrayList;
import java.util.List;

public class CoffeeModel {
	
	public List<String> getTypes(String type) {
		
		List<String> types = new ArrayList<String>();
		if (type.equalsIgnoreCase("milky")) {	//If type("coffee") equals "milky" ignore capital letter
			types.add("coffee latte");
			types.add("coffee mocha");
			
		}else if (type.equalsIgnoreCase("froffy")) {
			types.add("coffee frabbcunio");
			types.add("coffee cappacunio");
			types.add("coffee java");
		}
		else if(type.equalsIgnoreCase("icy")) {
			types.add("Pumpkins spice latte");
		}
		else {
			types.add("Empty");
		}
		
		return types;
	}

}
