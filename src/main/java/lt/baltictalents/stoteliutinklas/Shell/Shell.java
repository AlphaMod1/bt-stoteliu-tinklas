package lt.baltictalents.stoteliutinklas.Shell;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lt.baltictalents.stoteliutinklas.Database.Database;
import lt.baltictalents.stoteliutinklas.Database.DatabaseStarter;
import lt.baltictalents.stoteliutinklas.Database.UpdateRenovationDateStarter;
import lt.baltictalents.stoteliutinklas.Database.databaseInitializationStarter;
import lt.baltictalents.stoteliutinklas.File_Reading.TxtReader;
import lt.baltictalents.stoteliutinklas.Functions.AllStationsInArea;
import lt.baltictalents.stoteliutinklas.Functions.AllStationsInCircle;
import lt.baltictalents.stoteliutinklas.Functions.BusNrToStops;
import lt.baltictalents.stoteliutinklas.Functions.CoordinatesToStops;
import lt.baltictalents.stoteliutinklas.Functions.FindNearestStotele;
import lt.baltictalents.stoteliutinklas.Functions.IntersectionsOfRoutes;
import lt.baltictalents.stoteliutinklas.Functions.NameToStops;
import lt.baltictalents.stoteliutinklas.Functions.PavilionsWithinDistance;
import lt.baltictalents.stoteliutinklas.Functions.StationsWithMostRoutes;
import lt.baltictalents.stoteliutinklas.Functions.WholeAreaStationsWithMostRoutes;
import lt.baltictalents.stoteliutinklas.Input.HelpDesk;
import lt.baltictalents.stoteliutinklas.Input.Input;
import lt.baltictalents.stoteliutinklas.Input.InputGUI;
import lt.baltictalents.stoteliutinklas.data.beans.Route;
import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class Shell {
    @SuppressWarnings("static-access")
	public void ShellStart() throws SQLException, IOException, InterruptedException{
    	
    	AllStationsInArea ASIA = new AllStationsInArea();
    	StationsWithMostRoutes SWMR = new StationsWithMostRoutes();
    	FindNearestStotele FNS = new FindNearestStotele();
    	CoordinatesToStops CTS = new CoordinatesToStops();
    	NameToStops NTS = new NameToStops();
    	BusNrToStops BNTS = new BusNrToStops(); 
    	AllStationsInCircle ASIC = new AllStationsInCircle();
    	IntersectionsOfRoutes IOR = new IntersectionsOfRoutes();
    	PavilionsWithinDistance pwd = new PavilionsWithinDistance();
    	WholeAreaStationsWithMostRoutes waswmr = new WholeAreaStationsWithMostRoutes();
    	HelpDesk helpDesk = new HelpDesk();
    	Input input = new Input();
    	InputGUI gui = new InputGUI();
    	TxtReader txtr = new TxtReader(); 
    	HardCodedDb db = new HardCodedDb();
    	DatabaseStarter dbmaker = new DatabaseStarter();
    	UpdateRenovationDateStarter udb = new UpdateRenovationDateStarter();
    	databaseInitializationStarter Initialization = new databaseInitializationStarter();
    	
    	List<Station> fromJAVA = db.getStoteles();
    	List<Station> fromTXT = txtr.readtxt();
    	List<Station> fromDB = Initialization.start("");
    	
    	int ReadFrom = 0;
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
        		if(ReadFrom == 0) {
        			ASIA.findAllStationsInArea(upperLeftX,upperLeftY,lowerRightX,lowerRightY,fromJAVA);
        		}
        		else if(ReadFrom == 1) {
        			ASIA.findAllStationsInArea(upperLeftX,upperLeftY,lowerRightX,lowerRightY,fromTXT);
        		}
        		else if(ReadFrom == 2) {
        			ASIA.findAllStationsInArea(upperLeftX,upperLeftY,lowerRightX,lowerRightY,fromDB);
        		}
        	}
        	else if(javafile == 2){
        		double X, Y, r;
        		Y = Input.rasykOfFindAllStations(0);
        		X = Input.rasykOfFindAllStations(1);
        		r = Input.rasykOfFindAllStations(4);
        		if(ReadFrom == 0) {
            		ASIC.AllStationsInCircle(X, Y, r, fromJAVA);
        		}
        		else if(ReadFrom == 1) {
            		ASIC.AllStationsInCircle(X, Y, r, fromTXT);
        		}
        		else if(ReadFrom == 2) {
            		ASIC.AllStationsInCircle(X, Y, r, fromDB);
        		}
        	}
        	else if(javafile == 3){
        		input.GetBusName();
        		boolean autobusas = input.ArCiaAutobusas;
        		String Name = input.AutobusoNumeris;
        		if(ReadFrom == 0) {
            		BNTS.busnrtostops(autobusas, Name, fromJAVA);
        		}
        		else if(ReadFrom == 1) {
            		BNTS.busnrtostops(autobusas, Name, fromTXT);
        		}
        		else if(ReadFrom == 2) {
            		BNTS.busnrtostops(autobusas, Name, fromDB);
        		}
        	}
        	else if(javafile == 4){
        		double latA, lonA;
        		lonA = input.GetCoord(0);
        		latA = input.GetCoord(1);
        		if(ReadFrom == 0) {
            		CTS.coordinatesTostops(lonA, latA, fromJAVA);
        		}
        		else if(ReadFrom == 1) {
            		CTS.coordinatesTostops(lonA, latA, fromTXT);
        		}
        		else if(ReadFrom == 2) {
            		CTS.coordinatesTostops(lonA, latA, fromDB);
        		}


        	}
        	else if(javafile == 5){
        		double latA, lonA;
        		lonA = input.GetCoord(0);
        		latA = input.GetCoord(1);
        		if(ReadFrom == 0) {
            		FNS.FindNearestStot(latA,lonA, fromJAVA);
        		}
        		else if(ReadFrom == 1) {
            		FNS.FindNearestStot(latA,lonA, fromTXT);
        		}
        		else if(ReadFrom == 2) {
            		FNS.FindNearestStot(latA,lonA, fromDB);
        		}

        	}
        	else if(javafile == 6){
        		String Name = "";
        		Name = input.GetNameIn();
        		if(ReadFrom == 0) {
            		NTS.nametostops(Name, fromJAVA);
        		}
        		else if(ReadFrom == 1) {
            		NTS.nametostops(Name, fromTXT);
        		}
        		else if(ReadFrom == 2) {
            		NTS.nametostops(Name, fromDB);
        		}
        	}
        	else if(javafile == 7){
        		double uX, uY, lX, lY;
        		uX = Input.rasykOfFindAllStations(0);
        		uY = Input.rasykOfFindAllStations(1);
        		lX = Input.rasykOfFindAllStations(2);
        		lY = Input.rasykOfFindAllStations(3);
        		if(ReadFrom == 0) {
            		SWMR.findStationsWithMostRoutes(uX, uY, lX, lY, fromJAVA);
        		}
        		else if(ReadFrom == 1) {
            		SWMR.findStationsWithMostRoutes(uX, uY, lX, lY, fromTXT);
        		}
        		else if(ReadFrom == 2) {
            		SWMR.findStationsWithMostRoutes(uX, uY, lX, lY, fromDB);
        		}

        	}
        	else if(javafile == 8) { // work in progress
        		List<String> IORlist = new ArrayList();
        		IORlist = input.IORreader();
        		String[] arg = new String[IORlist.size()];
        		IORlist.toArray(arg);
        		for(int i = 0; i < arg.length; i++) {
        			 
            		System.out.println(arg[i]);
        		}
        		List<String> a = new ArrayList();
        		a = IOR.findIntersectionsOfRoutes(arg, fromJAVA);
        		
        		for(int i = 0; i < a.size(); i++) {
        			 a.get(i);
        			
        		}
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
    		int readfrom;
    		while(working) {
    			select = input.ShellAppSelect();
    			readfrom = input.GetTxtFileSelect();
    			if(select == -2) {
    				System.exit(0);
    			}
    			else if(select == -1) {
    				System.out.println("Type 'help' or '?' for help");
    			}
    			else if(select == 0) {
    				
    				helpDesk.start();
    				
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
    					if(ReadFrom == 0) {
        					ASIA.findAllStationsInArea(argumentai[0], argumentai[1], argumentai[2], argumentai[3], fromJAVA);
    					}
    	        		else if(ReadFrom == 1) {
        					ASIA.findAllStationsInArea(argumentai[0], argumentai[1], argumentai[2], argumentai[3], fromTXT);
    					}
    	        		else if(ReadFrom == 2) {
        					ASIA.findAllStationsInArea(argumentai[0], argumentai[1], argumentai[2], argumentai[3], fromDB);
    					}
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
    					if(ReadFrom == 0) {
        					ASIC.AllStationsInCircle(argumentai[1], argumentai[0], argumentai[2], fromJAVA);	
    					}
    	        		else if(ReadFrom == 1) {
        					ASIC.AllStationsInCircle(argumentai[1], argumentai[0], argumentai[2], fromTXT);
    					}
    	        		else if(ReadFrom == 2) {
        					ASIC.AllStationsInCircle(argumentai[1], argumentai[0], argumentai[2], fromDB);
    					}
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
    							if(ReadFrom == 0) {
    								BNTS.busnrtostops(true, input.GetShellArg()[2], fromJAVA);
    							}
    			        		else if(ReadFrom == 1) {
    								BNTS.busnrtostops(true, input.GetShellArg()[2], fromTXT);
    							}
    			        		else if(ReadFrom == 2) {
    								BNTS.busnrtostops(true, input.GetShellArg()[2], fromDB);
    							}
    						}
    						else {
    							if(ReadFrom == 0) {
    								BNTS.busnrtostops(false, input.GetShellArg()[2], fromJAVA);
    							}
    			        		else if(ReadFrom == 1) {
    								BNTS.busnrtostops(false, input.GetShellArg()[2], fromTXT);
    							}
    			        		else if(ReadFrom == 2) {
    								BNTS.busnrtostops(false, input.GetShellArg()[2], fromDB);
    							}
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
    					if(ReadFrom == 0) {
        					CTS.coordinatesTostops(argumentai[0], argumentai[1], fromJAVA);
    					}
    	        		else if(ReadFrom == 1) {
        					CTS.coordinatesTostops(argumentai[0], argumentai[1], fromTXT);
    					}
    	        		else if(ReadFrom == 2) {
        					CTS.coordinatesTostops(argumentai[0], argumentai[1], fromDB);
    					}
    					}
    					catch(NumberFormatException e){
    						System.out.println("Error: Invalid arg");
        					System.out.println(input.GetShellArg()[0]+" double, double");
    					}

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
    					if(ReadFrom == 0) {
        					FNS.FindNearestStot(argumentai[0], argumentai[1], fromJAVA);
    					}
    	        		else if(ReadFrom == 1) {
        					FNS.FindNearestStot(argumentai[0], argumentai[1], fromTXT);
    					}
    	        		else if(ReadFrom == 2) {
        					FNS.FindNearestStot(argumentai[0], argumentai[1], fromDB);
    					}
    				}
    				else {
    					System.out.println("Error: Invalid arg");
    					System.out.println(input.GetShellArg()[0]+" double, double");
    				}
    				
    			}
    			else if(select == 6) {
    				
    				if(input.GetShellArg().length > 1) {
    					if(ReadFrom == 0) {
        					NTS.nametostops(input.GetShellArgForNTS()[1], fromJAVA);
    					}
    	        		else if(ReadFrom == 1) {
        					NTS.nametostops(input.GetShellArgForNTS()[1], fromTXT);
    					}
    	        		else if(ReadFrom == 2) {
        					NTS.nametostops(input.GetShellArgForNTS()[1], fromDB);
    					}
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
    					if(ReadFrom == 0) {
    						SWMR.findStationsWithMostRoutes(argumentai[1], argumentai[0], argumentai[3], argumentai[2], fromJAVA);
    					}
    	        		else if(ReadFrom == 1) {
    						SWMR.findStationsWithMostRoutes(argumentai[1], argumentai[0], argumentai[3], argumentai[2], fromTXT);
    					}
    	        		else if(ReadFrom == 2) {
    						SWMR.findStationsWithMostRoutes(argumentai[1], argumentai[0], argumentai[3], argumentai[2], fromDB);
    					}
    				}
    				else {
    					System.out.println("Error: Invalid arg");
    					System.out.println(input.GetShellArg()[0]+" double, double, double, double");
    				}
    				
    			}
    			else if(select == 8) {
    				
    				System.out.println("work in progress");
    			}
    			else if(select == 9) {
    				double argumentai = 0;
    				if(input.GetShellArg().length == 2) {
    					try {
        					
        					argumentai = Double.parseDouble(input.GetShellArg()[1]);	
        					
        					if(ReadFrom == 0) {
            					pwd.findPavlionsWithinDistance(argumentai, fromJAVA);
        					}
        	        		else if(ReadFrom == 1) {
        	        			pwd.findPavlionsWithinDistance(argumentai, fromTXT);
        					}
        	        		else if(ReadFrom == 2) {
        	        			pwd.findPavlionsWithinDistance(argumentai, fromDB);
        					}
        					}
        					catch(NumberFormatException e){
        						System.out.println("Invalid arg: pwd double");
        					}
    				}
    				else {
    					System.out.println("Invalid arg: pwd double");
    				}
    				
    			}
    			else if(select == 10) {
    				int argumentai = 0;
    				if(input.GetShellArg().length == 2) {
    					try {
        					
        					argumentai = Integer.parseInt(input.GetShellArg()[1]);	
        					
        					if(ReadFrom == 0) {
            					waswmr.findWholeAreaStationsWithMostRoutes(argumentai, fromJAVA);
        					}
        	        		else if(ReadFrom == 1) {
        	        			waswmr.findWholeAreaStationsWithMostRoutes(argumentai, fromTXT);
        					}
        	        		else if(ReadFrom == 2) {
        	        			waswmr.findWholeAreaStationsWithMostRoutes(argumentai, fromDB);
        					}
        					}
        					catch(NumberFormatException e){
        						System.out.println("Invalid arg: WASWMR int");
        					}
    				}
    				else {
    					System.out.println("Invalid arg: WASWMR int");
    				}
    			}
    			else if(select == 99) {
    			  if(input.GetShellArg().length == 2) {
      				if(input.GetShellArg()[1].equalsIgnoreCase("java")) {
    					ReadFrom = 0;
    					System.out.println("Now reading from HardCodedDb.java");
    				}
    				else if(input.GetShellArg()[1].equalsIgnoreCase("txt")) {
    					ReadFrom = 1;
    					System.out.println("Now reading from stoteles.txt");
    				}
    				else if(input.GetShellArg()[1].equalsIgnoreCase("db")) {
    					ReadFrom = 2;
    					System.out.println("Now reading from Database");
    				}
    				else {
    					System.out.println("File not found");
    				}
    			  }
    			  else {
    				  System.out.println("Sources: 'java','txt','db'");
    			  }
    			}
    			else if(select == 100) {
    				if(input.GetShellArg().length == 2 || input.GetShellArg().length == 3 ) {
    					if(input.GetShellArg()[1].equalsIgnoreCase("-n")) {
        					if(input.GetShellArg().length == 3) {
        			    		dbmaker.start(input.GetShellArg()[2]);
        					}
        					else {
        						dbmaker.start("");
        					}
        				}
        				else if(input.GetShellArg()[1].equalsIgnoreCase("-d")) {
        					dbmaker.start("DELETE FILE#0000085");
        				}
        				else {
        					System.out.println("Error: Invalid arg");
        				}
    				}
    				else if(input.GetShellArg().length == 1) {
    					System.out.println("To generate new database -n, if it exists it won't create a new database");
    					System.out.println("To delete a database -d");
    				}
    				
    			}
    			else if(select == 101) {
    				double[] argumentai = {0,0};
    				if(input.GetShellArg().length == 3) {
    					try {
        					
        					argumentai[0] = Double.parseDouble(input.GetShellArg()[1]);
        					argumentai[1] = Double.parseDouble(input.GetShellArg()[2]);
        					
        					if(ReadFrom == 2) {
            					udb.start(argumentai[0], argumentai[1]);
        					}
        					else {
        						System.out.println("Use command: crf db");
        					}
        					}
        				catch(NumberFormatException e){
        					System.out.println("Invalid arg: udb double, double");
        				}
    				}
    				else {
    					System.out.println("Invalid arg: udb double, double");
    				}
    			}
    			else {
    				System.out.println("Error");
    			}
    			
    			
    		}
    	}

    	else if(UseGui == 2) {
    		//gui.v3Test();
    		//gui.test();
    		

//    		String anim= "|/-\\";
//            for (int x =0 ; x < 100 ; x++) {
//                String data = "\r" + anim.charAt(x % anim.length()) + " " + x;
//                System.out.write(data.getBytes());
//                Thread.sleep(100);
//            }
    	
    	}
    	else {
    		System.out.println("Error");
    	}
	}
	
	
}
