
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
    	Input input = new Input();
    	InputGUI gui = new InputGUI();
    	
    	int UseGui = gui.UseNewGui();
    	
    	if(UseGui == 0) {
    		
    		int javafile = input.SelectApp();
        	
        	if(javafile == 1) {
        		double upperLeftX, upperLeftY, lowerRightX, lowerRightY;
        		upperLeftX = Input.rasykOfFindAllStations(0);
        		upperLeftY = Input.rasykOfFindAllStations(1);
        		lowerRightX = Input.rasykOfFindAllStations(2);
        		lowerRightY = Input.rasykOfFindAllStations(3);
        		ASIA.findAllStationsInArea(upperLeftX,upperLeftY,lowerRightX,lowerRightY);
        	}
        	else if(javafile == 2){
        		double X, Y, r;
        		Y = Input.rasykOfFindAllStations(0);
        		X = Input.rasykOfFindAllStations(1);
        		r = Input.rasykOfFindAllStations(4);
        		ASIC.AllStationsInCircle(X, Y, r);
        	}
        	else if(javafile == 3){
        		BNTS.busnrtostops();
        	}
        	else if(javafile == 4){
        		double latA, lonA;
        		lonA = input.GetCoord(0);
        		latA = input.GetCoord(1);
        		CTS.coordinatesTostops(lonA, latA);
        	}
        	else if(javafile == 5){
        		double latA, lonA;
        		lonA = input.GetCoord(0);
        		latA = input.GetCoord(1);
        		FNS.FindNearestStot(latA,lonA);
        	}
        	else if(javafile == 6){
        		String Name = "";
        		Name = input.GetNameIn();
        		NTS.nametostops(Name);
        	}
        	else if(javafile == 7){
        		double uX, uY, lX, lY;
        		uX = Input.rasykOfFindAllStations(0);
        		uY = Input.rasykOfFindAllStations(1);
        		lX = Input.rasykOfFindAllStations(2);
        		lY = Input.rasykOfFindAllStations(3);
        		SWMR.findStationsWithMostRoutes(uX, uY, lX, lY);
        	}
        	else {
        		System.out.println("Error: Crash in Input.java");
        	}
    		
    	}
    	
    	else if(UseGui == 1) {
    		System.out.println("WORK IN PROGRESS");
    	}
    	else if(UseGui == 2) {
    		gui.v3Test();
    		// 	gui.test();
    	}
    	else {
    		System.out.println("Error");
    	}
    	
       // SpringApplication.run(new Class[] { Application.class }, args);

    }
}

// skaiciai testinimui, suvesti paeiliui: 54.7010105, 25.2050371, 54.6000005, 25.2060471

