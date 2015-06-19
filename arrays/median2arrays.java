package arrays;

public class median2arrays {
	
	public static void main(String args[]){
		int arr1[] = {1, 3,5,9,10,15,18};
		int arr2[] = {2, 4,9,12,29,56,109};
		float median = getMedian(arr1,arr2,arr1.length);
		System.out.println(median);
	}
	
	public static int max(int a,int b){
		return a>b?a:b;
	}
	
	public static int min(int a,int b){
		return a>b?b:a;
	}
	
	public static float median(int[] arr,int s,int n){
		//System.out.println(s+" "+n);
		if(n%2==0){
			return (arr[s+(n/2)]+arr[s+((n/2)-1)])/2;
		}
		else{
			return arr[s+(n/2)];
		}
	}
	
	public static float getMedian(int arr1[],int arr2[],int n){
		float m;
		if((m = median(arr1,0,n))==median(arr2,0,n)){
			return m;
		}
		
		if(arr1[n-1]<arr2[0]){
			return (arr1[n-1]+arr2[0])/2;
		}
		
		if(arr1[0]>arr2[n-1]){
			return (arr1[0]+arr2[n-1])/2;
		}
		
		return medianrecur(arr1,arr2,0,0,n);
		
	}
	
	public static float medianrecur(int[] arr1,int[] arr2,int s1,int s2,int n){
		float m1 = median(arr1,s1,n);
		float m2 = median(arr2,s2,n);
		//System.out.println(m1+" "+m2+" "+s1+" "+s2+" "+n);
		if(m1==m2){
			return m1;
		}
		
		if(n==2){
			return (max(arr1[s1],arr2[s2])+min(arr1[s1+1],arr2[s2+1]))/2;
		}
		
		if(m1>m2){
			if(n%2==0){
				return medianrecur(arr1,arr2,s1,s2+(n/2),n/2);
			}
			else{
				return medianrecur(arr1,arr2,s1,s2+(n/2),(n/2)+1);
			}
		}
		
		else{
			if(n%2==0){
				return medianrecur(arr1,arr2,s1+(n/2),s2,n/2);
			}
			else{
				return medianrecur(arr1,arr2,s1+(n/2),s2,(n/2)+1);
			}
		}
		
		
	}

}
