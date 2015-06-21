package linked_list;

import linked_list.insertionDeletion;
import linked_list.node;

public class getMiddleNode {
	
	public static int getMiddle(node head){
		if(head.data==Integer.MIN_VALUE){
			System.out.println("no nodes");
			return Integer.MIN_VALUE;
		}
		node twice;
		node single;
		twice = single = head;
		while(twice.next!=null && twice.next.next!=null){
			twice = twice.next.next;
			single = single.next;
		}
		return single.data;
	}
	
	public static void main(String args[]){
		node head = new node();
		head = insertionDeletion.insert(head,12);
		head =insertionDeletion.insert(head,14);
		head =insertionDeletion.insert(head,15);
		head =insertionDeletion.insert(head,16);
		head =insertionDeletion.insert(head,17);
		insertionDeletion.printList(head);
		System.out.println(getMiddle(head));
		head = insertionDeletion.insert(head,18);
		insertionDeletion.printList(head);
		System.out.println(getMiddle(head));
		
	}
}
