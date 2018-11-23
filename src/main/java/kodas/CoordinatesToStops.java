package kodas;

import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

import java.util.ArrayList;
import java.util.List;




public class CoordinatesToStops {
	
	public List<String> coordinatesTostops(double lonA, double latA) {
		Input input = new Input();
		HardCodedDb db = new HardCodedDb();
		boolean found = false;
		int rastosStotelesMarsrutuKiekis = 0;
		List<String> Ats = new ArrayList();
		
		for(int i = 0; i < db.getStoteles().size(); i++) {
			double tempLat = 0;	
			double tempLon = 0; 
			tempLat = Double.parseDouble(db.getStoteles().get(i).getLatitude());
			tempLon = Double.parseDouble(db.getStoteles().get(i).getLongtitute());
			if(tempLat == latA && tempLon == lonA) {
				
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
