package Binary_tree;

public class isIdentical {
	
	public static boolean checkIdentical(node curr1,node curr2){
		if(curr1==null && curr2==null){
			return true;
		}
		if(curr1!=null && curr2!=null){
			return (curr1.data==curr2.data &&
					checkIdentical(curr1.left,curr2.left) &&
					checkIdentical(curr1.right,curr2.right));
		}
		return false;
	}
	
	public static void main(String args[]){
		btree bt = new btree(5);
		bt.insert(2);
		bt.insert(3);
		bt.insert(9);
		bt.insert(7);
		
		btree bt2 = new btree(5);
		bt2.insert(2);
		bt2.insert(3);
		bt2.insert(9);
		bt2.insert(7);
		
		System.out.println(checkIdentical(bt.root,bt2.root));
		
		bt2.insert(1);
		
		System.out.println(checkIdentical(bt.root,bt2.root));
		
		
		
		
		
	}

}
