
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
    		
    	
    	AllStationsInArea ASIA = new AllStationsInArea();
    	StationsWithMostRoutes SWMR = new StationsWithMostRoutes();
    	FindNearestStotele FNS = new FindNearestStotele();
    	CoordinatesToStops CTS = new CoordinatesToStops();
    	NameToStops NTS = new NameToStops();
    	BusNrToStops BNTS = new BusNrToStops(); 
    	AllStationsInCircle ASIC = new AllStationsInCircle();
    	
    	//FNS.FindNearestStot();
    	//CTS.coordinatesTostops();
    	//NTS.nametostops();
    	//BNTS.busnrtostops();
    	//ASIA.findAllStationsInArea();
    	ASIC.AllStationsInCircle();
    	//SWMR.findStationsWithMostRoutes();
    	
    	
       // SpringApplication.run(new Class[] { Application.class }, args);

    }
}

// skaiciai testinimui, suvesti paeiliui: 54.7010105, 25.2050371, 54.6000005, 25.2060471

