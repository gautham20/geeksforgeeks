package arrays;

//given n-1 numbers in range 1 to n, find the missing number
//simple approach is sum formula
//now we are using XOR
//LOGIC - XOR A with B, with B being a part of A, we get the remaining part of A, because A's bits are fliped

public class missing_num {
	
	
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,6,7,9};
		int x1=0,x2=0;
		for(int i=0;i<arr.length;i++){
			x1 ^= arr[i];
			x2 ^= i+1;
		}
		x2 ^= arr.length+1;
		System.out.println(x1^x2);
	}

}
