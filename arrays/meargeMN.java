package arrays;

//There are two sorted arrays. First one is of size m+n containing only m elements. Another one is of size n and contains n elements.
//Merge these two arrays into the first array of size m+n such that the output is sorted

//move all elements to the end, and use modified merge function

public class meargeMN {
	static int mPlusn[] = {1,3,-1,5,-1,6,7,8,-1};
	static int n[] = {2,4,9};
	
	public static void main(String args[]){
		moveToEnd();
		for(int x:mPlusn){
			System.out.print(x+" ");
		}
		System.out.println();
		merge();
		for(int x:mPlusn){
			System.out.print(x+" ");
		}
	}
	
	public static void moveToEnd(){
		int i = mPlusn.length-1;
		int j = i;
		for(;i>=0;i--){
			if(mPlusn[i]!=-1){
				mPlusn[j] = mPlusn[i];
				j--;
			}
		}
	}
	
	public static void merge(){
		int i=n.length;
		int j = 0;
		int k = 0;
		
		for(;j<n.length && i<mPlusn.length;k++){
			if(mPlusn[i]<n[j]){
				mPlusn[k] = mPlusn[i];
				i++;
			}
			else{
				mPlusn[k] = n[j];
				j++;
			}
		}
		k--;
		while(j<n.length){
			mPlusn[k] = n[j];
			k++;
			j++;
		}
		
		
		
		while(i<mPlusn.length){
			mPlusn[k] = mPlusn[i];
			k++;
			i++;
		}
	}
}
