package kodas;

import java.util.ArrayList;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class AllStationsInArea {

	public List<Station> findAllStationsInArea() {
		
		Input input = new Input();
		
		double upperLeftX, upperLeftY, lowerRightX, lowerRightY;
		upperLeftX = Input.rasykOfFindAllStations(0);
		upperLeftY = Input.rasykOfFindAllStations(1);
		lowerRightX = Input.rasykOfFindAllStations(2);
		lowerRightY = Input.rasykOfFindAllStations(3);
		Input.reader.close();
		
		List<Station> allStationsInArea = new ArrayList<Station>();
		
		HardCodedDb hardCodedDb = new HardCodedDb();
		
		List<Station> stations = hardCodedDb.getStoteles();
						
		for (Station station : stations) {
			
			boolean stationIsInArea = checkIfStationIsInArea(upperLeftX, upperLeftY, lowerRightX, lowerRightY, station);
			
			if (stationIsInArea) {
				allStationsInArea.add(station);
				System.out.println(station.getName());
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
	
}