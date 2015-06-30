package queues;

import queues.Stack;
import queues.stackNode;

class stackqueue{
	Stack<Integer> pushstack,popstack;
	stackqueue(){
		pushstack = new Stack<Integer>();
		popstack = new Stack<Integer>();
	}
	
	public void enqueue(int data){
		pushstack.push(data);
	}
	
	public int dequeue(){
		if(popstack.isEmpty()){
			while(!pushstack.isEmpty()){
				popstack.push(pushstack.pop());
			}
		}
		if(popstack.isEmpty()) { return Integer.MIN_VALUE; }
		return popstack.pop();
	}
	
	public void print(){
		pushstack.print();
		popstack.print();
	}
}

public class using2Stacks {
	
	public static void main(String args[]){
		stackqueue q = new stackqueue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.print();
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		
	}

}
