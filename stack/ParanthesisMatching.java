package stack;

import stack.stackNode;
import stack.Stack;
import java.util.HashMap;
import java.util.Scanner;

public class ParanthesisMatching {
	
	public static boolean isMatching(String input){
		char[] parr = input.toCharArray();
		HashMap hm = new HashMap();
		Stack stack  = new Stack();
		hm.put(']', '[');
		hm.put('}', '{');
		hm.put(')', '(');
		
		for(int i=0;i<parr.length;i++){
			if(hm.containsValue(parr[i])){
				stack.push(parr[i]);
			}
			else if(hm.containsKey(parr[i])){
				if(stack.pop()!=hm.get(parr[i])){
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String arg[]){
		Scanner s = new Scanner(System.in);
		System.out.println("enter String : ");
		String input = s.next();
		if(isMatching(input)){
			System.out.println("Paranthesis matching");
		}
		else{
			System.out.println("not matching");
		}
	}

}
