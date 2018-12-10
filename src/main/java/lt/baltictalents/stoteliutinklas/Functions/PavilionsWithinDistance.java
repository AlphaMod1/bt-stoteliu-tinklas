package lt.baltictalents.stoteliutinklas.Functions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import lt.baltictalents.stoteliutinklas.data.beans.Station;

public class PavilionsWithinDistance {

//	public static void main(String[] args) {
//		PavilionsWithinDistance test = new PavilionsWithinDistance();
//		test.findPavlionsWithinDistance(20);
//	}
	
//	maxDistance has to be in meters
	public List<Station> findPavlionsWithinDistance(double maxDistance, List<Station> readfrom) {
		
		List<Station> pavilionsWithinDistance = new ArrayList<Station>();
		List<Station> allStations = readfrom;
//		HardCodedDb db = new HardCodedDb();
//		List<Station> allStations = db.getStoteles();
		
//		List<Station> allStations = new ArrayList<Station>();
//		allStations.add(new Station("Vaikų ligoninė", "25.280511", "54.755512",
//				new String[]{"Autobusas 2G: Stotis - Santari�?kės", "Autobusas 48 Santari�?kės - Laisvės pr. - Še�?kinė", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santari�?kės"}));
//		allStations.add(new Station("Juozo Tumo-Vaižganto st.", "25.2692819", "54.6895504",
//				new String[]{"Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 3G: Oro uostas - Fabijoni�?kės", "Autobusas 73 Justini�?kės - Centras - Vilkpėdė", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 10: Naujininkai - Saulėtekis", "Troleibusas 17: Naujininkai - Žirmūnai"}));
//		allStations.add(new Station("Vaikų ligoninė", "25.280511", "54.755512",
//				new String[]{"Autobusas 2G: Stotis - Santari�?kės", "Autobusas 48 Santari�?kės - Laisvės pr. - Še�?kinė", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santari�?kės"}));
//		allStations.add(new Station("Vaikų ligoninė", "25.280286", "54.752843",
//				new String[]{"Autobusas 2G: Stotis - Santari�?kės", "Autobusas 48 Santari�?kės - Laisvės pr. - Še�?kinė", "Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santari�?kės"}));
//		allStations.add(new Station("Juozo Tumo-Vaižganto st.", "25.2692819", "54.6895504",
//				new String[]{"Autobusas 22 Lazdynai - Oslo g. - Centras", "Autobusas 3G: Oro uostas - Fabijoni�?kės", "Autobusas 73 Justini�?kės - Centras - Vilkpėdė", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 4: Žemieji Paneriai - Antakalnis", "Troleibusas 10: Naujininkai - Saulėtekis", "Troleibusas 17: Naujininkai - Žirmūnai"}));
				
		allStations.sort(comparatorByName);
		List<Station> pavilionsWithSameName = new ArrayList<Station>();
		
		int i = 0;
		pavilionsWithSameName.add(allStations.get(i));
		
		while (i < allStations.size() - 1) {
			
			while (i < allStations.size() - 1
					&& allStations.get(i).getName().toLowerCase().equals(allStations.get(i + 1).getName().toLowerCase())) {
				pavilionsWithSameName.add(allStations.get(i + 1));
				i++;
			}
			
//			Stations that only have one pavilion will not be added to the return list pavilionsWithinDistance
			if (pavilionsWithSameName.size() == 1) {
				System.out.println("has only one pavilion: " + pavilionsWithSameName.get(0).getName());
			} else {
			
				if (distanceQualifies(maxDistance, pavilionsWithSameName)) {
					for (Station station : pavilionsWithSameName) {
						pavilionsWithinDistance.add(station);
					}
				}
			}
			
			pavilionsWithSameName.clear();
			if (i < allStations.size() - 1) {
			pavilionsWithSameName.add(allStations.get(i + 1));
			}
			i++;
		}
		for (Station station : pavilionsWithinDistance) {
			System.out.println(station.getName());
		}
		return pavilionsWithinDistance;
	}
	
	private boolean distanceQualifies (double maxDistance, List<Station> pavilions) {
		List<Station> reversedPavilions = new ArrayList<Station>();
		reversedPavilions.addAll(pavilions);
		Collections.reverse(reversedPavilions);
		
		boolean distanceWithinLimits = true;
		
		for (Station stationA : pavilions) {
			reversedPavilions.remove(reversedPavilions.size() - 1);
			for (Station stationZ : reversedPavilions) {
				double measuredDistance = measureDistance(stationA, stationZ);
				if (measuredDistance > maxDistance) {
					distanceWithinLimits = false;
					break;
				}
//				System.out.println("distance : " + measuredDistance);
			}
			if (distanceWithinLimits == false) {
				break;
			}
		}
		
		return distanceWithinLimits;
	}
	
		
	private double measureDistance(Station stationA, Station stationZ) {
		double distance = 0;
		double lat1 = Double.parseDouble(stationA.getLatitude());
		double lon1 = Double.parseDouble(stationA.getLongtitute());
		double lat2 = Double.parseDouble(stationZ.getLatitude());
		double lon2 = Double.parseDouble(stationZ.getLongtitute());
		
		double theta = lon1 - lon2;
		distance = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
		distance = Math.acos(distance);
		distance = Math.toDegrees(distance);
		distance = distance * 60 * 1.1515;
		distance = distance * 1.609344 * 1000;
		
		return distance;
	
	}


	private Comparator<Station> comparatorByName = new Comparator<Station>() {
		@Override
		public int compare(Station st1, Station st2) {
			return st1.getName().toLowerCase().compareTo(st2.getName().toLowerCase());
		}
	};

}
