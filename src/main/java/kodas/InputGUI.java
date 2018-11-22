package kodas;

import javax.swing.JOptionPane;

public class InputGUI {

	public int UseNewGui() {
	
		Object[] options = {"v1", "v2", "v3"};
		int Ats = JOptionPane.showOptionDialog(null, "Select Shell Version", "Select",
		JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
		null, options, options[0]);
		
		return Ats;
	}
	
	
	public String v3Test() {
		
		String inputValue = JOptionPane.showInputDialog("WORK IN PROGRESS");
		
		return inputValue;
	}
	
}

