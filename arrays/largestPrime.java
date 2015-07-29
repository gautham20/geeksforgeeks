package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class largestPrime {
	
	public static boolean found = false;
	
	public static boolean isPrime(int[] arr){
		int n=0;
		int val = 1;
		for(int i=arr.length-1;i>=0;i--){
			n += arr[i]*val;
			val*=10;
		}
		System.out.println(n);
		int sq = (int)Math.sqrt(n);
		for(int i=2;i<=sq;i++){
			if(n%i==0){
				return false;
			}
		}
		System.out.println(n);
		found = true;
		return true;
	}
	public static void findPrime(int index,int[] arr){
		int temp[];
		if(index!=arr.length-1){
			temp = arr.clone();
			findPrime(index+1,arr);
			arr = temp;
		}
		else{
			isPrime(arr);
		}
		
		if(!found){
			
			for(int j=index+1;j<arr.length&& !found;j++){
				arr = swap(arr,index,j);
				temp = arr.clone();
				findPrime(index+1,arr);
				arr = temp;
			}
		
		}

	}
	
	public static int[] swap(int[] arr,int i,int j){
		if(i!=j){
			arr[i] = arr[i]+arr[j];
			arr[j] = arr[i] - arr[j];
			arr[i] = arr[i] - arr[j];
		}
		return arr;
	}
	
	public static int[] reverse(int[] arr){
		int i=0,j=arr.length-1;
		while(i<j){
			arr[i] = arr[i]+arr[j];
			arr[j] = arr[i] - arr[j];
			arr[i] = arr[i] - arr[j];
			i++;
			j--;
		}
		return arr;
	}
	
	public static void findlargestPrime(int[] arr){
		if(arr.length==1){
			isPrime(arr);
		}
		else{
			findPrime(0,arr);
		}
		if(!found){
			System.out.println("No Prime");
		}
	}
	
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int num = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = num%10;
			num /=10;
		}
		Arrays.sort(arr);
		arr = reverse(arr);
		
		findlargestPrime(arr);
	}
	

}
