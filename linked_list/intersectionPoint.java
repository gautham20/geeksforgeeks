package linked_list;

//http://www.geeksforgeeks.org/write-a-function-to-get-the-intersection-point-of-two-linked-lists/

import linked_list.insertionDeletion;
import linked_list.node;
import linked_list.deleteFast;

public class intersectionPoint {
	
	public static node getIntersection(node head1,node head2){
		node curr1 = head1,second = head2,first = head2,prev1=null;
		int count1 = 0;
		while(curr1!=null){
			prev1 = curr1;
			curr1 = curr1.next;
			count1++;
		}
		prev1.next = head1;
		
		while(count1>0 && first!=null){
			first = first.next;
			count1--;
		}
		
		if(count1!=0){
			System.out.println("not intersecting");
			prev1.next = null;
			return null;
		}
		
		while(!first.equals(second)){
			first = first.next;
			second = second.next;
		}
		
		prev1.next = null;
		return first;
	}
	
	public static void main(String args[]){
		node head = new node();
		node head2 = new node();
		head = insertionDeletion.insert(head,15);
		head =insertionDeletion.insert(head,14);
		head =insertionDeletion.insert(head,13);
		head =insertionDeletion.insert(head,12);
		head =insertionDeletion.insert(head,11);
		insertionDeletion.printList(head);
		
		head2 = insertionDeletion.insert(head2,1);
		head2 =insertionDeletion.insert(head2,12);
		head2 =insertionDeletion.insert(head2,5);
		head2 =insertionDeletion.insert(head2,16);
		insertionDeletion.printList(head2);
		
		node lastnode = deleteFast.getNthNodePointer(head2, 4);
		node midnode = deleteFast.getNthNodePointer(head, 3);
		lastnode.next = midnode;
		
		insertionDeletion.printList(head);
		insertionDeletion.printList(head2);
		
		node intersection = getIntersection(head,head2);
		if(intersection!=null){
		System.out.println(intersection.data);
		}
		
	}

}
