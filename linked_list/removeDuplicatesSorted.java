package linked_list;

import linked_list.insertionDeletion;
import linked_list.node;

public class removeDuplicatesSorted {
	
	public static node removeDuplicates(node head){
		if(head.data==Integer.MIN_VALUE){
			System.out.println("empty list");
			return head;
		}
		node curr=head,prev = head;
		int currdata = head.data;
		while(curr!=null){
			if(currdata<curr.data){
				prev.next = curr;
				prev = curr;
				currdata = curr.data;
			}
			curr=curr.next;
		}
		prev.next = null;
		return head;
		
	}
	
	public static void main(String args[]){
		node head = new node();
		head = insertionDeletion.insert(head,15);
		head =insertionDeletion.insert(head,15);
		head =insertionDeletion.insert(head,14);
		head =insertionDeletion.insert(head,14);
		head =insertionDeletion.insert(head,14);
		head = insertionDeletion.insert(head,13);
		head =insertionDeletion.insert(head,13);
		head =insertionDeletion.insert(head,13);
		head =insertionDeletion.insert(head,12);
		head =insertionDeletion.insert(head,12);
		head =insertionDeletion.insert(head,12);
		head =insertionDeletion.insert(head,11);
		head =insertionDeletion.insert(head,11);
		insertionDeletion.printList(head);
		head = removeDuplicates(head);
		insertionDeletion.printList(head);
	}

}
