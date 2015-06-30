package queues;

class node{
	int data;
	node next;
	node prev;
	
	node (int data){
		this.data = data;
		next = null;
		prev = null;
	}
}

public class deque {
	
	node front,back;
	
	deque(){}
	
	deque(int data){
		front = back = new node(data);
	}
	
	public void push_back(int data){
		if(back==null){
			front = back = new node(data);
			return;
		}
		node newnode = new node(data);
		newnode.prev = back;
		back.next = newnode;
		back = newnode;
		
	}
	
	public void push_front(int data){
		if(front==null){
			front = back = new node(data);
			return;
		}
		node newnode = new node(data);
		front.prev = newnode;
		newnode.next = front;
		front = newnode;
	}
	
	public int pop_back(){
		if(back==null){
			return Integer.MIN_VALUE;
		}
		int data = back.data;
		if(back==front){
			back = front = null;
		}
		else{
			back = back.prev;
			back.next = null;
		}
		return data;
	}
	
	public int pop_front(){
		if(front==null){
			return Integer.MIN_VALUE;
		}
		int data = front.data;
		if(back==front){
			back = front = null;
		}
		else{
			front = front.next;
			front.prev = null;
		}
		return data;
	}
	
	public boolean isEmpty(){
		return front==null && back==null;
	}
	
	public void print(){
		node curr = front;
		while(curr!=null){
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
	

}
