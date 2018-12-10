package lt.baltictalents.stoteliutinklas.Database;

import java.io.File;
import java.sql.SQLException;

public class databaseDelete {

	@SuppressWarnings("unused")
	public void delDb(String name) throws SQLException {
		
		if(name == "") {
			name = "NewDatabase";
		}
		
		String temp = System.getProperty("user.dir")+"src\\main\\java\\Database\\"+name+".db";
		
		File file = new File(temp);
       
		//if(file.delete())
		if(0 == 1)
        { 
            System.out.println("File deleted successfully"); 
        } 
        else
        { 
            System.out.println("Failed to delete the file"); 
        } 

	}
	
}
