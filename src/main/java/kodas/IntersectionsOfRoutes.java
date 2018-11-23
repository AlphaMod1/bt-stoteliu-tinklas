package kodas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class IntersectionsOfRoutes {
	
	public List<String> findIntersectionsOfRoutes(String[] routes) {
		
		List<String> stationsOfIntersections = new ArrayList<String>();
		HardCodedDb hardCodedDb = new HardCodedDb();
		List<Station> allStations = hardCodedDb.getStoteles();

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
		
		for (int i = 0; i < routesFromUser.length; i++) {
			
			if (Arrays.asList(routesFromDb).contains(routesFromUser[i])) {
				match++;
			}
		}
		
		if (match == routesFromUser.length) {
			return true;
		}
		
		return false;
	}

}
