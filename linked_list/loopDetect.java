package linked_list;

//to detect a loop in the singlelinkedlist 
//use two pointers increment one by 1 and other by 2
//if they meet there is a loop
//O(n) time
//O(1) space

import linked_list.insertionDeletion;
import linked_list.node;
import linked_list.deleteFast;

public class loopDetect {
	
	public static boolean detectLoop(node head){
		node ones = head;
		node twos = head;
		while(twos!=null && twos.next!=null){
			ones = ones.next;
			twos = twos.next.next;
			if(ones==twos){
				return true;
			}
		}
		return false;
		
	}
	
	public static void main(String args[]){
		node head = new node();
		head = insertionDeletion.insert(head,15);
		head =insertionDeletion.insert(head,14);
		head =insertionDeletion.insert(head,13);
		head =insertionDeletion.insert(head,12);
		head =insertionDeletion.insert(head,11);
		node lastnode = deleteFast.getNthNodePointer(head, 5);
		node node_two = deleteFast.getNthNodePointer(head,2);
		lastnode.next = node_two; //loop formed
		//insertionDeletion.printList(head); cannot print a loop
		System.out.println(detectLoop(head));
	}
}
