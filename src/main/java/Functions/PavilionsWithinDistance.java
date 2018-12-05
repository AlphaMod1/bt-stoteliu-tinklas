package Functions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.beans.Station;

public class PavilionsWithinDistance {
	
	public List<Station> findPavlionsWithinDistance(int maxDistance, List<Station> readfrom) {
		
		List<Station> pavilionsWithinDistance = new ArrayList<Station>();
		List<Station> allStations = readfrom;
		
		List<ArrayList<Station>> sortedStations = sortStationsByName(allStations);
		
		for (List<Station> list : sortedStations) {
			
			for (Station station : list) {
				
				if (distanceQualifies(maxDistance)) {
					
					pavilionsWithinDistance.add(station);
					
				}
				
			}
			
		}
		
		return pavilionsWithinDistance;
	}
	
	private List<ArrayList<Station>> sortStationsByName (List<Station> readfrom) {
		
		List<ArrayList<Station>> sortedStations = new ArrayList<ArrayList<Station>>();
		ArrayList<Station> pavilionsOfSameStation = new ArrayList<Station>();
		
		readfrom.sort(comparatorByName);
		
		for (int i = 0; i < readfrom.size() - 1; i++) {
			
			pavilionsOfSameStation.add(readfrom.get(i));
			
			for (int j = i + 1; j < readfrom.size(); j++) {
				
				if ( readfrom.get(i).getName().toLowerCase().equals(readfrom.get(j).getName().toLowerCase())) {
					pavilionsOfSameStation.add(readfrom.get(j));
				} else {
					sortedStations.add(pavilionsOfSameStation);
					pavilionsOfSameStation = null;
					break;
				}
			}
		}
		
		return sortedStations;
	}
	
	private boolean distanceQualifies (int distance) {
		
		return true;
	}
	
	private Comparator<Station> comparatorByName = new Comparator<Station>() {

		@Override
		public int compare(Station st1, Station st2) {
			
			return st1.getName().toLowerCase().compareTo(st2.getName().toLowerCase());
		}
		
	};

}
