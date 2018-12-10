package lt.baltictalents.stoteliutinklas.Functions;

import java.util.ArrayList;
import java.util.List;

import lt.baltictalents.stoteliutinklas.Input.Input;
import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class AllStationsInArea {

	public List<Station> findAllStationsInArea(double upperLeftY, double upperLeftX, double lowerRightY, double lowerRightX, List<Station> readFrom) {
		
		Input input = new Input();
		

	//	Input.reader.close();
		
		List<Station> allStationsInArea = new ArrayList<Station>();
		
		
		List<Station> stations = readFrom;
						
		for (Station station : stations) {
			
			boolean stationIsInArea = checkIfStationIsInArea(upperLeftX, upperLeftY, lowerRightX, lowerRightY, station);
			
			if (stationIsInArea) {
				allStationsInArea.add(station);
			}
			
		}
		
		for(int i = 0; i < allStationsInArea.size(); i++) {
			 System.out.println(allStationsInArea.get(i).getName());
			
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