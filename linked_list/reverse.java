package linked_list;

import linked_list.insertionDeletion;
import linked_list.node;

public class reverse {
	
	public static node reverseList(node head){
		node prev=null,curr=head,next;
		while(curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return head;
	}
	
	public static void main(String args[]){
		node head = new node();
		head = insertionDeletion.insert(head,15);
		head =insertionDeletion.insert(head,14);
		head =insertionDeletion.insert(head,13);
		head =insertionDeletion.insert(head,12);
		head =insertionDeletion.insert(head,11);
		insertionDeletion.printList(head);
		head = reverseList(head);
		insertionDeletion.printList(head);
	}
}
