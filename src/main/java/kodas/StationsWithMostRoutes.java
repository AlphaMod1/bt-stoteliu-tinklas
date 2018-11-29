package kodas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class StationsWithMostRoutes {
	

	public List<Station> findStationsWithMostRoutes(double uX, double uY, double lX, double lY, List<Station> readfrom) {
		
		List<Station> stationsWithMostRoutes = new ArrayList<Station>();
		List<Station> allStationsInArea = findAllStationsInArea(uX, uY, lX, lY, readfrom);

		
		allStationsInArea.sort(comparatorByRoutes);
		
		for (int i = 0; i < allStationsInArea.size(); i++) {
			
			if (i == 0 || allStationsInArea.get(i).getRoutes().length == allStationsInArea.get(i-1).getRoutes().length) {
				stationsWithMostRoutes.add(allStationsInArea.get(i));
				System.out.println(stationsWithMostRoutes.get(i).getName());			
			} else {
				break;
			}
		}
		
		return stationsWithMostRoutes;
	}
	

	private List<Station> findAllStationsInArea(double upperLeftX, double upperLeftY, double lowerRightX, double lowerRightY, List<Station> readfrom) {
		

		
		List<Station> allStationsInArea = new ArrayList<Station>();
		
		
		List<Station> stations = readfrom;
						
		for (Station station : stations) {
			
			boolean stationIsInArea = checkIfStationIsInArea(upperLeftX, upperLeftY, lowerRightX, lowerRightY, station);
			
			if (stationIsInArea) {
				allStationsInArea.add(station);
			}
			
		}
		
		return allStationsInArea;
	}

	private boolean checkIfStationIsInArea(double upperLeftX, double upperLeftY, double lowerRightX, double lowerRightY, Station station) {
		
		double x = Double.parseDouble(station.getLatitude());
		double y = Double.parseDouble(station.getLongtitute());
		
		if ((x >= lowerRightX && x <= upperLeftX || x <= lowerRightX && x >= upperLeftX) && (y >= upperLeftY && y <= lowerRightY || y <= upperLeftY && y >= lowerRightY)) {
			return true;
		}
					
		return false;
	}
			
	public Comparator<Station> comparatorByRoutes = new Comparator<Station>() {
		
		@Override
		public int compare (Station station1, Station station2) {
			
			int number1 = station1.getRoutes().length;
			int number2 = station2.getRoutes().length;
			
			return number2 - number1;
			
		}
		
	};
	
}