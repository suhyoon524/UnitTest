package applicationLevelMethods;

import bst_Package.BSTNode;
import bst_Package.BinarySearchTree;

public class methods {
	
	public static Comparable<Integer> min(BinarySearchTree<Integer> tree) {
	//Returns a reference to the ¡°smallest¡± value in a BST.
		BSTNode<Integer> minNode = tree.root;
	    if (minNode == null) {
	        return null;
	    }
	    while (minNode.getLeft() != null) {
	        minNode = minNode.getLeft();
	    }
	    return minNode.getInfo();
	}
	
	public static Comparable<Integer> max(BinarySearchTree<Integer> tree) {
	//Returns a reference to the ¡°largest¡± value in a BST.
		BSTNode<Integer> maxNode = tree.root;
	    if (maxNode == null) {
	        return null;
	    }
	    while (maxNode.getRight() != null) {
	        maxNode = maxNode.getRight();
	    }
	    return maxNode.getInfo();
	}
	
}
