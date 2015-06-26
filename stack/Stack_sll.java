package stack;

//stack using linked list
//a linked list, in which we can add and remove only at head, also known as root.
//no notion of capacity in ssl_stack, overflow in not possible only underflow
//http://geeksquiz.com/stack-set-1/

class stackNode<T>{
	T data;
	stackNode next;
	stackNode(T data){
		this.data = data;
		next = null; 
	}
}

class Stack<T>{
	private stackNode<T> root = null;
	
	Stack(){
	}
	
	Stack(T data){
		root = new stackNode(data);
	}
	
	public boolean isEmpty(){
		return (root==null);
	}
	
	public void push(T data){
		if(root==null){
			root = new stackNode(data);
			return;
		}
		stackNode newNode = new stackNode(data);
		newNode.next = root;
		root = newNode;
	}
	
	public T pop(){
		if(root==null){
			System.out.println("underflow");
			return null;
		}
		T popvalue = root.data;
		root = root.next;
		return popvalue;
	}
	
	public int getCount(){
		stackNode curr = root;
		int count = 0;
		while(curr!=null){
			count++;
			curr=curr.next;
		}
		return count;
	}
	
	public T peek(){
		return root.data;
	}
	
	public void print(){
		stackNode curr = root;
		while(curr!=null){
			System.out.print(curr.data.toString()+" ");
			curr=curr.next;
		}
		System.out.println();
	}
}

public class Stack_sll {
	
	public static void main(String args[]){
		Stack<Integer> s = new Stack<Integer>(1);
		s.push(39);
		s.print();
		s.push(23);
		s.print();
		System.out.println(s.peek());
		System.out.println(s.pop());
		
		Stack<String> s2 = new Stack<String>("gautham");
		s2.push("farina");
		s2.print();
		System.out.println(s2.pop());
	}

}
