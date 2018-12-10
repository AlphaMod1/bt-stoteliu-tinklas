package Functions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import Database.Database;
import lt.baltictalents.stoteliutinklas.data.beans.Route;
import lt.baltictalents.stoteliutinklas.data.beans.Station;

public class UpdateRenovationDate {
	
	public void update(Connection conn, Double longitude, Double latitude) {
		String sql = "UPDATE stations SET renovationDate = ? " + "WHERE longitude = ? " + "AND latitude = ?";
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
		LocalDateTime today = LocalDateTime.now();
		String todayString = dtf.format(today).toString();
		
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, todayString);
			pstmt.setDouble(2, longitude);
			pstmt.setDouble(3, latitude);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return;
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Database db = new Database();
		Connection conn = null;

		try {
			conn = db.prepareDatabase("testinimas.db");
			UpdateRenovationDate updateRenovationDate = new UpdateRenovationDate();
			updateRenovationDate.update(conn, 25.2807679, 54.7553245);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.close();
			}
		}
	}

}
