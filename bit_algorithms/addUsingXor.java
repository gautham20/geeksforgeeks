package bit_algorithms;

public class addUsingXor {
	
	public static void main(String args[]){
		int sum = add(5,34567);
		System.out.println(sum);
	}
	
	static int add(int a,int b){
		while(b!=0){
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		return a;
	}

}
