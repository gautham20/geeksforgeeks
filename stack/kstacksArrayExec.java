package stack;

import java.util.Arrays;

//this is one awesome algorithm :D
//http://www.geeksforgeeks.org/efficiently-implement-k-stacks-single-array/

class kstacksArray{
	int arr[];
	int next[];
	int top[];
	int scount;
	int free;
	
	kstacksArray(int n,int scount){
		this.scount = scount+1;
		arr = new int[n];
		next = new int[n];
		top = new int[this.scount];
		free=0;
		Arrays.fill(top, -1);
		for(int i=0;i<n-1;i++){
			next[i] = i+1;
		}
		next[n-1]=-1;

	}
	
	public boolean isFull(){
		return free==-1;
	}
	
	public boolean isEmpty(int sn){
		return top[sn]==-1;
	}
	
	
	public void push(int data,int sn){
		if(isFull()){
			System.out.println("overflow");
		}
		else{
			int curr = free;
			free = next[curr];
			
			next[curr]=top[sn];
			top[sn]=curr;
			arr[curr]=data;
		}
	}
	
	public int pop(int sn){
		if(isEmpty(sn)){
			System.out.println("Underflow");
			return Integer.MIN_VALUE;
		}
		int ret_index = top[sn];
		top[sn] = next[ret_index];
		next[ret_index] = free;
		free = ret_index;
		
		int ret =  arr[ret_index];
		arr[ret_index] = 0;
		return ret;
		
	}
	
	public void print(){
		for(int x:arr){
			System.out.print(x+" ");
		}
		System.out.println();
	}
		
}


public class kstacksArrayExec {
	
	public static void main(String args[]){
		
		kstacksArray array = new kstacksArray(10,4);
		array.push(10,1);
		array.push(11,2);
		array.push(12,3);
		array.push(13,4);
		array.push(14,1);
		array.push(15,2);
		array.pop(3);
		array.pop(3);
		array.push(12,3);
		array.push(16,3);
		array.push(17,4);
		array.push(18,1);
		array.push(19,2);
		array.pop(1);
		array.push(20,3);
		array.pop(3);
		array.print();
		
	}

}
