package bit_algorithms;

//find the element occurring 1 time midst of elements occurring 3 times
//refer the other method in http://www.geeksforgeeks.org/find-the-element-that-appears-once/
// O(n) space- O(1)

public class onlyElementin3s {
	public static void main(String args[]){
		int arr[] = {1,1,1,2,2,2,3};
		int one = getOne(arr);
		System.out.println(one);
	}
	
	public static int getOne(int[] arr){
		int mask,sum,one=0;
		for(int i=0;i<5;i++){   //32 bits in int
			mask = 1 << i;
			sum = 0;
			for(int j=0;j<arr.length;j++){
				if((arr[j] & mask)!=0){
					sum++;
				}
			}
			
			if(sum%3!=0){
				one = one|mask;
			}
		}
		
		return one;
	}
}
