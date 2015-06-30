package Binary_tree;

import Binary_tree.btree;
import Binary_tree.node;

public class countLeaf {
	
	public static int countLeaf(node root){
		if(root==null){
			return 0;
		}
		if(root.left==null && root.right==null){
			return 1;
		}
		return countLeaf(root.left)+countLeaf(root.right);
	}
	
	public static void main(String args[]){
		btree bt = new btree(6);
		bt.insert(2);
		bt.insert(3);
		bt.insert(9);
		bt.insert(7);
		bt.insert(11);
		bt.inorder(bt.root);
		System.out.println();
		System.out.println(countLeaf(bt.root));
	}

}
