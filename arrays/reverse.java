package arrays;

public class reverse {
	
	static int arr[] = {2,63,135,63,3,63,2,1};
	
	public static void main(String args[]){
		reversearr();
		for(int x:arr){
			System.out.print(x+" ");
		}
	}
	
	static void reversearr(){
		int start  = 0;
		int end = arr.length-1;
		while(start<end){
			//don't use a= a+b-(b=a);
			arr[start] = arr[start]+arr[end];
			arr[end] = arr[start]-arr[end];
			arr[start] = arr[start]-arr[end];
			start++;
			end--;
			
		}
			
	}

}
