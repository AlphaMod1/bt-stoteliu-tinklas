package kodas;

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
		
		String[] routesFromDbLower = new String[routesFromDb.length];

		for (int j = 0; j < routesFromDb.length; j++) {
			routesFromDbLower[j] = routesFromDb[j].toLowerCase();
		}
		
		for (int i = 0; i < routesFromUser.length; i++) {
						
			if (Arrays.asList(routesFromDbLower).contains(routesFromUser[i].toLowerCase())) {
				match++;
			}
		}
		
		if (match == routesFromUser.length) {
			return true;
		}
		
		return false;
	}

}
