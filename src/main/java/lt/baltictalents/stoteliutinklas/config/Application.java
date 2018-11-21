
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
    		
    	int javafile = -1;
    	
    	AllStationsInArea ASIA = new AllStationsInArea();
    	StationsWithMostRoutes SWMR = new StationsWithMostRoutes();
    	FindNearestStotele FNS = new FindNearestStotele();
    	CoordinatesToStops CTS = new CoordinatesToStops();
    	NameToStops NTS = new NameToStops();
    	BusNrToStops BNTS = new BusNrToStops(); 
    	AllStationsInCircle ASIC = new AllStationsInCircle();
    	Input input = new Input();
    	
    	javafile = input.SelectApp();
    	
    	if(javafile == 1) {
    		double upperLeftX, upperLeftY, lowerRightX, lowerRightY;
    		upperLeftX = Input.rasykOfFindAllStations(0);
    		upperLeftY = Input.rasykOfFindAllStations(1);
    		lowerRightX = Input.rasykOfFindAllStations(2);
    		lowerRightY = Input.rasykOfFindAllStations(3);
    		ASIA.findAllStationsInArea(upperLeftX,upperLeftY,lowerRightX,lowerRightY);
    	}
    	else if(javafile == 2){
    		ASIC.AllStationsInCircle();
    	}
    	else if(javafile == 3){
    		BNTS.busnrtostops();
    	}
    	else if(javafile == 4){
    		CTS.coordinatesTostops();
    	}
    	else if(javafile == 5){
    		FNS.FindNearestStot();
    	}
    	else if(javafile == 6){
    		NTS.nametostops();
    	}
    	else if(javafile == 7){
    		SWMR.findStationsWithMostRoutes();
    	}
    	else {
    		System.out.println("Error: Crash in Input.java");
    	}
    	
    	
    	
       // SpringApplication.run(new Class[] { Application.class }, args);

    }
}

// skaiciai testinimui, suvesti paeiliui: 54.7010105, 25.2050371, 54.6000005, 25.2060471

