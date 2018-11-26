package TestKodas;

import org.junit.Test;

import kodas.WholeAreaStationsWithMostRoutes;
import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class TestWholeAreaStationsWithMostRoutes {
	
	@Test
	public void testFindWholeAreaStationsWithMostRoutes() {
		
		WholeAreaStationsWithMostRoutes target = new WholeAreaStationsWithMostRoutes();
		HardCodedDb db = new HardCodedDb();
		
		List<Station> testList1 = new ArrayList<Station>();
		
		
		assertEquals(2, target.findWholeAreaStationsWithMostRoutes(2).size());

	}

}
