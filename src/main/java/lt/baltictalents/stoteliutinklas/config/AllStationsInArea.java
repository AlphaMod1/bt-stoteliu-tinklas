package lt.baltictalents.stoteliutinklas.config;

import java.util.ArrayList;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class AllStationsInArea {

	public List<Station> findAllStationsInArea(float upperLeftX, float upperLeftY, float lowerRightX, float lowerRightY) {
		
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

	private boolean checkIfStationIsInArea(float upperLeftX, float upperLeftY, float lowerRightX, float lowerRightY, Station station) {
		
		float x = Float.parseFloat(station.getLatitude());
		float y = Float.parseFloat(station.getLongtitute());
		
		if ((x >= lowerRightX && x <= upperLeftX) && (y >= upperLeftY && y <= lowerRightY)) {
			return true;
		}
					
		return false;
	}
	
}