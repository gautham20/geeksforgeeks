package queues;

import queues.node;
import queues.deque;

public class maximumInSubarray {
	
	public static void maxInK(int[] arr,int k){
		deque q = new deque(0);
		int curr=0;
		for(;curr<k;curr++){
			while(!q.isEmpty() && arr[q.back.data]<arr[curr]){
				q.pop_back();
			}
			q.push_back(curr);
		}
		
		for(;curr<arr.length;curr++){
			System.out.print(arr[q.front.data]+" ");
			
			while(!q.isEmpty() && q.front.data<curr-k){
				q.pop_front();
			}
			
			while(!q.isEmpty() && arr[q.back.data]<arr[curr]){
				q.pop_back();
			}
			q.push_back(curr);
		}
		
		System.out.print(arr[q.front.data]+" ");
		
	}
	
	public static void main(String args[]){
		int arr[] = {4,2,3,5,5,2,6,8,9,2,10};
		int k = 3;
		maxInK(arr,k);
	}

}
