package Functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class IntersectionsOfRoutes {
	
	public List<String> findIntersectionsOfRoutes(String[] routes, List<Station> readfrom) {
		
		List<String> stationsOfIntersections = new ArrayList<String>();
		List<Station> allStations = readfrom;

		for (Station station : allStations) {
			
			boolean allRoutesGoThroughStation = checkIfAllRoutesGoThroughStation(routes, station.getRoutes());
			
			if (allRoutesGoThroughStation) {
				stationsOfIntersections.add(station.getName());
			}
		}
		
		for (String name : stationsOfIntersections) {
			System.out.println(name);
		}

		return stationsOfIntersections;
	};
	
	
	private boolean checkIfAllRoutesGoThroughStation(String[] routesFromUser, String[] routesFromDb) {
		
		int match = 0;
		int possibleMatch = 0;
		
//		String[] routesFromDbLower = new String[routesFromDb.length];

//		for (int j = 0; j < routesFromDb.length; j++) {
//			routesFromDbLower[j] = routesFromDb[j].toLowerCase();
//		}
		
		for (int i = 0; i < routesFromUser.length; i++) {
						
			for (int j = 0; j < routesFromDb.length; j++) {
				
				if (routesFromDb[j].equalsIgnoreCase(routesFromUser[i])) {
					possibleMatch = 1;
					break;
				}
				
//				if (Arrays.asList(routesFromDb).contains(routesFromUser[i].toLowerCase())) {
//					match++;
//				}
			}
			
			if (possibleMatch == 1) {
				match++;
			}
			
			possibleMatch = 0;
		}
		
		if (match == routesFromUser.length) {
			return true;
		}
		
		return false;
	}

}
