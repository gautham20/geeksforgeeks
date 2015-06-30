package queues;

import java.util.Scanner;

public class multipleof3 {
	
	public static void mergesort(int p,int r,int[] ar){
		int q;
		if(p<r){
			q = (p+r)/2;
			mergesort(p,q,ar);
			mergesort(q+1,r,ar);
			merge(p,q,r,ar);	
		}
		
	}
	
	public static void merge(int p,int q,int r,int[] ar){
		int n1 = q - p + 1;
		int n2 = r - q;
		int ar1[] = new int[n1+1];
		int ar2[] = new int[n2+1];
		for(int i=0;i<n1;i++){
			ar1[i]=ar[p+i];
		}
		ar1[n1]=1000;
		for(int i=0;i<n2;i++){
			ar2[i]=ar[q+i+1];
		}
		ar2[n2]=1000;
		for(int j=0,k=0,c=p; c<=r ; c++){
			
			if(ar1[j]<ar2[k]){
				ar[c]=ar1[j];
				j++;
			}
				else{
					ar[c]=ar2[k];
					k++;
				}
			
		}				
	}
	
	public static void largestmultiple(int[] arr){
		mergesort(0,arr.length-1,arr);
		int oneindex[] = new int[2];
		int twoindex[] = new int[2];
		int remove[] = new int[2];
		oneindex[0]=oneindex[1]=twoindex[0]=twoindex[1]=remove[0]=remove[1] = -1;
		int count1 = 0,count2 = 0;
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%3==1 && count1<2){
				oneindex[count1] = i;
				count1++;
			}
			else if(arr[i]%3==2 && count2<2){
				twoindex[count2] = i;
				count2++;
			}
			sum+=arr[i];
		}
		
		if(sum%3==1){
			if(count1!=0){
				remove[0] = oneindex[0];
			}
			else{
				remove[0] = twoindex[0];
				remove[1] = twoindex[1];
			}
		}
		else if(sum%3==2){
			if(count2!=0){
				remove[0] = twoindex[0];
			}
			else{
				remove[0] = oneindex[0];
				remove[1] = oneindex[1];
			}
		}
		
		for(int i=arr.length-1;i>=0;i--){
			if(i!=remove[0] && i!=remove[1]){
				System.out.print(arr[i]);
			}
		}
	}
	
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of digits, and the number");
		int n = s.nextInt();
		int num = s.nextInt();
		int arr[] = new int[n];
		for(int i=n-1;i>=0;i--){
			arr[i] = num%10;
			num/=10;
		}
		largestmultiple(arr);
		
	}
}
