package stack;

import stack.stackNode;
import stack.Stack;

public class ReverseUsingRecursion {
	
	public static Stack insertAtBottom(int num,Stack stack){
		if(stack.isEmpty()){
			stack.push(num);
			return stack;
		}
		int temp = (int)stack.pop();
		stack = insertAtBottom(num,stack);
		stack.push(temp);
		return stack;
	}
	
	public static Stack<Integer> recursiveReverse(Stack<Integer> stack){
		if(stack.isEmpty()){
			return stack;
		}
		int temp = stack.pop();
		stack = recursiveReverse(stack);
		insertAtBottom(temp,stack);
		return stack;		
	}
	
	
	
	public static void main(String args[]){
		Stack<Integer> stack =  new Stack<Integer>(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.print();
		stack = recursiveReverse(stack);
		stack.print();
	}

}
