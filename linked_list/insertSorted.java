package linked_list;


import linked_list.insertionDeletion;
import linked_list.node;

public class insertSorted {
	
	public static node insertsorted(node head,int data){
		node newnode = new node(data);
		if(head.data == Integer.MIN_VALUE){
			return newnode;
		}
		
		if(head.data>data){
			newnode.next = head;
			head = newnode;
			return head;
		}
		
		node current=head,prev=head;
		while(current!=null && current.data<data){
			prev=current;
			current = current.next;
		}
		prev.next = newnode;
		newnode.next = current;
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
		head = insertsorted(head,20);
		insertionDeletion.printList(head);
		head = insertsorted(head,10);
		insertionDeletion.printList(head);
		head = insertsorted(head,14);
		insertionDeletion.printList(head);
		head = insertsorted(head,13);
		insertionDeletion.printList(head);
	}

}
