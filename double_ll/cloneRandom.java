package double_ll;


import double_ll.dll_node;
import double_ll.double_ll;

import java.util.Random;

class random_dll {
	dll_node<Integer> head;
	int len = 0;
	
	random_dll(){}
	
	random_dll(dll_node<Integer> head){
		this.head = head;
	}
	
	public void insert(int data){
		if(head==null){
			head = new dll_node<Integer>(data);
			len++;
			return;
		}
		
		dll_node<Integer> newnode = new dll_node<Integer>(data);
		newnode.next = head;
		head.prev = newnode;
		head = newnode;
		len++;
	}
	
	public void randomize(){
		dll_node<Integer> curr = head;
		while(curr!=null){
			curr.prev = getrandom();
			curr = curr.next;
		}
		
	}
	
	public dll_node<Integer> getrandom(){
		Random r = new Random();
		int ran = r.nextInt(len);
		dll_node<Integer> curr = head;
		while(ran!=0 && curr!=null){
			curr= curr.next;
			ran--;
		}
		return curr;
	}
	
	public void print(){
		dll_node<Integer> curr = head;
		while(curr!=null){
			System.out.print(curr.data.toString()+" ");
			curr =curr.next;
		}
		System.out.println();
	}
	
	public void printArbit(){
		dll_node<Integer> curr = head;
		dll_node<Integer> curr2 = head;
		int l = len;
		while(curr!=null && curr2!=null){
			System.out.print(curr.data.toString()+" ");
			curr =curr.prev;
			curr2 =curr2.next;
			l--;
		}
		System.out.println();
	}
	
	public void insertAfter(dll_node<Integer> node,int data){
		if(node==null){
			System.out.println("node is null");
			return;
		}
		dll_node<Integer> newnode = new dll_node<Integer>(data);
		newnode.next = node.next;
		node.next = newnode;
		
	}
	
	public dll_node<Integer> clone(){
		dll_node<Integer> clone_head,curr;
		curr = head;
		while(curr!=null){
			this.insertAfter(curr, curr.data);
			curr = curr.next.next;
		}
		
		curr = head;
		
		while(curr!=null){
			curr.next.prev = curr.prev;
			curr = curr.next.next;
		}
		
		clone_head = head.next;
		
		curr = head;
		dll_node<Integer> clone_curr = clone_head;
		
		while(curr.next.next!=null && clone_curr.next!=null){
			curr.next = curr.next.next;
			clone_curr.next = clone_curr.next.next;
			curr = curr.next;
			clone_curr = clone_curr.next;
		}
		curr.next = null;
		return clone_head;
		
	}
	
}

public class cloneRandom {
	public static void main(String args[]){
		random_dll dll = new random_dll();
		dll.insert(20);
		dll.insert(30);
		dll.insert(40);
		dll.insert(50);
		dll.insert(60);
		dll.insert(70);
		dll.print();
		dll.randomize();
		dll.printArbit();
		random_dll dll2 = new random_dll(dll.clone());
		dll2.print();
		dll2.printArbit();
	}
}
