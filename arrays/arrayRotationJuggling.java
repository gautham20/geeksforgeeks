package arrays;

//http://www.geeksforgeeks.org/array-rotation/
//time - O(n) space- O(1)

public class arrayRotationJuggling {
	public static int arr[] = {1,2,3,4,5,6,7,8,9};
	
	public static void main(String args[]){
		rotate(3);
		for(int x:arr){
			System.out.print(x+" ");
		}
	}
	
	public static void rotate(int r){
		
		int gcd = gcd(arr.length,r);
		for(int i=0;i<gcd;i++){
			int start = i;
			int j=start;
			int k=0;
			int temp = arr[i];
			while(true){
				k = j+r;
				if(k>=arr.length){
					k = k-arr.length;
				}
				if(k==start){
					arr[j] = temp;
					break;
				}
				arr[j] = arr[k];
				j = k;
			}
		}
		
	}
	
	public static int gcd(int n,int r){
		if(r==0){
			return n;
		}
		return gcd(r,n%r);
	}
}
