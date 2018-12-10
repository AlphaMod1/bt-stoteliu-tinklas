package lt.baltictalents.stoteliutinklas.Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.beans.Route;
import lt.baltictalents.stoteliutinklas.data.beans.Station;

public class databaseInitializationStarter {

	public List<Station> start(String name) throws SQLException {
		long start = System.currentTimeMillis();    
		System.out.println("Loading...");
		List<Station> stations = new ArrayList<Station>();
		databaseInitialization db1 = new databaseInitialization();
		Connection conn = null;
		if(name == "") {
			name = "NewDatabase";
		}
		try {
			conn = db1.prepareDatabase(name+".db");

			
			

			stations = db1.getStations(conn);
			
			

		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.close();
			}
		}
		long elapsedTime = System.currentTimeMillis() - start;
		float elapsedTimeSec = elapsedTime/1000F;
		System.out.println("Finished loading! in " +elapsedTimeSec+" s");
		return stations;
	}
	
}
