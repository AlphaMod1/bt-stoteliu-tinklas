package TestKodas;

import org.junit.Test;

import lt.baltictalents.stoteliutinklas.Functions.WholeAreaStationsWithMostRoutes;
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
				
		assertEquals(0, target.findWholeAreaStationsWithMostRoutes(0, db.getStoteles()).size());
		assertEquals(1, target.findWholeAreaStationsWithMostRoutes(1, db.getStoteles()).size());
		assertEquals(2, target.findWholeAreaStationsWithMostRoutes(2, db.getStoteles()).size());
		assertEquals(6, target.findWholeAreaStationsWithMostRoutes(3, db.getStoteles()).size());
	}
}
