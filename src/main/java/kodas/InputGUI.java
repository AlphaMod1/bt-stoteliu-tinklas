package kodas;

import javax.swing.*;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;
public class InputGUI {

	HardCodedDb db = new HardCodedDb();
	
	public int UseNewGui() {
	
		Object[] options = {"v1", "v2", "v3"};
		int Ats = JOptionPane.showOptionDialog(null, "Select Shell Version", "Select",
		JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
		null, options, options[2]);
		
		return Ats;
	}
	
	
	public String v3Test() {
		
		String iv = JOptionPane.showInputDialog("WORK IN PROGRESS");
		
		boolean radau = false;
		System.out.println(iv);
		for(int i = 0; i < db.getStoteles().size(); i++) {
			 if(iv.equalsIgnoreCase(db.getStoteles().get(i).getName())) {
				 System.out.println("Radau");
				 radau = true;
			 }
			
		}
		
		if(!radau) {
			System.out.println("neradau");
		}
		
		return iv;
	}
	
	
	public void test() {
		
		int kiek = 5; //db.getStoteles().size();
			
		Object[] options = new Object[kiek];
		for(int i = 0; i < kiek; i++) {
			options[i] = db.getStoteles().get(i).getName();
		}

		int Ats = JOptionPane.showOptionDialog(null, "Select Shell Version", "Select",
		JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
		null, options, options[0]);
		
		
		
	}
	
	
}

