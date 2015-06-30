package queues;

import java.util.Queue;
import java.util.LinkedList;

public class nBinary {
	
	public static void printBinary(int n){
		Queue<String> q = new LinkedList<String>();
		q.add("1");
		
		while(n-->0){
			String front = q.poll();
			System.out.println(front);
			q.add(front+"0");
			q.add(front+"1");
		}
	}
	
	public static void main(String args[]){
		int n = 30;
		printBinary(n);
	}

}
