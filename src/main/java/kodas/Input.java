package kodas;

import java.util.Scanner;



public class Input {

	private static double temp;
	static Scanner reader = new Scanner(System.in);
	
	public static double GetCoord(boolean Alte) {

		while(true) {
		String Ats;
		if(Alte) {
			System.out.println("Enter Latitude:");
		}
		else if(!Alte) {
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
	
}
