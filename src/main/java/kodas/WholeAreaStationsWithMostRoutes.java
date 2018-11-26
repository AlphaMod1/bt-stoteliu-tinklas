package kodas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class WholeAreaStationsWithMostRoutes {
	
	private Comparator<Station> comparatorByRoutes = new Comparator<Station>() {

		@Override
		public int compare(Station station1, Station station2) {
			int number1 = station1.getRoutes().length;
			int number2 = station2.getRoutes().length;
			
			return number2- number1;
		}
		
	};
		
	public List<Station> findWholeAreaStationsWithMostRoutes(int numberOfStations) {
		
		List<Station> stationsWithMostRoutes = new ArrayList<Station>();
		HardCodedDb hardCodedDb = new HardCodedDb();
		List<Station> allStations = hardCodedDb.getStoteles();
		
		allStations.sort(comparatorByRoutes);
		
		int i = 0;
		while (i < numberOfStations) {
			
			stationsWithMostRoutes.add(allStations.get(i));
			i++;
		}
		
//		if (allStations.get(numberOfStations).getRoutes().length == allStations.get(numberOfStations + 1).getRoutes().length) {
//			
//			int j = 1;
//			Iterator<Station> iterator = allStations.iterator();
//			while (allStations.get(numberOfStations).getRoutes().length == allStations.get(numberOfStations + j).getRoutes().length 
//					&& iterator.hasNext()) {
//				
//				stationsWithMostRoutes.add(allStations.get(j));
//				j++;
//			}
//		}
		
		for (Station station : stationsWithMostRoutes) {
			System.out.println(station.getName() + ": " + station.getRoutes().length);
		}
		
		return stationsWithMostRoutes;
	}
	
}
