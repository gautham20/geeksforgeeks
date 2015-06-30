package Binary_tree;

import Binary_tree.btree;
import Binary_tree.node;
import Binary_tree.height;

public class levelOrder {
	
	public static void levelorder(node root){
		int h = height.tree_height(root);
		for(int i=0;i<=h;i++){
			printlevel(root,i);
		}
	}
	
	public static void printlevel(node root,int level){
		if(root==null){
			return;
		}
		
		if(level==0){
			System.out.print(root.data+" ");
			return;
		}
		
		printlevel(root.left,level-1);
		printlevel(root.right,level-1);
		
		
	}
	
	public static void main(String args[]){
		btree bt = new btree(6);
		bt.insert(2);
		bt.insert(3);
		bt.insert(9);
		bt.insert(7);
		bt.inorder(bt.root);
		System.out.println();
		bt.preorder(bt.root);
		System.out.println();
		levelorder(bt.root.right);
	}
}
