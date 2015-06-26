package stack;

//this program uses variables provide values to variables to get the evaluated value

import java.util.Scanner;

import stack.stackNode;
import stack.Stack;

public class PostfixEvaluation {
	
	public static boolean isOperand(char c){
		return (c>='a' && c<='z')||(c>='A' && c<='Z');
	}
	
	public static String postfixEval(String postfix){
		char postfixarr[] = postfix.toCharArray();
		Stack<String> stack = new Stack<String>();
		for(int i=0;i<postfixarr.length;i++){
			if(isOperand(postfixarr[i])){
				stack.push(""+postfixarr[i]);
				continue;
			}
			StringBuilder temp = new StringBuilder();
			String s2=null,s1=null;
			if(!stack.isEmpty())
				s2 = stack.pop(); 
			if(!stack.isEmpty())
				s1 = stack.pop();
			if(s1==null){
				System.out.println("invalid exp");
				break;
			}
			stack.push(s1+postfixarr[i]+s2);
			
		}
		if(stack.getCount()!=1){
			System.out.println("invalid exp");
			return null;
		}
		return stack.pop();
	}
	
	public static void main(String arg[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter exp: ");
		String postfix = scan.next();
		String infix = postfixEval(postfix);
		System.out.println(infix);
	}

}
