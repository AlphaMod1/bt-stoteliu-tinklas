package kodas;
import  lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;
import java.util.Scanner;

public class FindByName {
	
	public void FindByN() {
	
	HardCodedDb db = new HardCodedDb();
	
	String irasas = "Baltupiai";
	Scanner scan = new Scanner(System.in);
	
	//irasas = scan.next();
	
	for(int i = 0; i < db.stoteles.size(); i++) {
		if(irasas == db.stoteles.get(i).getName().toString()) {
			
			
			System.out.println("Radau");
		}
		else {
			System.out.println("Neradau");
		}
		
	}
	scan.close();
}
}

