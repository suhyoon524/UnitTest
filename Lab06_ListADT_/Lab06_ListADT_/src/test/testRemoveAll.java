package test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import method.UnsortedLists;

public class testRemoveAll {
	 static UnsortedLists<Integer> list;
		protected final static int DEFCAP = 100; // default capacity
		  protected static int origCap;            // original capacity
	@BeforeClass
	public static  void setUpBeforeClass() throws Exception {
		 list = new  UnsortedLists<Integer>(100);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	
	}

	@Before
	public void setUp() throws Exception {
		 list = new  UnsortedLists<Integer>(DEFCAP);
		  origCap = DEFCAP;
		  UnsortedLists.numElements = 0;
	}

	@Test
	public void test_emptyList() {
		
		assertEquals(0, list.removeAll(2));
	}
	
	@Test
	public void testRemove_manyelemetns() {
		list.add(2);
		list.add(2);
		list.add(20);
		list.add(2);
		assertEquals(3, list.removeAll(2));
	}
	
	@Test
	public void testRemoveAll_oneelement() {
		list.add(2);
		list.add(10);
		assertEquals(1, list.removeAll(2));
	}
	@Test
	public void testRemoveAll_elementdne() {
		
		list.add(3);
		list.add(10);
		assertEquals(0, list.removeAll(9));
	}
}
