package test;

import static org.junit.Assert.*;

import java.awt.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import method.UnsortedLists;

public class testisEmpty {
	public static  UnsortedLists<Integer> list;
	protected final static int DEFCAP = 100; // default capacity
	  protected static int origCap;            // original capacity

	@Before
	public void setUp() throws Exception {
		 list = new  UnsortedLists<Integer>(DEFCAP);
		  origCap = DEFCAP;
		  UnsortedLists.numElements = 0;
	}

	@Test
	public void testisEmpty_emptylist() {
		assertEquals(true, list.isEmpty());

	}
	@Test
	public void  testisEmpty_oneelement() {
		list.add(3);
		assertEquals(false, list.isEmpty());
	}
	@Test
	public void testisEmpty_manyelements() {
		
		list.add(3);
		list.add(10);
		assertEquals(false,list.isEmpty());
	}
}
