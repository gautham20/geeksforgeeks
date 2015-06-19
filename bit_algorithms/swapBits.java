package bit_algorithms;

//http://www.geeksforgeeks.org/swap-bits-in-a-given-number/

public class swapBits {
	
	public static void main(String args[]){
		int swapped = swapBits(47,1,5,3);
		System.out.println(swapped);
	}
	
	static int swapBits(int num,int s1,int s2,int n){
		int set1 = (num >> s1) & ((1 << n) - 1);
		int set2 = (num >> s2) & ((1<<n) - 1);
		int xor = set1 ^ set2;
		xor = (xor << s1)|(xor<<s2);
		int swapped = num^xor;
		return swapped;
	}
	
}
