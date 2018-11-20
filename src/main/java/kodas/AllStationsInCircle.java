package kodas;

import java.util.ArrayList;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class AllStationsInCircle {

	public List<Station> AllStationsInCircle() {
		
		Input input = new Input();
		
		double X, Y, r;
		Y = Input.rasykOfFindAllStations(0);
		X = Input.rasykOfFindAllStations(1);
		r = Input.rasykOfFindAllStations(4);
		Input.reader.close();
		
		List<Station> allStationsInCircle = new ArrayList<Station>();
		
		HardCodedDb hardCodedDb = new HardCodedDb();
		
		List<Station> stations = hardCodedDb.getStoteles();
						
		for (Station station : stations) {
			
			boolean stationIsInCircle = checkIfStationIsInCircle(X, Y, r, station);
			
			if (stationIsInCircle) {
				allStationsInCircle.add(station);
				System.out.println(station.getName());
			}
			
		}
		
		return allStationsInCircle;
	}

	private boolean checkIfStationIsInCircle(double X, double Y, double r, Station station) {
		
		double x = Double.parseDouble(station.getLatitude());
		double y = Double.parseDouble(station.getLongtitute());
		
		 if ((x - X) * (x - X) + (y - Y) * (y - Y) <= r * r) {
		   return true; 
		 }
		        else {
		            return false;
		        }
		    } 
					

	}
	
