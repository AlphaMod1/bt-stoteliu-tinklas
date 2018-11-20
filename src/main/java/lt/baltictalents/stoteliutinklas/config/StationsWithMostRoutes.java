package lt.baltictalents.stoteliutinklas.config;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class StationsWithMostRoutes {
	
	public List<Station> findStationsWithMostRoutes() {
		
		List<Station> stationsWithMostRoutes = new ArrayList<Station>();
		List<Station> allStationsInArea = findAllStationsInArea();
		
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
	
	private List<Station> findAllStationsInArea() {
		
		double upperLeftX, upperLeftY, lowerRightX, lowerRightY;
		upperLeftX = Input.rasykOfFindAllStations();
		upperLeftY = Input.rasykOfFindAllStations();
		lowerRightX = Input.rasykOfFindAllStations();
		lowerRightY = Input.rasykOfFindAllStations();
		Input.reader.close();
		
		List<Station> allStationsInArea = new ArrayList<Station>();
		
		HardCodedDb hardCodedDb = new HardCodedDb();
		
		List<Station> stations = hardCodedDb.getStoteles();
						
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
		
		if ((x >= lowerRightX && x <= upperLeftX) && (y >= upperLeftY && y <= lowerRightY)) {
			return true;
		}
					
		return false;
	}
			
	Comparator<Station> comparatorByRoutes = new Comparator<Station>() {
		
		@Override
		public int compare (Station station1, Station station2) {
			
			int number1 = station1.getRoutes().length;
			int number2 = station2.getRoutes().length;
			
			return number2 - number1;
			
		}
		
	};
	
}
