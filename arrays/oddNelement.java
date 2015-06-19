package arrays;

//to find the only element occurring odd number of times in an array with space complexity of O(1)
//by XORing all the elements in the array, the even number's bits get cancelled out

//to find only even add 1 and sub 1
public class oddNelement {
	
	static final int arr[] = {1,2,3,1,2,3,1};
	
	public static void main(String args[]){
		System.out.println(getOddnum());
	}
	
	public static int getOddnum(){
		int residue = 0;
		for(int i=0;i<arr.length;i++){
			residue ^= arr[i];
		}
		return residue;
	}
}
