package circular_ll;

class node<T>{
	T data;
	node next,prev;
	node(T data){
		this.data = data;
		next = this;
		prev = this;
	}
}

class circular_ll<T>{
	node<T> first;
	circular_ll(){};
	circular_ll(T data){
		first = new node<T>(data);
	}
	
	public void push(T data){
		if(first == null){
			first = new node<T>(data);
			return;
		}
		node<T> newnode = new node<T>(data);
		newnode.next = first;
		newnode.prev = first.prev;
		first.prev.next = newnode;
		first.prev = newnode;
		first = newnode;
	}
	
	public void print(){
		node<T> curr = first;
		do{
			System.out.print(curr.data+" ");
			curr = curr.next;
		}while(curr!=first);
		System.out.println();
	}
	
	public void printReverse(){
		node<T> curr = first;
		do{
			System.out.print(curr.data+" ");
			curr = curr.prev;
		}while(curr!=first);
		System.out.println();
	}
}

public class cll_exec {
	
	public static void main(String args[]){
		circular_ll<Integer> cll = new circular_ll<Integer>(10);
		cll.push(20);
		cll.push(30);
		cll.push(40);
		cll.push(50);
		cll.print();
		cll.printReverse();
	}

}
