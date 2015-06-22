package linked_list;

import linked_list.insertionDeletion;
import linked_list.node;

public class swapPairwise {
	
	public static void swapNodes(node head){
		node curr = head;
		while(curr!=null && curr.next!=null){
			swap(curr,curr.next);
			curr = curr.next.next;
		}
	}
	
	public static void swap(node n1,node n2){
		n1.data = n1.data+n2.data;
		n2.data = n1.data-n2.data;
		n1.data = n1.data-n2.data;
	}
	
	public static void main(String args[]){
		node head = new node();
		head = insertionDeletion.insert(head,2);
		head =insertionDeletion.insert(head,89);
		head =insertionDeletion.insert(head,13);
		head =insertionDeletion.insert(head,14);
		head =insertionDeletion.insert(head,2);
		head =insertionDeletion.insert(head,3);
		insertionDeletion.printList(head);
		swapNodes(head);
		insertionDeletion.printList(head);
	}

}
