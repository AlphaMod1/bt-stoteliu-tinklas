package Functions;

import java.util.ArrayList;
import java.util.List;

import Input.Input;
import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class NameToStops {
	
	public List<String> nametostops(String Name, List<Station> readfrom) {
		
		Input input = new Input();
		HardCodedDb db = new HardCodedDb();
		List<String> Ats = new ArrayList();
		
		int rastosStotelesMarsrutuKiekis;
		boolean found = false;
		
		
		for(int i = 0; i < readfrom.size(); i++) {
			if(Name.equalsIgnoreCase(readfrom.get(i).getName())) {
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
