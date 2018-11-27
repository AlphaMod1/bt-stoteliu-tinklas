package TestKodas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import kodas.BusNrToStops;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class TestBusNrToStops {
	
	@Test
	public void testBusNrToStops() {
		HardCodedDb db = new HardCodedDb();
		BusNrToStops test = new BusNrToStops();
		StringBuilder sb = new StringBuilder();
		assertEquals(null,test.busnrtostops(false, "1g"));
		assertEquals(test.busnrtostops(true, "3G").size(),test.busnrtostops(true, "3g").size());
		
		
		for(int i = 1; i < 7; i++) {
			 
			sb.append(i+"g");
			
			assertEquals(null,test.busnrtostops(false, sb.toString()));
		}
		
	}

}
