package stack;

public class twoStacksArray {
	
	public static int arr[] = new int[10];
	public static int top1 = -1;
	public static int top2 = arr.length;
	
	public static void push1(int data){
		if(top2-top1>1){
			arr[++top1]=data;
		}
		else{
			System.out.println("stack1 overflow");
		}
		
	}
	
	public static void push2(int data){
		if(top2-top1>1){
			arr[--top2]=data;
		}
		else{
			System.out.println("stack2 overflow");
		}
		
	}
	
	public static int pop1(){
		if(top1!=-1){
			return arr[top1--];
		}
		else{
			System.out.println("underflow");
			return -1;
		}
	}
	
	public static int pop2(){
		if(top2!=arr.length){
			return arr[top2++];
		}
		else{
			System.out.println("underflow");
			return -1;
		}
	}
	
	public static void print(){
		for(int x:arr){
			System.out.print(x+" ");
		}
	}
	
	public static void main(String args[]){
		push1(1); push1(2); push1(3); push1(4); push1(5); push1(6);
		push2(7); push2(8); push2(9); push2(10); 
		print();
		push1(19);
		push2(20);
		print();
		
	}

}
