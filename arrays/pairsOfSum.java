package arrays;

public class pairsOfSum {
	
	static final int MAX = 100000;
	
	public static void main(String Args[]){
		int arr[] = {3,4,5,-1,2,3,8,4,4};
		int sum = 7;
		print_pairs(arr,sum);
		
	}
	
	public static void print_pairs(int[] arr,int sum){
		int offset = getmin(arr),temp;
		int map[] = new int[MAX];
		int pairs = 0;
		if(offset!=0){
			offset *= -1;
			for(int i=0;i<arr.length;i++){
				arr[i] += offset;
			}
			sum += 2*offset;
		}
		for(int i=0;i<arr.length;i++){
			temp = sum-arr[i];
			if(temp>0 && map[sum-arr[i]]!=0){
				map[arr[i]]++;
				pairs += map[arr[i]]*map[sum-arr[i]];
			}
			else{
				map[arr[i]]++;
			}
		}
		System.out.println(pairs);		
	}
	
	public static int getmin(int[] arr){
		int offset = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<offset){
				offset = arr[i];
			}
		}
		return offset;
	}

}
