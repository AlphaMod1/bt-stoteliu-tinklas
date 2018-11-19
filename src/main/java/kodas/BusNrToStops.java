package kodas;

import java.util.ArrayList;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class BusNrToStops {
	
	public void busnrtostops(){
	
		Input input = new Input();
		HardCodedDb db = new HardCodedDb();
		boolean radau = false;
		List<String> RastosStoteles = new ArrayList();
		
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
				
			if(db.getStoteles().get(i).getRoutes()[j].contains(AutobusoFiltras+" "+Name)) {
				radau = true;
				RastosStoteles.add(db.getStoteles().get(i).getName());
				//if()
				System.out.println(db.getStoteles().get(i).getName());
			}
			
			}
		}
		
		if(!radau) {
			System.out.println("Error: Wrong input");
		}
		
	}

}
