package lt.baltictalents.stoteliutinklas.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(
	"lt.*"
)
public class Application {

    public static void main(String[] args) {
    	
    	AllStationsInArea allStationsInArea = new AllStationsInArea();
    	allStationsInArea.findAllStationsInArea(54.7010105f, 25.2050371f, 54.6000005f, 25.2060471f);
    	
        SpringApplication.run(new Class[] { Application.class }, args);
    }
}