package testBST;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import bst_Package.BinarySearchTree;
//Returns the number of parent nodes in the tree that have only one child. 

public class Test_SingleParentCoun {
	
	BinarySearchTree<Integer> bst;
	
	@Before 
    public void setUp() throws Exception { 
		bst = new BinarySearchTree<Integer>(); 
	}
	
	@Test
	public void test_SingleLineofElements() {
		//supplying values in either ascending or descending order.	
		bst.add(1);
		bst.add(2);
		assertEquals(1,bst.singleParentCount());
	}
	
	@Test
	public void test_OneElementTree() {
		bst.add(1);
		assertEquals(0,bst.singleParentCount());	
	}
	
	@Test
	public void test_TwoElementTree() {
		bst.add(5);
		bst.add(6);
		assertEquals(1,bst.singleParentCount());	
	}
	
	@Test
	public void test_EmptyTree() {
		assertEquals(0,bst.singleParentCount());	
	}
	
	@Test
	public void test_ManyElements() {
		bst.add(15);
		bst.add(18); bst.add(5);
		bst.add(10);
		bst.add(11);
		assertEquals(2,bst.singleParentCount());	
	}
		
	@Test
	public void test_LargeFilledOutTree() {
		bst.add(8); bst.add(4); bst.add(12);
        bst.add(2); bst.add(6); bst.add(10); 
        bst.add(14); bst.add(1); bst.add(3); 
        bst.add(5); bst.add(7); bst.add(9); 
        bst.add(11); bst.add(13);bst.add(15); 
        assertEquals(0,bst.singleParentCount());
	}
	
}
