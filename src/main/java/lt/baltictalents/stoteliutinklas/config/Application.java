
package lt.baltictalents.stoteliutinklas.config;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

import kodas.*;

//@SpringBootApplication
//@ComponentScan(
//	"lt.*"
//)
public class Application {

    public static void main(String[] args) {
    		
    	
    	AllStationsInArea allStationsInArea = new AllStationsInArea(); // Done
    	FindByName FBN = new FindByName(); // work in progress
    	FindNearestStotele FNS = new FindNearestStotele(); // Done
    	CoordinatesToStops CTS = new CoordinatesToStops(); //Done
    	NameToStops NTS = new NameToStops();// Done
    	BusNrToStops BNTS = new BusNrToStops(); //Done 
    	AllStationsInCircle ASIC = new AllStationsInCircle();
    	
    	//FNS.FindNearestStot();
    	//FBN.FindByN();
    	//CTS.coordinatesTostops();
    	//NTS.nametostops();
    	//BNTS.busnrtostops();
    	//allStationsInArea.findAllStationsInArea();
    	ASIC.AllStationsInCircle();
    	
       // SpringApplication.run(new Class[] { Application.class }, args);

    }
}

// skaiciai testinimui, suvesti paeiliui: 54.7010105, 25.2050371, 54.6000005, 25.2060471

