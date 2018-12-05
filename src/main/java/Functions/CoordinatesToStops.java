package Functions;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

import java.util.ArrayList;
import java.util.List;

import Input.Input;




public class CoordinatesToStops {
	
	public List<String> coordinatesTostops(double lonA, double latA, List<Station> readfrom) {
		Input input = new Input();
		HardCodedDb db = new HardCodedDb();
		boolean found = false;
		int rastosStotelesMarsrutuKiekis = 0;
		List<String> Ats = new ArrayList();
		
		for(int i = 0; i < readfrom.size(); i++) {
			double tempLat = 0;	
			double tempLon = 0; 
			tempLat = Double.parseDouble(readfrom.get(i).getLatitude());
			tempLon = Double.parseDouble(readfrom.get(i).getLongtitute());
			if(tempLat == latA && tempLon == lonA) {
				
				rastosStotelesMarsrutuKiekis = readfrom.get(i).getRoutes().length;
				
				for(int j = 0; j < rastosStotelesMarsrutuKiekis; j++) {
					 
				System.out.println(readfrom.get(i).getRoutes()[j]);
				Ats.add(readfrom.get(i).getRoutes()[j]);
					
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
