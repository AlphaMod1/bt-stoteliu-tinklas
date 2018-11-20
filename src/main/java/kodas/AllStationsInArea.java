package kodas;

import java.util.ArrayList;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class AllStationsInArea {

	public List<Station> findAllStationsInArea() {
		
		Input input = new Input();
		
		double upperLeftX, upperLeftY, lowerRightX, lowerRightY;
		upperLeftY = Input.rasykOfFindAllStations(0);
		upperLeftX = Input.rasykOfFindAllStations(1);
		lowerRightY = Input.rasykOfFindAllStations(2);
		lowerRightX = Input.rasykOfFindAllStations(3);
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
		
		if ((x >= lowerRightX && x <= upperLeftX || x <= lowerRightX && x >= upperLeftX) && (y >= upperLeftY && y <= lowerRightY || y <= upperLeftY && y >= lowerRightY)) {
			return true;
		}
					
		return false;
	}
	
}