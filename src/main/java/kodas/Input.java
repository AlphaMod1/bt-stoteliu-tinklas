package kodas;

import java.util.Scanner;



public class Input {

	private static double temp;
	public static Scanner reader = new Scanner(System.in);
	public static Scanner reader2 = new Scanner(System.in);
	
	//Testas ar autobusas
	
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

		String LongLine = "=========================";
		System.out.println(LongLine);
		System.out.println("1) All Stations In An Area");
		System.out.println("2) All Stations In A Circle");
		System.out.println("3) Bus Number Conver To Stop Names");
		System.out.println("4) Get Bus Names From Coordinates");
		System.out.println("5) Find Nearest Stop With Coordinates");
		System.out.println("6) Get Bus Names From Stop Name");
		System.out.println("7) Stations With Most Routes In An Area");
		System.out.println(LongLine);
		
		String Ats;
		int temp;
		
		while(true) {
		Ats = reader.next();
		try{
			  temp = Integer.parseInt(Ats);
			  
			  if(temp < 1 || temp > 7) {
				  System.out.println("Error: Pick a number from 1 - 7");
			  }
			  else {break;}
			  
			} catch (NumberFormatException e) {
			  System.out.println("Error: Type a number");
			}
		}
		System.out.println(LongLine);
		return temp;
	}
	

	
	
}
