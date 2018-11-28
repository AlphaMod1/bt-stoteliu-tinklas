package kodas;

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
		
		List<Station> returnas = new ArrayList();
		int i = 0;
		String[] arr = new String[3];
		java.net.URL path = TxtReader.class.getResource("stoteles.txt");
		File temp = new File(path.getFile());
		String fileName = temp.toString();
		fileName = fileName.replaceAll("%20", " ");
        String line = null;

        try {
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(
         		   new InputStreamReader(
                               new FileInputStream(fileName), "UTF8"));

            while((line = bufferedReader.readLine()) != null) {
                arr = line.split(", ");
                for(int j = 0; j < 4; j++) {
                //arr[j] = arr[j].replaceAll("\"", " ");
                }
              //  returnas.asList(arr[i]);
                System.out.println(arr[i]);
                i++;
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
