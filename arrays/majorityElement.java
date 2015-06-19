package arrays;

//majority element is the element that occurs more than n/2 times in an array
//U WOULD BE TEMPTED TO USE COUNTING SORT KINDA THING
//but to achieve auxillary space of O(1) use MOORE'S VOTING ALGO


public class majorityElement {
	
	static final int arr[] = {3,3,4,5,3,6,3,4,5};
	
	public static void main(String args[]){
		int candidate = findCandidate();
		boolean is_major = check(candidate);
		if(is_major){
			System.out.println(candidate);
		}
		else
			System.out.println("NONE");
	}
	
	public static int findCandidate(){
		int major = arr[0];
		int count = 1;
		for(int i=1;i<arr.length;i++){
			if(arr[i] == major)
				count++;
			else
				count--;
			if(count==0){
				major = arr[i];
				count = 1;
			}
		}
		return major;
	}
	
	public static boolean check(int candidate){
		int key = (int)Math.ceil(arr.length/2);
		int count = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==candidate){
				count++;
				if(count==key){
					return true;
				}
			}
		}
		return false;
	}

}
