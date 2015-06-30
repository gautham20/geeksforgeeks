package Binary_tree;

public class childrenSum {
	
	public static boolean childrensum(node root){
		if(root==null ||(root.left==null && root.right==null)){
			return true;
		}
		if(!childrensum(root.left)||!childrensum(root.right)){
			return false;
		}
		
		if(root.left==null){
			return root.data==root.right.data;
		}
		
		if(root.right==null){
			return root.data==root.left.data;
		}
		return root.data==(root.left.data+root.right.data);
	}
	
	public static void main(String args[]){
		btree bt = new btree(20);
		bt.insert(20);
		bt.insert(20);
		bt.inorder(bt.root);
		System.out.println();
		System.out.println(childrensum(bt.root));
	}

}
