package linked_list;

import linked_list.node;

public class getNthNode {
	
	public static node insert(node head,int data){
		if(head.data==Integer.MIN_VALUE){
			head.data = data;
			return head;
		}
		node newNode = new node(data);
		newNode.next = head;
		head = newNode;		
		return head;

	}
	
	public static int getNthNode(node head,int position){
		position--; //converting to index zero
		while(head!=null){
			if(position==0){
				return head.data;
			}
			position--;
			head = head.next;
		}
		System.out.println("N does not exist");
		return Integer.MIN_VALUE;
	}
	
	public static void printList(node head){  //no need of temp, because the function cannot
		if(head.data==Integer.MIN_VALUE){    //change where head points to
			System.out.println("No elements");
		}
		while(head!=null){
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}
	
	
	public static void main(String args[]){
		node head = new node();
		head = insert(head,10);
		head = insert(head,20);
		head = insert(head,30);
		head = insert(head,40);
		printList(head);
		System.out.println(getNthNode(head,2));
		System.out.println(getNthNode(head,5));
		
	}

}
