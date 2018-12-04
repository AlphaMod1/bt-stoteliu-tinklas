package TestKodas;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import kodas.AllStationsInCircle;
import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class TestAllStationsInCircle {

	@Test
	public void testAllStationsInCircle() {
		
		HardCodedDb db = new HardCodedDb();
		AllStationsInCircle test = new AllStationsInCircle();
		List<Station> test1 = new ArrayList();
		
		test1.add(db.getStoteles().get(19));
		test1.add(db.getStoteles().get(20));
		test1.add(db.getStoteles().get(31));
		test1.add(db.getStoteles().get(1170));
		
	//	assertEquals(null,test.AllStationsInCircle(25.2540117,54.7238010,0.0, db.getStoteles()));
		//assertEquals(0,0);
	}
	
}
