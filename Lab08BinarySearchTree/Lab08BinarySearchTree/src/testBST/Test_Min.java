package testBST;

import static org.junit.Assert.assertEquals;
import applicationLevelMethods.*;
import org.junit.Before;
import org.junit.Test;

import bst_Package.BinarySearchTree;

public class Test_Min {
//Returns a reference to the ¡°smallest¡± value in a BST
	
	BinarySearchTree<Integer> bst;
	@Before 
    public void setUp() throws Exception { 
		bst = new BinarySearchTree<Integer>(); 
	}
	
	@Test
	public void test_EmptyTree() {	
		assertEquals(null, methods.min(bst));
	}
	
	@Test
	public void test_Min() {
		bst.add(4);
		bst.add(23);
		bst.add(300);
		assertEquals(4, methods.min(bst));
	}
		
	@Test
	public void test_OneElementTree() {	
		bst.add(1);
		assertEquals(1, methods.min(bst));
	}
	

	@Test
	public void test_ManyElements() {
		bst.add(1);
		bst.add(10); 
		bst.add(20);
		bst.add(30);
		assertEquals(1, methods.min(bst));
	}

}