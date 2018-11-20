package kodas;

import java.util.Scanner;



public class Input {

	private static double temp;
	public static Scanner reader = new Scanner(System.in);
	
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
		NameIn = reader.nextLine();
		return NameIn;
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
	
	
	
}