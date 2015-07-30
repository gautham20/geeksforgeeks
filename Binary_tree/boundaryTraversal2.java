package Binary_tree;

public class boundaryTraversal2 {
	
	public static boolean preorderLeft(node root,boolean rleaf){
		if(root==null){
			return rleaf;
		}
		
		if(root.right==null && root.left==null){
			System.out.print(root.data+" ");
			rleaf = false;
			return rleaf;
		}
		
		if(rleaf){
			System.out.print(root.data+" ");
		}
		
		rleaf = preorderLeft(root.left,rleaf);
		rleaf = preorderLeft(root.right,rleaf);
		
		return rleaf;
	}
	
	public static boolean postorderRight(node root,boolean rleaf){
		if(root==null){
			return rleaf;
		}
		
		boolean rleafnow = rleaf;
		
		rleaf = postorderRight(root.right,rleaf);
		rleaf = postorderRight(root.left,rleaf);
		
		if(root.right==null && root.left==null){
			System.out.print(root.data+" ");
			rleaf = false;
			return rleaf;
		}
		
		if(rleafnow){
			System.out.print(root.data+" ");
		}
		
		return rleaf;
		
		
	}
	
	public static void btraversal(node root){
		if(root==null){
			return;
		}
		if(root.right==null && root.left==null){
			System.out.print(root.data);
			return;
		}
		while(root.left!=null || root.right!=null){
		if(root.left!=null){
			System.out.print(root.data+" ");
			preorderLeft(root.left,true);
			postorderRight(root.right,true);
			break;
		}
		else{
			System.out.print(root.data+" ");
			root = root.right;
			}
		}
	}
	
	public static void main(String args[]){
		btree bt = new btree(10);
		bt.insert(2);
		bt.insert(3);
		bt.insert(20);
		bt.insert(15);
		bt.insert(18);
		bt.insert(1);
		btraversal(bt.root);
	}

}
