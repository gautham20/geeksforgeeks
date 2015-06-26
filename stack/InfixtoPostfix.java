package stack;

import java.util.Scanner;
import stack.stackNode;
import stack.Stack;

public class InfixtoPostfix {
	
	public static boolean isOperand(char c){
		return (c>='a' && c<='z')||(c>='A' && c<='Z');
	}
	
	public static int precedence(char c){ //can add as much as one wants
		switch(c){
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		default:
			return -1;
		}
	}
	
	public static String infixtopostfix(String infix){
		Stack<Character> stack = new Stack<Character>();
		char[] infixarr = infix.toCharArray();
		StringBuilder postfix = new StringBuilder();
		for(int i=0;i<infixarr.length;i++){
			if(isOperand(infixarr[i])){
				postfix.append(infixarr[i]);
				continue;
			}
			if(infixarr[i]=='('){
				stack.push(infixarr[i]);
				continue;
			}
			if(infixarr[i]==')'){
				while(!stack.isEmpty() && stack.peek()!='('){
					postfix.append(stack.pop());
				}
				if(stack.isEmpty()){
					System.out.println("invalid exp");
					break;
				}
				stack.pop();
				continue;
			}
			while(!stack.isEmpty() && precedence(infixarr[i])<=precedence(stack.peek())){
				postfix.append(stack.pop());
			}
			stack.push(infixarr[i]);
		}
		
		while(!stack.isEmpty()){
			postfix.append(stack.pop());
		}
		return postfix.toString();
	}
	
	public static void main(String arg[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter exp: ");
		String infix = scan.next();
		String postfix = infixtopostfix(infix);
		System.out.println(postfix);
	}
}
