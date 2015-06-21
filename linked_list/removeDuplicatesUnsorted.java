package linked_list;

import linked_list.insertionDeletion;
import linked_list.node;
import java.util.HashMap;

public class removeDuplicatesUnsorted {
	
	public static node removeduplicates(node head){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		node curr = head,prev = head,next = null;
		while(curr!=null && curr.data!=Integer.MIN_VALUE){
			next = curr.next;
			if(map.containsKey(curr.data)){
				prev.next = curr.next;
				curr = next;	
			}
			else{
				map.put(curr.data, 1);
				prev = curr;
				curr = next;		
			}
			
			
		}
		
		return head;
	}
	
	public static void main(String args[]){
		node head = new node();
		head = insertionDeletion.insert(head,2);
		head =insertionDeletion.insert(head,89);
		head =insertionDeletion.insert(head,13);
		head =insertionDeletion.insert(head,14);
		head =insertionDeletion.insert(head,2);
		head = insertionDeletion.insert(head,13);
		head =insertionDeletion.insert(head,190);
		head =insertionDeletion.insert(head,13);
		head =insertionDeletion.insert(head,12);
		head =insertionDeletion.insert(head,2);
		head =insertionDeletion.insert(head,12);
		head =insertionDeletion.insert(head,10);
		head =insertionDeletion.insert(head,2);
		head =insertionDeletion.insertLast(head, Integer.MIN_VALUE); //dummy node for lastnode deletion
		insertionDeletion.printList(head);
		head = removeduplicates(head);
		insertionDeletion.printList(head);
	}

}
