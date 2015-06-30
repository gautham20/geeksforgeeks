package Binary_tree;

public class isBalanced {
	
	public static int height = 0;
	

	public static Integer max(Integer a,Integer b){
		return a.intValue()>b.intValue()?a:b;
	}
	
	public static boolean isbalanced(node root){
		if(root==null || root.left==null && root.right==null){
			height = 0;
			return true;
		}
		int lh,rh;
		
		boolean leftbalance = isbalanced(root.left);
		lh = height;
		boolean rightbalance = isbalanced(root.right);
		rh = height;
		
		height = max(lh,rh)+1;
		
		return (Math.abs(lh-rh)<=1 && leftbalance && rightbalance);
	}
	
	public static void main(String args[]){
		btree bt = new btree(6);
		bt.insert(2);
		bt.insert(10);
		bt.insert(9);
		bt.insert(7);
		bt.insert(1);
		bt.insert(40);
		bt.inorder(bt.root);
		System.out.println();
		System.out.println(isbalanced(bt.root));
	}

}
