package TestKodas;

import org.junit.Test;

import kodas.StationsWithMostRoutes;
import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestStationsWithMostRoutes {
	
	@Test
	public void testStationsWithMostRoutes() {
		
		StationsWithMostRoutes target = new StationsWithMostRoutes();
		HardCodedDb db = new HardCodedDb();
		
		List<Station> testList1 = new ArrayList<Station>();
		List<Station> testList2 = new ArrayList<Station>();
		
		Station station1 = new Station("Vaikų ligoninė", "25.2807679", "54.7553245",
				new String[]{"Autobusas 2G: Stotis - Santariškės", 
						"Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", 
						"Autobusas 75 Pilaitė - S. Stanevičiaus g. - Santariškės"});
		
		Station station2 = new Station("Vaikų ligoninė", "25.2807679", "54.7553245",
				new String[]{"Autobusas 2G: Stotis - Santariškės", 
						"Autobusas 48 Santariškės - Laisvės pr. - Šeškinė"});
		
		testList2.add(station1);
		
		assertEquals(testList1, target.findStationsWithMostRoutes(0, 0, 0, 0));
		assertEquals("Bernardinų sodas", target.findStationsWithMostRoutes(25.2905741,54.6847849,25.2905741,54.6847849).get(0).getName());
		assertEquals(testList2.size(), target.findStationsWithMostRoutes(25.2807679, 54.7553245, 25.2807679, 54.7553245).size());
		assertTrue(target.comparatorByRoutes.compare(station1, station2) < 0);

	}

}
