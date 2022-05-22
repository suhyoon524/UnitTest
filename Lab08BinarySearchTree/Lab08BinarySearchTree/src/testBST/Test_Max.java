package testBST;

import static org.junit.Assert.assertEquals;
import applicationLevelMethods.*;
import org.junit.Before;
import org.junit.Test;

import bst_Package.BinarySearchTree;

public class Test_Max {

	BinarySearchTree<Integer> bst;
	@Before 
    public void setUp() throws Exception { 
		bst = new BinarySearchTree<Integer>(); 
	}
	
	@Test
	public void test_EmptyTree() {	
		assertEquals(null, methods.max(bst));
	}
	
	@Test
	public void test_Max() {
		bst.add(4);
		bst.add(23);
		bst.add(300);
		assertEquals(300, methods.max(bst));
	}
	
	@Test
	public void test_OneElementTree() {	
		bst.add(1);
		assertEquals(1, methods.max(bst));
	}

	@Test
	public void test_ManyElements() {
		bst.add(1);
		bst.add(10); 
		bst.add(20);
		bst.add(30);
		assertEquals(30, methods.max(bst));
	}
}