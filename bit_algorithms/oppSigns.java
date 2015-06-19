package bit_algorithms;

public class oppSigns {
	public static void main(String args[]){
		int a = -100;
		int b = 13;
		System.out.println(isOpp(a,b));
		System.out.println(isOpp(-a,b));
	}
	
	public static  boolean isOpp(int a,int b){
		return ((a^b) < 0);
	}
}
