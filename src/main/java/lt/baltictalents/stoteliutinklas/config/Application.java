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
    	FindByName FBN = new FindByName(); //Done
    	FindNearestStotele FNS = new FindNearestStotele(); // Work In Progress
    	CoordinatesToStops CTS = new CoordinatesToStops(); //Done
    	NameToStops NTS = new NameToStops();// Work In Progress
    	
    	//FNS.FindNearestStot();
    	//FBN.FindByN();
    	//CTS.coordinatesTostops();
    	NTS.nametostops();
    	allStationsInArea.findAllStationsInArea();
    	
       // SpringApplication.run(new Class[] { Application.class }, args);

    }
}

// skaiciai testinimui, suvesti paeiliui: 54.7010105, 25.2050371, 54.6000005, 25.2060471