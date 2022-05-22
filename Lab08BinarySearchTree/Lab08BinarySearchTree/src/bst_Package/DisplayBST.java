package bst_Package;

public class DisplayBST {

	public static void main(String[] args) {
		
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		
		bst.add(15);
		bst.add(18); bst.add(5);
		bst.add(10);
		
		System.out.println(bst.size());
		
		bst.showStructure();
		
	}

}
