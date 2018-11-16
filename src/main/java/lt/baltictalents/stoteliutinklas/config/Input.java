package lt.baltictalents.stoteliutinklas.config;

import java.util.Scanner;



public class Input {

	private static double temp;
	private static double temp2;
	static Scanner reader = new Scanner(System.in);
	public static double rasykOfFindNear() {

		while(true) {
		String Ats;
		System.out.println("Enter a number: ");
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
	
	public static double rasykOfFindAllStations() {

		while(true) {
		String Ats;
		System.out.println("Enter a number: ");
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
