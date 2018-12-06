package kodas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.beans.Route;
import lt.baltictalents.stoteliutinklas.data.beans.Station;

public class UpdateRenovationDate {
	
	public void update(Connection conn, String date, double longitude/*, double latitude*/) {
		String sql = "UPDATE stations SET lastRenovation = ? , "
                + "WHERE longitude = ?";
		
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, date);
			pstmt.setDouble(2, longitude);
//			pstmt.setDouble(3, latitude);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return;
	}

	public static void main(String[] args) throws SQLException {
		Database db = new Database();
		Connection conn = null;

		try {
			conn = db.prepareDatabase("testinimas2.db");
			UpdateRenovationDate updateRenovationDate = new UpdateRenovationDate();
			updateRenovationDate.update(conn, "2000",  25.2807679/*,  54.7553245*/);
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.close();
			}
		}
	}

}
