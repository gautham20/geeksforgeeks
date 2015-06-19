package arrays;

import java.util.Scanner;

public class maxSubarrayKadane {
public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0){
			int n = s.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++){
				arr[i]=s.nextInt();
			}
			int bestsum = 0;
			int currentsum = 0;
			int val = 0;
			int vl = -10001;
			int sum = 0;
			for(int i=0;i<n;i++){
				if(arr[i]>0){
					sum += arr[i];
				}
				
				if(arr[i]>vl){
					vl = arr[i];
				}
				val = currentsum + arr[i];
				
				if(val > 0){
					currentsum = val;
				}
				else{
					currentsum = 0;
				}
				if(currentsum>bestsum){
					bestsum = currentsum;
				}
			}
			if(bestsum==0){
				
				System.out.println(vl+" "+vl);
			}
			else
			System.out.println(bestsum+" "+sum);
			
			t--;
		}
		s.close();
}
}

