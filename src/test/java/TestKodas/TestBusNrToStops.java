package TestKodas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Functions.BusNrToStops;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class TestBusNrToStops {
	
	@Test
	public void testBusNrToStops() {
		HardCodedDb db = new HardCodedDb();
		BusNrToStops test = new BusNrToStops();
		StringBuilder sb = new StringBuilder();
		assertEquals(null,test.busnrtostops(false, "1g", db.getStoteles()));
		assertEquals(test.busnrtostops(true, "3G", db.getStoteles()).size(),test.busnrtostops(true, "3g", db.getStoteles()).size());
		
		
		
		
	}

}
