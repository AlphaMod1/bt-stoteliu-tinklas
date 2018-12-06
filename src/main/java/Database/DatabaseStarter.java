package Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.beans.Route;
import lt.baltictalents.stoteliutinklas.data.beans.Station;

public class DatabaseStarter {

	public void start(String name) throws SQLException {
		Database db1 = new Database();
		Connection conn = null;
		if(name == "") {
			name = "NewDatabase";
		}
		try {
			conn = db1.prepareDatabase(name+".db");

			List<Route> routes = db1.getRoutes(conn);
			System.out.println(Arrays.toString(routes.toArray()));

			List<Station> stations = db1.getStations(conn);
			Station testStation = stations.get(0);
			System.out.println(testStation.getName() + " " + testStation.getLatitude() + " "
					+ testStation.getLongtitute() + " " + Arrays.toString(testStation.getRoutes()));
			;

		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.close();
			}
		}
	}
	
}
