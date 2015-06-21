package linked_list;

import linked_list.insertionDeletion;
import linked_list.node;

public class nthElementfromLast {
	
	public static int nthFromLast(node head,int n){
		node nthnode=head,last=head;
		if(head.data==Integer.MIN_VALUE){
			System.out.println("no nodes");
			return -1;
		}
		if(n <= 0){
			System.out.println("n must be positive");
			return -1;
		}
		int count = 0;
		while(count < n){
			if(last==null){
				System.out.println("length overflow");
				return -1;
			}
			last = last.next;
			count++;	
		}
		while(last!=null){
			last = last.next;
			nthnode = nthnode.next;
		}
		return nthnode.data;
	}
	
	public static void main(String args[]){
		node head = new node();
		head = insertionDeletion.insert(head,12);
		head =insertionDeletion.insert(head,14);
		head =insertionDeletion.insert(head,15);
		head =insertionDeletion.insert(head,16);
		head =insertionDeletion.insert(head,17);
		insertionDeletion.printList(head);
		System.out.println(nthFromLast(head,0));
	}
}
