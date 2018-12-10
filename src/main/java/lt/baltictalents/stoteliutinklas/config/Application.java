
package lt.baltictalents.stoteliutinklas.config;

import java.io.IOException;
import java.sql.SQLException;

import lt.baltictalents.stoteliutinklas.Shell.Shell;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;


//@SpringBootApplication
//@ComponentScan(
//	"lt.*"
//)

public class Application {



	public static void main(String[] args) throws SQLException, IOException, InterruptedException{
    			
    	Shell shell = new Shell();
    	
    	shell.ShellStart();
    	
       // SpringApplication.run(new Class[] { Application.class }, args);

    }
}

// skaiciai testinimui, suvesti paeiliui: 54.7010105, 25.2050371, 54.6000005, 25.2060471

