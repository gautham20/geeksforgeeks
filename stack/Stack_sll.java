package stack;

//stack using linked list
//a linked list, in which we can add and remove only at head, also known as root.
//no notion of capacity in ssl_stack, overflow in not possible only underflow
//http://geeksquiz.com/stack-set-1/

class stackNode{
	int data;
	stackNode next;
	stackNode(int data){
		this.data = data;
		next = null; 
	}
}

class Stack{
	private stackNode root = null;
	private int count;
	
	Stack(){}
	
	Stack(int data){
		root = new stackNode(data);
	}
	
	public void push(int data){
		if(root==null){
			root = new stackNode(data);
			return;
		}
		stackNode newNode = new stackNode(data);
		newNode.next = root;
		root = newNode;
		count++;
	}
	
	public int pop(){
		if(root==null){
			System.out.println("underflow");
			return Integer.MIN_VALUE;
		}
		int popvalue = root.data;
		root = root.next;
		count--;
		return popvalue;
	}
	
	public int getCount(){
		return count;
	}
	
	public int peek(){
		return root.data;
	}
	
	public void print(){
		stackNode curr = root;
		while(curr!=null){
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
}

public class Stack_sll {
	
	public static void main(String args[]){
		Stack s = new Stack(1);
		s.push(39);
		s.print();
		s.push(23);
		s.print();
		System.out.println(s.peek());
		System.out.println(s.pop());
	}

}
