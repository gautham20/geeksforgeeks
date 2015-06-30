package Binary_tree;

import Binary_tree.btree;
import Binary_tree.node;

public class TreetoList {
	
	public static void join(node a,node b){
		a.right = b;
		b.left  = a;
	}
	
	public static node append(node alist,node blist){
		if(alist==null){
			return blist;
		}
		if(blist==null){
			return alist;
		}
		
		node alast = alist.left;
		node blast = blist.left;
		
		join(alast,blist);
		join(blast,alist);
		
		return alist;
		
		
	}
	
	public static node treetolist(node root){
		if(root==null){
			return null;
		}
		
		node alist = treetolist(root.left);
		node blist = treetolist(root.right);
		
		root.left = root;
		root.right = root;
		
		alist = append(alist,root);
		alist = append(alist,blist);
		
		return alist;
	}
	
	public static void printlist(node head){
		node curr = head;
		while(curr!=null){
			System.out.print(curr.data+" ");
			curr = curr.right;
			if(curr==head){
				break;
			}
		}
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
		node head = treetolist(bt.root);
		printlist(head);
		
		
	}
}
