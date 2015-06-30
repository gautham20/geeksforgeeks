package Binary_tree;

class node{
	int data;
	node left;
	node right;
	
	node(int data){
		this.data = data;
		left = null;
		right = null;
	}
}

class btree{
	node root;
	
	btree(){}
	btree(int data){
		root = new node(data);
	}
	
	public void insert(int data){
		node curr = root;
		while(true){
			if(curr.data>data){
				if(curr.left==null){
					break;
				}
				curr = curr.left;
			}
			else{
				if(curr.right==null){
					break;
				}
				curr =curr.right;
			}
		}
		
		if(curr.data>data){
			curr.left = new node(data);
		}
		else{
			curr.right = new node(data);
		}
		
		
		
	}
	
	public void insertrandom(int data){
		node curr = root;
		
	}
	
	public void inorder(node curr){
		if(curr==null){
			return;
		}
		inorder(curr.left);
		System.out.print(curr.data+" ");
		inorder(curr.right);
	}
	
	public void postorder(node curr){
		if(curr == null){
			return;
		}
		postorder(curr.left);
		postorder(curr.right);
		System.out.print(curr.data+" ");
	}
	
	public void preorder(node curr){
		if(curr == null){
			return;
		}
		System.out.print(curr.data+" ");
		preorder(curr.left);
		preorder(curr.right);
	}
}

public class BinaryTreeExec {
	
	public static void main(String args[]){
		btree bt = new btree(5);
		bt.inorder(bt.root);
		System.out.println();
		bt.insert(3);
		bt.inorder(bt.root);
		System.out.println();
		bt.insert(10);
		bt.inorder(bt.root);
		System.out.println();
		bt.insert(2);
		bt.inorder(bt.root);
		System.out.println();
		bt.preorder(bt.root);
		System.out.println();
		bt.postorder(bt.root);
		System.out.println();
	}

}
