package arrays;

public class maxSubarrayDP {
	
	static final int[] arr = {-1,2,-3,4};
	
	public static void main(String args[]){
		printMaxSubarraySum();
	}
	
	public static void printMaxSubarraySum(){
		int currMax = arr[0];
		int maxSoFar = arr[0];
		for(int i=1;i<arr.length;i++){
			currMax = max(arr[i],currMax+arr[i]);
			maxSoFar = max(currMax,maxSoFar);
		}
		System.out.println(maxSoFar);
	}
	
	public static int max(int a,int b){
		return a>b?a:b;
	}

}
