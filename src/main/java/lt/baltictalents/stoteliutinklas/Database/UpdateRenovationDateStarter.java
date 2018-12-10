package lt.baltictalents.stoteliutinklas.Database;

import java.sql.Connection;
import java.sql.SQLException;

public class UpdateRenovationDateStarter {

	public void start(double x, double y) throws SQLException {
		
		Database db = new Database();
		Connection conn = null;

		try {
			conn = db.prepareDatabase("NewDatabase.db");
			UpdateRenovationDate updateRenovationDate = new UpdateRenovationDate();
			updateRenovationDate.update(conn, x, y);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.close();
			}
		}
		
	}
	
}
