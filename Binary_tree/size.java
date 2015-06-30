package Binary_tree;

import Binary_tree.btree;
import Binary_tree.node;

public class size {
	
	public static int tree_size(node curr){
		if(curr==null){
			return 0;
		}
		return 1+tree_size(curr.left)+tree_size(curr.right);
	}
	
	public static void main(String args[]){
		btree bt = new btree(5);
		bt.insert(2);
		bt.insert(3);
		bt.insert(9);
		bt.insert(7);
		System.out.println(tree_size(bt.root));
		bt.inorder(bt.root);
		System.out.println();
		bt.insert(7);
		System.out.println(tree_size(bt.root));
		bt.inorder(bt.root);
	}

}
