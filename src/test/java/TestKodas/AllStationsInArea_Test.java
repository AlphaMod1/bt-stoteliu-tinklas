package TestKodas;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import kodas.*;
import lt.baltictalents.stoteliutinklas.data.beans.Station;
import lt.baltictalents.stoteliutinklas.data.hardcode.HardCodedDb;

public class AllStationsInArea_Test {

	@Test
	public void AllStationsInArea_Test() {
		AllStationsInArea test = new AllStationsInArea();
		HardCodedDb db = new HardCodedDb();
		
		List<Station> TestList1 = new ArrayList();
		List<Station> TestList2 = new ArrayList();
		TestList2.add(db.getStoteles().get(3));
		//System.out.println(test.findAllStationsInArea(54.6847849,25.2905741,54.6847849,25.2905741));

		//System.out.println(test.findAllStationsInArea(26,55,20,50).size());
		
		assertEquals(TestList1,test.findAllStationsInArea(0,0,0,0, db.getStoteles()));
		assertEquals("Bernardinø sodas",test.findAllStationsInArea(25.2905741,54.6847849,25.2905741,54.6847849, db.getStoteles()).get(0).getName());
		assertEquals(db.getStoteles().size(),test.findAllStationsInArea(26,55,20,50, db.getStoteles()).size());

	
		
	}
	
}
