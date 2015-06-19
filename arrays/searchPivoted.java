package arrays;

//pivoted array is one in which the elements are srted and rotated about a pivot
//the idea is that in a pivoted array it is mandatory that atleast one half of the array is sorted
//O(log n)  using binary search

public class searchPivoted {
	
	static final int arr[] = {8,9,10,1,2,3,4,5,6,7};
	
	public static void main(String args[])
	{
		int key = 4;
		int position = pivotedBinarySearch(key,arr,0,arr.length-1);
		System.out.println(position+1);
	}
	
	static int pivotedBinarySearch(int key,int[] arr,int start,int end){
		
		int mid = (start+end)/2;
		if(arr[mid]==key){
			return mid;
		}
		if(arr[start]<arr[mid]){
			if(key>=arr[start] && key<arr[mid]){
				return pivotedBinarySearch(key,arr,start,mid-1);
			}
			else
				return pivotedBinarySearch(key,arr,mid+1,end);
		}
		else{
			if(key>arr[mid]&&key<=arr[end]){
				return pivotedBinarySearch(key,arr,mid+1,end);
			}
			else
				return pivotedBinarySearch(key,arr,mid+1,end);
			
		}
		
	}
	
}
