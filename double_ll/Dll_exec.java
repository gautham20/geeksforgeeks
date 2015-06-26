package double_ll;

class dll_node<T>{
	T data;
	dll_node next;
	dll_node prev;
	
	dll_node(T data){
		this.data = data;
		next = null;
		prev = null;
	}
}

class double_ll<T>{
	dll_node<T> head;
	
	double_ll(){}
	
	double_ll(T data){
		head = new dll_node<T>(data);
	}
	
	public boolean isEmpty(){
		return head==null;
	}
	
	public void insert(T data){
		if(head==null){
			head = new dll_node<T>(data);
			return;
		}
		
		dll_node<T> newnode = new dll_node<T>(data);
		newnode.next = head;
		head.prev = newnode;
		head = newnode;
	}
	
	public void insertAfter(dll_node<T> node,T data){
		if(node==null){
			System.out.println("node is null");
			return;
		}
		dll_node<T> newnode = new dll_node<T>(data);
		newnode.prev = node;
		newnode.next = node.next;
		node.next = newnode;
		if(newnode.next!=null){
			newnode.next.prev = newnode;
		}
	}
	
	public void insertBefore(dll_node<T> node,T data){
		if(node==null){
			System.out.println("node is null");
			return;
		}
		dll_node<T> newnode = new dll_node<T>(data);
		newnode.next = node;
		newnode.prev = node.prev;
		node.prev = newnode;
		if(newnode.prev!=null){
			newnode.prev.next = newnode;
		}
	}
	
	public dll_node<T> getNodeAt(int position){
		if(position<1){
			System.out.println("invalid position");
			return null;
		}
		position--;
		dll_node<T> curr = head;
		while(curr!=null && position>0){
			curr = curr.next;
			position--;
		}
		return curr;
	}
	
	public void deleteHead(){
		if(head==null){
			System.out.println("empty list");
		}
		head = head.next;
		if(head!=null){
			head.prev = null;
		}
	}
	
	public void deleteAfter(dll_node node){
		if(node==null){
			System.out.println("node is null");
			return;
		}
		if(node.next==null){ return; }
		node.next = node.next.next;
		if(node.next!=null)
			node.next.prev = node;
	}
	
	public void deletebefore(dll_node node){
		if(node==null || node.prev==null){
			return;
		}
		if(node.prev==head){
			head = head.next;
		}
		node.prev = node.prev.prev;
		if(node.prev!=null)
			node.prev.next = node;
	}
	
	public void print(){
		dll_node<T> curr = head;
		while(curr!=null){
			System.out.print(curr.data.toString()+" ");
			curr =curr.next;
		}
		System.out.println();
	}
	
}

public class Dll_exec {
	
	public static void main(String args[]){
		double_ll<Integer> dll = new double_ll<Integer>(10);
		dll.insert(20);
		dll_node node = dll.getNodeAt(2);
		dll.insertBefore(node, 30);
		dll.insertAfter(node, 40);
		dll.print();
		dll.deleteHead();
		dll.print();
		dll.deleteAfter(node);
		dll.print();
		dll.deletebefore(node);
		dll.print();
	}
}
