package Binary_tree;

import Binary_tree.height;

public class levelOrderSpiral {
	
	public static void levelorderspiral(node root){
		int h = height.tree_height(root);
		for(int i=0;i<=h;i++){
			printlevelspiral(root,i,i%2);
		}
	}
	
	public static void printlevelspiral(node root,int level,int dir){
		if(root==null){
			return;
		}
		
		if(level==0){
			System.out.print(root.data+" ");
			return;
		}
		
		if(dir==1){
			printlevelspiral(root.left,level-1,dir);
			printlevelspiral(root.right,level-1,dir);
		}
		else{
			printlevelspiral(root.right,level-1,dir);
			printlevelspiral(root.left,level-1,dir);
		}
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
		levelorderspiral(bt.root);
	}

}
