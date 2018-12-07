package File_Reading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.beans.Route;

public class RouteTxtReader {
	public List<Route> readtxt() {
		
		List<Route> returnas = new ArrayList<Route>();
		java.net.URL path = RouteTxtReader.class.getResource("autobusai.txt");
		File temp = new File(path.getFile());
		String fileName = temp.toString();
		fileName = fileName.replaceAll("%20", " ");
        String line = null;

        try {
            BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(new FileInputStream(fileName), "UTF8"));

            while((line = bufferedReader.readLine()) != null) {
		        String[] data = line.split("\\,");
		        
		        for(int i = 0; i < 3; i++) {
			        data[i] = data[i].replaceAll("\"", "");	
		        }
		        returnas.add(new Route(data[0], data[1], data[2]));
            }   

            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" + fileName + "'");                  
        }
		
		return returnas;
	}

}
