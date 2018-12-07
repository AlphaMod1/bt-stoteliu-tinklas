package File_Reading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import lt.baltictalents.stoteliutinklas.data.beans.Station;

public class TxtReader {

	public List<Station> readtxt() {
		
		List<Station> returnas = new ArrayList<Station>();
		java.net.URL path = TxtReader.class.getResource("stoteles.txt");
		File temp = new File(path.getFile());
		String fileName = temp.toString();
		fileName = fileName.replaceAll("%20", " ");
        String line = null;

        try {

            BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(new FileInputStream(fileName), "UTF8"));
         				   	

            while((line = bufferedReader.readLine()) != null) {
		        String[] data = line.split("\\,");
		        for(int i = 0; i < 4; i++) {
			        data[i] = data[i].replaceAll("\"", "");	
		        }
		        String[] keliai = data[3].split("\\;");
		        if(keliai.length >= 2) {
		        for(int j = 1; j < keliai.length; j++) {
		        		 keliai[j] = keliai[j].substring(1);	 
		        }
		        }
		        data[1] = data[1].substring(1);
		        data[2] = data[2].substring(1);
		        returnas.add(new Station(data[0], data[1],data[2],keliai));
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
