package kodas;

import java.util.ArrayList;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class BusNrToStops {
	
	public List<Station> busnrtostops(){
	
		Input input = new Input();
		HardCodedDb db = new HardCodedDb();
		boolean radau = false;
		List<Station> RastosStoteles = new ArrayList();
		
		input.GetBusName();
		boolean autobusas = input.ArCiaAutobusas;
		String Name = input.AutobusoNumeris;
		String AutobusoFiltras = "";
		
		if(autobusas) {
			AutobusoFiltras = "Autobusas";
		}
		else {
			AutobusoFiltras = "Troleibusas";
		}
		
		
		
		
		
		for(int i = 0; i < db.getStoteles().size(); i++) {
			 
			
			for(int j = 0; j<db.getStoteles().get(i).getRoutes().length;j++) {
				
			if(db.getStoteles().get(i).getRoutes()[j].contains(AutobusoFiltras+" "+Name.toUpperCase())) {
				radau = true;
				
				if(!RastosStoteles.contains(db.getStoteles().get(i).getName())) {
					RastosStoteles.add(db.getStoteles().get(i));
					System.out.println(db.getStoteles().get(i).getName());
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
