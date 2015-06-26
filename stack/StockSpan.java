package stack;

//http://www.geeksforgeeks.org/the-stock-span-problem/

import stack.stackNode;
import stack.Stack;

public class StockSpan {
	
	public static int[] getSpan(int[] stock){
		int[] span = new int[stock.length];
		span[0]=1;
		Stack<Integer> s = new Stack<Integer>(0);
		for(int i=1;i<stock.length;i++){
			
			while(!s.isEmpty() && stock[s.peek()]<=stock[i]){
				s.pop();
			}
			if(s.isEmpty()){
				System.out.println(i);
			}
			span[i] = s.isEmpty()?i+1:i-s.peek();
			s.push(i);
		}
		return span;
	}
	
	public static void main(String args[]){
		int stock[]  = {100,90,10,20,40,200,30,50};
		int stockspan[] = getSpan(stock);
		for(int x:stockspan){
			System.out.print(x+" ");
		}
	}

}
