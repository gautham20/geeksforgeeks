package linked_list;

import linked_list.insertionDeletion;
import linked_list.node;

public class countKey {
	
	public static int countkey(node head,int key){
		if(head.data == Integer.MIN_VALUE){
			System.out.println("empty linked list");
			return -1;
		}
		int count=0;
		while(head!=null){
			if(head.data==key){ count++; }
			head = head.next;
		}
		return count;
		
	}
	
	public static void main(String args[]){
		node head = new node();
		head = insertionDeletion.insert(head,12);
		head =insertionDeletion.insert(head,15);
		head =insertionDeletion.insert(head,15);
		head =insertionDeletion.insert(head,16);
		head =insertionDeletion.insert(head,15);
		insertionDeletion.printList(head);
		System.out.println(countkey(head,15));
	}

}
