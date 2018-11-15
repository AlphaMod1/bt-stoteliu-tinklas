package kodas;

import javax.swing.JOptionPane;

import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class NameToStops {
	
	public void nametostops() {
		
		Input input = new Input();
		HardCodedDb db = new HardCodedDb();
		String Name = "";
		
		//Name = input.GetNameIn();
		
		String test1= JOptionPane.showInputDialog("A:");
		Name = test1;
		
		System.out.println(Name);
		String temp; boolean TEST = false;
		
		for(int i = 0; i < db.getStoteles().size(); i++) {
			temp = db.getStoteles().get(i).getName();
			if(temp == Name) {
				System.out.println("Yes"+i);
				TEST = true;
			}
		
		}
		System.out.println(TEST);
	}

}
