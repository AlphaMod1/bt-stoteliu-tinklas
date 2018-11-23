package TestKodas;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import kodas.IntersectionsOfRoutes;
import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class TestIntersectionsOfRoutes {
	
	@Test
	public void testfindIntersectionsOfRoutes() {
		
		IntersectionsOfRoutes target = new IntersectionsOfRoutes();
		HardCodedDb db = new HardCodedDb();
		
		List<Station> testList1 = new ArrayList<Station>();
		
		assertEquals(testList1, target.findIntersectionsOfRoutes(new String[] {""}));
		assertEquals(22, target.findIntersectionsOfRoutes(new String[] {"Autobusas 2G: Stotis - Santariškės"}).size());
		assertEquals(7, target.findIntersectionsOfRoutes(new String[] {"Autobusas 48 Santariškės - Laisvės pr. - Šeškinė", 
				"Autobusas 2G: Stotis - Santariškės"}).size());
				
	}

}
