package lt.baltictalents.stoteliutinklas.Functions;

import java.util.ArrayList;
import java.util.List;

import lt.baltictalents.stoteliutinklas.Input.Input;
import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class BusNrToStops {
	
	public List<Station> busnrtostops(boolean autobusas, String Name, List<Station> readfrom){
	
		Input input = new Input();
		HardCodedDb db = new HardCodedDb();
		boolean radau = false;
		List<Station> RastosStoteles = new ArrayList();
		
		
		String AutobusoFiltras = "";
		
		if(autobusas) {
			AutobusoFiltras = "Autobusas";
		}
		else {
			AutobusoFiltras = "Troleibusas";
		}
		
		for(int i = 0; i < readfrom.size(); i++) {
			 
			
			for(int j = 0; j<readfrom.get(i).getRoutes().length;j++) {
				
			if(readfrom.get(i).getRoutes()[j].contains(AutobusoFiltras+" "+Name.toUpperCase())) {
				radau = true;
				
				if(!RastosStoteles.contains(readfrom.get(i).getName())) {
					RastosStoteles.add(readfrom.get(i));
					System.out.println(readfrom.get(i).getName());
				}
				
			}
			
			}
		}
		
		if(!radau) {
			System.out.println("Error: Wrong input");
			return null;
		}
		else {
			return RastosStoteles;
		}
		
	}

}
