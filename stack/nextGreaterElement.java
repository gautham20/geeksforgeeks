package stack;

import stack.stackNode;
import stack.Stack;

public class nextGreaterElement {
	
	public static void printNextGreater(int arr[]){
		Stack<Integer> stack = new Stack<Integer>(arr[0]);
		int temp=0;
		for(int i=1;i<arr.length;i++){
			while(!stack.isEmpty() && arr[i]>stack.peek() ){
				System.out.println(stack.pop()+"->"+arr[i]);
			}

			stack.push(arr[i]);
		}
		while(!stack.isEmpty()){
			System.out.println(stack.pop()+"->"+"-1");
		}
	}
	
	public static void main(String args[]){
		int arr[] = {3,1,5,9,1,4};
		printNextGreater(arr);
	}
	
}
