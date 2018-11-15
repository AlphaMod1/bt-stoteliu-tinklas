package lt.baltictalents.stoteliutinklas.config;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

import kodas.FindByName;
import kodas.FindNearestStotele;;

//@SpringBootApplication
//@ComponentScan(
//	"lt.*"
//)
public class Application {

    public static void main(String[] args) {
    	FindByName findbyname = new FindByName(); //Done
    	FindNearestStotele findStot = new FindNearestStotele(); // Work In Progress
    	
    	findStot.FindNearestStot();
    	//findbyname.FindByN();
    	
       // SpringApplication.run(new Class[] { Application.class }, args);
    }
}

