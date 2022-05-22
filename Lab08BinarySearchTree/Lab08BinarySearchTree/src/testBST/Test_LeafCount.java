package testBST;

import applicationLevelMethods.methods;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import bst_Package.BinarySearchTree; 

public class Test_LeafCount {
	BinarySearchTree<Integer> bst;
//Leaf: node without children.
	
	@Before 
    public void setUp() throws Exception { 
		bst = new BinarySearchTree<Integer>(); 
		}
	
	@Test
	public void test_EmptyTree() {	
		assertEquals(0, bst.leafCount());		
	}
	
	@Test
	public void test_OneElementTree() {	
		bst.add(1);
		assertEquals(1, bst.leafCount());	
	}
		
	@Test
	public void test_ThreeElementsTwoLeafs() {
		bst.add(3);
		bst.add(1);
		bst.add(5);
		assertEquals(2, bst.leafCount());
	}
	
	@Test
	public void test_ThreeElementsOneLeafs() {
		bst.add(1);
		bst.add(3);
		bst.add(5);
		assertEquals(1, bst.leafCount());
	}
	
	@Test
	public void test_ManyElementsAndLeafs() {
		bst.add(5);
		bst.add(134);
		bst.add(90);
		bst.add(1);
		bst.add(200);
		bst.add(4);
		bst.add(300);
		bst.add(400);
		assertEquals(3, bst.leafCount());
	}
}

	