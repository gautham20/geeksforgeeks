package Binary_tree;

import Binary_tree.btree;
import Binary_tree.node;

public class height {
	
	public static int max(int a,int b){
		return a>b?a:b;
	}
	
	public static int tree_height(node curr){   //root at is height 0
		if(curr==null || (curr.left==null && curr.right==null)){
			return 0;
		}
		return 1+max(tree_height(curr.left),tree_height(curr.right));
	}
	
	public static void main(String args[]){
		btree bt = new btree(5);
		bt.insert(2);
		bt.insert(3);
		bt.insert(9);
		bt.insert(7);
		System.out.println(tree_height(bt.root));
		bt.inorder(bt.root);
		System.out.println();
		bt.preorder(bt.root);
		
	}

}
