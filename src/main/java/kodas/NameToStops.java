package kodas;

import javax.swing.JOptionPane;

import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class NameToStops {
	
	public void nametostops() {
		
		Input input = new Input();
		HardCodedDb db = new HardCodedDb();
		String Name = "";
		
		
		
		Name = input.GetNameIn();
		
		
		int rastosStotelesMarsrutuKiekis;
		boolean found = false;
		
		
		for(int i = 0; i < db.getStoteles().size(); i++) {
			if(Name.equalsIgnoreCase(db.getStoteles().get(i).getName())) {
				rastosStotelesMarsrutuKiekis = db.getStoteles().get(i).getRoutes().length;
				
				for(int j = 0; j < rastosStotelesMarsrutuKiekis; j++) {
					 
				System.out.println(db.getStoteles().get(i).getRoutes()[j]);
					
				}
				
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("No stations found");
		}
		
	}

}
