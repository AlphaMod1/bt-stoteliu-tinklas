package lt.baltictalents.stoteliutinklas.config;

import java.util.ArrayList;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class allStationsInArea {

	public List<Station> findAllStationsInArea(/* float upperLeftX, float upperLeftY, float lowerRightX, float lowerRightY */) {
		
		List<Station> allStationsInArea = new ArrayList<Station>();
		
		HardCodedDb hardCodedDb = new HardCodedDb();
		
		List<Station> stations = hardCodedDb.getStoteles();
		
		boolean stationIsInArea = checkIfStationIsInArea(/* upperLeftX, upperLeftY, lowerRightX, lowerRightY, */ stations);
				
		for (Station station : stations) {
			
//			if (stationIsInArea) {
				allStationsInArea.add(station);
				System.out.println(station.getName());
//			}
			
		}
		
		return allStationsInArea;
	}

	private boolean checkIfStationIsInArea(/* float x1, float y1, float x2, float y2, */ List<Station> stations) {
		// TODO Auto-generated method stub
		return true;
	}
	
}
