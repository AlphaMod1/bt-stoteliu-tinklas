package kodas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
public class NewDatabaseMaker {
	
    private static void createNewDatabase(String fileName) {
        
//    	try (Stream<Path> paths = Files.walk(Paths.get("."))) {
//    	    
//    		List<Path> checkList = Files.walk(Paths.get("."))
//    	        .filter(Files::isRegularFile)
//    	        .filter(file -> file.getFileName().toString().substring(file.getFileName().toString().length() - 2) == ".db")
//    	        .collect(Collectors.toList());
//    	    
//    		if (checkList.get(0).toString() != null) {
//        	    
//    	    	System.out.println("The Database already exists");
//    	    	return;
//    	    }
//    	    
//    	} catch (IOException e1) {
//			e1.printStackTrace();
//		}
    	    	
    	Connection conn = null;
        try {
            String url = "jdbc:sqlite:C:\\BalticTalentsJava1\\bt-stoteliu-tinklas\\src\\main\\java\\kodas\\" + fileName;
            conn = DriverManager.getConnection(url);
            
            ResultSet resultSet = conn.getMetaData().getCatalogs();
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
   
    public static void main(String[] args) {
    	createNewDatabase("testinimas2.db");
    }
}