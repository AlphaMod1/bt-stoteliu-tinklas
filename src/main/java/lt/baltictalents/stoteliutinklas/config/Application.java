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
    	
    	
    	FindByName FBN = new FindByName(); //Done
    	FindNearestStotele FNS = new FindNearestStotele(); // Work In Progress
    	CoordinatesToStops CTS = new CoordinatesToStops(); //Done
    	NameToStops NTS = new NameToStops();// Work In Progress
    	
    	//FNS.FindNearestStot();
    	//FBN.FindByN();
    	//CTS.coordinatesTostops();
    	NTS.nametostops();
    	
    	
       // SpringApplication.run(new Class[] { Application.class }, args);
    }
}

