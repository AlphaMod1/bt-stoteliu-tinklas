package lt.baltictalents.stoteliutinklas.Input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Input {

	private static double temp;
	public static Scanner reader = new Scanner(System.in);
	public static Scanner reader2 = new Scanner(System.in);
	private static String[] ShellData;
	private static String[] ShellDataNTS;
	public static int useTXT;
	
	//Testas ar autobusas
	static String LongLine = "=========================================";
	public static boolean ArCiaAutobusas = true;
	public static String AutobusoNumeris = "";
	
	//=====================
	
	public static double GetCoord(int koksKlausimas) {

		while(true) {
		String Ats;
		if(koksKlausimas == 0) {
			System.out.println("Enter Latitude:");
		}
		else if(koksKlausimas == 1) {
			System.out.println("Enter Longitude:");
		}
		else {
			System.out.println("Error: Crash on input.java");
		}
		Ats = reader.next();
		
		try{
			  temp = Double.parseDouble(Ats);
			  break;
			  
			} catch (NumberFormatException e) {
			  System.out.println("Error: Type a number");
			}
		}
		
		return temp;
	}
	
	
	public static String GetNameIn() {
		String NameIn = "No Name";
		System.out.println("Enter stop name: ");
		NameIn = reader2.nextLine();
		return NameIn;
	}
	
	public static void GetBusName() {
		
		String Ats;
		boolean autobusas = true;
		
		while(true) {
			
			
			System.out.println("1.Autobusas");
			System.out.println("2.Troleibusas");
			System.out.println("Enter a number:");
			Ats = reader.next();
			
			try{
				  temp = Double.parseDouble(Ats);
				  
				} catch (NumberFormatException e) {
				  System.out.println("Error: Type a number");
				}
			
			if(temp == 1 || temp == 2 ) {
				
				if(temp == 1) {
					autobusas = true;
				}
				else if(temp == 2) {
					autobusas = false;
				}
				
				break;
			}
			else {
				System.out.println("Error: Choose 1 or 2");
			}
			
			}
		
		
		
		String NameIn = "No Name";
		System.out.println("Enter bus number: ");
		NameIn = reader2.nextLine();
		
		ArCiaAutobusas = autobusas;
		AutobusoNumeris = NameIn;
		
	}
	
	
	public static double rasykOfFindAllStations(int koksKlausimas) {

		double temp2 = 0;
		
		while(true) {
		String Ats;
		if(koksKlausimas == 0) {
			System.out.println("Enter X1 Latitude:");
		}
		else if(koksKlausimas == 1) {
			System.out.println("Enter Y1 Longitude:");
		}
		else if(koksKlausimas == 2) {
			System.out.println("Enter X2 Latitude:");
		}
		else if(koksKlausimas == 3) {
			System.out.println("Enter Y2 Longitude:");
		}
		else if(koksKlausimas == 4) {
			System.out.println("Enter Circle Radius: ");
		}
		else {
			System.out.println("Error: Crash on input.java");
		}
		Ats = reader.next();
		
		try{
			  temp2 = Double.parseDouble(Ats);
			  break;
			  
			} catch (NumberFormatException e) {
			  System.out.println("Error: Type a number");
			}
		}
		
		return temp2;
	}
	
	
	public static int SelectApp() {

		System.out.println(LongLine);
		System.out.println("1) All Stations In An Area");
		System.out.println("2) All Stations In A Circle");
		System.out.println("3) Bus Number Conver To Stop Names");
		System.out.println("4) Get Bus Names From Coordinates");
		System.out.println("5) Find Nearest Stop With Coordinates");
		System.out.println("6) Get Bus Names From Stop Name");
		System.out.println("7) Stations With Most Routes In An Area");
		System.out.println("8) Intersections Of Routes(Type 'x' to stop)"); 
		System.out.println("0) Exit");
		System.out.println(LongLine);
		
		String Ats;
		int temp;
		
		while(true) {
		Ats = reader.next();
		try{
			  temp = Integer.parseInt(Ats);
			  
			  if(temp < 0 || temp > 8) {
				  System.out.println("Error: Pick a number from 0 - 8");
			  }
			  else {break;}
			  
			} catch (NumberFormatException e) {
			  System.out.println("Error: Type a number");
			}
		}
		System.out.println(LongLine);
		return temp;
	}
	
	
	public static List<String> IORreader() {
		
		List<String> IORlist = new ArrayList();
		String Ats;
		while(true) {
		Ats = reader.nextLine();
		if(Ats.equalsIgnoreCase("x")) {
			break;
		}
		else if(Ats.equals(" ")){
			System.out.println("Try again");
		}
		else {
			IORlist.add(Ats);
		}
		}
		
		return IORlist;
	}
	

	
		public static int ShellAppSelect() {
			String Ats;
			int temp = -1;
			int useTxt = -1;
			Ats = reader.nextLine();
			String arr[] = Ats.split(" ");
			String NTSarr[] = Ats.split(" ", 2);
			
			if(arr[0].equalsIgnoreCase("help") || arr[0].equalsIgnoreCase("?")) {
				temp = 0;
			}
			else if(arr[0].equalsIgnoreCase("exit") || arr[0].equalsIgnoreCase("stop")) {
				temp = -2;
			}
			else {
				
				if(arr[0].equalsIgnoreCase("AllStationsInArea") || arr[0].equalsIgnoreCase("ASIA")) {
					temp = 1;
				}
				else if(arr[0].equalsIgnoreCase("AllStationsInCircle") || arr[0].equalsIgnoreCase("ASIC")) {
					temp = 2;
				}
				else if(arr[0].equalsIgnoreCase("BusNrToStops") || arr[0].equalsIgnoreCase("BNTS")) {
					temp = 3;
				}
				else if(arr[0].equalsIgnoreCase("CoordinatesToStops") || arr[0].equalsIgnoreCase("CTS")) {
					temp = 4;
				}
				else if(arr[0].equalsIgnoreCase("FindNearestStotele") || arr[0].equalsIgnoreCase("FNS")) {
					temp = 5;
				}
				else if(arr[0].equalsIgnoreCase("NameToStops") || arr[0].equalsIgnoreCase("NTS")) {
					temp = 6;
				}
				else if(arr[0].equalsIgnoreCase("StationsWithMostRoutes") || arr[0].equalsIgnoreCase("SWMR")) {
					temp = 7;
				}
				else if(arr[0].equalsIgnoreCase("IntersectionsOfRoutes") || arr[0].equalsIgnoreCase("IOR")) {
					temp = 8;
				}
				else if(arr[0].equalsIgnoreCase("PavilionsWithinDistance") || arr[0].equalsIgnoreCase("PWD")) {
					temp = 9;
				}
				else if(arr[0].equalsIgnoreCase("WholeAreaStationsWithMostRoutes") || arr[0].equalsIgnoreCase("WASWMR")) {
					temp = 10;
				}
				else if(arr[0].equalsIgnoreCase("ChangeReadFrom") || arr[0].equalsIgnoreCase("crf")) {
					temp = 99;
				}
				else if(arr[0].equalsIgnoreCase("mkdb") || arr[0].equalsIgnoreCase("makedb")){
					temp = 100;
				}
				else if(arr[0].equalsIgnoreCase("updatedb") || arr[0].equalsIgnoreCase("udb")) {
					temp = 101;
				}
				else {
					temp = -1;
				}
			}
			
			useTXT = useTxt;
			ShellData = arr;
			ShellDataNTS = NTSarr;
			return temp; 
		}
		
		public static String[] GetShellArg(){
			return ShellData;
		}
		public static String[] GetShellArgForNTS(){
			return ShellDataNTS;
		}
		public static int GetTxtFileSelect() {
			return useTXT;
		}
}
