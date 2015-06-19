package bit_algorithms;

//to find the total number of set bits from 1 to n, when n is given
//O(log n)
//see explanation http://www.geeksforgeeks.org/count-total-set-bits-in-all-numbers-from-1-to-n/ <<<important>>>
// use long as equivalent of unsigned

public class totalSetBitsN {
	
	public static void main(String args[]){
		int n = 6;
		int count  = countBits(n);
		System.out.println(count);
	}
	
	static int getLeftmost(int n){
		int bits = 0;
		while(n>1){
			n = n >> 1;
			bits++;
		}
		return bits;
	}
	
	static int countBits(int n){
		
		if(n==0){
			return 0;
		}
		
		int m = getLeftmost(n);
		if(n == (1 << (m+1))-1){
			return (m+1)*(1 << m);
		}
		n = n - (1<<m);
		return (n+1) + countBits(n) + m*(1<<(m-1));
	}
	
}
