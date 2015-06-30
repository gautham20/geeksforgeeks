package queues;

import java.util.Arrays;


class kqueuesArray{
	int arr[];
	int next[];
	int front[];
	int rear[];
	int free;
	
	kqueuesArray(int n,int k){
		arr = new int[n];
		next = new int[n];
		front = new int[k];
		Arrays.fill(front, -1);
		rear  = new int[k];
		free = 0;
		for(int i=0;i<n-1;i++){
			next[i] = i+1;
		}
		next[n-1] = -1;
	}
	
	public boolean isFull(){
		return free==-1;
	}
	
	public boolean isEmpty(int qn){
		return front[qn]==-1;
	}
	
	public void enqueue(int data,int qn){
		qn--;
		if(isFull()){
			System.out.println("overflow");
			return;
		}
		
		int curr = free;
		free = next[curr];
		
		if(isEmpty(qn)){
			front[qn] = curr;
		}
		else{
			next[rear[qn]] = curr;
		}
		rear[qn] = curr;
		next[curr] = -1;
		arr[curr] = data;	
	}
	
	public int dequeue(int qn){
		qn--;
		if(isEmpty(qn)){
			System.out.println("Queue empty");
			return Integer.MIN_VALUE;
		}
		int curr = front[qn];
		int data = arr[curr];
		front[qn] = next[curr];
		next[curr] = free;
		free = curr;
		arr[curr] = -1;
		return data;
	}
	
	public void print(){
		for(int x:arr){
			System.out.print(x+" ");
		}
		System.out.println();
	}
}

public class kqueuesArrayExec {
	
	public static void main(String args[]){
		kqueuesArray q = new kqueuesArray(10,4);
		q.enqueue(1,1);
		q.enqueue(2,2);
		q.enqueue(3,3);
		q.enqueue(4,4);
		q.print();
		q.enqueue(5,1);
		q.enqueue(6,1);
		q.enqueue(7,3);
		q.enqueue(8,3);
		q.enqueue(9,4);
		q.enqueue(10,4);
		q.print();
		q.enqueue(10,4);
		System.out.println(q.dequeue(2));
		System.out.println(q.dequeue(2));
		q.print();
	}

}
