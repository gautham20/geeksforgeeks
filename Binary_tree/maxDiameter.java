package Binary_tree;

public class maxDiameter {
	
	public static int max(int a,int b,int c){
		return a>b?(a>c?a:c):(b>c?b:c);
	}
	
	public static Integer max(Integer a,Integer b){
		return a.intValue()>b.intValue()?a:b;
	}
	
	public static int height = 0;
	
	public static int diameter(node root){
		if(root==null){
			height = 0;
			return 0;
		}
		Integer lh=0,rh=0;
		
		int ldiameter = diameter(root.left);
		lh = height;
		int rdiameter = diameter(root.right);
		rh = height;
		
		height = max(lh,rh)+1;
		
		return max(lh.intValue()+rh.intValue()+1,ldiameter,rdiameter);
	}
	
	public static void main(String args[]){
		btree bt = new btree(6);
		bt.insert(2);
		bt.insert(3);
		bt.insert(9);
		bt.insert(7);
		bt.inorder(bt.root);
		System.out.println();
		System.out.println(diameter(bt.root));
		
	}

}
