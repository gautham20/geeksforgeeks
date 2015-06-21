package linked_list;

import linked_list.insertionDeletion;
import linked_list.node;

//given only the pointer to the node, delete without traversal
//have used a dummy last node, for dealing with last node cases
//please note that only this program has a dummy node, not the whole package

public class deleteFast {
	
	public static node getNthNodePointer(node head,int position){
		position--;
		if(head.data==Integer.MIN_VALUE){
			System.out.println("no nodes exists");
			return head;
		}
		node nthNode = head;
		while(nthNode!=null && nthNode.data!=Integer.MIN_VALUE){
			if(position==0){
				return nthNode;
			}
			position--;
			nthNode = nthNode.next;
		}
		
		System.out.println("node does not exist");
		return null;
	}
	
	public static void deleteNthNodeFast(node nthNode){
		if(nthNode.next==null){
			System.out.println("does not exist");
			return;
		}
		nthNode.data = nthNode.next.data;
		nthNode.next = nthNode.next.next;
	}
	
	public static void main(String args[]){
		node head = new node();
		head = insertionDeletion.insert(head,12);
		head =insertionDeletion.insert(head,14);
		head =insertionDeletion.insert(head,15);
		head =insertionDeletion.insert(head,16);
		head =insertionDeletion.insert(head,17);
		head = insertionDeletion.insertLast(head,Integer.MIN_VALUE); //dummy node
		insertionDeletion.printList(head);
		node nthNode = getNthNodePointer(head,5);
		System.out.println(nthNode.data);
		deleteNthNodeFast(nthNode);
		insertionDeletion.printList(head);
		
	}
	
}
