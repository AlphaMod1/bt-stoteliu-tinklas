package kodas;

import java.util.ArrayList;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class NameToStops {
	
	public List<String> nametostops(String Name) {
		
		Input input = new Input();
		HardCodedDb db = new HardCodedDb();
		List<String> Ats = new ArrayList();
		
		int rastosStotelesMarsrutuKiekis;
		boolean found = false;
		
		
		for(int i = 0; i < db.getStoteles().size(); i++) {
			if(Name.equalsIgnoreCase(db.getStoteles().get(i).getName())) {
				rastosStotelesMarsrutuKiekis = db.getStoteles().get(i).getRoutes().length;
				
				for(int j = 0; j < rastosStotelesMarsrutuKiekis; j++) {
					 
				System.out.println(db.getStoteles().get(i).getRoutes()[j]);
				Ats.add(db.getStoteles().get(i).getRoutes()[j]);
					
				}
				
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("No stations found");
			return null;
		}
		else {
			return Ats;
		}
		
	}

}
