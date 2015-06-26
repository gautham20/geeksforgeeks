package circular_ll;

import circular_ll.node;
import circular_ll.circular_ll;

public class sortedInsert {
	
	public static void insertBefore(node<Integer> node,int data){
		if(node==null){
			System.out.println("node is null");
			return;
		}
		node<Integer> newnode = new node<Integer>(data);
		newnode.next = node;
		newnode.prev = node.prev;
		node.prev = newnode;
		newnode.prev.next = newnode;
	}
	
	public static node<Integer> InsertSorted(node<Integer> first,int data){
		if(first == null){
			first = new node(data);
			return first;
		}
		node<Integer> curr = first;
		if(curr.data>data){
			insertBefore(first,data);
			first = first.prev;
			return first;
		}
		do{
			curr = curr.next;
		}while(curr!=first && curr.data<data);
		insertBefore(curr,data);
		return first;
	}
	
	public static void main(String args[]){
		circular_ll<Integer> cll = new circular_ll<Integer>(50);
		cll.push(40);
		cll.push(30);
		cll.push(20);
		cll.push(10);
		cll.print();
		cll.printReverse();
		cll.first = InsertSorted(cll.first,55);
		cll.print();
		cll.printReverse();
	}
}
