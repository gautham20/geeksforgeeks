package queues;

import java.util.Scanner;

public class mergesort {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int tc = s.nextInt();s.nextLine();
		while(tc>0){
			int n = s.nextInt();s.nextLine();
			int a[] = new int[n];
			for(int i=0;i<n;i++){
				a[i]=s.nextInt();
			}
			mergesort(0,n-1,a);
			
			for(int i=0;i<n;i++){
				System.out.print(a[i]+" ");
			}
		}
	}
	
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
}




