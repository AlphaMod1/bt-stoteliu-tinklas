package Functions;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class FindNearestStotele {

	public String FindNearestStot(double lonA, double latA, List<Station> readfrom) {
			
		double[] list = new double[readfrom.size()];
		
		
		for(int i = 0; i < readfrom.size(); i++) {
		double tempLat = 0;	
		double tempLon = 0;
		tempLat = Double.parseDouble(readfrom.get(i).getLatitude());
		tempLon = Double.parseDouble(readfrom.get(i).getLongtitute());
		list[i]=(distance(latA,lonA,tempLat,tempLon,"K"));
		//System.out.println(i+") "+roundas(list[i],2)+"km");
		}
		//System.out.println();
		int index = getSmallest(list);
		
		String Ats = readfrom.get(index).getName();
		System.out.println("Artimiausia stotele: " + Ats);
		//System.out.println(roundas(list[index], 2)+"Km");
		return Ats;
		

	}
	
	
	
	private static double distance(double lat1, double lon1, double lat2, double lon2, String unit) {
		if ((lat1 == lat2) && (lon1 == lon2)) {
			return 0;
		}
		else {
			double theta = lon1 - lon2;
			double dist = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
			dist = Math.acos(dist);
			dist = Math.toDegrees(dist);
			dist = dist * 60 * 1.1515;
			if (unit == "K") {
				dist = dist * 1.609344;
			} else if (unit == "N") {
				dist = dist * 0.8684;
			}
			else if(unit == "M") {
				
			}
			
			//dist = roundas(dist, 5);
			
			return (dist);
		}
	}
	
	public static double roundas(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	
	private static int getSmallest(double[] ar) {
		int index = 0;
	       double min = ar[index];
	       for (int i=1; i<ar.length; i++){

	           if (ar[i] < min ){
	               min = ar[i];
	               index = i;
	           }


	       }
	       return index ;

	}

}
