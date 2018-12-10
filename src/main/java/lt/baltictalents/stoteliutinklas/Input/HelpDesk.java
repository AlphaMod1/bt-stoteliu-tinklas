package lt.baltictalents.stoteliutinklas.Input;

public class HelpDesk {

	public void start() {
		String LongLine = "=========================================";
    	String nl = System.getProperty("line.separator");
    	
    	System.out.println(LongLine+nl);
    	System.out.println("AllStationsInArea               || ASIA"+nl+"Finds all stations in a square"+nl);
    	System.out.println("AllStationsInCircle             || ASIC"+nl+"Finds all stations in a circle"+nl);
    	System.out.println("BusNrToStops                    || BNTS"+nl+"Finds all stations of a bus"+nl);
    	System.out.println("CoordinatesToStops              || CTS"+nl+"Finds all routes with coordinates"+nl);
    	System.out.println("FindNearestStotele              || FNS"+nl+"Finds nearest stop by coordinates"+nl);
    	System.out.println("IntersectionsOfRoutes           || IOR"+nl+"Finds intersections of routes"+nl);
    	System.out.println("NameToStops                     || NTS"+nl+"Finds all routes with a station name"+nl);
    	System.out.println("PavilionsWithinDistance         || PWD"+nl+"Finds pavilions within given distance"+nl);
    	System.out.println("StationsWithMostRoutes          || SWMR"+nl+"Finds a station in a square with most routes"+nl);
    	System.out.println("UpdateRenovationDate            || URD"+nl+"Updates renovation date"+nl);
    	System.out.println("WholeAreaStationsWithMostRoutes || WASWMR"+nl+"Finds stations with most routes"+nl);
    	System.out.println("ChangeReadFrom                  || CRF"+nl+"Changes file that is reading from"+nl);
    	System.out.println("makedb                          || mkdb"+nl+"Generates or deletes a database"+nl);
    	System.out.println("UpdateDb                        || udb"+nl+"Updates database date"+nl);
    	System.out.println("Help                            || ?"+nl+"Shows all available commands"+nl);
    	System.out.println("Exit                            || Stop"+nl+"Exits the application"+nl);
    	System.out.println(LongLine);
	}
	
}
