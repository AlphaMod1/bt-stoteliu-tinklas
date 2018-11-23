
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
    		
    	String LongLine = "=========================================";
    	String nl = System.getProperty("line.separator");
    	
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
    		boolean working = true;
    		while(working) {
    		int javafile = input.SelectApp();
        	if( javafile == 0) {
        		System.exit(0);
        	}
    		else if(javafile == 1) {
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
        		input.GetBusName();
        		boolean autobusas = input.ArCiaAutobusas;
        		String Name = input.AutobusoNumeris;
        		BNTS.busnrtostops(autobusas, Name);
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
        	System.out.println();
    		}

    	}
    	
    	else if(UseGui == 1) {
    		boolean working = true;
    		int select = -2;
    		while(working) {
    			select = input.ShellAppSelect();
    			
    			if(select == -2) {
    				System.exit(0);
    			}
    			else if(select == -1) {
    				System.out.println("Type 'help' or '?' for help");
    			}
    			else if(select == 0) {
    				System.out.println(nl+LongLine+nl+"Commands:"+nl+LongLine+nl+"AllStationsInArea(ASIA),"+nl+"StationsWithMostRoutes(SWMR),"+nl+
    						"FindNearestStotele(FNS),"+nl+"CoordinatesToStops(CTS),"+nl+"NameToStops(NTS), BusNrToStops(BNTS),"+nl+
    						"AllStationsInCircle(ASIC)"+nl+LongLine+nl);
    				
    			}
    			else if(select == 1) {
    				
    				double[] argumentai = {0,0,0,0};
    				if(input.GetShellArg().length == 5) {
    					try {
    					for(int i = 1; i < 5; i++) {
    						argumentai[i-1] = Double.parseDouble(input.GetShellArg()[i]);	 
    					}
    					}
    					catch(NumberFormatException e){
    						System.out.println("Error: Invalid arg");
        					System.out.println(input.GetShellArg()[0]+" double, double, double, double");
    					}

    					ASIA.findAllStationsInArea(argumentai[0], argumentai[1], argumentai[2], argumentai[3]);
    				}
    				else {
    					System.out.println("Error: Invalid arg");
    					System.out.println(input.GetShellArg()[0]+" double, double, double, double");
    				}
    				
    				
    			}
    			else if(select == 2) {
    				
    				double[] argumentai = {0,0,0};
    				if(input.GetShellArg().length == 4) {
    					try {
    					for(int i = 1; i < 4; i++) {
    						argumentai[i-1] = Double.parseDouble(input.GetShellArg()[i]);	 
    					}
    					}
    					catch(NumberFormatException e){
    						System.out.println("Error: Invalid arg");
        					System.out.println(input.GetShellArg()[0]+" double, double, double");
    					}

    					ASIC.AllStationsInCircle(argumentai[0], argumentai[1], argumentai[2]);
    				}
    				else {
    					System.out.println("Error: Invalid arg");
    					System.out.println(input.GetShellArg()[0]+" double, double, double");
    				}
    				
    			}
    			else if(select == 3) {	

    				if(input.GetShellArg().length == 3) {
    					if(input.GetShellArg()[1].equalsIgnoreCase("-a") || input.GetShellArg()[1].equalsIgnoreCase("-t")) {
    						if(input.GetShellArg()[1].equalsIgnoreCase("-a")) {
    							BNTS.busnrtostops(true, input.GetShellArg()[2]);
    						}
    						else {
    							BNTS.busnrtostops(false, input.GetShellArg()[2]);
    						}
    					}
    					else {
        					System.out.println("Error: Invalid arg");
        					System.out.println(input.GetShellArg()[0]+" boolean(use -A or -T), String(bus number)");
    					}
    				}
    				else {
    					System.out.println("Error: Invalid arg");
    					System.out.println(input.GetShellArg()[0]+" boolean(use -A or -T), String(bus number)");
    				}
    					
    				
    			}
    			else if(select == 4) {
    			
    				double[] argumentai = {0,0};
    				if(input.GetShellArg().length == 3) {
    					try {
    					for(int i = 1; i < 3; i++) {
    						argumentai[i-1] = Double.parseDouble(input.GetShellArg()[i]);	 
    					}
    					}
    					catch(NumberFormatException e){
    						System.out.println("Error: Invalid arg");
        					System.out.println(input.GetShellArg()[0]+" double, double");
    					}

    					CTS.coordinatesTostops(argumentai[0], argumentai[1]);
    				}
    				else {
    					System.out.println("Error: Invalid arg");
    					System.out.println(input.GetShellArg()[0]+" double, double");
    				}
    				
    			}
    			else if(select == 5) {
    				
    				double[] argumentai = {0,0};
    				if(input.GetShellArg().length == 3) {
    					try {
    					for(int i = 1; i < 3; i++) {
    						argumentai[i-1] = Double.parseDouble(input.GetShellArg()[i]);	 
    					}
    					}
    					catch(NumberFormatException e){
    						System.out.println("Error: Invalid arg");
        					System.out.println(input.GetShellArg()[0]+" double, double");
    					}

    					CTS.coordinatesTostops(argumentai[0], argumentai[1]);
    				}
    				else {
    					System.out.println("Error: Invalid arg");
    					System.out.println(input.GetShellArg()[0]+" double, double");
    				}
    				
    			}
    			else if(select == 6) {
    				
    				if(input.GetShellArg().length == 2) {
    					NTS.nametostops(input.GetShellArg()[1]);
    				}
    				else {
    					System.out.println("Error: Invalid arg");
    					System.out.println(input.GetShellArg()[0]+" String(Name)");
    				}
    				
    			}
    			else if(select == 7) {
    				
    				double[] argumentai = {0,0,0,0};
    				if(input.GetShellArg().length == 5) {
    					try {
    					for(int i = 1; i < 5; i++) {
    						argumentai[i-1] = Double.parseDouble(input.GetShellArg()[i]);	 
    					}
    					}
    					catch(NumberFormatException e){
    						System.out.println("Error: Invalid arg");
        					System.out.println(input.GetShellArg()[0]+" double, double, double, double");
    					}

    					ASIA.findAllStationsInArea(argumentai[0], argumentai[1], argumentai[2], argumentai[3]);
    				}
    				else {
    					System.out.println("Error: Invalid arg");
    					System.out.println(input.GetShellArg()[0]+" double, double, double, double");
    				}
    				
    			}
    			else {
    				System.out.println("Error");
    			}
    			
    			
    		}
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

