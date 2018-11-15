package lt.baltictalents.stoteliutinklas.config;

import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(
	"lt.*"
)
public class Application {

    public static void main(String[] args) {
    	FindNearestStotele findStot = new FindNearestStotele();
    	findStot.FindNearestStot();
    	
    	
        SpringApplication.run(new Class[] { Application.class }, args);
    }
}

