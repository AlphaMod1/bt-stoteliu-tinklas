package Database;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import File_Reading.RouteTxtReader;
import File_Reading.TxtReader;
import lt.baltictalents.stoteliutinklas.data.beans.Route;
import lt.baltictalents.stoteliutinklas.data.beans.Station;

public class databaseInitialization {

	public Connection prepareDatabase(String fileName) throws SQLException {
		try (Stream<Path> paths = Files.walk(Paths.get("src/main/java/Database/"))) {
			List<String> dbFileNames = paths.filter(Files::isRegularFile).map(file -> file.getFileName().toString())
					.filter(name -> name.substring(name.length() - 3).equals(".db")).collect(Collectors.toList());

			if (!dbFileNames.isEmpty()) {

				String url = "jdbc:sqlite:src/main/java/Database/" + dbFileNames.get(0);
				Connection connection = DriverManager.getConnection(url);

				return connection;

				// create new with tables and data
			} else if (fileName != null && !fileName.trim().equals("")) {

				String url = "jdbc:sqlite:src/main/java/Database/" + fileName.trim();
				//Class.forName("org.sqlite.JDBC");
				Connection connection = DriverManager.getConnection(url);


				createTables(connection); // tables will not be created if they already exist

				// read stoteles.txt and write to database
				TxtReader stationReader = new TxtReader();
				List<Station> stations = stationReader.readtxt();

				for (Station station : stations) {
					insertStations(connection, station);
				}


				// read autobusai.txt and write to database
				RouteTxtReader routeReader = new RouteTxtReader();
				List<Route> routes = routeReader.readtxt();

				for (Route route : routes) {
					insertRoute(connection, route);
				}


				return connection;
			}

		} catch (IOException e1) {
			e1.printStackTrace();
		}

		return null;
	}

	public void createTables(Connection conn) {
		String routesTableSql = "CREATE TABLE IF NOT EXISTS routes (\n" + " routeName text,\n"
				+ "	startStationName text,\n" + "	finalStationName text\n" + ");";

		String stationsTableSql = "CREATE TABLE IF NOT EXISTS stations (\n" + " stationName text,\n"
				+ "	longitude text,\n" + "	latitude text,\n" + " routes text,\n" + " renovationDate text\n" + ");";

		try (Statement stmt = conn.createStatement()) {
			// create a new table
			stmt.execute(routesTableSql);
			stmt.execute(stationsTableSql);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Copying data...");
	}

	public void insertRoute(Connection conn, Route route) {
		String sql = "INSERT INTO routes(routeName, startStationName, finalStationName) VALUES(?, ?, ?)";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, route.getRouteName());
			pstmt.setString(2, route.getStartStationName());
			pstmt.setString(3, route.getFinalStationName());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public List<Route> getRoutes(Connection conn) {
		String sql = "SELECT routeName, startStationName, finalStationName FROM routes;";
		List<Route> routes = new ArrayList<Route>();

		try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

			// loop through the result set
			while (rs.next()) {
				Route route = new Route(rs.getString(1), rs.getString(2), rs.getString(3));
				routes.add(route);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}


		return routes;
	}

	public void insertStations(Connection conn, Station station) {
		String sql = "INSERT INTO stations(stationName, longitude, latitude, routes) VALUES(?, ?, ?, ?)";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, station.getName());
			pstmt.setString(2, station.getLongtitute());
			pstmt.setString(3, station.getLatitude());
			pstmt.setString(4, String.join(";", station.getRoutes()));
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public List<Station> getStations(Connection conn) {
		String sql = "SELECT stationName, longitude, latitude, routes FROM stations;";
		List<Station> stations = new ArrayList<Station>();

		try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

			// loop through the result set
			while (rs.next()) {
				Station station = new Station(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4).split(";"));
				stations.add(station);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}


		return stations;
	}

	
}